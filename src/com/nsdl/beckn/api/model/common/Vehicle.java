// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Vehicle
{
    private String category;
    private int capacity;
    private String make;
    private String model;
    private String size;
    private String variant;
    private String color;
    private String energyType;
    private String registration;
    
    public String getCategory() {
        return this.category;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public String getSize() {
        return this.size;
    }
    
    public String getVariant() {
        return this.variant;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String getEnergyType() {
        return this.energyType;
    }
    
    public String getRegistration() {
        return this.registration;
    }
    
    public void setCategory(final String category) {
        this.category = category;
    }
    
    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }
    
    public void setMake(final String make) {
        this.make = make;
    }
    
    public void setModel(final String model) {
        this.model = model;
    }
    
    public void setSize(final String size) {
        this.size = size;
    }
    
    public void setVariant(final String variant) {
        this.variant = variant;
    }
    
    public void setColor(final String color) {
        this.color = color;
    }
    
    public void setEnergyType(final String energyType) {
        this.energyType = energyType;
    }
    
    public void setRegistration(final String registration) {
        this.registration = registration;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Vehicle)) {
            return false;
        }
        final Vehicle other = (Vehicle)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCapacity() != other.getCapacity()) {
            return false;
        }
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        Label_0078: {
            if (this$category == null) {
                if (other$category == null) {
                    break Label_0078;
                }
            }
            else if (this$category.equals(other$category)) {
                break Label_0078;
            }
            return false;
        }
        final Object this$make = this.getMake();
        final Object other$make = other.getMake();
        Label_0115: {
            if (this$make == null) {
                if (other$make == null) {
                    break Label_0115;
                }
            }
            else if (this$make.equals(other$make)) {
                break Label_0115;
            }
            return false;
        }
        final Object this$model = this.getModel();
        final Object other$model = other.getModel();
        Label_0152: {
            if (this$model == null) {
                if (other$model == null) {
                    break Label_0152;
                }
            }
            else if (this$model.equals(other$model)) {
                break Label_0152;
            }
            return false;
        }
        final Object this$size = this.getSize();
        final Object other$size = other.getSize();
        Label_0189: {
            if (this$size == null) {
                if (other$size == null) {
                    break Label_0189;
                }
            }
            else if (this$size.equals(other$size)) {
                break Label_0189;
            }
            return false;
        }
        final Object this$variant = this.getVariant();
        final Object other$variant = other.getVariant();
        Label_0226: {
            if (this$variant == null) {
                if (other$variant == null) {
                    break Label_0226;
                }
            }
            else if (this$variant.equals(other$variant)) {
                break Label_0226;
            }
            return false;
        }
        final Object this$color = this.getColor();
        final Object other$color = other.getColor();
        Label_0263: {
            if (this$color == null) {
                if (other$color == null) {
                    break Label_0263;
                }
            }
            else if (this$color.equals(other$color)) {
                break Label_0263;
            }
            return false;
        }
        final Object this$energyType = this.getEnergyType();
        final Object other$energyType = other.getEnergyType();
        Label_0300: {
            if (this$energyType == null) {
                if (other$energyType == null) {
                    break Label_0300;
                }
            }
            else if (this$energyType.equals(other$energyType)) {
                break Label_0300;
            }
            return false;
        }
        final Object this$registration = this.getRegistration();
        final Object other$registration = other.getRegistration();
        if (this$registration == null) {
            if (other$registration == null) {
                return true;
            }
        }
        else if (this$registration.equals(other$registration)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Vehicle;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getCapacity();
        final Object $category = this.getCategory();
        result = result * 59 + (($category == null) ? 43 : $category.hashCode());
        final Object $make = this.getMake();
        result = result * 59 + (($make == null) ? 43 : $make.hashCode());
        final Object $model = this.getModel();
        result = result * 59 + (($model == null) ? 43 : $model.hashCode());
        final Object $size = this.getSize();
        result = result * 59 + (($size == null) ? 43 : $size.hashCode());
        final Object $variant = this.getVariant();
        result = result * 59 + (($variant == null) ? 43 : $variant.hashCode());
        final Object $color = this.getColor();
        result = result * 59 + (($color == null) ? 43 : $color.hashCode());
        final Object $energyType = this.getEnergyType();
        result = result * 59 + (($energyType == null) ? 43 : $energyType.hashCode());
        final Object $registration = this.getRegistration();
        result = result * 59 + (($registration == null) ? 43 : $registration.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Vehicle(category=" + this.getCategory() + ", capacity=" + this.getCapacity() + ", make=" + this.getMake() + ", model=" + this.getModel() + ", size=" + this.getSize() + ", variant=" + this.getVariant() + ", color=" + this.getColor() + ", energyType=" + this.getEnergyType() + ", registration=" + this.getRegistration() + ")";
    }
}
