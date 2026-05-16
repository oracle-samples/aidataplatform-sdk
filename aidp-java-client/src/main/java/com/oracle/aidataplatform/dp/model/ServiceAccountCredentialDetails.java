// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Credential details for representing service account object. This extends
* the base CredentialDetails object, with the credential type set as SERVICE_ACCOUNT.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ServiceAccountCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="credentialType")

public final class ServiceAccountCredentialDetails extends CredentialDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the user for the service account.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("userId")
private String userId;

        /**
         * The OCID of the user for the service account.
         * @param userId the value to set
         * @return this builder
         **/
        

public Builder userId(String userId) {
    this.userId = userId;
    return this;
}
            /**
     * The fingerprint of the service account's API key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
private String fingerprint;

        /**
         * The fingerprint of the service account's API key.
         * @param fingerprint the value to set
         * @return this builder
         **/
        

public Builder fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
}
            /**
     * The OCID of the tenancy for the service account.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tenancy")
private String tenancy;

        /**
         * The OCID of the tenancy for the service account.
         * @param tenancy the value to set
         * @return this builder
         **/
        

public Builder tenancy(String tenancy) {
    this.tenancy = tenancy;
    return this;
}
            /**
     * The region for the service account (e.g., us-ashburn-1).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("region")
private String region;

        /**
         * The region for the service account (e.g., us-ashburn-1).
         * @param region the value to set
         * @return this builder
         **/
        

public Builder region(String region) {
    this.region = region;
    return this;
}
            /**
     * Whether the credentials are read-only.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
private Boolean isReadOnly;

        /**
         * Whether the credentials are read-only.
         * @param isReadOnly the value to set
         * @return this builder
         **/
        

public Builder isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
}
            /**
     * The private key associated with the service account.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("privateKey")
private String privateKey;

        /**
         * The private key associated with the service account.
         * @param privateKey the value to set
         * @return this builder
         **/
        

public Builder privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
}


        public ServiceAccountCredentialDetails build() {
            ServiceAccountCredentialDetails model = new ServiceAccountCredentialDetails(this.userId
                , this.fingerprint
                , this.tenancy
                , this.region
                , this.isReadOnly
                , this.privateKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceAccountCredentialDetails model) {
                this.userId(model.getUserId());
    this.fingerprint(model.getFingerprint());
    this.tenancy(model.getTenancy());
    this.region(model.getRegion());
    this.isReadOnly(model.getIsReadOnly());
    this.privateKey(model.getPrivateKey());
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
    public ServiceAccountCredentialDetails(String userId, String fingerprint, String tenancy, String region, Boolean isReadOnly, String privateKey) {
    super();
        this.userId = userId;
        this.fingerprint = fingerprint;
        this.tenancy = tenancy;
        this.region = region;
        this.isReadOnly = isReadOnly;
        this.privateKey = privateKey;
    }


        /**
     * The OCID of the user for the service account.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

        /**
     * The OCID of the user for the service account.
     * @return the value
     **/
    
    public String getUserId() {
        return userId;
    }


        /**
     * The fingerprint of the service account's API key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

        /**
     * The fingerprint of the service account's API key.
     * @return the value
     **/
    
    public String getFingerprint() {
        return fingerprint;
    }


        /**
     * The OCID of the tenancy for the service account.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
    private final String tenancy;

        /**
     * The OCID of the tenancy for the service account.
     * @return the value
     **/
    
    public String getTenancy() {
        return tenancy;
    }


        /**
     * The region for the service account (e.g., us-ashburn-1).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

        /**
     * The region for the service account (e.g., us-ashburn-1).
     * @return the value
     **/
    
    public String getRegion() {
        return region;
    }


        /**
     * Whether the credentials are read-only.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

        /**
     * Whether the credentials are read-only.
     * @return the value
     **/
    
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }


        /**
     * The private key associated with the service account.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
    private final String privateKey;

        /**
     * The private key associated with the service account.
     * @return the value
     **/
    
    public String getPrivateKey() {
        return privateKey;
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
        sb.append("ServiceAccountCredentialDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", fingerprint=").append("<redacted>");
        sb.append(", tenancy=").append(String.valueOf(this.tenancy));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", privateKey=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceAccountCredentialDetails)) {
            return false;
        }

        ServiceAccountCredentialDetails other = (ServiceAccountCredentialDetails) o;
        return java.util.Objects.equals(this.userId, other.userId) &&
            java.util.Objects.equals(this.fingerprint, other.fingerprint) &&
            java.util.Objects.equals(this.tenancy, other.tenancy) &&
            java.util.Objects.equals(this.region, other.region) &&
            java.util.Objects.equals(this.isReadOnly, other.isReadOnly) &&
            java.util.Objects.equals(this.privateKey, other.privateKey) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.tenancy == null ? 43 : this.tenancy.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.privateKey == null ? 43 : this.privateKey.hashCode());
        return result;
    }


}
