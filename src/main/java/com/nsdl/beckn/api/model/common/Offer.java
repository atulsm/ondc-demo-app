// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import java.util.List;

public class Offer
{
    private String id;
    private Descriptor descriptor;
    private List<String> locationIds;
    private List<String> categoryIds;
    private List<String> itemIds;
    private Time time;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public List<String> getLocationIds() {
        return this.locationIds;
    }
    
    public List<String> getCategoryIds() {
        return this.categoryIds;
    }
    
    public List<String> getItemIds() {
        return this.itemIds;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setLocationIds(final List<String> locationIds) {
        this.locationIds = locationIds;
    }
    
    public void setCategoryIds(final List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }
    
    public void setItemIds(final List<String> itemIds) {
        this.itemIds = itemIds;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Offer)) {
            return false;
        }
        final Offer other = (Offer)o;
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
        final Object this$locationIds = this.getLocationIds();
        final Object other$locationIds = other.getLocationIds();
        Label_0139: {
            if (this$locationIds == null) {
                if (other$locationIds == null) {
                    break Label_0139;
                }
            }
            else if (this$locationIds.equals(other$locationIds)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$categoryIds = this.getCategoryIds();
        final Object other$categoryIds = other.getCategoryIds();
        Label_0176: {
            if (this$categoryIds == null) {
                if (other$categoryIds == null) {
                    break Label_0176;
                }
            }
            else if (this$categoryIds.equals(other$categoryIds)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$itemIds = this.getItemIds();
        final Object other$itemIds = other.getItemIds();
        Label_0213: {
            if (this$itemIds == null) {
                if (other$itemIds == null) {
                    break Label_0213;
                }
            }
            else if (this$itemIds.equals(other$itemIds)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        if (this$time == null) {
            if (other$time == null) {
                return true;
            }
        }
        else if (this$time.equals(other$time)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Offer;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $locationIds = this.getLocationIds();
        result = result * 59 + (($locationIds == null) ? 43 : $locationIds.hashCode());
        final Object $categoryIds = this.getCategoryIds();
        result = result * 59 + (($categoryIds == null) ? 43 : $categoryIds.hashCode());
        final Object $itemIds = this.getItemIds();
        result = result * 59 + (($itemIds == null) ? 43 : $itemIds.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Offer(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", locationIds=" + this.getLocationIds() + ", categoryIds=" + this.getCategoryIds() + ", itemIds=" + this.getItemIds() + ", time=" + this.getTime() + ")";
    }
}
