// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of starting workspace folder zip creation for download.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ZipAndDownloadFolderResult.Builder.class)

public final class ZipAndDownloadFolderResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"operationKey", "downloadUrl", "archiveName"})
    public ZipAndDownloadFolderResult(String operationKey, String downloadUrl, String archiveName) {
        super();
        this.operationKey = operationKey;
        this.downloadUrl = downloadUrl;
        this.archiveName = archiveName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Async operation key for zip creation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operationKey")
private String operationKey;

        /**
         * Async operation key for zip creation.
         * @param operationKey the value to set
         * @return this builder
         **/
        

public Builder operationKey(String operationKey) {
    this.operationKey = operationKey;
    return this;
}
            /**
     * PAR URL for downloading the generated archive after async operation success.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
private String downloadUrl;

        /**
         * PAR URL for downloading the generated archive after async operation success.
         * @param downloadUrl the value to set
         * @return this builder
         **/
        

public Builder downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
}
            /**
     * Generated archive basename, including its .zip or .aidp extension.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("archiveName")
private String archiveName;

        /**
         * Generated archive basename, including its .zip or .aidp extension.
         * @param archiveName the value to set
         * @return this builder
         **/
        

public Builder archiveName(String archiveName) {
    this.archiveName = archiveName;
    return this;
}


        public ZipAndDownloadFolderResult build() {
            ZipAndDownloadFolderResult model = new ZipAndDownloadFolderResult(this.operationKey
                , this.downloadUrl
                , this.archiveName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZipAndDownloadFolderResult model) {
                this.operationKey(model.getOperationKey());
    this.downloadUrl(model.getDownloadUrl());
    this.archiveName(model.getArchiveName());
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
     * Async operation key for zip creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operationKey")
    private final String operationKey;

        /**
     * Async operation key for zip creation.
     * @return the value
     **/
    
    public String getOperationKey() {
        return operationKey;
    }


        /**
     * PAR URL for downloading the generated archive after async operation success.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
    private final String downloadUrl;

        /**
     * PAR URL for downloading the generated archive after async operation success.
     * @return the value
     **/
    
    public String getDownloadUrl() {
        return downloadUrl;
    }


        /**
     * Generated archive basename, including its .zip or .aidp extension.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("archiveName")
    private final String archiveName;

        /**
     * Generated archive basename, including its .zip or .aidp extension.
     * @return the value
     **/
    
    public String getArchiveName() {
        return archiveName;
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
        sb.append("ZipAndDownloadFolderResult(");
        sb.append("operationKey=").append(String.valueOf(this.operationKey));
        sb.append(", downloadUrl=").append("<redacted>");
        sb.append(", archiveName=").append(String.valueOf(this.archiveName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZipAndDownloadFolderResult)) {
            return false;
        }

        ZipAndDownloadFolderResult other = (ZipAndDownloadFolderResult) o;
        return java.util.Objects.equals(this.operationKey, other.operationKey) &&
            java.util.Objects.equals(this.downloadUrl, other.downloadUrl) &&
            java.util.Objects.equals(this.archiveName, other.archiveName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operationKey == null ? 43 : this.operationKey.hashCode());
        result = (result * PRIME) + (this.downloadUrl == null ? 43 : this.downloadUrl.hashCode());
        result = (result * PRIME) + (this.archiveName == null ? 43 : this.archiveName.hashCode());
        return result;
    }


}
