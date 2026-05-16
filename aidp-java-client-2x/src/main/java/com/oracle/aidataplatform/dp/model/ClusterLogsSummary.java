// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Response payload containing search results and metadata.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterLogsSummary.Builder.class)

public final class ClusterLogsSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"fields", "results", "summary"})
    public ClusterLogsSummary(java.util.List<FieldInfo> fields, java.util.List<SearchResult> results, SearchResultSummary summary) {
        super();
        this.fields = fields;
        this.results = results;
        this.summary = summary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of log field schema information.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<FieldInfo> fields;

                /**
         * List of log field schema information.
         * @param fields the value to set
         * @return this builder
         **/
        

        public Builder fields(java.util.List<FieldInfo> fields) {
        this.fields = fields;
        return this;
        }
            /**
     * List of search results.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<SearchResult> results;

                /**
         * List of search results.
         * @param results the value to set
         * @return this builder
         **/
        

        public Builder results(java.util.List<SearchResult> results) {
        this.results = results;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private SearchResultSummary summary;

        

        public Builder summary(SearchResultSummary summary) {
        this.summary = summary;
        return this;
        }


        public ClusterLogsSummary build() {
            ClusterLogsSummary model = new ClusterLogsSummary(this.fields
                    , this.results
                    , this.summary);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterLogsSummary model) {
                this.fields(model.getFields());
    this.results(model.getResults());
    this.summary(model.getSummary());
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
     * List of log field schema information.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<FieldInfo> fields;

        /**
     * List of log field schema information.
     * @return the value
     **/
    
    public java.util.List<FieldInfo> getFields() {
        return fields;
    }


        /**
     * List of search results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<SearchResult> results;

        /**
     * List of search results.
     * @return the value
     **/
    
    public java.util.List<SearchResult> getResults() {
        return results;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final SearchResultSummary summary;

    
    public SearchResultSummary getSummary() {
        return summary;
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
        sb.append("ClusterLogsSummary(");
        sb.append("fields=").append(String.valueOf(this.fields));
        sb.append(", results=").append(String.valueOf(this.results));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterLogsSummary)) {
            return false;
        }

        ClusterLogsSummary other = (ClusterLogsSummary) o;
        return java.util.Objects.equals(this.fields, other.fields) &&
            java.util.Objects.equals(this.results, other.results) &&
            java.util.Objects.equals(this.summary, other.summary);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        return result;
    }


}
