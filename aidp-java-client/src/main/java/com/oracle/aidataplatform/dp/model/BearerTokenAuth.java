// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Auth configuration while using bearer token
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BearerTokenAuth.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="authType")

public final class BearerTokenAuth extends Auth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The bearer token used for auth
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("token")
private String token;

        /**
         * The bearer token used for auth
         * @param token the value to set
         * @return this builder
         **/
        

public Builder token(String token) {
    this.token = token;
    return this;
}


        public BearerTokenAuth build() {
            BearerTokenAuth model = new BearerTokenAuth(this.token);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BearerTokenAuth model) {
                this.token(model.getToken());
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
    public BearerTokenAuth(String token) {
    super();
        this.token = token;
    }


        /**
     * The bearer token used for auth
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

        /**
     * The bearer token used for auth
     * @return the value
     **/
    
    public String getToken() {
        return token;
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
        sb.append("BearerTokenAuth(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", token=").append(String.valueOf(this.token));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BearerTokenAuth)) {
            return false;
        }

        BearerTokenAuth other = (BearerTokenAuth) o;
        return java.util.Objects.equals(this.token, other.token) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        return result;
    }


}
