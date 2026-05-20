// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Search results for audit log search request.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AuditLogSearchResultCollection.Builder.class)

public final class AuditLogSearchResultCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public AuditLogSearchResultCollection(java.util.List<AuditLogSearchResultSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Audit log search results.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AuditLogSearchResultSummary> items;

                /**
         * Audit log search results.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<AuditLogSearchResultSummary> items) {
        this.items = items;
        return this;
        }


        public AuditLogSearchResultCollection build() {
            AuditLogSearchResultCollection model = new AuditLogSearchResultCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditLogSearchResultCollection model) {
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
     * Audit log search results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AuditLogSearchResultSummary> items;

        /**
     * Audit log search results.
     * @return the value
     **/
    
    public java.util.List<AuditLogSearchResultSummary> getItems() {
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
        sb.append("AuditLogSearchResultCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditLogSearchResultCollection)) {
            return false;
        }

        AuditLogSearchResultCollection other = (AuditLogSearchResultCollection) o;
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
