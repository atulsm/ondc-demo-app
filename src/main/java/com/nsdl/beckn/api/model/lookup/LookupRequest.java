// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.lookup;

public class LookupRequest
{
    private String subscriberId;
    private String country;
    private String city;
    private String domain;
    private String type;
    
    public String getSubscriberId() {
        return this.subscriberId;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getDomain() {
        return this.domain;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setSubscriberId(final String subscriberId) {
        this.subscriberId = subscriberId;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public void setDomain(final String domain) {
        this.domain = domain;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LookupRequest)) {
            return false;
        }
        final LookupRequest other = (LookupRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$subscriberId = this.getSubscriberId();
        final Object other$subscriberId = other.getSubscriberId();
        Label_0065: {
            if (this$subscriberId == null) {
                if (other$subscriberId == null) {
                    break Label_0065;
                }
            }
            else if (this$subscriberId.equals(other$subscriberId)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        Label_0102: {
            if (this$country == null) {
                if (other$country == null) {
                    break Label_0102;
                }
            }
            else if (this$country.equals(other$country)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        Label_0139: {
            if (this$city == null) {
                if (other$city == null) {
                    break Label_0139;
                }
            }
            else if (this$city.equals(other$city)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$domain = this.getDomain();
        final Object other$domain = other.getDomain();
        Label_0176: {
            if (this$domain == null) {
                if (other$domain == null) {
                    break Label_0176;
                }
            }
            else if (this$domain.equals(other$domain)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null) {
            if (other$type == null) {
                return true;
            }
        }
        else if (this$type.equals(other$type)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof LookupRequest;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $subscriberId = this.getSubscriberId();
        result = result * 59 + (($subscriberId == null) ? 43 : $subscriberId.hashCode());
        final Object $country = this.getCountry();
        result = result * 59 + (($country == null) ? 43 : $country.hashCode());
        final Object $city = this.getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        final Object $domain = this.getDomain();
        result = result * 59 + (($domain == null) ? 43 : $domain.hashCode());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "LookupRequest(subscriberId=" + this.getSubscriberId() + ", country=" + this.getCountry() + ", city=" + this.getCity() + ", domain=" + this.getDomain() + ", type=" + this.getType() + ")";
    }
    
    public LookupRequest(final String subscriberId, final String country, final String city, final String domain, final String type) {
        this.subscriberId = subscriberId;
        this.country = country;
        this.city = city;
        this.domain = domain;
        this.type = type;
    }
    
    public LookupRequest() {
    }
}
