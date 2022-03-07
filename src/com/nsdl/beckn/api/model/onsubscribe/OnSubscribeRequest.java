// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.onsubscribe;

public class OnSubscribeRequest
{
    private String subscriberId;
    private String challenge;
    
    public String getSubscriberId() {
        return this.subscriberId;
    }
    
    public String getChallenge() {
        return this.challenge;
    }
    
    public void setSubscriberId(final String subscriberId) {
        this.subscriberId = subscriberId;
    }
    
    public void setChallenge(final String challenge) {
        this.challenge = challenge;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnSubscribeRequest)) {
            return false;
        }
        final OnSubscribeRequest other = (OnSubscribeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$subscriberId = this.getSubscriberId();
        final Object other$subscriberId = other.getSubscriberId();
        Label_0065: {
            if (this$subscriberId == null) {
                if (other$subscriberId == null) {
                    break Label_0065;
                }
            }
            else if (this$subscriberId.equals(other$subscriberId)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$challenge = this.getChallenge();
        final Object other$challenge = other.getChallenge();
        if (this$challenge == null) {
            if (other$challenge == null) {
                return true;
            }
        }
        else if (this$challenge.equals(other$challenge)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnSubscribeRequest;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $subscriberId = this.getSubscriberId();
        result = result * 59 + (($subscriberId == null) ? 43 : $subscriberId.hashCode());
        final Object $challenge = this.getChallenge();
        result = result * 59 + (($challenge == null) ? 43 : $challenge.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnSubscribeRequest(subscriberId=" + this.getSubscriberId() + ", challenge=" + this.getChallenge() + ")";
    }
}
