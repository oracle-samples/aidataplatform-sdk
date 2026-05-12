package com.oracle.aidataplatform.dp.model;


/**
 * Details to create a directory in the workspace.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MkdirDetails.Builder.class)

public final class MkdirDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "description"})
    public MkdirDetails(String path, String description) {
        super();
        this.path = path;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The fully qualified path of the directory to create.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * The fully qualified path of the directory to create.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * The description of the directory to create.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of the directory to create.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }


        public MkdirDetails build() {
            MkdirDetails model = new MkdirDetails(this.path
                    , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MkdirDetails model) {
                this.path(model.getPath());
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
     * The fully qualified path of the directory to create.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The fully qualified path of the directory to create.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The description of the directory to create.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of the directory to create.
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
        sb.append("MkdirDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MkdirDetails)) {
            return false;
        }

        MkdirDetails other = (MkdirDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
