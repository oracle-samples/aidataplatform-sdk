package com.oracle.aidataplatform.dp.model;



/**
 * Notebook kernel information.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Kernel.Builder.class)

public final class Kernel  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "lastActivity", "connections", "executionState"})
    public Kernel(String id, String name, String lastActivity, Integer connections, ExecutionState executionState) {
        super();
        this.id = id;
        this.name = name;
        this.lastActivity = lastActivity;
        this.connections = connections;
        this.executionState = executionState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * UUID of kernel.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * UUID of kernel.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Kernel spec name. (Example python3)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Kernel spec name. (Example python3)
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * ISO 8601 timestamp for last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("last_activity")
private String lastActivity;

        /**
         * ISO 8601 timestamp for last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* 
         * @param lastActivity the value to set
         * @return this builder
         **/
        

public Builder lastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
    return this;
}
            /**
     * The number of active connections to this kernel.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("connections")
private Integer connections;

        /**
         * The number of active connections to this kernel.
* 
         * @param connections the value to set
         * @return this builder
         **/
        

public Builder connections(Integer connections) {
    this.connections = connections;
    return this;
}
            /**
     * Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
* Added in notebook server 5.0.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("execution_state")
private ExecutionState executionState;

        /**
         * Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
* Added in notebook server 5.0.
* 
         * @param executionState the value to set
         * @return this builder
         **/
        

public Builder executionState(ExecutionState executionState) {
    this.executionState = executionState;
    return this;
}


        public Kernel build() {
            Kernel model = new Kernel(this.id
                , this.name
                , this.lastActivity
                , this.connections
                , this.executionState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Kernel model) {
                this.id(model.getId());
    this.name(model.getName());
    this.lastActivity(model.getLastActivity());
    this.connections(model.getConnections());
    this.executionState(model.getExecutionState());
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
     * UUID of kernel.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * UUID of kernel.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Kernel spec name. (Example python3)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Kernel spec name. (Example python3)
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * ISO 8601 timestamp for last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_activity")
    private final String lastActivity;

        /**
     * ISO 8601 timestamp for last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* 
     * @return the value
     **/
    
    public String getLastActivity() {
        return lastActivity;
    }


        /**
     * The number of active connections to this kernel.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("connections")
    private final Integer connections;

        /**
     * The number of active connections to this kernel.
* 
     * @return the value
     **/
    
    public Integer getConnections() {
        return connections;
    }

    /**
     * Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
* Added in notebook server 5.0.
* 
     **/
    public enum ExecutionState implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("unknown"),
        Starting("starting"),
        Idle("idle"),
        Busy("busy"),
        Terminating("terminating"),
        Restarting("restarting"),
        Autorestarting("autorestarting"),
        Dead("dead"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ExecutionState.class);

        private final String value;
        private static java.util.Map<String, ExecutionState> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionState v : ExecutionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'ExecutionState', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
* Added in notebook server 5.0.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("execution_state")
    private final ExecutionState executionState;

        /**
     * Current execution state of Kernel (typically 'idle' or 'busy', but may be other values, such as 'starting').
* Added in notebook server 5.0.
* 
     * @return the value
     **/
    
    public ExecutionState getExecutionState() {
        return executionState;
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
        sb.append("Kernel(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lastActivity=").append(String.valueOf(this.lastActivity));
        sb.append(", connections=").append(String.valueOf(this.connections));
        sb.append(", executionState=").append(String.valueOf(this.executionState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Kernel)) {
            return false;
        }

        Kernel other = (Kernel) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.lastActivity, other.lastActivity) &&
            java.util.Objects.equals(this.connections, other.connections) &&
            java.util.Objects.equals(this.executionState, other.executionState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.lastActivity == null ? 43 : this.lastActivity.hashCode());
        result = (result * PRIME) + (this.connections == null ? 43 : this.connections.hashCode());
        result = (result * PRIME) + (this.executionState == null ? 43 : this.executionState.hashCode());
        return result;
    }


}
