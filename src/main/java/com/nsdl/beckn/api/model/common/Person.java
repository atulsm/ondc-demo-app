// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

public class Person
{
    private String name;
    private String image;
    private String dob;
    private String gender;
    private String cred;
    private Tags tags;
    
    public String getName() {
        return this.name;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public String getDob() {
        return this.dob;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public String getCred() {
        return this.cred;
    }
    
    public Tags getTags() {
        return this.tags;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setImage(final String image) {
        this.image = image;
    }
    
    public void setDob(final String dob) {
        this.dob = dob;
    }
    
    public void setGender(final String gender) {
        this.gender = gender;
    }
    
    public void setCred(final String cred) {
        this.cred = cred;
    }
    
    public void setTags(final Tags tags) {
        this.tags = tags;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        final Person other = (Person)o;
        if (!other.canEqual(this)) {
            return false;
        }
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        Label_0065: {
            if (this$name == null) {
                if (other$name == null) {
                    break Label_0065;
                }
            }
            else if (this$name.equals(other$name)) {
                break Label_0065;
            }
            return false;
        }
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        Label_0102: {
            if (this$image == null) {
                if (other$image == null) {
                    break Label_0102;
                }
            }
            else if (this$image.equals(other$image)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$dob = this.getDob();
        final Object other$dob = other.getDob();
        Label_0139: {
            if (this$dob == null) {
                if (other$dob == null) {
                    break Label_0139;
                }
            }
            else if (this$dob.equals(other$dob)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        Label_0176: {
            if (this$gender == null) {
                if (other$gender == null) {
                    break Label_0176;
                }
            }
            else if (this$gender.equals(other$gender)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$cred = this.getCred();
        final Object other$cred = other.getCred();
        Label_0213: {
            if (this$cred == null) {
                if (other$cred == null) {
                    break Label_0213;
                }
            }
            else if (this$cred.equals(other$cred)) {
                break Label_0213;
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
        return other instanceof Person;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $image = this.getImage();
        result = result * 59 + (($image == null) ? 43 : $image.hashCode());
        final Object $dob = this.getDob();
        result = result * 59 + (($dob == null) ? 43 : $dob.hashCode());
        final Object $gender = this.getGender();
        result = result * 59 + (($gender == null) ? 43 : $gender.hashCode());
        final Object $cred = this.getCred();
        result = result * 59 + (($cred == null) ? 43 : $cred.hashCode());
        final Object $tags = this.getTags();
        result = result * 59 + (($tags == null) ? 43 : $tags.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Person(name=" + this.getName() + ", image=" + this.getImage() + ", dob=" + this.getDob() + ", gender=" + this.getGender() + ", cred=" + this.getCred() + ", tags=" + this.getTags() + ")";
    }
}
