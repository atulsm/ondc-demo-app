// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.search.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.nsdl.beckn.common.model.ConfigModel;
import org.springframework.http.HttpStatus;
import com.nsdl.beckn.common.model.ApiParamModel;
import com.nsdl.beckn.search.extension.OnSchema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestBody;
import com.nsdl.beckn.common.builder.HeaderBuilder;
import com.nsdl.beckn.common.service.ApplicationConfigService;
import com.nsdl.beckn.common.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import com.nsdl.beckn.common.util.JsonUtil;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnSearchControllerSeller
{
    private static final Logger log;
    @Autowired
    private JsonUtil jsonUtil;
    @Autowired
    private Sender sender;
    @Autowired
    private ApplicationConfigService configService;
    @Autowired
    private HeaderBuilder authHeaderBuilder;
    
    @PostMapping({ "/seller/adaptor/on_search" })
    public ResponseEntity<String> onSearch(@RequestBody final String body, @RequestHeader final HttpHeaders httpHeaders) throws JsonProcessingException {
        OnSearchControllerSeller.log.info("The body in {} adaptor is {}", (Object)"search", (Object)this.jsonUtil.unpretty(body));
        try {
            final OnSchema model = (OnSchema)this.jsonUtil.toModel(body, (Class)OnSchema.class);
            final String bppId = model.getContext().getBppId();
            final String bapUrl = model.getContext().getBapUri();
            final ConfigModel appConfigModel = this.configService.loadApplicationConfiguration(bppId, "search");
            final HttpHeaders headers = this.authHeaderBuilder.buildHeaders(body, appConfigModel);
            OnSearchControllerSeller.log.info("response in seller controller[which is will now send back to buyer adaptor] is {}", (Object)model.toString());
            this.sender.send(bapUrl, headers, body, (ApiParamModel)null);
        }
        catch (Exception e) {
            OnSearchControllerSeller.log.error("Error while sending request back to buyer adaptor:", (Throwable)e);
            return (ResponseEntity<String>)new ResponseEntity((Object)"Error while sending request back to buyer adaptor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return (ResponseEntity<String>)new ResponseEntity((Object)"Response received. All Ok", HttpStatus.OK);
    }
    
    static {
        log = LoggerFactory.getLogger((Class)OnSearchControllerSeller.class);
    }
}
