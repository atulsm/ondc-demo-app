// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.onsupport;

public class OnSupportMessage
{
    private String phone;
    private String email;
    private String uri;
    
    public String getPhone() {
        return this.phone;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getUri() {
        return this.uri;
    }
    
    public void setPhone(final String phone) {
        this.phone = phone;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setUri(final String uri) {
        this.uri = uri;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnSupportMessage)) {
            return false;
        }
        final OnSupportMessage other = (OnSupportMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        Label_0065: {
            if (this$phone == null) {
                if (other$phone == null) {
                    break Label_0065;
                }
            }
            else if (this$phone.equals(other$phone)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0102: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0102;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null) {
            if (other$uri == null) {
                return true;
            }
        }
        else if (this$uri.equals(other$uri)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnSupportMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $phone = this.getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $uri = this.getUri();
        result = result * 59 + (($uri == null) ? 43 : $uri.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnSupportMessage(phone=" + this.getPhone() + ", email=" + this.getEmail() + ", uri=" + this.getUri() + ")";
    }
}
