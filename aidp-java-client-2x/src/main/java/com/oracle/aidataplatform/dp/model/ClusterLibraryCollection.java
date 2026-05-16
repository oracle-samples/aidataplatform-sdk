// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * List of cluster libraries.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterLibraryCollection.Builder.class)

public final class ClusterLibraryCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public ClusterLibraryCollection(java.util.List<ClusterLibrarySummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of cluster libraries.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ClusterLibrarySummary> items;

                /**
         * List of cluster libraries.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<ClusterLibrarySummary> items) {
        this.items = items;
        return this;
        }


        public ClusterLibraryCollection build() {
            ClusterLibraryCollection model = new ClusterLibraryCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterLibraryCollection model) {
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
     * List of cluster libraries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ClusterLibrarySummary> items;

        /**
     * List of cluster libraries.
     * @return the value
     **/
    
    public java.util.List<ClusterLibrarySummary> getItems() {
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
        sb.append("ClusterLibraryCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterLibraryCollection)) {
            return false;
        }

        ClusterLibraryCollection other = (ClusterLibraryCollection) o;
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
