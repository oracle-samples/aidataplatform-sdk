package com.oracle.aidataplatform.dp.model;



/**
 * Summary of the search response.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchResultSummary.Builder.class)

public final class SearchResultSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"resultCount", "fieldCount"})
    public SearchResultSummary(Integer resultCount, Integer fieldCount) {
        super();
        this.resultCount = resultCount;
        this.fieldCount = fieldCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total number of search results.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resultCount")
private Integer resultCount;

        /**
         * Total number of search results.
         * @param resultCount the value to set
         * @return this builder
         **/
        

public Builder resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
}
            /**
     * Total number of field schema information.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
private Integer fieldCount;

        /**
         * Total number of field schema information.
         * @param fieldCount the value to set
         * @return this builder
         **/
        

public Builder fieldCount(Integer fieldCount) {
    this.fieldCount = fieldCount;
    return this;
}


        public SearchResultSummary build() {
            SearchResultSummary model = new SearchResultSummary(this.resultCount
                , this.fieldCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultSummary model) {
                this.resultCount(model.getResultCount());
    this.fieldCount(model.getFieldCount());
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
     * Total number of search results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
    private final Integer resultCount;

        /**
     * Total number of search results.
     * @return the value
     **/
    
    public Integer getResultCount() {
        return resultCount;
    }


        /**
     * Total number of field schema information.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldCount")
    private final Integer fieldCount;

        /**
     * Total number of field schema information.
     * @return the value
     **/
    
    public Integer getFieldCount() {
        return fieldCount;
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
        sb.append("SearchResultSummary(");
        sb.append("resultCount=").append(String.valueOf(this.resultCount));
        sb.append(", fieldCount=").append(String.valueOf(this.fieldCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResultSummary)) {
            return false;
        }

        SearchResultSummary other = (SearchResultSummary) o;
        return java.util.Objects.equals(this.resultCount, other.resultCount) &&
            java.util.Objects.equals(this.fieldCount, other.fieldCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultCount == null ? 43 : this.resultCount.hashCode());
        result = (result * PRIME) + (this.fieldCount == null ? 43 : this.fieldCount.hashCode());
        return result;
    }


}
