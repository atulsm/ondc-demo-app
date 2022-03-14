// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.enums;

public enum AckStatus
{
    ACK("ACK"), 
    NACK("NACK");
    
    private final String value;
    
    private AckStatus(final String value) {
        this.value = value;
    }
    
    private static /* synthetic */ AckStatus[] $values() {
        return new AckStatus[] { AckStatus.ACK, AckStatus.NACK };
    }
    
}
