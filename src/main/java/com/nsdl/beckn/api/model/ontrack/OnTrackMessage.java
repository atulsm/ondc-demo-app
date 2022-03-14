// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.ontrack;

import com.nsdl.beckn.api.model.common.Tracking;

public class OnTrackMessage
{
    private Tracking tracking;
    
    public Tracking getTracking() {
        return this.tracking;
    }
    
    public void setTracking(final Tracking tracking) {
        this.tracking = tracking;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnTrackMessage)) {
            return false;
        }
        final OnTrackMessage other = (OnTrackMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$tracking = this.getTracking();
        final Object other$tracking = other.getTracking();
        if (this$tracking == null) {
            if (other$tracking == null) {
                return true;
            }
        }
        else if (this$tracking.equals(other$tracking)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnTrackMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tracking = this.getTracking();
        result = result * 59 + (($tracking == null) ? 43 : $tracking.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnTrackMessage(tracking=" + this.getTracking() + ")";
    }
}
