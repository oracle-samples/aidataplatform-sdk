// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The response object for validating the agent flow json
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ValidateAgentFlowResponse.Builder.class)

public final class ValidateAgentFlowResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"isValidAgentFlow", "validationError"})
    public ValidateAgentFlowResponse(Boolean isValidAgentFlow, java.util.List<ValidationError> validationError) {
        super();
        this.isValidAgentFlow = isValidAgentFlow;
        this.validationError = validationError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * true if valid, else false
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isValidAgentFlow")
        private Boolean isValidAgentFlow;

                /**
         * true if valid, else false
         * @param isValidAgentFlow the value to set
         * @return this builder
         **/
        

        public Builder isValidAgentFlow(Boolean isValidAgentFlow) {
        this.isValidAgentFlow = isValidAgentFlow;
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


        public ValidateAgentFlowResponse build() {
            ValidateAgentFlowResponse model = new ValidateAgentFlowResponse(this.isValidAgentFlow
                    , this.validationError);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateAgentFlowResponse model) {
                this.isValidAgentFlow(model.getIsValidAgentFlow());
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("isValidAgentFlow")
    private final Boolean isValidAgentFlow;

        /**
     * true if valid, else false
     * @return the value
     **/
    
    public Boolean getIsValidAgentFlow() {
        return isValidAgentFlow;
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
        sb.append("ValidateAgentFlowResponse(");
        sb.append("isValidAgentFlow=").append(String.valueOf(this.isValidAgentFlow));
        sb.append(", validationError=").append(String.valueOf(this.validationError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateAgentFlowResponse)) {
            return false;
        }

        ValidateAgentFlowResponse other = (ValidateAgentFlowResponse) o;
        return java.util.Objects.equals(this.isValidAgentFlow, other.isValidAgentFlow) &&
            java.util.Objects.equals(this.validationError, other.validationError);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isValidAgentFlow == null ? 43 : this.isValidAgentFlow.hashCode());
        result = (result * PRIME) + (this.validationError == null ? 43 : this.validationError.hashCode());
        return result;
    }


}
