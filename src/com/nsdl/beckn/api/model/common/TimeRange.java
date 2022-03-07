// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class TimeRange
{
    private String start;
    private String end;
    
    public String getStart() {
        return this.start;
    }
    
    public String getEnd() {
        return this.end;
    }
    
    public void setStart(final String start) {
        this.start = start;
    }
    
    public void setEnd(final String end) {
        this.end = end;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TimeRange)) {
            return false;
        }
        final TimeRange other = (TimeRange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$start = this.getStart();
        final Object other$start = other.getStart();
        Label_0065: {
            if (this$start == null) {
                if (other$start == null) {
                    break Label_0065;
                }
            }
            else if (this$start.equals(other$start)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$end = this.getEnd();
        final Object other$end = other.getEnd();
        if (this$end == null) {
            if (other$end == null) {
                return true;
            }
        }
        else if (this$end.equals(other$end)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof TimeRange;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $start = this.getStart();
        result = result * 59 + (($start == null) ? 43 : $start.hashCode());
        final Object $end = this.getEnd();
        result = result * 59 + (($end == null) ? 43 : $end.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "TimeRange(start=" + this.getStart() + ", end=" + this.getEnd() + ")";
    }
}
