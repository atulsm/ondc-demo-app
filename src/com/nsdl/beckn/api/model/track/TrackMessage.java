// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.track;

public class TrackMessage
{
    private String orderId;
    private String callbackUrl;
    
    public String getOrderId() {
        return this.orderId;
    }
    
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    
    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }
    
    public void setCallbackUrl(final String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TrackMessage)) {
            return false;
        }
        final TrackMessage other = (TrackMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        Label_0065: {
            if (this$orderId == null) {
                if (other$orderId == null) {
                    break Label_0065;
                }
            }
            else if (this$orderId.equals(other$orderId)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$callbackUrl = this.getCallbackUrl();
        final Object other$callbackUrl = other.getCallbackUrl();
        if (this$callbackUrl == null) {
            if (other$callbackUrl == null) {
                return true;
            }
        }
        else if (this$callbackUrl.equals(other$callbackUrl)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof TrackMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        final Object $callbackUrl = this.getCallbackUrl();
        result = result * 59 + (($callbackUrl == null) ? 43 : $callbackUrl.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "TrackMessage(orderId=" + this.getOrderId() + ", callbackUrl=" + this.getCallbackUrl() + ")";
    }
}
