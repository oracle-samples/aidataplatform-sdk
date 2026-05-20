// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Capabilities included in publish request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentCardCapabilitiesDetail.Builder.class)

public final class AgentCardCapabilitiesDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"isStreaming"})
    public AgentCardCapabilitiesDetail(Boolean isStreaming) {
        super();
        this.isStreaming = isStreaming;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Indicates whether streaming responses are supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isStreaming")
private Boolean isStreaming;

        /**
         * Indicates whether streaming responses are supported.
         * @param isStreaming the value to set
         * @return this builder
         **/
        

public Builder isStreaming(Boolean isStreaming) {
    this.isStreaming = isStreaming;
    return this;
}


        public AgentCardCapabilitiesDetail build() {
            AgentCardCapabilitiesDetail model = new AgentCardCapabilitiesDetail(this.isStreaming);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentCardCapabilitiesDetail model) {
                this.isStreaming(model.getIsStreaming());
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
     * Indicates whether streaming responses are supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isStreaming")
    private final Boolean isStreaming;

        /**
     * Indicates whether streaming responses are supported.
     * @return the value
     **/
    
    public Boolean getIsStreaming() {
        return isStreaming;
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
        sb.append("AgentCardCapabilitiesDetail(");
        sb.append("isStreaming=").append(String.valueOf(this.isStreaming));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentCardCapabilitiesDetail)) {
            return false;
        }

        AgentCardCapabilitiesDetail other = (AgentCardCapabilitiesDetail) o;
        return java.util.Objects.equals(this.isStreaming, other.isStreaming);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isStreaming == null ? 43 : this.isStreaming.hashCode());
        return result;
    }


}
