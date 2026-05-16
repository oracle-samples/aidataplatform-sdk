// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Different types of filters
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FilterTypes.Builder.class)

public final class FilterTypes  {
    @Deprecated
    @java.beans.ConstructorProperties({"listFilters", "rangeFilters"})
    public FilterTypes(java.util.List<ListFilter> listFilters, java.util.List<RangeFilter> rangeFilters) {
        super();
        this.listFilters = listFilters;
        this.rangeFilters = rangeFilters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Provide the list of term filters
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("listFilters")
private java.util.List<ListFilter> listFilters;

        /**
         * Provide the list of term filters
         * @param listFilters the value to set
         * @return this builder
         **/
        

public Builder listFilters(java.util.List<ListFilter> listFilters) {
    this.listFilters = listFilters;
    return this;
}
            /**
     * Provide the list of range filters
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rangeFilters")
private java.util.List<RangeFilter> rangeFilters;

        /**
         * Provide the list of range filters
         * @param rangeFilters the value to set
         * @return this builder
         **/
        

public Builder rangeFilters(java.util.List<RangeFilter> rangeFilters) {
    this.rangeFilters = rangeFilters;
    return this;
}


        public FilterTypes build() {
            FilterTypes model = new FilterTypes(this.listFilters
                , this.rangeFilters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterTypes model) {
                this.listFilters(model.getListFilters());
    this.rangeFilters(model.getRangeFilters());
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
     * Provide the list of term filters
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("listFilters")
    private final java.util.List<ListFilter> listFilters;

        /**
     * Provide the list of term filters
     * @return the value
     **/
    
    public java.util.List<ListFilter> getListFilters() {
        return listFilters;
    }


        /**
     * Provide the list of range filters
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rangeFilters")
    private final java.util.List<RangeFilter> rangeFilters;

        /**
     * Provide the list of range filters
     * @return the value
     **/
    
    public java.util.List<RangeFilter> getRangeFilters() {
        return rangeFilters;
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
        sb.append("FilterTypes(");
        sb.append("listFilters=").append(String.valueOf(this.listFilters));
        sb.append(", rangeFilters=").append(String.valueOf(this.rangeFilters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterTypes)) {
            return false;
        }

        FilterTypes other = (FilterTypes) o;
        return java.util.Objects.equals(this.listFilters, other.listFilters) &&
            java.util.Objects.equals(this.rangeFilters, other.rangeFilters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.listFilters == null ? 43 : this.listFilters.hashCode());
        result = (result * PRIME) + (this.rangeFilters == null ? 43 : this.rangeFilters.hashCode());
        return result;
    }


}
