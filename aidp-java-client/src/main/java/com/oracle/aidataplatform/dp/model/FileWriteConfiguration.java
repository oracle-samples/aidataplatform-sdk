// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * File write/download settings collected by the UI and persisted as Agent Flow
* session configuration. DataHub stores and forwards these settings;
* runtime and gateway components enforce file policy during execution.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FileWriteConfiguration.Builder.class)

public final class FileWriteConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "isDownloadToCatalogEnabled", "allowedFileTypes", "maxFileSizeMb", "targetPath", "isPersistenceEnabled", "retentionDays", "visibility", "downloadLinkExpiry"})
    public FileWriteConfiguration(Boolean isEnabled, Boolean isDownloadToCatalogEnabled, java.util.List<FileAllowedFileType> allowedFileTypes, Long maxFileSizeMb, String targetPath, Boolean isPersistenceEnabled, Integer retentionDays, Visibility visibility, DownloadLinkExpiry downloadLinkExpiry) {
        super();
        this.isEnabled = isEnabled;
        this.isDownloadToCatalogEnabled = isDownloadToCatalogEnabled;
        this.allowedFileTypes = allowedFileTypes;
        this.maxFileSizeMb = maxFileSizeMb;
        this.targetPath = targetPath;
        this.isPersistenceEnabled = isPersistenceEnabled;
        this.retentionDays = retentionDays;
        this.visibility = visibility;
        this.downloadLinkExpiry = downloadLinkExpiry;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether file write/download configuration is enabled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether file write/download configuration is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
            /**
     * Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDownloadToCatalogEnabled")
private Boolean isDownloadToCatalogEnabled;

        /**
         * Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
         * @param isDownloadToCatalogEnabled the value to set
         * @return this builder
         **/
        

public Builder isDownloadToCatalogEnabled(Boolean isDownloadToCatalogEnabled) {
    this.isDownloadToCatalogEnabled = isDownloadToCatalogEnabled;
    return this;
}
            /**
     * File type enum values allowed for generated/downloadable files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("allowedFileTypes")
private java.util.List<FileAllowedFileType> allowedFileTypes;

        /**
         * File type enum values allowed for generated/downloadable files.
         * @param allowedFileTypes the value to set
         * @return this builder
         **/
        

public Builder allowedFileTypes(java.util.List<FileAllowedFileType> allowedFileTypes) {
    this.allowedFileTypes = allowedFileTypes;
    return this;
}
            /**
     * Maximum generated/downloadable file size in megabytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxFileSizeMb")
private Long maxFileSizeMb;

        /**
         * Maximum generated/downloadable file size in megabytes.
         * @param maxFileSizeMb the value to set
         * @return this builder
         **/
        

public Builder maxFileSizeMb(Long maxFileSizeMb) {
    this.maxFileSizeMb = maxFileSizeMb;
    return this;
}
            /**
     * Strict relative workspace folder or volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetPath")
private String targetPath;

        /**
         * Strict relative workspace folder or volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.
         * @param targetPath the value to set
         * @return this builder
         **/
        

public Builder targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
}
            /**
     * Whether generated/downloadable files should be retained beyond the current request/session intent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
private Boolean isPersistenceEnabled;

        /**
         * Whether generated/downloadable files should be retained beyond the current request/session intent.
         * @param isPersistenceEnabled the value to set
         * @return this builder
         **/
        

public Builder isPersistenceEnabled(Boolean isPersistenceEnabled) {
    this.isPersistenceEnabled = isPersistenceEnabled;
    return this;
}
            /**
     * Retention period in days for generated/downloadable files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
private Integer retentionDays;

        /**
         * Retention period in days for generated/downloadable files.
         * @param retentionDays the value to set
         * @return this builder
         **/
        

public Builder retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
}
            /**
     * Intended file visibility for generated/downloadable files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("visibility")
private Visibility visibility;

        /**
         * Intended file visibility for generated/downloadable files.
         * @param visibility the value to set
         * @return this builder
         **/
        

public Builder visibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
}
            /**
     * Intended download link expiry behavior, for example session duration.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("downloadLinkExpiry")
private DownloadLinkExpiry downloadLinkExpiry;

        /**
         * Intended download link expiry behavior, for example session duration.
         * @param downloadLinkExpiry the value to set
         * @return this builder
         **/
        

