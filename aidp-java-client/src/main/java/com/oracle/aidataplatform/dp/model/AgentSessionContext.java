// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Agent session context.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentSessionContext.Builder.class)

public final class AgentSessionContext  {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionConfig"})
    public AgentSessionContext(SessionRetentionConfiguration retentionConfig) {
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


        public AgentSessionContext build() {
            AgentSessionContext model = new AgentSessionContext(this.retentionConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentSessionContext model) {
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
        sb.append("AgentSessionContext(");
        sb.append("retentionConfig=").append(String.valueOf(this.retentionConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentSessionContext)) {
            return false;
        }

        AgentSessionContext other = (AgentSessionContext) o;
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
