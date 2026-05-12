package com.oracle.aidataplatform.dp.model;


/**
 * Memory configuration for an agent node.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MemoryConfiguration.Builder.class)

public final class MemoryConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "limit", "memoryProperties"})
    public MemoryConfiguration(Boolean isEnabled, MemoryLimitConfiguration limit, java.util.Map<String, Object> memoryProperties) {
        super();
        this.isEnabled = isEnabled;
        this.limit = limit;
        this.memoryProperties = memoryProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

                /**
         * Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

        public Builder isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private MemoryLimitConfiguration limit;

        

        public Builder limit(MemoryLimitConfiguration limit) {
        this.limit = limit;
        return this;
        }
            /**
     * Some extra named memory properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("memoryProperties")
        private java.util.Map<String, Object> memoryProperties;

                /**
         * Some extra named memory properties.
         * @param memoryProperties the value to set
         * @return this builder
         **/
        

        public Builder memoryProperties(java.util.Map<String, Object> memoryProperties) {
        this.memoryProperties = memoryProperties;
        return this;
        }


        public MemoryConfiguration build() {
            MemoryConfiguration model = new MemoryConfiguration(this.isEnabled
                    , this.limit
                    , this.memoryProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemoryConfiguration model) {
                this.isEnabled(model.getIsEnabled());
    this.limit(model.getLimit());
    this.memoryProperties(model.getMemoryProperties());
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
     * Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether agent memory is enabled. When disabled, no conversation history is injected into the LLM context window.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final MemoryLimitConfiguration limit;

    
    public MemoryLimitConfiguration getLimit() {
        return limit;
    }


        /**
     * Some extra named memory properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("memoryProperties")
    private final java.util.Map<String, Object> memoryProperties;

        /**
     * Some extra named memory properties.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getMemoryProperties() {
        return memoryProperties;
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
        sb.append("MemoryConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", memoryProperties=").append(String.valueOf(this.memoryProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemoryConfiguration)) {
            return false;
        }

        MemoryConfiguration other = (MemoryConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.limit, other.limit) &&
            java.util.Objects.equals(this.memoryProperties, other.memoryProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.memoryProperties == null ? 43 : this.memoryProperties.hashCode());
        return result;
    }


}
