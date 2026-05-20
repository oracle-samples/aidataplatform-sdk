// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Description of KnowledgeBase Job Run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseJobRun.Builder.class)

public final class KnowledgeBaseJobRun  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "knowledgeBaseJobKey", "description", "catalogKey", "schemaKey", "knowledgeBaseKey", "timeCreated", "timeUpdated", "timeFinished", "createdBy", "updatedBy", "lifecycleState", "lifecycleStateDetails", "runData"})
    public KnowledgeBaseJobRun(String key, String knowledgeBaseJobKey, String description, String catalogKey, String schemaKey, String knowledgeBaseKey, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.Date timeFinished, String createdBy, String updatedBy, KnowledgeBaseJobRunLifecycleState lifecycleState, String lifecycleStateDetails, KnowledgeBaseJobRunData runData) {
        super();
        this.key = key;
        this.knowledgeBaseJobKey = knowledgeBaseJobKey;
        this.description = description;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.knowledgeBaseKey = knowledgeBaseKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeFinished = timeFinished;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.runData = runData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Unique identifier for this KnowledgeBase Job run
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The Unique identifier for this KnowledgeBase Job run
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * The name of the KnowledgeBase Job definition
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseJobKey")
private String knowledgeBaseJobKey;

        /**
         * The name of the KnowledgeBase Job definition
         * @param knowledgeBaseJobKey the value to set
         * @return this builder
         **/
        

public Builder knowledgeBaseJobKey(String knowledgeBaseJobKey) {
    this.knowledgeBaseJobKey = knowledgeBaseJobKey;
    return this;
}
            /**
     * A user-friendly description about this KnowledgeBase Job run
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A user-friendly description about this KnowledgeBase Job run
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
     * Timestamp when KnowledgeBase job run was created
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Timestamp when KnowledgeBase job run was created
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Timestamp when KnowledgeBase job run was updated
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * Timestamp when KnowledgeBase job run was updated
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * Timestamp when KnowledgeBase job run was updated
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
private java.util.Date timeFinished;

        /**
         * Timestamp when KnowledgeBase job run was updated
         * @param timeFinished the value to set
         * @return this builder
         **/
        

public Builder timeFinished(java.util.Date timeFinished) {
    this.timeFinished = timeFinished;
    return this;
}
            /**
     * Identifier for KnowledgeBase job run creator
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * Identifier for KnowledgeBase job run creator
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
     * Lifecycle of KnowledgeBase Job Run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private KnowledgeBaseJobRunLifecycleState lifecycleState;

        /**
         * Lifecycle of KnowledgeBase Job Run.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(KnowledgeBaseJobRunLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Additional information about the current state of KnowledgeBase job run
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * Additional information about the current state of KnowledgeBase job run
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("runData")
private KnowledgeBaseJobRunData runData;



public Builder runData(KnowledgeBaseJobRunData runData) {
    this.runData = runData;
    return this;
}


        public KnowledgeBaseJobRun build() {
            KnowledgeBaseJobRun model = new KnowledgeBaseJobRun(this.key
                , this.knowledgeBaseJobKey
                , this.description
                , this.catalogKey
                , this.schemaKey
                , this.knowledgeBaseKey
                , this.timeCreated
                , this.timeUpdated
                , this.timeFinished
                , this.createdBy
                , this.updatedBy
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.runData);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseJobRun model) {
                this.key(model.getKey());
    this.knowledgeBaseJobKey(model.getKnowledgeBaseJobKey());
    this.description(model.getDescription());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.knowledgeBaseKey(model.getKnowledgeBaseKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.timeFinished(model.getTimeFinished());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.runData(model.getRunData());
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
     * The Unique identifier for this KnowledgeBase Job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The Unique identifier for this KnowledgeBase Job run
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The name of the KnowledgeBase Job definition
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseJobKey")
    private final String knowledgeBaseJobKey;

        /**
     * The name of the KnowledgeBase Job definition
     * @return the value
     **/
    
    public String getKnowledgeBaseJobKey() {
        return knowledgeBaseJobKey;
    }


        /**
     * A user-friendly description about this KnowledgeBase Job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A user-friendly description about this KnowledgeBase Job run
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
     * Timestamp when KnowledgeBase job run was created
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Timestamp when KnowledgeBase job run was created
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Timestamp when KnowledgeBase job run was updated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Timestamp when KnowledgeBase job run was updated
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Timestamp when KnowledgeBase job run was updated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

        /**
     * Timestamp when KnowledgeBase job run was updated
     * @return the value
     **/
    
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }


        /**
     * Identifier for KnowledgeBase job run creator
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * Identifier for KnowledgeBase job run creator
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
     * Lifecycle of KnowledgeBase Job Run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final KnowledgeBaseJobRunLifecycleState lifecycleState;

        /**
     * Lifecycle of KnowledgeBase Job Run.
     * @return the value
     **/
    
    public KnowledgeBaseJobRunLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Additional information about the current state of KnowledgeBase job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * Additional information about the current state of KnowledgeBase job run
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("runData")
    private final KnowledgeBaseJobRunData runData;

    
    public KnowledgeBaseJobRunData getRunData() {
        return runData;
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
        sb.append("KnowledgeBaseJobRun(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", knowledgeBaseJobKey=").append(String.valueOf(this.knowledgeBaseJobKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", knowledgeBaseKey=").append(String.valueOf(this.knowledgeBaseKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", runData=").append(String.valueOf(this.runData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseJobRun)) {
            return false;
        }

        KnowledgeBaseJobRun other = (KnowledgeBaseJobRun) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.knowledgeBaseJobKey, other.knowledgeBaseJobKey) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.knowledgeBaseKey, other.knowledgeBaseKey) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.timeFinished, other.timeFinished) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.runData, other.runData);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.knowledgeBaseJobKey == null ? 43 : this.knowledgeBaseJobKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.knowledgeBaseKey == null ? 43 : this.knowledgeBaseKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.runData == null ? 43 : this.runData.hashCode());
        return result;
    }


}
