// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Collection of KnowledgeBase Job Run definitions.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseJobRunCollection.Builder.class)

public final class KnowledgeBaseJobRunCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public KnowledgeBaseJobRunCollection(java.util.List<KnowledgeBaseJobRunSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Array of KnowledgeBase Runs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<KnowledgeBaseJobRunSummary> items;

        /**
         * Array of KnowledgeBase Runs.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<KnowledgeBaseJobRunSummary> items) {
    this.items = items;
    return this;
}


        public KnowledgeBaseJobRunCollection build() {
            KnowledgeBaseJobRunCollection model = new KnowledgeBaseJobRunCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseJobRunCollection model) {
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
     * Array of KnowledgeBase Runs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<KnowledgeBaseJobRunSummary> items;

        /**
     * Array of KnowledgeBase Runs.
     * @return the value
     **/
    
    public java.util.List<KnowledgeBaseJobRunSummary> getItems() {
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
        sb.append("KnowledgeBaseJobRunCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseJobRunCollection)) {
            return false;
        }

        KnowledgeBaseJobRunCollection other = (KnowledgeBaseJobRunCollection) o;
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
