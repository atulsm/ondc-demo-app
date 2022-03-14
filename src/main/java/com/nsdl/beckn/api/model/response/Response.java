// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.response;

import com.nsdl.beckn.api.model.common.Error;
import com.nsdl.beckn.api.model.common.Context;

public class Response
{
    private Context context;
    private ResponseMessage message;
    private Error error;
    
    public Context getContext() {
        return this.context;
    }
    
    public ResponseMessage getMessage() {
        return this.message;
    }
    
    public Error getError() {
        return this.error;
    }
    
    public void setContext(final Context context) {
        this.context = context;
    }
    
    public void setMessage(final ResponseMessage message) {
        this.message = message;
    }
    
    public void setError(final Error error) {
        this.error = error;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Response)) {
            return false;
        }
        final Response other = (Response)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$context = this.getContext();
        final Object other$context = other.getContext();
        Label_0065: {
            if (this$context == null) {
                if (other$context == null) {
                    break Label_0065;
                }
            }
            else if (this$context.equals(other$context)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        Label_0102: {
            if (this$message == null) {
                if (other$message == null) {
                    break Label_0102;
                }
            }
            else if (this$message.equals(other$message)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$error = this.getError();
        final Object other$error = other.getError();
        if (this$error == null) {
            if (other$error == null) {
                return true;
            }
        }
        else if (this$error.equals(other$error)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Response;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $context = this.getContext();
        result = result * 59 + (($context == null) ? 43 : $context.hashCode());
        final Object $message = this.getMessage();
        result = result * 59 + (($message == null) ? 43 : $message.hashCode());
        final Object $error = this.getError();
        result = result * 59 + (($error == null) ? 43 : $error.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Response(context=" + this.getContext() + ", message=" + this.getMessage() + ", error=" + this.getError() + ")";
    }
}
