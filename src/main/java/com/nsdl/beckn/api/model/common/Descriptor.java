// 
// Decompiled by Procyon v0.5.36
// 

package com.nsdl.beckn.api.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Descriptor
{
    private String name;
    private String code;
    private String symbol;
    private String shortDesc;
    private String longDesc;
    private List<String> images;
    private String audio;
    @JsonProperty("3d_render")
    private String render3D;
    
    public String getName() {
        return this.name;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public String getShortDesc() {
        return this.shortDesc;
    }
    
    public String getLongDesc() {
        return this.longDesc;
    }
    
    public List<String> getImages() {
        return this.images;
    }
    
    public String getAudio() {
        return this.audio;
    }
    
    public String getRender3D() {
        return this.render3D;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setSymbol(final String symbol) {
        this.symbol = symbol;
    }
    
    public void setShortDesc(final String shortDesc) {
        this.shortDesc = shortDesc;
    }
    
    public void setLongDesc(final String longDesc) {
        this.longDesc = longDesc;
    }
    
    public void setImages(final List<String> images) {
        this.images = images;
    }
    
    public void setAudio(final String audio) {
        this.audio = audio;
    }
    
    @JsonProperty("3d_render")
    public void setRender3D(final String render3D) {
        this.render3D = render3D;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Descriptor)) {
            return false;
        }
        final Descriptor other = (Descriptor)o;
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
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        Label_0102: {
            if (this$code == null) {
                if (other$code == null) {
                    break Label_0102;
                }
            }
            else if (this$code.equals(other$code)) {
                break Label_0102;
            }
            return false;
        }
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        Label_0139: {
            if (this$symbol == null) {
                if (other$symbol == null) {
                    break Label_0139;
                }
            }
            else if (this$symbol.equals(other$symbol)) {
                break Label_0139;
            }
            return false;
        }
        final Object this$shortDesc = this.getShortDesc();
        final Object other$shortDesc = other.getShortDesc();
        Label_0176: {
            if (this$shortDesc == null) {
                if (other$shortDesc == null) {
                    break Label_0176;
                }
            }
            else if (this$shortDesc.equals(other$shortDesc)) {
                break Label_0176;
            }
            return false;
        }
        final Object this$longDesc = this.getLongDesc();
        final Object other$longDesc = other.getLongDesc();
        Label_0213: {
            if (this$longDesc == null) {
                if (other$longDesc == null) {
                    break Label_0213;
                }
            }
            else if (this$longDesc.equals(other$longDesc)) {
                break Label_0213;
            }
            return false;
        }
        final Object this$images = this.getImages();
        final Object other$images = other.getImages();
        Label_0250: {
            if (this$images == null) {
                if (other$images == null) {
                    break Label_0250;
                }
            }
            else if (this$images.equals(other$images)) {
                break Label_0250;
            }
            return false;
        }
        final Object this$audio = this.getAudio();
        final Object other$audio = other.getAudio();
        Label_0287: {
            if (this$audio == null) {
                if (other$audio == null) {
                    break Label_0287;
                }
            }
            else if (this$audio.equals(other$audio)) {
                break Label_0287;
            }
            return false;
        }
        final Object this$render3D = this.getRender3D();
        final Object other$render3D = other.getRender3D();
        if (this$render3D == null) {
            if (other$render3D == null) {
                return true;
            }
        }
        else if (this$render3D.equals(other$render3D)) {
            return true;
        }
        return false;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Descriptor;
    }
    
    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * 59 + (($symbol == null) ? 43 : $symbol.hashCode());
        final Object $shortDesc = this.getShortDesc();
        result = result * 59 + (($shortDesc == null) ? 43 : $shortDesc.hashCode());
        final Object $longDesc = this.getLongDesc();
        result = result * 59 + (($longDesc == null) ? 43 : $longDesc.hashCode());
        final Object $images = this.getImages();
        result = result * 59 + (($images == null) ? 43 : $images.hashCode());
        final Object $audio = this.getAudio();
        result = result * 59 + (($audio == null) ? 43 : $audio.hashCode());
        final Object $render3D = this.getRender3D();
        result = result * 59 + (($render3D == null) ? 43 : $render3D.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Descriptor(name=" + this.getName() + ", code=" + this.getCode() + ", symbol=" + this.getSymbol() + ", shortDesc=" + this.getShortDesc() + ", longDesc=" + this.getLongDesc() + ", images=" + this.getImages() + ", audio=" + this.getAudio() + ", render3D=" + this.getRender3D() + ")";
    }
}
