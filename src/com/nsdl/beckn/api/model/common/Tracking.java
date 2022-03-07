// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Tracking
{
    private String url;
    private String status;
    
    public String getUrl() {
        return this.url;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setUrl(final String url) {
        this.url = url;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Tracking)) {
            return false;
        }
        final Tracking other = (Tracking)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        Label_0065: {
            if (this$url == null) {
                if (other$url == null) {
                    break Label_0065;
                }
            }
            else if (this$url.equals(other$url)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null) {
            if (other$status == null) {
                return true;
            }
        }
        else if (this$status.equals(other$status)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Tracking;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $url = this.getUrl();
        result = result * 59 + (($url == null) ? 43 : $url.hashCode());
        final Object $status = this.getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Tracking(url=" + this.getUrl() + ", status=" + this.getStatus() + ")";
    }
}
