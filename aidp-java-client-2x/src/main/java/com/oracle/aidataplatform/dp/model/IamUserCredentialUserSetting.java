// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * IAM user credential setting details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IamUserCredentialUserSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class IamUserCredentialUserSetting extends SettingData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * User OCID or User Name
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

                /**
         * User OCID or User Name
         * @param userId the value to set
         * @return this builder
         **/
        

        public Builder userId(String userId) {
        this.userId = userId;
        return this;
        }
            /**
     * Tenancy
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
        private String tenancy;

                /**
         * Tenancy
         * @param tenancy the value to set
         * @return this builder
         **/
        

        public Builder tenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
        }
            /**
     * Region
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

                /**
         * Region
         * @param region the value to set
         * @return this builder
         **/
        

        public Builder region(String region) {
        this.region = region;
        return this;
        }
            /**
     * Fingerprint
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

                /**
         * Fingerprint
         * @param fingerprint the value to set
         * @return this builder
         **/
        

        public Builder fingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
        }
            /**
     * Private API Key
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("privateApiKey")
        private String privateApiKey;

                /**
         * Private API Key
         * @param privateApiKey the value to set
         * @return this builder
         **/
        

        public Builder privateApiKey(String privateApiKey) {
        this.privateApiKey = privateApiKey;
        return this;
        }


        public IamUserCredentialUserSetting build() {
            IamUserCredentialUserSetting model = new IamUserCredentialUserSetting(this.userId
                    , this.tenancy
                    , this.region
                    , this.fingerprint
                    , this.privateApiKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IamUserCredentialUserSetting model) {
                this.userId(model.getUserId());
    this.tenancy(model.getTenancy());
    this.region(model.getRegion());
    this.fingerprint(model.getFingerprint());
    this.privateApiKey(model.getPrivateApiKey());
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
    public IamUserCredentialUserSetting(String userId, String tenancy, String region, String fingerprint, String privateApiKey) {
        super();
        this.userId = userId;
        this.tenancy = tenancy;
        this.region = region;
        this.fingerprint = fingerprint;
        this.privateApiKey = privateApiKey;
    }


        /**
     * User OCID or User Name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

        /**
     * User OCID or User Name
     * @return the value
     **/
    
    public String getUserId() {
        return userId;
    }


        /**
     * Tenancy
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tenancy")
    private final String tenancy;

        /**
     * Tenancy
     * @return the value
     **/
    
    public String getTenancy() {
        return tenancy;
    }


        /**
     * Region
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

        /**
     * Region
     * @return the value
     **/
    
    public String getRegion() {
        return region;
    }


        /**
     * Fingerprint
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

        /**
     * Fingerprint
     * @return the value
     **/
    
    public String getFingerprint() {
        return fingerprint;
    }


        /**
     * Private API Key
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("privateApiKey")
    private final String privateApiKey;

        /**
     * Private API Key
     * @return the value
     **/
    
    public String getPrivateApiKey() {
        return privateApiKey;
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
        sb.append("IamUserCredentialUserSetting(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", tenancy=").append(String.valueOf(this.tenancy));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", privateApiKey=").append(String.valueOf(this.privateApiKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IamUserCredentialUserSetting)) {
            return false;
        }

        IamUserCredentialUserSetting other = (IamUserCredentialUserSetting) o;
        return java.util.Objects.equals(this.userId, other.userId) &&
            java.util.Objects.equals(this.tenancy, other.tenancy) &&
            java.util.Objects.equals(this.region, other.region) &&
            java.util.Objects.equals(this.fingerprint, other.fingerprint) &&
            java.util.Objects.equals(this.privateApiKey, other.privateApiKey) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.tenancy == null ? 43 : this.tenancy.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.privateApiKey == null ? 43 : this.privateApiKey.hashCode());
        return result;
    }


}
