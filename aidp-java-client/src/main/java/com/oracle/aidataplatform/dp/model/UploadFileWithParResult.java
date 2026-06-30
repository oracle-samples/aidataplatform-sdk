// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response object of generate PAR with Upload API.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UploadFileWithParResult.Builder.class)

public final class UploadFileWithParResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"parUrl", "eTag", "locationUri", "size", "createdBy", "updatedBy", "createdTime", "updatedTime", "description", "systemTags"})
    public UploadFileWithParResult(String parUrl, String eTag, String locationUri, Long size, String createdBy, String updatedBy, String createdTime, String updatedTime, String description, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.parUrl = parUrl;
        this.eTag = eTag;
        this.locationUri = locationUri;
        this.size = size;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.description = description;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * String representing the PAR URL.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parUrl")
private String parUrl;

        /**
         * String representing the PAR URL.
* 
         * @param parUrl the value to set
         * @return this builder
         **/
        

public Builder parUrl(String parUrl) {
    this.parUrl = parUrl;
    return this;
}
            /**
     * Etag after creating or closing a file.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eTag")
private String eTag;

        /**
         * Etag after creating or closing a file.
* 
         * @param eTag the value to set
         * @return this builder
         **/
        

public Builder eTag(String eTag) {
    this.eTag = eTag;
    return this;
}
            /**
     * The object storage URI which has bucket and namespace information.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("locationUri")
private String locationUri;

        /**
         * The object storage URI which has bucket and namespace information.
* 
         * @param locationUri the value to set
         * @return this builder
         **/
        

public Builder locationUri(String locationUri) {
    this.locationUri = locationUri;
    return this;
}
            /**
     * File size in bytes.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("size")
private Long size;

        /**
         * File size in bytes.
* 
         * @param size the value to set
         * @return this builder
         **/
        

public Builder size(Long size) {
    this.size = size;
    return this;
}
            /**
     * The user who created the file.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The user who created the file.
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The user who last updated the file.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The user who last updated the file.
* 
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * The time at which the file was created.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdTime")
private String createdTime;

        /**
         * The time at which the file was created.
* 
         * @param createdTime the value to set
         * @return this builder
         **/
        

public Builder createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
}
            /**
     * The last modified time of the file.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedTime")
private String updatedTime;

        /**
         * The last modified time of the file.
* 
         * @param updatedTime the value to set
         * @return this builder
         **/
        

public Builder updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
}
            /**
     * The file description.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * The file description.
* 
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("systemTags")
private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
         * @param systemTags the value to set
         * @return this builder
         **/
        

public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
    this.systemTags = systemTags;
    return this;
}


        public UploadFileWithParResult build() {
            UploadFileWithParResult model = new UploadFileWithParResult(this.parUrl
                , this.eTag
                , this.locationUri
                , this.size
                , this.createdBy
                , this.updatedBy
                , this.createdTime
                , this.updatedTime
                , this.description
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadFileWithParResult model) {
                this.parUrl(model.getParUrl());
    this.eTag(model.getETag());
    this.locationUri(model.getLocationUri());
    this.size(model.getSize());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.createdTime(model.getCreatedTime());
    this.updatedTime(model.getUpdatedTime());
    this.description(model.getDescription());
    this.systemTags(model.getSystemTags());
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
     * String representing the PAR URL.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parUrl")
    private final String parUrl;

        /**
     * String representing the PAR URL.
* 
     * @return the value
     **/
    
    public String getParUrl() {
        return parUrl;
    }


        /**
     * Etag after creating or closing a file.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eTag")
    private final String eTag;

        /**
     * Etag after creating or closing a file.
* 
     * @return the value
     **/
    
    public String getETag() {
        return eTag;
    }


        /**
     * The object storage URI which has bucket and namespace information.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("locationUri")
    private final String locationUri;

        /**
     * The object storage URI which has bucket and namespace information.
* 
     * @return the value
     **/
    
    public String getLocationUri() {
        return locationUri;
    }


        /**
     * File size in bytes.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Long size;

        /**
     * File size in bytes.
* 
     * @return the value
     **/
    
    public Long getSize() {
        return size;
    }


        /**
     * The user who created the file.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The user who created the file.
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The user who last updated the file.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The user who last updated the file.
* 
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * The time at which the file was created.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdTime")
    private final String createdTime;

        /**
     * The time at which the file was created.
* 
     * @return the value
     **/
    
    public String getCreatedTime() {
        return createdTime;
    }


        /**
     * The last modified time of the file.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedTime")
    private final String updatedTime;

        /**
     * The last modified time of the file.
* 
     * @return the value
     **/
    
    public String getUpdatedTime() {
        return updatedTime;
    }


        /**
     * The file description.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The file description.
* 
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("UploadFileWithParResult(");
        sb.append("parUrl=").append("<redacted>");
        sb.append(", eTag=").append(String.valueOf(this.eTag));
        sb.append(", locationUri=").append(String.valueOf(this.locationUri));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", createdTime=").append(String.valueOf(this.createdTime));
        sb.append(", updatedTime=").append(String.valueOf(this.updatedTime));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadFileWithParResult)) {
            return false;
        }

        UploadFileWithParResult other = (UploadFileWithParResult) o;
        return java.util.Objects.equals(this.parUrl, other.parUrl) &&
            java.util.Objects.equals(this.eTag, other.eTag) &&
            java.util.Objects.equals(this.locationUri, other.locationUri) &&
            java.util.Objects.equals(this.size, other.size) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.createdTime, other.createdTime) &&
            java.util.Objects.equals(this.updatedTime, other.updatedTime) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parUrl == null ? 43 : this.parUrl.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.locationUri == null ? 43 : this.locationUri.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.createdTime == null ? 43 : this.createdTime.hashCode());
        result = (result * PRIME) + (this.updatedTime == null ? 43 : this.updatedTime.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
