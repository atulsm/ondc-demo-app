// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Contact
{
    private String phone;
    private String email;
    private Tags tags;
    
    public String getPhone() {
        return this.phone;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setPhone(final String phone) {
        this.phone = phone;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }
        final Contact other = (Contact)o;
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
        final Object this$tags = this.getTags();
        final Object other$tags = other.getTags();
        if (this$tags == null) {
            if (other$tags == null) {
                return true;
            }
        }
        else if (this$tags.equals(other$tags)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Contact;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $phone = this.getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Contact(phone=" + this.getPhone() + ", email=" + this.getEmail() + ", tags=" + this.getTags() + ")";
    }
}
