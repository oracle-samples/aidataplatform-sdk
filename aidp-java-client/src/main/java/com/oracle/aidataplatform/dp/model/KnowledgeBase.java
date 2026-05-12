package com.oracle.aidataplatform.dp.model;



/**
 * Description of KnowledgeBase.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBase.Builder.class)

public final class KnowledgeBase  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "catalogKey", "schemaKey", "type", "workspaceKey", "clusterKey", "modality", "embeddingModelSourceType", "embeddingModelName", "vectorDbType", "vectorTable", "docTable", "chunkSize", "chunkOverlap", "sourceFilePattern", "timeLastEmbedding", "indexType", "indexName", "timeLastIndexing", "indexDistance", "indexTargetAccuracy", "indexNeighborPartitions", "indexNeighbors", "indexEfConstruction", "indexNeighborPartitionProbes", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "currentProcessedItems", "lifecycleState", "lifecycleStateDetails", "version", "sources", "indexDetails", "systemTags"})
    public KnowledgeBase(String key, String displayName, String description, String catalogKey, String schemaKey, KnowledgeBaseType type, String workspaceKey, String clusterKey, KnowledgeBaseModality modality, KnowledgeBaseEmbeddingModelSourceType embeddingModelSourceType, String embeddingModelName, KnowledgeBaseVectorDbType vectorDbType, String vectorTable, String docTable, Long chunkSize, Long chunkOverlap, String sourceFilePattern, java.util.Date timeLastEmbedding, KnowledgeBaseVectorIndexType indexType, String indexName, java.util.Date timeLastIndexing, String indexDistance, Integer indexTargetAccuracy, Integer indexNeighborPartitions, Integer indexNeighbors, Integer indexEfConstruction, Integer indexNeighborPartitionProbes, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, Long currentProcessedItems, KnowledgeBaseLifecycleState lifecycleState, String lifecycleStateDetails, Long version, java.util.List<KnowledgeBaseSourceMetadataDetails> sources, KnowledgeBaseVectorIndexDetails indexDetails, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.type = type;
        this.workspaceKey = workspaceKey;
        this.clusterKey = clusterKey;
        this.modality = modality;
        this.embeddingModelSourceType = embeddingModelSourceType;
        this.embeddingModelName = embeddingModelName;
        this.vectorDbType = vectorDbType;
        this.vectorTable = vectorTable;
        this.docTable = docTable;
        this.chunkSize = chunkSize;
        this.chunkOverlap = chunkOverlap;
        this.sourceFilePattern = sourceFilePattern;
        this.timeLastEmbedding = timeLastEmbedding;
        this.indexType = indexType;
        this.indexName = indexName;
        this.timeLastIndexing = timeLastIndexing;
        this.indexDistance = indexDistance;
        this.indexTargetAccuracy = indexTargetAccuracy;
        this.indexNeighborPartitions = indexNeighborPartitions;
        this.indexNeighbors = indexNeighbors;
        this.indexEfConstruction = indexEfConstruction;
        this.indexNeighborPartitionProbes = indexNeighborPartitionProbes;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.currentProcessedItems = currentProcessedItems;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.version = version;
        this.sources = sources;
        this.indexDetails = indexDetails;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Unique identifier for this KnowledgeBase resource
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The Unique identifier for this KnowledgeBase resource
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * A user-friendly description about this KnowledgeBase resource
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A user-friendly description about this KnowledgeBase resource
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
     * The key of the schema containing the KnowledgeBase.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * The key of the schema containing the KnowledgeBase.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
            /**
     * type of Knowledgebase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private KnowledgeBaseType type;

        /**
         * type of Knowledgebase
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(KnowledgeBaseType type) {
    this.type = type;
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
     * Modality of the data in this Knowledgebase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modality")
private KnowledgeBaseModality modality;

        /**
         * Modality of the data in this Knowledgebase
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
     * Information about where embeddings of data are located
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("vectorDbType")
private KnowledgeBaseVectorDbType vectorDbType;

        /**
         * Information about where embeddings of data are located
         * @param vectorDbType the value to set
         * @return this builder
         **/
        