public Builder downloadLinkExpiry(DownloadLinkExpiry downloadLinkExpiry) {
    this.downloadLinkExpiry = downloadLinkExpiry;
    return this;
}


        public FileWriteConfiguration build() {
            FileWriteConfiguration model = new FileWriteConfiguration(this.isEnabled
                , this.isDownloadToCatalogEnabled
                , this.allowedFileTypes
                , this.maxFileSizeMb
                , this.targetPath
                , this.isPersistenceEnabled
                , this.retentionDays
                , this.visibility
                , this.downloadLinkExpiry);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileWriteConfiguration model) {
                this.isEnabled(model.getIsEnabled());
    this.isDownloadToCatalogEnabled(model.getIsDownloadToCatalogEnabled());
    this.allowedFileTypes(model.getAllowedFileTypes());
    this.maxFileSizeMb(model.getMaxFileSizeMb());
    this.targetPath(model.getTargetPath());
    this.isPersistenceEnabled(model.getIsPersistenceEnabled());
    this.retentionDays(model.getRetentionDays());
    this.visibility(model.getVisibility());
    this.downloadLinkExpiry(model.getDownloadLinkExpiry());
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
     * Whether file write/download configuration is enabled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether file write/download configuration is enabled.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


        /**
     * Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDownloadToCatalogEnabled")
    private final Boolean isDownloadToCatalogEnabled;

        /**
     * Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
     * @return the value
     **/
    
    public Boolean getIsDownloadToCatalogEnabled() {
        return isDownloadToCatalogEnabled;
    }

    
        /**
     * File type enum values allowed for generated/downloadable files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("allowedFileTypes")
    private final java.util.List<FileAllowedFileType> allowedFileTypes;

        /**
     * File type enum values allowed for generated/downloadable files.
     * @return the value
     **/
    
    public java.util.List<FileAllowedFileType> getAllowedFileTypes() {
        return allowedFileTypes;
    }


        /**
     * Maximum generated/downloadable file size in megabytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxFileSizeMb")
    private final Long maxFileSizeMb;

        /**
     * Maximum generated/downloadable file size in megabytes.
     * @return the value
     **/
    
    public Long getMaxFileSizeMb() {
        return maxFileSizeMb;
    }


        /**
     * Strict relative workspace folder or volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetPath")
    private final String targetPath;

        /**
     * Strict relative workspace folder or volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.
     * @return the value
     **/
    
    public String getTargetPath() {
        return targetPath;
    }


        /**
     * Whether generated/downloadable files should be retained beyond the current request/session intent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPersistenceEnabled")
    private final Boolean isPersistenceEnabled;

        /**
     * Whether generated/downloadable files should be retained beyond the current request/session intent.
     * @return the value
     **/
    
    public Boolean getIsPersistenceEnabled() {
        return isPersistenceEnabled;
    }


        /**
     * Retention period in days for generated/downloadable files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
    private final Integer retentionDays;

        /**
     * Retention period in days for generated/downloadable files.
     * @return the value
     **/
    
    public Integer getRetentionDays() {
        return retentionDays;
    }

    /**
     * Intended file visibility for generated/downloadable files.
     **/
    public enum Visibility implements com.oracle.bmc.http.internal.BmcEnum {
        EndUserOnly("END_USER_ONLY"),
        DeveloperOnly("DEVELOPER_ONLY"),
        EndUserAndDeveloper("END_USER_AND_DEVELOPER"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Visibility.class);

        private final String value;
        private static java.util.Map<String, Visibility> map;

        static {
            map = new java.util.HashMap<>();
            for (Visibility v : Visibility.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Visibility(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Visibility create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Visibility', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Intended file visibility for generated/downloadable files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("visibility")
    private final Visibility visibility;

        /**
     * Intended file visibility for generated/downloadable files.
     * @return the value
     **/
    
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Intended download link expiry behavior, for example session duration.
     **/
    public enum DownloadLinkExpiry implements com.oracle.bmc.http.internal.BmcEnum {
        SessionDuration("SESSION_DURATION"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DownloadLinkExpiry.class);

        private final String value;
        private static java.util.Map<String, DownloadLinkExpiry> map;

        static {
            map = new java.util.HashMap<>();
            for (DownloadLinkExpiry v : DownloadLinkExpiry.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DownloadLinkExpiry(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DownloadLinkExpiry create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'DownloadLinkExpiry', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Intended download link expiry behavior, for example session duration.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("downloadLinkExpiry")
    private final DownloadLinkExpiry downloadLinkExpiry;

        /**
     * Intended download link expiry behavior, for example session duration.
     * @return the value
     **/
    
    public DownloadLinkExpiry getDownloadLinkExpiry() {
        return downloadLinkExpiry;
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
        sb.append("FileWriteConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isDownloadToCatalogEnabled=").append(String.valueOf(this.isDownloadToCatalogEnabled));
        sb.append(", allowedFileTypes=").append(String.valueOf(this.allowedFileTypes));
        sb.append(", maxFileSizeMb=").append(String.valueOf(this.maxFileSizeMb));
        sb.append(", targetPath=").append(String.valueOf(this.targetPath));
        sb.append(", isPersistenceEnabled=").append(String.valueOf(this.isPersistenceEnabled));
        sb.append(", retentionDays=").append(String.valueOf(this.retentionDays));
        sb.append(", visibility=").append(String.valueOf(this.visibility));
        sb.append(", downloadLinkExpiry=").append(String.valueOf(this.downloadLinkExpiry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileWriteConfiguration)) {
            return false;
        }

        FileWriteConfiguration other = (FileWriteConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.isDownloadToCatalogEnabled, other.isDownloadToCatalogEnabled) &&
            java.util.Objects.equals(this.allowedFileTypes, other.allowedFileTypes) &&
            java.util.Objects.equals(this.maxFileSizeMb, other.maxFileSizeMb) &&
            java.util.Objects.equals(this.targetPath, other.targetPath) &&
            java.util.Objects.equals(this.isPersistenceEnabled, other.isPersistenceEnabled) &&
            java.util.Objects.equals(this.retentionDays, other.retentionDays) &&
            java.util.Objects.equals(this.visibility, other.visibility) &&
            java.util.Objects.equals(this.downloadLinkExpiry, other.downloadLinkExpiry);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isDownloadToCatalogEnabled == null ? 43 : this.isDownloadToCatalogEnabled.hashCode());
        result = (result * PRIME) + (this.allowedFileTypes == null ? 43 : this.allowedFileTypes.hashCode());
        result = (result * PRIME) + (this.maxFileSizeMb == null ? 43 : this.maxFileSizeMb.hashCode());
        result = (result * PRIME) + (this.targetPath == null ? 43 : this.targetPath.hashCode());
        result = (result * PRIME) + (this.isPersistenceEnabled == null ? 43 : this.isPersistenceEnabled.hashCode());
        result = (result * PRIME) + (this.retentionDays == null ? 43 : this.retentionDays.hashCode());
        result = (result * PRIME) + (this.visibility == null ? 43 : this.visibility.hashCode());
        result = (result * PRIME) + (this.downloadLinkExpiry == null ? 43 : this.downloadLinkExpiry.hashCode());
        return result;
    }


}
