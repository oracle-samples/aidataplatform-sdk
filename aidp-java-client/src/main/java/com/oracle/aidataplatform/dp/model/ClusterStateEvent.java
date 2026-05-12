package com.oracle.aidataplatform.dp.model;



/**
 * The information about the cluster state event. Workflow will use it to obtain the terminal state.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterStateEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class ClusterStateEvent extends ClusterEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * State of cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

        /**
         * State of cluster.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}


        public ClusterStateEvent build() {
            ClusterStateEvent model = new ClusterStateEvent(this.state);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterStateEvent model) {
                this.state(model.getState());
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
    public ClusterStateEvent(State state) {
    super();
        this.state = state;
    }

    /**
     * State of cluster.
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
     * State of cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * State of cluster.
     * @return the value
     **/
    
    public State getState() {
        return state;
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
        sb.append("ClusterStateEvent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterStateEvent)) {
            return false;
        }

        ClusterStateEvent other = (ClusterStateEvent) o;
        return java.util.Objects.equals(this.state, other.state) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        return result;
    }


}
