// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import java.util.List;

public class Order
{
    private String id;
    private String state;
    private List<Item> items;
    private List<AddOn> addOns;
    private List<Offer> offers;
    private Billing billing;
    private Fulfillment fulfillment;
    private Quotation quote;
    private Payment payment;
    private String createdAt;
    private String updatedAt;
    
    public String getId() {
        return this.id;
    }
    
    public String getState() {
        return this.state;
    }
    
    public List<Item> getItems() {
        return this.items;
    }
    
    public List<AddOn> getAddOns() {
        return this.addOns;
    }
    
    public List<Offer> getOffers() {
        return this.offers;
    }
    
    public Billing getBilling() {
        return this.billing;
    }
    
    public Fulfillment getFulfillment() {
        return this.fulfillment;
    }
    
    public Quotation getQuote() {
        return this.quote;
    }
    
    public Payment getPayment() {
        return this.payment;
    }
    
    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setState(final String state) {
        this.state = state;
    }
    
    public void setItems(final List<Item> items) {
        this.items = items;
    }
    
    public void setAddOns(final List<AddOn> addOns) {
        this.addOns = addOns;
    }
    
    public void setOffers(final List<Offer> offers) {
        this.offers = offers;
    }
    
    public void setBilling(final Billing billing) {
        this.billing = billing;
    }
    
    public void setFulfillment(final Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }
    
    public void setQuote(final Quotation quote) {
        this.quote = quote;
    }
    
    public void setPayment(final Payment payment) {
        this.payment = payment;
    }
    
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }
    
    public void setUpdatedAt(final String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Order)) {
            return false;
        }
        final Order other = (Order)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0065: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0065;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        Label_0102: {
            if (this$state == null) {
                if (other$state == null) {
                    break Label_0102;
                }
            }
            else if (this$state.equals(other$state)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        Label_0139: {
            if (this$items == null) {
                if (other$items == null) {
                    break Label_0139;
                }
            }
            else if (this$items.equals(other$items)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$addOns = this.getAddOns();
        final Object other$addOns = other.getAddOns();
        Label_0176: {
            if (this$addOns == null) {
                if (other$addOns == null) {
                    break Label_0176;
                }
            }
            else if (this$addOns.equals(other$addOns)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$offers = this.getOffers();
        final Object other$offers = other.getOffers();
        Label_0213: {
            if (this$offers == null) {
                if (other$offers == null) {
                    break Label_0213;
                }
            }
            else if (this$offers.equals(other$offers)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$billing = this.getBilling();
        final Object other$billing = other.getBilling();
        Label_0250: {
            if (this$billing == null) {
                if (other$billing == null) {
                    break Label_0250;
                }
            }
            else if (this$billing.equals(other$billing)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$fulfillment = this.getFulfillment();
        final Object other$fulfillment = other.getFulfillment();
        Label_0287: {
            if (this$fulfillment == null) {
                if (other$fulfillment == null) {
                    break Label_0287;
                }
            }
            else if (this$fulfillment.equals(other$fulfillment)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$quote = this.getQuote();
        final Object other$quote = other.getQuote();
        Label_0324: {
            if (this$quote == null) {
                if (other$quote == null) {
                    break Label_0324;
                }
            }
            else if (this$quote.equals(other$quote)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$payment = this.getPayment();
        final Object other$payment = other.getPayment();
        Label_0361: {
            if (this$payment == null) {
                if (other$payment == null) {
                    break Label_0361;
                }
            }
            else if (this$payment.equals(other$payment)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$createdAt = this.getCreatedAt();
        final Object other$createdAt = other.getCreatedAt();
        Label_0398: {
            if (this$createdAt == null) {
                if (other$createdAt == null) {
                    break Label_0398;
                }
            }
            else if (this$createdAt.equals(other$createdAt)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$updatedAt = this.getUpdatedAt();
        final Object other$updatedAt = other.getUpdatedAt();
        if (this$updatedAt == null) {
            if (other$updatedAt == null) {
                return true;
            }
        }
        else if (this$updatedAt.equals(other$updatedAt)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Order;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $state = this.getState();
        result = result * 59 + (($state == null) ? 43 : $state.hashCode());
        final Object $items = this.getItems();
        result = result * 59 + (($items == null) ? 43 : $items.hashCode());
        final Object $addOns = this.getAddOns();
        result = result * 59 + (($addOns == null) ? 43 : $addOns.hashCode());
        final Object $offers = this.getOffers();
        result = result * 59 + (($offers == null) ? 43 : $offers.hashCode());
        final Object $billing = this.getBilling();
        result = result * 59 + (($billing == null) ? 43 : $billing.hashCode());
        final Object $fulfillment = this.getFulfillment();
        result = result * 59 + (($fulfillment == null) ? 43 : $fulfillment.hashCode());
        final Object $quote = this.getQuote();
        result = result * 59 + (($quote == null) ? 43 : $quote.hashCode());
        final Object $payment = this.getPayment();
        result = result * 59 + (($payment == null) ? 43 : $payment.hashCode());
        final Object $createdAt = this.getCreatedAt();
        result = result * 59 + (($createdAt == null) ? 43 : $createdAt.hashCode());
        final Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + (($updatedAt == null) ? 43 : $updatedAt.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Order(id=" + this.getId() + ", state=" + this.getState() + ", items=" + this.getItems() + ", addOns=" + this.getAddOns() + ", offers=" + this.getOffers() + ", billing=" + this.getBilling() + ", fulfillment=" + this.getFulfillment() + ", quote=" + this.getQuote() + ", payment=" + this.getPayment() + ", createdAt=" + this.getCreatedAt() + ", updatedAt=" + this.getUpdatedAt() + ")";
    }
}
