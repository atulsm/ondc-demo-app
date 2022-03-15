// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.subscribe.service;

import org.slf4j.LoggerFactory;
import com.nsdl.beckn.common.model.ConfigModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.api.model.common.Context;
import com.nsdl.beckn.api.model.onsubscribe.OnSubscribeRequest;
import com.nsdl.beckn.api.model.onsubscribe.OnSubscribeResponse;

import java.util.concurrent.CompletableFuture;
import com.nsdl.beckn.api.model.common.Ack;
import com.nsdl.beckn.api.enums.AckStatus;
import com.nsdl.beckn.api.model.response.ResponseMessage;
import com.nsdl.beckn.api.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.nsdl.beckn.search.extension.Schema;
import org.springframework.http.HttpHeaders;
import com.nsdl.beckn.common.util.JsonUtil;
import com.nsdl.beckn.common.validator.BodyValidator;
import com.nsdl.beckn.common.service.ApplicationConfigService;
import com.nsdl.beckn.common.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class OnSubscribeService
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
    
    public ResponseEntity<OnSubscribeResponse> onsubscribe(final HttpHeaders httpHeaders, final OnSubscribeRequest request) throws JsonProcessingException {
        final OnSubscribeResponse adaptorResponse = new OnSubscribeResponse();
        adaptorResponse.setAnswer("decrypted_challange_string");

        return (ResponseEntity<OnSubscribeResponse>)new ResponseEntity((Object)this.mapper.writeValueAsString((Object)adaptorResponse), HttpStatus.OK);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)OnSubscribeService.class);
    }
}
