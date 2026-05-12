package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a workspace cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterSummary.Builder.class)

public final class ClusterSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "type", "timeCreated", "timeUpdated", "state", "stateDetails", "createdBy", "createdByName", "updatedBy", "updatedByName", "stoppedBy", "stoppedByName", "clusterRuntimeConfig", "activeClusterResources", "driverConfig", "workerConfig", "attachedNotebooks", "attachedSessions", "attachedAgentFlowCount"})
    public ClusterSummary(String key, String displayName, String description, ClusterType type, java.util.Date timeCreated, java.util.Date timeUpdated, Cluster.State state, String stateDetails, String createdBy, String createdByName, String updatedBy, String updatedByName, String stoppedBy, String stoppedByName, ClusterRuntimeConfig clusterRuntimeConfig, ActiveClusterResources activeClusterResources, DriverConfig driverConfig, WorkerConfig workerConfig, java.util.List<String> attachedNotebooks, java.util.List<AttachedSession> attachedSessions, Integer attachedAgentFlowCount) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.state = state;
        this.stateDetails = stateDetails;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.stoppedBy = stoppedBy;
        this.stoppedByName = stoppedByName;
        this.clusterRuntimeConfig = clusterRuntimeConfig;
        this.activeClusterResources = activeClusterResources;
        this.driverConfig = driverConfig;
        this.workerConfig = workerConfig;
        this.attachedNotebooks = attachedNotebooks;
        this.attachedSessions = attachedSessions;
        this.attachedAgentFlowCount = attachedAgentFlowCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Cluster key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Cluster key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Cluster name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Cluster name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Cluster description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Cluster description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * ClusterType
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private ClusterType type;

        /**
         * ClusterType
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(ClusterType type) {
    this.type = type;
    return this;
}
            /**
     * Date and time the cluster was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Date and time the cluster was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Date and time the cluster was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * Date and time the cluster was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The current state of the cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private Cluster.State state;

        /**
         * The current state of the cluster.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(Cluster.State state) {
    this.state = state;
    return this;
}
            /**
     * A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
private String stateDetails;

        /**
         * A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
         * @param stateDetails the value to set
         * @return this builder
         **/
        

public Builder stateDetails(String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
}
            /**
     * OCID of the user who created this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * OCID of the user who created this record.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this record.
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}
            /**
     * OCID of the user who updated this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * OCID of the user who updated this record.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * Name of the user who updated this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
private String updatedByName;

        /**
         * Name of the user who updated this record.
         * @param updatedByName the value to set
         * @return this builder
         **/
        

public Builder updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    return this;
}
            /**
     * OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stoppedBy")
private String stoppedBy;

        /**
         * OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
         * @param stoppedBy the value to set
         * @return this builder
         **/
        

public Builder stoppedBy(String stoppedBy) {
    this.stoppedBy = stoppedBy;
    return this;
}
            /**
     * Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stoppedByName")
private String stoppedByName;

        /**
         * Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
         * @param stoppedByName the value to set
         * @return this builder
         **/
        

