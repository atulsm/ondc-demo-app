// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import java.util.List;

public class Category
{
    private String id;
    private String parentCategoryId;
    private Descriptor descriptor;
    private Time time;
    private List<Tags> tags;
    
    public String getId() {
        return this.id;
    }
    
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public List<Tags> getTags() {
        return this.tags;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setParentCategoryId(final String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
    
    public void setDescriptor(final Descriptor descriptor) {
        this.descriptor = descriptor;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    public void setTags(final List<Tags> tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Category)) {
            return false;
        }
        final Category other = (Category)o;
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
        final Object this$parentCategoryId = this.getParentCategoryId();
        final Object other$parentCategoryId = other.getParentCategoryId();
        Label_0102: {
            if (this$parentCategoryId == null) {
                if (other$parentCategoryId == null) {
                    break Label_0102;
                }
            }
            else if (this$parentCategoryId.equals(other$parentCategoryId)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$descriptor = this.getDescriptor();
        final Object other$descriptor = other.getDescriptor();
        Label_0139: {
            if (this$descriptor == null) {
                if (other$descriptor == null) {
                    break Label_0139;
                }
            }
            else if (this$descriptor.equals(other$descriptor)) {
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
        return other instanceof Category;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $parentCategoryId = this.getParentCategoryId();
        result = result * 59 + (($parentCategoryId == null) ? 43 : $parentCategoryId.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Category(id=" + this.getId() + ", parentCategoryId=" + this.getParentCategoryId() + ", descriptor=" + this.getDescriptor() + ", time=" + this.getTime() + ", tags=" + this.getTags() + ")";
    }
}
