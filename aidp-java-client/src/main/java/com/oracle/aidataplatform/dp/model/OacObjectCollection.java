// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Oracle Analytics objects returned by external catalog browse and listing APIs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectCollection.Builder.class)

public final class OacObjectCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public OacObjectCollection(java.util.List<OacObjectSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Oracle Analytics objects returned for the request.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<OacObjectSummary> items;

        /**
         * The Oracle Analytics objects returned for the request.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<OacObjectSummary> items) {
    this.items = items;
    return this;
}


        public OacObjectCollection build() {
            OacObjectCollection model = new OacObjectCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectCollection model) {
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
     * The Oracle Analytics objects returned for the request.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<OacObjectSummary> items;

        /**
     * The Oracle Analytics objects returned for the request.
     * @return the value
     **/
    
    public java.util.List<OacObjectSummary> getItems() {
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
        sb.append("OacObjectCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectCollection)) {
            return false;
        }

        OacObjectCollection other = (OacObjectCollection) o;
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
