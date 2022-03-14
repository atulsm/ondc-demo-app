// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.enums;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Map;

public enum ContextAction
{
    SEARCH("search"), 
    SELECT("select"), 
    INIT("init"), 
    CONFIRM("confirm"), 
    UPDATE("update"), 
    STATUS("status"), 
    TRACK("track"), 
    CANCEL("cancel"), 
    RATING("rating"), 
    FEEDBACK("feedback"), 
    SUPPORT("support"), 
    ON_SEARCH("on_search"), 
    ON_SELECT("on_select"), 
    ON_INIT("on_init"), 
    ON_CONFIRM("on_confirm"), 
    ON_UPDATE("on_update"), 
    ON_STATUS("on_status"), 
    ON_TRACK("on_track"), 
    ON_CANCEL("on_cancel"), 
    ON_FEEDBACK("on_feedback"), 
    ON_RATING("on_rating"), 
    ON_SUPPORT("on_support"), 
    ACK("ack");
    
    private final String value;
    private static final Map<String, ContextAction> CONSTANTS;
    
    private ContextAction(final String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return this.value;
    }
    
    @JsonValue
    public String value() {
        return this.value;
    }
    
    @JsonCreator
    public static ContextAction fromValue(final String value) {
        final ContextAction action = ContextAction.CONSTANTS.get(value);
        if (action == null) {
            throw new IllegalArgumentException(value);
        }
        return action;
    }
    
    private static /* synthetic */ ContextAction[] $values() {
        return new ContextAction[] { ContextAction.SEARCH, ContextAction.SELECT, ContextAction.INIT, ContextAction.CONFIRM, ContextAction.UPDATE, ContextAction.STATUS, ContextAction.TRACK, ContextAction.CANCEL, ContextAction.RATING, ContextAction.FEEDBACK, ContextAction.SUPPORT, ContextAction.ON_SEARCH, ContextAction.ON_SELECT, ContextAction.ON_INIT, ContextAction.ON_CONFIRM, ContextAction.ON_UPDATE, ContextAction.ON_STATUS, ContextAction.ON_TRACK, ContextAction.ON_CANCEL, ContextAction.ON_FEEDBACK, ContextAction.ON_RATING, ContextAction.ON_SUPPORT, ContextAction.ACK };
    }
    
    static {
        CONSTANTS = new HashMap<String, ContextAction>();
        for (final ContextAction c : values()) {
            ContextAction.CONSTANTS.put(c.value, c);
        }
    }
}
