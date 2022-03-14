// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Address
{
    private String door;
    private String name;
    private String building;
    private String street;
    private String locality;
    private String ward;
    private String city;
    private String state;
    private String country;
    private String areaCode;
    
    public String getDoor() {
        return this.door;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getBuilding() {
        return this.building;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    public String getLocality() {
        return this.locality;
    }
    
    public String getWard() {
        return this.ward;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public String getState() {
        return this.state;
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getAreaCode() {
        return this.areaCode;
    }
    
    public void setDoor(final String door) {
        this.door = door;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setBuilding(final String building) {
        this.building = building;
    }
    
    public void setStreet(final String street) {
        this.street = street;
    }
    
    public void setLocality(final String locality) {
        this.locality = locality;
    }
    
    public void setWard(final String ward) {
        this.ward = ward;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }
    
    public void setState(final String state) {
        this.state = state;
    }
    
    public void setCountry(final String country) {
        this.country = country;
    }
    
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }
        final Address other = (Address)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$door = this.getDoor();
        final Object other$door = other.getDoor();
        Label_0065: {
            if (this$door == null) {
                if (other$door == null) {
                    break Label_0065;
                }
            }
            else if (this$door.equals(other$door)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0102: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0102;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$building = this.getBuilding();
        final Object other$building = other.getBuilding();
        Label_0139: {
            if (this$building == null) {
                if (other$building == null) {
                    break Label_0139;
                }
            }
            else if (this$building.equals(other$building)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$street = this.getStreet();
        final Object other$street = other.getStreet();
        Label_0176: {
            if (this$street == null) {
                if (other$street == null) {
                    break Label_0176;
                }
            }
            else if (this$street.equals(other$street)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$locality = this.getLocality();
        final Object other$locality = other.getLocality();
        Label_0213: {
            if (this$locality == null) {
                if (other$locality == null) {
                    break Label_0213;
                }
            }
            else if (this$locality.equals(other$locality)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$ward = this.getWard();
        final Object other$ward = other.getWard();
        Label_0250: {
            if (this$ward == null) {
                if (other$ward == null) {
                    break Label_0250;
                }
            }
            else if (this$ward.equals(other$ward)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        Label_0287: {
            if (this$city == null) {
                if (other$city == null) {
                    break Label_0287;
                }
            }
            else if (this$city.equals(other$city)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        Label_0324: {
            if (this$state == null) {
                if (other$state == null) {
                    break Label_0324;
                }
            }
            else if (this$state.equals(other$state)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        Label_0361: {
            if (this$country == null) {
                if (other$country == null) {
                    break Label_0361;
                }
            }
            else if (this$country.equals(other$country)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$areaCode = this.getAreaCode();
        final Object other$areaCode = other.getAreaCode();
        if (this$areaCode == null) {
            if (other$areaCode == null) {
                return true;
            }
        }
        else if (this$areaCode.equals(other$areaCode)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Address;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $door = this.getDoor();
        result = result * 59 + (($door == null) ? 43 : $door.hashCode());
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $building = this.getBuilding();
        result = result * 59 + (($building == null) ? 43 : $building.hashCode());
        final Object $street = this.getStreet();
        result = result * 59 + (($street == null) ? 43 : $street.hashCode());
        final Object $locality = this.getLocality();
        result = result * 59 + (($locality == null) ? 43 : $locality.hashCode());
        final Object $ward = this.getWard();
        result = result * 59 + (($ward == null) ? 43 : $ward.hashCode());
        final Object $city = this.getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        final Object $state = this.getState();
        result = result * 59 + (($state == null) ? 43 : $state.hashCode());
        final Object $country = this.getCountry();
        result = result * 59 + (($country == null) ? 43 : $country.hashCode());
        final Object $areaCode = this.getAreaCode();
        result = result * 59 + (($areaCode == null) ? 43 : $areaCode.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Address(door=" + this.getDoor() + ", name=" + this.getName() + ", building=" + this.getBuilding() + ", street=" + this.getStreet() + ", locality=" + this.getLocality() + ", ward=" + this.getWard() + ", city=" + this.getCity() + ", state=" + this.getState() + ", country=" + this.getCountry() + ", areaCode=" + this.getAreaCode() + ")";
    }
}
