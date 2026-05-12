package com.oracle.aidataplatform.dp.model;



/**
 * A single search result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchResult.Builder.class)

public final class SearchResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"data"})
    public SearchResult(Object data) {
        super();
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The actual log data with field mappings.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("data")
private Object data;

        /**
         * The actual log data with field mappings.
         * @param data the value to set
         * @return this builder
         **/
        

public Builder data(Object data) {
    this.data = data;
    return this;
}


        public SearchResult build() {
            SearchResult model = new SearchResult(this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResult model) {
                this.data(model.getData());
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
     * The actual log data with field mappings.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final Object data;

        /**
     * The actual log data with field mappings.
     * @return the value
     **/
    
    public Object getData() {
        return data;
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
        sb.append("SearchResult(");
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResult)) {
            return false;
        }

        SearchResult other = (SearchResult) o;
        return java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
