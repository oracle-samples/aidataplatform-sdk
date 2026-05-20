// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing Master Catalogs
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MasterCatalogCollection.Builder.class)

public final class MasterCatalogCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public MasterCatalogCollection(java.util.List<MasterCatalogSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of Master Catalogs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<MasterCatalogSummary> items;

        /**
         * List of Master Catalogs.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<MasterCatalogSummary> items) {
    this.items = items;
    return this;
}


        public MasterCatalogCollection build() {
            MasterCatalogCollection model = new MasterCatalogCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MasterCatalogCollection model) {
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
     * List of Master Catalogs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<MasterCatalogSummary> items;

        /**
     * List of Master Catalogs.
     * @return the value
     **/
    
    public java.util.List<MasterCatalogSummary> getItems() {
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
        sb.append("MasterCatalogCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MasterCatalogCollection)) {
            return false;
        }

        MasterCatalogCollection other = (MasterCatalogCollection) o;
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
