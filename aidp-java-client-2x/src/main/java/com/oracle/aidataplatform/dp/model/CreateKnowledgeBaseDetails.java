// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The information about new KnowledgeBase.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateKnowledgeBaseDetails.Builder.class)

public final class CreateKnowledgeBaseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "catalogKey", "type", "schemaKey", "workspaceKey", "clusterKey", "modality", "embeddingModelSourceType", "embeddingModelName", "chunkSize", "chunkOverlap", "sourceFilePattern", "indexDetails"})
    public CreateKnowledgeBaseDetails(String displayName, String description, String catalogKey, KnowledgeBaseType type, String schemaKey, String workspaceKey, String clusterKey, KnowledgeBaseModality modality, KnowledgeBaseEmbeddingModelSourceType embeddingModelSourceType, String embeddingModelName, Long chunkSize, Long chunkOverlap, String sourceFilePattern, KnowledgeBaseVectorIndexDetails indexDetails) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.catalogKey = catalogKey;
        this.type = type;
        this.schemaKey = schemaKey;
        this.workspaceKey = workspaceKey;
        this.clusterKey = clusterKey;
        this.modality = modality;
        this.embeddingModelSourceType = embeddingModelSourceType;
        this.embeddingModelName = embeddingModelName;
        this.chunkSize = chunkSize;
        this.chunkOverlap = chunkOverlap;
        this.sourceFilePattern = sourceFilePattern;
        this.indexDetails = indexDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of KnowledgeBase
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Name of KnowledgeBase
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * The description of KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of KnowledgeBase.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The key of the catalog containing the KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
        private String catalogKey;

                /**
         * The key of the catalog containing the KnowledgeBase.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

        public Builder catalogKey(String catalogKey) {
        this.catalogKey = catalogKey;
        return this;
        }
            /**
     * type of KnowledgeBase
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private KnowledgeBaseType type;

                /**
         * type of KnowledgeBase
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(KnowledgeBaseType type) {
        this.type = type;
        return this;
        }
            /**
     * The key of the schema containing the Knowledgebase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
        private String schemaKey;

                /**
         * The key of the schema containing the Knowledgebase.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

        public Builder schemaKey(String schemaKey) {
        this.schemaKey = schemaKey;
        return this;
        }
            /**
     * The id of the workspace associated with the KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
        private String workspaceKey;

                /**
         * The id of the workspace associated with the KnowledgeBase.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

        public Builder workspaceKey(String workspaceKey) {
        this.workspaceKey = workspaceKey;
        return this;
        }
            /**
     * The id of the cluster associated with the KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
        private String clusterKey;

                /**
         * The id of the cluster associated with the KnowledgeBase.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

        public Builder clusterKey(String clusterKey) {
        this.clusterKey = clusterKey;
        return this;
        }
            /**
     * Modality of the data in this KnowledgeBase
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("modality")
        private KnowledgeBaseModality modality;

                /**
         * Modality of the data in this KnowledgeBase
         * @param modality the value to set
         * @return this builder
         **/
        

        public Builder modality(KnowledgeBaseModality modality) {
        this.modality = modality;
        return this;
        }
            /**
     * Information about where embedding model is located
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("embeddingModelSourceType")
        private KnowledgeBaseEmbeddingModelSourceType embeddingModelSourceType;

                /**
         * Information about where embedding model is located
         * @param embeddingModelSourceType the value to set
         * @return this builder
         **/
        

        public Builder embeddingModelSourceType(KnowledgeBaseEmbeddingModelSourceType embeddingModelSourceType) {
        this.embeddingModelSourceType = embeddingModelSourceType;
        return this;
        }
            /**
     * Name of the embedding model
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("embeddingModelName")
        private String embeddingModelName;

                /**
         * Name of the embedding model
         * @param embeddingModelName the value to set
         * @return this builder
         **/
        

        public Builder embeddingModelName(String embeddingModelName) {
        this.embeddingModelName = embeddingModelName;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
        private KnowledgeBaseVectorIndexDetails indexDetails;

        

        public Builder indexDetails(KnowledgeBaseVectorIndexDetails indexDetails) {
        this.indexDetails = indexDetails;
        return this;
        }


        public CreateKnowledgeBaseDetails build() {
            CreateKnowledgeBaseDetails model = new CreateKnowledgeBaseDetails(this.displayName
                    , this.description
                    , this.catalogKey
                    , this.type
                    , this.schemaKey
                    , this.workspaceKey
                    , this.clusterKey
                    , this.modality
                    , this.embeddingModelSourceType
                    , this.embeddingModelName
                    , this.chunkSize
                    , this.chunkOverlap
                    , this.sourceFilePattern
                    , this.indexDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKnowledgeBaseDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogKey(model.getCatalogKey());
    this.type(model.getType());
    this.schemaKey(model.getSchemaKey());
    this.workspaceKey(model.getWorkspaceKey());
    this.clusterKey(model.getClusterKey());
    this.modality(model.getModality());
    this.embeddingModelSourceType(model.getEmbeddingModelSourceType());
    this.embeddingModelName(model.getEmbeddingModelName());
    this.chunkSize(model.getChunkSize());
    this.chunkOverlap(model.getChunkOverlap());
    this.sourceFilePattern(model.getSourceFilePattern());
    this.indexDetails(model.getIndexDetails());
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
     * Name of KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Name of KnowledgeBase
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The description of KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of KnowledgeBase.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The key of the catalog containing the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The key of the catalog containing the KnowledgeBase.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }

    
        /**
     * type of KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseType type;

        /**
     * type of KnowledgeBase
     * @return the value
     **/
    
    public KnowledgeBaseType getType() {
        return type;
    }


        /**
     * The key of the schema containing the Knowledgebase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The key of the schema containing the Knowledgebase.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * The id of the workspace associated with the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The id of the workspace associated with the KnowledgeBase.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * The id of the cluster associated with the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * The id of the cluster associated with the KnowledgeBase.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
    }

    
        /**
     * Modality of the data in this KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    private final KnowledgeBaseModality modality;

        /**
     * Modality of the data in this KnowledgeBase
     * @return the value
     **/
    
    public KnowledgeBaseModality getModality() {
        return modality;
    }

    
        /**
     * Information about where embedding model is located
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("embeddingModelSourceType")
    private final KnowledgeBaseEmbeddingModelSourceType embeddingModelSourceType;

        /**
     * Information about where embedding model is located
     * @return the value
     **/
    
    public KnowledgeBaseEmbeddingModelSourceType getEmbeddingModelSourceType() {
        return embeddingModelSourceType;
    }


        /**
     * Name of the embedding model
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("embeddingModelName")
    private final String embeddingModelName;

        /**
     * Name of the embedding model
     * @return the value
     **/
    
    public String getEmbeddingModelName() {
        return embeddingModelName;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
    private final KnowledgeBaseVectorIndexDetails indexDetails;

    
    public KnowledgeBaseVectorIndexDetails getIndexDetails() {
        return indexDetails;
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
        sb.append("CreateKnowledgeBaseDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", modality=").append(String.valueOf(this.modality));
        sb.append(", embeddingModelSourceType=").append(String.valueOf(this.embeddingModelSourceType));
        sb.append(", embeddingModelName=").append(String.valueOf(this.embeddingModelName));
        sb.append(", chunkSize=").append(String.valueOf(this.chunkSize));
        sb.append(", chunkOverlap=").append(String.valueOf(this.chunkOverlap));
        sb.append(", sourceFilePattern=").append(String.valueOf(this.sourceFilePattern));
        sb.append(", indexDetails=").append(String.valueOf(this.indexDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKnowledgeBaseDetails)) {
            return false;
        }

        CreateKnowledgeBaseDetails other = (CreateKnowledgeBaseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.modality, other.modality) &&
            java.util.Objects.equals(this.embeddingModelSourceType, other.embeddingModelSourceType) &&
            java.util.Objects.equals(this.embeddingModelName, other.embeddingModelName) &&
            java.util.Objects.equals(this.chunkSize, other.chunkSize) &&
            java.util.Objects.equals(this.chunkOverlap, other.chunkOverlap) &&
            java.util.Objects.equals(this.sourceFilePattern, other.sourceFilePattern) &&
            java.util.Objects.equals(this.indexDetails, other.indexDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.modality == null ? 43 : this.modality.hashCode());
        result = (result * PRIME) + (this.embeddingModelSourceType == null ? 43 : this.embeddingModelSourceType.hashCode());
        result = (result * PRIME) + (this.embeddingModelName == null ? 43 : this.embeddingModelName.hashCode());
        result = (result * PRIME) + (this.chunkSize == null ? 43 : this.chunkSize.hashCode());
        result = (result * PRIME) + (this.chunkOverlap == null ? 43 : this.chunkOverlap.hashCode());
        result = (result * PRIME) + (this.sourceFilePattern == null ? 43 : this.sourceFilePattern.hashCode());
        result = (result * PRIME) + (this.indexDetails == null ? 43 : this.indexDetails.hashCode());
        return result;
    }


}
