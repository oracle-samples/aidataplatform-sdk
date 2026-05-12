package com.oracle.aidataplatform.dp.model;


/**
 * The base object containing credential information, extended by specific credential types 
* such as SecretTokenCredentialDetails or VaultReferenceCredentialDetails. The type of credential
* is identified by the {@code credentialType} property.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="credentialType", defaultImpl=CredentialDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ServiceAccountCredentialDetails.class, name = "SERVICE_ACCOUNT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SecretTokenCredentialDetails.class, name = "SECRET_TOKEN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VaultReferenceCredentialDetails.class, name = "VAULT_REFERENCE")
})

public class CredentialDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected CredentialDetails() {
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
        sb.append("CredentialDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialDetails)) {
            return false;
        }

        CredentialDetails other = (CredentialDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
