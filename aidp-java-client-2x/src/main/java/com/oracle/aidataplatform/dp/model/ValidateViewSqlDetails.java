package com.oracle.aidataplatform.dp.model;


/**
 * View select query details.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ValidateViewSqlDetails.Builder.class)

public final class ValidateViewSqlDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"viewSelectQuery"})
    public ValidateViewSqlDetails(String viewSelectQuery) {
        super();
        this.viewSelectQuery = viewSelectQuery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The Query used to create the view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("viewSelectQuery")
        private String viewSelectQuery;

                /**
         * The Query used to create the view.
         * @param viewSelectQuery the value to set
         * @return this builder
         **/
        

        public Builder viewSelectQuery(String viewSelectQuery) {
        this.viewSelectQuery = viewSelectQuery;
        return this;
        }


        public ValidateViewSqlDetails build() {
            ValidateViewSqlDetails model = new ValidateViewSqlDetails(this.viewSelectQuery);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateViewSqlDetails model) {
                this.viewSelectQuery(model.getViewSelectQuery());
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
     * The Query used to create the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("viewSelectQuery")
    private final String viewSelectQuery;

        /**
     * The Query used to create the view.
     * @return the value
     **/
    
    public String getViewSelectQuery() {
        return viewSelectQuery;
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
        sb.append("ValidateViewSqlDetails(");
        sb.append("viewSelectQuery=").append(String.valueOf(this.viewSelectQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateViewSqlDetails)) {
            return false;
        }

        ValidateViewSqlDetails other = (ValidateViewSqlDetails) o;
        return java.util.Objects.equals(this.viewSelectQuery, other.viewSelectQuery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.viewSelectQuery == null ? 43 : this.viewSelectQuery.hashCode());
        return result;
    }


}
