// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to create a new session of an agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAgentSessionDetails.Builder.class)

public final class CreateAgentSessionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "agentKey", "context"})
    public CreateAgentSessionDetails(String displayName, String agentKey, AgentSessionContext context) {
        super();
        this.displayName = displayName;
        this.agentKey = agentKey;
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
     * The Agent key for which the session is started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentKey")
private String agentKey;

        /**
         * The Agent key for which the session is started.
         * @param agentKey the value to set
         * @return this builder
         **/
        

public Builder agentKey(String agentKey) {
    this.agentKey = agentKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("context")
private AgentSessionContext context;



public Builder context(AgentSessionContext context) {
    this.context = context;
    return this;
}


        public CreateAgentSessionDetails build() {
            CreateAgentSessionDetails model = new CreateAgentSessionDetails(this.displayName
                , this.agentKey
                , this.context);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentSessionDetails model) {
                this.displayName(model.getDisplayName());
    this.agentKey(model.getAgentKey());
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
     * The Agent key for which the session is started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentKey")
    private final String agentKey;

        /**
     * The Agent key for which the session is started.
     * @return the value
     **/
    
    public String getAgentKey() {
        return agentKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final AgentSessionContext context;

    
    public AgentSessionContext getContext() {
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
        sb.append("CreateAgentSessionDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentSessionDetails)) {
            return false;
        }

        CreateAgentSessionDetails other = (CreateAgentSessionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.context, other.context);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        return result;
    }


}
