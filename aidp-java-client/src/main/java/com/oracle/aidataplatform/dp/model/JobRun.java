// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Description of a job run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobRun.Builder.class)

public final class JobRun  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "jobKey", "jobName", "parentJobRunKey", "rootJobRunKey", "parentTaskRunKey", "tasks", "createdBy", "createdByName", "maxConcurrentRuns", "gitConfig", "queue", "originalAttemptRunId", "state", "schedule", "clusterSpec", "clusterInstance", "parameters", "unifiedJobAndJobRunParameters", "repairHistory", "systemParameters", "startTime", "endTime", "setupDuration", "executionDuration", "cleanupDuration", "runDuration", "timeCreated", "timeUpdated", "launched", "version", "taskToTaskRunMap", "taskRunSummaryMap", "timeoutSeconds", "repairedTasks", "repairMode", "lifecycleStates"})
    public JobRun(String key, String name, String jobKey, String jobName, String parentJobRunKey, String rootJobRunKey, String parentTaskRunKey, java.util.List<Task> tasks, String createdBy, String createdByName, Integer maxConcurrentRuns, GitConfig gitConfig, Queue queue, String originalAttemptRunId, State state, Schedule schedule, ClusterSpec clusterSpec, ClusterInstance clusterInstance, java.util.List<Parameter> parameters, java.util.List<Parameter> unifiedJobAndJobRunParameters, java.util.List<RepairHistory> repairHistory, java.util.Map<String, String> systemParameters, Long startTime, Long endTime, Long setupDuration, Long executionDuration, Long cleanupDuration, Long runDuration, java.util.Date timeCreated, java.util.Date timeUpdated, Launched launched, Integer version, java.util.Map<String, String> taskToTaskRunMap, java.util.Map<String, Object> taskRunSummaryMap, Integer timeoutSeconds, java.util.List<String> repairedTasks, RepairMode repairMode, java.util.List<LifecycleState> lifecycleStates) {
        super();
        this.key = key;
        this.name = name;
        this.jobKey = jobKey;
        this.jobName = jobName;
        this.parentJobRunKey = parentJobRunKey;
        this.rootJobRunKey = rootJobRunKey;
        this.parentTaskRunKey = parentTaskRunKey;
        this.tasks = tasks;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.maxConcurrentRuns = maxConcurrentRuns;
        this.gitConfig = gitConfig;
        this.queue = queue;
        this.originalAttemptRunId = originalAttemptRunId;
        this.state = state;
        this.schedule = schedule;
        this.clusterSpec = clusterSpec;
        this.clusterInstance = clusterInstance;
        this.parameters = parameters;
        this.unifiedJobAndJobRunParameters = unifiedJobAndJobRunParameters;
        this.repairHistory = repairHistory;
        this.systemParameters = systemParameters;
        this.startTime = startTime;
        this.endTime = endTime;
        this.setupDuration = setupDuration;
        this.executionDuration = executionDuration;
        this.cleanupDuration = cleanupDuration;
        this.runDuration = runDuration;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.launched = launched;
        this.version = version;
        this.taskToTaskRunMap = taskToTaskRunMap;
        this.taskRunSummaryMap = taskRunSummaryMap;
        this.timeoutSeconds = timeoutSeconds;
        this.repairedTasks = repairedTasks;
        this.repairMode = repairMode;
        this.lifecycleStates = lifecycleStates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The OCID of the job.
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
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobName")
private String jobName;

        /**
         * A user-friendly name. Does not have to be unique, and is changeable.
         * @param jobName the value to set
         * @return this builder
         **/
        

public Builder jobName(String jobName) {
    this.jobName = jobName;
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
     * The OCID of the task run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentTaskRunKey")
private String parentTaskRunKey;

        /**
         * The OCID of the task run.
         * @param parentTaskRunKey the value to set
         * @return this builder
         **/
        

public Builder parentTaskRunKey(String parentTaskRunKey) {
    this.parentTaskRunKey = parentTaskRunKey;
    return this;
}
            /**
     * List of tasks in a job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tasks")
private java.util.List<Task> tasks;

        /**
         * List of tasks in a job.
         * @param tasks the value to set
         * @return this builder
         **/
        

public Builder tasks(java.util.List<Task> tasks) {
    this.tasks = tasks;
    return this;
}
            /**
     * The OCID of the IAM user.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The OCID of the IAM user.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this record
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}
            /**
     * Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentRuns")
private Integer maxConcurrentRuns;

        /**
         * Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
         * @param maxConcurrentRuns the value to set
         * @return this builder
         **/
        

public Builder maxConcurrentRuns(Integer maxConcurrentRuns) {
    this.maxConcurrentRuns = maxConcurrentRuns;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("gitConfig")
private GitConfig gitConfig;



public Builder gitConfig(GitConfig gitConfig) {
    this.gitConfig = gitConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("queue")
private Queue queue;



public Builder queue(Queue queue) {
    this.queue = queue;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("originalAttemptRunId")
private String originalAttemptRunId;

        /**
         * The OCID of the job.
         * @param originalAttemptRunId the value to set
         * @return this builder
         **/
        

public Builder originalAttemptRunId(String originalAttemptRunId) {
    this.originalAttemptRunId = originalAttemptRunId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;



public Builder state(State state) {
    this.state = state;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("schedule")
private Schedule schedule;



public Builder schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clusterSpec")
private ClusterSpec clusterSpec;



public Builder clusterSpec(ClusterSpec clusterSpec) {
    this.clusterSpec = clusterSpec;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clusterInstance")
private ClusterInstance clusterInstance;



public Builder clusterInstance(ClusterInstance clusterInstance) {
    this.clusterInstance = clusterInstance;
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
     * Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("unifiedJobAndJobRunParameters")
private java.util.List<Parameter> unifiedJobAndJobRunParameters;

        /**
         * Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
         * @param unifiedJobAndJobRunParameters the value to set
         * @return this builder
         **/
        

public Builder unifiedJobAndJobRunParameters(java.util.List<Parameter> unifiedJobAndJobRunParameters) {
    this.unifiedJobAndJobRunParameters = unifiedJobAndJobRunParameters;
    return this;
}
            /**
     * Array of repaired runs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repairHistory")
private java.util.List<RepairHistory> repairHistory;

        /**
         * Array of repaired runs.
         * @param repairHistory the value to set
         * @return this builder
         **/
        

public Builder repairHistory(java.util.List<RepairHistory> repairHistory) {
    this.repairHistory = repairHistory;
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
            /**
     * The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("runDuration")
private Long runDuration;

        /**
         * The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
         * @param runDuration the value to set
         * @return this builder
         **/
        

public Builder runDuration(Long runDuration) {
    this.runDuration = runDuration;
    return this;
}
            /**
     * The time at which the job execution started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The time at which the job execution started.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The time at which the job execution was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The time at which the job execution was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * Identify job run launched by schedule or manually.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("launched")
private Launched launched;

        /**
         * Identify job run launched by schedule or manually.
         * @param launched the value to set
         * @return this builder
         **/
        

public Builder launched(Launched launched) {
    this.launched = launched;
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
     * TaskRun to TaskRunSummary map for given job run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("taskRunSummaryMap")
private java.util.Map<String, Object> taskRunSummaryMap;

        /**
         * TaskRun to TaskRunSummary map for given job run.
         * @param taskRunSummaryMap the value to set
         * @return this builder
         **/
        

public Builder taskRunSummaryMap(java.util.Map<String, Object> taskRunSummaryMap) {
    this.taskRunSummaryMap = taskRunSummaryMap;
    return this;
}
            /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
private Integer timeoutSeconds;

        /**
         * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
         * @param timeoutSeconds the value to set
         * @return this builder
         **/
        

public Builder timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
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
     * Repair mode to be used for this repair scope.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repairMode")
private RepairMode repairMode;

        /**
         * Repair mode to be used for this repair scope.
         * @param repairMode the value to set
         * @return this builder
         **/
        

public Builder repairMode(RepairMode repairMode) {
    this.repairMode = repairMode;
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


        public JobRun build() {
            JobRun model = new JobRun(this.key
                , this.name
                , this.jobKey
                , this.jobName
                , this.parentJobRunKey
                , this.rootJobRunKey
                , this.parentTaskRunKey
                , this.tasks
                , this.createdBy
                , this.createdByName
                , this.maxConcurrentRuns
                , this.gitConfig
                , this.queue
                , this.originalAttemptRunId
                , this.state
                , this.schedule
                , this.clusterSpec
                , this.clusterInstance
                , this.parameters
                , this.unifiedJobAndJobRunParameters
                , this.repairHistory
                , this.systemParameters
                , this.startTime
                , this.endTime
                , this.setupDuration
                , this.executionDuration
                , this.cleanupDuration
                , this.runDuration
                , this.timeCreated
                , this.timeUpdated
                , this.launched
                , this.version
                , this.taskToTaskRunMap
                , this.taskRunSummaryMap
                , this.timeoutSeconds
                , this.repairedTasks
                , this.repairMode
                , this.lifecycleStates);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRun model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.jobKey(model.getJobKey());
    this.jobName(model.getJobName());
    this.parentJobRunKey(model.getParentJobRunKey());
    this.rootJobRunKey(model.getRootJobRunKey());
    this.parentTaskRunKey(model.getParentTaskRunKey());
    this.tasks(model.getTasks());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.maxConcurrentRuns(model.getMaxConcurrentRuns());
    this.gitConfig(model.getGitConfig());
    this.queue(model.getQueue());
    this.originalAttemptRunId(model.getOriginalAttemptRunId());
    this.state(model.getState());
    this.schedule(model.getSchedule());
    this.clusterSpec(model.getClusterSpec());
    this.clusterInstance(model.getClusterInstance());
    this.parameters(model.getParameters());
    this.unifiedJobAndJobRunParameters(model.getUnifiedJobAndJobRunParameters());
    this.repairHistory(model.getRepairHistory());
    this.systemParameters(model.getSystemParameters());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.setupDuration(model.getSetupDuration());
    this.executionDuration(model.getExecutionDuration());
    this.cleanupDuration(model.getCleanupDuration());
    this.runDuration(model.getRunDuration());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.launched(model.getLaunched());
    this.version(model.getVersion());
    this.taskToTaskRunMap(model.getTaskToTaskRunMap());
    this.taskRunSummaryMap(model.getTaskRunSummaryMap());
    this.timeoutSeconds(model.getTimeoutSeconds());
    this.repairedTasks(model.getRepairedTasks());
    this.repairMode(model.getRepairMode());
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
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The OCID of the job.
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
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     * @return the value
     **/
    
    public String getJobName() {
        return jobName;
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
     * The OCID of the task run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentTaskRunKey")
    private final String parentTaskRunKey;

        /**
     * The OCID of the task run.
     * @return the value
     **/
    
    public String getParentTaskRunKey() {
        return parentTaskRunKey;
    }


        /**
     * List of tasks in a job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<Task> tasks;

        /**
     * List of tasks in a job.
     * @return the value
     **/
    
    public java.util.List<Task> getTasks() {
        return tasks;
    }


        /**
     * The OCID of the IAM user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the IAM user.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentRuns")
    private final Integer maxConcurrentRuns;

        /**
     * Indicates the number of executions for the same job that can be run concurrently. The maximum value cannot exceed 1000.
     * @return the value
     **/
    
    public Integer getMaxConcurrentRuns() {
        return maxConcurrentRuns;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("gitConfig")
    private final GitConfig gitConfig;

    
    public GitConfig getGitConfig() {
        return gitConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("queue")
    private final Queue queue;

    
    public Queue getQueue() {
        return queue;
    }


        /**
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("originalAttemptRunId")
    private final String originalAttemptRunId;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getOriginalAttemptRunId() {
        return originalAttemptRunId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    
    public State getState() {
        return state;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final Schedule schedule;

    
    public Schedule getSchedule() {
        return schedule;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSpec")
    private final ClusterSpec clusterSpec;

    
    public ClusterSpec getClusterSpec() {
        return clusterSpec;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterInstance")
    private final ClusterInstance clusterInstance;

    
    public ClusterInstance getClusterInstance() {
        return clusterInstance;
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
     * Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("unifiedJobAndJobRunParameters")
    private final java.util.List<Parameter> unifiedJobAndJobRunParameters;

        /**
     * Unified List of job and job run parameters after resolving dynamic value references and parameter resolution as per precedence.
     * @return the value
     **/
    
    public java.util.List<Parameter> getUnifiedJobAndJobRunParameters() {
        return unifiedJobAndJobRunParameters;
    }


        /**
     * Array of repaired runs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repairHistory")
    private final java.util.List<RepairHistory> repairHistory;

        /**
     * Array of repaired runs.
     * @return the value
     **/
    
    public java.util.List<RepairHistory> getRepairHistory() {
        return repairHistory;
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


        /**
     * The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("runDuration")
    private final Long runDuration;

        /**
     * The time (in milliseconds) taken to complete the job execution and all its repairs to finish.
     * @return the value
     **/
    
    public Long getRunDuration() {
        return runDuration;
    }


        /**
     * The time at which the job execution started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The time at which the job execution started.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The time at which the job execution was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The time at which the job execution was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Identify job run launched by schedule or manually.
     **/
    public enum Launched implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Manual("MANUAL"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Launched.class);

        private final String value;
        private static java.util.Map<String, Launched> map;

        static {
            map = new java.util.HashMap<>();
            for (Launched v : Launched.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Launched(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Launched create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Launched', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Identify job run launched by schedule or manually.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("launched")
    private final Launched launched;

        /**
     * Identify job run launched by schedule or manually.
     * @return the value
     **/
    
    public Launched getLaunched() {
        return launched;
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
     * TaskRun to TaskRunSummary map for given job run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskRunSummaryMap")
    private final java.util.Map<String, Object> taskRunSummaryMap;

        /**
     * TaskRun to TaskRunSummary map for given job run.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getTaskRunSummaryMap() {
        return taskRunSummaryMap;
    }


        /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    private final Integer timeoutSeconds;

        /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     * @return the value
     **/
    
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
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
     * Repair mode to be used for this repair scope.
     **/
    public enum RepairMode implements com.oracle.bmc.http.internal.BmcEnum {
        Resume("RESUME"),
        Rerun("RERUN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RepairMode.class);

        private final String value;
        private static java.util.Map<String, RepairMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RepairMode v : RepairMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RepairMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RepairMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'RepairMode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Repair mode to be used for this repair scope.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repairMode")
    private final RepairMode repairMode;

        /**
     * Repair mode to be used for this repair scope.
     * @return the value
     **/
    
    public RepairMode getRepairMode() {
        return repairMode;
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
        sb.append("JobRun(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", parentJobRunKey=").append(String.valueOf(this.parentJobRunKey));
        sb.append(", rootJobRunKey=").append(String.valueOf(this.rootJobRunKey));
        sb.append(", parentTaskRunKey=").append(String.valueOf(this.parentTaskRunKey));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", maxConcurrentRuns=").append(String.valueOf(this.maxConcurrentRuns));
        sb.append(", gitConfig=").append(String.valueOf(this.gitConfig));
        sb.append(", queue=").append(String.valueOf(this.queue));
        sb.append(", originalAttemptRunId=").append(String.valueOf(this.originalAttemptRunId));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", clusterSpec=").append(String.valueOf(this.clusterSpec));
        sb.append(", clusterInstance=").append(String.valueOf(this.clusterInstance));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", unifiedJobAndJobRunParameters=").append(String.valueOf(this.unifiedJobAndJobRunParameters));
        sb.append(", repairHistory=").append(String.valueOf(this.repairHistory));
        sb.append(", systemParameters=").append(String.valueOf(this.systemParameters));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", setupDuration=").append(String.valueOf(this.setupDuration));
        sb.append(", executionDuration=").append(String.valueOf(this.executionDuration));
        sb.append(", cleanupDuration=").append(String.valueOf(this.cleanupDuration));
        sb.append(", runDuration=").append(String.valueOf(this.runDuration));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", launched=").append(String.valueOf(this.launched));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", taskToTaskRunMap=").append(String.valueOf(this.taskToTaskRunMap));
        sb.append(", taskRunSummaryMap=").append(String.valueOf(this.taskRunSummaryMap));
        sb.append(", timeoutSeconds=").append(String.valueOf(this.timeoutSeconds));
        sb.append(", repairedTasks=").append(String.valueOf(this.repairedTasks));
        sb.append(", repairMode=").append(String.valueOf(this.repairMode));
        sb.append(", lifecycleStates=").append(String.valueOf(this.lifecycleStates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobRun)) {
            return false;
        }

        JobRun other = (JobRun) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.jobKey, other.jobKey) &&
            java.util.Objects.equals(this.jobName, other.jobName) &&
            java.util.Objects.equals(this.parentJobRunKey, other.parentJobRunKey) &&
            java.util.Objects.equals(this.rootJobRunKey, other.rootJobRunKey) &&
            java.util.Objects.equals(this.parentTaskRunKey, other.parentTaskRunKey) &&
            java.util.Objects.equals(this.tasks, other.tasks) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.maxConcurrentRuns, other.maxConcurrentRuns) &&
            java.util.Objects.equals(this.gitConfig, other.gitConfig) &&
            java.util.Objects.equals(this.queue, other.queue) &&
            java.util.Objects.equals(this.originalAttemptRunId, other.originalAttemptRunId) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.schedule, other.schedule) &&
            java.util.Objects.equals(this.clusterSpec, other.clusterSpec) &&
            java.util.Objects.equals(this.clusterInstance, other.clusterInstance) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.unifiedJobAndJobRunParameters, other.unifiedJobAndJobRunParameters) &&
            java.util.Objects.equals(this.repairHistory, other.repairHistory) &&
            java.util.Objects.equals(this.systemParameters, other.systemParameters) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.setupDuration, other.setupDuration) &&
            java.util.Objects.equals(this.executionDuration, other.executionDuration) &&
            java.util.Objects.equals(this.cleanupDuration, other.cleanupDuration) &&
            java.util.Objects.equals(this.runDuration, other.runDuration) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.launched, other.launched) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.taskToTaskRunMap, other.taskToTaskRunMap) &&
            java.util.Objects.equals(this.taskRunSummaryMap, other.taskRunSummaryMap) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds) &&
            java.util.Objects.equals(this.repairedTasks, other.repairedTasks) &&
            java.util.Objects.equals(this.repairMode, other.repairMode) &&
            java.util.Objects.equals(this.lifecycleStates, other.lifecycleStates);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result = (result * PRIME) + (this.parentJobRunKey == null ? 43 : this.parentJobRunKey.hashCode());
        result = (result * PRIME) + (this.rootJobRunKey == null ? 43 : this.rootJobRunKey.hashCode());
        result = (result * PRIME) + (this.parentTaskRunKey == null ? 43 : this.parentTaskRunKey.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.maxConcurrentRuns == null ? 43 : this.maxConcurrentRuns.hashCode());
        result = (result * PRIME) + (this.gitConfig == null ? 43 : this.gitConfig.hashCode());
        result = (result * PRIME) + (this.queue == null ? 43 : this.queue.hashCode());
        result = (result * PRIME) + (this.originalAttemptRunId == null ? 43 : this.originalAttemptRunId.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.clusterSpec == null ? 43 : this.clusterSpec.hashCode());
        result = (result * PRIME) + (this.clusterInstance == null ? 43 : this.clusterInstance.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.unifiedJobAndJobRunParameters == null ? 43 : this.unifiedJobAndJobRunParameters.hashCode());
        result = (result * PRIME) + (this.repairHistory == null ? 43 : this.repairHistory.hashCode());
        result = (result * PRIME) + (this.systemParameters == null ? 43 : this.systemParameters.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.setupDuration == null ? 43 : this.setupDuration.hashCode());
        result = (result * PRIME) + (this.executionDuration == null ? 43 : this.executionDuration.hashCode());
        result = (result * PRIME) + (this.cleanupDuration == null ? 43 : this.cleanupDuration.hashCode());
        result = (result * PRIME) + (this.runDuration == null ? 43 : this.runDuration.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.launched == null ? 43 : this.launched.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.taskToTaskRunMap == null ? 43 : this.taskToTaskRunMap.hashCode());
        result = (result * PRIME) + (this.taskRunSummaryMap == null ? 43 : this.taskRunSummaryMap.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        result = (result * PRIME) + (this.repairedTasks == null ? 43 : this.repairedTasks.hashCode());
        result = (result * PRIME) + (this.repairMode == null ? 43 : this.repairMode.hashCode());
        result = (result * PRIME) + (this.lifecycleStates == null ? 43 : this.lifecycleStates.hashCode());
        return result;
    }


}
