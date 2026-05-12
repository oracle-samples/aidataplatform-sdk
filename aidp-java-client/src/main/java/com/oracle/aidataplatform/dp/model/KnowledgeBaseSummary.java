package com.oracle.aidataplatform.dp.model;



/**
 * Summary of the KnowledgeBase.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseSummary.Builder.class)

public final class KnowledgeBaseSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "catalogKey", "schemaKey", "description", "timeCreated", "createdBy", "timeUpdated", "updatedBy", "currentProcessedItems", "lifecycleState", "systemTags"})
    public KnowledgeBaseSummary(String key, String displayName, String catalogKey, String schemaKey, String description, java.util.Date timeCreated, String createdBy, java.util.Date timeUpdated, String updatedBy, Long currentProcessedItems, KnowledgeBaseLifecycleState lifecycleState, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.description = description;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.currentProcessedItems = currentProcessedItems;
        this.lifecycleState = lifecycleState;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Immutable Unique identifier generated at creation
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Immutable Unique identifier generated at creation
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * KnowledgeBase Identifier, can be renamed
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * KnowledgeBase Identifier, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * the catalog hosting the KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * the catalog hosting the KnowledgeBase
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * the schema inside the catalog hosting the KnowledgeBase
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * the schema inside the catalog hosting the KnowledgeBase
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
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
            /**
     * The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
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
     * The current state of the KnowledgeBase.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private KnowledgeBaseLifecycleState lifecycleState;

        /**
         * The current state of the KnowledgeBase.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(KnowledgeBaseLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
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


        public KnowledgeBaseSummary build() {
            KnowledgeBaseSummary model = new KnowledgeBaseSummary(this.key
                , this.displayName
                , this.catalogKey
                , this.schemaKey
                , this.description
                , this.timeCreated
                , this.createdBy
                , this.timeUpdated
                , this.updatedBy
                , this.currentProcessedItems
                , this.lifecycleState
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.timeUpdated(model.getTimeUpdated());
    this.updatedBy(model.getUpdatedBy());
    this.currentProcessedItems(model.getCurrentProcessedItems());
    this.lifecycleState(model.getLifecycleState());
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
     * Immutable Unique identifier generated at creation
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Immutable Unique identifier generated at creation
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * KnowledgeBase Identifier, can be renamed
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * KnowledgeBase Identifier, can be renamed
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * the catalog hosting the KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * the catalog hosting the KnowledgeBase
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * the schema inside the catalog hosting the KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * the schema inside the catalog hosting the KnowledgeBase
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
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


        /**
     * The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The time at which KnowledgeBase was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
     * The current state of the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final KnowledgeBaseLifecycleState lifecycleState;

        /**
     * The current state of the KnowledgeBase.
     * @return the value
     **/
    
    public KnowledgeBaseLifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("KnowledgeBaseSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", currentProcessedItems=").append(String.valueOf(this.currentProcessedItems));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseSummary)) {
            return false;
        }

        KnowledgeBaseSummary other = (KnowledgeBaseSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.currentProcessedItems, other.currentProcessedItems) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.currentProcessedItems == null ? 43 : this.currentProcessedItems.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
