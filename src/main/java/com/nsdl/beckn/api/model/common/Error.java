// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.nsdl.beckn.api.enums.ErrorType;

public class Error
{
    private ErrorType type;
    private String code;
    private String path;
    private String message;
    
    public ErrorType getType() {
        return this.type;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getPath() {
        return this.path;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setType(final ErrorType type) {
        this.type = type;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setPath(final String path) {
        this.path = path;
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Error)) {
            return false;
        }
        final Error other = (Error)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0065: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0065;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0102: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0102;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$path = this.getPath();
        final Object other$path = other.getPath();
        Label_0139: {
            if (this$path == null) {
                if (other$path == null) {
                    break Label_0139;
                }
            }
            else if (this$path.equals(other$path)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null) {
            if (other$message == null) {
                return true;
            }
        }
        else if (this$message.equals(other$message)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Error;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $path = this.getPath();
        result = result * 59 + (($path == null) ? 43 : $path.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Error(type=" + this.getType() + ", code=" + this.getCode() + ", path=" + this.getPath() + ", message=" + this.getMessage() + ")";
    }
}
