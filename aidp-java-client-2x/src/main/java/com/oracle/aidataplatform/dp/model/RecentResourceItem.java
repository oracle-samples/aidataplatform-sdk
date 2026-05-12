package com.oracle.aidataplatform.dp.model;


/**
 * The list of the recent resources accessed by a user
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RecentResourceItem.Builder.class)

public final class RecentResourceItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"workspaceKey", "resourceType", "resourceId", "resourceName", "timeAccessed"})
    public RecentResourceItem(String workspaceKey, ResourceType resourceType, String resourceId, String resourceName, java.util.Date timeAccessed) {
        super();
        this.workspaceKey = workspaceKey;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.timeAccessed = timeAccessed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Key of the workspace. Null in the case of a global resource.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
        private String workspaceKey;

                /**
         * Key of the workspace. Null in the case of a global resource.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

        public Builder workspaceKey(String workspaceKey) {
        this.workspaceKey = workspaceKey;
        return this;
        }
            /**
     * Type of the resource.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

                /**
         * Type of the resource.
         * @param resourceType the value to set
         * @return this builder
         **/
        

        public Builder resourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
        }
            /**
     * Unique identifier of the resource or path.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

                /**
         * Unique identifier of the resource or path.
         * @param resourceId the value to set
         * @return this builder
         **/
        

        public Builder resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
        }
            /**
     * Resource name associated with the resourceId field.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

                /**
         * Resource name associated with the resourceId field.
         * @param resourceName the value to set
         * @return this builder
         **/
        

        public Builder resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
        }
            /**
     * Timestamp of when the resource was created, read, or updated.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccessed")
        private java.util.Date timeAccessed;

                /**
         * Timestamp of when the resource was created, read, or updated.
         * @param timeAccessed the value to set
         * @return this builder
         **/
        

        public Builder timeAccessed(java.util.Date timeAccessed) {
        this.timeAccessed = timeAccessed;
        return this;
        }


        public RecentResourceItem build() {
            RecentResourceItem model = new RecentResourceItem(this.workspaceKey
                    , this.resourceType
                    , this.resourceId
                    , this.resourceName
                    , this.timeAccessed);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecentResourceItem model) {
                this.workspaceKey(model.getWorkspaceKey());
    this.resourceType(model.getResourceType());
    this.resourceId(model.getResourceId());
    this.resourceName(model.getResourceName());
    this.timeAccessed(model.getTimeAccessed());
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
     * Key of the workspace. Null in the case of a global resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Key of the workspace. Null in the case of a global resource.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }

    /**
     * Type of the resource.
     **/
    public enum ResourceType {
        Notebook("NOTEBOOK"),
        File("FILE"),
        Catalog("CATALOG"),
        Schema("SCHEMA"),
        Table("TABLE"),
        Volume("VOLUME"),
        Job("JOB"),
        JobRun("JOB_RUN"),
        LakeFlow("LAKE_FLOW"),
        AgentLakeFlow("AGENT_LAKE_FLOW"),
        Cluster("CLUSTER"),
        AiCompute("AI_COMPUTE"),
        Folder("FOLDER"),
        VolumeDir("VOLUME_DIR"),
        VolumeFile("VOLUME_FILE"),
        View("VIEW"),
        Share("SHARE"),
        Recipient("RECIPIENT"),
        Extractor("EXTRACTOR"),
        AgentFlow("AGENT_FLOW"),
        ;

        

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ResourceType: " + key);
        }
    };
        /**
     * Type of the resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

        /**
     * Type of the resource.
     * @return the value
     **/
    
    public ResourceType getResourceType() {
        return resourceType;
    }


        /**
     * Unique identifier of the resource or path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

        /**
     * Unique identifier of the resource or path.
     * @return the value
     **/
    
    public String getResourceId() {
        return resourceId;
    }


        /**
     * Resource name associated with the resourceId field.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

        /**
     * Resource name associated with the resourceId field.
     * @return the value
     **/
    
    public String getResourceName() {
        return resourceName;
    }


        /**
     * Timestamp of when the resource was created, read, or updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccessed")
    private final java.util.Date timeAccessed;

        /**
     * Timestamp of when the resource was created, read, or updated.
     * @return the value
     **/
    
    public java.util.Date getTimeAccessed() {
        return timeAccessed;
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
        sb.append("RecentResourceItem(");
        sb.append("workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", timeAccessed=").append(String.valueOf(this.timeAccessed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentResourceItem)) {
            return false;
        }

        RecentResourceItem other = (RecentResourceItem) o;
        return java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.resourceType, other.resourceType) &&
            java.util.Objects.equals(this.resourceId, other.resourceId) &&
            java.util.Objects.equals(this.resourceName, other.resourceName) &&
            java.util.Objects.equals(this.timeAccessed, other.timeAccessed);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.timeAccessed == null ? 43 : this.timeAccessed.hashCode());
        return result;
    }


}
