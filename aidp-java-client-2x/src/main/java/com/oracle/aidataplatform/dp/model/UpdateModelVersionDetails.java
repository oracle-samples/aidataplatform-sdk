package com.oracle.aidataplatform.dp.model;


/**
 * Details of the model version
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateModelVersionDetails.Builder.class)

public final class UpdateModelVersionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "description"})
    public UpdateModelVersionDetails(String name, String version, String description) {
        super();
        this.name = name;
        this.version = version;
        this.description = description;
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
     * New description for the model version.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * New description for the model version.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }


        public UpdateModelVersionDetails build() {
            UpdateModelVersionDetails model = new UpdateModelVersionDetails(this.name
                    , this.version
                    , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelVersionDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.description(model.getDescription());
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
     * New description for the model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * New description for the model version.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("UpdateModelVersionDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelVersionDetails)) {
            return false;
        }

        UpdateModelVersionDetails other = (UpdateModelVersionDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
