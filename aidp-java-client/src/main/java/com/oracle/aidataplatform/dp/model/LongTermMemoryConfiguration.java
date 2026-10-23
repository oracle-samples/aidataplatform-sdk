// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration for Oracle Agent Memory long-term memory. When enabled, llmConfig selects the OCI Generative AI model used for memory extraction and summarization.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LongTermMemoryConfiguration.Builder.class)

public final class LongTermMemoryConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "shareBetweenChatThreads", "llmConfig"})
    public LongTermMemoryConfiguration(Boolean isEnabled, Boolean shareBetweenChatThreads, LlmConfig llmConfig) {
        super();
        this.isEnabled = isEnabled;
        this.shareBetweenChatThreads = shareBetweenChatThreads;
        this.llmConfig = llmConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
            /**
     * Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shareBetweenChatThreads")
private Boolean shareBetweenChatThreads;

        /**
         * Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.
         * @param shareBetweenChatThreads the value to set
         * @return this builder
         **/
        

public Builder shareBetweenChatThreads(Boolean shareBetweenChatThreads) {
    this.shareBetweenChatThreads = shareBetweenChatThreads;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("llmConfig")
private LlmConfig llmConfig;



public Builder llmConfig(LlmConfig llmConfig) {
    this.llmConfig = llmConfig;
    return this;
}


        public LongTermMemoryConfiguration build() {
            LongTermMemoryConfiguration model = new LongTermMemoryConfiguration(this.isEnabled
                , this.shareBetweenChatThreads
                , this.llmConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LongTermMemoryConfiguration model) {
                this.isEnabled(model.getIsEnabled());
    this.shareBetweenChatThreads(model.getShareBetweenChatThreads());
    this.llmConfig(model.getLlmConfig());
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
     * UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


        /**
     * Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shareBetweenChatThreads")
    private final Boolean shareBetweenChatThreads;

        /**
     * Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.
     * @return the value
     **/
    
    public Boolean getShareBetweenChatThreads() {
        return shareBetweenChatThreads;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("llmConfig")
    private final LlmConfig llmConfig;

    
    public LlmConfig getLlmConfig() {
        return llmConfig;
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
        sb.append("LongTermMemoryConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", shareBetweenChatThreads=").append(String.valueOf(this.shareBetweenChatThreads));
        sb.append(", llmConfig=").append(String.valueOf(this.llmConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LongTermMemoryConfiguration)) {
            return false;
        }

        LongTermMemoryConfiguration other = (LongTermMemoryConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.shareBetweenChatThreads, other.shareBetweenChatThreads) &&
            java.util.Objects.equals(this.llmConfig, other.llmConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.shareBetweenChatThreads == null ? 43 : this.shareBetweenChatThreads.hashCode());
        result = (result * PRIME) + (this.llmConfig == null ? 43 : this.llmConfig.hashCode());
        return result;
    }


}
