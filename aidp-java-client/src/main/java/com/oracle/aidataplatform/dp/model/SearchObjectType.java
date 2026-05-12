package com.oracle.aidataplatform.dp.model;



/**
 * Possible types of search object
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchObjectType.Builder.class)

public final class SearchObjectType  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "count"})
    public SearchObjectType(String name, Integer count) {
        super();
        this.name = name;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Possible types of search object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Possible types of search object
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Total count of search object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("count")
private Integer count;

        /**
         * Total count of search object
         * @param count the value to set
         * @return this builder
         **/
        

public Builder count(Integer count) {
    this.count = count;
    return this;
}


        public SearchObjectType build() {
            SearchObjectType model = new SearchObjectType(this.name
                , this.count);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchObjectType model) {
                this.name(model.getName());
    this.count(model.getCount());
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
     * Possible types of search object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Possible types of search object
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Total count of search object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

        /**
     * Total count of search object
     * @return the value
     **/
    
    public Integer getCount() {
        return count;
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
        sb.append("SearchObjectType(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchObjectType)) {
            return false;
        }

        SearchObjectType other = (SearchObjectType) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.count, other.count);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        return result;
    }


}
