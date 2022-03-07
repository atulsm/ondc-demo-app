// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class End
{
    private Location location;
    private Time time;
    private Descriptor instructions;
    private Contact contact;
    private Person person;
    
    public Location getLocation() {
        return this.location;
    }
    
    public Time getTime() {
        return this.time;
    }
    
    public Descriptor getInstructions() {
        return this.instructions;
    }
    
    public Contact getContact() {
        return this.contact;
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    public void setLocation(final Location location) {
        this.location = location;
    }
    
    public void setTime(final Time time) {
        this.time = time;
    }
    
    public void setInstructions(final Descriptor instructions) {
        this.instructions = instructions;
    }
    
    public void setContact(final Contact contact) {
        this.contact = contact;
    }
    
    public void setPerson(final Person person) {
        this.person = person;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof End)) {
            return false;
        }
        final End other = (End)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$location = this.getLocation();
        final Object other$location = other.getLocation();
        Label_0065: {
            if (this$location == null) {
                if (other$location == null) {
                    break Label_0065;
                }
            }
            else if (this$location.equals(other$location)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$time = this.getTime();
        final Object other$time = other.getTime();
        Label_0102: {
            if (this$time == null) {
                if (other$time == null) {
                    break Label_0102;
                }
            }
            else if (this$time.equals(other$time)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$instructions = this.getInstructions();
        final Object other$instructions = other.getInstructions();
        Label_0139: {
            if (this$instructions == null) {
                if (other$instructions == null) {
                    break Label_0139;
                }
            }
            else if (this$instructions.equals(other$instructions)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$contact = this.getContact();
        final Object other$contact = other.getContact();
        Label_0176: {
            if (this$contact == null) {
                if (other$contact == null) {
                    break Label_0176;
                }
            }
            else if (this$contact.equals(other$contact)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$person = this.getPerson();
        final Object other$person = other.getPerson();
        if (this$person == null) {
            if (other$person == null) {
                return true;
            }
        }
        else if (this$person.equals(other$person)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof End;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $location = this.getLocation();
        result = result * 59 + (($location == null) ? 43 : $location.hashCode());
        final Object $time = this.getTime();
        result = result * 59 + (($time == null) ? 43 : $time.hashCode());
        final Object $instructions = this.getInstructions();
        result = result * 59 + (($instructions == null) ? 43 : $instructions.hashCode());
        final Object $contact = this.getContact();
        result = result * 59 + (($contact == null) ? 43 : $contact.hashCode());
        final Object $person = this.getPerson();
        result = result * 59 + (($person == null) ? 43 : $person.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "End(location=" + this.getLocation() + ", time=" + this.getTime() + ", instructions=" + this.getInstructions() + ", contact=" + this.getContact() + ", person=" + this.getPerson() + ")";
    }
}
