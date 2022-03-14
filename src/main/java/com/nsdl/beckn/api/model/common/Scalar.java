// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Scalar
{
    private String type;
    private float number;
    private float estimatedValue;
    private float computedValue;
    private Range range;
    private String unit;
    
    public String getType() {
        return this.type;
    }
    
    public float getNumber() {
        return this.number;
    }
    
    public float getEstimatedValue() {
        return this.estimatedValue;
    }
    
    public float getComputedValue() {
        return this.computedValue;
    }
    
    public Range getRange() {
        return this.range;
    }
    
    public String getUnit() {
        return this.unit;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setNumber(final float number) {
        this.number = number;
    }
    
    public void setEstimatedValue(final float estimatedValue) {
        this.estimatedValue = estimatedValue;
    }
    
    public void setComputedValue(final float computedValue) {
        this.computedValue = computedValue;
    }
    
    public void setRange(final Range range) {
        this.range = range;
    }
    
    public void setUnit(final String unit) {
        this.unit = unit;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Scalar)) {
            return false;
        }
        final Scalar other = (Scalar)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (Float.compare(this.getNumber(), other.getNumber()) != 0) {
            return false;
        }
        if (Float.compare(this.getEstimatedValue(), other.getEstimatedValue()) != 0) {
            return false;
        }
        if (Float.compare(this.getComputedValue(), other.getComputedValue()) != 0) {
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0113: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0113;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0113;
            }
            return false;
        }
        final Object this$range = this.getRange();
        final Object other$range = other.getRange();
        Label_0150: {
            if (this$range == null) {
                if (other$range == null) {
                    break Label_0150;
                }
            }
            else if (this$range.equals(other$range)) {
                break Label_0150;
            }
            return false;
        }
        final Object this$unit = this.getUnit();
        final Object other$unit = other.getUnit();
        if (this$unit == null) {
            if (other$unit == null) {
                return true;
            }
        }
        else if (this$unit.equals(other$unit)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Scalar;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + Float.floatToIntBits(this.getNumber());
        result = result * 59 + Float.floatToIntBits(this.getEstimatedValue());
        result = result * 59 + Float.floatToIntBits(this.getComputedValue());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $range = this.getRange();
        result = result * 59 + (($range == null) ? 43 : $range.hashCode());
        final Object $unit = this.getUnit();
        result = result * 59 + (($unit == null) ? 43 : $unit.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Scalar(type=" + this.getType() + ", number=" + this.getNumber() + ", estimatedValue=" + this.getEstimatedValue() + ", computedValue=" + this.getComputedValue() + ", range=" + this.getRange() + ", unit=" + this.getUnit() + ")";
    }
}
