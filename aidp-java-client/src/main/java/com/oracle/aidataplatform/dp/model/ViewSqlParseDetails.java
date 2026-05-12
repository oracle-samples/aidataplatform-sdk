package com.oracle.aidataplatform.dp.model;



/**
 * Parsed view select query post validation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ViewSqlParseDetails.Builder.class)

public final class ViewSqlParseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"isQueryValid", "queryParseErrorMessage", "viewFields"})
    public ViewSqlParseDetails(Boolean isQueryValid, String queryParseErrorMessage, java.util.List<ViewFieldDetails> viewFields) {
        super();
        this.isQueryValid = isQueryValid;
        this.queryParseErrorMessage = queryParseErrorMessage;
        this.viewFields = viewFields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Flag to indicate whether given view SQL is valid or not.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isQueryValid")
private Boolean isQueryValid;

        /**
         * Flag to indicate whether given view SQL is valid or not.
         * @param isQueryValid the value to set
         * @return this builder
         **/
        

public Builder isQueryValid(Boolean isQueryValid) {
    this.isQueryValid = isQueryValid;
    return this;
}
            /**
     * Error message if given view SQL is not valid.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("queryParseErrorMessage")
private String queryParseErrorMessage;

        /**
         * Error message if given view SQL is not valid.
         * @param queryParseErrorMessage the value to set
         * @return this builder
         **/
        

public Builder queryParseErrorMessage(String queryParseErrorMessage) {
    this.queryParseErrorMessage = queryParseErrorMessage;
    return this;
}
            /**
     * Columns for view.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("viewFields")
private java.util.List<ViewFieldDetails> viewFields;

        /**
         * Columns for view.
         * @param viewFields the value to set
         * @return this builder
         **/
        

public Builder viewFields(java.util.List<ViewFieldDetails> viewFields) {
    this.viewFields = viewFields;
    return this;
}


        public ViewSqlParseDetails build() {
            ViewSqlParseDetails model = new ViewSqlParseDetails(this.isQueryValid
                , this.queryParseErrorMessage
                , this.viewFields);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ViewSqlParseDetails model) {
                this.isQueryValid(model.getIsQueryValid());
    this.queryParseErrorMessage(model.getQueryParseErrorMessage());
    this.viewFields(model.getViewFields());
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
     * Flag to indicate whether given view SQL is valid or not.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isQueryValid")
    private final Boolean isQueryValid;

        /**
     * Flag to indicate whether given view SQL is valid or not.
     * @return the value
     **/
    
    public Boolean getIsQueryValid() {
        return isQueryValid;
    }


        /**
     * Error message if given view SQL is not valid.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("queryParseErrorMessage")
    private final String queryParseErrorMessage;

        /**
     * Error message if given view SQL is not valid.
     * @return the value
     **/
    
    public String getQueryParseErrorMessage() {
        return queryParseErrorMessage;
    }


        /**
     * Columns for view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("viewFields")
    private final java.util.List<ViewFieldDetails> viewFields;

        /**
     * Columns for view.
     * @return the value
     **/
    
    public java.util.List<ViewFieldDetails> getViewFields() {
        return viewFields;
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
        sb.append("ViewSqlParseDetails(");
        sb.append("isQueryValid=").append(String.valueOf(this.isQueryValid));
        sb.append(", queryParseErrorMessage=").append(String.valueOf(this.queryParseErrorMessage));
        sb.append(", viewFields=").append(String.valueOf(this.viewFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewSqlParseDetails)) {
            return false;
        }

        ViewSqlParseDetails other = (ViewSqlParseDetails) o;
        return java.util.Objects.equals(this.isQueryValid, other.isQueryValid) &&
            java.util.Objects.equals(this.queryParseErrorMessage, other.queryParseErrorMessage) &&
            java.util.Objects.equals(this.viewFields, other.viewFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isQueryValid == null ? 43 : this.isQueryValid.hashCode());
        result = (result * PRIME) + (this.queryParseErrorMessage == null ? 43 : this.queryParseErrorMessage.hashCode());
        result = (result * PRIME) + (this.viewFields == null ? 43 : this.viewFields.hashCode());
        return result;
    }


}
