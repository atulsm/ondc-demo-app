// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Price
{
    private String currency;
    private float value;
    private float estimatedValue;
    private float computedValue;
    private float listedValue;
    private float offeredValue;
    private float minimumValue;
    private float maximumValue;
    
    public String getCurrency() {
        return this.currency;
    }
    
    public float getValue() {
        return this.value;
    }
    
    public float getEstimatedValue() {
        return this.estimatedValue;
    }
    
    public float getComputedValue() {
        return this.computedValue;
    }
    
    public float getListedValue() {
        return this.listedValue;
    }
    
    public float getOfferedValue() {
        return this.offeredValue;
    }
    
    public float getMinimumValue() {
        return this.minimumValue;
    }
    
    public float getMaximumValue() {
        return this.maximumValue;
    }
    
    public void setCurrency(final String currency) {
        this.currency = currency;
    }
    
    public void setValue(final float value) {
        this.value = value;
    }
    
    public void setEstimatedValue(final float estimatedValue) {
        this.estimatedValue = estimatedValue;
    }
    
    public void setComputedValue(final float computedValue) {
        this.computedValue = computedValue;
    }
    
    public void setListedValue(final float listedValue) {
        this.listedValue = listedValue;
    }
    
    public void setOfferedValue(final float offeredValue) {
        this.offeredValue = offeredValue;
    }
    
    public void setMinimumValue(final float minimumValue) {
        this.minimumValue = minimumValue;
    }
    
    public void setMaximumValue(final float maximumValue) {
        this.maximumValue = maximumValue;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Price)) {
            return false;
        }
        final Price other = (Price)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (Float.compare(this.getValue(), other.getValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getEstimatedValue(), other.getEstimatedValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getComputedValue(), other.getComputedValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getListedValue(), other.getListedValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getOfferedValue(), other.getOfferedValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getMinimumValue(), other.getMinimumValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getMaximumValue(), other.getMaximumValue()) != 0) {
            return false;
        }
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null) {
            if (other$currency == null) {
                return true;
            }
        }
        else if (this$currency.equals(other$currency)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Price;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + Float.floatToIntBits(this.getValue());
        result = result * 59 + Float.floatToIntBits(this.getEstimatedValue());
        result = result * 59 + Float.floatToIntBits(this.getComputedValue());
        result = result * 59 + Float.floatToIntBits(this.getListedValue());
        result = result * 59 + Float.floatToIntBits(this.getOfferedValue());
        result = result * 59 + Float.floatToIntBits(this.getMinimumValue());
        result = result * 59 + Float.floatToIntBits(this.getMaximumValue());
        final Object $currency = this.getCurrency();
        result = result * 59 + (($currency == null) ? 43 : $currency.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Price(currency=" + this.getCurrency() + ", value=" + this.getValue() + ", estimatedValue=" + this.getEstimatedValue() + ", computedValue=" + this.getComputedValue() + ", listedValue=" + this.getListedValue() + ", offeredValue=" + this.getOfferedValue() + ", minimumValue=" + this.getMinimumValue() + ", maximumValue=" + this.getMaximumValue() + ")";
    }
}
