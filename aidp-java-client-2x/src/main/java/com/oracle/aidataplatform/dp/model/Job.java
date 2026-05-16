// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A description of a Job.
* To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
* an administrator. If you're an administrator who needs to write policies to give users access, see
* [Getting Started with Policies]({{DOC_SERVER_URL}}/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Job.Builder.class)

public final class Job  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "createdBy", "createdByName", "updatedBy", "updatedByName", "runAs", "name", "description", "schedule", "continuous", "maxConcurrentRuns", "gitConfig", "queue", "path", "jobClusters", "tasks", "timeCreated", "timeUpdated", "parameters", "timeoutSeconds"})
    public Job(String key, String createdBy, String createdByName, String updatedBy, String updatedByName, String runAs, String name, String description, Schedule schedule, Continuous continuous, Integer maxConcurrentRuns, GitConfig gitConfig, Queue queue, String path, java.util.List<JobCluster> jobClusters, java.util.List<Task> tasks, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<Parameter> parameters, Integer timeoutSeconds) {
        super();
        this.key = key;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.runAs = runAs;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.continuous = continuous;
        this.maxConcurrentRuns = maxConcurrentRuns;
        this.gitConfig = gitConfig;
        this.queue = queue;
        this.path = path;
        this.jobClusters = jobClusters;
        this.tasks = tasks;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.parameters = parameters;
        this.timeoutSeconds = timeoutSeconds;
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
     * The username of the latest updater. The OCID of the IAM user.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

                /**
         * The username of the latest updater. The OCID of the IAM user.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

        public Builder updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
        }
            /**
     * Name of the user who updated this record.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
        private String updatedByName;

                /**
         * Name of the user who updated this record.
         * @param updatedByName the value to set
         * @return this builder
         **/
        

        public Builder updatedByName(String updatedByName) {
        this.updatedByName = updatedByName;
        return this;
        }
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
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
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


        public Job build() {
            Job model = new Job(this.key
                    , this.createdBy
                    , this.createdByName
                    , this.updatedBy
                    , this.updatedByName
                    , this.runAs
                    , this.name
                    , this.description
                    , this.schedule
                    , this.continuous
                    , this.maxConcurrentRuns
                    , this.gitConfig
                    , this.queue
                    , this.path
                    , this.jobClusters
                    , this.tasks
                    , this.timeCreated
                    , this.timeUpdated
                    , this.parameters
                    , this.timeoutSeconds);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job model) {
                this.key(model.getKey());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
    this.runAs(model.getRunAs());
    this.name(model.getName());
    this.description(model.getDescription());
    this.schedule(model.getSchedule());
    this.continuous(model.getContinuous());
    this.maxConcurrentRuns(model.getMaxConcurrentRuns());
    this.gitConfig(model.getGitConfig());
    this.queue(model.getQueue());
    this.path(model.getPath());
    this.jobClusters(model.getJobClusters());
    this.tasks(model.getTasks());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
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
     * The username of the latest updater. The OCID of the IAM user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The username of the latest updater. The OCID of the IAM user.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Name of the user who updated this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

        /**
     * Name of the user who updated this record.
     * @return the value
     **/
    
    public String getUpdatedByName() {
        return updatedByName;
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
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("Job(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", runAs=").append(String.valueOf(this.runAs));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", continuous=").append(String.valueOf(this.continuous));
        sb.append(", maxConcurrentRuns=").append(String.valueOf(this.maxConcurrentRuns));
        sb.append(", gitConfig=").append(String.valueOf(this.gitConfig));
        sb.append(", queue=").append(String.valueOf(this.queue));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", jobClusters=").append(String.valueOf(this.jobClusters));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.runAs, other.runAs) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.schedule, other.schedule) &&
            java.util.Objects.equals(this.continuous, other.continuous) &&
            java.util.Objects.equals(this.maxConcurrentRuns, other.maxConcurrentRuns) &&
            java.util.Objects.equals(this.gitConfig, other.gitConfig) &&
            java.util.Objects.equals(this.queue, other.queue) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.jobClusters, other.jobClusters) &&
            java.util.Objects.equals(this.tasks, other.tasks) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.runAs == null ? 43 : this.runAs.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.continuous == null ? 43 : this.continuous.hashCode());
        result = (result * PRIME) + (this.maxConcurrentRuns == null ? 43 : this.maxConcurrentRuns.hashCode());
        result = (result * PRIME) + (this.gitConfig == null ? 43 : this.gitConfig.hashCode());
        result = (result * PRIME) + (this.queue == null ? 43 : this.queue.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.jobClusters == null ? 43 : this.jobClusters.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        return result;
    }


}
