// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Attachment info of an Agent Flow.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowAttachment.Builder.class)

public final class AgentFlowAttachment  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowComputeKey", "agentFlowKey"})
    public AgentFlowAttachment(String agentFlowComputeKey, String agentFlowKey) {
        super();
        this.agentFlowComputeKey = agentFlowComputeKey;
        this.agentFlowKey = agentFlowKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowComputeKey")
        private String agentFlowComputeKey;

                /**
         * The key of the Agent Flow Compute associated with this Agent Flow
         * @param agentFlowComputeKey the value to set
         * @return this builder
         **/
        

        public Builder agentFlowComputeKey(String agentFlowComputeKey) {
        this.agentFlowComputeKey = agentFlowComputeKey;
        return this;
        }
            /**
     * The unique identifier (UUID) of the Agent flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
        private String agentFlowKey;

                /**
         * The unique identifier (UUID) of the Agent flow
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

        public Builder agentFlowKey(String agentFlowKey) {
        this.agentFlowKey = agentFlowKey;
        return this;
        }


        public AgentFlowAttachment build() {
            AgentFlowAttachment model = new AgentFlowAttachment(this.agentFlowComputeKey
                    , this.agentFlowKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowAttachment model) {
                this.agentFlowComputeKey(model.getAgentFlowComputeKey());
    this.agentFlowKey(model.getAgentFlowKey());
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
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowComputeKey")
    private final String agentFlowComputeKey;

        /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     * @return the value
     **/
    
    public String getAgentFlowComputeKey() {
        return agentFlowComputeKey;
    }


        /**
     * The unique identifier (UUID) of the Agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * The unique identifier (UUID) of the Agent flow
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
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
        sb.append("AgentFlowAttachment(");
        sb.append("agentFlowComputeKey=").append(String.valueOf(this.agentFlowComputeKey));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowAttachment)) {
            return false;
        }

        AgentFlowAttachment other = (AgentFlowAttachment) o;
        return java.util.Objects.equals(this.agentFlowComputeKey, other.agentFlowComputeKey) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowComputeKey == null ? 43 : this.agentFlowComputeKey.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        return result;
    }


}
