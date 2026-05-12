package com.oracle.aidataplatform.dp.model;


/**
 * Credential details for referencing existing secrets managed outside the IDL. This extends
* the base CredentialDetails object, with the credential type set as VAULT_REFERENCE.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=VaultReferenceCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="credentialType")

public final class VaultReferenceCredentialDetails extends CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The OCID of the external secret to reference.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

                /**
         * The OCID of the external secret to reference.
         * @param secretId the value to set
         * @return this builder
         **/
        

        public Builder secretId(String secretId) {
        this.secretId = secretId;
        return this;
        }


        public VaultReferenceCredentialDetails build() {
            VaultReferenceCredentialDetails model = new VaultReferenceCredentialDetails(this.secretId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultReferenceCredentialDetails model) {
                this.secretId(model.getSecretId());
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
    public VaultReferenceCredentialDetails(String secretId) {
        super();
        this.secretId = secretId;
    }


        /**
     * The OCID of the external secret to reference.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

        /**
     * The OCID of the external secret to reference.
     * @return the value
     **/
    
    public String getSecretId() {
        return secretId;
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
        sb.append("VaultReferenceCredentialDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretId=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultReferenceCredentialDetails)) {
            return false;
        }

        VaultReferenceCredentialDetails other = (VaultReferenceCredentialDetails) o;
        return java.util.Objects.equals(this.secretId, other.secretId) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        return result;
    }


}
