// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information about an Agent task that invokes an active PROD Agent deployment from a workflow. Resolved parameters whose names start with {@code sessionvariables.} are forwarded unchanged as A2A message metadata; Credential Store keys remain opaque to Workflow.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class AgentTask extends Task {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
private String taskKey;

public Builder taskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
private java.util.List<DependsOn> dependsOn;

public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("runIf")
private RunIf runIf;

public Builder runIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
private Integer maxRetries;

public Builder maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("minRetryIntervalMillis")
private Integer minRetryIntervalMillis;

public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("isRetryOnTimeout")
private Boolean isRetryOnTimeout;

public Builder isRetryOnTimeout(Boolean isRetryOnTimeout) {
    this.isRetryOnTimeout = isRetryOnTimeout;
    return this;
}
            /**
     * Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentKey")
private String agentKey;

        /**
         * Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
         * @param agentKey the value to set
         * @return this builder
         **/
        

public Builder agentKey(String agentKey) {
    this.agentKey = agentKey;
    return this;
}
            /**
     * Required user input text sent as an A2A user message part.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("prompt")
private String prompt;

        /**
         * Required user input text sent as an A2A user message part.
         * @param prompt the value to set
         * @return this builder
         **/
        

public Builder prompt(String prompt) {
    this.prompt = prompt;
    return this;
}
            /**
     * An optional list of parameters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parameters")
private java.util.List<Parameter> parameters;

        /**
         * An optional list of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
        

public Builder parameters(java.util.List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
}


        public AgentTask build() {
            AgentTask model = new AgentTask(this.taskKey
                , this.dependsOn
                , this.runIf
                , this.maxRetries
                , this.minRetryIntervalMillis
                , this.isRetryOnTimeout
                , this.agentKey
                , this.prompt
                , this.parameters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentTask model) {
                this.taskKey(model.getTaskKey());
    this.dependsOn(model.getDependsOn());
    this.runIf(model.getRunIf());
    this.maxRetries(model.getMaxRetries());
    this.minRetryIntervalMillis(model.getMinRetryIntervalMillis());
    this.isRetryOnTimeout(model.getIsRetryOnTimeout());
    this.agentKey(model.getAgentKey());
    this.prompt(model.getPrompt());
    this.parameters(model.getParameters());
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

    
    @Deprecated
    public AgentTask(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout, String agentKey, String prompt, java.util.List<Parameter> parameters) {
    super(taskKey, dependsOn, runIf, maxRetries, minRetryIntervalMillis, isRetryOnTimeout);
        this.agentKey = agentKey;
        this.prompt = prompt;
        this.parameters = parameters;
    }


        /**
     * Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentKey")
    private final String agentKey;

        /**
     * Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
     * @return the value
     **/
    
    public String getAgentKey() {
        return agentKey;
    }


        /**
     * Required user input text sent as an A2A user message part.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

        /**
     * Required user input text sent as an A2A user message part.
     * @return the value
     **/
    
    public String getPrompt() {
        return prompt;
    }


        /**
     * An optional list of parameters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

        /**
     * An optional list of parameters.
     * @return the value
     **/
    
    public java.util.List<Parameter> getParameters() {
        return parameters;
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
        sb.append("AgentTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentTask)) {
            return false;
        }

        AgentTask other = (AgentTask) o;
        return java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.prompt, other.prompt) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }


}
