// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Feedback
{
    private String id;
    private String descriptor;
    private String parentId;
    
    public String getId() {
        return this.id;
    }
    
    public String getDescriptor() {
        return this.descriptor;
    }
    
    public String getParentId() {
        return this.parentId;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final String descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Feedback)) {
            return false;
        }
        final Feedback other = (Feedback)o;
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
        final Object this$parentId = this.getParentId();
        final Object other$parentId = other.getParentId();
        if (this$parentId == null) {
            if (other$parentId == null) {
                return true;
            }
        }
        else if (this$parentId.equals(other$parentId)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Feedback;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $parentId = this.getParentId();
        result = result * 59 + (($parentId == null) ? 43 : $parentId.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Feedback(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", parentId=" + this.getParentId() + ")";
    }
}
