// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

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
     * Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("source")
private Source source;

        /**
         * Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario
         * @param source the value to set
         * @return this builder
         **/
        

public Builder source(Source source) {
    this.source = source;
    return this;
}
            /**
     * In case of a failed state, this will capture the reason for error.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
private String stateMessage;

        /**
         * In case of a failed state, this will capture the reason for error.
         * @param stateMessage the value to set
         * @return this builder
         **/
        

public Builder stateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
}


        public ClusterStateEvent build() {
            ClusterStateEvent model = new ClusterStateEvent(this.state
                , this.phase
                , this.source
                , this.stateMessage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterStateEvent model) {
                this.state(model.getState());
    this.phase(model.getPhase());
    this.source(model.getSource());
    this.stateMessage(model.getStateMessage());
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
    public ClusterStateEvent(State state, Phase phase, Source source, String stateMessage) {
    super();
        this.state = state;
        this.phase = phase;
        this.source = source;
        this.stateMessage = stateMessage;
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

    /**
     * Phase
     **/
    public enum Phase implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario
     **/
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        User("USER"),
        System("SYSTEM"),
        ;

        

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
        /**
     * Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

        /**
     * Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario
     * @return the value
     **/
    
    public Source getSource() {
        return source;
    }


        /**
     * In case of a failed state, this will capture the reason for error.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

        /**
     * In case of a failed state, this will capture the reason for error.
     * @return the value
     **/
    
    public String getStateMessage() {
        return stateMessage;
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
        sb.append(", phase=").append(String.valueOf(this.phase));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
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
            java.util.Objects.equals(this.phase, other.phase) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.phase == null ? 43 : this.phase.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        return result;
    }


}
