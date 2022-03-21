// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.search.service;

import org.slf4j.LoggerFactory;
import com.nsdl.beckn.common.model.ConfigModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.api.model.common.Context;
import com.nsdl.beckn.api.model.onsearch.OnSearchMessage;

import java.util.concurrent.CompletableFuture;
import com.nsdl.beckn.api.model.common.Ack;
import com.nsdl.beckn.api.model.common.Catalog;
import com.nsdl.beckn.api.enums.AckStatus;
import com.nsdl.beckn.api.model.response.ResponseMessage;
import com.nsdl.beckn.api.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nsdl.beckn.search.extension.Schema;
import com.nsdl.beckn.search.extension.OnSchema;

import org.springframework.http.HttpHeaders;
import com.nsdl.beckn.common.util.JsonUtil;
import com.nsdl.beckn.common.validator.BodyValidator;
import com.nsdl.beckn.common.service.ApplicationConfigService;
import com.nsdl.beckn.common.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceSeller
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
    
    public ResponseEntity<String> search(final HttpHeaders httpHeaders, final Schema request) throws JsonProcessingException {
        SearchServiceSeller.log.info("Going to validate json request before sending to buyer...");
        final Response errorResponse = this.bodyValidator.validateRequestBody(request.getContext(), "search");
        if (errorResponse != null) {
            return (ResponseEntity<String>)new ResponseEntity((Object)this.mapper.writeValueAsString((Object)errorResponse), HttpStatus.BAD_REQUEST);
        }
        final Response adaptorResponse = new Response();
        final ResponseMessage resMsg = new ResponseMessage();
        resMsg.setAck(new Ack(AckStatus.ACK));
        adaptorResponse.setMessage(resMsg);
        final Context ctx = request.getContext();
        adaptorResponse.setContext(ctx);
        CompletableFuture.runAsync(() -> {
            this.sendRequestToSellerInternalApi(httpHeaders, request);
         });
        return (ResponseEntity<String>)new ResponseEntity((Object)this.mapper.writeValueAsString((Object)adaptorResponse), HttpStatus.OK);
    }
    
    private void sendRequestToSellerInternalApi(final HttpHeaders httpHeaders, final Schema request) {
        SearchServiceSeller.log.info("sending request to seller internal api [in seperate thread]");
        try {
            final ConfigModel configModel = this.configService.loadApplicationConfiguration(request.getContext().getBppId(), "search");
            final String url = configModel.getMatchedApi().getHttpEntityEndpoint();
            final String json = this.jsonUtil.toJson((Object)request);
            String resp = this.sendRequest.send(url, httpHeaders, json, configModel.getMatchedApi());
            SearchServiceSeller.log.info("Response from ekart adaptor: " + resp);
            
            //creating a dummy response
            resp = "{\"catalog\": { \"bpp/descriptor\": { \"name\": \"Flipkart Ekart\" }, \"bpp/providers\": [ { \"id\": \"flipkart.logistics.test\", \"descriptor\": { \"name\": \"Flipkart Ekart\" }, \"categories\": [ { \"id\": \"standard-delivery\", \"descriptor\": { \"name\": \"Standard Delivery\" } } ], \"items\": [ { \"id\": \"standard-document-delivery\", \"descriptor\" : { \"name\" : \"Standard Document Delivery\", \"images\" : [ \"https://ekartlogistics.com/assets/images/ekWhiteLogo.png\" ] }, \"category_id\": \"standard-delivery\", \"price\" : { \"currency\": \"INR\", \"value\": \"100\" }, \"matched\": true } ] }]} }";
            OnSearchMessage onSearch = this.jsonUtil.toModel(resp, OnSearchMessage.class);
            SearchServiceSeller.log.info(onSearch.toString());
            
            OnSchema respBody = new OnSchema();
            respBody.setContext(request.getContext());
            respBody.getContext().setAction("on_search");
            respBody.setMessage(onSearch);
            String respJson = this.jsonUtil.toJson((Object)respBody);

            String onSearchresp = this.sendRequest.send(request.getContext().getBapUri()+"on_search", 
            		httpHeaders, respJson, configModel.getMatchedApi());
            SearchServiceSeller.log.info(onSearchresp);

            
        }
        catch (Exception e) {
            SearchServiceSeller.log.error("error while sending post request to seller internal api" + e);
            e.printStackTrace();
        }
    }
    
    static {
        log = LoggerFactory.getLogger((Class)SearchServiceSeller.class);
    }
}
