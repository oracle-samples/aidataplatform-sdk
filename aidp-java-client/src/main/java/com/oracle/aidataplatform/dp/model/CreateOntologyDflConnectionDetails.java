// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request to register (upsert) a DFL connection. {@code sourceType} selects how Ontology Manager
* obtains the connection's coordinates and credentials. For the resolved source types it reads
* them under the caller's identity and this body carries no secrets.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateOntologyDflConnectionDetails.Builder.class)

public final class CreateOntologyDflConnectionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceType", "key", "namespace", "uri", "kind", "properties", "propertyOverrides"})
    public CreateOntologyDflConnectionDetails(OntologyDflConnectionSourceType sourceType, String key, String namespace, String uri, String kind, java.util.Map<String, String> properties, java.util.Map<String, String> propertyOverrides) {
        super();
        this.sourceType = sourceType;
        this.key = key;
        this.namespace = namespace;
        this.uri = uri;
        this.kind = kind;
        this.properties = properties;
        this.propertyOverrides = propertyOverrides;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * CATALOG_CONNECTION resolves an AIDP external ADW catalog by {@code key}; CRED_STORE resolves a
* Credential Store entry by {@code key}; INLINE registers the {@code uri}, {@code kind} and {@code properties} in
* this request.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceType")
private OntologyDflConnectionSourceType sourceType;

        /**
         * CATALOG_CONNECTION resolves an AIDP external ADW catalog by {@code key}; CRED_STORE resolves a
* Credential Store entry by {@code key}; INLINE registers the {@code uri}, {@code kind} and {@code properties} in
* this request.
* 
         * @param sourceType the value to set
         * @return this builder
         **/
        

public Builder sourceType(OntologyDflConnectionSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
}
            /**
     * Catalog key or Credential Store key. Required unless {@code sourceType} is INLINE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Catalog key or Credential Store key. Required unless {@code sourceType} is INLINE.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Credential Store namespace. CRED_STORE only; defaults to {@code default}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * Credential Store namespace. CRED_STORE only; defaults to {@code default}.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * DFL connection URI to register, for example {@code duckdb://analytics}. Required for INLINE;
* for the resolved source types it defaults to {@code oracle://<key>}, and supplying it registers
* the resolved connection under a second URI.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uri")
private String uri;

        /**
         * DFL connection URI to register, for example {@code duckdb://analytics}. Required for INLINE;
* for the resolved source types it defaults to {@code oracle://<key>}, and supplying it registers
* the resolved connection under a second URI.
* 
         * @param uri the value to set
         * @return this builder
         **/
        

public Builder uri(String uri) {
    this.uri = uri;
    return this;
}
            /**
     * DFL connection kind ({@code duckdb}, {@code jdbc}, ...). INLINE only; resolved source types are always {@code jdbc}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;

        /**
         * DFL connection kind ({@code duckdb}, {@code jdbc}, ...). INLINE only; resolved source types are always {@code jdbc}.
         * @param kind the value to set
         * @return this builder
         **/
        

public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
            /**
     * DFL per-kind connection properties. INLINE only; the {@code type} property DFL requires is
* derived from {@code kind} when absent. May carry secrets; excluded from audit events.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, String> properties;

        /**
         * DFL per-kind connection properties. INLINE only; the {@code type} property DFL requires is
* derived from {@code kind} when absent. May carry secrets; excluded from audit events.
* 
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, String> properties) {
    this.properties = properties;
    return this;
}
            /**
     * Merged last over the resolved properties, for what the source does not carry such as a
* {@code wallet_path}. Not valid for INLINE. May carry secrets; excluded from audit events.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("propertyOverrides")
private java.util.Map<String, String> propertyOverrides;

        /**
         * Merged last over the resolved properties, for what the source does not carry such as a
* {@code wallet_path}. Not valid for INLINE. May carry secrets; excluded from audit events.
* 
         * @param propertyOverrides the value to set
         * @return this builder
         **/
        

public Builder propertyOverrides(java.util.Map<String, String> propertyOverrides) {
    this.propertyOverrides = propertyOverrides;
    return this;
}


        public CreateOntologyDflConnectionDetails build() {
            CreateOntologyDflConnectionDetails model = new CreateOntologyDflConnectionDetails(this.sourceType
                , this.key
                , this.namespace
                , this.uri
                , this.kind
                , this.properties
                , this.propertyOverrides);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOntologyDflConnectionDetails model) {
                this.sourceType(model.getSourceType());
    this.key(model.getKey());
    this.namespace(model.getNamespace());
    this.uri(model.getUri());
    this.kind(model.getKind());
    this.properties(model.getProperties());
    this.propertyOverrides(model.getPropertyOverrides());
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
     * CATALOG_CONNECTION resolves an AIDP external ADW catalog by {@code key}; CRED_STORE resolves a
* Credential Store entry by {@code key}; INLINE registers the {@code uri}, {@code kind} and {@code properties} in
* this request.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final OntologyDflConnectionSourceType sourceType;

        /**
     * CATALOG_CONNECTION resolves an AIDP external ADW catalog by {@code key}; CRED_STORE resolves a
* Credential Store entry by {@code key}; INLINE registers the {@code uri}, {@code kind} and {@code properties} in
* this request.
* 
     * @return the value
     **/
    
    public OntologyDflConnectionSourceType getSourceType() {
        return sourceType;
    }


        /**
     * Catalog key or Credential Store key. Required unless {@code sourceType} is INLINE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Catalog key or Credential Store key. Required unless {@code sourceType} is INLINE.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Credential Store namespace. CRED_STORE only; defaults to {@code default}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * Credential Store namespace. CRED_STORE only; defaults to {@code default}.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * DFL connection URI to register, for example {@code duckdb://analytics}. Required for INLINE;
* for the resolved source types it defaults to {@code oracle://<key>}, and supplying it registers
* the resolved connection under a second URI.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

        /**
     * DFL connection URI to register, for example {@code duckdb://analytics}. Required for INLINE;
* for the resolved source types it defaults to {@code oracle://<key>}, and supplying it registers
* the resolved connection under a second URI.
* 
     * @return the value
     **/
    
    public String getUri() {
        return uri;
    }


        /**
     * DFL connection kind ({@code duckdb}, {@code jdbc}, ...). INLINE only; resolved source types are always {@code jdbc}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

        /**
     * DFL connection kind ({@code duckdb}, {@code jdbc}, ...). INLINE only; resolved source types are always {@code jdbc}.
     * @return the value
     **/
    
    public String getKind() {
        return kind;
    }


        /**
     * DFL per-kind connection properties. INLINE only; the {@code type} property DFL requires is
* derived from {@code kind} when absent. May carry secrets; excluded from audit events.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

        /**
     * DFL per-kind connection properties. INLINE only; the {@code type} property DFL requires is
* derived from {@code kind} when absent. May carry secrets; excluded from audit events.
* 
     * @return the value
     **/
    
    public java.util.Map<String, String> getProperties() {
        return properties;
    }


        /**
     * Merged last over the resolved properties, for what the source does not carry such as a
* {@code wallet_path}. Not valid for INLINE. May carry secrets; excluded from audit events.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("propertyOverrides")
    private final java.util.Map<String, String> propertyOverrides;

        /**
     * Merged last over the resolved properties, for what the source does not carry such as a
* {@code wallet_path}. Not valid for INLINE. May carry secrets; excluded from audit events.
* 
     * @return the value
     **/
    
    public java.util.Map<String, String> getPropertyOverrides() {
        return propertyOverrides;
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
        sb.append("CreateOntologyDflConnectionDetails(");
        sb.append("sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", propertyOverrides=").append(String.valueOf(this.propertyOverrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOntologyDflConnectionDetails)) {
            return false;
        }

        CreateOntologyDflConnectionDetails other = (CreateOntologyDflConnectionDetails) o;
        return java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.uri, other.uri) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.propertyOverrides, other.propertyOverrides);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.propertyOverrides == null ? 43 : this.propertyOverrides.hashCode());
        return result;
    }


}
