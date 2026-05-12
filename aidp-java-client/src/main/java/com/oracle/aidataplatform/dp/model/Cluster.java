package com.oracle.aidataplatform.dp.model;



/**
 * A Cluster is a compute subresource within AI Data Platform Workbench. Compute/Runtime Clusters are Spark execution environments. 
* Spark clusters are used for Notebook execution and for Spark SQL query execution over JDBC/ODBC. 
* These clusters seamlessly process the data in the AI Data Platform Workbench.  Users can also use JDBC/ODBC endpoints for highly 
* performant SQL execution for integration with analytics tools such as Oracle Analytic Cloud and Excel.
* A DEFAULT cluster is a subresource within AI Data Platform Workbench associated with master catalog and it can not be
* attached to a notebook. A USER cluster is a subresource within workspace and can be attached to a notebook.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="sourceApi", defaultImpl=Cluster.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SparkCluster.class, name = "CLUSTER_API"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AgentFlowCompute.class, name = "AGENT_FLOW_COMPUTE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DefaultCluster.class, name = "DEFAULT_CLUSTER_API")
})

public class Cluster  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "type", "timeCreated", "timeUpdated", "state", "stateDetails", "nodeType", "driverConfig", "activeClusterResources", "createdBy", "createdByName", "updatedBy", "updatedByName", "stoppedBy", "stoppedByName"})
    protected Cluster(String key, String displayName, String description, ClusterType type, java.util.Date timeCreated, java.util.Date timeUpdated, State state, String stateDetails, String nodeType, DriverConfig driverConfig, ActiveClusterResources activeClusterResources, String createdBy, String createdByName, String updatedBy, String updatedByName, String stoppedBy, String stoppedByName) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.state = state;
        this.stateDetails = stateDetails;
        this.nodeType = nodeType;
        this.driverConfig = driverConfig;
        this.activeClusterResources = activeClusterResources;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.stoppedBy = stoppedBy;
        this.stoppedByName = stoppedByName;
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
     * Common lifecycle states for resources in a compute cluster.
* ACCEPTED        - The resource create request has been accepted.
* CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
* ACTIVE          - The resource is valid and available for access.
* DELETING        - The resource is being deleted, and might require a deep clean of any children.
* DELETED         - The resource has been deleted, and isn't available.
* FAILED          - The resource is in a failed state due to validation or other errors.
* STOPPING        - The resource is being stopped.
* STOPPED         - The resource has been stopped.
* UPDATING        - The resource is being updated and might not be usable until all changes are commited.
* STARTING        - The resource is being started.
* RESTARTING      - The resource is being restarted.
* 
     **/
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Updating("UPDATING"),
        Restarting("RESTARTING"),
        Starting("STARTING"),
        NetworkConfigurationAttachInProgress("NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"),
        NetworkConfigurationAttachSuccessful("NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"),
        NetworkConfigurationAttachFailed("NETWORK_CONFIGURATION_ATTACH_FAILED"),
        NetworkConfigurationDetachInProgress("NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"),
        NetworkConfigurationDetachSuccessful("NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"),
        NetworkConfigurationDetachFailed("NETWORK_CONFIGURATION_DETACH_FAILED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'State', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Common lifecycle states for resources in a compute cluster.
* ACCEPTED        - The resource create request has been accepted.
* CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
* ACTIVE          - The resource is valid and available for access.
* DELETING        - The resource is being deleted, and might require a deep clean of any children.
* DELETED         - The resource has been deleted, and isn't available.
* FAILED          - The resource is in a failed state due to validation or other errors.
* STOPPING        - The resource is being stopped.
* STOPPED         - The resource has been stopped.
* UPDATING        - The resource is being updated and might not be usable until all changes are commited.
* STARTING        - The resource is being started.
* RESTARTING      - The resource is being restarted.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * Common lifecycle states for resources in a compute cluster.
* ACCEPTED        - The resource create request has been accepted.
* CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
* ACTIVE          - The resource is valid and available for access.
* DELETING        - The resource is being deleted, and might require a deep clean of any children.
* DELETED         - The resource has been deleted, and isn't available.
* FAILED          - The resource is in a failed state due to validation or other errors.
* STOPPING        - The resource is being stopped.
* STOPPED         - The resource has been stopped.
* UPDATING        - The resource is being updated and might not be usable until all changes are commited.
* STARTING        - The resource is being started.
* RESTARTING      - The resource is being restarted.
* 
     * @return the value
     **/
    
    public State getState() {
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
     * Cluster node type encodes the node shape and associated resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final String nodeType;

        /**
     * Cluster node type encodes the node shape and associated resources.
     * @return the value
     **/
    
    public String getNodeType() {
        return nodeType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
    private final DriverConfig driverConfig;

    
    public DriverConfig getDriverConfig() {
        return driverConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("activeClusterResources")
    private final ActiveClusterResources activeClusterResources;

    
    public ActiveClusterResources getActiveClusterResources() {
        return activeClusterResources;
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
        sb.append("Cluster(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", stateDetails=").append(String.valueOf(this.stateDetails));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", driverConfig=").append(String.valueOf(this.driverConfig));
        sb.append(", activeClusterResources=").append(String.valueOf(this.activeClusterResources));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", stoppedBy=").append(String.valueOf(this.stoppedBy));
        sb.append(", stoppedByName=").append(String.valueOf(this.stoppedByName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cluster)) {
            return false;
        }

        Cluster other = (Cluster) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.stateDetails, other.stateDetails) &&
            java.util.Objects.equals(this.nodeType, other.nodeType) &&
            java.util.Objects.equals(this.driverConfig, other.driverConfig) &&
            java.util.Objects.equals(this.activeClusterResources, other.activeClusterResources) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.stoppedBy, other.stoppedBy) &&
            java.util.Objects.equals(this.stoppedByName, other.stoppedByName);
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
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.driverConfig == null ? 43 : this.driverConfig.hashCode());
        result = (result * PRIME) + (this.activeClusterResources == null ? 43 : this.activeClusterResources.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.stoppedBy == null ? 43 : this.stoppedBy.hashCode());
        result = (result * PRIME) + (this.stoppedByName == null ? 43 : this.stoppedByName.hashCode());
        return result;
    }

    /**
     * User created clusters are associated with a particular workspace. Default cluster is to
* be used by all catalogs operations that require compute. Default cluster can be thought of as
* associated with Master catalog. Agent Flow Compute is used to execute Agent Flows.
* 
     **/
    public enum SourceApi implements com.oracle.bmc.http.internal.BmcEnum {
        ClusterApi("CLUSTER_API"),
        DefaultClusterApi("DEFAULT_CLUSTER_API"),
        AgentFlowCompute("AGENT_FLOW_COMPUTE"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SourceApi.class);

        private final String value;
        private static java.util.Map<String, SourceApi> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceApi v : SourceApi.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceApi(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceApi create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'SourceApi', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
