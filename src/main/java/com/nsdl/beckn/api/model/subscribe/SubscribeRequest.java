// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.subscribe;

public class SubscribeRequest
{
    private String subscriberId;
    private String country;
    private String city;
    private String domain;
    private String signingPublicKey;
    private String encrPublicKey;
    private String validFrom;
    private String validUntil;
    private String nonce;
    
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
    
    public String getSigningPublicKey() {
        return this.signingPublicKey;
    }
    
    public String getEncrPublicKey() {
        return this.encrPublicKey;
    }
    
    public String getValidFrom() {
        return this.validFrom;
    }
    
    public String getValidUntil() {
        return this.validUntil;
    }
    
    public String getNonce() {
        return this.nonce;
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
    
    public void setSigningPublicKey(final String signingPublicKey) {
        this.signingPublicKey = signingPublicKey;
    }
    
    public void setEncrPublicKey(final String encrPublicKey) {
        this.encrPublicKey = encrPublicKey;
    }
    
    public void setValidFrom(final String validFrom) {
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final String validUntil) {
        this.validUntil = validUntil;
    }
    
    public void setNonce(final String nonce) {
        this.nonce = nonce;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SubscribeRequest)) {
            return false;
        }
        final SubscribeRequest other = (SubscribeRequest)o;
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
        final Object this$signingPublicKey = this.getSigningPublicKey();
        final Object other$signingPublicKey = other.getSigningPublicKey();
        Label_0213: {
            if (this$signingPublicKey == null) {
                if (other$signingPublicKey == null) {
                    break Label_0213;
                }
            }
            else if (this$signingPublicKey.equals(other$signingPublicKey)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$encrPublicKey = this.getEncrPublicKey();
        final Object other$encrPublicKey = other.getEncrPublicKey();
        Label_0250: {
            if (this$encrPublicKey == null) {
                if (other$encrPublicKey == null) {
                    break Label_0250;
                }
            }
            else if (this$encrPublicKey.equals(other$encrPublicKey)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$validFrom = this.getValidFrom();
        final Object other$validFrom = other.getValidFrom();
        Label_0287: {
            if (this$validFrom == null) {
                if (other$validFrom == null) {
                    break Label_0287;
                }
            }
            else if (this$validFrom.equals(other$validFrom)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$validUntil = this.getValidUntil();
        final Object other$validUntil = other.getValidUntil();
        Label_0324: {
            if (this$validUntil == null) {
                if (other$validUntil == null) {
                    break Label_0324;
                }
            }
            else if (this$validUntil.equals(other$validUntil)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$nonce = this.getNonce();
        final Object other$nonce = other.getNonce();
        if (this$nonce == null) {
            if (other$nonce == null) {
                return true;
            }
        }
        else if (this$nonce.equals(other$nonce)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof SubscribeRequest;
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
        final Object $signingPublicKey = this.getSigningPublicKey();
        result = result * 59 + (($signingPublicKey == null) ? 43 : $signingPublicKey.hashCode());
        final Object $encrPublicKey = this.getEncrPublicKey();
        result = result * 59 + (($encrPublicKey == null) ? 43 : $encrPublicKey.hashCode());
        final Object $validFrom = this.getValidFrom();
        result = result * 59 + (($validFrom == null) ? 43 : $validFrom.hashCode());
        final Object $validUntil = this.getValidUntil();
        result = result * 59 + (($validUntil == null) ? 43 : $validUntil.hashCode());
        final Object $nonce = this.getNonce();
        result = result * 59 + (($nonce == null) ? 43 : $nonce.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "SubscribeRequest(subscriberId=" + this.getSubscriberId() + ", country=" + this.getCountry() + ", city=" + this.getCity() + ", domain=" + this.getDomain() + ", signingPublicKey=" + this.getSigningPublicKey() + ", encrPublicKey=" + this.getEncrPublicKey() + ", validFrom=" + this.getValidFrom() + ", validUntil=" + this.getValidUntil() + ", nonce=" + this.getNonce() + ")";
    }
}
