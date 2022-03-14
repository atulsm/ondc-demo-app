// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tags
{
    @JsonProperty("additionalProp1")
    private String additionalProp1;
    @JsonProperty("additionalProp2")
    private String additionalProp2;
    @JsonProperty("additionalProp3")
    private String additionalProp3;
    
    public String getAdditionalProp1() {
        return this.additionalProp1;
    }
    
    public String getAdditionalProp2() {
        return this.additionalProp2;
    }
    
    public String getAdditionalProp3() {
        return this.additionalProp3;
    }
    
    @JsonProperty("additionalProp1")
    public void setAdditionalProp1(final String additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }
    
    @JsonProperty("additionalProp2")
    public void setAdditionalProp2(final String additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }
    
    @JsonProperty("additionalProp3")
    public void setAdditionalProp3(final String additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Tags)) {
            return false;
        }
        final Tags other = (Tags)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$additionalProp1 = this.getAdditionalProp1();
        final Object other$additionalProp1 = other.getAdditionalProp1();
        Label_0065: {
            if (this$additionalProp1 == null) {
                if (other$additionalProp1 == null) {
                    break Label_0065;
                }
            }
            else if (this$additionalProp1.equals(other$additionalProp1)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$additionalProp2 = this.getAdditionalProp2();
        final Object other$additionalProp2 = other.getAdditionalProp2();
        Label_0102: {
            if (this$additionalProp2 == null) {
                if (other$additionalProp2 == null) {
                    break Label_0102;
                }
            }
            else if (this$additionalProp2.equals(other$additionalProp2)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$additionalProp3 = this.getAdditionalProp3();
        final Object other$additionalProp3 = other.getAdditionalProp3();
        if (this$additionalProp3 == null) {
            if (other$additionalProp3 == null) {
                return true;
            }
        }
        else if (this$additionalProp3.equals(other$additionalProp3)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Tags;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $additionalProp1 = this.getAdditionalProp1();
        result = result * 59 + (($additionalProp1 == null) ? 43 : $additionalProp1.hashCode());
        final Object $additionalProp2 = this.getAdditionalProp2();
        result = result * 59 + (($additionalProp2 == null) ? 43 : $additionalProp2.hashCode());
        final Object $additionalProp3 = this.getAdditionalProp3();
        result = result * 59 + (($additionalProp3 == null) ? 43 : $additionalProp3.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Tags(additionalProp1=" + this.getAdditionalProp1() + ", additionalProp2=" + this.getAdditionalProp2() + ", additionalProp3=" + this.getAdditionalProp3() + ")";
    }
}
