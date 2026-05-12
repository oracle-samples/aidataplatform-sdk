package com.oracle.aidataplatform.dp.model;



/**
 * Details to copy a workspace object to a different location.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CopyWorkspaceObjectDetails.Builder.class)

public final class CopyWorkspaceObjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"fromPath", "toPath", "isDeleteSource", "isOverWrite", "bufferSize", "isIncludeOutputs"})
    public CopyWorkspaceObjectDetails(String fromPath, String toPath, Boolean isDeleteSource, Boolean isOverWrite, Integer bufferSize, Boolean isIncludeOutputs) {
        super();
        this.fromPath = fromPath;
        this.toPath = toPath;
        this.isDeleteSource = isDeleteSource;
        this.isOverWrite = isOverWrite;
        this.bufferSize = bufferSize;
        this.isIncludeOutputs = isIncludeOutputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The fully qualified path of the Workspace object that should be copied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fromPath")
private String fromPath;

        /**
         * The fully qualified path of the Workspace object that should be copied.
         * @param fromPath the value to set
         * @return this builder
         **/
        

public Builder fromPath(String fromPath) {
    this.fromPath = fromPath;
    return this;
}
            /**
     * The fully qualified destination path to which the Workspace object should be copied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toPath")
private String toPath;

        /**
         * The fully qualified destination path to which the Workspace object should be copied.
         * @param toPath the value to set
         * @return this builder
         **/
        

public Builder toPath(String toPath) {
    this.toPath = toPath;
    return this;
}
            /**
     * Flag to delete the source file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDeleteSource")
private Boolean isDeleteSource;

        /**
         * Flag to delete the source file.
         * @param isDeleteSource the value to set
         * @return this builder
         **/
        

public Builder isDeleteSource(Boolean isDeleteSource) {
    this.isDeleteSource = isDeleteSource;
    return this;
}
            /**
     * Flag to overwrite pre existing destination file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isOverWrite")
private Boolean isOverWrite;

        /**
         * Flag to overwrite pre existing destination file.
         * @param isOverWrite the value to set
         * @return this builder
         **/
        

public Builder isOverWrite(Boolean isOverWrite) {
    this.isOverWrite = isOverWrite;
    return this;
}
            /**
     * Buffer capacity to be hold for copying file from one source to destination.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("bufferSize")
private Integer bufferSize;

        /**
         * Buffer capacity to be hold for copying file from one source to destination.
         * @param bufferSize the value to set
         * @return this builder
         **/
        

public Builder bufferSize(Integer bufferSize) {
    this.bufferSize = bufferSize;
    return this;
}
            /**
     * Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isIncludeOutputs")
private Boolean isIncludeOutputs;

        /**
         * Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.
         * @param isIncludeOutputs the value to set
         * @return this builder
         **/
        

public Builder isIncludeOutputs(Boolean isIncludeOutputs) {
    this.isIncludeOutputs = isIncludeOutputs;
    return this;
}


        public CopyWorkspaceObjectDetails build() {
            CopyWorkspaceObjectDetails model = new CopyWorkspaceObjectDetails(this.fromPath
                , this.toPath
                , this.isDeleteSource
                , this.isOverWrite
                , this.bufferSize
                , this.isIncludeOutputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyWorkspaceObjectDetails model) {
                this.fromPath(model.getFromPath());
    this.toPath(model.getToPath());
    this.isDeleteSource(model.getIsDeleteSource());
    this.isOverWrite(model.getIsOverWrite());
    this.bufferSize(model.getBufferSize());
    this.isIncludeOutputs(model.getIsIncludeOutputs());
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
     * The fully qualified path of the Workspace object that should be copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fromPath")
    private final String fromPath;

        /**
     * The fully qualified path of the Workspace object that should be copied.
     * @return the value
     **/
    
    public String getFromPath() {
        return fromPath;
    }


        /**
     * The fully qualified destination path to which the Workspace object should be copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toPath")
    private final String toPath;

        /**
     * The fully qualified destination path to which the Workspace object should be copied.
     * @return the value
     **/
    
    public String getToPath() {
        return toPath;
    }


        /**
     * Flag to delete the source file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteSource")
    private final Boolean isDeleteSource;

        /**
     * Flag to delete the source file.
     * @return the value
     **/
    
    public Boolean getIsDeleteSource() {
        return isDeleteSource;
    }


        /**
     * Flag to overwrite pre existing destination file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isOverWrite")
    private final Boolean isOverWrite;

        /**
     * Flag to overwrite pre existing destination file.
     * @return the value
     **/
    
    public Boolean getIsOverWrite() {
        return isOverWrite;
    }


        /**
     * Buffer capacity to be hold for copying file from one source to destination.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("bufferSize")
    private final Integer bufferSize;

        /**
     * Buffer capacity to be hold for copying file from one source to destination.
     * @return the value
     **/
    
    public Integer getBufferSize() {
        return bufferSize;
    }


        /**
     * Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeOutputs")
    private final Boolean isIncludeOutputs;

        /**
     * Flag to indicate whether to include cell outputs when copying a notebook file. If false, all cell outputs will be cleared. Defaults to true if not specified. Only applies to notebook files.
     * @return the value
     **/
    
    public Boolean getIsIncludeOutputs() {
        return isIncludeOutputs;
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
        sb.append("CopyWorkspaceObjectDetails(");
        sb.append("fromPath=").append(String.valueOf(this.fromPath));
        sb.append(", toPath=").append(String.valueOf(this.toPath));
        sb.append(", isDeleteSource=").append(String.valueOf(this.isDeleteSource));
        sb.append(", isOverWrite=").append(String.valueOf(this.isOverWrite));
        sb.append(", bufferSize=").append(String.valueOf(this.bufferSize));
        sb.append(", isIncludeOutputs=").append(String.valueOf(this.isIncludeOutputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyWorkspaceObjectDetails)) {
            return false;
        }

        CopyWorkspaceObjectDetails other = (CopyWorkspaceObjectDetails) o;
        return java.util.Objects.equals(this.fromPath, other.fromPath) &&
            java.util.Objects.equals(this.toPath, other.toPath) &&
            java.util.Objects.equals(this.isDeleteSource, other.isDeleteSource) &&
            java.util.Objects.equals(this.isOverWrite, other.isOverWrite) &&
            java.util.Objects.equals(this.bufferSize, other.bufferSize) &&
            java.util.Objects.equals(this.isIncludeOutputs, other.isIncludeOutputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fromPath == null ? 43 : this.fromPath.hashCode());
        result = (result * PRIME) + (this.toPath == null ? 43 : this.toPath.hashCode());
        result = (result * PRIME) + (this.isDeleteSource == null ? 43 : this.isDeleteSource.hashCode());
        result = (result * PRIME) + (this.isOverWrite == null ? 43 : this.isOverWrite.hashCode());
        result = (result * PRIME) + (this.bufferSize == null ? 43 : this.bufferSize.hashCode());
        result = (result * PRIME) + (this.isIncludeOutputs == null ? 43 : this.isIncludeOutputs.hashCode());
        return result;
    }


}
