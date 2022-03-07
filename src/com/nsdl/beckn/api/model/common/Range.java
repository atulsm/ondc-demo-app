// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Range
{
    private float min;
    private float max;
    
    public float getMin() {
        return this.min;
    }
    
    public float getMax() {
        return this.max;
    }
    
    public void setMin(final float min) {
        this.min = min;
    }
    
    public void setMax(final float max) {
        this.max = max;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Range)) {
            return false;
        }
        final Range other = (Range)o;
        return other.canEqual(this) && Float.compare(this.getMin(), other.getMin()) == 0 && Float.compare(this.getMax(), other.getMax()) == 0;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Range;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + Float.floatToIntBits(this.getMin());
        result = result * 59 + Float.floatToIntBits(this.getMax());
        return result;
    }
    
    @Override
    public String toString() {
        return "Range(min=" + this.getMin() + ", max=" + this.getMax() + ")";
    }
}
