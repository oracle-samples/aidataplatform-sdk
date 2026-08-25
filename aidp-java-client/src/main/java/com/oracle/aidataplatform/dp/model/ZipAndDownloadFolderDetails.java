// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details to zip a workspace folder for download.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ZipAndDownloadFolderDetails.Builder.class)

public final class ZipAndDownloadFolderDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceFolderPath"})
    public ZipAndDownloadFolderDetails(String sourceFolderPath) {
        super();
        this.sourceFolderPath = sourceFolderPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace folder path to zip for download.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceFolderPath")
private String sourceFolderPath;

        /**
         * Workspace folder path to zip for download.
         * @param sourceFolderPath the value to set
         * @return this builder
         **/
        

public Builder sourceFolderPath(String sourceFolderPath) {
    this.sourceFolderPath = sourceFolderPath;
    return this;
}


        public ZipAndDownloadFolderDetails build() {
            ZipAndDownloadFolderDetails model = new ZipAndDownloadFolderDetails(this.sourceFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZipAndDownloadFolderDetails model) {
                this.sourceFolderPath(model.getSourceFolderPath());
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
     * Workspace folder path to zip for download.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFolderPath")
    private final String sourceFolderPath;

        /**
     * Workspace folder path to zip for download.
     * @return the value
     **/
    
    public String getSourceFolderPath() {
        return sourceFolderPath;
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
        sb.append("ZipAndDownloadFolderDetails(");
        sb.append("sourceFolderPath=").append(String.valueOf(this.sourceFolderPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZipAndDownloadFolderDetails)) {
            return false;
        }

        ZipAndDownloadFolderDetails other = (ZipAndDownloadFolderDetails) o;
        return java.util.Objects.equals(this.sourceFolderPath, other.sourceFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceFolderPath == null ? 43 : this.sourceFolderPath.hashCode());
        return result;
    }


}
