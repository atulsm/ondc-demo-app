// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.track.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.track.extension.Schema;
import com.nsdl.beckn.common.exception.ApplicationException;
import com.nsdl.beckn.common.exception.ErrorCode;
import com.nsdl.beckn.common.enums.OndcUserType;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import com.nsdl.beckn.common.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.nsdl.beckn.track.service.TrackServiceBuyer;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackControllerBuyer
{
    private static final Logger log;
    @Autowired
    private TrackServiceBuyer service;
    @Autowired
    private JsonUtil jsonUtil;
    @Value("${beckn.entity.type}")
    private String entityType;
    
    @PostMapping({ "/buyer/adaptor/track" })
    public ResponseEntity<String> track(@RequestBody final String body, @RequestHeader final HttpHeaders httpHeaders, final HttpServletRequest servletRequest) throws JsonProcessingException {
        TrackControllerBuyer.log.info("The body in {} adaptor is {}", (Object)"track", (Object)this.jsonUtil.unpretty(body));
        TrackControllerBuyer.log.info("Entity type is {}", (Object)this.entityType);
        if (!OndcUserType.BUYER.type().equalsIgnoreCase(this.entityType)) {
            throw new ApplicationException(ErrorCode.INVALID_ENTITY_TYPE);
        }
        final Schema request = (Schema)this.jsonUtil.toModel(body, (Class)Schema.class);
        return (ResponseEntity<String>)this.service.track(request);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)TrackControllerBuyer.class);
    }
}
