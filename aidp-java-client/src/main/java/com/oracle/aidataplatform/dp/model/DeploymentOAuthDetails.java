// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * OAuth trust configuration for a model deployment's query endpoint. Required when authType is OAUTH and must be omitted for AIDP. A closed schema: the gateway turns these values into the token policy it enforces, so a member outside this set is not accepted -- it is discarded rather than stored or forwarded, and a misspelled member therefore leaves the one it was meant to be unset, which fails validation. The serialized object must not exceed 16000 characters. Cannot be changed while the deployment is ACTIVE.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentOAuthDetails.Builder.class)

public final class DeploymentOAuthDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"issuerClaim", "audienceClaim", "jwksUri"})
    public DeploymentOAuthDetails(String issuerClaim, java.util.List<String> audienceClaim, String jwksUri) {
        super();
        this.issuerClaim = issuerClaim;
        this.audienceClaim = audienceClaim;
        this.jwksUri = jwksUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("issuerClaim")
private String issuerClaim;

        /**
         * OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
         * @param issuerClaim the value to set
         * @return this builder
         **/
        

public Builder issuerClaim(String issuerClaim) {
    this.issuerClaim = issuerClaim;
    return this;
}
            /**
     * OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("audienceClaim")
private java.util.List<String> audienceClaim;

        /**
         * OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
         * @param audienceClaim the value to set
         * @return this builder
         **/
        

public Builder audienceClaim(java.util.List<String> audienceClaim) {
    this.audienceClaim = audienceClaim;
    return this;
}
            /**
     * URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jwksUri")
private String jwksUri;

        /**
         * URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.
         * @param jwksUri the value to set
         * @return this builder
         **/
        

public Builder jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
}


        public DeploymentOAuthDetails build() {
            DeploymentOAuthDetails model = new DeploymentOAuthDetails(this.issuerClaim
                , this.audienceClaim
                , this.jwksUri);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentOAuthDetails model) {
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
     * OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("issuerClaim")
    private final String issuerClaim;

        /**
     * OAuth issuer claim (iss) the query endpoint requires. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment.
     * @return the value
     **/
    
    public String getIssuerClaim() {
        return issuerClaim;
    }


        /**
     * OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("audienceClaim")
    private final java.util.List<String> audienceClaim;

        /**
     * OAuth audience claims (aud) the query endpoint accepts. Entries must be unique.
     * @return the value
     **/
    
    public java.util.List<String> getAudienceClaim() {
        return audienceClaim;
    }


        /**
     * URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jwksUri")
    private final String jwksUri;

        /**
     * URI the gateway retrieves the signing keys (JWKS) from. An https URI whose host is a fully qualified domain name, not an IP literal in any notation, and which carries no userinfo and no fragment. A query string and a non-default port are permitted: published provider JWKS endpoints use both.
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
        sb.append("DeploymentOAuthDetails(");
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
        if (!(o instanceof DeploymentOAuthDetails)) {
            return false;
        }

        DeploymentOAuthDetails other = (DeploymentOAuthDetails) o;
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
