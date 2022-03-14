// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Time
{
    private String label;
    private String timestamp;
    private String duration;
    private TimeRange range;
    private String days;
    
    public String getLabel() {
        return this.label;
    }
    
    public String getTimestamp() {
        return this.timestamp;
    }
    
    public String getDuration() {
        return this.duration;
    }
    
    public TimeRange getRange() {
        return this.range;
    }
    
    public String getDays() {
        return this.days;
    }
    
    public void setLabel(final String label) {
        this.label = label;
    }
    
    public void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }
    
    public void setDuration(final String duration) {
        this.duration = duration;
    }
    
    public void setRange(final TimeRange range) {
        this.range = range;
    }
    
    public void setDays(final String days) {
        this.days = days;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Time)) {
            return false;
        }
        final Time other = (Time)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        Label_0065: {
            if (this$label == null) {
                if (other$label == null) {
                    break Label_0065;
                }
            }
            else if (this$label.equals(other$label)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        Label_0102: {
            if (this$timestamp == null) {
                if (other$timestamp == null) {
                    break Label_0102;
                }
            }
            else if (this$timestamp.equals(other$timestamp)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$duration = this.getDuration();
        final Object other$duration = other.getDuration();
        Label_0139: {
            if (this$duration == null) {
                if (other$duration == null) {
                    break Label_0139;
                }
            }
            else if (this$duration.equals(other$duration)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$range = this.getRange();
        final Object other$range = other.getRange();
        Label_0176: {
            if (this$range == null) {
                if (other$range == null) {
                    break Label_0176;
                }
            }
            else if (this$range.equals(other$range)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$days = this.getDays();
        final Object other$days = other.getDays();
        if (this$days == null) {
            if (other$days == null) {
                return true;
            }
        }
        else if (this$days.equals(other$days)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Time;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * 59 + (($label == null) ? 43 : $label.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * 59 + (($timestamp == null) ? 43 : $timestamp.hashCode());
        final Object $duration = this.getDuration();
        result = result * 59 + (($duration == null) ? 43 : $duration.hashCode());
        final Object $range = this.getRange();
        result = result * 59 + (($range == null) ? 43 : $range.hashCode());
        final Object $days = this.getDays();
        result = result * 59 + (($days == null) ? 43 : $days.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Time(label=" + this.getLabel() + ", timestamp=" + this.getTimestamp() + ", duration=" + this.getDuration() + ", range=" + this.getRange() + ", days=" + this.getDays() + ")";
    }
}
