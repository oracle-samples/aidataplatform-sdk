// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Derived model for topic of a Kafka external catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KafkaTopicSchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType")

public final class KafkaTopicSchema extends Schema {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

public Builder key(String key) {
    this.key = key;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, String> properties;

public Builder properties(java.util.Map<String, String> properties) {
    this.properties = properties;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private SchemaLifecycleState lifecycleState;

public Builder lifecycleState(SchemaLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("details")
private java.util.Map<String, String> details;

public Builder details(java.util.Map<String, String> details) {
    this.details = details;
    return this;
}
            /**
     * The number of partitions in the Kafka topic.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("partitions")
private String partitions;

        /**
         * The number of partitions in the Kafka topic.
         * @param partitions the value to set
         * @return this builder
         **/
        

public Builder partitions(String partitions) {
    this.partitions = partitions;
    return this;
}
            /**
     * The replication factor.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
private String replicationFactor;

        /**
         * The replication factor.
         * @param replicationFactor the value to set
         * @return this builder
         **/
        

public Builder replicationFactor(String replicationFactor) {
    this.replicationFactor = replicationFactor;
    return this;
}
            /**
     * Bootstrap servers for the Kafka topic.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
private String bootstrapServers;

        /**
         * Bootstrap servers for the Kafka topic.
         * @param bootstrapServers the value to set
         * @return this builder
         **/
        

public Builder bootstrapServers(String bootstrapServers) {
    this.bootstrapServers = bootstrapServers;
    return this;
}
            /**
     * The details of the partitions in Kafka topic.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("partitionDetails")
private String partitionDetails;

        /**
         * The details of the partitions in Kafka topic.
         * @param partitionDetails the value to set
         * @return this builder
         **/
        

public Builder partitionDetails(String partitionDetails) {
    this.partitionDetails = partitionDetails;
    return this;
}


        public KafkaTopicSchema build() {
            KafkaTopicSchema model = new KafkaTopicSchema(this.key
                , this.displayName
                , this.description
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.properties
                , this.catalogName
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.details
                , this.partitions
                , this.replicationFactor
                , this.bootstrapServers
                , this.partitionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaTopicSchema model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.properties(model.getProperties());
    this.catalogName(model.getCatalogName());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.details(model.getDetails());
    this.partitions(model.getPartitions());
    this.replicationFactor(model.getReplicationFactor());
    this.bootstrapServers(model.getBootstrapServers());
    this.partitionDetails(model.getPartitionDetails());
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

    
    @Deprecated
    public KafkaTopicSchema(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, java.util.Map<String, String> properties, String catalogName, SchemaLifecycleState lifecycleState, String lifecycleStateDetails, java.util.Map<String, String> details, String partitions, String replicationFactor, String bootstrapServers, String partitionDetails) {
    super(key, displayName, description, timeCreated, timeUpdated, createdBy, updatedBy, properties, catalogName, lifecycleState, lifecycleStateDetails, details);
        this.partitions = partitions;
        this.replicationFactor = replicationFactor;
        this.bootstrapServers = bootstrapServers;
        this.partitionDetails = partitionDetails;
    }


        /**
     * The number of partitions in the Kafka topic.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("partitions")
    private final String partitions;

        /**
     * The number of partitions in the Kafka topic.
     * @return the value
     **/
    
    public String getPartitions() {
        return partitions;
    }


        /**
     * The replication factor.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
    private final String replicationFactor;

        /**
     * The replication factor.
     * @return the value
     **/
    
    public String getReplicationFactor() {
        return replicationFactor;
    }


        /**
     * Bootstrap servers for the Kafka topic.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    private final String bootstrapServers;

        /**
     * Bootstrap servers for the Kafka topic.
     * @return the value
     **/
    
    public String getBootstrapServers() {
        return bootstrapServers;
    }


        /**
     * The details of the partitions in Kafka topic.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("partitionDetails")
    private final String partitionDetails;

        /**
     * The details of the partitions in Kafka topic.
     * @return the value
     **/
    
    public String getPartitionDetails() {
        return partitionDetails;
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
        sb.append("KafkaTopicSchema(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", partitions=").append(String.valueOf(this.partitions));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", bootstrapServers=").append(String.valueOf(this.bootstrapServers));
        sb.append(", partitionDetails=").append(String.valueOf(this.partitionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaTopicSchema)) {
            return false;
        }

        KafkaTopicSchema other = (KafkaTopicSchema) o;
        return java.util.Objects.equals(this.partitions, other.partitions) &&
            java.util.Objects.equals(this.replicationFactor, other.replicationFactor) &&
            java.util.Objects.equals(this.bootstrapServers, other.bootstrapServers) &&
            java.util.Objects.equals(this.partitionDetails, other.partitionDetails) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.partitions == null ? 43 : this.partitions.hashCode());
        result = (result * PRIME) + (this.replicationFactor == null ? 43 : this.replicationFactor.hashCode());
        result = (result * PRIME) + (this.bootstrapServers == null ? 43 : this.bootstrapServers.hashCode());
        result = (result * PRIME) + (this.partitionDetails == null ? 43 : this.partitionDetails.hashCode());
        return result;
    }


}
