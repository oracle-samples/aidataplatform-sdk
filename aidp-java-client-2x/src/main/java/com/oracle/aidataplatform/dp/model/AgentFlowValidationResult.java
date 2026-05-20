// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Result of validating an Agent Flow diagram.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowValidationResult.Builder.class)

public final class AgentFlowValidationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"isValid", "validationLevel", "summary", "issues", "metadata"})
    public AgentFlowValidationResult(Boolean isValid, ValidationLevel validationLevel, AgentFlowValidationSummary summary, java.util.List<AgentFlowValidationIssue> issues, AgentFlowValidationMetadata metadata) {
        super();
        this.isValid = isValid;
        this.validationLevel = validationLevel;
        this.summary = summary;
        this.issues = issues;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * True when the diagram has no error severity validation issues.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isValid")
        private Boolean isValid;

                /**
         * True when the diagram has no error severity validation issues.
         * @param isValid the value to set
         * @return this builder
         **/
        

        public Builder isValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
        }
            /**
     * Highest validation level completed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("validationLevel")
        private ValidationLevel validationLevel;

                /**
         * Highest validation level completed.
         * @param validationLevel the value to set
         * @return this builder
         **/
        

        public Builder validationLevel(ValidationLevel validationLevel) {
        this.validationLevel = validationLevel;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private AgentFlowValidationSummary summary;

        

        public Builder summary(AgentFlowValidationSummary summary) {
        this.summary = summary;
        return this;
        }
            /**
     * Ordered validation issue list.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("issues")
        private java.util.List<AgentFlowValidationIssue> issues;

                /**
         * Ordered validation issue list.
         * @param issues the value to set
         * @return this builder
         **/
        

        public Builder issues(java.util.List<AgentFlowValidationIssue> issues) {
        this.issues = issues;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private AgentFlowValidationMetadata metadata;

        

        public Builder metadata(AgentFlowValidationMetadata metadata) {
        this.metadata = metadata;
        return this;
        }


        public AgentFlowValidationResult build() {
            AgentFlowValidationResult model = new AgentFlowValidationResult(this.isValid
                    , this.validationLevel
                    , this.summary
                    , this.issues
                    , this.metadata);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowValidationResult model) {
                this.isValid(model.getIsValid());
    this.validationLevel(model.getValidationLevel());
    this.summary(model.getSummary());
    this.issues(model.getIssues());
    this.metadata(model.getMetadata());
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
     * True when the diagram has no error severity validation issues.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isValid")
    private final Boolean isValid;

        /**
     * True when the diagram has no error severity validation issues.
     * @return the value
     **/
    
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * Highest validation level completed.
     **/
    public enum ValidationLevel {
        Basic("BASIC"),
        Deep("DEEP"),
        ;

        

        private final String value;
        private static java.util.Map<String, ValidationLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationLevel v : ValidationLevel.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ValidationLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValidationLevel: " + key);
        }
    };
        /**
     * Highest validation level completed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationLevel")
    private final ValidationLevel validationLevel;

        /**
     * Highest validation level completed.
     * @return the value
     **/
    
    public ValidationLevel getValidationLevel() {
        return validationLevel;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final AgentFlowValidationSummary summary;

    
    public AgentFlowValidationSummary getSummary() {
        return summary;
    }


        /**
     * Ordered validation issue list.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("issues")
    private final java.util.List<AgentFlowValidationIssue> issues;

        /**
     * Ordered validation issue list.
     * @return the value
     **/
    
    public java.util.List<AgentFlowValidationIssue> getIssues() {
        return issues;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final AgentFlowValidationMetadata metadata;

    
    public AgentFlowValidationMetadata getMetadata() {
        return metadata;
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
        sb.append("AgentFlowValidationResult(");
        sb.append("isValid=").append(String.valueOf(this.isValid));
        sb.append(", validationLevel=").append(String.valueOf(this.validationLevel));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", issues=").append(String.valueOf(this.issues));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowValidationResult)) {
            return false;
        }

        AgentFlowValidationResult other = (AgentFlowValidationResult) o;
        return java.util.Objects.equals(this.isValid, other.isValid) &&
            java.util.Objects.equals(this.validationLevel, other.validationLevel) &&
            java.util.Objects.equals(this.summary, other.summary) &&
            java.util.Objects.equals(this.issues, other.issues) &&
            java.util.Objects.equals(this.metadata, other.metadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isValid == null ? 43 : this.isValid.hashCode());
        result = (result * PRIME) + (this.validationLevel == null ? 43 : this.validationLevel.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.issues == null ? 43 : this.issues.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }


}
