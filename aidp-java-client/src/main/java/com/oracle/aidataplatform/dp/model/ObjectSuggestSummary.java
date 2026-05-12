package com.oracle.aidataplatform.dp.model;



/**
 * A Suggest object in a Data Lake
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ObjectSuggestSummary.Builder.class)

public final class ObjectSuggestSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "type", "path", "key", "workspaceKey", "catalogKey", "schemaKey", "workspaceName"})
    public ObjectSuggestSummary(String displayName, String type, String path, String key, String workspaceKey, String catalogKey, String schemaKey, String workspaceName) {
        super();
        this.displayName = displayName;
        this.type = type;
        this.path = path;
        this.key = key;
        this.workspaceKey = workspaceKey;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.workspaceName = workspaceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Key of object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Key of object.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
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
     * Name of the workspace
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
private String workspaceName;

        /**
         * Name of the workspace
         * @param workspaceName the value to set
         * @return this builder
         **/
        

public Builder workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
}


        public ObjectSuggestSummary build() {
            ObjectSuggestSummary model = new ObjectSuggestSummary(this.displayName
                , this.type
                , this.path
                , this.key
                , this.workspaceKey
                , this.catalogKey
                , this.schemaKey
                , this.workspaceName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectSuggestSummary model) {
                this.displayName(model.getDisplayName());
    this.type(model.getType());
    this.path(model.getPath());
    this.key(model.getKey());
    this.workspaceKey(model.getWorkspaceKey());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.workspaceName(model.getWorkspaceName());
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
     * Key of object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Key of object.
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
     * Name of the workspace
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
    private final String workspaceName;

        /**
     * Name of the workspace
     * @return the value
     **/
    
    public String getWorkspaceName() {
        return workspaceName;
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
        sb.append("ObjectSuggestSummary(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", workspaceName=").append(String.valueOf(this.workspaceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectSuggestSummary)) {
            return false;
        }

        ObjectSuggestSummary other = (ObjectSuggestSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.workspaceName, other.workspaceName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.workspaceName == null ? 43 : this.workspaceName.hashCode());
        return result;
    }


}
