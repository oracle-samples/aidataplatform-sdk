// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Description of KB Job Definition.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseJobSummary.Builder.class)

public final class KnowledgeBaseJobSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "catalogKey", "schemaKey", "knowledgeBaseKey", "type", "sources", "sourceKey", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState", "lifecycleStateDetails"})
    public KnowledgeBaseJobSummary(String key, String displayName, String description, String catalogKey, String schemaKey, String knowledgeBaseKey, KnowledgeBaseJobType type, String sources, String sourceKey, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, KnowledgeBaseJobLifecycleState lifecycleState, String lifecycleStateDetails) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.knowledgeBaseKey = knowledgeBaseKey;
        this.type = type;
        this.sources = sources;
        this.sourceKey = sourceKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The Unique identifier for this KnowledgeBase Job resource
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The Unique identifier for this KnowledgeBase Job resource
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
     * A user-friendly description about this KnowledgeBase Job resource
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * A user-friendly description about this KnowledgeBase Job resource
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The name of the catalog containing the KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
        private String catalogKey;

                /**
         * The name of the catalog containing the KnowledgeBase.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

        public Builder catalogKey(String catalogKey) {
        this.catalogKey = catalogKey;
        return this;
        }
            /**
     * The name of the schema containing the KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
        private String schemaKey;

                /**
         * The name of the schema containing the KnowledgeBase.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

        public Builder schemaKey(String schemaKey) {
        this.schemaKey = schemaKey;
        return this;
        }
            /**
     * The name of the KnowledgeBase
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseKey")
        private String knowledgeBaseKey;

                /**
         * The name of the KnowledgeBase
         * @param knowledgeBaseKey the value to set
         * @return this builder
         **/
        

        public Builder knowledgeBaseKey(String knowledgeBaseKey) {
        this.knowledgeBaseKey = knowledgeBaseKey;
        return this;
        }
            /**
     * type of knowledgeBase Job Definition
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private KnowledgeBaseJobType type;

                /**
         * type of knowledgeBase Job Definition
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(KnowledgeBaseJobType type) {
        this.type = type;
        return this;
        }
            /**
     * Name of the source, "*" for Default job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private String sources;

                /**
         * Name of the source, "*" for Default job
         * @param sources the value to set
         * @return this builder
         **/
        

        public Builder sources(String sources) {
        this.sources = sources;
        return this;
        }
            /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
        private String sourceKey;

                /**
         * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
         * @param sourceKey the value to set
         * @return this builder
         **/
        

        public Builder sourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
        }
            /**
     * Timestamp when knowledgeBase job was created
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * Timestamp when knowledgeBase job was created
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * Timestamp when knowledgeBase job was updated
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * Timestamp when knowledgeBase job was updated
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
        return this;
        }
            /**
     * Identifier for knowledgeBase job creator
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * Identifier for knowledgeBase job creator
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * Identifier for principal who updated the knowledgeBase job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

                /**
         * Identifier for principal who updated the knowledgeBase job
         * @param updatedBy the value to set
         * @return this builder
         **/
        

        public Builder updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
        }
            /**
     * Lifecycle of knowledgeBase Job.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private KnowledgeBaseJobLifecycleState lifecycleState;

                /**
         * Lifecycle of knowledgeBase Job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(KnowledgeBaseJobLifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }
            /**
     * Additional information about the current state of KB job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

                /**
         * Additional information about the current state of KB job
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
        this.lifecycleStateDetails = lifecycleStateDetails;
        return this;
        }


        public KnowledgeBaseJobSummary build() {
            KnowledgeBaseJobSummary model = new KnowledgeBaseJobSummary(this.key
                    , this.displayName
                    , this.description
                    , this.catalogKey
                    , this.schemaKey
                    , this.knowledgeBaseKey
                    , this.type
                    , this.sources
                    , this.sourceKey
                    , this.timeCreated
                    , this.timeUpdated
                    , this.createdBy
                    , this.updatedBy
                    , this.lifecycleState
                    , this.lifecycleStateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseJobSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.knowledgeBaseKey(model.getKnowledgeBaseKey());
    this.type(model.getType());
    this.sources(model.getSources());
    this.sourceKey(model.getSourceKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
     * The Unique identifier for this KnowledgeBase Job resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The Unique identifier for this KnowledgeBase Job resource
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
     * A user-friendly description about this KnowledgeBase Job resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A user-friendly description about this KnowledgeBase Job resource
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The name of the catalog containing the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The name of the catalog containing the KnowledgeBase.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * The name of the schema containing the KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The name of the schema containing the KnowledgeBase.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * The name of the KnowledgeBase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseKey")
    private final String knowledgeBaseKey;

        /**
     * The name of the KnowledgeBase
     * @return the value
     **/
    
    public String getKnowledgeBaseKey() {
        return knowledgeBaseKey;
    }

    
        /**
     * type of knowledgeBase Job Definition
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseJobType type;

        /**
     * type of knowledgeBase Job Definition
     * @return the value
     **/
    
    public KnowledgeBaseJobType getType() {
        return type;
    }


        /**
     * Name of the source, "*" for Default job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final String sources;

        /**
     * Name of the source, "*" for Default job
     * @return the value
     **/
    
    public String getSources() {
        return sources;
    }


        /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
    private final String sourceKey;

        /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     * @return the value
     **/
    
    public String getSourceKey() {
        return sourceKey;
    }


        /**
     * Timestamp when knowledgeBase job was created
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Timestamp when knowledgeBase job was created
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Timestamp when knowledgeBase job was updated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Timestamp when knowledgeBase job was updated
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Identifier for knowledgeBase job creator
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * Identifier for knowledgeBase job creator
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Identifier for principal who updated the knowledgeBase job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * Identifier for principal who updated the knowledgeBase job
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    
        /**
     * Lifecycle of knowledgeBase Job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final KnowledgeBaseJobLifecycleState lifecycleState;

        /**
     * Lifecycle of knowledgeBase Job.
     * @return the value
     **/
    
    public KnowledgeBaseJobLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Additional information about the current state of KB job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * Additional information about the current state of KB job
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
        sb.append("KnowledgeBaseJobSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", knowledgeBaseKey=").append(String.valueOf(this.knowledgeBaseKey));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseJobSummary)) {
            return false;
        }

        KnowledgeBaseJobSummary other = (KnowledgeBaseJobSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.knowledgeBaseKey, other.knowledgeBaseKey) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.sources, other.sources) &&
            java.util.Objects.equals(this.sourceKey, other.sourceKey) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails);
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
        result = (result * PRIME) + (this.knowledgeBaseKey == null ? 43 : this.knowledgeBaseKey.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        return result;
    }


}
