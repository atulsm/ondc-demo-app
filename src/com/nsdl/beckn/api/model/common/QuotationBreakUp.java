// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class QuotationBreakUp
{
    private String title;
    private Price price;
    
    public String getTitle() {
        return this.title;
    }
    
    public Price getPrice() {
        return this.price;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    public void setPrice(final Price price) {
        this.price = price;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof QuotationBreakUp)) {
            return false;
        }
        final QuotationBreakUp other = (QuotationBreakUp)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        Label_0065: {
            if (this$title == null) {
                if (other$title == null) {
                    break Label_0065;
                }
            }
            else if (this$title.equals(other$title)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null) {
            if (other$price == null) {
                return true;
            }
        }
        else if (this$price.equals(other$price)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof QuotationBreakUp;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        final Object $price = this.getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "QuotationBreakUp(title=" + this.getTitle() + ", price=" + this.getPrice() + ")";
    }
}
