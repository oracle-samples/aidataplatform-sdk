// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to create a new session of an Agent Flow.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAgentFlowSessionDetails.Builder.class)

public final class CreateAgentFlowSessionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "agentFlowKey", "context"})
    public CreateAgentFlowSessionDetails(String displayName, String agentFlowKey, AgentFlowSessionContext context) {
        super();
        this.displayName = displayName;
        this.agentFlowKey = agentFlowKey;
        this.context = context;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The Agent Flow key for which the session is started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
private String agentFlowKey;

        /**
         * The Agent Flow key for which the session is started.
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

public Builder agentFlowKey(String agentFlowKey) {
    this.agentFlowKey = agentFlowKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("context")
private AgentFlowSessionContext context;



public Builder context(AgentFlowSessionContext context) {
    this.context = context;
    return this;
}


        public CreateAgentFlowSessionDetails build() {
            CreateAgentFlowSessionDetails model = new CreateAgentFlowSessionDetails(this.displayName
                , this.agentFlowKey
                , this.context);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentFlowSessionDetails model) {
                this.displayName(model.getDisplayName());
    this.agentFlowKey(model.getAgentFlowKey());
    this.context(model.getContext());
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
     * Display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The Agent Flow key for which the session is started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * The Agent Flow key for which the session is started.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final AgentFlowSessionContext context;

    
    public AgentFlowSessionContext getContext() {
        return context;
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
        sb.append("CreateAgentFlowSessionDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentFlowSessionDetails)) {
            return false;
        }

        CreateAgentFlowSessionDetails other = (CreateAgentFlowSessionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.context, other.context);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        return result;
    }


}
