// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.support;

public class SupportMessage
{
    private String refId;
    
    public String getRefId() {
        return this.refId;
    }
    
    public void setRefId(final String refId) {
        this.refId = refId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SupportMessage)) {
            return false;
        }
        final SupportMessage other = (SupportMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$refId = this.getRefId();
        final Object other$refId = other.getRefId();
        if (this$refId == null) {
            if (other$refId == null) {
                return true;
            }
        }
        else if (this$refId.equals(other$refId)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof SupportMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $refId = this.getRefId();
        result = result * 59 + (($refId == null) ? 43 : $refId.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "SupportMessage(refId=" + this.getRefId() + ")";
    }
}
