// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Billing
{
    private String name;
    private Organization organization;
    private Address address;
    private String email;
    private String phone;
    private Time time;
    private String taxNumber;
    private String createdAt;
    private String updatedAt;
    
    public String getName() {
        return this.name;
    }
    
    public Organization getOrganization() {
        return this.organization;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public String getTaxNumber() {
        return this.taxNumber;
    }
    
    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setOrganization(final Organization organization) {
        this.organization = organization;
    }
    
    public void setAddress(final Address address) {
        this.address = address;
    }
    
    public void setEmail(final String email) {
        this.email = email;
    }
    
    public void setPhone(final String phone) {
        this.phone = phone;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    public void setTaxNumber(final String taxNumber) {
        this.taxNumber = taxNumber;
    }
    
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }
    
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Billing)) {
            return false;
        }
        final Billing other = (Billing)o;
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
        final Object this$organization = this.getOrganization();
        final Object other$organization = other.getOrganization();
        Label_0102: {
            if (this$organization == null) {
                if (other$organization == null) {
                    break Label_0102;
                }
            }
            else if (this$organization.equals(other$organization)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        Label_0139: {
            if (this$address == null) {
                if (other$address == null) {
                    break Label_0139;
                }
            }
            else if (this$address.equals(other$address)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        Label_0176: {
            if (this$email == null) {
                if (other$email == null) {
                    break Label_0176;
                }
            }
            else if (this$email.equals(other$email)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        Label_0213: {
            if (this$phone == null) {
                if (other$phone == null) {
                    break Label_0213;
                }
            }
            else if (this$phone.equals(other$phone)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        Label_0250: {
            if (this$time == null) {
                if (other$time == null) {
                    break Label_0250;
                }
            }
            else if (this$time.equals(other$time)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$taxNumber = this.getTaxNumber();
        final Object other$taxNumber = other.getTaxNumber();
        Label_0287: {
            if (this$taxNumber == null) {
                if (other$taxNumber == null) {
                    break Label_0287;
                }
            }
            else if (this$taxNumber.equals(other$taxNumber)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        Label_0324: {
            if (this$createdAt == null) {
                if (other$createdAt == null) {
                    break Label_0324;
                }
            }
            else if (this$createdAt.equals(other$createdAt)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$updatedAt = this.getUpdatedAt();
        final Object other$updatedAt = other.getUpdatedAt();
        if (this$updatedAt == null) {
            if (other$updatedAt == null) {
                return true;
            }
        }
        else if (this$updatedAt.equals(other$updatedAt)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Billing;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $organization = this.getOrganization();
        result = result * 59 + (($organization == null) ? 43 : $organization.hashCode());
        final Object $address = this.getAddress();
        result = result * 59 + (($address == null) ? 43 : $address.hashCode());
        final Object $email = this.getEmail();
        result = result * 59 + (($email == null) ? 43 : $email.hashCode());
        final Object $phone = this.getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        final Object $taxNumber = this.getTaxNumber();
        result = result * 59 + (($taxNumber == null) ? 43 : $taxNumber.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * 59 + (($createdAt == null) ? 43 : $createdAt.hashCode());
        final Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + (($updatedAt == null) ? 43 : $updatedAt.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Billing(name=" + this.getName() + ", organization=" + this.getOrganization() + ", address=" + this.getAddress() + ", email=" + this.getEmail() + ", phone=" + this.getPhone() + ", time=" + this.getTime() + ", taxNumber=" + this.getTaxNumber() + ", createdAt=" + this.getCreatedAt() + ", updatedAt=" + this.getUpdatedAt() + ")";
    }
}
