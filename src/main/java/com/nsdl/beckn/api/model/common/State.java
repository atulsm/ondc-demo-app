// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class State
{
    private Descriptor descriptor;
    private String updatedAt;
    private String updatedBy;
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public String getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public void setUpdatedBy(final String updatedBy) {
        this.updatedBy = updatedBy;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof State)) {
            return false;
        }
        final State other = (State)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        Label_0065: {
            if (this$descriptor == null) {
                if (other$descriptor == null) {
                    break Label_0065;
                }
            }
            else if (this$descriptor.equals(other$descriptor)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$updatedAt = this.getUpdatedAt();
        final Object other$updatedAt = other.getUpdatedAt();
        Label_0102: {
            if (this$updatedAt == null) {
                if (other$updatedAt == null) {
                    break Label_0102;
                }
            }
            else if (this$updatedAt.equals(other$updatedAt)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$updatedBy = this.getUpdatedBy();
        final Object other$updatedBy = other.getUpdatedBy();
        if (this$updatedBy == null) {
            if (other$updatedBy == null) {
                return true;
            }
        }
        else if (this$updatedBy.equals(other$updatedBy)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof State;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + (($updatedAt == null) ? 43 : $updatedAt.hashCode());
        final Object $updatedBy = this.getUpdatedBy();
        result = result * 59 + (($updatedBy == null) ? 43 : $updatedBy.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "State(descriptor=" + this.getDescriptor() + ", updatedAt=" + this.getUpdatedAt() + ", updatedBy=" + this.getUpdatedBy() + ")";
    }
}
