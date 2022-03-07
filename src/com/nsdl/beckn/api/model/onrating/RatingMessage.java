// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.onrating;

public class RatingMessage
{
    private String id;
    private int value;
    
    public String getId() {
        return this.id;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setValue(final int value) {
        this.value = value;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RatingMessage)) {
            return false;
        }
        final RatingMessage other = (RatingMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getValue() != other.getValue()) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null) {
            if (other$id == null) {
                return true;
            }
        }
        else if (this$id.equals(other$id)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof RatingMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getValue();
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "RatingMessage(id=" + this.getId() + ", value=" + this.getValue() + ")";
    }
}
