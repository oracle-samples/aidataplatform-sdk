// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Represents a key-value pair for a secret, consisting of a secret key and its corresponding value.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SecretPair.Builder.class)

public final class SecretPair  {
    @Deprecated
    @java.beans.ConstructorProperties({"secretKey", "secretValue"})
    public SecretPair(String secretKey, String secretValue) {
        super();
        this.secretKey = secretKey;
        this.secretValue = secretValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The secret key. The minimum length is 1 character and the maximum is 255 characters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

                /**
         * The secret key. The minimum length is 1 character and the maximum is 255 characters.
         * @param secretKey the value to set
         * @return this builder
         **/
        

        public Builder secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
        }
            /**
     * The secret value. The minimum length is 1 character and the maximum is 1 MB.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("secretValue")
        private String secretValue;

                /**
         * The secret value. The minimum length is 1 character and the maximum is 1 MB.
         * @param secretValue the value to set
         * @return this builder
         **/
        

        public Builder secretValue(String secretValue) {
        this.secretValue = secretValue;
        return this;
        }


        public SecretPair build() {
            SecretPair model = new SecretPair(this.secretKey
                    , this.secretValue);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretPair model) {
                this.secretKey(model.getSecretKey());
    this.secretValue(model.getSecretValue());
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
     * The secret key. The minimum length is 1 character and the maximum is 255 characters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

        /**
     * The secret key. The minimum length is 1 character and the maximum is 255 characters.
     * @return the value
     **/
    
    public String getSecretKey() {
        return secretKey;
    }


        /**
     * The secret value. The minimum length is 1 character and the maximum is 1 MB.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("secretValue")
    private final String secretValue;

        /**
     * The secret value. The minimum length is 1 character and the maximum is 1 MB.
     * @return the value
     **/
    
    public String getSecretValue() {
        return secretValue;
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
        sb.append("SecretPair(");
        sb.append("secretKey=").append(String.valueOf(this.secretKey));
        sb.append(", secretValue=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretPair)) {
            return false;
        }

        SecretPair other = (SecretPair) o;
        return java.util.Objects.equals(this.secretKey, other.secretKey) &&
            java.util.Objects.equals(this.secretValue, other.secretValue);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        result = (result * PRIME) + (this.secretValue == null ? 43 : this.secretValue.hashCode());
        return result;
    }


}
