// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request payload for validating an Agent Flow diagram without persisting changes.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ValidateAgentFlowDiagramDetails.Builder.class)

public final class ValidateAgentFlowDiagramDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowKey", "agentFlowDiagram", "modelVersion", "validationLevel", "options"})
    public ValidateAgentFlowDiagramDetails(String agentFlowKey, AgentFlowDiagram agentFlowDiagram, String modelVersion, ValidationLevel validationLevel, AgentFlowValidationOptions options) {
        super();
        this.agentFlowKey = agentFlowKey;
        this.agentFlowDiagram = agentFlowDiagram;
        this.modelVersion = modelVersion;
        this.validationLevel = validationLevel;
        this.options = options;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Optional Agent Flow key used to resolve persisted validation context.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
private String agentFlowKey;

        /**
         * Optional Agent Flow key used to resolve persisted validation context.
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

public Builder agentFlowKey(String agentFlowKey) {
    this.agentFlowKey = agentFlowKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowDiagram")
private AgentFlowDiagram agentFlowDiagram;



public Builder agentFlowDiagram(AgentFlowDiagram agentFlowDiagram) {
    this.agentFlowDiagram = agentFlowDiagram;
    return this;
}
            /**
     * The model and upgrade compatibility version for this validation request.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
private String modelVersion;

        /**
         * The model and upgrade compatibility version for this validation request.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * Validation depth to apply.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("validationLevel")
private ValidationLevel validationLevel;

        /**
         * Validation depth to apply.
         * @param validationLevel the value to set
         * @return this builder
         **/
        

public Builder validationLevel(ValidationLevel validationLevel) {
    this.validationLevel = validationLevel;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("options")
private AgentFlowValidationOptions options;



public Builder options(AgentFlowValidationOptions options) {
    this.options = options;
    return this;
}


        public ValidateAgentFlowDiagramDetails build() {
            ValidateAgentFlowDiagramDetails model = new ValidateAgentFlowDiagramDetails(this.agentFlowKey
                , this.agentFlowDiagram
                , this.modelVersion
                , this.validationLevel
                , this.options);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateAgentFlowDiagramDetails model) {
                this.agentFlowKey(model.getAgentFlowKey());
    this.agentFlowDiagram(model.getAgentFlowDiagram());
    this.modelVersion(model.getModelVersion());
    this.validationLevel(model.getValidationLevel());
    this.options(model.getOptions());
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
     * Optional Agent Flow key used to resolve persisted validation context.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * Optional Agent Flow key used to resolve persisted validation context.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowDiagram")
    private final AgentFlowDiagram agentFlowDiagram;

    
    public AgentFlowDiagram getAgentFlowDiagram() {
        return agentFlowDiagram;
    }


        /**
     * The model and upgrade compatibility version for this validation request.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

        /**
     * The model and upgrade compatibility version for this validation request.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Validation depth to apply.
     **/
    public enum ValidationLevel implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Validation depth to apply.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationLevel")
    private final ValidationLevel validationLevel;

        /**
     * Validation depth to apply.
     * @return the value
     **/
    
    public ValidationLevel getValidationLevel() {
        return validationLevel;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final AgentFlowValidationOptions options;

    
    public AgentFlowValidationOptions getOptions() {
        return options;
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
        sb.append("ValidateAgentFlowDiagramDetails(");
        sb.append("agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", agentFlowDiagram=").append(String.valueOf(this.agentFlowDiagram));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", validationLevel=").append(String.valueOf(this.validationLevel));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateAgentFlowDiagramDetails)) {
            return false;
        }

        ValidateAgentFlowDiagramDetails other = (ValidateAgentFlowDiagramDetails) o;
        return java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.agentFlowDiagram, other.agentFlowDiagram) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.validationLevel, other.validationLevel) &&
            java.util.Objects.equals(this.options, other.options);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.agentFlowDiagram == null ? 43 : this.agentFlowDiagram.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.validationLevel == null ? 43 : this.validationLevel.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        return result;
    }


}
