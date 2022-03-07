// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.status;

public class StatusMessage
{
    private String orderId;
    
    public String getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StatusMessage)) {
            return false;
        }
        final StatusMessage other = (StatusMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null) {
            if (other$orderId == null) {
                return true;
            }
        }
        else if (this$orderId.equals(other$orderId)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof StatusMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "StatusMessage(orderId=" + this.getOrderId() + ")";
    }
}
