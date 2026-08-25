// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of creating or updating a workspace zip upload and extraction operation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UploadAndExtractZipResult.Builder.class)

public final class UploadAndExtractZipResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"operationKey", "uploadUrl", "destinationFolderPath"})
    public UploadAndExtractZipResult(String operationKey, String uploadUrl, String destinationFolderPath) {
        super();
        this.operationKey = operationKey;
        this.uploadUrl = uploadUrl;
        this.destinationFolderPath = destinationFolderPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Async operation key for upload and extraction.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operationKey")
private String operationKey;

        /**
         * Async operation key for upload and extraction.
         * @param operationKey the value to set
         * @return this builder
         **/
        

public Builder operationKey(String operationKey) {
    this.operationKey = operationKey;
    return this;
}
            /**
     * PAR URL where the caller uploads the zip bytes. Returned for CREATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uploadUrl")
private String uploadUrl;

        /**
         * PAR URL where the caller uploads the zip bytes. Returned for CREATE.
         * @param uploadUrl the value to set
         * @return this builder
         **/
        

public Builder uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
}
            /**
     * Final workspace folder path where the zip will be extracted. Returned for CREATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destinationFolderPath")
private String destinationFolderPath;

        /**
         * Final workspace folder path where the zip will be extracted. Returned for CREATE.
         * @param destinationFolderPath the value to set
         * @return this builder
         **/
        

public Builder destinationFolderPath(String destinationFolderPath) {
    this.destinationFolderPath = destinationFolderPath;
    return this;
}


        public UploadAndExtractZipResult build() {
            UploadAndExtractZipResult model = new UploadAndExtractZipResult(this.operationKey
                , this.uploadUrl
                , this.destinationFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadAndExtractZipResult model) {
                this.operationKey(model.getOperationKey());
    this.uploadUrl(model.getUploadUrl());
    this.destinationFolderPath(model.getDestinationFolderPath());
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
     * Async operation key for upload and extraction.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operationKey")
    private final String operationKey;

        /**
     * Async operation key for upload and extraction.
     * @return the value
     **/
    
    public String getOperationKey() {
        return operationKey;
    }


        /**
     * PAR URL where the caller uploads the zip bytes. Returned for CREATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uploadUrl")
    private final String uploadUrl;

        /**
     * PAR URL where the caller uploads the zip bytes. Returned for CREATE.
     * @return the value
     **/
    
    public String getUploadUrl() {
        return uploadUrl;
    }


        /**
     * Final workspace folder path where the zip will be extracted. Returned for CREATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destinationFolderPath")
    private final String destinationFolderPath;

        /**
     * Final workspace folder path where the zip will be extracted. Returned for CREATE.
     * @return the value
     **/
    
    public String getDestinationFolderPath() {
        return destinationFolderPath;
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
        sb.append("UploadAndExtractZipResult(");
        sb.append("operationKey=").append(String.valueOf(this.operationKey));
        sb.append(", uploadUrl=").append("<redacted>");
        sb.append(", destinationFolderPath=").append(String.valueOf(this.destinationFolderPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadAndExtractZipResult)) {
            return false;
        }

        UploadAndExtractZipResult other = (UploadAndExtractZipResult) o;
        return java.util.Objects.equals(this.operationKey, other.operationKey) &&
            java.util.Objects.equals(this.uploadUrl, other.uploadUrl) &&
            java.util.Objects.equals(this.destinationFolderPath, other.destinationFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operationKey == null ? 43 : this.operationKey.hashCode());
        result = (result * PRIME) + (this.uploadUrl == null ? 43 : this.uploadUrl.hashCode());
        result = (result * PRIME) + (this.destinationFolderPath == null ? 43 : this.destinationFolderPath.hashCode());
        return result;
    }


}
