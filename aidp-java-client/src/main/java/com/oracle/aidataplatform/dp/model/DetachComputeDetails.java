// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to detach an agent flow to a compute
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DetachComputeDetails.Builder.class)

public final class DetachComputeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowComputeKey"})
    public DetachComputeDetails(String agentFlowComputeKey) {
        super();
        this.agentFlowComputeKey = agentFlowComputeKey;
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


        public DetachComputeDetails build() {
            DetachComputeDetails model = new DetachComputeDetails(this.agentFlowComputeKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetachComputeDetails model) {
                this.agentFlowComputeKey(model.getAgentFlowComputeKey());
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
        sb.append("DetachComputeDetails(");
        sb.append("agentFlowComputeKey=").append(String.valueOf(this.agentFlowComputeKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachComputeDetails)) {
            return false;
        }

        DetachComputeDetails other = (DetachComputeDetails) o;
        return java.util.Objects.equals(this.agentFlowComputeKey, other.agentFlowComputeKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowComputeKey == null ? 43 : this.agentFlowComputeKey.hashCode());
        return result;
    }


}
