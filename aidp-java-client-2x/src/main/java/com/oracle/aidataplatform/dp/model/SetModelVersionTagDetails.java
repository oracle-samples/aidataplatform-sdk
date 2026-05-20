// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of the model version tag.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SetModelVersionTagDetails.Builder.class)

public final class SetModelVersionTagDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "key", "value"})
    public SetModelVersionTagDetails(String name, String version, String key, String value) {
        super();
        this.name = name;
        this.version = version;
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name of the registered model.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Model version number.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

                /**
         * Model version number.
         * @param version the value to set
         * @return this builder
         **/
        

        public Builder version(String version) {
        this.version = version;
        return this;
        }
            /**
     * Tag key.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * Tag key.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * Tag value.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

                /**
         * Tag value.
         * @param value the value to set
         * @return this builder
         **/
        

        public Builder value(String value) {
        this.value = value;
        return this;
        }


        public SetModelVersionTagDetails build() {
            SetModelVersionTagDetails model = new SetModelVersionTagDetails(this.name
                    , this.version
                    , this.key
                    , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetModelVersionTagDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.key(model.getKey());
    this.value(model.getValue());
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
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Model version number.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Model version number.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * Tag key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Tag key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Tag value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * Tag value.
     * @return the value
     **/
    
    public String getValue() {
        return value;
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
        sb.append("SetModelVersionTagDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetModelVersionTagDetails)) {
            return false;
        }

        SetModelVersionTagDetails other = (SetModelVersionTagDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
