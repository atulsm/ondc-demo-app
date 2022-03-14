// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Fulfillment
{
    private String id;
    private String type;
    private String providerId;
    private State state;
    private boolean tracking;
    private Object customer;
    private Agent agent;
    private Vehicle vehicle;
    private Start start;
    private End end;
    private Tags tags;
    
    public String getId() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getProviderId() {
        return this.providerId;
    }
    
    public State getState() {
        return this.state;
    }
    
    public boolean isTracking() {
        return this.tracking;
    }
    
    public Object getCustomer() {
        return this.customer;
    }
    
    public Agent getAgent() {
        return this.agent;
    }
    
    public Vehicle getVehicle() {
        return this.vehicle;
    }
    
    public Start getStart() {
        return this.start;
    }
    
    public End getEnd() {
        return this.end;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setId(final String id) {
        this.id = id;
    }
    
    public void setType(final String type) {
        this.type = type;
    }
    
    public void setProviderId(final String providerId) {
        this.providerId = providerId;
    }
    
    public void setState(final State state) {
        this.state = state;
    }
    
    public void setTracking(final boolean tracking) {
        this.tracking = tracking;
    }
    
    public void setCustomer(final Object customer) {
        this.customer = customer;
    }
    
    public void setAgent(final Agent agent) {
        this.agent = agent;
    }
    
    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void setStart(final Start start) {
        this.start = start;
    }
    
    public void setEnd(final End end) {
        this.end = end;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Fulfillment)) {
            return false;
        }
        final Fulfillment other = (Fulfillment)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isTracking() != other.isTracking()) {
            return false;
        }
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        Label_0078: {
            if (this$id == null) {
                if (other$id == null) {
                    break Label_0078;
                }
            }
            else if (this$id.equals(other$id)) {
                break Label_0078;
            }
            return false;
        }
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        Label_0115: {
            if (this$type == null) {
                if (other$type == null) {
                    break Label_0115;
                }
            }
            else if (this$type.equals(other$type)) {
                break Label_0115;
            }
            return false;
        }
        final Object this$providerId = this.getProviderId();
        final Object other$providerId = other.getProviderId();
        Label_0152: {
            if (this$providerId == null) {
                if (other$providerId == null) {
                    break Label_0152;
                }
            }
            else if (this$providerId.equals(other$providerId)) {
                break Label_0152;
            }
            return false;
        }
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        Label_0189: {
            if (this$state == null) {
                if (other$state == null) {
                    break Label_0189;
                }
            }
            else if (this$state.equals(other$state)) {
                break Label_0189;
            }
            return false;
        }
        final Object this$customer = this.getCustomer();
        final Object other$customer = other.getCustomer();
        Label_0226: {
            if (this$customer == null) {
                if (other$customer == null) {
                    break Label_0226;
                }
            }
            else if (this$customer.equals(other$customer)) {
                break Label_0226;
            }
            return false;
        }
        final Object this$agent = this.getAgent();
        final Object other$agent = other.getAgent();
        Label_0263: {
            if (this$agent == null) {
                if (other$agent == null) {
                    break Label_0263;
                }
            }
            else if (this$agent.equals(other$agent)) {
                break Label_0263;
            }
            return false;
        }
        final Object this$vehicle = this.getVehicle();
        final Object other$vehicle = other.getVehicle();
        Label_0300: {
            if (this$vehicle == null) {
                if (other$vehicle == null) {
                    break Label_0300;
                }
            }
            else if (this$vehicle.equals(other$vehicle)) {
                break Label_0300;
            }
            return false;
        }
        final Object this$start = this.getStart();
        final Object other$start = other.getStart();
        Label_0337: {
            if (this$start == null) {
                if (other$start == null) {
                    break Label_0337;
                }
            }
            else if (this$start.equals(other$start)) {
                break Label_0337;
            }
            return false;
        }
        final Object this$end = this.getEnd();
        final Object other$end = other.getEnd();
        Label_0374: {
            if (this$end == null) {
                if (other$end == null) {
                    break Label_0374;
                }
            }
            else if (this$end.equals(other$end)) {
                break Label_0374;
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
        return other instanceof Fulfillment;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isTracking() ? 79 : 97);
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $type = this.getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        final Object $providerId = this.getProviderId();
        result = result * 59 + (($providerId == null) ? 43 : $providerId.hashCode());
        final Object $state = this.getState();
        result = result * 59 + (($state == null) ? 43 : $state.hashCode());
        final Object $customer = this.getCustomer();
        result = result * 59 + (($customer == null) ? 43 : $customer.hashCode());
        final Object $agent = this.getAgent();
        result = result * 59 + (($agent == null) ? 43 : $agent.hashCode());
        final Object $vehicle = this.getVehicle();
        result = result * 59 + (($vehicle == null) ? 43 : $vehicle.hashCode());
        final Object $start = this.getStart();
        result = result * 59 + (($start == null) ? 43 : $start.hashCode());
        final Object $end = this.getEnd();
        result = result * 59 + (($end == null) ? 43 : $end.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Fulfillment(id=" + this.getId() + ", type=" + this.getType() + ", providerId=" + this.getProviderId() + ", state=" + this.getState() + ", tracking=" + this.isTracking() + ", customer=" + this.getCustomer() + ", agent=" + this.getAgent() + ", vehicle=" + this.getVehicle() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ", tags=" + this.getTags() + ")";
    }
}
