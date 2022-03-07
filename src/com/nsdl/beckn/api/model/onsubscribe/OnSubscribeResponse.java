// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.onsubscribe;

public class OnSubscribeResponse
{
    private String answer;
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(final String answer) {
        this.answer = answer;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnSubscribeResponse)) {
            return false;
        }
        final OnSubscribeResponse other = (OnSubscribeResponse)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$answer = this.getAnswer();
        final Object other$answer = other.getAnswer();
        if (this$answer == null) {
            if (other$answer == null) {
                return true;
            }
        }
        else if (this$answer.equals(other$answer)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnSubscribeResponse;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $answer = this.getAnswer();
        result = result * 59 + (($answer == null) ? 43 : $answer.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnSubscribeResponse(answer=" + this.getAnswer() + ")";
    }
}
