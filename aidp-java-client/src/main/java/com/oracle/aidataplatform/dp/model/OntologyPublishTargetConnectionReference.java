// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Credential Store reference for the ATP connection used by ontology publish.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyPublishTargetConnectionReference.Builder.class)

public final class OntologyPublishTargetConnectionReference  {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialKey", "namespace", "schema"})
    public OntologyPublishTargetConnectionReference(String credentialKey, String namespace, String schema) {
        super();
        this.credentialKey = credentialKey;
        this.namespace = namespace;
        this.schema = schema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Credential Store key containing the target ATP connection secret pairs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
private String credentialKey;

        /**
         * Credential Store key containing the target ATP connection secret pairs.
         * @param credentialKey the value to set
         * @return this builder
         **/
        

public Builder credentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
    return this;
}
            /**
     * Credential Store namespace. Defaults to {@code default} when omitted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * Credential Store namespace. Defaults to {@code default} when omitted.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schema")
private String schema;

        /**
         * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
         * @param schema the value to set
         * @return this builder
         **/
        

public Builder schema(String schema) {
    this.schema = schema;
    return this;
}


        public OntologyPublishTargetConnectionReference build() {
            OntologyPublishTargetConnectionReference model = new OntologyPublishTargetConnectionReference(this.credentialKey
                , this.namespace
                , this.schema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyPublishTargetConnectionReference model) {
                this.credentialKey(model.getCredentialKey());
    this.namespace(model.getNamespace());
    this.schema(model.getSchema());
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
     * Credential Store key containing the target ATP connection secret pairs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * Credential Store key containing the target ATP connection secret pairs.
     * @return the value
     **/
    
    public String getCredentialKey() {
        return credentialKey;
    }


        /**
     * Credential Store namespace. Defaults to {@code default} when omitted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * Credential Store namespace. Defaults to {@code default} when omitted.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

        /**
     * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
     * @return the value
     **/
    
    public String getSchema() {
        return schema;
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
        sb.append("OntologyPublishTargetConnectionReference(");
        sb.append("credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyPublishTargetConnectionReference)) {
            return false;
        }

        OntologyPublishTargetConnectionReference other = (OntologyPublishTargetConnectionReference) o;
        return java.util.Objects.equals(this.credentialKey, other.credentialKey) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.schema, other.schema);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        return result;
    }


}
