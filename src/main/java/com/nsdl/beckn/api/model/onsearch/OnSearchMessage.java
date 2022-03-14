// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.onsearch;

import com.nsdl.beckn.api.model.common.Catalog;

public class OnSearchMessage
{
    private Catalog catalog;
    
    public Catalog getCatalog() {
        return this.catalog;
    }
    
    public void setCatalog(final Catalog catalog) {
        this.catalog = catalog;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OnSearchMessage)) {
            return false;
        }
        final OnSearchMessage other = (OnSearchMessage)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$catalog = this.getCatalog();
        final Object other$catalog = other.getCatalog();
        if (this$catalog == null) {
            if (other$catalog == null) {
                return true;
            }
        }
        else if (this$catalog.equals(other$catalog)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof OnSearchMessage;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $catalog = this.getCatalog();
        result = result * 59 + (($catalog == null) ? 43 : $catalog.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "OnSearchMessage(catalog=" + this.getCatalog() + ")";
    }
}
