// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The response object for validating the agent JSON.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ValidateAgentResponse.Builder.class)

public final class ValidateAgentResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"isValidAgent", "validationError"})
    public ValidateAgentResponse(Boolean isValidAgent, java.util.List<ValidationError> validationError) {
        super();
        this.isValidAgent = isValidAgent;
        this.validationError = validationError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * true if valid, else false
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isValidAgent")
private Boolean isValidAgent;

        /**
         * true if valid, else false
         * @param isValidAgent the value to set
         * @return this builder
         **/
        

public Builder isValidAgent(Boolean isValidAgent) {
    this.isValidAgent = isValidAgent;
    return this;
}
            /**
     * List of validation errors encountered in the diagram.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("validationError")
private java.util.List<ValidationError> validationError;

        /**
         * List of validation errors encountered in the diagram.
         * @param validationError the value to set
         * @return this builder
         **/
        

public Builder validationError(java.util.List<ValidationError> validationError) {
    this.validationError = validationError;
    return this;
}


        public ValidateAgentResponse build() {
            ValidateAgentResponse model = new ValidateAgentResponse(this.isValidAgent
                , this.validationError);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateAgentResponse model) {
                this.isValidAgent(model.getIsValidAgent());
    this.validationError(model.getValidationError());
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
     * true if valid, else false
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isValidAgent")
    private final Boolean isValidAgent;

        /**
     * true if valid, else false
     * @return the value
     **/
    
    public Boolean getIsValidAgent() {
        return isValidAgent;
    }


        /**
     * List of validation errors encountered in the diagram.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationError")
    private final java.util.List<ValidationError> validationError;

        /**
     * List of validation errors encountered in the diagram.
     * @return the value
     **/
    
    public java.util.List<ValidationError> getValidationError() {
        return validationError;
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
        sb.append("ValidateAgentResponse(");
        sb.append("isValidAgent=").append(String.valueOf(this.isValidAgent));
        sb.append(", validationError=").append(String.valueOf(this.validationError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateAgentResponse)) {
            return false;
        }

        ValidateAgentResponse other = (ValidateAgentResponse) o;
        return java.util.Objects.equals(this.isValidAgent, other.isValidAgent) &&
            java.util.Objects.equals(this.validationError, other.validationError);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isValidAgent == null ? 43 : this.isValidAgent.hashCode());
        result = (result * PRIME) + (this.validationError == null ? 43 : this.validationError.hashCode());
        return result;
    }


}
