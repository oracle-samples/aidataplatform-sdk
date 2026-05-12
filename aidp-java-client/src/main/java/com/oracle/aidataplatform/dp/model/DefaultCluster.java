package com.oracle.aidataplatform.dp.model;



/**
 * The default cluster created by AI Data Platform Workbench.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DefaultCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="sourceApi")

public final class DefaultCluster extends Cluster {
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
@com.fasterxml.jackson.annotation.JsonProperty("type")
private ClusterType type;

public Builder type(ClusterType type) {
    this.type = type;
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
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

public Builder state(State state) {
    this.state = state;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("stateDetails")
private String stateDetails;

public Builder stateDetails(String stateDetails) {
    this.stateDetails = stateDetails;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("nodeType")
private String nodeType;

public Builder nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
private DriverConfig driverConfig;

public Builder driverConfig(DriverConfig driverConfig) {
    this.driverConfig = driverConfig;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("activeClusterResources")
private ActiveClusterResources activeClusterResources;

public Builder activeClusterResources(ActiveClusterResources activeClusterResources) {
    this.activeClusterResources = activeClusterResources;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
private String updatedByName;

public Builder updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("stoppedBy")
private String stoppedBy;

public Builder stoppedBy(String stoppedBy) {
    this.stoppedBy = stoppedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("stoppedByName")
private String stoppedByName;

public Builder stoppedByName(String stoppedByName) {
    this.stoppedByName = stoppedByName;
    return this;
}
            /**
     * The key of the AI Data Platform Workbench workspace where the default cluster is.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * The key of the AI Data Platform Workbench workspace where the default cluster is.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
private WorkerConfig workerConfig;



public Builder workerConfig(WorkerConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
private ClusterRuntimeConfig clusterRuntimeConfig;



public Builder clusterRuntimeConfig(ClusterRuntimeConfig clusterRuntimeConfig) {
    this.clusterRuntimeConfig = clusterRuntimeConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("loggingConfig")
private LoggingConfig loggingConfig;



public Builder loggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
}
            /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("autoTerminationMinutes")
private Integer autoTerminationMinutes;

        /**
         * Optional timeout value in minutes used to automatically stop idle compute clusters.
         * @param autoTerminationMinutes the value to set
         * @return this builder
         **/
        

public Builder autoTerminationMinutes(Integer autoTerminationMinutes) {
    this.autoTerminationMinutes = autoTerminationMinutes;
    return this;
}
            /**
     * Spark JDBC URL.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jdbcEndpointUrl")
private String jdbcEndpointUrl;

        /**
         * Spark JDBC URL.
         * @param jdbcEndpointUrl the value to set
         * @return this builder
         **/
        

public Builder jdbcEndpointUrl(String jdbcEndpointUrl) {
    this.jdbcEndpointUrl = jdbcEndpointUrl;
    return this;
}
            /**
     * The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logId")
private String logId;

        /**
         * The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
* 
         * @param logId the value to set
         * @return this builder
         **/
        

public Builder logId(String logId) {
    this.logId = logId;
    return this;
}
            /**
     * The unique OCID that identifies a specific log group within OCI Logging.
* This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
private String logGroupId;

        /**
         * The unique OCID that identifies a specific log group within OCI Logging.
* This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.
* 
         * @param logGroupId the value to set
         * @return this builder
         **/
        

