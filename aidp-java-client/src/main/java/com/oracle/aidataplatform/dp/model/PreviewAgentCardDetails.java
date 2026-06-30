// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for previewing an agent card.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PreviewAgentCardDetails.Builder.class)

public final class PreviewAgentCardDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentCardConfigDetails"})
    public PreviewAgentCardDetails(AgentCardConfigDetail agentCardConfigDetails) {
        super();
        this.agentCardConfigDetails = agentCardConfigDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("agentCardConfigDetails")
private AgentCardConfigDetail agentCardConfigDetails;



public Builder agentCardConfigDetails(AgentCardConfigDetail agentCardConfigDetails) {
    this.agentCardConfigDetails = agentCardConfigDetails;
    return this;
}


        public PreviewAgentCardDetails build() {
            PreviewAgentCardDetails model = new PreviewAgentCardDetails(this.agentCardConfigDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreviewAgentCardDetails model) {
                this.agentCardConfigDetails(model.getAgentCardConfigDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardConfigDetails")
    private final AgentCardConfigDetail agentCardConfigDetails;

    
    public AgentCardConfigDetail getAgentCardConfigDetails() {
        return agentCardConfigDetails;
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
        sb.append("PreviewAgentCardDetails(");
        sb.append("agentCardConfigDetails=").append(String.valueOf(this.agentCardConfigDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreviewAgentCardDetails)) {
            return false;
        }

        PreviewAgentCardDetails other = (PreviewAgentCardDetails) o;
        return java.util.Objects.equals(this.agentCardConfigDetails, other.agentCardConfigDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentCardConfigDetails == null ? 43 : this.agentCardConfigDetails.hashCode());
        return result;
    }


}
