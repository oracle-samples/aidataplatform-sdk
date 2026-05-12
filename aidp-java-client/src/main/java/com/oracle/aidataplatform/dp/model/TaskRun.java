package com.oracle.aidataplatform.dp.model;



/**
 * A description of a task run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TaskRun.Builder.class)

public final class TaskRun  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "taskKey", "jobKey", "jobRunKey", "parentJobRunKey", "rootJobRunKey", "clusterValidationStartTime", "startTime", "endTime", "state", "setupDuration", "executionDuration", "cleanupDuration", "clusterSpec", "task", "version", "retryAttempt", "retries", "outputKey", "externalId", "systemParameters", "parameters", "lifecycleStates"})
    public TaskRun(String key, String name, String taskKey, String jobKey, String jobRunKey, String parentJobRunKey, String rootJobRunKey, Long clusterValidationStartTime, Long startTime, Long endTime, State state, Long setupDuration, Long executionDuration, Long cleanupDuration, ClusterSpec clusterSpec, Task task, Integer version, Integer retryAttempt, java.util.List<TaskRunRetry> retries, String outputKey, String externalId, java.util.Map<String, String> systemParameters, java.util.List<Parameter> parameters, java.util.List<LifecycleState> lifecycleStates) {
        super();
        this.key = key;
        this.name = name;
        this.taskKey = taskKey;
        this.jobKey = jobKey;
        this.jobRunKey = jobRunKey;
        this.parentJobRunKey = parentJobRunKey;
        this.rootJobRunKey = rootJobRunKey;
        this.clusterValidationStartTime = clusterValidationStartTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
        this.setupDuration = setupDuration;
        this.executionDuration = executionDuration;
        this.cleanupDuration = cleanupDuration;
        this.clusterSpec = clusterSpec;
        this.task = task;
        this.version = version;
        this.retryAttempt = retryAttempt;
        this.retries = retries;
        this.outputKey = outputKey;
        this.externalId = externalId;
        this.systemParameters = systemParameters;
        this.parameters = parameters;
        this.lifecycleStates = lifecycleStates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the task run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The OCID of the task run.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * A user-friendly name. Does not have to be unique, and is changeable.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The display name of the task. User can specify a value for this.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("taskKey")
private String taskKey;

        /**
         * The display name of the task. User can specify a value for this.
         * @param taskKey the value to set
         * @return this builder
         **/
        

public Builder taskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobKey")
private String jobKey;

        /**
         * The OCID of the job.
         * @param jobKey the value to set
         * @return this builder
         **/
        

