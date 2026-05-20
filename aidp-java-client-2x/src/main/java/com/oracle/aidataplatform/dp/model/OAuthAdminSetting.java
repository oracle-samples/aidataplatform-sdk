// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * OAuth admin setting details.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OAuthAdminSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class OAuthAdminSetting extends SettingData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Issuer / authorization server base URL.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("identityProviderUrl")
        private String identityProviderUrl;

                /**
         * Issuer / authorization server base URL.
         * @param identityProviderUrl the value to set
         * @return this builder
         **/
        

        public Builder identityProviderUrl(String identityProviderUrl) {
        this.identityProviderUrl = identityProviderUrl;
        return this;
        }
            /**
     * URL to retrieve JKS keystore.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("retrieveJksUrl")
        private String retrieveJksUrl;

                /**
         * URL to retrieve JKS keystore.
         * @param retrieveJksUrl the value to set
         * @return this builder
         **/
        

        public Builder retrieveJksUrl(String retrieveJksUrl) {
        this.retrieveJksUrl = retrieveJksUrl;
        return this;
        }


        public OAuthAdminSetting build() {
            OAuthAdminSetting model = new OAuthAdminSetting(this.identityProviderUrl
                    , this.retrieveJksUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuthAdminSetting model) {
                this.identityProviderUrl(model.getIdentityProviderUrl());
    this.retrieveJksUrl(model.getRetrieveJksUrl());
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
    public OAuthAdminSetting(String identityProviderUrl, String retrieveJksUrl) {
        super();
        this.identityProviderUrl = identityProviderUrl;
        this.retrieveJksUrl = retrieveJksUrl;
    }


        /**
     * Issuer / authorization server base URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("identityProviderUrl")
    private final String identityProviderUrl;

        /**
     * Issuer / authorization server base URL.
     * @return the value
     **/
    
    public String getIdentityProviderUrl() {
        return identityProviderUrl;
    }


        /**
     * URL to retrieve JKS keystore.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retrieveJksUrl")
    private final String retrieveJksUrl;

        /**
     * URL to retrieve JKS keystore.
     * @return the value
     **/
    
    public String getRetrieveJksUrl() {
        return retrieveJksUrl;
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
        sb.append("OAuthAdminSetting(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", identityProviderUrl=").append(String.valueOf(this.identityProviderUrl));
        sb.append(", retrieveJksUrl=").append(String.valueOf(this.retrieveJksUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuthAdminSetting)) {
            return false;
        }

        OAuthAdminSetting other = (OAuthAdminSetting) o;
        return java.util.Objects.equals(this.identityProviderUrl, other.identityProviderUrl) &&
            java.util.Objects.equals(this.retrieveJksUrl, other.retrieveJksUrl) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.identityProviderUrl == null ? 43 : this.identityProviderUrl.hashCode());
        result = (result * PRIME) + (this.retrieveJksUrl == null ? 43 : this.retrieveJksUrl.hashCode());
        return result;
    }


}
