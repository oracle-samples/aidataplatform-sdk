package com.oracle.aidataplatform.dp.model;


/**
 * A WorkspaceObject is a file or folder belonging to an AI Data Platform Workbench workspace.
* To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
* an administrator. If you're an administrator who needs to write policies to give users access, see
* <a href="https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html" target="_blank" rel="noopener noreferrer">IAM Policies for Oracle AI Data Platform Workbench</a>.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceObjectDetails.Builder.class)

public final class WorkspaceObjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "key", "displayName", "timeCreated", "timeUpdated", "type", "description", "systemTags"})
    public WorkspaceObjectDetails(String path, String key, String displayName, java.util.Date timeCreated, java.util.Date timeUpdated, Type type, String description, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.path = path;
        this.key = key;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.type = type;
        this.description = description;
        this.systemTags = systemTags;
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
     * The key of the Workspace Object.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The key of the Workspace Object.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * The name of the Workspace Object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * The name of the Workspace Object. This will be the name of the file/folder in the workspace.
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
     * The type of the workspace object.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

                /**
         * The type of the workspace object.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Type type) {
        this.type = type;
        return this;
        }
            /**
     * The description for the file and folder.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description for the file and folder.
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


        public WorkspaceObjectDetails build() {
            WorkspaceObjectDetails model = new WorkspaceObjectDetails(this.path
                    , this.key
                    , this.displayName
                    , this.timeCreated
                    , this.timeUpdated
                    , this.type
                    , this.description
                    , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceObjectDetails model) {
                this.path(model.getPath());
    this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.type(model.getType());
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
     * The key of the Workspace Object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The key of the Workspace Object.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The name of the Workspace Object. This will be the name of the file/folder in the workspace.
* Example: Notebook1.ipynb, Folder1
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The name of the Workspace Object. This will be the name of the file/folder in the workspace.
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
     * The type of the workspace object.
     **/
    public enum Type {
        Notebook("NOTEBOOK"),
        Job("JOB"),
        LakeFlow("LAKE_FLOW"),
        AgentLakeFlow("AGENT_LAKE_FLOW"),
        GeneratedArtifact("GENERATED_ARTIFACT"),
        Library("LIBRARY"),
        File("FILE"),
        Folder("FOLDER"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The type of the workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * The type of the workspace object.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * The description for the file and folder.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description for the file and folder.
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
        sb.append("WorkspaceObjectDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", type=").append(String.valueOf(this.type));
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
        if (!(o instanceof WorkspaceObjectDetails)) {
            return false;
        }

        WorkspaceObjectDetails other = (WorkspaceObjectDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
