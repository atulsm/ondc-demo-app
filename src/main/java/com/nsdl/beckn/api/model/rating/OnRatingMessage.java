// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.rating;

import com.nsdl.beckn.api.model.common.Feedback;

public class OnRatingMessage
{
    private Feedback feedback;
    
    public Feedback getFeedback() {
        return this.feedback;
    }
    
    public void setFeedback(final Feedback feedback) {
        this.feedback = feedback;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnRatingMessage)) {
            return false;
        }
        final OnRatingMessage other = (OnRatingMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$feedback = this.getFeedback();
        final Object other$feedback = other.getFeedback();
        if (this$feedback == null) {
            if (other$feedback == null) {
                return true;
            }
        }
        else if (this$feedback.equals(other$feedback)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnRatingMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $feedback = this.getFeedback();
        result = result * 59 + (($feedback == null) ? 43 : $feedback.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnRatingMessage(feedback=" + this.getFeedback() + ")";
    }
}
