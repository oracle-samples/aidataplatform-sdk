// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration for automatic summarization of an Agent Flow session's conversation history. If omitted, automatic summarization is disabled.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AutomaticSummarizationConfiguration.Builder.class)

public final class AutomaticSummarizationConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled"})
    public AutomaticSummarizationConfiguration(Boolean isEnabled) {
        super();
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}


        public AutomaticSummarizationConfiguration build() {
            AutomaticSummarizationConfiguration model = new AutomaticSummarizationConfiguration(this.isEnabled);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutomaticSummarizationConfiguration model) {
                this.isEnabled(model.getIsEnabled());
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
     * Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("AutomaticSummarizationConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutomaticSummarizationConfiguration)) {
            return false;
        }

        AutomaticSummarizationConfiguration other = (AutomaticSummarizationConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        return result;
    }


}
