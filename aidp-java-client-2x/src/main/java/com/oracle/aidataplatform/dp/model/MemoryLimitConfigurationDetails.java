// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Configuration details for memory limits.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MemoryLimitConfigurationDetails.Builder.class)

public final class MemoryLimitConfigurationDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"messageLimit", "tokenLimit"})
    public MemoryLimitConfigurationDetails(Integer messageLimit, Integer tokenLimit) {
        super();
        this.messageLimit = messageLimit;
        this.tokenLimit = tokenLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Message-count limit for truncation middleware.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("messageLimit")
        private Integer messageLimit;

                /**
         * Message-count limit for truncation middleware.
         * @param messageLimit the value to set
         * @return this builder
         **/
        

        public Builder messageLimit(Integer messageLimit) {
        this.messageLimit = messageLimit;
        return this;
        }
            /**
     * Approximate token-count limit for truncation middleware.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tokenLimit")
        private Integer tokenLimit;

                /**
         * Approximate token-count limit for truncation middleware.
         * @param tokenLimit the value to set
         * @return this builder
         **/
        

        public Builder tokenLimit(Integer tokenLimit) {
        this.tokenLimit = tokenLimit;
        return this;
        }


        public MemoryLimitConfigurationDetails build() {
            MemoryLimitConfigurationDetails model = new MemoryLimitConfigurationDetails(this.messageLimit
                    , this.tokenLimit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemoryLimitConfigurationDetails model) {
                this.messageLimit(model.getMessageLimit());
    this.tokenLimit(model.getTokenLimit());
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
     * Message-count limit for truncation middleware.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("messageLimit")
    private final Integer messageLimit;

        /**
     * Message-count limit for truncation middleware.
     * @return the value
     **/
    
    public Integer getMessageLimit() {
        return messageLimit;
    }


        /**
     * Approximate token-count limit for truncation middleware.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tokenLimit")
    private final Integer tokenLimit;

        /**
     * Approximate token-count limit for truncation middleware.
     * @return the value
     **/
    
    public Integer getTokenLimit() {
        return tokenLimit;
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
        sb.append("MemoryLimitConfigurationDetails(");
        sb.append("messageLimit=").append(String.valueOf(this.messageLimit));
        sb.append(", tokenLimit=").append(String.valueOf(this.tokenLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemoryLimitConfigurationDetails)) {
            return false;
        }

        MemoryLimitConfigurationDetails other = (MemoryLimitConfigurationDetails) o;
        return java.util.Objects.equals(this.messageLimit, other.messageLimit) &&
            java.util.Objects.equals(this.tokenLimit, other.tokenLimit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageLimit == null ? 43 : this.messageLimit.hashCode());
        result = (result * PRIME) + (this.tokenLimit == null ? 43 : this.tokenLimit.hashCode());
        return result;
    }


}
