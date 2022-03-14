// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class AddOn
{
    private String id;
    private Descriptor descriptor;
    private Price price;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public Price getPrice() {
        return this.price;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setPrice(final Price price) {
        this.price = price;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AddOn)) {
            return false;
        }
        final AddOn other = (AddOn)o;
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
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null) {
            if (other$price == null) {
                return true;
            }
        }
        else if (this$price.equals(other$price)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof AddOn;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $price = this.getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "AddOn(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", price=" + this.getPrice() + ")";
    }
}
