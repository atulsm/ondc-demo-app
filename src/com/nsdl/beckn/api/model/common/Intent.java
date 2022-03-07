// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Intent
{
    private Provider provider;
    private Fulfillment fulfillment;
    private Payment payment;
    private Category category;
    private Offer offer;
    private Item item;
    private Tags tags;
    
    public Provider getProvider() {
        return this.provider;
    }
    
    public Fulfillment getFulfillment() {
        return this.fulfillment;
    }
    
    public Payment getPayment() {
        return this.payment;
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public Offer getOffer() {
        return this.offer;
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setProvider(final Provider provider) {
        this.provider = provider;
    }
    
    public void setFulfillment(final Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }
    
    public void setPayment(final Payment payment) {
        this.payment = payment;
    }
    
    public void setCategory(final Category category) {
        this.category = category;
    }
    
    public void setOffer(final Offer offer) {
        this.offer = offer;
    }
    
    public void setItem(final Item item) {
        this.item = item;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Intent)) {
            return false;
        }
        final Intent other = (Intent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$provider = this.getProvider();
        final Object other$provider = other.getProvider();
        Label_0065: {
            if (this$provider == null) {
                if (other$provider == null) {
                    break Label_0065;
                }
            }
            else if (this$provider.equals(other$provider)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$fulfillment = this.getFulfillment();
        final Object other$fulfillment = other.getFulfillment();
        Label_0102: {
            if (this$fulfillment == null) {
                if (other$fulfillment == null) {
                    break Label_0102;
                }
            }
            else if (this$fulfillment.equals(other$fulfillment)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$payment = this.getPayment();
        final Object other$payment = other.getPayment();
        Label_0139: {
            if (this$payment == null) {
                if (other$payment == null) {
                    break Label_0139;
                }
            }
            else if (this$payment.equals(other$payment)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        Label_0176: {
            if (this$category == null) {
                if (other$category == null) {
                    break Label_0176;
                }
            }
            else if (this$category.equals(other$category)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$offer = this.getOffer();
        final Object other$offer = other.getOffer();
        Label_0213: {
            if (this$offer == null) {
                if (other$offer == null) {
                    break Label_0213;
                }
            }
            else if (this$offer.equals(other$offer)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$item = this.getItem();
        final Object other$item = other.getItem();
        Label_0250: {
            if (this$item == null) {
                if (other$item == null) {
                    break Label_0250;
                }
            }
            else if (this$item.equals(other$item)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$tags = this.getTags();
        final Object other$tags = other.getTags();
        if (this$tags == null) {
            if (other$tags == null) {
                return true;
            }
        }
        else if (this$tags.equals(other$tags)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Intent;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $provider = this.getProvider();
        result = result * 59 + (($provider == null) ? 43 : $provider.hashCode());
        final Object $fulfillment = this.getFulfillment();
        result = result * 59 + (($fulfillment == null) ? 43 : $fulfillment.hashCode());
        final Object $payment = this.getPayment();
        result = result * 59 + (($payment == null) ? 43 : $payment.hashCode());
        final Object $category = this.getCategory();
        result = result * 59 + (($category == null) ? 43 : $category.hashCode());
        final Object $offer = this.getOffer();
        result = result * 59 + (($offer == null) ? 43 : $offer.hashCode());
        final Object $item = this.getItem();
        result = result * 59 + (($item == null) ? 43 : $item.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Intent(provider=" + this.getProvider() + ", fulfillment=" + this.getFulfillment() + ", payment=" + this.getPayment() + ", category=" + this.getCategory() + ", offer=" + this.getOffer() + ", item=" + this.getItem() + ", tags=" + this.getTags() + ")";
    }
}
