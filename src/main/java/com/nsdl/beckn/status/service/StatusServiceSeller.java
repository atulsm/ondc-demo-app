// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.status.service;

import org.slf4j.LoggerFactory;
import com.nsdl.beckn.common.model.ConfigModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.api.model.common.Context;
import com.nsdl.beckn.api.model.onstatus.OnStatusMessage;
import com.nsdl.beckn.api.model.onstatus.OnStatusRequest;

import java.util.concurrent.CompletableFuture;
import com.nsdl.beckn.api.model.common.Ack;
import com.nsdl.beckn.api.enums.AckStatus;
import com.nsdl.beckn.api.model.response.ResponseMessage;
import com.nsdl.beckn.api.model.response.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nsdl.beckn.status.extension.Schema;


import org.springframework.http.HttpHeaders;
import com.nsdl.beckn.common.util.JsonUtil;
import com.nsdl.beckn.common.validator.BodyValidator;
import com.nsdl.beckn.common.service.ApplicationConfigService;
import com.nsdl.beckn.common.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;




@Service
public class StatusServiceSeller
{
    private static final Logger log;
    @Autowired
    private ObjectMapper mapper;
    @Autowired
    private Sender sendRequest;
    @Autowired
    private ApplicationConfigService configService;
    @Autowired
    private BodyValidator bodyValidator;
    @Autowired
    private JsonUtil jsonUtil;

    @Autowired
    @Value("classpath:dummyResponses/onStatus.json")
    private Resource resource;
    
    public ResponseEntity<String> status(final HttpHeaders httpHeaders, final Schema request) throws JsonProcessingException {
        StatusServiceSeller.log.info("Going to validate json request before sending to buyer...");
        final Response errorResponse = this.bodyValidator.validateRequestBody(request.getContext(), "status");
        if (errorResponse != null) {
            return (ResponseEntity<String>)new ResponseEntity((Object)this.mapper.writeValueAsString((Object)errorResponse), HttpStatus.BAD_REQUEST);
        }
        final Response adaptorResponse = new Response();
        final ResponseMessage resMsg = new ResponseMessage();
        resMsg.setAck(new Ack(AckStatus.ACK));
        adaptorResponse.setMessage(resMsg);
        final Context ctx = request.getContext();
        adaptorResponse.setContext(ctx);

        //CompletableFuture.runAsync(this::lambda$status$0);
        CompletableFuture.runAsync(() -> {
            this.sendRequestToSellerInternalApi(httpHeaders, request);
        });

        return (ResponseEntity<String>)new ResponseEntity((Object)this.mapper.writeValueAsString((Object)adaptorResponse), HttpStatus.OK);
    }
    
    private void sendRequestToSellerInternalApi(final HttpHeaders httpHeaders, final Schema request) {
        StatusServiceSeller.log.info("sending request to seller internal api [in seperate thread]");
        try {
            final ConfigModel configModel = this.configService.loadApplicationConfiguration(request.getContext().getBppId(), "status");
            final String url = configModel.getMatchedApi().getHttpEntityEndpoint();
            final String json = this.jsonUtil.toJson((Object)request);
            this.sendRequest.send(url, httpHeaders, json, configModel.getMatchedApi());

            if(!"true".equals(configModel.getDisableAdaptorCalls())){
                String resp = this.sendRequest.send(url, httpHeaders, json, configModel.getMatchedApi());
                StatusServiceSeller.log.info("Response from ekart adaptor: " + resp);
            }

            //creating a dummy response
            OnStatusMessage onStatus = this.mapper.readValue(this.resource.getInputStream(), OnStatusMessage.class);
            StatusServiceSeller.log.info(onStatus.toString());

            OnStatusRequest respBody = new OnStatusRequest();
            respBody.setContext(request.getContext());
            respBody.getContext().setAction("on_status");
            respBody.getContext().setBppId(configModel.getSubscriberId());
            respBody.getContext().setBppUri(configModel.getSubscriberUrl());

            respBody.setMessage(onStatus);
            String respJson = this.jsonUtil.toJson((Object)respBody);

            String host = httpHeaders.get("remoteHost").get(0);
            if("0:0:0:0:0:0:0:1".equals(host)) {
                host="localhost";
            }

            String onStatusresp = this.sendRequest.send(respBody.getContext().getBapUri() +"on_status",
                    httpHeaders, respJson, configModel.getMatchedApi());
            StatusServiceSeller.log.info(onStatusresp);
        }
        catch (Exception e) {
            StatusServiceSeller.log.error("error while sending post request to seller internal api" + e);
            e.printStackTrace();
        }
    }
    
    static {
        log = LoggerFactory.getLogger((Class)StatusServiceSeller.class);
    }
}
