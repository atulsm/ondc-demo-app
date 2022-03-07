// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class ItemQuantityOld
{
    private Allocated allocated;
    private Available available;
    private Maximum maximum;
    private Minimum minimum;
    private Selected selected;
    
    public Allocated getAllocated() {
        return this.allocated;
    }
    
    public Available getAvailable() {
        return this.available;
    }
    
    public Maximum getMaximum() {
        return this.maximum;
    }
    
    public Minimum getMinimum() {
        return this.minimum;
    }
    
    public Selected getSelected() {
        return this.selected;
    }
    
    public void setAllocated(final Allocated allocated) {
        this.allocated = allocated;
    }
    
    public void setAvailable(final Available available) {
        this.available = available;
    }
    
    public void setMaximum(final Maximum maximum) {
        this.maximum = maximum;
    }
    
    public void setMinimum(final Minimum minimum) {
        this.minimum = minimum;
    }
    
    public void setSelected(final Selected selected) {
        this.selected = selected;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ItemQuantityOld)) {
            return false;
        }
        final ItemQuantityOld other = (ItemQuantityOld)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$allocated = this.getAllocated();
        final Object other$allocated = other.getAllocated();
        Label_0065: {
            if (this$allocated == null) {
                if (other$allocated == null) {
                    break Label_0065;
                }
            }
            else if (this$allocated.equals(other$allocated)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$available = this.getAvailable();
        final Object other$available = other.getAvailable();
        Label_0102: {
            if (this$available == null) {
                if (other$available == null) {
                    break Label_0102;
                }
            }
            else if (this$available.equals(other$available)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$maximum = this.getMaximum();
        final Object other$maximum = other.getMaximum();
        Label_0139: {
            if (this$maximum == null) {
                if (other$maximum == null) {
                    break Label_0139;
                }
            }
            else if (this$maximum.equals(other$maximum)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$minimum = this.getMinimum();
        final Object other$minimum = other.getMinimum();
        Label_0176: {
            if (this$minimum == null) {
                if (other$minimum == null) {
                    break Label_0176;
                }
            }
            else if (this$minimum.equals(other$minimum)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$selected = this.getSelected();
        final Object other$selected = other.getSelected();
        if (this$selected == null) {
            if (other$selected == null) {
                return true;
            }
        }
        else if (this$selected.equals(other$selected)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof ItemQuantityOld;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $allocated = this.getAllocated();
        result = result * 59 + (($allocated == null) ? 43 : $allocated.hashCode());
        final Object $available = this.getAvailable();
        result = result * 59 + (($available == null) ? 43 : $available.hashCode());
        final Object $maximum = this.getMaximum();
        result = result * 59 + (($maximum == null) ? 43 : $maximum.hashCode());
        final Object $minimum = this.getMinimum();
        result = result * 59 + (($minimum == null) ? 43 : $minimum.hashCode());
        final Object $selected = this.getSelected();
        result = result * 59 + (($selected == null) ? 43 : $selected.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "ItemQuantityOld(allocated=" + this.getAllocated() + ", available=" + this.getAvailable() + ", maximum=" + this.getMaximum() + ", minimum=" + this.getMinimum() + ", selected=" + this.getSelected() + ")";
    }
}
