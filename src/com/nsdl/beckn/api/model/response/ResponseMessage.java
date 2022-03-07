// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.response;

import com.nsdl.beckn.api.model.common.Ack;

public class ResponseMessage
{
    private Ack ack;
    
    public Ack getAck() {
        return this.ack;
    }
    
    public void setAck(final Ack ack) {
        this.ack = ack;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ResponseMessage)) {
            return false;
        }
        final ResponseMessage other = (ResponseMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$ack = this.getAck();
        final Object other$ack = other.getAck();
        if (this$ack == null) {
            if (other$ack == null) {
                return true;
            }
        }
        else if (this$ack.equals(other$ack)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ResponseMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ack = this.getAck();
        result = result * 59 + (($ack == null) ? 43 : $ack.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "ResponseMessage(ack=" + this.getAck() + ")";
    }
}