public Builder logGroupId(String logGroupId) {
    this.logGroupId = logGroupId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("subscription")
private SubscriptionDetails subscription;



public Builder subscription(SubscriptionDetails subscription) {
    this.subscription = subscription;
    return this;
}


        public DefaultCluster build() {
            DefaultCluster model = new DefaultCluster(this.key
                , this.displayName
                , this.description
                , this.type
                , this.timeCreated
                , this.timeUpdated
                , this.state
                , this.stateDetails
                , this.nodeType
                , this.driverConfig
                , this.activeClusterResources
                , this.createdBy
                , this.createdByName
                , this.updatedBy
                , this.updatedByName
                , this.stoppedBy
                , this.stoppedByName
                , this.workspaceKey
                , this.workerConfig
                , this.clusterRuntimeConfig
                , this.loggingConfig
                , this.autoTerminationMinutes
                , this.jdbcEndpointUrl
                , this.logId
                , this.logGroupId
                , this.subscription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultCluster model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.state(model.getState());
    this.stateDetails(model.getStateDetails());
    this.nodeType(model.getNodeType());
    this.driverConfig(model.getDriverConfig());
    this.activeClusterResources(model.getActiveClusterResources());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
    this.stoppedBy(model.getStoppedBy());
    this.stoppedByName(model.getStoppedByName());
    this.workspaceKey(model.getWorkspaceKey());
    this.workerConfig(model.getWorkerConfig());
    this.clusterRuntimeConfig(model.getClusterRuntimeConfig());
    this.loggingConfig(model.getLoggingConfig());
    this.autoTerminationMinutes(model.getAutoTerminationMinutes());
    this.jdbcEndpointUrl(model.getJdbcEndpointUrl());
    this.logId(model.getLogId());
    this.logGroupId(model.getLogGroupId());
    this.subscription(model.getSubscription());
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
    public DefaultCluster(String key, String displayName, String description, ClusterType type, java.util.Date timeCreated, java.util.Date timeUpdated, State state, String stateDetails, String nodeType, DriverConfig driverConfig, ActiveClusterResources activeClusterResources, String createdBy, String createdByName, String updatedBy, String updatedByName, String stoppedBy, String stoppedByName, String workspaceKey, WorkerConfig workerConfig, ClusterRuntimeConfig clusterRuntimeConfig, LoggingConfig loggingConfig, Integer autoTerminationMinutes, String jdbcEndpointUrl, String logId, String logGroupId, SubscriptionDetails subscription) {
    super(key, displayName, description, type, timeCreated, timeUpdated, state, stateDetails, nodeType, driverConfig, activeClusterResources, createdBy, createdByName, updatedBy, updatedByName, stoppedBy, stoppedByName);
        this.workspaceKey = workspaceKey;
        this.workerConfig = workerConfig;
        this.clusterRuntimeConfig = clusterRuntimeConfig;
        this.loggingConfig = loggingConfig;
        this.autoTerminationMinutes = autoTerminationMinutes;
        this.jdbcEndpointUrl = jdbcEndpointUrl;
        this.logId = logId;
        this.logGroupId = logGroupId;
        this.subscription = subscription;
    }


        /**
     * The key of the AI Data Platform Workbench workspace where the default cluster is.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The key of the AI Data Platform Workbench workspace where the default cluster is.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
    private final WorkerConfig workerConfig;

    
    public WorkerConfig getWorkerConfig() {
        return workerConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
    private final ClusterRuntimeConfig clusterRuntimeConfig;

    
    public ClusterRuntimeConfig getClusterRuntimeConfig() {
        return clusterRuntimeConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("loggingConfig")
    private final LoggingConfig loggingConfig;

    
    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }


        /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("autoTerminationMinutes")
    private final Integer autoTerminationMinutes;

        /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     * @return the value
     **/
    
    public Integer getAutoTerminationMinutes() {
        return autoTerminationMinutes;
    }


        /**
     * Spark JDBC URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jdbcEndpointUrl")
    private final String jdbcEndpointUrl;

        /**
     * Spark JDBC URL.
     * @return the value
     **/
    
    public String getJdbcEndpointUrl() {
        return jdbcEndpointUrl;
    }


        /**
     * The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

        /**
     * The OCID of the log where cluster logs are published and retrieved. This logId is always created within the logGroupId returned in the response payload.
* 
     * @return the value
     **/
    
    public String getLogId() {
        return logId;
    }


        /**
     * The unique OCID that identifies a specific log group within OCI Logging.
* This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

        /**
     * The unique OCID that identifies a specific log group within OCI Logging.
* This log group is exclusively associated with the AI Data Platform Workbench instance and is created in the same compartment within the customer\u2019s tenancy as the AI Data Platform Workbench instance.
* 
     * @return the value
     **/
    
    public String getLogGroupId() {
        return logGroupId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("subscription")
    private final SubscriptionDetails subscription;

    
    public SubscriptionDetails getSubscription() {
        return subscription;
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
        sb.append("DefaultCluster(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", workerConfig=").append(String.valueOf(this.workerConfig));
        sb.append(", clusterRuntimeConfig=").append(String.valueOf(this.clusterRuntimeConfig));
        sb.append(", loggingConfig=").append(String.valueOf(this.loggingConfig));
        sb.append(", autoTerminationMinutes=").append(String.valueOf(this.autoTerminationMinutes));
        sb.append(", jdbcEndpointUrl=").append(String.valueOf(this.jdbcEndpointUrl));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", subscription=").append(String.valueOf(this.subscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultCluster)) {
            return false;
        }

        DefaultCluster other = (DefaultCluster) o;
        return java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.workerConfig, other.workerConfig) &&
            java.util.Objects.equals(this.clusterRuntimeConfig, other.clusterRuntimeConfig) &&
            java.util.Objects.equals(this.loggingConfig, other.loggingConfig) &&
            java.util.Objects.equals(this.autoTerminationMinutes, other.autoTerminationMinutes) &&
            java.util.Objects.equals(this.jdbcEndpointUrl, other.jdbcEndpointUrl) &&
            java.util.Objects.equals(this.logId, other.logId) &&
            java.util.Objects.equals(this.logGroupId, other.logGroupId) &&
            java.util.Objects.equals(this.subscription, other.subscription) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.workerConfig == null ? 43 : this.workerConfig.hashCode());
        result = (result * PRIME) + (this.clusterRuntimeConfig == null ? 43 : this.clusterRuntimeConfig.hashCode());
        result = (result * PRIME) + (this.loggingConfig == null ? 43 : this.loggingConfig.hashCode());
        result = (result * PRIME) + (this.autoTerminationMinutes == null ? 43 : this.autoTerminationMinutes.hashCode());
        result = (result * PRIME) + (this.jdbcEndpointUrl == null ? 43 : this.jdbcEndpointUrl.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.subscription == null ? 43 : this.subscription.hashCode());
        return result;
    }


}
