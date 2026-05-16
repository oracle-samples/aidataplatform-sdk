// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Large Language Model configuration
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LlmConfig.Builder.class)

public final class LlmConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId", "provider", "regionId"})
    public LlmConfig(String modelId, String provider, String regionId) {
        super();
        this.modelId = modelId;
        this.provider = provider;
        this.regionId = regionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

                /**
         * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool
         * @param modelId the value to set
         * @return this builder
         **/
        

        public Builder modelId(String modelId) {
        this.modelId = modelId;
        return this;
        }
            /**
     * The Large language model provider name
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("provider")
        private String provider;

                /**
         * The Large language model provider name
         * @param provider the value to set
         * @return this builder
         **/
        

        public Builder provider(String provider) {
        this.provider = provider;
        return this;
        }
            /**
     * The Large language model Region ID
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

                /**
         * The Large language model Region ID
         * @param regionId the value to set
         * @return this builder
         **/
        

        public Builder regionId(String regionId) {
        this.regionId = regionId;
        return this;
        }


        public LlmConfig build() {
            LlmConfig model = new LlmConfig(this.modelId
                    , this.provider
                    , this.regionId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmConfig model) {
                this.modelId(model.getModelId());
    this.provider(model.getProvider());
    this.regionId(model.getRegionId());
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
     * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

        /**
     * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * The Large language model provider name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final String provider;

        /**
     * The Large language model provider name
     * @return the value
     **/
    
    public String getProvider() {
        return provider;
    }


        /**
     * The Large language model Region ID
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

        /**
     * The Large language model Region ID
     * @return the value
     **/
    
    public String getRegionId() {
        return regionId;
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
        sb.append("LlmConfig(");
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", provider=").append(String.valueOf(this.provider));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LlmConfig)) {
            return false;
        }

        LlmConfig other = (LlmConfig) o;
        return java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.provider, other.provider) &&
            java.util.Objects.equals(this.regionId, other.regionId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        return result;
    }


}
