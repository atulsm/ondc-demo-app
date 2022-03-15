// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.subscribe.controller;

import org.slf4j.LoggerFactory;
import java.time.LocalDateTime;
import com.nsdl.beckn.common.model.AuditDataModel;
import com.nsdl.beckn.common.model.AuditFlagModel;
import com.nsdl.beckn.common.model.HttpModel;
import com.nsdl.beckn.common.model.AuditModel;
import org.springframework.web.bind.annotation.PostMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.common.model.ConfigModel;
import com.nsdl.beckn.api.model.common.Context;
import com.nsdl.beckn.api.model.lookup.LookupRequest;
import com.nsdl.beckn.api.model.onsubscribe.OnSubscribeRequest;
import com.nsdl.beckn.api.model.onsubscribe.OnSubscribeResponse;
import com.nsdl.beckn.common.enums.BecknUserType;
import com.nsdl.beckn.search.extension.Schema;
import com.nsdl.beckn.common.exception.ApplicationException;
import com.nsdl.beckn.common.exception.ErrorCode;
import com.nsdl.beckn.common.enums.OndcUserType;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;
import com.nsdl.beckn.common.service.AuditService;
import com.nsdl.beckn.common.service.ApplicationConfigService;
import com.nsdl.beckn.common.util.JsonUtil;
import com.nsdl.beckn.common.validator.HeaderValidator;
import org.springframework.beans.factory.annotation.Autowired;
import com.nsdl.beckn.search.service.SearchServiceSeller;
import com.nsdl.beckn.subscribe.service.OnSubscribeService;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnSubscribeController
{
    private static final Logger log;
    @Autowired
    private OnSubscribeService service;
    @Autowired
    private HeaderValidator validator;
    @Autowired
    private JsonUtil jsonUtil;
    @Autowired
    private ApplicationConfigService configService;
    @Autowired
    private AuditService auditService;
    
    @PostMapping({ "/on_subscribe" })
    public ResponseEntity<OnSubscribeResponse> onsubscribe(@RequestBody final String body, @RequestHeader final HttpHeaders httpHeaders, final HttpServletRequest servletRequest) throws JsonProcessingException {
        OnSubscribeController.log.info("The body in {} adaptor is {}", (Object)"search", (Object)this.jsonUtil.unpretty(body));

        final OnSubscribeRequest model = (OnSubscribeRequest)this.jsonUtil.toModel(body, (Class)OnSubscribeRequest.class);
        return (ResponseEntity<OnSubscribeResponse>)this.service.onsubscribe(httpHeaders, model);
    }
    
    private AuditModel buildAuditModel(final HttpHeaders httpHeaders, final String body, final Schema model) {
        final AuditModel auditModel = new AuditModel();
        final HttpModel httpModel = new HttpModel();
        httpModel.setRequestHeaders(httpHeaders);
        httpModel.setRequestBody(body);
        final AuditFlagModel flagModel = new AuditFlagModel();
        flagModel.setHttp(false);
        flagModel.setFile(true);
        flagModel.setDatabase(true);
        auditModel.setApiName("search");
        auditModel.setSubscriberId(model.getContext().getBppId());
        auditModel.setAuditFlags(flagModel);
        auditModel.setDataModel(this.buildAuditDataModel(body, model));
        auditModel.setHttpModel(httpModel);
        return auditModel;
    }
    
    private AuditDataModel buildAuditDataModel(final String body, final Schema request) {
        final AuditDataModel model = new AuditDataModel();
        model.setAction(request.getContext().getAction());
        model.setCoreVersion(request.getContext().getCoreVersion());
        model.setDomain(request.getContext().getDomain());
        model.setTransactionId(request.getContext().getTransactionId());
        model.setMessageId(request.getContext().getMessageId());
        model.setCreatedOn(LocalDateTime.now());
        model.setJson(body);
        model.setStatus("N");
        return model;
    }
    
    static {
        log = LoggerFactory.getLogger((Class)OnSubscribeController.class);
    }
}
