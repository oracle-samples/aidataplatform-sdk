package com.oracle.aidataplatform.dp.model;



/**
 * Details of the ModelVersion to delete.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteModelVersionDetails.Builder.class)

public final class DeleteModelVersionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version"})
    public DeleteModelVersionDetails(String name, String version) {
        super();
        this.name = name;
        this.version = version;
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


        public DeleteModelVersionDetails build() {
            DeleteModelVersionDetails model = new DeleteModelVersionDetails(this.name
                , this.version);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteModelVersionDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
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
        sb.append("DeleteModelVersionDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteModelVersionDetails)) {
            return false;
        }

        DeleteModelVersionDetails other = (DeleteModelVersionDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }


}
