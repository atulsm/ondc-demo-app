// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Context
{
    private String domain;
    private String country;
    private String city;
    private String action;
    private String coreVersion;
    private String bapId;
    private String bapUri;
    private String bppId;
    private String bppUri;
    private String transactionId;
    private String messageId;
    private String timestamp;
    private String key;
    private String ttl;
    
    public String getDomain() {
        return this.domain;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getAction() {
        return this.action;
    }
    
    public String getCoreVersion() {
        return this.coreVersion;
    }
    
    public String getBapId() {
        return this.bapId;
    }
    
    public String getBapUri() {
        return this.bapUri;
    }
    
    public String getBppId() {
        return this.bppId;
    }
    
    public String getBppUri() {
        return this.bppUri;
    }
    
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public String getMessageId() {
        return this.messageId;
    }
    
    public String getTimestamp() {
        return this.timestamp;
    }
    
    public String getKey() {
        return this.key;
    }
    
    public String getTtl() {
        return this.ttl;
    }
    
    public void setDomain(final String domain) {
        this.domain = domain;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public void setAction(final String action) {
        this.action = action;
    }
    
    public void setCoreVersion(final String coreVersion) {
        this.coreVersion = coreVersion;
    }
    
    public void setBapId(final String bapId) {
        this.bapId = bapId;
    }
    
    public void setBapUri(final String bapUri) {
        this.bapUri = bapUri;
    }
    
    public void setBppId(final String bppId) {
        this.bppId = bppId;
    }
    
    public void setBppUri(final String bppUri) {
        this.bppUri = bppUri;
    }
    
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }
    
    public void setMessageId(final String messageId) {
        this.messageId = messageId;
    }
    
    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }
    
    public void setKey(final String key) {
        this.key = key;
    }
    
    public void setTtl(final String ttl) {
        this.ttl = ttl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Context)) {
            return false;
        }
        final Context other = (Context)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$domain = this.getDomain();
        final Object other$domain = other.getDomain();
        Label_0065: {
            if (this$domain == null) {
                if (other$domain == null) {
                    break Label_0065;
                }
            }
            else if (this$domain.equals(other$domain)) {
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
        final Object this$action = this.getAction();
        final Object other$action = other.getAction();
        Label_0176: {
            if (this$action == null) {
                if (other$action == null) {
                    break Label_0176;
                }
            }
            else if (this$action.equals(other$action)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$coreVersion = this.getCoreVersion();
        final Object other$coreVersion = other.getCoreVersion();
        Label_0213: {
            if (this$coreVersion == null) {
                if (other$coreVersion == null) {
                    break Label_0213;
                }
            }
            else if (this$coreVersion.equals(other$coreVersion)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$bapId = this.getBapId();
        final Object other$bapId = other.getBapId();
        Label_0250: {
            if (this$bapId == null) {
                if (other$bapId == null) {
                    break Label_0250;
                }
            }
            else if (this$bapId.equals(other$bapId)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$bapUri = this.getBapUri();
        final Object other$bapUri = other.getBapUri();
        Label_0287: {
            if (this$bapUri == null) {
                if (other$bapUri == null) {
                    break Label_0287;
                }
            }
            else if (this$bapUri.equals(other$bapUri)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$bppId = this.getBppId();
        final Object other$bppId = other.getBppId();
        Label_0324: {
            if (this$bppId == null) {
                if (other$bppId == null) {
                    break Label_0324;
                }
            }
            else if (this$bppId.equals(other$bppId)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$bppUri = this.getBppUri();
        final Object other$bppUri = other.getBppUri();
        Label_0361: {
            if (this$bppUri == null) {
                if (other$bppUri == null) {
                    break Label_0361;
                }
            }
            else if (this$bppUri.equals(other$bppUri)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        Label_0398: {
            if (this$transactionId == null) {
                if (other$transactionId == null) {
                    break Label_0398;
                }
            }
            else if (this$transactionId.equals(other$transactionId)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$messageId = this.getMessageId();
        final Object other$messageId = other.getMessageId();
        Label_0435: {
            if (this$messageId == null) {
                if (other$messageId == null) {
                    break Label_0435;
                }
            }
            else if (this$messageId.equals(other$messageId)) {
                break Label_0435;
            }
            return false;
        }
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        Label_0472: {
            if (this$timestamp == null) {
                if (other$timestamp == null) {
                    break Label_0472;
                }
            }
            else if (this$timestamp.equals(other$timestamp)) {
                break Label_0472;
            }
            return false;
        }
        final Object this$key = this.getKey();
        final Object other$key = other.getKey();
        Label_0509: {
            if (this$key == null) {
                if (other$key == null) {
                    break Label_0509;
                }
            }
            else if (this$key.equals(other$key)) {
                break Label_0509;
            }
            return false;
        }
        final Object this$ttl = this.getTtl();
        final Object other$ttl = other.getTtl();
        if (this$ttl == null) {
            if (other$ttl == null) {
                return true;
            }
        }
        else if (this$ttl.equals(other$ttl)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Context;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $domain = this.getDomain();
        result = result * 59 + (($domain == null) ? 43 : $domain.hashCode());
        final Object $country = this.getCountry();
        result = result * 59 + (($country == null) ? 43 : $country.hashCode());
        final Object $city = this.getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        final Object $action = this.getAction();
        result = result * 59 + (($action == null) ? 43 : $action.hashCode());
        final Object $coreVersion = this.getCoreVersion();
        result = result * 59 + (($coreVersion == null) ? 43 : $coreVersion.hashCode());
        final Object $bapId = this.getBapId();
        result = result * 59 + (($bapId == null) ? 43 : $bapId.hashCode());
        final Object $bapUri = this.getBapUri();
        result = result * 59 + (($bapUri == null) ? 43 : $bapUri.hashCode());
        final Object $bppId = this.getBppId();
        result = result * 59 + (($bppId == null) ? 43 : $bppId.hashCode());
        final Object $bppUri = this.getBppUri();
        result = result * 59 + (($bppUri == null) ? 43 : $bppUri.hashCode());
        final Object $transactionId = this.getTransactionId();
        result = result * 59 + (($transactionId == null) ? 43 : $transactionId.hashCode());
        final Object $messageId = this.getMessageId();
        result = result * 59 + (($messageId == null) ? 43 : $messageId.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * 59 + (($timestamp == null) ? 43 : $timestamp.hashCode());
        final Object $key = this.getKey();
        result = result * 59 + (($key == null) ? 43 : $key.hashCode());
        final Object $ttl = this.getTtl();
        result = result * 59 + (($ttl == null) ? 43 : $ttl.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Context(domain=" + this.getDomain() + ", country=" + this.getCountry() + ", city=" + this.getCity() + ", action=" + this.getAction() + ", coreVersion=" + this.getCoreVersion() + ", bapId=" + this.getBapId() + ", bapUri=" + this.getBapUri() + ", bppId=" + this.getBppId() + ", bppUri=" + this.getBppUri() + ", transactionId=" + this.getTransactionId() + ", messageId=" + this.getMessageId() + ", timestamp=" + this.getTimestamp() + ", key=" + this.getKey() + ", ttl=" + this.getTtl() + ")";
    }
}
