// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Catalog
{
    @JsonProperty("bpp/descriptor")
    private Descriptor bppDescriptor;
    @JsonProperty("bpp/categories")
    private List<Category> bppCategories;
    @JsonProperty("bpp/fulfillments")
    private List<Fulfillment> bppFulfillments;
    @JsonProperty("bpp/payments")
    private List<Payment> bppPayments;
    @JsonProperty("bpp/offers")
    private List<Offer> bppOffers;
    @JsonProperty("bpp/providers")
    private List<Provider> bppProviders;
    private String exp;
    
    public Descriptor getBppDescriptor() {
        return this.bppDescriptor;
    }
    
    public List<Category> getBppCategories() {
        return this.bppCategories;
    }
    
    public List<Fulfillment> getBppFulfillments() {
        return this.bppFulfillments;
    }
    
    public List<Payment> getBppPayments() {
        return this.bppPayments;
    }
    
    public List<Offer> getBppOffers() {
        return this.bppOffers;
    }
    
    public List<Provider> getBppProviders() {
        return this.bppProviders;
    }
    
    public String getExp() {
        return this.exp;
    }
    
    @JsonProperty("bpp/descriptor")
    public void setBppDescriptor(final Descriptor bppDescriptor) {
        this.bppDescriptor = bppDescriptor;
    }
    
    @JsonProperty("bpp/categories")
    public void setBppCategories(final List<Category> bppCategories) {
        this.bppCategories = bppCategories;
    }
    
    @JsonProperty("bpp/fulfillments")
    public void setBppFulfillments(final List<Fulfillment> bppFulfillments) {
        this.bppFulfillments = bppFulfillments;
    }
    
    @JsonProperty("bpp/payments")
    public void setBppPayments(final List<Payment> bppPayments) {
        this.bppPayments = bppPayments;
    }
    
    @JsonProperty("bpp/offers")
    public void setBppOffers(final List<Offer> bppOffers) {
        this.bppOffers = bppOffers;
    }
    
    @JsonProperty("bpp/providers")
    public void setBppProviders(final List<Provider> bppProviders) {
        this.bppProviders = bppProviders;
    }
    
    public void setExp(final String exp) {
        this.exp = exp;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Catalog)) {
            return false;
        }
        final Catalog other = (Catalog)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$bppDescriptor = this.getBppDescriptor();
        final Object other$bppDescriptor = other.getBppDescriptor();
        Label_0065: {
            if (this$bppDescriptor == null) {
                if (other$bppDescriptor == null) {
                    break Label_0065;
                }
            }
            else if (this$bppDescriptor.equals(other$bppDescriptor)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$bppCategories = this.getBppCategories();
        final Object other$bppCategories = other.getBppCategories();
        Label_0102: {
            if (this$bppCategories == null) {
                if (other$bppCategories == null) {
                    break Label_0102;
                }
            }
            else if (this$bppCategories.equals(other$bppCategories)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$bppFulfillments = this.getBppFulfillments();
        final Object other$bppFulfillments = other.getBppFulfillments();
        Label_0139: {
            if (this$bppFulfillments == null) {
                if (other$bppFulfillments == null) {
                    break Label_0139;
                }
            }
            else if (this$bppFulfillments.equals(other$bppFulfillments)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$bppPayments = this.getBppPayments();
        final Object other$bppPayments = other.getBppPayments();
        Label_0176: {
            if (this$bppPayments == null) {
                if (other$bppPayments == null) {
                    break Label_0176;
                }
            }
            else if (this$bppPayments.equals(other$bppPayments)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$bppOffers = this.getBppOffers();
        final Object other$bppOffers = other.getBppOffers();
        Label_0213: {
            if (this$bppOffers == null) {
                if (other$bppOffers == null) {
                    break Label_0213;
                }
            }
            else if (this$bppOffers.equals(other$bppOffers)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$bppProviders = this.getBppProviders();
        final Object other$bppProviders = other.getBppProviders();
        Label_0250: {
            if (this$bppProviders == null) {
                if (other$bppProviders == null) {
                    break Label_0250;
                }
            }
            else if (this$bppProviders.equals(other$bppProviders)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$exp = this.getExp();
        final Object other$exp = other.getExp();
        if (this$exp == null) {
            if (other$exp == null) {
                return true;
            }
        }
        else if (this$exp.equals(other$exp)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Catalog;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bppDescriptor = this.getBppDescriptor();
        result = result * 59 + (($bppDescriptor == null) ? 43 : $bppDescriptor.hashCode());
        final Object $bppCategories = this.getBppCategories();
        result = result * 59 + (($bppCategories == null) ? 43 : $bppCategories.hashCode());
        final Object $bppFulfillments = this.getBppFulfillments();
        result = result * 59 + (($bppFulfillments == null) ? 43 : $bppFulfillments.hashCode());
        final Object $bppPayments = this.getBppPayments();
        result = result * 59 + (($bppPayments == null) ? 43 : $bppPayments.hashCode());
        final Object $bppOffers = this.getBppOffers();
        result = result * 59 + (($bppOffers == null) ? 43 : $bppOffers.hashCode());
        final Object $bppProviders = this.getBppProviders();
        result = result * 59 + (($bppProviders == null) ? 43 : $bppProviders.hashCode());
        final Object $exp = this.getExp();
        result = result * 59 + (($exp == null) ? 43 : $exp.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Catalog(bppDescriptor=" + this.getBppDescriptor() + ", bppCategories=" + this.getBppCategories() + ", bppFulfillments=" + this.getBppFulfillments() + ", bppPayments=" + this.getBppPayments() + ", bppOffers=" + this.getBppOffers() + ", bppProviders=" + this.getBppProviders() + ", exp=" + this.getExp() + ")";
    }
}
