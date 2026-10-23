// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A page of Git connectivity profile summaries.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PrivateNetworkProfileCollection.Builder.class)

public final class PrivateNetworkProfileCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public PrivateNetworkProfileCollection(java.util.List<PrivateNetworkProfileSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Git connectivity profile summaries.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<PrivateNetworkProfileSummary> items;

        /**
         * Git connectivity profile summaries.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<PrivateNetworkProfileSummary> items) {
    this.items = items;
    return this;
}


        public PrivateNetworkProfileCollection build() {
            PrivateNetworkProfileCollection model = new PrivateNetworkProfileCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateNetworkProfileCollection model) {
                this.items(model.getItems());
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

    


        /**
     * Git connectivity profile summaries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PrivateNetworkProfileSummary> items;

        /**
     * Git connectivity profile summaries.
     * @return the value
     **/
    
    public java.util.List<PrivateNetworkProfileSummary> getItems() {
        return items;
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
        sb.append("PrivateNetworkProfileCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateNetworkProfileCollection)) {
            return false;
        }

        PrivateNetworkProfileCollection other = (PrivateNetworkProfileCollection) o;
        return java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
