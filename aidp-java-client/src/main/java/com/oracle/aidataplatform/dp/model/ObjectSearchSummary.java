package com.oracle.aidataplatform.dp.model;



/**
 * A Search object in a Data Lake
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ObjectSearchSummary.Builder.class)

public final class ObjectSearchSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "type", "path", "timeCreated", "timeUpdated", "owner", "createdByName", "updatedByName", "workspaceKey", "workspaceName", "catalogKey", "schemaKey", "hitHighlights"})
    public ObjectSearchSummary(String key, String displayName, String description, String type, String path, java.util.Date timeCreated, java.util.Date timeUpdated, String owner, String createdByName, String updatedByName, String workspaceKey, String workspaceName, String catalogKey, String schemaKey, java.util.List<String> hitHighlights) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.path = path;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.owner = owner;
        this.createdByName = createdByName;
        this.updatedByName = updatedByName;
        this.workspaceKey = workspaceKey;
        this.workspaceName = workspaceName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.hitHighlights = hitHighlights;
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
     * The type of the Object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * The type of the Object
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Path of object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Path of object.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * The date and time the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
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
     * The date and time the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
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
     * Name of the owner of the record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("owner")
private String owner;

        /**
         * Name of the owner of the record
         * @param owner the value to set
         * @return this builder
         **/
        

public Builder owner(String owner) {
    this.owner = owner;
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
     * Name of the workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
private String workspaceName;

        /**
         * Name of the workspace.
         * @param workspaceName the value to set
         * @return this builder
         **/
        

public Builder workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
}
            /**
     * Key of the catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * Key of the catalog.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * Key of the schema.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * Key of the schema.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
            /**
     * Highlights related to this notebook object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hitHighlights")
private java.util.List<String> hitHighlights;

        /**
         * Highlights related to this notebook object
         * @param hitHighlights the value to set
         * @return this builder
         **/
        

public Builder hitHighlights(java.util.List<String> hitHighlights) {
    this.hitHighlights = hitHighlights;
    return this;
}


        public ObjectSearchSummary build() {
            ObjectSearchSummary model = new ObjectSearchSummary(this.key
                , this.displayName
                , this.description
                , this.type
                , this.path
                , this.timeCreated
                , this.timeUpdated
                , this.owner
                , this.createdByName
                , this.updatedByName
                , this.workspaceKey
                , this.workspaceName
                , this.catalogKey
                , this.schemaKey
                , this.hitHighlights);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectSearchSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.path(model.getPath());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.owner(model.getOwner());
    this.createdByName(model.getCreatedByName());
    this.updatedByName(model.getUpdatedByName());
    this.workspaceKey(model.getWorkspaceKey());
    this.workspaceName(model.getWorkspaceName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.hitHighlights(model.getHitHighlights());
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
     * The type of the Object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * The type of the Object
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Path of object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Path of object.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The date and time the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the object was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the object was updated, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Name of the owner of the record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

        /**
     * Name of the owner of the record
     * @return the value
     **/
    
    public String getOwner() {
        return owner;
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
     * Name of the workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
    private final String workspaceName;

        /**
     * Name of the workspace.
     * @return the value
     **/
    
    public String getWorkspaceName() {
        return workspaceName;
    }


        /**
     * Key of the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * Key of the catalog.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * Key of the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * Key of the schema.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * Highlights related to this notebook object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hitHighlights")
    private final java.util.List<String> hitHighlights;

        /**
     * Highlights related to this notebook object
     * @return the value
     **/
    
    public java.util.List<String> getHitHighlights() {
        return hitHighlights;
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
        sb.append("ObjectSearchSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", workspaceName=").append(String.valueOf(this.workspaceName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", hitHighlights=").append(String.valueOf(this.hitHighlights));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectSearchSummary)) {
            return false;
        }

        ObjectSearchSummary other = (ObjectSearchSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.owner, other.owner) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.workspaceName, other.workspaceName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.hitHighlights, other.hitHighlights);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.workspaceName == null ? 43 : this.workspaceName.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.hitHighlights == null ? 43 : this.hitHighlights.hashCode());
        return result;
    }


}
