// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * OCI Generative AI Large Language Model configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LlmConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class LlmConfig extends BaseLlmConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
private String modelId;

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
private String compartmentId;

public Builder compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
private String endpointUrl;

public Builder endpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
}
            /**
     * The OCI Generative AI provider name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("provider")
private String provider;

        /**
         * The OCI Generative AI provider name.
         * @param provider the value to set
         * @return this builder
         **/
        

public Builder provider(String provider) {
    this.provider = provider;
    return this;
}
            /**
     * The OCI Generative AI region ID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("regionId")
private String regionId;

        /**
         * The OCI Generative AI region ID.
         * @param regionId the value to set
         * @return this builder
         **/
        

public Builder regionId(String regionId) {
    this.regionId = regionId;
    return this;
}


        public LlmConfig build() {
            LlmConfig model = new LlmConfig(this.modelId
                , this.compartmentId
                , this.endpointUrl
                , this.provider
                , this.regionId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmConfig model) {
                this.modelId(model.getModelId());
    this.compartmentId(model.getCompartmentId());
    this.endpointUrl(model.getEndpointUrl());
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

    
    @Deprecated
    public LlmConfig(String modelId, String compartmentId, String endpointUrl, String provider, String regionId) {
    super(modelId, compartmentId, endpointUrl);
        this.provider = provider;
        this.regionId = regionId;
    }


        /**
     * The OCI Generative AI provider name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final String provider;

        /**
     * The OCI Generative AI provider name.
     * @return the value
     **/
    
    public String getProvider() {
        return provider;
    }


        /**
     * The OCI Generative AI region ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

        /**
     * The OCI Generative AI region ID.
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
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
        return java.util.Objects.equals(this.provider, other.provider) &&
            java.util.Objects.equals(this.regionId, other.regionId) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        return result;
    }


}
