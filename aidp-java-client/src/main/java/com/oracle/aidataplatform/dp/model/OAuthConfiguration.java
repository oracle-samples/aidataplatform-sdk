// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * OAuth configuration for agent flow
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OAuthConfiguration.Builder.class)

public final class OAuthConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"issuerClaim", "audienceClaim", "jwksUri"})
    public OAuthConfiguration(String issuerClaim, java.util.List<String> audienceClaim, String jwksUri) {
        super();
        this.issuerClaim = issuerClaim;
        this.audienceClaim = audienceClaim;
        this.jwksUri = jwksUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Issuer Claim of OAuthConfiguration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("issuerClaim")
private String issuerClaim;

        /**
         * Issuer Claim of OAuthConfiguration
         * @param issuerClaim the value to set
         * @return this builder
         **/
        

public Builder issuerClaim(String issuerClaim) {
    this.issuerClaim = issuerClaim;
    return this;
}
            /**
     * List of Audience Claim of OAuthConfiguration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("audienceClaim")
private java.util.List<String> audienceClaim;

        /**
         * List of Audience Claim of OAuthConfiguration
         * @param audienceClaim the value to set
         * @return this builder
         **/
        

public Builder audienceClaim(java.util.List<String> audienceClaim) {
    this.audienceClaim = audienceClaim;
    return this;
}
            /**
     * JWKS URI of OAuthConfiguration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jwksUri")
private String jwksUri;

        /**
         * JWKS URI of OAuthConfiguration
         * @param jwksUri the value to set
         * @return this builder
         **/
        

public Builder jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
}


        public OAuthConfiguration build() {
            OAuthConfiguration model = new OAuthConfiguration(this.issuerClaim
                , this.audienceClaim
                , this.jwksUri);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuthConfiguration model) {
                this.issuerClaim(model.getIssuerClaim());
    this.audienceClaim(model.getAudienceClaim());
    this.jwksUri(model.getJwksUri());
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
     * Issuer Claim of OAuthConfiguration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("issuerClaim")
    private final String issuerClaim;

        /**
     * Issuer Claim of OAuthConfiguration
     * @return the value
     **/
    
    public String getIssuerClaim() {
        return issuerClaim;
    }


        /**
     * List of Audience Claim of OAuthConfiguration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("audienceClaim")
    private final java.util.List<String> audienceClaim;

        /**
     * List of Audience Claim of OAuthConfiguration
     * @return the value
     **/
    
    public java.util.List<String> getAudienceClaim() {
        return audienceClaim;
    }


        /**
     * JWKS URI of OAuthConfiguration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jwksUri")
    private final String jwksUri;

        /**
     * JWKS URI of OAuthConfiguration
     * @return the value
     **/
    
    public String getJwksUri() {
        return jwksUri;
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
        sb.append("OAuthConfiguration(");
        sb.append("issuerClaim=").append(String.valueOf(this.issuerClaim));
        sb.append(", audienceClaim=").append(String.valueOf(this.audienceClaim));
        sb.append(", jwksUri=").append(String.valueOf(this.jwksUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuthConfiguration)) {
            return false;
        }

        OAuthConfiguration other = (OAuthConfiguration) o;
        return java.util.Objects.equals(this.issuerClaim, other.issuerClaim) &&
            java.util.Objects.equals(this.audienceClaim, other.audienceClaim) &&
            java.util.Objects.equals(this.jwksUri, other.jwksUri);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.issuerClaim == null ? 43 : this.issuerClaim.hashCode());
        result = (result * PRIME) + (this.audienceClaim == null ? 43 : this.audienceClaim.hashCode());
        result = (result * PRIME) + (this.jwksUri == null ? 43 : this.jwksUri.hashCode());
        return result;
    }


}
