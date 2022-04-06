// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import lombok.Builder;

import java.util.List;

@Builder
public class Quotation
{
    private Price price;
    private List<QuotationBreakUp> breakup;
    private String ttl;
    
    public Price getPrice() {
        return this.price;
    }
    
    public List<QuotationBreakUp> getBreakup() {
        return this.breakup;
    }
    
    public String getTtl() {
        return this.ttl;
    }
    
    public void setPrice(final Price price) {
        this.price = price;
    }
    
    public void setBreakup(final List<QuotationBreakUp> breakup) {
        this.breakup = breakup;
    }
    
    public void setTtl(final String ttl) {
        this.ttl = ttl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Quotation)) {
            return false;
        }
        final Quotation other = (Quotation)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        Label_0065: {
            if (this$price == null) {
                if (other$price == null) {
                    break Label_0065;
                }
            }
            else if (this$price.equals(other$price)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$breakup = this.getBreakup();
        final Object other$breakup = other.getBreakup();
        Label_0102: {
            if (this$breakup == null) {
                if (other$breakup == null) {
                    break Label_0102;
                }
            }
            else if (this$breakup.equals(other$breakup)) {
                break Label_0102;
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
        return other instanceof Quotation;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $price = this.getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        final Object $breakup = this.getBreakup();
        result = result * 59 + (($breakup == null) ? 43 : $breakup.hashCode());
        final Object $ttl = this.getTtl();
        result = result * 59 + (($ttl == null) ? 43 : $ttl.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Quotation(price=" + this.getPrice() + ", breakup=" + this.getBreakup() + ", ttl=" + this.getTtl() + ")";
    }
}
