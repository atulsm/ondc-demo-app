// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Organization
{
    private String name;
    private String cred;
    
    public String getName() {
        return this.name;
    }
    
    public String getCred() {
        return this.cred;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setCred(final String cred) {
        this.cred = cred;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Organization)) {
            return false;
        }
        final Organization other = (Organization)o;
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
        final Object this$cred = this.getCred();
        final Object other$cred = other.getCred();
        if (this$cred == null) {
            if (other$cred == null) {
                return true;
            }
        }
        else if (this$cred.equals(other$cred)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Organization;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $cred = this.getCred();
        result = result * 59 + (($cred == null) ? 43 : $cred.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Organization(name=" + this.getName() + ", cred=" + this.getCred() + ")";
    }
}
