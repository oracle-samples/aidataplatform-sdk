package com.oracle.aidataplatform.dp.model;



/**
 * An object in a Data Lake Workspace
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceObjectSearchSummary.Builder.class)

public final class WorkspaceObjectSearchSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "type", "workspaceKey", "path", "timeCreated", "timeUpdated", "createdBy", "createdByName", "updatedBy", "updatedByName"})
    public WorkspaceObjectSearchSummary(String key, String displayName, String description, String type, String workspaceKey, String path, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String createdByName, String updatedBy, String updatedByName) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.workspaceKey = workspaceKey;
        this.path = path;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The key of the object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The key of the object
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Description of the object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the object
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The type of the Workspace Object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * The type of the Workspace Object
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Key of the workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * Key of the workspace.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Path of workspace object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Path of workspace object.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * The date and time when the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time when the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
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
     * The date and time when the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time when the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
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
     * OCID of the user who created this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * OCID of the user who created this record
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this record
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}
            /**
     * OCID of the user who updated this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * OCID of the user who updated this record
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * Name of the user who updated this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
private String updatedByName;

        /**
         * Name of the user who updated this record
         * @param updatedByName the value to set
         * @return this builder
         **/
        

public Builder updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    return this;
}


        public WorkspaceObjectSearchSummary build() {
            WorkspaceObjectSearchSummary model = new WorkspaceObjectSearchSummary(this.key
                , this.displayName
                , this.description
                , this.type
                , this.workspaceKey
                , this.path
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.createdByName
                , this.updatedBy
                , this.updatedByName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceObjectSearchSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.workspaceKey(model.getWorkspaceKey());
    this.path(model.getPath());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
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
     * The key of the object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The key of the object
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Description of the object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the object
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The type of the Workspace Object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * The type of the Workspace Object
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Key of the workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Key of the workspace.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Path of workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Path of workspace object.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The date and time when the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time when the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time when the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time when the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * OCID of the user who created this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * OCID of the user who created this record
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * OCID of the user who updated this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * OCID of the user who updated this record
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Name of the user who updated this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

        /**
     * Name of the user who updated this record
     * @return the value
     **/
    
    public String getUpdatedByName() {
        return updatedByName;
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
        sb.append("WorkspaceObjectSearchSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceObjectSearchSummary)) {
            return false;
        }

        WorkspaceObjectSearchSummary other = (WorkspaceObjectSearchSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        return result;
    }


}
