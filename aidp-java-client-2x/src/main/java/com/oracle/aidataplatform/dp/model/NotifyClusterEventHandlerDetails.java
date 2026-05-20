// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Notifier API during cluster patching.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NotifyClusterEventHandlerDetails.Builder.class)

public final class NotifyClusterEventHandlerDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterName", "phase", "state", "clusterEvent"})
    public NotifyClusterEventHandlerDetails(String clusterName, Phase phase, State state, ClusterEvent clusterEvent) {
        super();
        this.clusterName = clusterName;
        this.phase = phase;
        this.state = state;
        this.clusterEvent = clusterEvent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A unique name for the job cluster.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

                /**
         * A unique name for the job cluster.
         * @param clusterName the value to set
         * @return this builder
         **/
        

        public Builder clusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
        }
            /**
     * Phase
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("phase")
        private Phase phase;

                /**
         * Phase
         * @param phase the value to set
         * @return this builder
         **/
        

        public Builder phase(Phase phase) {
        this.phase = phase;
        return this;
        }
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("clusterEvent")
        private ClusterEvent clusterEvent;

        

        public Builder clusterEvent(ClusterEvent clusterEvent) {
        this.clusterEvent = clusterEvent;
        return this;
        }


        public NotifyClusterEventHandlerDetails build() {
            NotifyClusterEventHandlerDetails model = new NotifyClusterEventHandlerDetails(this.clusterName
                    , this.phase
                    , this.state
                    , this.clusterEvent);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotifyClusterEventHandlerDetails model) {
                this.clusterName(model.getClusterName());
    this.phase(model.getPhase());
    this.state(model.getState());
    this.clusterEvent(model.getClusterEvent());
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
     * A unique name for the job cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

        /**
     * A unique name for the job cluster.
     * @return the value
     **/
    
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Phase
     **/
    public enum Phase {
        Started("STARTED"),
        Completed("COMPLETED"),
        ;

        

        private final String value;
        private static java.util.Map<String, Phase> map;

        static {
            map = new java.util.HashMap<>();
            for (Phase v : Phase.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Phase(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Phase create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Phase: " + key);
        }
    };
        /**
     * Phase
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    private final Phase phase;

        /**
     * Phase
     * @return the value
     **/
    
    public Phase getPhase() {
        return phase;
    }

    /**
     * State of cluster.
     **/
    public enum State {
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterEvent")
    private final ClusterEvent clusterEvent;

    
    public ClusterEvent getClusterEvent() {
        return clusterEvent;
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
        sb.append("NotifyClusterEventHandlerDetails(");
        sb.append("clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", phase=").append(String.valueOf(this.phase));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", clusterEvent=").append(String.valueOf(this.clusterEvent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotifyClusterEventHandlerDetails)) {
            return false;
        }

        NotifyClusterEventHandlerDetails other = (NotifyClusterEventHandlerDetails) o;
        return java.util.Objects.equals(this.clusterName, other.clusterName) &&
            java.util.Objects.equals(this.phase, other.phase) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.clusterEvent, other.clusterEvent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result = (result * PRIME) + (this.phase == null ? 43 : this.phase.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.clusterEvent == null ? 43 : this.clusterEvent.hashCode());
        return result;
    }


}
