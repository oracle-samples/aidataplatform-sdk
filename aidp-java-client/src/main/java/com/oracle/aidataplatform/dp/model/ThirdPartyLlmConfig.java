// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Third-party/BYO Large Language Model configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ThirdPartyLlmConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class ThirdPartyLlmConfig extends BaseLlmConfig {
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
     * The third-party provider wire value; currently openai, anthropic, or gemini.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("provider")
private ThirdPartyLlmProvider provider;

        /**
         * The third-party provider wire value; currently openai, anthropic, or gemini.
         * @param provider the value to set
         * @return this builder
         **/
        

public Builder provider(ThirdPartyLlmProvider provider) {
    this.provider = provider;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("apiKeyCredstoreRef")
private CredentialV2NameAndSecretKey apiKeyCredstoreRef;



public Builder apiKeyCredstoreRef(CredentialV2NameAndSecretKey apiKeyCredstoreRef) {
    this.apiKeyCredstoreRef = apiKeyCredstoreRef;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("llmConnectionSettings")
private LlmConnectionSettings llmConnectionSettings;



public Builder llmConnectionSettings(LlmConnectionSettings llmConnectionSettings) {
    this.llmConnectionSettings = llmConnectionSettings;
    return this;
}


        public ThirdPartyLlmConfig build() {
            ThirdPartyLlmConfig model = new ThirdPartyLlmConfig(this.modelId
                , this.compartmentId
                , this.endpointUrl
                , this.provider
                , this.apiKeyCredstoreRef
                , this.llmConnectionSettings);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThirdPartyLlmConfig model) {
                this.modelId(model.getModelId());
    this.compartmentId(model.getCompartmentId());
    this.endpointUrl(model.getEndpointUrl());
    this.provider(model.getProvider());
    this.apiKeyCredstoreRef(model.getApiKeyCredstoreRef());
    this.llmConnectionSettings(model.getLlmConnectionSettings());
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
    public ThirdPartyLlmConfig(String modelId, String compartmentId, String endpointUrl, ThirdPartyLlmProvider provider, CredentialV2NameAndSecretKey apiKeyCredstoreRef, LlmConnectionSettings llmConnectionSettings) {
    super(modelId, compartmentId, endpointUrl);
        this.provider = provider;
        this.apiKeyCredstoreRef = apiKeyCredstoreRef;
        this.llmConnectionSettings = llmConnectionSettings;
    }

    
        /**
     * The third-party provider wire value; currently openai, anthropic, or gemini.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final ThirdPartyLlmProvider provider;

        /**
     * The third-party provider wire value; currently openai, anthropic, or gemini.
     * @return the value
     **/
    
    public ThirdPartyLlmProvider getProvider() {
        return provider;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("apiKeyCredstoreRef")
    private final CredentialV2NameAndSecretKey apiKeyCredstoreRef;

    
    public CredentialV2NameAndSecretKey getApiKeyCredstoreRef() {
        return apiKeyCredstoreRef;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("llmConnectionSettings")
    private final LlmConnectionSettings llmConnectionSettings;

    
    public LlmConnectionSettings getLlmConnectionSettings() {
        return llmConnectionSettings;
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
        sb.append("ThirdPartyLlmConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", provider=").append(String.valueOf(this.provider));
        sb.append(", apiKeyCredstoreRef=").append(String.valueOf(this.apiKeyCredstoreRef));
        sb.append(", llmConnectionSettings=").append(String.valueOf(this.llmConnectionSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThirdPartyLlmConfig)) {
            return false;
        }

        ThirdPartyLlmConfig other = (ThirdPartyLlmConfig) o;
        return java.util.Objects.equals(this.provider, other.provider) &&
            java.util.Objects.equals(this.apiKeyCredstoreRef, other.apiKeyCredstoreRef) &&
            java.util.Objects.equals(this.llmConnectionSettings, other.llmConnectionSettings) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.apiKeyCredstoreRef == null ? 43 : this.apiKeyCredstoreRef.hashCode());
        result = (result * PRIME) + (this.llmConnectionSettings == null ? 43 : this.llmConnectionSettings.hashCode());
        return result;
    }


}
