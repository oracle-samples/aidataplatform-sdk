// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A validation issue for an Agent Flow diagram.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowValidationIssue.Builder.class)

public final class AgentFlowValidationIssue  {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "severity", "phase", "message", "path", "nodeKey", "edgeKey", "resourceKey", "suggestedFix", "details"})
    public AgentFlowValidationIssue(String code, Severity severity, Phase phase, String message, String path, String nodeKey, String edgeKey, String resourceKey, String suggestedFix, java.util.Map<String, Object> details) {
        super();
        this.code = code;
        this.severity = severity;
        this.phase = phase;
        this.message = message;
        this.path = path;
        this.nodeKey = nodeKey;
        this.edgeKey = edgeKey;
        this.resourceKey = resourceKey;
        this.suggestedFix = suggestedFix;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Stable machine-readable validation issue code.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

                /**
         * Stable machine-readable validation issue code.
         * @param code the value to set
         * @return this builder
         **/
        

        public Builder code(String code) {
        this.code = code;
        return this;
        }
            /**
     * Issue severity.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

                /**
         * Issue severity.
         * @param severity the value to set
         * @return this builder
         **/
        

        public Builder severity(Severity severity) {
        this.severity = severity;
        return this;
        }
            /**
     * Validation phase that produced the issue.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("phase")
        private Phase phase;

                /**
         * Validation phase that produced the issue.
         * @param phase the value to set
         * @return this builder
         **/
        

        public Builder phase(Phase phase) {
        this.phase = phase;
        return this;
        }
            /**
     * Human-readable validation issue message.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

                /**
         * Human-readable validation issue message.
         * @param message the value to set
         * @return this builder
         **/
        

        public Builder message(String message) {
        this.message = message;
        return this;
        }
            /**
     * JSON path or logical path to the invalid field.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * JSON path or logical path to the invalid field.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * Optional node key associated with the issue.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("nodeKey")
        private String nodeKey;

                /**
         * Optional node key associated with the issue.
         * @param nodeKey the value to set
         * @return this builder
         **/
        

        public Builder nodeKey(String nodeKey) {
        this.nodeKey = nodeKey;
        return this;
        }
            /**
     * Optional edge key associated with the issue.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("edgeKey")
        private String edgeKey;

                /**
         * Optional edge key associated with the issue.
         * @param edgeKey the value to set
         * @return this builder
         **/
        

        public Builder edgeKey(String edgeKey) {
        this.edgeKey = edgeKey;
        return this;
        }
            /**
     * Optional tool, guardrails, catalog, or workspace key associated with the issue.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
        private String resourceKey;

                /**
         * Optional tool, guardrails, catalog, or workspace key associated with the issue.
         * @param resourceKey the value to set
         * @return this builder
         **/
        

        public Builder resourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
        }
            /**
     * Optional user-facing remediation text.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("suggestedFix")
        private String suggestedFix;

                /**
         * Optional user-facing remediation text.
         * @param suggestedFix the value to set
         * @return this builder
         **/
        

        public Builder suggestedFix(String suggestedFix) {
        this.suggestedFix = suggestedFix;
        return this;
        }
            /**
     * Non-sensitive issue details.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, Object> details;

                /**
         * Non-sensitive issue details.
         * @param details the value to set
         * @return this builder
         **/
        

        public Builder details(java.util.Map<String, Object> details) {
        this.details = details;
        return this;
        }


        public AgentFlowValidationIssue build() {
            AgentFlowValidationIssue model = new AgentFlowValidationIssue(this.code
                    , this.severity
                    , this.phase
                    , this.message
                    , this.path
                    , this.nodeKey
                    , this.edgeKey
                    , this.resourceKey
                    , this.suggestedFix
                    , this.details);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowValidationIssue model) {
                this.code(model.getCode());
    this.severity(model.getSeverity());
    this.phase(model.getPhase());
    this.message(model.getMessage());
    this.path(model.getPath());
    this.nodeKey(model.getNodeKey());
    this.edgeKey(model.getEdgeKey());
    this.resourceKey(model.getResourceKey());
    this.suggestedFix(model.getSuggestedFix());
    this.details(model.getDetails());
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
     * Stable machine-readable validation issue code.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

        /**
     * Stable machine-readable validation issue code.
     * @return the value
     **/
    
    public String getCode() {
        return code;
    }

    /**
     * Issue severity.
     **/
    public enum Severity {
        Error("ERROR"),
        Warning("WARNING"),
        Info("INFO"),
        ;

        

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Severity: " + key);
        }
    };
        /**
     * Issue severity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

        /**
     * Issue severity.
     * @return the value
     **/
    
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Validation phase that produced the issue.
     **/
    public enum Phase {
        Model("MODEL"),
        Graph("GRAPH"),
        Config("CONFIG"),
        Reference("REFERENCE"),
        Codegen("CODEGEN"),
        ;

        

        private final String value;
        private static java.util.Map<String, Phase> map;

        static {
            map = new java.util.HashMap<>();
            for (Phase v : Phase.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Phase(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Phase create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Phase: " + key);
        }
    };
        /**
     * Validation phase that produced the issue.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    private final Phase phase;

        /**
     * Validation phase that produced the issue.
     * @return the value
     **/
    
    public Phase getPhase() {
        return phase;
    }


        /**
     * Human-readable validation issue message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Human-readable validation issue message.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * JSON path or logical path to the invalid field.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * JSON path or logical path to the invalid field.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Optional node key associated with the issue.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeKey")
    private final String nodeKey;

        /**
     * Optional node key associated with the issue.
     * @return the value
     **/
    
    public String getNodeKey() {
        return nodeKey;
    }


        /**
     * Optional edge key associated with the issue.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("edgeKey")
    private final String edgeKey;

        /**
     * Optional edge key associated with the issue.
     * @return the value
     **/
    
    public String getEdgeKey() {
        return edgeKey;
    }


        /**
     * Optional tool, guardrails, catalog, or workspace key associated with the issue.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
    private final String resourceKey;

        /**
     * Optional tool, guardrails, catalog, or workspace key associated with the issue.
     * @return the value
     **/
    
    public String getResourceKey() {
        return resourceKey;
    }


        /**
     * Optional user-facing remediation text.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("suggestedFix")
    private final String suggestedFix;

        /**
     * Optional user-facing remediation text.
     * @return the value
     **/
    
    public String getSuggestedFix() {
        return suggestedFix;
    }


        /**
     * Non-sensitive issue details.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.Map<String, Object> details;

        /**
     * Non-sensitive issue details.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getDetails() {
        return details;
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
        sb.append("AgentFlowValidationIssue(");
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", phase=").append(String.valueOf(this.phase));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", nodeKey=").append(String.valueOf(this.nodeKey));
        sb.append(", edgeKey=").append(String.valueOf(this.edgeKey));
        sb.append(", resourceKey=").append(String.valueOf(this.resourceKey));
        sb.append(", suggestedFix=").append(String.valueOf(this.suggestedFix));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowValidationIssue)) {
            return false;
        }

        AgentFlowValidationIssue other = (AgentFlowValidationIssue) o;
        return java.util.Objects.equals(this.code, other.code) &&
            java.util.Objects.equals(this.severity, other.severity) &&
            java.util.Objects.equals(this.phase, other.phase) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.nodeKey, other.nodeKey) &&
            java.util.Objects.equals(this.edgeKey, other.edgeKey) &&
            java.util.Objects.equals(this.resourceKey, other.resourceKey) &&
            java.util.Objects.equals(this.suggestedFix, other.suggestedFix) &&
            java.util.Objects.equals(this.details, other.details);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.phase == null ? 43 : this.phase.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.nodeKey == null ? 43 : this.nodeKey.hashCode());
        result = (result * PRIME) + (this.edgeKey == null ? 43 : this.edgeKey.hashCode());
        result = (result * PRIME) + (this.resourceKey == null ? 43 : this.resourceKey.hashCode());
        result = (result * PRIME) + (this.suggestedFix == null ? 43 : this.suggestedFix.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        return result;
    }


}
