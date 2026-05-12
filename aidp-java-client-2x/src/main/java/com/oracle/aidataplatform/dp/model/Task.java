package com.oracle.aidataplatform.dp.model;


/**
 * Properties of a task provided by the user.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=Task.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = IfElseTask.class, name = "IF_ELSE_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JobTask.class, name = "JOB_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JarTask.class, name = "JAR_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PythonTask.class, name = "PYTHON_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = NotebookTask.class, name = "NOTEBOOK_TASK")
})

public class Task  {
    @Deprecated
    @java.beans.ConstructorProperties({"taskKey", "dependsOn", "runIf", "maxRetries", "minRetryIntervalMillis", "isRetryOnTimeout"})
    protected Task(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout) {
        super();
        this.taskKey = taskKey;
        this.dependsOn = dependsOn;
        this.runIf = runIf;
        this.maxRetries = maxRetries;
        this.minRetryIntervalMillis = minRetryIntervalMillis;
        this.isRetryOnTimeout = isRetryOnTimeout;
    }




        /**
     * The display name of the task. User can specify a value for this.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    private final String taskKey;

        /**
     * The display name of the task. User can specify a value for this.
     * @return the value
     **/
    
    public String getTaskKey() {
        return taskKey;
    }


        /**
     * Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    private final java.util.List<DependsOn> dependsOn;

        /**
     * Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
     * @return the value
     **/
    
    public java.util.List<DependsOn> getDependsOn() {
        return dependsOn;
    }

    /**
     * The trigger rule based on which the current task execution is determined.
     **/
    public enum RunIf {
        AllSuccess("ALL_SUCCESS"),
        AllDone("ALL_DONE"),
        NoneFailed("NONE_FAILED"),
        AtLeastOneSuccess("AT_LEAST_ONE_SUCCESS"),
        AllFailed("ALL_FAILED"),
        AtLeastOneFailed("AT_LEAST_ONE_FAILED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RunIf.class);

        private final String value;
        private static java.util.Map<String, RunIf> map;

        static {
            map = new java.util.HashMap<>();
            for (RunIf v : RunIf.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RunIf(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RunIf create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'RunIf', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The trigger rule based on which the current task execution is determined.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("runIf")
    private final RunIf runIf;

        /**
     * The trigger rule based on which the current task execution is determined.
     * @return the value
     **/
    
    public RunIf getRunIf() {
        return runIf;
    }


        /**
     * The maximum number of times to retry an unsuccessful run. 
* A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
    private final Integer maxRetries;

        /**
     * The maximum number of times to retry an unsuccessful run. 
* A run is considered to be unsuccessful if it fails with status FAILED or INTERNAL_ERROR. Maximum value is 300.
* 
     * @return the value
     **/
    
    public Integer getMaxRetries() {
        return maxRetries;
    }


        /**
     * An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. 
* If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000)
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minRetryIntervalMillis")
    private final Integer minRetryIntervalMillis;

        /**
     * An optional minimal interval in milliseconds between the start of the failed run and the subsequent retry run. 
* If value is not provided, the run would be immediately retried. Maximum value is 10 mins (600000)
* 
     * @return the value
     **/
    
    public Integer getMinRetryIntervalMillis() {
        return minRetryIntervalMillis;
    }


        /**
     * An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRetryOnTimeout")
    private final Boolean isRetryOnTimeout;

        /**
     * An optional policy to specify whether to retry a task when it times out. The default behavior is to not retry on timeout.
     * @return the value
     **/
    
    public Boolean getIsRetryOnTimeout() {
        return isRetryOnTimeout;
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
        sb.append("Task(");
        sb.append("taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", dependsOn=").append(String.valueOf(this.dependsOn));
        sb.append(", runIf=").append(String.valueOf(this.runIf));
        sb.append(", maxRetries=").append(String.valueOf(this.maxRetries));
        sb.append(", minRetryIntervalMillis=").append(String.valueOf(this.minRetryIntervalMillis));
        sb.append(", isRetryOnTimeout=").append(String.valueOf(this.isRetryOnTimeout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }

        Task other = (Task) o;
        return java.util.Objects.equals(this.taskKey, other.taskKey) &&
            java.util.Objects.equals(this.dependsOn, other.dependsOn) &&
            java.util.Objects.equals(this.runIf, other.runIf) &&
            java.util.Objects.equals(this.maxRetries, other.maxRetries) &&
            java.util.Objects.equals(this.minRetryIntervalMillis, other.minRetryIntervalMillis) &&
            java.util.Objects.equals(this.isRetryOnTimeout, other.isRetryOnTimeout);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.dependsOn == null ? 43 : this.dependsOn.hashCode());
        result = (result * PRIME) + (this.runIf == null ? 43 : this.runIf.hashCode());
        result = (result * PRIME) + (this.maxRetries == null ? 43 : this.maxRetries.hashCode());
        result = (result * PRIME) + (this.minRetryIntervalMillis == null ? 43 : this.minRetryIntervalMillis.hashCode());
        result = (result * PRIME) + (this.isRetryOnTimeout == null ? 43 : this.isRetryOnTimeout.hashCode());
        return result;
    }

    /**
     * The type of the task.
     **/
    public enum Type {
        NotebookTask("NOTEBOOK_TASK"),
        PythonTask("PYTHON_TASK"),
        SparkSubmitTask("SPARK_SUBMIT_TASK"),
        IfElseTask("IF_ELSE_TASK"),
        JobTask("JOB_TASK"),
        JarTask("JAR_TASK"),
        

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
}
