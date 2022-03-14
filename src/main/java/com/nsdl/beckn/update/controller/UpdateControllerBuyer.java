// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.update.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.update.extension.Schema;
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
import com.nsdl.beckn.update.service.UpdateServiceBuyer;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateControllerBuyer
{
    private static final Logger log;
    @Autowired
    private UpdateServiceBuyer service;
    @Autowired
    private JsonUtil jsonUtil;
    @Value("${beckn.entity.type}")
    private String entityType;
    
    @PostMapping({ "/buyer/adaptor/update" })
    public ResponseEntity<String> update(@RequestBody final String body, @RequestHeader final HttpHeaders httpHeaders, final HttpServletRequest servletRequest) throws JsonProcessingException {
        UpdateControllerBuyer.log.info("The body in {} adaptor is {}", (Object)"update", (Object)this.jsonUtil.unpretty(body));
        UpdateControllerBuyer.log.info("Entity type is {}", (Object)this.entityType);
        if (!OndcUserType.BUYER.type().equalsIgnoreCase(this.entityType)) {
            throw new ApplicationException(ErrorCode.INVALID_ENTITY_TYPE);
        }
        final Schema request = (Schema)this.jsonUtil.toModel(body, (Class)Schema.class);
        return (ResponseEntity<String>)this.service.update(request);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)UpdateControllerBuyer.class);
    }
}
