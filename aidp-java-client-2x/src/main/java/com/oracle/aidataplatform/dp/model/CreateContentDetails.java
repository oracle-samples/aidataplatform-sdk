package com.oracle.aidataplatform.dp.model;


/**
 * Path of file to copy. A POST to /api/contents/path creates a New untitled, empty file or directory. A POST to /api/contents/path with body {'copy_from': '/path/to/OtherNotebook.ipynb'} creates a new copy of OtherNotebook in path.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateContentDetails.Builder.class)

public final class CreateContentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"copyFrom", "ext", "type"})
    public CreateContentDetails(String copyFrom, String ext, Content.Type type) {
        super();
        this.copyFrom = copyFrom;
        this.ext = ext;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("copy_from")
        private String copyFrom;

                /**
         * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
         * @param copyFrom the value to set
         * @return this builder
         **/
        

        public Builder copyFrom(String copyFrom) {
        this.copyFrom = copyFrom;
        return this;
        }
            /**
     * File format extension
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("ext")
        private String ext;

                /**
         * File format extension
         * @param ext the value to set
         * @return this builder
         **/
        

        public Builder ext(String ext) {
        this.ext = ext;
        return this;
        }
            /**
     * Type of Content model. Either notebook, file, or directory.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Content.Type type;

                /**
         * Type of Content model. Either notebook, file, or directory.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Content.Type type) {
        this.type = type;
        return this;
        }


        public CreateContentDetails build() {
            CreateContentDetails model = new CreateContentDetails(this.copyFrom
                    , this.ext
                    , this.type);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContentDetails model) {
                this.copyFrom(model.getCopyFrom());
    this.ext(model.getExt());
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
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("copy_from")
    private final String copyFrom;

        /**
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     * @return the value
     **/
    
    public String getCopyFrom() {
        return copyFrom;
    }


        /**
     * File format extension
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ext")
    private final String ext;

        /**
     * File format extension
     * @return the value
     **/
    
    public String getExt() {
        return ext;
    }


        /**
     * Type of Content model. Either notebook, file, or directory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Content.Type type;

        /**
     * Type of Content model. Either notebook, file, or directory.
     * @return the value
     **/
    
    public Content.Type getType() {
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
        sb.append("CreateContentDetails(");
        sb.append("copyFrom=").append(String.valueOf(this.copyFrom));
        sb.append(", ext=").append(String.valueOf(this.ext));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContentDetails)) {
            return false;
        }

        CreateContentDetails other = (CreateContentDetails) o;
        return java.util.Objects.equals(this.copyFrom, other.copyFrom) &&
            java.util.Objects.equals(this.ext, other.ext) &&
            java.util.Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.copyFrom == null ? 43 : this.copyFrom.hashCode());
        result = (result * PRIME) + (this.ext == null ? 43 : this.ext.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        return result;
    }


}