public Builder stoppedByName(String stoppedByName) {
    this.stoppedByName = stoppedByName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
private ClusterRuntimeConfig clusterRuntimeConfig;



public Builder clusterRuntimeConfig(ClusterRuntimeConfig clusterRuntimeConfig) {
    this.clusterRuntimeConfig = clusterRuntimeConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("activeClusterResources")
private ActiveClusterResources activeClusterResources;



public Builder activeClusterResources(ActiveClusterResources activeClusterResources) {
    this.activeClusterResources = activeClusterResources;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
private DriverConfig driverConfig;



public Builder driverConfig(DriverConfig driverConfig) {
    this.driverConfig = driverConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
private WorkerConfig workerConfig;



public Builder workerConfig(WorkerConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
}
            /**
     * List of notebooks attached to a specific cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("attachedNotebooks")
private java.util.List<String> attachedNotebooks;

        /**
         * List of notebooks attached to a specific cluster.
         * @param attachedNotebooks the value to set
         * @return this builder
         **/
        

public Builder attachedNotebooks(java.util.List<String> attachedNotebooks) {
    this.attachedNotebooks = attachedNotebooks;
    return this;
}
            /**
     * List of sessions attached to a specific cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("attachedSessions")
private java.util.List<AttachedSession> attachedSessions;

        /**
         * List of sessions attached to a specific cluster.
         * @param attachedSessions the value to set
         * @return this builder
         **/
        

public Builder attachedSessions(java.util.List<AttachedSession> attachedSessions) {
    this.attachedSessions = attachedSessions;
    return this;
}
            /**
     * Count of agent flow attached to a specific cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("attachedAgentFlowCount")
private Integer attachedAgentFlowCount;

        /**
         * Count of agent flow attached to a specific cluster.
         * @param attachedAgentFlowCount the value to set
         * @return this builder
         **/
        

public Builder attachedAgentFlowCount(Integer attachedAgentFlowCount) {
    this.attachedAgentFlowCount = attachedAgentFlowCount;
    return this;
}


        public ClusterSummary build() {
            ClusterSummary model = new ClusterSummary(this.key
                , this.displayName
                , this.description
                , this.type
                , this.timeCreated
                , this.timeUpdated
                , this.state
                , this.stateDetails
                , this.createdBy
                , this.createdByName
                , this.updatedBy
                , this.updatedByName
                , this.stoppedBy
                , this.stoppedByName
                , this.clusterRuntimeConfig
                , this.activeClusterResources
                , this.driverConfig
                , this.workerConfig
                , this.attachedNotebooks
                , this.attachedSessions
                , this.attachedAgentFlowCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.state(model.getState());
    this.stateDetails(model.getStateDetails());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
    this.stoppedBy(model.getStoppedBy());
    this.stoppedByName(model.getStoppedByName());
    this.clusterRuntimeConfig(model.getClusterRuntimeConfig());
    this.activeClusterResources(model.getActiveClusterResources());
    this.driverConfig(model.getDriverConfig());
    this.workerConfig(model.getWorkerConfig());
    this.attachedNotebooks(model.getAttachedNotebooks());
    this.attachedSessions(model.getAttachedSessions());
    this.attachedAgentFlowCount(model.getAttachedAgentFlowCount());
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
     * Cluster key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Cluster key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Cluster name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Cluster name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Cluster description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Cluster description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    
        /**
     * ClusterType
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ClusterType type;

        /**
     * ClusterType
     * @return the value
     **/
    
    public ClusterType getType() {
        return type;
    }


        /**
     * Date and time the cluster was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Date and time the cluster was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Date and time the cluster was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Date and time the cluster was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The current state of the cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final Cluster.State state;

        /**
     * The current state of the cluster.
     * @return the value
     **/
    
    public Cluster.State getState() {
        return state;
    }


        /**
     * A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
    private final String stateDetails;

        /**
     * A message that describes the current state of the workspace cluster in more detail. For example, can be used to provide actionable information for a resource in the Failed state.
     * @return the value
     **/
    
    public String getStateDetails() {
        return stateDetails;
    }


        /**
     * OCID of the user who created this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * OCID of the user who created this record.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record.
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * OCID of the user who updated this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * OCID of the user who updated this record.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Name of the user who updated this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

        /**
     * Name of the user who updated this record.
     * @return the value
     **/
    
    public String getUpdatedByName() {
        return updatedByName;
    }


        /**
     * OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stoppedBy")
    private final String stoppedBy;

        /**
     * OCID of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     * @return the value
     **/
    
    public String getStoppedBy() {
        return stoppedBy;
    }


        /**
     * Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stoppedByName")
    private final String stoppedByName;

        /**
     * Name of the user who stopped the cluster. Value will be 'SYSTEM' if it was auto stopped.
     * @return the value
     **/
    
    public String getStoppedByName() {
        return stoppedByName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
    private final ClusterRuntimeConfig clusterRuntimeConfig;

    
    public ClusterRuntimeConfig getClusterRuntimeConfig() {
        return clusterRuntimeConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("activeClusterResources")
    private final ActiveClusterResources activeClusterResources;

    
    public ActiveClusterResources getActiveClusterResources() {
        return activeClusterResources;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
    private final DriverConfig driverConfig;

    
    public DriverConfig getDriverConfig() {
        return driverConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
    private final WorkerConfig workerConfig;

    
    public WorkerConfig getWorkerConfig() {
        return workerConfig;
    }


        /**
     * List of notebooks attached to a specific cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attachedNotebooks")
    private final java.util.List<String> attachedNotebooks;

        /**
     * List of notebooks attached to a specific cluster.
     * @return the value
     **/
    
    public java.util.List<String> getAttachedNotebooks() {
        return attachedNotebooks;
    }


        /**
     * List of sessions attached to a specific cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attachedSessions")
    private final java.util.List<AttachedSession> attachedSessions;

        /**
     * List of sessions attached to a specific cluster.
     * @return the value
     **/
    
    public java.util.List<AttachedSession> getAttachedSessions() {
        return attachedSessions;
    }


        /**
     * Count of agent flow attached to a specific cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attachedAgentFlowCount")
    private final Integer attachedAgentFlowCount;

        /**
     * Count of agent flow attached to a specific cluster.
     * @return the value
     **/
    
    public Integer getAttachedAgentFlowCount() {
        return attachedAgentFlowCount;
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
        sb.append("ClusterSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", stateDetails=").append(String.valueOf(this.stateDetails));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", stoppedBy=").append(String.valueOf(this.stoppedBy));
        sb.append(", stoppedByName=").append(String.valueOf(this.stoppedByName));
        sb.append(", clusterRuntimeConfig=").append(String.valueOf(this.clusterRuntimeConfig));
        sb.append(", activeClusterResources=").append(String.valueOf(this.activeClusterResources));
        sb.append(", driverConfig=").append(String.valueOf(this.driverConfig));
        sb.append(", workerConfig=").append(String.valueOf(this.workerConfig));
        sb.append(", attachedNotebooks=").append(String.valueOf(this.attachedNotebooks));
        sb.append(", attachedSessions=").append(String.valueOf(this.attachedSessions));
        sb.append(", attachedAgentFlowCount=").append(String.valueOf(this.attachedAgentFlowCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterSummary)) {
            return false;
        }

        ClusterSummary other = (ClusterSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.stateDetails, other.stateDetails) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.stoppedBy, other.stoppedBy) &&
            java.util.Objects.equals(this.stoppedByName, other.stoppedByName) &&
            java.util.Objects.equals(this.clusterRuntimeConfig, other.clusterRuntimeConfig) &&
            java.util.Objects.equals(this.activeClusterResources, other.activeClusterResources) &&
            java.util.Objects.equals(this.driverConfig, other.driverConfig) &&
            java.util.Objects.equals(this.workerConfig, other.workerConfig) &&
            java.util.Objects.equals(this.attachedNotebooks, other.attachedNotebooks) &&
            java.util.Objects.equals(this.attachedSessions, other.attachedSessions) &&
            java.util.Objects.equals(this.attachedAgentFlowCount, other.attachedAgentFlowCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.stateDetails == null ? 43 : this.stateDetails.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.stoppedBy == null ? 43 : this.stoppedBy.hashCode());
        result = (result * PRIME) + (this.stoppedByName == null ? 43 : this.stoppedByName.hashCode());
        result = (result * PRIME) + (this.clusterRuntimeConfig == null ? 43 : this.clusterRuntimeConfig.hashCode());
        result = (result * PRIME) + (this.activeClusterResources == null ? 43 : this.activeClusterResources.hashCode());
        result = (result * PRIME) + (this.driverConfig == null ? 43 : this.driverConfig.hashCode());
        result = (result * PRIME) + (this.workerConfig == null ? 43 : this.workerConfig.hashCode());
        result = (result * PRIME) + (this.attachedNotebooks == null ? 43 : this.attachedNotebooks.hashCode());
        result = (result * PRIME) + (this.attachedSessions == null ? 43 : this.attachedSessions.hashCode());
        result = (result * PRIME) + (this.attachedAgentFlowCount == null ? 43 : this.attachedAgentFlowCount.hashCode());
        return result;
    }


}
