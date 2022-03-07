// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Item
{
    private String id;
    private ItemQuantity quantity;
    private String parentItemId;
    private Descriptor descriptor;
    private Price price;
    private String categoryId;
    private String locationId;
    private Time time;
    private boolean matched;
    private boolean related;
    private boolean recommended;
    private Tags tags;
    
    public String getId() {
        return this.id;
    }
    
    public ItemQuantity getQuantity() {
        return this.quantity;
    }
    
    public String getParentItemId() {
        return this.parentItemId;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public Price getPrice() {
        return this.price;
    }
    
    public String getCategoryId() {
        return this.categoryId;
    }
    
    public String getLocationId() {
        return this.locationId;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public boolean isMatched() {
        return this.matched;
    }
    
    public boolean isRelated() {
        return this.related;
    }
    
    public boolean isRecommended() {
        return this.recommended;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setQuantity(final ItemQuantity quantity) {
        this.quantity = quantity;
    }
    
    public void setParentItemId(final String parentItemId) {
        this.parentItemId = parentItemId;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setPrice(final Price price) {
        this.price = price;
    }
    
    public void setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
    }
    
    public void setLocationId(final String locationId) {
        this.locationId = locationId;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    public void setMatched(final boolean matched) {
        this.matched = matched;
    }
    
    public void setRelated(final boolean related) {
        this.related = related;
    }
    
    public void setRecommended(final boolean recommended) {
        this.recommended = recommended;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Item)) {
            return false;
        }
        final Item other = (Item)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isMatched() != other.isMatched()) {
            return false;
        }
        if (this.isRelated() != other.isRelated()) {
            return false;
        }
        if (this.isRecommended() != other.isRecommended()) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0104: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0104;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0104;
            }
            return false;
        }
        final Object this$quantity = this.getQuantity();
        final Object other$quantity = other.getQuantity();
        Label_0141: {
            if (this$quantity == null) {
                if (other$quantity == null) {
                    break Label_0141;
                }
            }
            else if (this$quantity.equals(other$quantity)) {
                break Label_0141;
            }
            return false;
        }
        final Object this$parentItemId = this.getParentItemId();
        final Object other$parentItemId = other.getParentItemId();
        Label_0178: {
            if (this$parentItemId == null) {
                if (other$parentItemId == null) {
                    break Label_0178;
                }
            }
            else if (this$parentItemId.equals(other$parentItemId)) {
                break Label_0178;
            }
            return false;
        }
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        Label_0215: {
            if (this$descriptor == null) {
                if (other$descriptor == null) {
                    break Label_0215;
                }
            }
            else if (this$descriptor.equals(other$descriptor)) {
                break Label_0215;
            }
            return false;
        }
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        Label_0252: {
            if (this$price == null) {
                if (other$price == null) {
                    break Label_0252;
                }
            }
            else if (this$price.equals(other$price)) {
                break Label_0252;
            }
            return false;
        }
        final Object this$categoryId = this.getCategoryId();
        final Object other$categoryId = other.getCategoryId();
        Label_0289: {
            if (this$categoryId == null) {
                if (other$categoryId == null) {
                    break Label_0289;
                }
            }
            else if (this$categoryId.equals(other$categoryId)) {
                break Label_0289;
            }
            return false;
        }
        final Object this$locationId = this.getLocationId();
        final Object other$locationId = other.getLocationId();
        Label_0326: {
            if (this$locationId == null) {
                if (other$locationId == null) {
                    break Label_0326;
                }
            }
            else if (this$locationId.equals(other$locationId)) {
                break Label_0326;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        Label_0363: {
            if (this$time == null) {
                if (other$time == null) {
                    break Label_0363;
                }
            }
            else if (this$time.equals(other$time)) {
                break Label_0363;
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
        return other instanceof Item;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isMatched() ? 79 : 97);
        result = result * 59 + (this.isRelated() ? 79 : 97);
        result = result * 59 + (this.isRecommended() ? 79 : 97);
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $quantity = this.getQuantity();
        result = result * 59 + (($quantity == null) ? 43 : $quantity.hashCode());
        final Object $parentItemId = this.getParentItemId();
        result = result * 59 + (($parentItemId == null) ? 43 : $parentItemId.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $price = this.getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        final Object $categoryId = this.getCategoryId();
        result = result * 59 + (($categoryId == null) ? 43 : $categoryId.hashCode());
        final Object $locationId = this.getLocationId();
        result = result * 59 + (($locationId == null) ? 43 : $locationId.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Item(id=" + this.getId() + ", quantity=" + this.getQuantity() + ", parentItemId=" + this.getParentItemId() + ", descriptor=" + this.getDescriptor() + ", price=" + this.getPrice() + ", categoryId=" + this.getCategoryId() + ", locationId=" + this.getLocationId() + ", time=" + this.getTime() + ", matched=" + this.isMatched() + ", related=" + this.isRelated() + ", recommended=" + this.isRecommended() + ", tags=" + this.getTags() + ")";
    }
}
