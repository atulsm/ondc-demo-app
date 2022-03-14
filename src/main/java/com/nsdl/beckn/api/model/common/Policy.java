// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Policy
{
    private String id;
    private Descriptor descriptor;
    private String parentPolicyId;
    private Time time;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public String getParentPolicyId() {
        return this.parentPolicyId;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setParentPolicyId(final String parentPolicyId) {
        this.parentPolicyId = parentPolicyId;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Policy)) {
            return false;
        }
        final Policy other = (Policy)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        Label_0102: {
            if (this$descriptor == null) {
                if (other$descriptor == null) {
                    break Label_0102;
                }
            }
            else if (this$descriptor.equals(other$descriptor)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$parentPolicyId = this.getParentPolicyId();
        final Object other$parentPolicyId = other.getParentPolicyId();
        Label_0139: {
            if (this$parentPolicyId == null) {
                if (other$parentPolicyId == null) {
                    break Label_0139;
                }
            }
            else if (this$parentPolicyId.equals(other$parentPolicyId)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null) {
            if (other$time == null) {
                return true;
            }
        }
        else if (this$time.equals(other$time)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Policy;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $parentPolicyId = this.getParentPolicyId();
        result = result * 59 + (($parentPolicyId == null) ? 43 : $parentPolicyId.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Policy(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", parentPolicyId=" + this.getParentPolicyId() + ", time=" + this.getTime() + ")";
    }
}
