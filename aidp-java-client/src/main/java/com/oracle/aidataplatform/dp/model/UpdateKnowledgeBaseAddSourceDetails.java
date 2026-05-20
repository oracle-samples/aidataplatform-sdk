// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information about a source to be added to a KnowledgeBase
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateKnowledgeBaseAddSourceDetails.Builder.class)

public final class UpdateKnowledgeBaseAddSourceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "type", "shouldRunIngestionJobInline", "workspaceKey", "clusterKey", "location", "chunkSize", "chunkOverlap", "sourceFilePattern"})
    public UpdateKnowledgeBaseAddSourceDetails(String name, String description, KnowledgeBaseSourceType type, Boolean shouldRunIngestionJobInline, String workspaceKey, String clusterKey, String location, Long chunkSize, Long chunkOverlap, String sourceFilePattern) {
        super();
        this.name = name;
        this.description = description;
        this.type = type;
        this.shouldRunIngestionJobInline = shouldRunIngestionJobInline;
        this.workspaceKey = workspaceKey;
        this.clusterKey = clusterKey;
        this.location = location;
        this.chunkSize = chunkSize;
        this.chunkOverlap = chunkOverlap;
        this.sourceFilePattern = sourceFilePattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * name for source
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * name for source
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
     * Optional boolean flag to indicate if ingestion job should run inline.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldRunIngestionJobInline")
private Boolean shouldRunIngestionJobInline;

        /**
         * Optional boolean flag to indicate if ingestion job should run inline.
         * @param shouldRunIngestionJobInline the value to set
         * @return this builder
         **/
        

public Builder shouldRunIngestionJobInline(Boolean shouldRunIngestionJobInline) {
    this.shouldRunIngestionJobInline = shouldRunIngestionJobInline;
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
     * Chunk size at KnowledgeBase level which can be overridden by source level settings
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("chunkSize")
private Long chunkSize;

        /**
         * Chunk size at KnowledgeBase level which can be overridden by source level settings
         * @param chunkSize the value to set
         * @return this builder
         **/
        

public Builder chunkSize(Long chunkSize) {
    this.chunkSize = chunkSize;
    return this;
}
            /**
     * Chunk Overlap at KnowledgeBase level which can be overridden by source level settings
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("chunkOverlap")
private Long chunkOverlap;

        /**
         * Chunk Overlap at KnowledgeBase level which can be overridden by source level settings
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


        public UpdateKnowledgeBaseAddSourceDetails build() {
            UpdateKnowledgeBaseAddSourceDetails model = new UpdateKnowledgeBaseAddSourceDetails(this.name
                , this.description
                , this.type
                , this.shouldRunIngestionJobInline
                , this.workspaceKey
                , this.clusterKey
                , this.location
                , this.chunkSize
                , this.chunkOverlap
                , this.sourceFilePattern);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKnowledgeBaseAddSourceDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.shouldRunIngestionJobInline(model.getShouldRunIngestionJobInline());
    this.workspaceKey(model.getWorkspaceKey());
    this.clusterKey(model.getClusterKey());
    this.location(model.getLocation());
    this.chunkSize(model.getChunkSize());
    this.chunkOverlap(model.getChunkOverlap());
    this.sourceFilePattern(model.getSourceFilePattern());
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
     * name for source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * name for source
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
     * Optional boolean flag to indicate if ingestion job should run inline.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRunIngestionJobInline")
    private final Boolean shouldRunIngestionJobInline;

        /**
     * Optional boolean flag to indicate if ingestion job should run inline.
     * @return the value
     **/
    
    public Boolean getShouldRunIngestionJobInline() {
        return shouldRunIngestionJobInline;
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
     * Chunk size at KnowledgeBase level which can be overridden by source level settings
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("chunkSize")
    private final Long chunkSize;

        /**
     * Chunk size at KnowledgeBase level which can be overridden by source level settings
     * @return the value
     **/
    
    public Long getChunkSize() {
        return chunkSize;
    }


        /**
     * Chunk Overlap at KnowledgeBase level which can be overridden by source level settings
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("chunkOverlap")
    private final Long chunkOverlap;

        /**
     * Chunk Overlap at KnowledgeBase level which can be overridden by source level settings
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
        sb.append("UpdateKnowledgeBaseAddSourceDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", shouldRunIngestionJobInline=").append(String.valueOf(this.shouldRunIngestionJobInline));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", chunkSize=").append(String.valueOf(this.chunkSize));
        sb.append(", chunkOverlap=").append(String.valueOf(this.chunkOverlap));
        sb.append(", sourceFilePattern=").append(String.valueOf(this.sourceFilePattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKnowledgeBaseAddSourceDetails)) {
            return false;
        }

        UpdateKnowledgeBaseAddSourceDetails other = (UpdateKnowledgeBaseAddSourceDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.shouldRunIngestionJobInline, other.shouldRunIngestionJobInline) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.location, other.location) &&
            java.util.Objects.equals(this.chunkSize, other.chunkSize) &&
            java.util.Objects.equals(this.chunkOverlap, other.chunkOverlap) &&
            java.util.Objects.equals(this.sourceFilePattern, other.sourceFilePattern);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.shouldRunIngestionJobInline == null ? 43 : this.shouldRunIngestionJobInline.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.chunkSize == null ? 43 : this.chunkSize.hashCode());
        result = (result * PRIME) + (this.chunkOverlap == null ? 43 : this.chunkOverlap.hashCode());
        result = (result * PRIME) + (this.sourceFilePattern == null ? 43 : this.sourceFilePattern.hashCode());
        return result;
    }


}
