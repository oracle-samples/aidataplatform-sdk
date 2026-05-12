package com.oracle.aidataplatform.dp.model;


/**
 * A description of a repaired job run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RepairHistory.Builder.class)

public final class RepairHistory  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "key", "state", "startTime", "endTime", "taskToTaskRunMap", "parameters", "repairedTasks", "lifecycleStates", "executionDuration"})
    public RepairHistory(Type type, Integer key, State state, Long startTime, Long endTime, java.util.Map<String, String> taskToTaskRunMap, java.util.List<Parameter> parameters, java.util.List<String> repairedTasks, java.util.List<LifecycleState> lifecycleStates, Long executionDuration) {
        super();
        this.type = type;
        this.key = key;
        this.state = state;
        this.startTime = startTime;
        this.endTime = endTime;
        this.taskToTaskRunMap = taskToTaskRunMap;
        this.parameters = parameters;
        this.repairedTasks = repairedTasks;
        this.lifecycleStates = lifecycleStates;
        this.executionDuration = executionDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Indicates whether the job run is Original or Repaired.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

                /**
         * Indicates whether the job run is Original or Repaired.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Type type) {
        this.type = type;
        return this;
        }
            /**
     * The unique ID of the Repair run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private Integer key;

                /**
         * The unique ID of the Repair run.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(Integer key) {
        this.key = key;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        

        public Builder state(State state) {
        this.state = state;
        return this;
        }
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private Long startTime;

                /**
         * The time at which the job execution started in epoch milliseconds.
         * @param startTime the value to set
         * @return this builder
         **/
        

        public Builder startTime(Long startTime) {
        this.startTime = startTime;
        return this;
        }
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private Long endTime;

                /**
         * The time at which the job execution started in epoch milliseconds.
         * @param endTime the value to set
         * @return this builder
         **/
        

        public Builder endTime(Long endTime) {
        this.endTime = endTime;
        return this;
        }
            /**
     * Task to TaskRun map for given job run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("taskToTaskRunMap")
        private java.util.Map<String, String> taskToTaskRunMap;

                /**
         * Task to TaskRun map for given job run.
         * @param taskToTaskRunMap the value to set
         * @return this builder
         **/
        

        public Builder taskToTaskRunMap(java.util.Map<String, String> taskToTaskRunMap) {
        this.taskToTaskRunMap = taskToTaskRunMap;
        return this;
        }
            /**
     * An optional list of parameters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

                /**
         * An optional list of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
        

        public Builder parameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
        }
            /**
     * A list of repaired tasks.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("repairedTasks")
        private java.util.List<String> repairedTasks;

                /**
         * A list of repaired tasks.
         * @param repairedTasks the value to set
         * @return this builder
         **/
        

        public Builder repairedTasks(java.util.List<String> repairedTasks) {
        this.repairedTasks = repairedTasks;
        return this;
        }
            /**
     * The collection of lifecycle states.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStates")
        private java.util.List<LifecycleState> lifecycleStates;

                /**
         * The collection of lifecycle states.
         * @param lifecycleStates the value to set
         * @return this builder
         **/
        

        public Builder lifecycleStates(java.util.List<LifecycleState> lifecycleStates) {
        this.lifecycleStates = lifecycleStates;
        return this;
        }
            /**
     * The time (in milliseconds) taken to complete the job execution.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("executionDuration")
        private Long executionDuration;

                /**
         * The time (in milliseconds) taken to complete the job execution.
         * @param executionDuration the value to set
         * @return this builder
         **/
        

        public Builder executionDuration(Long executionDuration) {
        this.executionDuration = executionDuration;
        return this;
        }


        public RepairHistory build() {
            RepairHistory model = new RepairHistory(this.type
                    , this.key
                    , this.state
                    , this.startTime
                    , this.endTime
                    , this.taskToTaskRunMap
                    , this.parameters
                    , this.repairedTasks
                    , this.lifecycleStates
                    , this.executionDuration);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepairHistory model) {
                this.type(model.getType());
    this.key(model.getKey());
    this.state(model.getState());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.taskToTaskRunMap(model.getTaskToTaskRunMap());
    this.parameters(model.getParameters());
    this.repairedTasks(model.getRepairedTasks());
    this.lifecycleStates(model.getLifecycleStates());
    this.executionDuration(model.getExecutionDuration());
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
     * Indicates whether the job run is Original or Repaired.
     **/
    public enum Type {
        Original("ORIGINAL"),
        Repair("REPAIR"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Indicates whether the job run is Original or Repaired.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Indicates whether the job run is Original or Repaired.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * The unique ID of the Repair run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final Integer key;

        /**
     * The unique ID of the Repair run.
     * @return the value
     **/
    
    public Integer getKey() {
        return key;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    
    public State getState() {
        return state;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Long startTime;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getStartTime() {
        return startTime;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final Long endTime;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * Task to TaskRun map for given job run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskToTaskRunMap")
    private final java.util.Map<String, String> taskToTaskRunMap;

        /**
     * Task to TaskRun map for given job run.
     * @return the value
     **/
    
    public java.util.Map<String, String> getTaskToTaskRunMap() {
        return taskToTaskRunMap;
    }


        /**
     * An optional list of parameters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

        /**
     * An optional list of parameters.
     * @return the value
     **/
    
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }


        /**
     * A list of repaired tasks.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repairedTasks")
    private final java.util.List<String> repairedTasks;

        /**
     * A list of repaired tasks.
     * @return the value
     **/
    
    public java.util.List<String> getRepairedTasks() {
        return repairedTasks;
    }


        /**
     * The collection of lifecycle states.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStates")
    private final java.util.List<LifecycleState> lifecycleStates;

        /**
     * The collection of lifecycle states.
     * @return the value
     **/
    
    public java.util.List<LifecycleState> getLifecycleStates() {
        return lifecycleStates;
    }


        /**
     * The time (in milliseconds) taken to complete the job execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("executionDuration")
    private final Long executionDuration;

        /**
     * The time (in milliseconds) taken to complete the job execution.
     * @return the value
     **/
    
    public Long getExecutionDuration() {
        return executionDuration;
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
        sb.append("RepairHistory(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", taskToTaskRunMap=").append(String.valueOf(this.taskToTaskRunMap));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", repairedTasks=").append(String.valueOf(this.repairedTasks));
        sb.append(", lifecycleStates=").append(String.valueOf(this.lifecycleStates));
        sb.append(", executionDuration=").append(String.valueOf(this.executionDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepairHistory)) {
            return false;
        }

        RepairHistory other = (RepairHistory) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.taskToTaskRunMap, other.taskToTaskRunMap) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.repairedTasks, other.repairedTasks) &&
            java.util.Objects.equals(this.lifecycleStates, other.lifecycleStates) &&
            java.util.Objects.equals(this.executionDuration, other.executionDuration);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.taskToTaskRunMap == null ? 43 : this.taskToTaskRunMap.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.repairedTasks == null ? 43 : this.repairedTasks.hashCode());
        result = (result * PRIME) + (this.lifecycleStates == null ? 43 : this.lifecycleStates.hashCode());
        result = (result * PRIME) + (this.executionDuration == null ? 43 : this.executionDuration.hashCode());
        return result;
    }


}
