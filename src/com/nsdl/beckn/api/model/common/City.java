// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class City
{
    private String name;
    private String code;
    
    public String getName() {
        return this.name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof City)) {
            return false;
        }
        final City other = (City)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0065: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0065;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null) {
            if (other$code == null) {
                return true;
            }
        }
        else if (this$code.equals(other$code)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof City;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "City(name=" + this.getName() + ", code=" + this.getCode() + ")";
    }
}
