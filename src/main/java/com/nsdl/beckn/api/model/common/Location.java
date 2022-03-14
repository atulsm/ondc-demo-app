// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location
{
    private String id;
    private Descriptor descriptor;
    private String gps;
    private Address address;
    private String stationCode;
    private City city;
    private Country country;
    private String circle;
    private String polygon;
    @JsonProperty("3dspace")
    private String space3D;
    private Time time;
    
    public String getId() {
        return this.id;
    }
    
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
    
    public String getGps() {
        return this.gps;
    }
    
    public Address getAddress() {
        return this.address;
    }
    
    public String getStationCode() {
        return this.stationCode;
    }
    
    public City getCity() {
        return this.city;
    }
    
    public Country getCountry() {
        return this.country;
    }
    
    public String getCircle() {
        return this.circle;
    }
    
    public String getPolygon() {
        return this.polygon;
    }
    
    public String getSpace3D() {
        return this.space3D;
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
    
    public void setGps(final String gps) {
        this.gps = gps;
    }
    
    public void setAddress(final Address address) {
        this.address = address;
    }
    
    public void setStationCode(final String stationCode) {
        this.stationCode = stationCode;
    }
    
    public void setCity(final City city) {
        this.city = city;
    }
    
    public void setCountry(final Country country) {
        this.country = country;
    }
    
    public void setCircle(final String circle) {
        this.circle = circle;
    }
    
    public void setPolygon(final String polygon) {
        this.polygon = polygon;
    }
    
    @JsonProperty("3dspace")
    public void setSpace3D(final String space3D) {
        this.space3D = space3D;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Location)) {
            return false;
        }
        final Location other = (Location)o;
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
        final Object this$gps = this.getGps();
        final Object other$gps = other.getGps();
        Label_0139: {
            if (this$gps == null) {
                if (other$gps == null) {
                    break Label_0139;
                }
            }
            else if (this$gps.equals(other$gps)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        Label_0176: {
            if (this$address == null) {
                if (other$address == null) {
                    break Label_0176;
                }
            }
            else if (this$address.equals(other$address)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$stationCode = this.getStationCode();
        final Object other$stationCode = other.getStationCode();
        Label_0213: {
            if (this$stationCode == null) {
                if (other$stationCode == null) {
                    break Label_0213;
                }
            }
            else if (this$stationCode.equals(other$stationCode)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        Label_0250: {
            if (this$city == null) {
                if (other$city == null) {
                    break Label_0250;
                }
            }
            else if (this$city.equals(other$city)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        Label_0287: {
            if (this$country == null) {
                if (other$country == null) {
                    break Label_0287;
                }
            }
            else if (this$country.equals(other$country)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$circle = this.getCircle();
        final Object other$circle = other.getCircle();
        Label_0324: {
            if (this$circle == null) {
                if (other$circle == null) {
                    break Label_0324;
                }
            }
            else if (this$circle.equals(other$circle)) {
                break Label_0324;
            }
            return false;
        }
        final Object this$polygon = this.getPolygon();
        final Object other$polygon = other.getPolygon();
        Label_0361: {
            if (this$polygon == null) {
                if (other$polygon == null) {
                    break Label_0361;
                }
            }
            else if (this$polygon.equals(other$polygon)) {
                break Label_0361;
            }
            return false;
        }
        final Object this$space3D = this.getSpace3D();
        final Object other$space3D = other.getSpace3D();
        Label_0398: {
            if (this$space3D == null) {
                if (other$space3D == null) {
                    break Label_0398;
                }
            }
            else if (this$space3D.equals(other$space3D)) {
                break Label_0398;
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
        return other instanceof Location;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $descriptor = this.getDescriptor();
        result = result * 59 + (($descriptor == null) ? 43 : $descriptor.hashCode());
        final Object $gps = this.getGps();
        result = result * 59 + (($gps == null) ? 43 : $gps.hashCode());
        final Object $address = this.getAddress();
        result = result * 59 + (($address == null) ? 43 : $address.hashCode());
        final Object $stationCode = this.getStationCode();
        result = result * 59 + (($stationCode == null) ? 43 : $stationCode.hashCode());
        final Object $city = this.getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        final Object $country = this.getCountry();
        result = result * 59 + (($country == null) ? 43 : $country.hashCode());
        final Object $circle = this.getCircle();
        result = result * 59 + (($circle == null) ? 43 : $circle.hashCode());
        final Object $polygon = this.getPolygon();
        result = result * 59 + (($polygon == null) ? 43 : $polygon.hashCode());
        final Object $space3D = this.getSpace3D();
        result = result * 59 + (($space3D == null) ? 43 : $space3D.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Location(id=" + this.getId() + ", descriptor=" + this.getDescriptor() + ", gps=" + this.getGps() + ", address=" + this.getAddress() + ", stationCode=" + this.getStationCode() + ", city=" + this.getCity() + ", country=" + this.getCountry() + ", circle=" + this.getCircle() + ", polygon=" + this.getPolygon() + ", space3D=" + this.getSpace3D() + ", time=" + this.getTime() + ")";
    }
}