public Builder vectorDbType(KnowledgeBaseVectorDbType vectorDbType) {
    this.vectorDbType = vectorDbType;
    return this;
}
            /**
     * Name of the embedding table
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("vectorTable")
private String vectorTable;

        /**
         * Name of the embedding table
         * @param vectorTable the value to set
         * @return this builder
         **/
        

public Builder vectorTable(String vectorTable) {
    this.vectorTable = vectorTable;
    return this;
}
            /**
     * Name of the table to track documents/records for which embeddings are generated
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("docTable")
private String docTable;

        /**
         * Name of the table to track documents/records for which embeddings are generated
         * @param docTable the value to set
         * @return this builder
         **/
        

public Builder docTable(String docTable) {
    this.docTable = docTable;
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
            /**
     * Timestamp for last job run
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastEmbedding")
private java.util.Date timeLastEmbedding;

        /**
         * Timestamp for last job run
         * @param timeLastEmbedding the value to set
         * @return this builder
         **/
        

public Builder timeLastEmbedding(java.util.Date timeLastEmbedding) {
    this.timeLastEmbedding = timeLastEmbedding;
    return this;
}
            /**
     * Type of Index if present, supported types:
* * HNSW (Hierarchical Navigable Small World)
* * IVF (Inverted File)
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexType")
private KnowledgeBaseVectorIndexType indexType;

        /**
         * Type of Index if present, supported types:
* * HNSW (Hierarchical Navigable Small World)
* * IVF (Inverted File)
* 
         * @param indexType the value to set
         * @return this builder
         **/
        

public Builder indexType(KnowledgeBaseVectorIndexType indexType) {
    this.indexType = indexType;
    return this;
}
            /**
     * Name of Index if present
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexName")
private String indexName;

        /**
         * Name of Index if present
         * @param indexName the value to set
         * @return this builder
         **/
        

public Builder indexName(String indexName) {
    this.indexName = indexName;
    return this;
}
            /**
     * Timestamp for last index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastIndexing")
private java.util.Date timeLastIndexing;

        /**
         * Timestamp for last index
         * @param timeLastIndexing the value to set
         * @return this builder
         **/
        

public Builder timeLastIndexing(java.util.Date timeLastIndexing) {
    this.timeLastIndexing = timeLastIndexing;
    return this;
}
            /**
     * Distance metric for the vector index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexDistance")
private String indexDistance;

        /**
         * Distance metric for the vector index
         * @param indexDistance the value to set
         * @return this builder
         **/
        

public Builder indexDistance(String indexDistance) {
    this.indexDistance = indexDistance;
    return this;
}
            /**
     * Target accuracy percentage for the index (1-100)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexTargetAccuracy")
private Integer indexTargetAccuracy;

        /**
         * Target accuracy percentage for the index (1-100)
         * @param indexTargetAccuracy the value to set
         * @return this builder
         **/
        

public Builder indexTargetAccuracy(Integer indexTargetAccuracy) {
    this.indexTargetAccuracy = indexTargetAccuracy;
    return this;
}
            /**
     * Number of partitions (clusters) for IVF index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexNeighborPartitions")
private Integer indexNeighborPartitions;

        /**
         * Number of partitions (clusters) for IVF index
         * @param indexNeighborPartitions the value to set
         * @return this builder
         **/
        

public Builder indexNeighborPartitions(Integer indexNeighborPartitions) {
    this.indexNeighborPartitions = indexNeighborPartitions;
    return this;
}
            /**
     * Maximum number of neighbors for HNSW index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexNeighbors")
private Integer indexNeighbors;

        /**
         * Maximum number of neighbors for HNSW index
         * @param indexNeighbors the value to set
         * @return this builder
         **/
        

public Builder indexNeighbors(Integer indexNeighbors) {
    this.indexNeighbors = indexNeighbors;
    return this;
}
            /**
     * Maximum number of closest vector candidates for HNSW index construction
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexEfConstruction")
private Integer indexEfConstruction;

        /**
         * Maximum number of closest vector candidates for HNSW index construction
         * @param indexEfConstruction the value to set
         * @return this builder
         **/
        

public Builder indexEfConstruction(Integer indexEfConstruction) {
    this.indexEfConstruction = indexEfConstruction;
    return this;
}
            /**
     * Maximum number of partitions to probe for IVF index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("indexNeighborPartitionProbes")
private Integer indexNeighborPartitionProbes;

        /**
         * Maximum number of partitions to probe for IVF index
         * @param indexNeighborPartitionProbes the value to set
         * @return this builder
         **/
        

public Builder indexNeighborPartitionProbes(Integer indexNeighborPartitionProbes) {
    this.indexNeighborPartitionProbes = indexNeighborPartitionProbes;
    return this;
}
            /**
     * Timestamp when KnowledgeBase was created
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Timestamp when KnowledgeBase was created
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Timestamp when KnowledgeBase was updated
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * Timestamp when KnowledgeBase was updated
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
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
            /**
     * Identifier for principal who updated the KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * Identifier for principal who updated the KnowledgeBase
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * Count of items/documents processed by KB for which embeddings are present
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("currentProcessedItems")
private Long currentProcessedItems;

        /**
         * Count of items/documents processed by KB for which embeddings are present
         * @param currentProcessedItems the value to set
         * @return this builder
         **/
        

public Builder currentProcessedItems(Long currentProcessedItems) {
    this.currentProcessedItems = currentProcessedItems;
    return this;
}
            /**
     * Lifecycle of KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private KnowledgeBaseLifecycleState lifecycleState;

        /**
         * Lifecycle of KnowledgeBase
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(KnowledgeBaseLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Additional information about the current state of KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * Additional information about the current state of KnowledgeBase
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
            /**
     * Version to track schemas of Embedding and Doc table
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private Long version;

        /**
         * Version to track schemas of Embedding and Doc table
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(Long version) {
    this.version = version;
    return this;
}
            /**
     * Source information
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sources")
private java.util.List<KnowledgeBaseSourceMetadataDetails> sources;

        /**
         * Source information
         * @param sources the value to set
         * @return this builder
         **/
        

public Builder sources(java.util.List<KnowledgeBaseSourceMetadataDetails> sources) {
    this.sources = sources;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
private KnowledgeBaseVectorIndexDetails indexDetails;



public Builder indexDetails(KnowledgeBaseVectorIndexDetails indexDetails) {
    this.indexDetails = indexDetails;
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


        public KnowledgeBase build() {
            KnowledgeBase model = new KnowledgeBase(this.key
                , this.displayName
                , this.description
                , this.catalogKey
                , this.schemaKey
                , this.type
                , this.workspaceKey
                , this.clusterKey
                , this.modality
                , this.embeddingModelSourceType
                , this.embeddingModelName
                , this.vectorDbType
                , this.vectorTable
                , this.docTable
                , this.chunkSize
                , this.chunkOverlap
                , this.sourceFilePattern
                , this.timeLastEmbedding
                , this.indexType
                , this.indexName
                , this.timeLastIndexing
                , this.indexDistance
                , this.indexTargetAccuracy
                , this.indexNeighborPartitions
                , this.indexNeighbors
                , this.indexEfConstruction
                , this.indexNeighborPartitionProbes
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.currentProcessedItems
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.version
                , this.sources
                , this.indexDetails
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBase model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.type(model.getType());
    this.workspaceKey(model.getWorkspaceKey());
    this.clusterKey(model.getClusterKey());
    this.modality(model.getModality());
    this.embeddingModelSourceType(model.getEmbeddingModelSourceType());
    this.embeddingModelName(model.getEmbeddingModelName());
    this.vectorDbType(model.getVectorDbType());
    this.vectorTable(model.getVectorTable());
    this.docTable(model.getDocTable());
    this.chunkSize(model.getChunkSize());
    this.chunkOverlap(model.getChunkOverlap());
    this.sourceFilePattern(model.getSourceFilePattern());
    this.timeLastEmbedding(model.getTimeLastEmbedding());
    this.indexType(model.getIndexType());
    this.indexName(model.getIndexName());
    this.timeLastIndexing(model.getTimeLastIndexing());
    this.indexDistance(model.getIndexDistance());
    this.indexTargetAccuracy(model.getIndexTargetAccuracy());
    this.indexNeighborPartitions(model.getIndexNeighborPartitions());
    this.indexNeighbors(model.getIndexNeighbors());
    this.indexEfConstruction(model.getIndexEfConstruction());
    this.indexNeighborPartitionProbes(model.getIndexNeighborPartitionProbes());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.currentProcessedItems(model.getCurrentProcessedItems());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.version(model.getVersion());
    this.sources(model.getSources());
    this.indexDetails(model.getIndexDetails());
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
     * The Unique identifier for this KnowledgeBase resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The Unique identifier for this KnowledgeBase resource
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * A user-friendly description about this KnowledgeBase resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A user-friendly description about this KnowledgeBase resource
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
     * The key of the schema containing the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The key of the schema containing the KnowledgeBase.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }

    
        /**
     * type of Knowledgebase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseType type;

        /**
     * type of Knowledgebase
     * @return the value
     **/
    
    public KnowledgeBaseType getType() {
        return type;
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
     * Modality of the data in this Knowledgebase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modality")
    private final KnowledgeBaseModality modality;

        /**
     * Modality of the data in this Knowledgebase
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
     * Information about where embeddings of data are located
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("vectorDbType")
    private final KnowledgeBaseVectorDbType vectorDbType;

        /**
     * Information about where embeddings of data are located
     * @return the value
     **/
    
    public KnowledgeBaseVectorDbType getVectorDbType() {
        return vectorDbType;
    }


        /**
     * Name of the embedding table
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("vectorTable")
    private final String vectorTable;

        /**
     * Name of the embedding table
     * @return the value
     **/
    
    public String getVectorTable() {
        return vectorTable;
    }


        /**
     * Name of the table to track documents/records for which embeddings are generated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("docTable")
    private final String docTable;

        /**
     * Name of the table to track documents/records for which embeddings are generated
     * @return the value
     **/
    
    public String getDocTable() {
        return docTable;
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


        /**
     * Timestamp for last job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastEmbedding")
    private final java.util.Date timeLastEmbedding;

        /**
     * Timestamp for last job run
     * @return the value
     **/
    
    public java.util.Date getTimeLastEmbedding() {
        return timeLastEmbedding;
    }

    
        /**
     * Type of Index if present, supported types:
* * HNSW (Hierarchical Navigable Small World)
* * IVF (Inverted File)
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexType")
    private final KnowledgeBaseVectorIndexType indexType;

        /**
     * Type of Index if present, supported types:
* * HNSW (Hierarchical Navigable Small World)
* * IVF (Inverted File)
* 
     * @return the value
     **/
    
    public KnowledgeBaseVectorIndexType getIndexType() {
        return indexType;
    }


        /**
     * Name of Index if present
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    private final String indexName;

        /**
     * Name of Index if present
     * @return the value
     **/
    
    public String getIndexName() {
        return indexName;
    }


        /**
     * Timestamp for last index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastIndexing")
    private final java.util.Date timeLastIndexing;

        /**
     * Timestamp for last index
     * @return the value
     **/
    
    public java.util.Date getTimeLastIndexing() {
        return timeLastIndexing;
    }


        /**
     * Distance metric for the vector index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexDistance")
    private final String indexDistance;

        /**
     * Distance metric for the vector index
     * @return the value
     **/
    
    public String getIndexDistance() {
        return indexDistance;
    }


        /**
     * Target accuracy percentage for the index (1-100)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexTargetAccuracy")
    private final Integer indexTargetAccuracy;

        /**
     * Target accuracy percentage for the index (1-100)
     * @return the value
     **/
    
    public Integer getIndexTargetAccuracy() {
        return indexTargetAccuracy;
    }


        /**
     * Number of partitions (clusters) for IVF index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexNeighborPartitions")
    private final Integer indexNeighborPartitions;

        /**
     * Number of partitions (clusters) for IVF index
     * @return the value
     **/
    
    public Integer getIndexNeighborPartitions() {
        return indexNeighborPartitions;
    }


        /**
     * Maximum number of neighbors for HNSW index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexNeighbors")
    private final Integer indexNeighbors;

        /**
     * Maximum number of neighbors for HNSW index
     * @return the value
     **/
    
    public Integer getIndexNeighbors() {
        return indexNeighbors;
    }


        /**
     * Maximum number of closest vector candidates for HNSW index construction
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexEfConstruction")
    private final Integer indexEfConstruction;

        /**
     * Maximum number of closest vector candidates for HNSW index construction
     * @return the value
     **/
    
    public Integer getIndexEfConstruction() {
        return indexEfConstruction;
    }


        /**
     * Maximum number of partitions to probe for IVF index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("indexNeighborPartitionProbes")
    private final Integer indexNeighborPartitionProbes;

        /**
     * Maximum number of partitions to probe for IVF index
     * @return the value
     **/
    
    public Integer getIndexNeighborPartitionProbes() {
        return indexNeighborPartitionProbes;
    }


        /**
     * Timestamp when KnowledgeBase was created
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Timestamp when KnowledgeBase was created
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Timestamp when KnowledgeBase was updated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Timestamp when KnowledgeBase was updated
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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


        /**
     * Identifier for principal who updated the KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * Identifier for principal who updated the KnowledgeBase
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Count of items/documents processed by KB for which embeddings are present
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("currentProcessedItems")
    private final Long currentProcessedItems;

        /**
     * Count of items/documents processed by KB for which embeddings are present
     * @return the value
     **/
    
    public Long getCurrentProcessedItems() {
        return currentProcessedItems;
    }

    
        /**
     * Lifecycle of KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final KnowledgeBaseLifecycleState lifecycleState;

        /**
     * Lifecycle of KnowledgeBase
     * @return the value
     **/
    
    public KnowledgeBaseLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Additional information about the current state of KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * Additional information about the current state of KnowledgeBase
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }


        /**
     * Version to track schemas of Embedding and Doc table
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Long version;

        /**
     * Version to track schemas of Embedding and Doc table
     * @return the value
     **/
    
    public Long getVersion() {
        return version;
    }


        /**
     * Source information
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<KnowledgeBaseSourceMetadataDetails> sources;

        /**
     * Source information
     * @return the value
     **/
    
    public java.util.List<KnowledgeBaseSourceMetadataDetails> getSources() {
        return sources;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
    private final KnowledgeBaseVectorIndexDetails indexDetails;

    
    public KnowledgeBaseVectorIndexDetails getIndexDetails() {
        return indexDetails;
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
        sb.append("KnowledgeBase(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", modality=").append(String.valueOf(this.modality));
        sb.append(", embeddingModelSourceType=").append(String.valueOf(this.embeddingModelSourceType));
        sb.append(", embeddingModelName=").append(String.valueOf(this.embeddingModelName));
        sb.append(", vectorDbType=").append(String.valueOf(this.vectorDbType));
        sb.append(", vectorTable=").append(String.valueOf(this.vectorTable));
        sb.append(", docTable=").append(String.valueOf(this.docTable));
        sb.append(", chunkSize=").append(String.valueOf(this.chunkSize));
        sb.append(", chunkOverlap=").append(String.valueOf(this.chunkOverlap));
        sb.append(", sourceFilePattern=").append(String.valueOf(this.sourceFilePattern));
        sb.append(", timeLastEmbedding=").append(String.valueOf(this.timeLastEmbedding));
        sb.append(", indexType=").append(String.valueOf(this.indexType));
        sb.append(", indexName=").append(String.valueOf(this.indexName));
        sb.append(", timeLastIndexing=").append(String.valueOf(this.timeLastIndexing));
        sb.append(", indexDistance=").append(String.valueOf(this.indexDistance));
        sb.append(", indexTargetAccuracy=").append(String.valueOf(this.indexTargetAccuracy));
        sb.append(", indexNeighborPartitions=").append(String.valueOf(this.indexNeighborPartitions));
        sb.append(", indexNeighbors=").append(String.valueOf(this.indexNeighbors));
        sb.append(", indexEfConstruction=").append(String.valueOf(this.indexEfConstruction));
        sb.append(", indexNeighborPartitionProbes=").append(String.valueOf(this.indexNeighborPartitionProbes));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", currentProcessedItems=").append(String.valueOf(this.currentProcessedItems));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", indexDetails=").append(String.valueOf(this.indexDetails));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBase)) {
            return false;
        }

        KnowledgeBase other = (KnowledgeBase) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.modality, other.modality) &&
            java.util.Objects.equals(this.embeddingModelSourceType, other.embeddingModelSourceType) &&
            java.util.Objects.equals(this.embeddingModelName, other.embeddingModelName) &&
            java.util.Objects.equals(this.vectorDbType, other.vectorDbType) &&
            java.util.Objects.equals(this.vectorTable, other.vectorTable) &&
            java.util.Objects.equals(this.docTable, other.docTable) &&
            java.util.Objects.equals(this.chunkSize, other.chunkSize) &&
            java.util.Objects.equals(this.chunkOverlap, other.chunkOverlap) &&
            java.util.Objects.equals(this.sourceFilePattern, other.sourceFilePattern) &&
            java.util.Objects.equals(this.timeLastEmbedding, other.timeLastEmbedding) &&
            java.util.Objects.equals(this.indexType, other.indexType) &&
            java.util.Objects.equals(this.indexName, other.indexName) &&
            java.util.Objects.equals(this.timeLastIndexing, other.timeLastIndexing) &&
            java.util.Objects.equals(this.indexDistance, other.indexDistance) &&
            java.util.Objects.equals(this.indexTargetAccuracy, other.indexTargetAccuracy) &&
            java.util.Objects.equals(this.indexNeighborPartitions, other.indexNeighborPartitions) &&
            java.util.Objects.equals(this.indexNeighbors, other.indexNeighbors) &&
            java.util.Objects.equals(this.indexEfConstruction, other.indexEfConstruction) &&
            java.util.Objects.equals(this.indexNeighborPartitionProbes, other.indexNeighborPartitionProbes) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.currentProcessedItems, other.currentProcessedItems) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.sources, other.sources) &&
            java.util.Objects.equals(this.indexDetails, other.indexDetails) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.modality == null ? 43 : this.modality.hashCode());
        result = (result * PRIME) + (this.embeddingModelSourceType == null ? 43 : this.embeddingModelSourceType.hashCode());
        result = (result * PRIME) + (this.embeddingModelName == null ? 43 : this.embeddingModelName.hashCode());
        result = (result * PRIME) + (this.vectorDbType == null ? 43 : this.vectorDbType.hashCode());
        result = (result * PRIME) + (this.vectorTable == null ? 43 : this.vectorTable.hashCode());
        result = (result * PRIME) + (this.docTable == null ? 43 : this.docTable.hashCode());
        result = (result * PRIME) + (this.chunkSize == null ? 43 : this.chunkSize.hashCode());
        result = (result * PRIME) + (this.chunkOverlap == null ? 43 : this.chunkOverlap.hashCode());
        result = (result * PRIME) + (this.sourceFilePattern == null ? 43 : this.sourceFilePattern.hashCode());
        result = (result * PRIME) + (this.timeLastEmbedding == null ? 43 : this.timeLastEmbedding.hashCode());
        result = (result * PRIME) + (this.indexType == null ? 43 : this.indexType.hashCode());
        result = (result * PRIME) + (this.indexName == null ? 43 : this.indexName.hashCode());
        result = (result * PRIME) + (this.timeLastIndexing == null ? 43 : this.timeLastIndexing.hashCode());
        result = (result * PRIME) + (this.indexDistance == null ? 43 : this.indexDistance.hashCode());
        result = (result * PRIME) + (this.indexTargetAccuracy == null ? 43 : this.indexTargetAccuracy.hashCode());
        result = (result * PRIME) + (this.indexNeighborPartitions == null ? 43 : this.indexNeighborPartitions.hashCode());
        result = (result * PRIME) + (this.indexNeighbors == null ? 43 : this.indexNeighbors.hashCode());
        result = (result * PRIME) + (this.indexEfConstruction == null ? 43 : this.indexEfConstruction.hashCode());
        result = (result * PRIME) + (this.indexNeighborPartitionProbes == null ? 43 : this.indexNeighborPartitionProbes.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.currentProcessedItems == null ? 43 : this.currentProcessedItems.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.indexDetails == null ? 43 : this.indexDetails.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
