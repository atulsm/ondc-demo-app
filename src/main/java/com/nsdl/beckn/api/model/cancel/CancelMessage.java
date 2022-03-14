// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.cancel;

import com.nsdl.beckn.api.model.common.Descriptor;

public class CancelMessage
{
    private String orderId;
    private String cancellationReasonId;
    private Descriptor descriptor;
    
    public String getOrderId() {
        return this.orderId;
    }
    
    public String getCancellationReasonId() {
        return this.cancellationReasonId;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public void setOrderId(final String orderId) {
        this.orderId = orderId;
    }
    
    public void setCancellationReasonId(final String cancellationReasonId) {
        this.cancellationReasonId = cancellationReasonId;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CancelMessage)) {
            return false;
        }
        final CancelMessage other = (CancelMessage)o;
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
        final Object this$cancellationReasonId = this.getCancellationReasonId();
        final Object other$cancellationReasonId = other.getCancellationReasonId();
        Label_0102: {
            if (this$cancellationReasonId == null) {
                if (other$cancellationReasonId == null) {
                    break Label_0102;
                }
            }
            else if (this$cancellationReasonId.equals(other$cancellationReasonId)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        if (this$descriptor == null) {
            if (other$descriptor == null) {
                return true;
            }
        }
        else if (this$descriptor.equals(other$descriptor)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof CancelMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * 59 + (($orderId == null) ? 43 : $orderId.hashCode());
        final Object $cancellationReasonId = this.getCancellationReasonId();
        result = result * 59 + (($cancellationReasonId == null) ? 43 : $cancellationReasonId.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "CancelMessage(orderId=" + this.getOrderId() + ", cancellationReasonId=" + this.getCancellationReasonId() + ", descriptor=" + this.getDescriptor() + ")";
    }
}
