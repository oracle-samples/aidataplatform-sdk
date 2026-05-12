package com.oracle.aidataplatform.dp.model;


/**
 * Agent flow session context.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowSessionContext.Builder.class)

public final class AgentFlowSessionContext  {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionConfig"})
    public AgentFlowSessionContext(SessionRetentionConfiguration retentionConfig) {
        super();
        this.retentionConfig = retentionConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("retentionConfig")
        private SessionRetentionConfiguration retentionConfig;

        

        public Builder retentionConfig(SessionRetentionConfiguration retentionConfig) {
        this.retentionConfig = retentionConfig;
        return this;
        }


        public AgentFlowSessionContext build() {
            AgentFlowSessionContext model = new AgentFlowSessionContext(this.retentionConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowSessionContext model) {
                this.retentionConfig(model.getRetentionConfig());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionConfig")
    private final SessionRetentionConfiguration retentionConfig;

    
    public SessionRetentionConfiguration getRetentionConfig() {
        return retentionConfig;
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
        sb.append("AgentFlowSessionContext(");
        sb.append("retentionConfig=").append(String.valueOf(this.retentionConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowSessionContext)) {
            return false;
        }

        AgentFlowSessionContext other = (AgentFlowSessionContext) o;
        return java.util.Objects.equals(this.retentionConfig, other.retentionConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.retentionConfig == null ? 43 : this.retentionConfig.hashCode());
        return result;
    }


}
