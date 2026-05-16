// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a workspace object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceObjectSummary.Builder.class)

public final class WorkspaceObjectSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "displayName", "timeCreated", "timeUpdated", "metadata", "compositeEtag", "type", "description", "systemTags", "createdBy", "createdByName"})
    public WorkspaceObjectSummary(String path, String displayName, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.Map<String, String> metadata, String compositeEtag, WorkspaceObjectDetails.Type type, String description, java.util.Map<String, java.util.Map<String, Object>> systemTags, String createdBy, String createdByName) {
        super();
        this.path = path;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.metadata = metadata;
        this.compositeEtag = compositeEtag;
        this.type = type;
        this.description = description;
        this.systemTags = systemTags;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The fully qualified path of the workspace object.
* Example: /Shared/Folder1/Notebook1.ipynb
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The fully qualified path of the workspace object.
* Example: /Shared/Folder1/Notebook1.ipynb
* 
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * The name of the workspace object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * The name of the workspace object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * Metadata details of file or folder objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metadata")
private java.util.Map<String, String> metadata;

        /**
         * Metadata details of file or folder objects.
         * @param metadata the value to set
         * @return this builder
         **/
        

public Builder metadata(java.util.Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
}
            /**
     * Etag combining data and metadata.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compositeEtag")
private String compositeEtag;

        /**
         * Etag combining data and metadata.
         * @param compositeEtag the value to set
         * @return this builder
         **/
        

public Builder compositeEtag(String compositeEtag) {
    this.compositeEtag = compositeEtag;
    return this;
}
            /**
     * The type of workspace object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private WorkspaceObjectDetails.Type type;

        /**
         * The type of workspace object.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(WorkspaceObjectDetails.Type type) {
    this.type = type;
    return this;
}
            /**
     * The description of workspace object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * The description of workspace object.
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
            /**
     * OCID of the user who created this object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * OCID of the user who created this object.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this object.
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}


        public WorkspaceObjectSummary build() {
            WorkspaceObjectSummary model = new WorkspaceObjectSummary(this.path
                , this.displayName
                , this.timeCreated
                , this.timeUpdated
                , this.metadata
                , this.compositeEtag
                , this.type
                , this.description
                , this.systemTags
                , this.createdBy
                , this.createdByName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceObjectSummary model) {
                this.path(model.getPath());
    this.displayName(model.getDisplayName());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.metadata(model.getMetadata());
    this.compositeEtag(model.getCompositeEtag());
    this.type(model.getType());
    this.description(model.getDescription());
    this.systemTags(model.getSystemTags());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
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
     * The fully qualified path of the workspace object.
* Example: /Shared/Folder1/Notebook1.ipynb
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The fully qualified path of the workspace object.
* Example: /Shared/Folder1/Notebook1.ipynb
* 
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The name of the workspace object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The name of the workspace object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the workspace object was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Metadata details of file or folder objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

        /**
     * Metadata details of file or folder objects.
     * @return the value
     **/
    
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }


        /**
     * Etag combining data and metadata.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compositeEtag")
    private final String compositeEtag;

        /**
     * Etag combining data and metadata.
     * @return the value
     **/
    
    public String getCompositeEtag() {
        return compositeEtag;
    }


        /**
     * The type of workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final WorkspaceObjectDetails.Type type;

        /**
     * The type of workspace object.
     * @return the value
     **/
    
    public WorkspaceObjectDetails.Type getType() {
        return type;
    }


        /**
     * The description of workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of workspace object.
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


        /**
     * OCID of the user who created this object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * OCID of the user who created this object.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this object.
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
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
        sb.append("WorkspaceObjectSummary(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", compositeEtag=").append(String.valueOf(this.compositeEtag));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceObjectSummary)) {
            return false;
        }

        WorkspaceObjectSummary other = (WorkspaceObjectSummary) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.metadata, other.metadata) &&
            java.util.Objects.equals(this.compositeEtag, other.compositeEtag) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.systemTags, other.systemTags) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.compositeEtag == null ? 43 : this.compositeEtag.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        return result;
    }


}
