// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Options controlling Agent Flow diagram validation behavior.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowValidationOptions.Builder.class)

public final class AgentFlowValidationOptions  {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldSkipLakeFlowValidation", "shouldIncludeWarnings"})
    public AgentFlowValidationOptions(Boolean shouldSkipLakeFlowValidation, Boolean shouldIncludeWarnings) {
        super();
        this.shouldSkipLakeFlowValidation = shouldSkipLakeFlowValidation;
        this.shouldIncludeWarnings = shouldIncludeWarnings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Whether to skip optional LakeFlow validation when deep validation is requested.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipLakeFlowValidation")
        private Boolean shouldSkipLakeFlowValidation;

                /**
         * Whether to skip optional LakeFlow validation when deep validation is requested.
         * @param shouldSkipLakeFlowValidation the value to set
         * @return this builder
         **/
        

        public Builder shouldSkipLakeFlowValidation(Boolean shouldSkipLakeFlowValidation) {
        this.shouldSkipLakeFlowValidation = shouldSkipLakeFlowValidation;
        return this;
        }
            /**
     * Whether warning issues should be included in the validation result.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeWarnings")
        private Boolean shouldIncludeWarnings;

                /**
         * Whether warning issues should be included in the validation result.
         * @param shouldIncludeWarnings the value to set
         * @return this builder
         **/
        

        public Builder shouldIncludeWarnings(Boolean shouldIncludeWarnings) {
        this.shouldIncludeWarnings = shouldIncludeWarnings;
        return this;
        }


        public AgentFlowValidationOptions build() {
            AgentFlowValidationOptions model = new AgentFlowValidationOptions(this.shouldSkipLakeFlowValidation
                    , this.shouldIncludeWarnings);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowValidationOptions model) {
                this.shouldSkipLakeFlowValidation(model.getShouldSkipLakeFlowValidation());
    this.shouldIncludeWarnings(model.getShouldIncludeWarnings());
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
     * Whether to skip optional LakeFlow validation when deep validation is requested.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipLakeFlowValidation")
    private final Boolean shouldSkipLakeFlowValidation;

        /**
     * Whether to skip optional LakeFlow validation when deep validation is requested.
     * @return the value
     **/
    
    public Boolean getShouldSkipLakeFlowValidation() {
        return shouldSkipLakeFlowValidation;
    }


        /**
     * Whether warning issues should be included in the validation result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeWarnings")
    private final Boolean shouldIncludeWarnings;

        /**
     * Whether warning issues should be included in the validation result.
     * @return the value
     **/
    
    public Boolean getShouldIncludeWarnings() {
        return shouldIncludeWarnings;
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
        sb.append("AgentFlowValidationOptions(");
        sb.append("shouldSkipLakeFlowValidation=").append(String.valueOf(this.shouldSkipLakeFlowValidation));
        sb.append(", shouldIncludeWarnings=").append(String.valueOf(this.shouldIncludeWarnings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowValidationOptions)) {
            return false;
        }

        AgentFlowValidationOptions other = (AgentFlowValidationOptions) o;
        return java.util.Objects.equals(this.shouldSkipLakeFlowValidation, other.shouldSkipLakeFlowValidation) &&
            java.util.Objects.equals(this.shouldIncludeWarnings, other.shouldIncludeWarnings);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shouldSkipLakeFlowValidation == null ? 43 : this.shouldSkipLakeFlowValidation.hashCode());
        result = (result * PRIME) + (this.shouldIncludeWarnings == null ? 43 : this.shouldIncludeWarnings.hashCode());
        return result;
    }


}
