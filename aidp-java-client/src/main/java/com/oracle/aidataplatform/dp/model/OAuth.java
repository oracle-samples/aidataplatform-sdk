// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Auth configuration while using oauth token
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OAuth.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="authType")

public final class OAuth extends Auth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The clientId of the confidential app for auth
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clientId")
private String clientId;

        /**
         * The clientId of the confidential app for auth
         * @param clientId the value to set
         * @return this builder
         **/
        

public Builder clientId(String clientId) {
    this.clientId = clientId;
    return this;
}
            /**
     * The secret of the confidential app for auth
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
private String clientSecret;

        /**
         * The secret of the confidential app for auth
         * @param clientSecret the value to set
         * @return this builder
         **/
        

public Builder clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
}
            /**
     * The endpoint for the issuer idp
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("issuerIdpEndpoint")
private String issuerIdpEndpoint;

        /**
         * The endpoint for the issuer idp
         * @param issuerIdpEndpoint the value to set
         * @return this builder
         **/
        

public Builder issuerIdpEndpoint(String issuerIdpEndpoint) {
    this.issuerIdpEndpoint = issuerIdpEndpoint;
    return this;
}
            /**
     * The list of scopes for oauth
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("scopes")
private java.util.List<String> scopes;

        /**
         * The list of scopes for oauth
         * @param scopes the value to set
         * @return this builder
         **/
        

public Builder scopes(java.util.List<String> scopes) {
    this.scopes = scopes;
    return this;
}


        public OAuth build() {
            OAuth model = new OAuth(this.clientId
                , this.clientSecret
                , this.issuerIdpEndpoint
                , this.scopes);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuth model) {
                this.clientId(model.getClientId());
    this.clientSecret(model.getClientSecret());
    this.issuerIdpEndpoint(model.getIssuerIdpEndpoint());
    this.scopes(model.getScopes());
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
    public OAuth(String clientId, String clientSecret, String issuerIdpEndpoint, java.util.List<String> scopes) {
    super();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuerIdpEndpoint = issuerIdpEndpoint;
        this.scopes = scopes;
    }


        /**
     * The clientId of the confidential app for auth
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

        /**
     * The clientId of the confidential app for auth
     * @return the value
     **/
    
    public String getClientId() {
        return clientId;
    }


        /**
     * The secret of the confidential app for auth
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

        /**
     * The secret of the confidential app for auth
     * @return the value
     **/
    
    public String getClientSecret() {
        return clientSecret;
    }


        /**
     * The endpoint for the issuer idp
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("issuerIdpEndpoint")
    private final String issuerIdpEndpoint;

        /**
     * The endpoint for the issuer idp
     * @return the value
     **/
    
    public String getIssuerIdpEndpoint() {
        return issuerIdpEndpoint;
    }


        /**
     * The list of scopes for oauth
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<String> scopes;

        /**
     * The list of scopes for oauth
     * @return the value
     **/
    
    public java.util.List<String> getScopes() {
        return scopes;
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
        sb.append("OAuth(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append("<redacted>");
        sb.append(", issuerIdpEndpoint=").append(String.valueOf(this.issuerIdpEndpoint));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuth)) {
            return false;
        }

        OAuth other = (OAuth) o;
        return java.util.Objects.equals(this.clientId, other.clientId) &&
            java.util.Objects.equals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.equals(this.issuerIdpEndpoint, other.issuerIdpEndpoint) &&
            java.util.Objects.equals(this.scopes, other.scopes) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + (this.issuerIdpEndpoint == null ? 43 : this.issuerIdpEndpoint.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        return result;
    }


}
