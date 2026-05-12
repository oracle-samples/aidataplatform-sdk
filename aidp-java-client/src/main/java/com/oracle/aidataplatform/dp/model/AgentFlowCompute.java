package com.oracle.aidataplatform.dp.model;



/**
 * User-created cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowCompute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="sourceApi")

public final class AgentFlowCompute extends Cluster {
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


        public AgentFlowCompute build() {
            AgentFlowCompute model = new AgentFlowCompute(this.key
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
                , this.stoppedByName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowCompute model) {
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
    public AgentFlowCompute(String key, String displayName, String description, ClusterType type, java.util.Date timeCreated, java.util.Date timeUpdated, State state, String stateDetails, String nodeType, DriverConfig driverConfig, ActiveClusterResources activeClusterResources, String createdBy, String createdByName, String updatedBy, String updatedByName, String stoppedBy, String stoppedByName) {
    super(key, displayName, description, type, timeCreated, timeUpdated, state, stateDetails, nodeType, driverConfig, activeClusterResources, createdBy, createdByName, updatedBy, updatedByName, stoppedBy, stoppedByName);
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
        sb.append("AgentFlowCompute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowCompute)) {
            return false;
        }

        AgentFlowCompute other = (AgentFlowCompute) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
