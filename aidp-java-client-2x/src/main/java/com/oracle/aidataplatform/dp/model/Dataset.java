// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Dataset. Represents a reference to data used for training, testing, or evaluation during the model development process.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Dataset.Builder.class)

public final class Dataset  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "digest", "sourceType", "source", "schema", "profile"})
    public Dataset(String name, String digest, String sourceType, String source, String schema, String profile) {
        super();
        this.name = name;
        this.digest = digest;
        this.sourceType = sourceType;
        this.source = source;
        this.schema = schema;
        this.profile = profile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Digest (hash) of the dataset.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

                /**
         * Digest (hash) of the dataset.
         * @param digest the value to set
         * @return this builder
         **/
        

        public Builder digest(String digest) {
        this.digest = digest;
        return this;
        }
            /**
     * Type of the dataset source.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("source_type")
        private String sourceType;

                /**
         * Type of the dataset source.
         * @param sourceType the value to set
         * @return this builder
         **/
        

        public Builder sourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
        }
            /**
     * URI or path to the dataset source.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

                /**
         * URI or path to the dataset source.
         * @param source the value to set
         * @return this builder
         **/
        

        public Builder source(String source) {
        this.source = source;
        return this;
        }
            /**
     * Schema of the dataset.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

                /**
         * Schema of the dataset.
         * @param schema the value to set
         * @return this builder
         **/
        

        public Builder schema(String schema) {
        this.schema = schema;
        return this;
        }
            /**
     * Profile of the dataset.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

                /**
         * Profile of the dataset.
         * @param profile the value to set
         * @return this builder
         **/
        

        public Builder profile(String profile) {
        this.profile = profile;
        return this;
        }


        public Dataset build() {
            Dataset model = new Dataset(this.name
                    , this.digest
                    , this.sourceType
                    , this.source
                    , this.schema
                    , this.profile);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dataset model) {
                this.name(model.getName());
    this.digest(model.getDigest());
    this.sourceType(model.getSourceType());
    this.source(model.getSource());
    this.schema(model.getSchema());
    this.profile(model.getProfile());
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
     * Digest (hash) of the dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

        /**
     * Digest (hash) of the dataset.
     * @return the value
     **/
    
    public String getDigest() {
        return digest;
    }


        /**
     * Type of the dataset source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source_type")
    private final String sourceType;

        /**
     * Type of the dataset source.
     * @return the value
     **/
    
    public String getSourceType() {
        return sourceType;
    }


        /**
     * URI or path to the dataset source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

        /**
     * URI or path to the dataset source.
     * @return the value
     **/
    
    public String getSource() {
        return source;
    }


        /**
     * Schema of the dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

        /**
     * Schema of the dataset.
     * @return the value
     **/
    
    public String getSchema() {
        return schema;
    }


        /**
     * Profile of the dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final String profile;

        /**
     * Profile of the dataset.
     * @return the value
     **/
    
    public String getProfile() {
        return profile;
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
        sb.append("Dataset(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", digest=").append(String.valueOf(this.digest));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dataset)) {
            return false;
        }

        Dataset other = (Dataset) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.digest, other.digest) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.schema, other.schema) &&
            java.util.Objects.equals(this.profile, other.profile);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        return result;
    }


}
