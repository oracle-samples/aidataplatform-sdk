package com.oracle.aidataplatform.dp.model;



/**
 * The embedding models which need to be enabled along with their storage location.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=EmbeddingModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="actionType")

public final class EmbeddingModelDetails extends ExecuteDatabaseUserWorkflowsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * CSV list of models, e.g. "<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>"
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("onnxModelFiles")
private String onnxModelFiles;

        /**
         * CSV list of models, e.g. "<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>"
         * @param onnxModelFiles the value to set
         * @return this builder
         **/
        

public Builder onnxModelFiles(String onnxModelFiles) {
    this.onnxModelFiles = onnxModelFiles;
    return this;
}
            /**
     * Directory for the models listed in onnxModelFiles.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("locationUri")
private String locationUri;

        /**
         * Directory for the models listed in onnxModelFiles.
         * @param locationUri the value to set
         * @return this builder
         **/
        

public Builder locationUri(String locationUri) {
    this.locationUri = locationUri;
    return this;
}


        public EmbeddingModelDetails build() {
            EmbeddingModelDetails model = new EmbeddingModelDetails(this.onnxModelFiles
                , this.locationUri);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmbeddingModelDetails model) {
                this.onnxModelFiles(model.getOnnxModelFiles());
    this.locationUri(model.getLocationUri());
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

    
    @Deprecated
    public EmbeddingModelDetails(String onnxModelFiles, String locationUri) {
    super();
        this.onnxModelFiles = onnxModelFiles;
        this.locationUri = locationUri;
    }


        /**
     * CSV list of models, e.g. "<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>"
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("onnxModelFiles")
    private final String onnxModelFiles;

        /**
     * CSV list of models, e.g. "<all_MiniLM_L12_v2>,<all_MiniLM_L64_v2>"
     * @return the value
     **/
    
    public String getOnnxModelFiles() {
        return onnxModelFiles;
    }


        /**
     * Directory for the models listed in onnxModelFiles.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("locationUri")
    private final String locationUri;

        /**
     * Directory for the models listed in onnxModelFiles.
     * @return the value
     **/
    
    public String getLocationUri() {
        return locationUri;
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
        sb.append("EmbeddingModelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", onnxModelFiles=").append(String.valueOf(this.onnxModelFiles));
        sb.append(", locationUri=").append(String.valueOf(this.locationUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmbeddingModelDetails)) {
            return false;
        }

        EmbeddingModelDetails other = (EmbeddingModelDetails) o;
        return java.util.Objects.equals(this.onnxModelFiles, other.onnxModelFiles) &&
            java.util.Objects.equals(this.locationUri, other.locationUri) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.onnxModelFiles == null ? 43 : this.onnxModelFiles.hashCode());
        result = (result * PRIME) + (this.locationUri == null ? 43 : this.locationUri.hashCode());
        return result;
    }


}
