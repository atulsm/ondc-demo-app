// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Option
{
    private String id;
    private Descriptor descriptor;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Option)) {
            return false;
        }
        final Option other = (Option)o;
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
        if (this$descriptor == null) {
            if (other$descriptor == null) {
                return true;
            }
        }
        else if (this$descriptor.equals(other$descriptor)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Option;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Option(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ")";
    }
}
