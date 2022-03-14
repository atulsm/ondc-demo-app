// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Dimensions
{
    private String length;
    private String breadth;
    private String height;
    
    public String getLength() {
        return this.length;
    }
    
    public String getBreadth() {
        return this.breadth;
    }
    
    public String getHeight() {
        return this.height;
    }
    
    public void setLength(final String length) {
        this.length = length;
    }
    
    public void setBreadth(final String breadth) {
        this.breadth = breadth;
    }
    
    public void setHeight(final String height) {
        this.height = height;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Dimensions)) {
            return false;
        }
        final Dimensions other = (Dimensions)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$length = this.getLength();
        final Object other$length = other.getLength();
        Label_0065: {
            if (this$length == null) {
                if (other$length == null) {
                    break Label_0065;
                }
            }
            else if (this$length.equals(other$length)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$breadth = this.getBreadth();
        final Object other$breadth = other.getBreadth();
        Label_0102: {
            if (this$breadth == null) {
                if (other$breadth == null) {
                    break Label_0102;
                }
            }
            else if (this$breadth.equals(other$breadth)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$height = this.getHeight();
        final Object other$height = other.getHeight();
        if (this$height == null) {
            if (other$height == null) {
                return true;
            }
        }
        else if (this$height.equals(other$height)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Dimensions;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $length = this.getLength();
        result = result * 59 + (($length == null) ? 43 : $length.hashCode());
        final Object $breadth = this.getBreadth();
        result = result * 59 + (($breadth == null) ? 43 : $breadth.hashCode());
        final Object $height = this.getHeight();
        result = result * 59 + (($height == null) ? 43 : $height.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Dimensions(length=" + this.getLength() + ", breadth=" + this.getBreadth() + ", height=" + this.getHeight() + ")";
    }
}
