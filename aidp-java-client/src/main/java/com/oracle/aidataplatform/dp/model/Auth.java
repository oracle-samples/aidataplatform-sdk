// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Auth configuration for tools that support authenticated requests
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="authType", defaultImpl=Auth.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OciResourcePrincipalAuth.class, name = "OCI_RESOURCE_PRINCIPAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = BearerTokenAuth.class, name = "BEARER_TOKEN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = NoAuth.class, name = "NO_AUTH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OAuth.class, name = "OAUTH")
})

public class Auth  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected Auth() {
        super();
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
        sb.append("Auth(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Auth)) {
            return false;
        }

        Auth other = (Auth) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
