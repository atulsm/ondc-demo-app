// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.nsdl.beckn.api.enums.AckStatus;

public class Ack
{
    private AckStatus status;
    
    public AckStatus getStatus() {
        return this.status;
    }
    
    public void setStatus(final AckStatus status) {
        this.status = status;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Ack)) {
            return false;
        }
        final Ack other = (Ack)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null) {
            if (other$status == null) {
                return true;
            }
        }
        else if (this$status.equals(other$status)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Ack;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $status = this.getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Ack(status=" + this.getStatus() + ")";
    }
    
    public Ack() {
    }
    
    public Ack(final AckStatus status) {
        this.status = status;
    }
}