public Builder jobKey(String jobKey) {
    this.jobKey = jobKey;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobRunKey")
private String jobRunKey;

        /**
         * The OCID of the job.
         * @param jobRunKey the value to set
         * @return this builder
         **/
        

public Builder jobRunKey(String jobRunKey) {
    this.jobRunKey = jobRunKey;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentJobRunKey")
private String parentJobRunKey;

        /**
         * The OCID of the job.
         * @param parentJobRunKey the value to set
         * @return this builder
         **/
        

public Builder parentJobRunKey(String parentJobRunKey) {
    this.parentJobRunKey = parentJobRunKey;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rootJobRunKey")
private String rootJobRunKey;

        /**
         * The OCID of the job.
         * @param rootJobRunKey the value to set
         * @return this builder
         **/
        

public Builder rootJobRunKey(String rootJobRunKey) {
    this.rootJobRunKey = rootJobRunKey;
    return this;
}
            /**
     * The time at which the cluster validation started in epoch milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterValidationStartTime")
private Long clusterValidationStartTime;

        /**
         * The time at which the cluster validation started in epoch milliseconds.
         * @param clusterValidationStartTime the value to set
         * @return this builder
         **/
        

public Builder clusterValidationStartTime(Long clusterValidationStartTime) {
    this.clusterValidationStartTime = clusterValidationStartTime;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;



public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * The time (in milliseconds) taken to setup the cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("setupDuration")
private Long setupDuration;

        /**
         * The time (in milliseconds) taken to setup the cluster.
         * @param setupDuration the value to set
         * @return this builder
         **/
        

public Builder setupDuration(Long setupDuration) {
    this.setupDuration = setupDuration;
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
            /**
     * The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cleanupDuration")
private Long cleanupDuration;

        /**
         * The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
         * @param cleanupDuration the value to set
         * @return this builder
         **/
        

public Builder cleanupDuration(Long cleanupDuration) {
    this.cleanupDuration = cleanupDuration;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clusterSpec")
private ClusterSpec clusterSpec;



public Builder clusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("task")
private Task task;



public Builder task(Task task) {
    this.task = task;
    return this;
}
            /**
     * Current version of job run object in repository.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private Integer version;

        /**
         * Current version of job run object in repository.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(Integer version) {
    this.version = version;
    return this;
}
            /**
     * Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
private Integer retryAttempt;

        /**
         * Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
         * @param retryAttempt the value to set
         * @return this builder
         **/
        

public Builder retryAttempt(Integer retryAttempt) {
    this.retryAttempt = retryAttempt;
    return this;
}
            /**
     * List of task retries.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retries")
private java.util.List<TaskRunRetry> retries;

        /**
         * List of task retries.
         * @param retries the value to set
         * @return this builder
         **/
        

public Builder retries(java.util.List<TaskRunRetry> retries) {
    this.retries = retries;
    return this;
}
            /**
     * A unique identifier for the output.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("outputKey")
private String outputKey;

        /**
         * A unique identifier for the output.
         * @param outputKey the value to set
         * @return this builder
         **/
        

public Builder outputKey(String outputKey) {
    this.outputKey = outputKey;
    return this;
}
            /**
     * The external ID of the task execution.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalId")
private String externalId;

        /**
         * The external ID of the task execution.
         * @param externalId the value to set
         * @return this builder
         **/
        

public Builder externalId(String externalId) {
    this.externalId = externalId;
    return this;
}
            /**
     * Map of system parameters with their values for this job run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("systemParameters")
private java.util.Map<String, String> systemParameters;

        /**
         * Map of system parameters with their values for this job run.
         * @param systemParameters the value to set
         * @return this builder
         **/
        

public Builder systemParameters(java.util.Map<String, String> systemParameters) {
    this.systemParameters = systemParameters;
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


        public TaskRun build() {
            TaskRun model = new TaskRun(this.key
                , this.name
                , this.taskKey
                , this.jobKey
                , this.jobRunKey
                , this.parentJobRunKey
                , this.rootJobRunKey
                , this.clusterValidationStartTime
                , this.startTime
                , this.endTime
                , this.state
                , this.setupDuration
                , this.executionDuration
                , this.cleanupDuration
                , this.clusterSpec
                , this.task
                , this.version
                , this.retryAttempt
                , this.retries
                , this.outputKey
                , this.externalId
                , this.systemParameters
                , this.parameters
                , this.lifecycleStates);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRun model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.taskKey(model.getTaskKey());
    this.jobKey(model.getJobKey());
    this.jobRunKey(model.getJobRunKey());
    this.parentJobRunKey(model.getParentJobRunKey());
    this.rootJobRunKey(model.getRootJobRunKey());
    this.clusterValidationStartTime(model.getClusterValidationStartTime());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.state(model.getState());
    this.setupDuration(model.getSetupDuration());
    this.executionDuration(model.getExecutionDuration());
    this.cleanupDuration(model.getCleanupDuration());
    this.clusterSpec(model.getClusterSpec());
    this.task(model.getTask());
    this.version(model.getVersion());
    this.retryAttempt(model.getRetryAttempt());
    this.retries(model.getRetries());
    this.outputKey(model.getOutputKey());
    this.externalId(model.getExternalId());
    this.systemParameters(model.getSystemParameters());
    this.parameters(model.getParameters());
    this.lifecycleStates(model.getLifecycleStates());
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
     * The OCID of the task run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The OCID of the task run.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     * @return the value
     **/
    
    public String getName() {
        return name;
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
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    private final String jobKey;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getJobKey() {
        return jobKey;
    }


        /**
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobRunKey")
    private final String jobRunKey;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getJobRunKey() {
        return jobRunKey;
    }


        /**
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentJobRunKey")
    private final String parentJobRunKey;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getParentJobRunKey() {
        return parentJobRunKey;
    }


        /**
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rootJobRunKey")
    private final String rootJobRunKey;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getRootJobRunKey() {
        return rootJobRunKey;
    }


        /**
     * The time at which the cluster validation started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterValidationStartTime")
    private final Long clusterValidationStartTime;

        /**
     * The time at which the cluster validation started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getClusterValidationStartTime() {
        return clusterValidationStartTime;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    
    public State getState() {
        return state;
    }


        /**
     * The time (in milliseconds) taken to setup the cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("setupDuration")
    private final Long setupDuration;

        /**
     * The time (in milliseconds) taken to setup the cluster.
     * @return the value
     **/
    
    public Long getSetupDuration() {
        return setupDuration;
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


        /**
     * The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cleanupDuration")
    private final Long cleanupDuration;

        /**
     * The time (in milliseconds) taken to terminate the cluster and to clean up any associated artifacts.
     * @return the value
     **/
    
    public Long getCleanupDuration() {
        return cleanupDuration;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSpec")
    private final ClusterSpec clusterSpec;

    
    public ClusterSpec getClusterSpec() {
        return clusterSpec;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("task")
    private final Task task;

    
    public Task getTask() {
        return task;
    }


        /**
     * Current version of job run object in repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

        /**
     * Current version of job run object in repository.
     * @return the value
     **/
    
    public Integer getVersion() {
        return version;
    }


        /**
     * Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
    private final Integer retryAttempt;

        /**
     * Sequence number of the current retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     * @return the value
     **/
    
    public Integer getRetryAttempt() {
        return retryAttempt;
    }


        /**
     * List of task retries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    private final java.util.List<TaskRunRetry> retries;

        /**
     * List of task retries.
     * @return the value
     **/
    
    public java.util.List<TaskRunRetry> getRetries() {
        return retries;
    }


        /**
     * A unique identifier for the output.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outputKey")
    private final String outputKey;

        /**
     * A unique identifier for the output.
     * @return the value
     **/
    
    public String getOutputKey() {
        return outputKey;
    }


        /**
     * The external ID of the task execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

        /**
     * The external ID of the task execution.
     * @return the value
     **/
    
    public String getExternalId() {
        return externalId;
    }


        /**
     * Map of system parameters with their values for this job run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemParameters")
    private final java.util.Map<String, String> systemParameters;

        /**
     * Map of system parameters with their values for this job run.
     * @return the value
     **/
    
    public java.util.Map<String, String> getSystemParameters() {
        return systemParameters;
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
        sb.append("TaskRun(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobRunKey=").append(String.valueOf(this.jobRunKey));
        sb.append(", parentJobRunKey=").append(String.valueOf(this.parentJobRunKey));
        sb.append(", rootJobRunKey=").append(String.valueOf(this.rootJobRunKey));
        sb.append(", clusterValidationStartTime=").append(String.valueOf(this.clusterValidationStartTime));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", setupDuration=").append(String.valueOf(this.setupDuration));
        sb.append(", executionDuration=").append(String.valueOf(this.executionDuration));
        sb.append(", cleanupDuration=").append(String.valueOf(this.cleanupDuration));
        sb.append(", clusterSpec=").append(String.valueOf(this.clusterSpec));
        sb.append(", task=").append(String.valueOf(this.task));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", retryAttempt=").append(String.valueOf(this.retryAttempt));
        sb.append(", retries=").append(String.valueOf(this.retries));
        sb.append(", outputKey=").append(String.valueOf(this.outputKey));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", systemParameters=").append(String.valueOf(this.systemParameters));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", lifecycleStates=").append(String.valueOf(this.lifecycleStates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRun)) {
            return false;
        }

        TaskRun other = (TaskRun) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.taskKey, other.taskKey) &&
            java.util.Objects.equals(this.jobKey, other.jobKey) &&
            java.util.Objects.equals(this.jobRunKey, other.jobRunKey) &&
            java.util.Objects.equals(this.parentJobRunKey, other.parentJobRunKey) &&
            java.util.Objects.equals(this.rootJobRunKey, other.rootJobRunKey) &&
            java.util.Objects.equals(this.clusterValidationStartTime, other.clusterValidationStartTime) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.setupDuration, other.setupDuration) &&
            java.util.Objects.equals(this.executionDuration, other.executionDuration) &&
            java.util.Objects.equals(this.cleanupDuration, other.cleanupDuration) &&
            java.util.Objects.equals(this.clusterSpec, other.clusterSpec) &&
            java.util.Objects.equals(this.task, other.task) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.retryAttempt, other.retryAttempt) &&
            java.util.Objects.equals(this.retries, other.retries) &&
            java.util.Objects.equals(this.outputKey, other.outputKey) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.systemParameters, other.systemParameters) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.lifecycleStates, other.lifecycleStates);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.jobRunKey == null ? 43 : this.jobRunKey.hashCode());
        result = (result * PRIME) + (this.parentJobRunKey == null ? 43 : this.parentJobRunKey.hashCode());
        result = (result * PRIME) + (this.rootJobRunKey == null ? 43 : this.rootJobRunKey.hashCode());
        result = (result * PRIME) + (this.clusterValidationStartTime == null ? 43 : this.clusterValidationStartTime.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.setupDuration == null ? 43 : this.setupDuration.hashCode());
        result = (result * PRIME) + (this.executionDuration == null ? 43 : this.executionDuration.hashCode());
        result = (result * PRIME) + (this.cleanupDuration == null ? 43 : this.cleanupDuration.hashCode());
        result = (result * PRIME) + (this.clusterSpec == null ? 43 : this.clusterSpec.hashCode());
        result = (result * PRIME) + (this.task == null ? 43 : this.task.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.retryAttempt == null ? 43 : this.retryAttempt.hashCode());
        result = (result * PRIME) + (this.retries == null ? 43 : this.retries.hashCode());
        result = (result * PRIME) + (this.outputKey == null ? 43 : this.outputKey.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.systemParameters == null ? 43 : this.systemParameters.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.lifecycleStates == null ? 43 : this.lifecycleStates.hashCode());
        return result;
    }


}
