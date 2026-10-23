// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Collection of imported run events.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageImportRunEventCollection.Builder.class)

public final class LineageImportRunEventCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public LineageImportRunEventCollection(java.util.List<LineageImportRunEventSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Run events in the current page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<LineageImportRunEventSummary> items;

        /**
         * Run events in the current page.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<LineageImportRunEventSummary> items) {
    this.items = items;
    return this;
}


        public LineageImportRunEventCollection build() {
            LineageImportRunEventCollection model = new LineageImportRunEventCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageImportRunEventCollection model) {
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
     * Run events in the current page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<LineageImportRunEventSummary> items;

        /**
     * Run events in the current page.
     * @return the value
     **/
    
    public java.util.List<LineageImportRunEventSummary> getItems() {
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
        sb.append("LineageImportRunEventCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageImportRunEventCollection)) {
            return false;
        }

        LineageImportRunEventCollection other = (LineageImportRunEventCollection) o;
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
