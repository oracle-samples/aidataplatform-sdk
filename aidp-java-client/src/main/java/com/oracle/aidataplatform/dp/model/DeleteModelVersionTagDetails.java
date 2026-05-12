package com.oracle.aidataplatform.dp.model;



/**
 * Details of the ModelVersion tag.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteModelVersionTagDetails.Builder.class)

public final class DeleteModelVersionTagDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "key"})
    public DeleteModelVersionTagDetails(String name, String version, String key) {
        super();
        this.name = name;
        this.version = version;
        this.key = key;
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
     * Model\u2019s version number.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * Model\u2019s version number.
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


        public DeleteModelVersionTagDetails build() {
            DeleteModelVersionTagDetails model = new DeleteModelVersionTagDetails(this.name
                , this.version
                , this.key);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteModelVersionTagDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.key(model.getKey());
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
     * Model\u2019s version number.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Model\u2019s version number.
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
        sb.append("DeleteModelVersionTagDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteModelVersionTagDetails)) {
            return false;
        }

        DeleteModelVersionTagDetails other = (DeleteModelVersionTagDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }


}
