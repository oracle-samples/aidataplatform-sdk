// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DiscoverySelection.Builder.class)

public final class DiscoverySelection  {
    @Deprecated
    @java.beans.ConstructorProperties({"include", "exclude", "limit"})
    public DiscoverySelection(java.util.List<String> include, java.util.List<String> exclude, Integer limit) {
        super();
        this.include = include;
        this.exclude = exclude;
        this.limit = limit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("include")
private java.util.List<String> include;



public Builder include(java.util.List<String> include) {
    this.include = include;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("exclude")
private java.util.List<String> exclude;



public Builder exclude(java.util.List<String> exclude) {
    this.exclude = exclude;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("limit")
private Integer limit;



public Builder limit(Integer limit) {
    this.limit = limit;
    return this;
}


        public DiscoverySelection build() {
            DiscoverySelection model = new DiscoverySelection(this.include
                , this.exclude
                , this.limit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoverySelection model) {
                this.include(model.getInclude());
    this.exclude(model.getExclude());
    this.limit(model.getLimit());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("include")
    private final java.util.List<String> include;

    
    public java.util.List<String> getInclude() {
        return include;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    private final java.util.List<String> exclude;

    
    public java.util.List<String> getExclude() {
        return exclude;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    
    public Integer getLimit() {
        return limit;
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
        sb.append("DiscoverySelection(");
        sb.append("include=").append(String.valueOf(this.include));
        sb.append(", exclude=").append(String.valueOf(this.exclude));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoverySelection)) {
            return false;
        }

        DiscoverySelection other = (DiscoverySelection) o;
        return java.util.Objects.equals(this.include, other.include) &&
            java.util.Objects.equals(this.exclude, other.exclude) &&
            java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.include == null ? 43 : this.include.hashCode());
        result = (result * PRIME) + (this.exclude == null ? 43 : this.exclude.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }


}
