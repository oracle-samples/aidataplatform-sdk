// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * File read/upload settings collected by the UI and persisted as Agent Flow
* session configuration. DataHub stores and forwards these settings;
* runtime and gateway components enforce file policy during execution.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FileReadConfiguration.Builder.class)

public final class FileReadConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "allowedFileTypes", "maxFileSizeMb", "maxFileCount", "targetPath", "isPersistenceEnabled", "retentionDays"})
    public FileReadConfiguration(Boolean isEnabled, java.util.List<FileAllowedFileType> allowedFileTypes, Long maxFileSizeMb, Integer maxFileCount, String targetPath, Boolean isPersistenceEnabled, Integer retentionDays) {
        super();
        this.isEnabled = isEnabled;
        this.allowedFileTypes = allowedFileTypes;
        this.maxFileSizeMb = maxFileSizeMb;
        this.maxFileCount = maxFileCount;
        this.targetPath = targetPath;
        this.isPersistenceEnabled = isPersistenceEnabled;
        this.retentionDays = retentionDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether file read/upload configuration is enabled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether file read/upload configuration is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
            /**
     * File type enum values accepted by the UI/runtime contract.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("allowedFileTypes")
private java.util.List<FileAllowedFileType> allowedFileTypes;

        /**
         * File type enum values accepted by the UI/runtime contract.
         * @param allowedFileTypes the value to set
         * @return this builder
         **/
        

public Builder allowedFileTypes(java.util.List<FileAllowedFileType> allowedFileTypes) {
    this.allowedFileTypes = allowedFileTypes;
    return this;
}
            /**
     * Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxFileSizeMb")
private Long maxFileSizeMb;

        /**
         * Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
         * @param maxFileSizeMb the value to set
         * @return this builder
         **/
        

public Builder maxFileSizeMb(Long maxFileSizeMb) {
    this.maxFileSizeMb = maxFileSizeMb;
    return this;
}
            /**
     * Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxFileCount")
private Integer maxFileCount;

        /**
         * Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
         * @param maxFileCount the value to set
         * @return this builder
         **/
        

public Builder maxFileCount(Integer maxFileCount) {
    this.maxFileCount = maxFileCount;
    return this;
}
            /**
     * Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetPath")
private String targetPath;

        /**
         * Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.
         * @param targetPath the value to set
         * @return this builder
         **/
        

public Builder targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
}
            /**
     * Whether uploaded files should be retained beyond the current request/session intent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
private Boolean isPersistenceEnabled;

        /**
         * Whether uploaded files should be retained beyond the current request/session intent.
         * @param isPersistenceEnabled the value to set
         * @return this builder
         **/
        

public Builder isPersistenceEnabled(Boolean isPersistenceEnabled) {
    this.isPersistenceEnabled = isPersistenceEnabled;
    return this;
}
            /**
     * Retention period in days for persisted files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
private Integer retentionDays;

        /**
         * Retention period in days for persisted files.
         * @param retentionDays the value to set
         * @return this builder
         **/
        

public Builder retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
}


        public FileReadConfiguration build() {
            FileReadConfiguration model = new FileReadConfiguration(this.isEnabled
                , this.allowedFileTypes
                , this.maxFileSizeMb
                , this.maxFileCount
                , this.targetPath
                , this.isPersistenceEnabled
                , this.retentionDays);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileReadConfiguration model) {
                this.isEnabled(model.getIsEnabled());
    this.allowedFileTypes(model.getAllowedFileTypes());
    this.maxFileSizeMb(model.getMaxFileSizeMb());
    this.maxFileCount(model.getMaxFileCount());
    this.targetPath(model.getTargetPath());
    this.isPersistenceEnabled(model.getIsPersistenceEnabled());
    this.retentionDays(model.getRetentionDays());
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
     * Whether file read/upload configuration is enabled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether file read/upload configuration is enabled.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    
        /**
     * File type enum values accepted by the UI/runtime contract.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("allowedFileTypes")
    private final java.util.List<FileAllowedFileType> allowedFileTypes;

        /**
     * File type enum values accepted by the UI/runtime contract.
     * @return the value
     **/
    
    public java.util.List<FileAllowedFileType> getAllowedFileTypes() {
        return allowedFileTypes;
    }


        /**
     * Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxFileSizeMb")
    private final Long maxFileSizeMb;

        /**
     * Requested maximum uploaded file size in megabytes. When omitted, Agent Service applies the 10 MiB default; explicit values may raise the per-file limit up to 50 MiB while the active session remains capped at 500 MiB.
     * @return the value
     **/
    
    public Long getMaxFileSizeMb() {
        return maxFileSizeMb;
    }


        /**
     * Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxFileCount")
    private final Integer maxFileCount;

        /**
     * Maximum number of active files allowed in a session. When omitted, Agent Service applies the five-file default; explicit values may raise the limit to twenty while the aggregate byte quota remains authoritative.
     * @return the value
     **/
    
    public Integer getMaxFileCount() {
        return maxFileCount;
    }


        /**
     * Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetPath")
    private final String targetPath;

        /**
     * Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access.
     * @return the value
     **/
    
    public String getTargetPath() {
        return targetPath;
    }


        /**
     * Whether uploaded files should be retained beyond the current request/session intent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
    private final Boolean isPersistenceEnabled;

        /**
     * Whether uploaded files should be retained beyond the current request/session intent.
     * @return the value
     **/
    
    public Boolean getIsPersistenceEnabled() {
        return isPersistenceEnabled;
    }


        /**
     * Retention period in days for persisted files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
    private final Integer retentionDays;

        /**
     * Retention period in days for persisted files.
     * @return the value
     **/
    
    public Integer getRetentionDays() {
        return retentionDays;
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
        sb.append("FileReadConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", allowedFileTypes=").append(String.valueOf(this.allowedFileTypes));
        sb.append(", maxFileSizeMb=").append(String.valueOf(this.maxFileSizeMb));
        sb.append(", maxFileCount=").append(String.valueOf(this.maxFileCount));
        sb.append(", targetPath=").append(String.valueOf(this.targetPath));
        sb.append(", isPersistenceEnabled=").append(String.valueOf(this.isPersistenceEnabled));
        sb.append(", retentionDays=").append(String.valueOf(this.retentionDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileReadConfiguration)) {
            return false;
        }

        FileReadConfiguration other = (FileReadConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.allowedFileTypes, other.allowedFileTypes) &&
            java.util.Objects.equals(this.maxFileSizeMb, other.maxFileSizeMb) &&
            java.util.Objects.equals(this.maxFileCount, other.maxFileCount) &&
            java.util.Objects.equals(this.targetPath, other.targetPath) &&
            java.util.Objects.equals(this.isPersistenceEnabled, other.isPersistenceEnabled) &&
            java.util.Objects.equals(this.retentionDays, other.retentionDays);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.allowedFileTypes == null ? 43 : this.allowedFileTypes.hashCode());
        result = (result * PRIME) + (this.maxFileSizeMb == null ? 43 : this.maxFileSizeMb.hashCode());
        result = (result * PRIME) + (this.maxFileCount == null ? 43 : this.maxFileCount.hashCode());
        result = (result * PRIME) + (this.targetPath == null ? 43 : this.targetPath.hashCode());
        result = (result * PRIME) + (this.isPersistenceEnabled == null ? 43 : this.isPersistenceEnabled.hashCode());
        result = (result * PRIME) + (this.retentionDays == null ? 43 : this.retentionDays.hashCode());
        return result;
    }


}
