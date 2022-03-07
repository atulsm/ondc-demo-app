// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentParams
{
    private String transactionId;
    private String amount;
    private String mode;
    private String vpa;
    @JsonProperty("additionalProp1")
    private String additionalProp1;
    @JsonProperty("additionalProp2")
    private String additionalProp2;
    @JsonProperty("additionalProp3")
    private String additionalProp3;
    
    public String getTransactionId() {
        return this.transactionId;
    }
    
    public String getAmount() {
        return this.amount;
    }
    
    public String getMode() {
        return this.mode;
    }
    
    public String getVpa() {
        return this.vpa;
    }
    
    public String getAdditionalProp1() {
        return this.additionalProp1;
    }
    
    public String getAdditionalProp2() {
        return this.additionalProp2;
    }
    
    public String getAdditionalProp3() {
        return this.additionalProp3;
    }
    
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }
    
    public void setAmount(final String amount) {
        this.amount = amount;
    }
    
    public void setMode(final String mode) {
        this.mode = mode;
    }
    
    public void setVpa(final String vpa) {
        this.vpa = vpa;
    }
    
    @JsonProperty("additionalProp1")
    public void setAdditionalProp1(final String additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }
    
    @JsonProperty("additionalProp2")
    public void setAdditionalProp2(final String additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }
    
    @JsonProperty("additionalProp3")
    public void setAdditionalProp3(final String additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PaymentParams)) {
            return false;
        }
        final PaymentParams other = (PaymentParams)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$transactionId = this.getTransactionId();
        final Object other$transactionId = other.getTransactionId();
        Label_0065: {
            if (this$transactionId == null) {
                if (other$transactionId == null) {
                    break Label_0065;
                }
            }
            else if (this$transactionId.equals(other$transactionId)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        Label_0102: {
            if (this$amount == null) {
                if (other$amount == null) {
                    break Label_0102;
                }
            }
            else if (this$amount.equals(other$amount)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$mode = this.getMode();
        final Object other$mode = other.getMode();
        Label_0139: {
            if (this$mode == null) {
                if (other$mode == null) {
                    break Label_0139;
                }
            }
            else if (this$mode.equals(other$mode)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$vpa = this.getVpa();
        final Object other$vpa = other.getVpa();
        Label_0176: {
            if (this$vpa == null) {
                if (other$vpa == null) {
                    break Label_0176;
                }
            }
            else if (this$vpa.equals(other$vpa)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$additionalProp1 = this.getAdditionalProp1();
        final Object other$additionalProp1 = other.getAdditionalProp1();
        Label_0213: {
            if (this$additionalProp1 == null) {
                if (other$additionalProp1 == null) {
                    break Label_0213;
                }
            }
            else if (this$additionalProp1.equals(other$additionalProp1)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$additionalProp2 = this.getAdditionalProp2();
        final Object other$additionalProp2 = other.getAdditionalProp2();
        Label_0250: {
            if (this$additionalProp2 == null) {
                if (other$additionalProp2 == null) {
                    break Label_0250;
                }
            }
            else if (this$additionalProp2.equals(other$additionalProp2)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$additionalProp3 = this.getAdditionalProp3();
        final Object other$additionalProp3 = other.getAdditionalProp3();
        if (this$additionalProp3 == null) {
            if (other$additionalProp3 == null) {
                return true;
            }
        }
        else if (this$additionalProp3.equals(other$additionalProp3)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof PaymentParams;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $transactionId = this.getTransactionId();
        result = result * 59 + (($transactionId == null) ? 43 : $transactionId.hashCode());
        final Object $amount = this.getAmount();
        result = result * 59 + (($amount == null) ? 43 : $amount.hashCode());
        final Object $mode = this.getMode();
        result = result * 59 + (($mode == null) ? 43 : $mode.hashCode());
        final Object $vpa = this.getVpa();
        result = result * 59 + (($vpa == null) ? 43 : $vpa.hashCode());
        final Object $additionalProp1 = this.getAdditionalProp1();
        result = result * 59 + (($additionalProp1 == null) ? 43 : $additionalProp1.hashCode());
        final Object $additionalProp2 = this.getAdditionalProp2();
        result = result * 59 + (($additionalProp2 == null) ? 43 : $additionalProp2.hashCode());
        final Object $additionalProp3 = this.getAdditionalProp3();
        result = result * 59 + (($additionalProp3 == null) ? 43 : $additionalProp3.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "PaymentParams(transactionId=" + this.getTransactionId() + ", amount=" + this.getAmount() + ", mode=" + this.getMode() + ", vpa=" + this.getVpa() + ", additionalProp1=" + this.getAdditionalProp1() + ", additionalProp2=" + this.getAdditionalProp2() + ", additionalProp3=" + this.getAdditionalProp3() + ")";
    }
}
