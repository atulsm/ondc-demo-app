// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.update;

import com.nsdl.beckn.api.model.common.Order;

public class UpdateMessage
{
    private String updateTarget;
    private Order order;
    
    public String getUpdateTarget() {
        return this.updateTarget;
    }
    
    public Order getOrder() {
        return this.order;
    }
    
    public void setUpdateTarget(final String updateTarget) {
        this.updateTarget = updateTarget;
    }
    
    public void setOrder(final Order order) {
        this.order = order;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UpdateMessage)) {
            return false;
        }
        final UpdateMessage other = (UpdateMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$updateTarget = this.getUpdateTarget();
        final Object other$updateTarget = other.getUpdateTarget();
        Label_0065: {
            if (this$updateTarget == null) {
                if (other$updateTarget == null) {
                    break Label_0065;
                }
            }
            else if (this$updateTarget.equals(other$updateTarget)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$order = this.getOrder();
        final Object other$order = other.getOrder();
        if (this$order == null) {
            if (other$order == null) {
                return true;
            }
        }
        else if (this$order.equals(other$order)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof UpdateMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $updateTarget = this.getUpdateTarget();
        result = result * 59 + (($updateTarget == null) ? 43 : $updateTarget.hashCode());
        final Object $order = this.getOrder();
        result = result * 59 + (($order == null) ? 43 : $order.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "UpdateMessage(updateTarget=" + this.getUpdateTarget() + ", order=" + this.getOrder() + ")";
    }
}
