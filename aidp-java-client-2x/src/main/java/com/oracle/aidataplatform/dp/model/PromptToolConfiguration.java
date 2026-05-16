// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can not modify their values
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PromptToolConfiguration.Builder.class)

public final class PromptToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"llm", "promptText", "modelSettings"})
    public PromptToolConfiguration(LlmConfig llm, String promptText, java.util.Map<String, Object> modelSettings) {
        super();
        this.llm = llm;
        this.promptText = promptText;
        this.modelSettings = modelSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("llm")
        private LlmConfig llm;

        

        public Builder llm(LlmConfig llm) {
        this.llm = llm;
        return this;
        }
            /**
     * The generative AI prompt
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("promptText")
        private String promptText;

                /**
         * The generative AI prompt
         * @param promptText the value to set
         * @return this builder
         **/
        

        public Builder promptText(String promptText) {
        this.promptText = promptText;
        return this;
        }
            /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
        private java.util.Map<String, Object> modelSettings;

                /**
         * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
         * @param modelSettings the value to set
         * @return this builder
         **/
        

        public Builder modelSettings(java.util.Map<String, Object> modelSettings) {
        this.modelSettings = modelSettings;
        return this;
        }


        public PromptToolConfiguration build() {
            PromptToolConfiguration model = new PromptToolConfiguration(this.llm
                    , this.promptText
                    , this.modelSettings);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromptToolConfiguration model) {
                this.llm(model.getLlm());
    this.promptText(model.getPromptText());
    this.modelSettings(model.getModelSettings());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("llm")
    private final LlmConfig llm;

    
    public LlmConfig getLlm() {
        return llm;
    }


        /**
     * The generative AI prompt
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("promptText")
    private final String promptText;

        /**
     * The generative AI prompt
     * @return the value
     **/
    
    public String getPromptText() {
        return promptText;
    }


        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
    private final java.util.Map<String, Object> modelSettings;

        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getModelSettings() {
        return modelSettings;
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
        sb.append("PromptToolConfiguration(");
        sb.append("llm=").append(String.valueOf(this.llm));
        sb.append(", promptText=").append(String.valueOf(this.promptText));
        sb.append(", modelSettings=").append(String.valueOf(this.modelSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromptToolConfiguration)) {
            return false;
        }

        PromptToolConfiguration other = (PromptToolConfiguration) o;
        return java.util.Objects.equals(this.llm, other.llm) &&
            java.util.Objects.equals(this.promptText, other.promptText) &&
            java.util.Objects.equals(this.modelSettings, other.modelSettings);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.llm == null ? 43 : this.llm.hashCode());
        result = (result * PRIME) + (this.promptText == null ? 43 : this.promptText.hashCode());
        result = (result * PRIME) + (this.modelSettings == null ? 43 : this.modelSettings.hashCode());
        return result;
    }


}
