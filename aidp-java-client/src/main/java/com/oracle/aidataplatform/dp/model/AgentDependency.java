// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The response object for getting the agent dependencies.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentDependency.Builder.class)

public final class AgentDependency  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentKey", "type", "dependencies"})
    public AgentDependency(String agentKey, String type, java.util.List<AgentDependencyItem> dependencies) {
        super();
        this.agentKey = agentKey;
        this.type = type;
        this.dependencies = dependencies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Agent key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentKey")
private String agentKey;

        /**
         * Agent key.
         * @param agentKey the value to set
         * @return this builder
         **/
        

public Builder agentKey(String agentKey) {
    this.agentKey = agentKey;
    return this;
}
            /**
     * Agent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Agent.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * List of agent dependencies.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dependencies")
private java.util.List<AgentDependencyItem> dependencies;

        /**
         * List of agent dependencies.
         * @param dependencies the value to set
         * @return this builder
         **/
        

public Builder dependencies(java.util.List<AgentDependencyItem> dependencies) {
    this.dependencies = dependencies;
    return this;
}


        public AgentDependency build() {
            AgentDependency model = new AgentDependency(this.agentKey
                , this.type
                , this.dependencies);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentDependency model) {
                this.agentKey(model.getAgentKey());
    this.type(model.getType());
    this.dependencies(model.getDependencies());
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
     * Agent key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentKey")
    private final String agentKey;

        /**
     * Agent key.
     * @return the value
     **/
    
    public String getAgentKey() {
        return agentKey;
    }


        /**
     * Agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Agent.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * List of agent dependencies.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<AgentDependencyItem> dependencies;

        /**
     * List of agent dependencies.
     * @return the value
     **/
    
    public java.util.List<AgentDependencyItem> getDependencies() {
        return dependencies;
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
        sb.append("AgentDependency(");
        sb.append("agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", dependencies=").append(String.valueOf(this.dependencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentDependency)) {
            return false;
        }

        AgentDependency other = (AgentDependency) o;
        return java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.dependencies, other.dependencies);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        return result;
    }


}
