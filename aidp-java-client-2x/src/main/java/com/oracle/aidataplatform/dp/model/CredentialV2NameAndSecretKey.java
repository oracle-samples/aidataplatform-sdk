// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Represents the name of a credential and an optional secret key name used when
* retrieving details via GetDataLakeCredentialByName.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CredentialV2NameAndSecretKey.Builder.class)

public final class CredentialV2NameAndSecretKey  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "secretKey"})
    public CredentialV2NameAndSecretKey(String displayName, String secretKey) {
        super();
        this.displayName = displayName;
        this.secretKey = secretKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * The secret key name to filter SecretToken credentials.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

                /**
         * The secret key name to filter SecretToken credentials.
         * @param secretKey the value to set
         * @return this builder
         **/
        

        public Builder secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
        }


        public CredentialV2NameAndSecretKey build() {
            CredentialV2NameAndSecretKey model = new CredentialV2NameAndSecretKey(this.displayName
                    , this.secretKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialV2NameAndSecretKey model) {
                this.displayName(model.getDisplayName());
    this.secretKey(model.getSecretKey());
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
     * The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The display name of the credential. Must start with a letter and contain only letters, numbers, or underscores.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The secret key name to filter SecretToken credentials.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

        /**
     * The secret key name to filter SecretToken credentials.
     * @return the value
     **/
    
    public String getSecretKey() {
        return secretKey;
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
        sb.append("CredentialV2NameAndSecretKey(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", secretKey=").append(String.valueOf(this.secretKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialV2NameAndSecretKey)) {
            return false;
        }

        CredentialV2NameAndSecretKey other = (CredentialV2NameAndSecretKey) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.secretKey, other.secretKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        return result;
    }


}
