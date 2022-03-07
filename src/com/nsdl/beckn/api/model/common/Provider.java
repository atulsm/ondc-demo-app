// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import java.util.List;

public class Provider
{
    private String id;
    private Descriptor descriptor;
    private String categoryId;
    private Time time;
    private List<Category> categories;
    private List<Fulfillment> fulfillments;
    private List<Payment> payments;
    private List<Location> locations;
    private List<Offer> offers;
    private List<Item> items;
    private String exp;
    private Tags tags;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public List<Category> getCategories() {
        return this.categories;
    }
    
    public List<Fulfillment> getFulfillments() {
        return this.fulfillments;
    }
    
    public List<Payment> getPayments() {
        return this.payments;
    }
    
    public List<Location> getLocations() {
        return this.locations;
    }
    
    public List<Offer> getOffers() {
        return this.offers;
    }
    
    public List<Item> getItems() {
        return this.items;
    }
    
    public String getExp() {
        return this.exp;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    public void setCategories(final List<Category> categories) {
        this.categories = categories;
    }
    
    public void setFulfillments(final List<Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
    }
    
    public void setPayments(final List<Payment> payments) {
        this.payments = payments;
    }
    
    public void setLocations(final List<Location> locations) {
        this.locations = locations;
    }
    
    public void setOffers(final List<Offer> offers) {
        this.offers = offers;
    }
    
    public void setItems(final List<Item> items) {
        this.items = items;
    }
    
    public void setExp(final String exp) {
        this.exp = exp;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Provider)) {
            return false;
        }
        final Provider other = (Provider)o;
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
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        Label_0102: {
            if (this$descriptor == null) {
                if (other$descriptor == null) {
                    break Label_0102;
                }
            }
            else if (this$descriptor.equals(other$descriptor)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        Label_0139: {
            if (this$categoryId == null) {
                if (other$categoryId == null) {
                    break Label_0139;
                }
            }
            else if (this$categoryId.equals(other$categoryId)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        Label_0176: {
            if (this$time == null) {
                if (other$time == null) {
                    break Label_0176;
                }
            }
            else if (this$time.equals(other$time)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$categories = this.getCategories();
        final Object other$categories = other.getCategories();
        Label_0213: {
            if (this$categories == null) {
                if (other$categories == null) {
                    break Label_0213;
                }
            }
            else if (this$categories.equals(other$categories)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$fulfillments = this.getFulfillments();
        final Object other$fulfillments = other.getFulfillments();
        Label_0250: {
            if (this$fulfillments == null) {
                if (other$fulfillments == null) {
                    break Label_0250;
                }
            }
            else if (this$fulfillments.equals(other$fulfillments)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$payments = this.getPayments();
        final Object other$payments = other.getPayments();
        Label_0287: {
            if (this$payments == null) {
                if (other$payments == null) {
                    break Label_0287;
                }
            }
            else if (this$payments.equals(other$payments)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$locations = this.getLocations();
        final Object other$locations = other.getLocations();
        Label_0324: {
            if (this$locations == null) {
                if (other$locations == null) {
                    break Label_0324;
                }
            }
            else if (this$locations.equals(other$locations)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$offers = this.getOffers();
        final Object other$offers = other.getOffers();
        Label_0361: {
            if (this$offers == null) {
                if (other$offers == null) {
                    break Label_0361;
                }
            }
            else if (this$offers.equals(other$offers)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        Label_0398: {
            if (this$items == null) {
                if (other$items == null) {
                    break Label_0398;
                }
            }
            else if (this$items.equals(other$items)) {
                break Label_0398;
            }
            return false;
        }
        final Object this$exp = this.getExp();
        final Object other$exp = other.getExp();
        Label_0435: {
            if (this$exp == null) {
                if (other$exp == null) {
                    break Label_0435;
                }
            }
            else if (this$exp.equals(other$exp)) {
                break Label_0435;
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
        return other instanceof Provider;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $categoryId = this.getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        final Object $categories = this.getCategories();
        result = result * 59 + (($categories == null) ? 43 : $categories.hashCode());
        final Object $fulfillments = this.getFulfillments();
        result = result * 59 + (($fulfillments == null) ? 43 : $fulfillments.hashCode());
        final Object $payments = this.getPayments();
        result = result * 59 + (($payments == null) ? 43 : $payments.hashCode());
        final Object $locations = this.getLocations();
        result = result * 59 + (($locations == null) ? 43 : $locations.hashCode());
        final Object $offers = this.getOffers();
        result = result * 59 + (($offers == null) ? 43 : $offers.hashCode());
        final Object $items = this.getItems();
        result = result * 59 + (($items == null) ? 43 : $items.hashCode());
        final Object $exp = this.getExp();
        result = result * 59 + (($exp == null) ? 43 : $exp.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Provider(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", categoryId=" + this.getCategoryId() + ", time=" + this.getTime() + ", categories=" + this.getCategories() + ", fulfillments=" + this.getFulfillments() + ", payments=" + this.getPayments() + ", locations=" + this.getLocations() + ", offers=" + this.getOffers() + ", items=" + this.getItems() + ", exp=" + this.getExp() + ", tags=" + this.getTags() + ")";
    }
}
