// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to update cluster async operation status.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateClusterAsyncOperationStatusDetails.Builder.class)

public final class UpdateClusterAsyncOperationStatusDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"stateMessage", "state", "externalId", "metrics", "properties"})
    public UpdateClusterAsyncOperationStatusDetails(String stateMessage, State state, String externalId, java.util.Map<String, String> metrics, java.util.Map<String, Object> properties) {
        super();
        this.stateMessage = stateMessage;
        this.state = state;
        this.externalId = externalId;
        this.metrics = metrics;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Descriptive message of the current state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
private String stateMessage;

        /**
         * Descriptive message of the current state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        

public Builder stateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
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
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

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
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * External work-request-id if applicable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalId")
private String externalId;

        /**
         * External work-request-id if applicable.
         * @param externalId the value to set
         * @return this builder
         **/
        

public Builder externalId(String externalId) {
    this.externalId = externalId;
    return this;
}
            /**
     * Metrics for the cluster operation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metrics")
private java.util.Map<String, String> metrics;

        /**
         * Metrics for the cluster operation.
         * @param metrics the value to set
         * @return this builder
         **/
        

public Builder metrics(java.util.Map<String, String> metrics) {
    this.metrics = metrics;
    return this;
}
            /**
     * Properties of operation on cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, Object> properties;

        /**
         * Properties of operation on cluster.
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, Object> properties) {
    this.properties = properties;
    return this;
}


        public UpdateClusterAsyncOperationStatusDetails build() {
            UpdateClusterAsyncOperationStatusDetails model = new UpdateClusterAsyncOperationStatusDetails(this.stateMessage
                , this.state
                , this.externalId
                , this.metrics
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterAsyncOperationStatusDetails model) {
                this.stateMessage(model.getStateMessage());
    this.state(model.getState());
    this.externalId(model.getExternalId());
    this.metrics(model.getMetrics());
    this.properties(model.getProperties());
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
     * Descriptive message of the current state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

        /**
     * Descriptive message of the current state.
     * @return the value
     **/
    
    public String getStateMessage() {
        return stateMessage;
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
        ;

        

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                    map.put(v.getValue(), v);
                
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
            throw new IllegalArgumentException("Invalid State: " + key);
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
     * External work-request-id if applicable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

        /**
     * External work-request-id if applicable.
     * @return the value
     **/
    
    public String getExternalId() {
        return externalId;
    }


        /**
     * Metrics for the cluster operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.Map<String, String> metrics;

        /**
     * Metrics for the cluster operation.
     * @return the value
     **/
    
    public java.util.Map<String, String> getMetrics() {
        return metrics;
    }


        /**
     * Properties of operation on cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * Properties of operation on cluster.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
        return properties;
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
        sb.append("UpdateClusterAsyncOperationStatusDetails(");
        sb.append("stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateClusterAsyncOperationStatusDetails)) {
            return false;
        }

        UpdateClusterAsyncOperationStatusDetails other = (UpdateClusterAsyncOperationStatusDetails) o;
        return java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
