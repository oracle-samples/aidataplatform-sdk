package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateJobDetails.Builder.class)

public final class UpdateJobDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runAs", "name", "description", "schedule", "continuous", "maxConcurrentRuns", "gitConfig", "queue", "jobClusters", "path", "tasks", "parameters", "timeoutSeconds"})
    public UpdateJobDetails(String runAs, String name, String description, Schedule schedule, Continuous continuous, Integer maxConcurrentRuns, GitConfig gitConfig, Queue queue, java.util.List<JobCluster> jobClusters, String path, java.util.List<Task> tasks, java.util.List<Parameter> parameters, Integer timeoutSeconds) {
        super();
        this.runAs = runAs;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.continuous = continuous;
        this.maxConcurrentRuns = maxConcurrentRuns;
        this.gitConfig = gitConfig;
        this.queue = queue;
        this.jobClusters = jobClusters;
        this.path = path;
        this.tasks = tasks;
        this.parameters = parameters;
        this.timeoutSeconds = timeoutSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The id with which the job run as.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("runAs")
private String runAs;

        /**
         * The id with which the job run as.
         * @param runAs the value to set
         * @return this builder
         **/
        

public Builder runAs(String runAs) {
    this.runAs = runAs;
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
     * A description for the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A description for the job.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("schedule")
private Schedule schedule;



public Builder schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("continuous")
private Continuous continuous;



public Builder continuous(Continuous continuous) {
    this.continuous = continuous;
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
     * List of job cluster configurations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobClusters")
private java.util.List<JobCluster> jobClusters;

        /**
         * List of job cluster configurations.
         * @param jobClusters the value to set
         * @return this builder
         **/
        

public Builder jobClusters(java.util.List<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
}
            /**
     * The path to store the job definition in.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The path to store the job definition in.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
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


        public UpdateJobDetails build() {
            UpdateJobDetails model = new UpdateJobDetails(this.runAs
                , this.name
                , this.description
                , this.schedule
                , this.continuous
                , this.maxConcurrentRuns
                , this.gitConfig
                , this.queue
                , this.jobClusters
                , this.path
                , this.tasks
                , this.parameters
                , this.timeoutSeconds);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateJobDetails model) {
                this.runAs(model.getRunAs());
    this.name(model.getName());
    this.description(model.getDescription());
    this.schedule(model.getSchedule());
    this.continuous(model.getContinuous());
    this.maxConcurrentRuns(model.getMaxConcurrentRuns());
    this.gitConfig(model.getGitConfig());
    this.queue(model.getQueue());
    this.jobClusters(model.getJobClusters());
    this.path(model.getPath());
    this.tasks(model.getTasks());
    this.parameters(model.getParameters());
    this.timeoutSeconds(model.getTimeoutSeconds());
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
     * The id with which the job run as.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("runAs")
    private final String runAs;

        /**
     * The id with which the job run as.
     * @return the value
     **/
    
    public String getRunAs() {
        return runAs;
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
     * A description for the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A description for the job.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final Schedule schedule;

    
    public Schedule getSchedule() {
        return schedule;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("continuous")
    private final Continuous continuous;

    
    public Continuous getContinuous() {
        return continuous;
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
     * List of job cluster configurations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobClusters")
    private final java.util.List<JobCluster> jobClusters;

        /**
     * List of job cluster configurations.
     * @return the value
     **/
    
    public java.util.List<JobCluster> getJobClusters() {
        return jobClusters;
    }


        /**
     * The path to store the job definition in.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The path to store the job definition in.
     * @return the value
     **/
    
    public String getPath() {
        return path;
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
        sb.append("UpdateJobDetails(");
        sb.append("runAs=").append(String.valueOf(this.runAs));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", continuous=").append(String.valueOf(this.continuous));
        sb.append(", maxConcurrentRuns=").append(String.valueOf(this.maxConcurrentRuns));
        sb.append(", gitConfig=").append(String.valueOf(this.gitConfig));
        sb.append(", queue=").append(String.valueOf(this.queue));
        sb.append(", jobClusters=").append(String.valueOf(this.jobClusters));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", timeoutSeconds=").append(String.valueOf(this.timeoutSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateJobDetails)) {
            return false;
        }

        UpdateJobDetails other = (UpdateJobDetails) o;
        return java.util.Objects.equals(this.runAs, other.runAs) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.schedule, other.schedule) &&
            java.util.Objects.equals(this.continuous, other.continuous) &&
            java.util.Objects.equals(this.maxConcurrentRuns, other.maxConcurrentRuns) &&
            java.util.Objects.equals(this.gitConfig, other.gitConfig) &&
            java.util.Objects.equals(this.queue, other.queue) &&
            java.util.Objects.equals(this.jobClusters, other.jobClusters) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.tasks, other.tasks) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runAs == null ? 43 : this.runAs.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.continuous == null ? 43 : this.continuous.hashCode());
        result = (result * PRIME) + (this.maxConcurrentRuns == null ? 43 : this.maxConcurrentRuns.hashCode());
        result = (result * PRIME) + (this.gitConfig == null ? 43 : this.gitConfig.hashCode());
        result = (result * PRIME) + (this.queue == null ? 43 : this.queue.hashCode());
        result = (result * PRIME) + (this.jobClusters == null ? 43 : this.jobClusters.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        return result;
    }


}
