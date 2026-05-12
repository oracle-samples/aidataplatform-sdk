package com.oracle.aidataplatform.dp.model;



/**
 * The response object for getting the agent flow dependencies
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowDependency.Builder.class)

public final class AgentFlowDependency  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowKey", "type", "dependencies"})
    public AgentFlowDependency(String agentFlowKey, String type, java.util.List<AgentFlowDependencyItem> dependencies) {
        super();
        this.agentFlowKey = agentFlowKey;
        this.type = type;
        this.dependencies = dependencies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * AgentFlow Key
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
private String agentFlowKey;

        /**
         * AgentFlow Key
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

public Builder agentFlowKey(String agentFlowKey) {
    this.agentFlowKey = agentFlowKey;
    return this;
}
            /**
     * AgentFlow
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * AgentFlow
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * List of AgentFlow dependencies.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dependencies")
private java.util.List<AgentFlowDependencyItem> dependencies;

        /**
         * List of AgentFlow dependencies.
         * @param dependencies the value to set
         * @return this builder
         **/
        

public Builder dependencies(java.util.List<AgentFlowDependencyItem> dependencies) {
    this.dependencies = dependencies;
    return this;
}


        public AgentFlowDependency build() {
            AgentFlowDependency model = new AgentFlowDependency(this.agentFlowKey
                , this.type
                , this.dependencies);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowDependency model) {
                this.agentFlowKey(model.getAgentFlowKey());
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
     * AgentFlow Key
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * AgentFlow Key
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }


        /**
     * AgentFlow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * AgentFlow
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * List of AgentFlow dependencies.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<AgentFlowDependencyItem> dependencies;

        /**
     * List of AgentFlow dependencies.
     * @return the value
     **/
    
    public java.util.List<AgentFlowDependencyItem> getDependencies() {
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
        sb.append("AgentFlowDependency(");
        sb.append("agentFlowKey=").append(String.valueOf(this.agentFlowKey));
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
        if (!(o instanceof AgentFlowDependency)) {
            return false;
        }

        AgentFlowDependency other = (AgentFlowDependency) o;
        return java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.dependencies, other.dependencies);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        return result;
    }


}
