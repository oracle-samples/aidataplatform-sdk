// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DiscoveryOptions.Builder.class)

public final class DiscoveryOptions  {
    @Deprecated
    @java.beans.ConstructorProperties({"emitOwl", "emitRml"})
    public DiscoveryOptions(Boolean emitOwl, Boolean emitRml) {
        super();
        this.emitOwl = emitOwl;
        this.emitRml = emitRml;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("emitOwl")
private Boolean emitOwl;



public Builder emitOwl(Boolean emitOwl) {
    this.emitOwl = emitOwl;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("emitRml")
private Boolean emitRml;



public Builder emitRml(Boolean emitRml) {
    this.emitRml = emitRml;
    return this;
}


        public DiscoveryOptions build() {
            DiscoveryOptions model = new DiscoveryOptions(this.emitOwl
                , this.emitRml);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryOptions model) {
                this.emitOwl(model.getEmitOwl());
    this.emitRml(model.getEmitRml());
return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }


    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("emitOwl")
    private final Boolean emitOwl;

    
    public Boolean getEmitOwl() {
        return emitOwl;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("emitRml")
    private final Boolean emitRml;

    
    public Boolean getEmitRml() {
        return emitRml;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DiscoveryOptions(");
        sb.append("emitOwl=").append(String.valueOf(this.emitOwl));
        sb.append(", emitRml=").append(String.valueOf(this.emitRml));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryOptions)) {
            return false;
        }

        DiscoveryOptions other = (DiscoveryOptions) o;
        return java.util.Objects.equals(this.emitOwl, other.emitOwl) &&
            java.util.Objects.equals(this.emitRml, other.emitRml);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.emitOwl == null ? 43 : this.emitOwl.hashCode());
        result = (result * PRIME) + (this.emitRml == null ? 43 : this.emitRml.hashCode());
        return result;
    }


}
