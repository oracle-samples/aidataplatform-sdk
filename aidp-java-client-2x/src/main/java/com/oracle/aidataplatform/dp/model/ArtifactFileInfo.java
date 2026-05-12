package com.oracle.aidataplatform.dp.model;


/**
 * FileInfo of Artifact.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ArtifactFileInfo.Builder.class)

public final class ArtifactFileInfo  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "isDir", "fileSize"})
    public ArtifactFileInfo(String path, Boolean isDir, Long fileSize) {
        super();
        this.path = path;
        this.isDir = isDir;
        this.fileSize = fileSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Path relative to the root artifact directory run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * Path relative to the root artifact directory run.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * Whether the path is a directory.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("is_dir")
        private Boolean isDir;

                /**
         * Whether the path is a directory.
         * @param isDir the value to set
         * @return this builder
         **/
        

        public Builder isDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
        }
            /**
     * Size in bytes. Unset for directories.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("file_size")
        private Long fileSize;

                /**
         * Size in bytes. Unset for directories.
         * @param fileSize the value to set
         * @return this builder
         **/
        

        public Builder fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
        }


        public ArtifactFileInfo build() {
            ArtifactFileInfo model = new ArtifactFileInfo(this.path
                    , this.isDir
                    , this.fileSize);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArtifactFileInfo model) {
                this.path(model.getPath());
    this.isDir(model.getIsDir());
    this.fileSize(model.getFileSize());
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
     * Path relative to the root artifact directory run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Path relative to the root artifact directory run.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Whether the path is a directory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("is_dir")
    private final Boolean isDir;

        /**
     * Whether the path is a directory.
     * @return the value
     **/
    
    public Boolean getIsDir() {
        return isDir;
    }


        /**
     * Size in bytes. Unset for directories.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("file_size")
    private final Long fileSize;

        /**
     * Size in bytes. Unset for directories.
     * @return the value
     **/
    
    public Long getFileSize() {
        return fileSize;
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
        sb.append("ArtifactFileInfo(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", isDir=").append(String.valueOf(this.isDir));
        sb.append(", fileSize=").append(String.valueOf(this.fileSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactFileInfo)) {
            return false;
        }

        ArtifactFileInfo other = (ArtifactFileInfo) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.isDir, other.isDir) &&
            java.util.Objects.equals(this.fileSize, other.fileSize);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.isDir == null ? 43 : this.isDir.hashCode());
        result = (result * PRIME) + (this.fileSize == null ? 43 : this.fileSize.hashCode());
        return result;
    }


}
