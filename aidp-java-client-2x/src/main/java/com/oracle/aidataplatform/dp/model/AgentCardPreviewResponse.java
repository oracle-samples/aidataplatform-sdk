// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Response for previewing an agent card.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentCardPreviewResponse.Builder.class)

public final class AgentCardPreviewResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentCardJson"})
    public AgentCardPreviewResponse(String agentCardJson) {
        super();
        this.agentCardJson = agentCardJson;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * JSON string representation of AgentCard
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentCardJson")
        private String agentCardJson;

                /**
         * JSON string representation of AgentCard
         * @param agentCardJson the value to set
         * @return this builder
         **/
        

        public Builder agentCardJson(String agentCardJson) {
        this.agentCardJson = agentCardJson;
        return this;
        }


        public AgentCardPreviewResponse build() {
            AgentCardPreviewResponse model = new AgentCardPreviewResponse(this.agentCardJson);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentCardPreviewResponse model) {
                this.agentCardJson(model.getAgentCardJson());
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
     * JSON string representation of AgentCard
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardJson")
    private final String agentCardJson;

        /**
     * JSON string representation of AgentCard
     * @return the value
     **/
    
    public String getAgentCardJson() {
        return agentCardJson;
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
        sb.append("AgentCardPreviewResponse(");
        sb.append("agentCardJson=").append(String.valueOf(this.agentCardJson));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentCardPreviewResponse)) {
            return false;
        }

        AgentCardPreviewResponse other = (AgentCardPreviewResponse) o;
        return java.util.Objects.equals(this.agentCardJson, other.agentCardJson);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentCardJson == null ? 43 : this.agentCardJson.hashCode());
        return result;
    }


}
