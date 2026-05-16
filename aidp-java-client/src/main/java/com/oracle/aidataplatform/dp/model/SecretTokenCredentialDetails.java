// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Credential details for storing secret tokens or API keys. This extends the base CredentialDetails
* object, with the credential type set as SECRET_TOKEN.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SecretTokenCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="credentialType")

public final class SecretTokenCredentialDetails extends CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A list of secret key-value pairs used as secret tokens or API keys.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("secretTokenPair")
private java.util.List<SecretPair> secretTokenPair;

        /**
         * A list of secret key-value pairs used as secret tokens or API keys.
         * @param secretTokenPair the value to set
         * @return this builder
         **/
        

public Builder secretTokenPair(java.util.List<SecretPair> secretTokenPair) {
    this.secretTokenPair = secretTokenPair;
    return this;
}


        public SecretTokenCredentialDetails build() {
            SecretTokenCredentialDetails model = new SecretTokenCredentialDetails(this.secretTokenPair);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretTokenCredentialDetails model) {
                this.secretTokenPair(model.getSecretTokenPair());
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
    public SecretTokenCredentialDetails(java.util.List<SecretPair> secretTokenPair) {
    super();
        this.secretTokenPair = secretTokenPair;
    }


        /**
     * A list of secret key-value pairs used as secret tokens or API keys.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("secretTokenPair")
    private final java.util.List<SecretPair> secretTokenPair;

        /**
     * A list of secret key-value pairs used as secret tokens or API keys.
     * @return the value
     **/
    
    public java.util.List<SecretPair> getSecretTokenPair() {
        return secretTokenPair;
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
        sb.append("SecretTokenCredentialDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretTokenPair=").append(String.valueOf(this.secretTokenPair));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretTokenCredentialDetails)) {
            return false;
        }

        SecretTokenCredentialDetails other = (SecretTokenCredentialDetails) o;
        return java.util.Objects.equals(this.secretTokenPair, other.secretTokenPair) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretTokenPair == null ? 43 : this.secretTokenPair.hashCode());
        return result;
    }


}
