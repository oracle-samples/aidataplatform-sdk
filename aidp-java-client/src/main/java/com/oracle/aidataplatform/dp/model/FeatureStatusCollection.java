// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Model representing the response for checking the statuses of features.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FeatureStatusCollection.Builder.class)

public final class FeatureStatusCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public FeatureStatusCollection(java.util.List<FeatureStatusSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of features.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<FeatureStatusSummary> items;

        /**
         * List of features.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<FeatureStatusSummary> items) {
    this.items = items;
    return this;
}


        public FeatureStatusCollection build() {
            FeatureStatusCollection model = new FeatureStatusCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FeatureStatusCollection model) {
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
     * List of features.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<FeatureStatusSummary> items;

        /**
     * List of features.
     * @return the value
     **/
    
    public java.util.List<FeatureStatusSummary> getItems() {
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
        sb.append("FeatureStatusCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeatureStatusCollection)) {
            return false;
        }

        FeatureStatusCollection other = (FeatureStatusCollection) o;
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
