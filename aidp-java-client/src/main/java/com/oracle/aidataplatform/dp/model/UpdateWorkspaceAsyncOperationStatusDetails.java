package com.oracle.aidataplatform.dp.model;



/**
 * The data to update workspace async operation status.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateWorkspaceAsyncOperationStatusDetails.Builder.class)

public final class UpdateWorkspaceAsyncOperationStatusDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"stateMessage", "state", "externalId", "properties"})
    public UpdateWorkspaceAsyncOperationStatusDetails(String stateMessage, State state, String externalId, java.util.Map<String, Object> properties) {
        super();
        this.stateMessage = stateMessage;
        this.state = state;
        this.externalId = externalId;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A descriptive message of the current state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
private String stateMessage;

        /**
         * A descriptive message of the current state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        

public Builder stateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
}
            /**
     * Common lifecycle states for resources in a Compute Cluster:
* NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
* NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
* NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
* NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

        /**
         * Common lifecycle states for resources in a Compute Cluster:
* NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
* NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
* NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
* NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.
* 
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * The external work-request-id if applicable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalId")
private String externalId;

        /**
         * The external work-request-id if applicable.
         * @param externalId the value to set
         * @return this builder
         **/
        

public Builder externalId(String externalId) {
    this.externalId = externalId;
    return this;
}
            /**
     * The properties of operation on workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, Object> properties;

        /**
         * The properties of operation on workspace.
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, Object> properties) {
    this.properties = properties;
    return this;
}


        public UpdateWorkspaceAsyncOperationStatusDetails build() {
            UpdateWorkspaceAsyncOperationStatusDetails model = new UpdateWorkspaceAsyncOperationStatusDetails(this.stateMessage
                , this.state
                , this.externalId
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWorkspaceAsyncOperationStatusDetails model) {
                this.stateMessage(model.getStateMessage());
    this.state(model.getState());
    this.externalId(model.getExternalId());
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
     * A descriptive message of the current state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

        /**
     * A descriptive message of the current state.
     * @return the value
     **/
    
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * Common lifecycle states for resources in a Compute Cluster:
* NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
* NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
* NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
* NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.
* 
     **/
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        NetworkConfigurationCreated("NETWORK_CONFIGURATION_CREATED"),
        NetworkConfigurationUpdated("NETWORK_CONFIGURATION_UPDATED"),
        NetworkConfigurationDeleted("NETWORK_CONFIGURATION_DELETED"),
        NetworkConfigurationFailed("NETWORK_CONFIGURATION_FAILED"),
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
     * Common lifecycle states for resources in a Compute Cluster:
* NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
* NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
* NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
* NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * Common lifecycle states for resources in a Compute Cluster:
* NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
* NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
* NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
* NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.
* 
     * @return the value
     **/
    
    public State getState() {
        return state;
    }


        /**
     * The external work-request-id if applicable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

        /**
     * The external work-request-id if applicable.
     * @return the value
     **/
    
    public String getExternalId() {
        return externalId;
    }


        /**
     * The properties of operation on workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * The properties of operation on workspace.
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
        sb.append("UpdateWorkspaceAsyncOperationStatusDetails(");
        sb.append("stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateWorkspaceAsyncOperationStatusDetails)) {
            return false;
        }

        UpdateWorkspaceAsyncOperationStatusDetails other = (UpdateWorkspaceAsyncOperationStatusDetails) o;
        return java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
