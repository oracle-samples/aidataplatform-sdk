// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Result of listing agent flow deployments of an agent flow.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowDeploymentCollection.Builder.class)

public final class AgentFlowDeploymentCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public AgentFlowDeploymentCollection(java.util.List<AgentFlowDeploymentSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of Agent Flow Deployments.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AgentFlowDeploymentSummary> items;

                /**
         * List of Agent Flow Deployments.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<AgentFlowDeploymentSummary> items) {
        this.items = items;
        return this;
        }


        public AgentFlowDeploymentCollection build() {
            AgentFlowDeploymentCollection model = new AgentFlowDeploymentCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowDeploymentCollection model) {
                this.items(model.getItems());
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
     * List of Agent Flow Deployments.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AgentFlowDeploymentSummary> items;

        /**
     * List of Agent Flow Deployments.
     * @return the value
     **/
    
    public java.util.List<AgentFlowDeploymentSummary> getItems() {
        return items;
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
        sb.append("AgentFlowDeploymentCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowDeploymentCollection)) {
            return false;
        }

        AgentFlowDeploymentCollection other = (AgentFlowDeploymentCollection) o;
        return java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
