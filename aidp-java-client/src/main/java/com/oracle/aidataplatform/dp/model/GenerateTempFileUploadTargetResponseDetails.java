package com.oracle.aidataplatform.dp.model;



/**
 * The details for a generated URI for uploading a temporary file in a schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GenerateTempFileUploadTargetResponseDetails.Builder.class)

public final class GenerateTempFileUploadTargetResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"tempFileUploadTarget", "uploadKey", "ociFilePath"})
    public GenerateTempFileUploadTargetResponseDetails(String tempFileUploadTarget, String uploadKey, String ociFilePath) {
        super();
        this.tempFileUploadTarget = tempFileUploadTarget;
        this.uploadKey = uploadKey;
        this.ociFilePath = ociFilePath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The generated target URI to upload the file, it must be prefixed by object stroage URL.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tempFileUploadTarget")
private String tempFileUploadTarget;

        /**
         * The generated target URI to upload the file, it must be prefixed by object stroage URL.
         * @param tempFileUploadTarget the value to set
         * @return this builder
         **/
        

public Builder tempFileUploadTarget(String tempFileUploadTarget) {
    this.tempFileUploadTarget = tempFileUploadTarget;
    return this;
}
            /**
     * The unique key for this request.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uploadKey")
private String uploadKey;

        /**
         * The unique key for this request.
         * @param uploadKey the value to set
         * @return this builder
         **/
        

public Builder uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
}
            /**
     * The exact URI path of the object storage.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ociFilePath")
private String ociFilePath;

        /**
         * The exact URI path of the object storage.
         * @param ociFilePath the value to set
         * @return this builder
         **/
        

public Builder ociFilePath(String ociFilePath) {
    this.ociFilePath = ociFilePath;
    return this;
}


        public GenerateTempFileUploadTargetResponseDetails build() {
            GenerateTempFileUploadTargetResponseDetails model = new GenerateTempFileUploadTargetResponseDetails(this.tempFileUploadTarget
                , this.uploadKey
                , this.ociFilePath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateTempFileUploadTargetResponseDetails model) {
                this.tempFileUploadTarget(model.getTempFileUploadTarget());
    this.uploadKey(model.getUploadKey());
    this.ociFilePath(model.getOciFilePath());
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
     * The generated target URI to upload the file, it must be prefixed by object stroage URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tempFileUploadTarget")
    private final String tempFileUploadTarget;

        /**
     * The generated target URI to upload the file, it must be prefixed by object stroage URL.
     * @return the value
     **/
    
    public String getTempFileUploadTarget() {
        return tempFileUploadTarget;
    }


        /**
     * The unique key for this request.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uploadKey")
    private final String uploadKey;

        /**
     * The unique key for this request.
     * @return the value
     **/
    
    public String getUploadKey() {
        return uploadKey;
    }


        /**
     * The exact URI path of the object storage.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ociFilePath")
    private final String ociFilePath;

        /**
     * The exact URI path of the object storage.
     * @return the value
     **/
    
    public String getOciFilePath() {
        return ociFilePath;
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
        sb.append("GenerateTempFileUploadTargetResponseDetails(");
        sb.append("tempFileUploadTarget=").append(String.valueOf(this.tempFileUploadTarget));
        sb.append(", uploadKey=").append(String.valueOf(this.uploadKey));
        sb.append(", ociFilePath=").append(String.valueOf(this.ociFilePath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateTempFileUploadTargetResponseDetails)) {
            return false;
        }

        GenerateTempFileUploadTargetResponseDetails other = (GenerateTempFileUploadTargetResponseDetails) o;
        return java.util.Objects.equals(this.tempFileUploadTarget, other.tempFileUploadTarget) &&
            java.util.Objects.equals(this.uploadKey, other.uploadKey) &&
            java.util.Objects.equals(this.ociFilePath, other.ociFilePath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tempFileUploadTarget == null ? 43 : this.tempFileUploadTarget.hashCode());
        result = (result * PRIME) + (this.uploadKey == null ? 43 : this.uploadKey.hashCode());
        result = (result * PRIME) + (this.ociFilePath == null ? 43 : this.ociFilePath.hashCode());
        return result;
    }


}
