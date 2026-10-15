// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Dataset referenced by an imported OpenLineage run event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageImportRunEventDataset.Builder.class)

public final class LineageImportRunEventDataset  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "namespace", "name", "type"})
    public LineageImportRunEventDataset(String key, String namespace, String name, String type) {
        super();
        this.key = key;
        this.namespace = namespace;
        this.name = name;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Catalog-object key when the dataset is linked to an AIDP object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Catalog-object key when the dataset is linked to an AIDP object.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Namespace of the dataset.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * Namespace of the dataset.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * Name of the dataset.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the dataset.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Type of the dataset when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Type of the dataset when available.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}


        public LineageImportRunEventDataset build() {
            LineageImportRunEventDataset model = new LineageImportRunEventDataset(this.key
                , this.namespace
                , this.name
                , this.type);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageImportRunEventDataset model) {
                this.key(model.getKey());
    this.namespace(model.getNamespace());
    this.name(model.getName());
    this.type(model.getType());
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
     * Catalog-object key when the dataset is linked to an AIDP object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Catalog-object key when the dataset is linked to an AIDP object.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Namespace of the dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * Namespace of the dataset.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * Name of the dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the dataset.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Type of the dataset when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type of the dataset when available.
     * @return the value
     **/
    
    public String getType() {
        return type;
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
        sb.append("LineageImportRunEventDataset(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageImportRunEventDataset)) {
            return false;
        }

        LineageImportRunEventDataset other = (LineageImportRunEventDataset) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        return result;
    }


}
