// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request details when toolType = RAG.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestRagToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class TestRagToolDetails extends TestToolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
private String agentFlowId;

public Builder agentFlowId(String agentFlowId) {
    this.agentFlowId = agentFlowId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("config")
private RagToolConfiguration config;



public Builder config(RagToolConfiguration config) {
    this.config = config;
    return this;
}
            /**
     * The user query or instruction to be augmented with retrieved context.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("query")
private String query;

        /**
         * The user query or instruction to be augmented with retrieved context.
         * @param query the value to set
         * @return this builder
         **/
        

public Builder query(String query) {
    this.query = query;
    return this;
}


        public TestRagToolDetails build() {
            TestRagToolDetails model = new TestRagToolDetails(this.agentFlowId
                , this.config
                , this.query);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestRagToolDetails model) {
                this.agentFlowId(model.getAgentFlowId());
    this.config(model.getConfig());
    this.query(model.getQuery());
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
    public TestRagToolDetails(String agentFlowId, RagToolConfiguration config, String query) {
    super(agentFlowId);
        this.config = config;
        this.query = query;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final RagToolConfiguration config;

    
    public RagToolConfiguration getConfig() {
        return config;
    }


        /**
     * The user query or instruction to be augmented with retrieved context.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * The user query or instruction to be augmented with retrieved context.
     * @return the value
     **/
    
    public String getQuery() {
        return query;
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
        sb.append("TestRagToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestRagToolDetails)) {
            return false;
        }

        TestRagToolDetails other = (TestRagToolDetails) o;
        return java.util.Objects.equals(this.config, other.config) &&
            java.util.Objects.equals(this.query, other.query) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        return result;
    }


}
