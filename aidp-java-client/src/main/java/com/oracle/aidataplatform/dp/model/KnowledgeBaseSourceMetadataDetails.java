package com.oracle.aidataplatform.dp.model;



/**
 * The information about a source to be added to a KnowledgeBase
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseSourceMetadataDetails.Builder.class)

public final class KnowledgeBaseSourceMetadataDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "description", "type", "location", "workspaceKey", "clusterKey", "chunkSize", "chunkOverlap", "sourceFilePattern", "timeCreated", "createdBy"})
    public KnowledgeBaseSourceMetadataDetails(String key, String name, String description, KnowledgeBaseSourceType type, String location, String workspaceKey, String clusterKey, Long chunkSize, Long chunkOverlap, String sourceFilePattern, java.util.Date timeCreated, String createdBy) {
        super();
        this.key = key;
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.workspaceKey = workspaceKey;
        this.clusterKey = clusterKey;
        this.chunkSize = chunkSize;
        this.chunkOverlap = chunkOverlap;
        this.sourceFilePattern = sourceFilePattern;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * key for the source
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * key for the source
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * name for the source
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * name for the source
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * New description of KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * New description of KnowledgeBase
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The type of source
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private KnowledgeBaseSourceType type;

        /**
         * The type of source
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(KnowledgeBaseSourceType type) {
    this.type = type;
    return this;
}
            /**
     * location on volume or name of the table
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("location")
private String location;

        /**
         * location on volume or name of the table
         * @param location the value to set
         * @return this builder
         **/
        

public Builder location(String location) {
    this.location = location;
    return this;
}
            /**
     * The id of the workspace associated with the source.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * The id of the workspace associated with the source.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * The id of the cluster associated with the source.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * The id of the cluster associated with the source.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
    return this;
}
            /**
     * Chunk size at source level settings
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("chunkSize")
private Long chunkSize;

        /**
         * Chunk size at source level settings
         * @param chunkSize the value to set
         * @return this builder
         **/
        

public Builder chunkSize(Long chunkSize) {
    this.chunkSize = chunkSize;
    return this;
}
            /**
     * Chunk Overlap at source level settings
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("chunkOverlap")
private Long chunkOverlap;

        /**
         * Chunk Overlap at source level settings
         * @param chunkOverlap the value to set
         * @return this builder
         **/
        

public Builder chunkOverlap(Long chunkOverlap) {
    this.chunkOverlap = chunkOverlap;
    return this;
}
            /**
     * Applicable for Native KnowledgeBase where source type is KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceFilePattern")
private String sourceFilePattern;

        /**
         * Applicable for Native KnowledgeBase where source type is KnowledgeBase
         * @param sourceFilePattern the value to set
         * @return this builder
         **/
        

public Builder sourceFilePattern(String sourceFilePattern) {
    this.sourceFilePattern = sourceFilePattern;
    return this;
}
            /**
     * The time at which KnowledgeBase was created. An RFC3339 formatted datetime string
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The time at which KnowledgeBase was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Identifier for KnowledgeBase creator
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * Identifier for KnowledgeBase creator
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}


        public KnowledgeBaseSourceMetadataDetails build() {
            KnowledgeBaseSourceMetadataDetails model = new KnowledgeBaseSourceMetadataDetails(this.key
                , this.name
                , this.description
                , this.type
                , this.location
                , this.workspaceKey
                , this.clusterKey
                , this.chunkSize
                , this.chunkOverlap
                , this.sourceFilePattern
                , this.timeCreated
                , this.createdBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseSourceMetadataDetails model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.location(model.getLocation());
    this.workspaceKey(model.getWorkspaceKey());
    this.clusterKey(model.getClusterKey());
    this.chunkSize(model.getChunkSize());
    this.chunkOverlap(model.getChunkOverlap());
    this.sourceFilePattern(model.getSourceFilePattern());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
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
     * key for the source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * key for the source
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * name for the source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * name for the source
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * New description of KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * New description of KnowledgeBase
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    
        /**
     * The type of source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseSourceType type;

        /**
     * The type of source
     * @return the value
     **/
    
    public KnowledgeBaseSourceType getType() {
        return type;
    }


        /**
     * location on volume or name of the table
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

        /**
     * location on volume or name of the table
     * @return the value
     **/
    
    public String getLocation() {
        return location;
    }


        /**
     * The id of the workspace associated with the source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The id of the workspace associated with the source.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * The id of the cluster associated with the source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * The id of the cluster associated with the source.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
    }


        /**
     * Chunk size at source level settings
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("chunkSize")
    private final Long chunkSize;

        /**
     * Chunk size at source level settings
     * @return the value
     **/
    
    public Long getChunkSize() {
        return chunkSize;
    }


        /**
     * Chunk Overlap at source level settings
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("chunkOverlap")
    private final Long chunkOverlap;

        /**
     * Chunk Overlap at source level settings
     * @return the value
     **/
    
    public Long getChunkOverlap() {
        return chunkOverlap;
    }


        /**
     * Applicable for Native KnowledgeBase where source type is KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFilePattern")
    private final String sourceFilePattern;

        /**
     * Applicable for Native KnowledgeBase where source type is KnowledgeBase
     * @return the value
     **/
    
    public String getSourceFilePattern() {
        return sourceFilePattern;
    }


        /**
     * The time at which KnowledgeBase was created. An RFC3339 formatted datetime string
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The time at which KnowledgeBase was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Identifier for KnowledgeBase creator
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * Identifier for KnowledgeBase creator
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
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
        sb.append("KnowledgeBaseSourceMetadataDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", chunkSize=").append(String.valueOf(this.chunkSize));
        sb.append(", chunkOverlap=").append(String.valueOf(this.chunkOverlap));
        sb.append(", sourceFilePattern=").append(String.valueOf(this.sourceFilePattern));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseSourceMetadataDetails)) {
            return false;
        }

        KnowledgeBaseSourceMetadataDetails other = (KnowledgeBaseSourceMetadataDetails) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.location, other.location) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.chunkSize, other.chunkSize) &&
            java.util.Objects.equals(this.chunkOverlap, other.chunkOverlap) &&
            java.util.Objects.equals(this.sourceFilePattern, other.sourceFilePattern) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.chunkSize == null ? 43 : this.chunkSize.hashCode());
        result = (result * PRIME) + (this.chunkOverlap == null ? 43 : this.chunkOverlap.hashCode());
        result = (result * PRIME) + (this.sourceFilePattern == null ? 43 : this.sourceFilePattern.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        return result;
    }


}
