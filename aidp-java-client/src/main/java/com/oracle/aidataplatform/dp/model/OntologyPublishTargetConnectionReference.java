// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Credential Store or external catalog reference for the ATP/ADW connection used by ontology publish.
* Provide {@code type} and {@code key}. Legacy {@code credentialKey} and {@code catalogKey} payloads are also accepted.
* {@code namespace} is valid only with Credential Store targets.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyPublishTargetConnectionReference.Builder.class)

public final class OntologyPublishTargetConnectionReference  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "key", "credentialKey", "catalogKey", "namespace", "schema"})
    public OntologyPublishTargetConnectionReference(Type type, String key, String credentialKey, String catalogKey, String namespace, String schema) {
        super();
        this.type = type;
        this.key = key;
        this.credentialKey = credentialKey;
        this.catalogKey = catalogKey;
        this.namespace = namespace;
        this.schema = schema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Target connection reference type. Required when {@code key} is supplied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * Target connection reference type. Required when {@code key} is supplied.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Credential Store key or ADW external catalog key. Required when {@code type} is supplied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Credential Store key or ADW external catalog key. Required when {@code type} is supplied.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
private String credentialKey;

        /**
         * Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.
         * @param credentialKey the value to set
         * @return this builder
         **/
        

public Builder credentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
    return this;
}
            /**
     * Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * Credential Store namespace. Defaults to {@code default} when omitted for Credential Store targets; not used with external catalog targets.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * Credential Store namespace. Defaults to {@code default} when omitted for Credential Store targets; not used with external catalog targets.
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
            OntologyPublishTargetConnectionReference model = new OntologyPublishTargetConnectionReference(this.type
                , this.key
                , this.credentialKey
                , this.catalogKey
                , this.namespace
                , this.schema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyPublishTargetConnectionReference model) {
                this.type(model.getType());
    this.key(model.getKey());
    this.credentialKey(model.getCredentialKey());
    this.catalogKey(model.getCatalogKey());
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
     * Target connection reference type. Required when {@code key} is supplied.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        CredentialStore("CREDENTIAL_STORE"),
        ExternalCatalog("EXTERNAL_CATALOG"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
        /**
     * Target connection reference type. Required when {@code key} is supplied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Target connection reference type. Required when {@code key} is supplied.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Credential Store key or ADW external catalog key. Required when {@code type} is supplied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Credential Store key or ADW external catalog key. Required when {@code type} is supplied.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.
     * @return the value
     **/
    
    public String getCredentialKey() {
        return credentialKey;
    }


        /**
     * Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * Credential Store namespace. Defaults to {@code default} when omitted for Credential Store targets; not used with external catalog targets.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * Credential Store namespace. Defaults to {@code default} when omitted for Credential Store targets; not used with external catalog targets.
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
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
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
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.credentialKey, other.credentialKey) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.schema, other.schema);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        return result;
    }


}
