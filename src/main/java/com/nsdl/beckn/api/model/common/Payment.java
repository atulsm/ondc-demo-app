// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Payment
{
    private String uri;
    private String tlMethod;
    private PaymentParams params;
    private String type;
    private String status;
    private Time time;
    
    public String getUri() {
        return this.uri;
    }
    
    public String getTlMethod() {
        return this.tlMethod;
    }
    
    public PaymentParams getParams() {
        return this.params;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public void setUri(final String uri) {
        this.uri = uri;
    }
    
    public void setTlMethod(final String tlMethod) {
        this.tlMethod = tlMethod;
    }
    
    public void setParams(final PaymentParams params) {
        this.params = params;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setStatus(final String status) {
        this.status = status;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Payment)) {
            return false;
        }
        final Payment other = (Payment)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        Label_0065: {
            if (this$uri == null) {
                if (other$uri == null) {
                    break Label_0065;
                }
            }
            else if (this$uri.equals(other$uri)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$tlMethod = this.getTlMethod();
        final Object other$tlMethod = other.getTlMethod();
        Label_0102: {
            if (this$tlMethod == null) {
                if (other$tlMethod == null) {
                    break Label_0102;
                }
            }
            else if (this$tlMethod.equals(other$tlMethod)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$params = this.getParams();
        final Object other$params = other.getParams();
        Label_0139: {
            if (this$params == null) {
                if (other$params == null) {
                    break Label_0139;
                }
            }
            else if (this$params.equals(other$params)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0176: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0176;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        Label_0213: {
            if (this$status == null) {
                if (other$status == null) {
                    break Label_0213;
                }
            }
            else if (this$status.equals(other$status)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null) {
            if (other$time == null) {
                return true;
            }
        }
        else if (this$time.equals(other$time)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Payment;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $uri = this.getUri();
        result = result * 59 + (($uri == null) ? 43 : $uri.hashCode());
        final Object $tlMethod = this.getTlMethod();
        result = result * 59 + (($tlMethod == null) ? 43 : $tlMethod.hashCode());
        final Object $params = this.getParams();
        result = result * 59 + (($params == null) ? 43 : $params.hashCode());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $status = this.getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Payment(uri=" + this.getUri() + ", tlMethod=" + this.getTlMethod() + ", params=" + this.getParams() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", time=" + this.getTime() + ")";
    }
}
