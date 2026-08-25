// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details to create or update a workspace zip upload and extraction operation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UploadAndExtractZipDetails.Builder.class)

public final class UploadAndExtractZipDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "operationKey", "zipFileName", "destinationFolderPath", "isOverwrite", "eTag", "sizeInBytes"})
    public UploadAndExtractZipDetails(Action action, String operationKey, String zipFileName, String destinationFolderPath, Boolean isOverwrite, String eTag, Long sizeInBytes) {
        super();
        this.action = action;
        this.operationKey = operationKey;
        this.zipFileName = zipFileName;
        this.destinationFolderPath = destinationFolderPath;
        this.isOverwrite = isOverwrite;
        this.eTag = eTag;
        this.sizeInBytes = sizeInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("action")
private Action action;

        /**
         * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
         * @param action the value to set
         * @return this builder
         **/
        

public Builder action(Action action) {
    this.action = action;
    return this;
}
            /**
     * Async operation key returned by the CREATE action. Required for UPDATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operationKey")
private String operationKey;

        /**
         * Async operation key returned by the CREATE action. Required for UPDATE.
         * @param operationKey the value to set
         * @return this builder
         **/
        

public Builder operationKey(String operationKey) {
    this.operationKey = operationKey;
    return this;
}
            /**
     * Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("zipFileName")
private String zipFileName;

        /**
         * Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.
         * @param zipFileName the value to set
         * @return this builder
         **/
        

public Builder zipFileName(String zipFileName) {
    this.zipFileName = zipFileName;
    return this;
}
            /**
     * Workspace folder where the zip root folder will be extracted. Required for CREATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destinationFolderPath")
private String destinationFolderPath;

        /**
         * Workspace folder where the zip root folder will be extracted. Required for CREATE.
         * @param destinationFolderPath the value to set
         * @return this builder
         **/
        

public Builder destinationFolderPath(String destinationFolderPath) {
    this.destinationFolderPath = destinationFolderPath;
    return this;
}
            /**
     * Flag to overwrite existing files during extraction. If false, existing files are skipped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
private Boolean isOverwrite;

        /**
         * Flag to overwrite existing files during extraction. If false, existing files are skipped.
         * @param isOverwrite the value to set
         * @return this builder
         **/
        

public Builder isOverwrite(Boolean isOverwrite) {
    this.isOverwrite = isOverwrite;
    return this;
}
            /**
     * Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eTag")
private String eTag;

        /**
         * Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
         * @param eTag the value to set
         * @return this builder
         **/
        

public Builder eTag(String eTag) {
    this.eTag = eTag;
    return this;
}
            /**
     * Final uploaded zip object size in bytes. Required for UPDATE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
private Long sizeInBytes;

        /**
         * Final uploaded zip object size in bytes. Required for UPDATE.
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        

public Builder sizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
}


        public UploadAndExtractZipDetails build() {
            UploadAndExtractZipDetails model = new UploadAndExtractZipDetails(this.action
                , this.operationKey
                , this.zipFileName
                , this.destinationFolderPath
                , this.isOverwrite
                , this.eTag
                , this.sizeInBytes);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadAndExtractZipDetails model) {
                this.action(model.getAction());
    this.operationKey(model.getOperationKey());
    this.zipFileName(model.getZipFileName());
    this.destinationFolderPath(model.getDestinationFolderPath());
    this.isOverwrite(model.getIsOverwrite());
    this.eTag(model.getETag());
    this.sizeInBytes(model.getSizeInBytes());
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
     * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
     **/
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Create("CREATE"),
        Update("UPDATE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
        /**
     * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
     * @return the value
     **/
    
    public Action getAction() {
        return action;
    }


        /**
     * Async operation key returned by the CREATE action. Required for UPDATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operationKey")
    private final String operationKey;

        /**
     * Async operation key returned by the CREATE action. Required for UPDATE.
     * @return the value
     **/
    
    public String getOperationKey() {
        return operationKey;
    }


        /**
     * Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("zipFileName")
    private final String zipFileName;

        /**
     * Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.
     * @return the value
     **/
    
    public String getZipFileName() {
        return zipFileName;
    }


        /**
     * Workspace folder where the zip root folder will be extracted. Required for CREATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destinationFolderPath")
    private final String destinationFolderPath;

        /**
     * Workspace folder where the zip root folder will be extracted. Required for CREATE.
     * @return the value
     **/
    
    public String getDestinationFolderPath() {
        return destinationFolderPath;
    }


        /**
     * Flag to overwrite existing files during extraction. If false, existing files are skipped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwrite")
    private final Boolean isOverwrite;

        /**
     * Flag to overwrite existing files during extraction. If false, existing files are skipped.
     * @return the value
     **/
    
    public Boolean getIsOverwrite() {
        return isOverwrite;
    }


        /**
     * Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eTag")
    private final String eTag;

        /**
     * Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
     * @return the value
     **/
    
    public String getETag() {
        return eTag;
    }


        /**
     * Final uploaded zip object size in bytes. Required for UPDATE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

        /**
     * Final uploaded zip object size in bytes. Required for UPDATE.
     * @return the value
     **/
    
    public Long getSizeInBytes() {
        return sizeInBytes;
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
        sb.append("UploadAndExtractZipDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", operationKey=").append(String.valueOf(this.operationKey));
        sb.append(", zipFileName=").append(String.valueOf(this.zipFileName));
        sb.append(", destinationFolderPath=").append(String.valueOf(this.destinationFolderPath));
        sb.append(", isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(", eTag=").append(String.valueOf(this.eTag));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadAndExtractZipDetails)) {
            return false;
        }

        UploadAndExtractZipDetails other = (UploadAndExtractZipDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.operationKey, other.operationKey) &&
            java.util.Objects.equals(this.zipFileName, other.zipFileName) &&
            java.util.Objects.equals(this.destinationFolderPath, other.destinationFolderPath) &&
            java.util.Objects.equals(this.isOverwrite, other.isOverwrite) &&
            java.util.Objects.equals(this.eTag, other.eTag) &&
            java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.operationKey == null ? 43 : this.operationKey.hashCode());
        result = (result * PRIME) + (this.zipFileName == null ? 43 : this.zipFileName.hashCode());
        result = (result * PRIME) + (this.destinationFolderPath == null ? 43 : this.destinationFolderPath.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        return result;
    }


}
