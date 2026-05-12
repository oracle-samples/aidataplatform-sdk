package com.oracle.aidataplatform.dp.model;


/**
 * Object with sort criteria details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SortDetails.Builder.class)

public final class SortDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"sortBy", "sortOrder"})
    public SortDetails(SortFieldEnum sortBy, SortOrder sortOrder) {
        super();
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Field name that needs to be sorted by.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortFieldEnum sortBy;

                /**
         * Field name that needs to be sorted by.
         * @param sortBy the value to set
         * @return this builder
         **/
        

        public Builder sortBy(SortFieldEnum sortBy) {
        this.sortBy = sortBy;
        return this;
        }
            /**
     * Sort order for search results.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

                /**
         * Sort order for search results.
         * @param sortOrder the value to set
         * @return this builder
         **/
        

        public Builder sortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
        }


        public SortDetails build() {
            SortDetails model = new SortDetails(this.sortBy
                    , this.sortOrder);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortDetails model) {
                this.sortBy(model.getSortBy());
    this.sortOrder(model.getSortOrder());
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
     * Field name that needs to be sorted by.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortFieldEnum sortBy;

        /**
     * Field name that needs to be sorted by.
     * @return the value
     **/
    
    public SortFieldEnum getSortBy() {
        return sortBy;
    }

    /**
     * Sort order for search results.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
        /**
     * Sort order for search results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

        /**
     * Sort order for search results.
     * @return the value
     **/
    
    public SortOrder getSortOrder() {
        return sortOrder;
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
        sb.append("SortDetails(");
        sb.append("sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SortDetails)) {
            return false;
        }

        SortDetails other = (SortDetails) o;
        return java.util.Objects.equals(this.sortBy, other.sortBy) &&
            java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }


}
