// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.enums;

import java.util.HashMap;
import java.util.Map;

public enum ErrorType
{
    CONTEXT_ERROR("CONTEXT-ERROR"), 
    CORE_ERROR("CORE-ERROR"), 
    DOMAIN_ERROR("DOMAIN-ERROR"), 
    POLICY_ERROR("POLICY-ERROR"), 
    JSON_SCHEMA_ERROR("JSON-SCHEMA-ERROR");
    
    private final String value;
    private static final Map<String, ErrorType> CONSTANTS;
    
    private ErrorType(final String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return this.value;
    }
    
    public String value() {
        return this.value;
    }
    
    public static ErrorType fromValue(final String value) {
        final ErrorType type = ErrorType.CONSTANTS.get(value);
        if (type == null) {
            throw new IllegalArgumentException(value);
        }
        return type;
    }
    
    private static /* synthetic */ ErrorType[] $values() {
        return new ErrorType[] { ErrorType.CONTEXT_ERROR, ErrorType.CORE_ERROR, ErrorType.DOMAIN_ERROR, ErrorType.POLICY_ERROR, ErrorType.JSON_SCHEMA_ERROR };
    }
    
    static {
        CONSTANTS = new HashMap<String, ErrorType>();
        for (final ErrorType c : values()) {
            ErrorType.CONSTANTS.put(c.value, c);
        }
    }
}
