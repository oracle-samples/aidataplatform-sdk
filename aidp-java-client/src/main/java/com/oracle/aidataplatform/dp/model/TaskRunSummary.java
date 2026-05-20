// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a TaskRun.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TaskRunSummary.Builder.class)

public final class TaskRunSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "taskKey", "jobRunKey", "parentJobRunKey", "rootJobRunKey", "clusterValidationStartTime", "startTime", "endTime", "state", "externalId", "retryAttempt"})
    public TaskRunSummary(String key, String name, String taskKey, String jobRunKey, String parentJobRunKey, String rootJobRunKey, Long clusterValidationStartTime, Long startTime, Long endTime, State state, String externalId, Integer retryAttempt) {
        super();
        this.key = key;
        this.name = name;
        this.taskKey = taskKey;
        this.jobRunKey = jobRunKey;
        this.parentJobRunKey = parentJobRunKey;
        this.rootJobRunKey = rootJobRunKey;
        this.clusterValidationStartTime = clusterValidationStartTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.state = state;
        this.externalId = externalId;
        this.retryAttempt = retryAttempt;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the TaskRun.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The OCID of the TaskRun.
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


        public TaskRunSummary build() {
            TaskRunSummary model = new TaskRunSummary(this.key
                , this.name
                , this.taskKey
                , this.jobRunKey
                , this.parentJobRunKey
                , this.rootJobRunKey
                , this.clusterValidationStartTime
                , this.startTime
                , this.endTime
                , this.state
                , this.externalId
                , this.retryAttempt);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunSummary model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.taskKey(model.getTaskKey());
    this.jobRunKey(model.getJobRunKey());
    this.parentJobRunKey(model.getParentJobRunKey());
    this.rootJobRunKey(model.getRootJobRunKey());
    this.clusterValidationStartTime(model.getClusterValidationStartTime());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.state(model.getState());
    this.externalId(model.getExternalId());
    this.retryAttempt(model.getRetryAttempt());
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
     * The OCID of the TaskRun.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The OCID of the TaskRun.
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
        sb.append("TaskRunSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", jobRunKey=").append(String.valueOf(this.jobRunKey));
        sb.append(", parentJobRunKey=").append(String.valueOf(this.parentJobRunKey));
        sb.append(", rootJobRunKey=").append(String.valueOf(this.rootJobRunKey));
        sb.append(", clusterValidationStartTime=").append(String.valueOf(this.clusterValidationStartTime));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", retryAttempt=").append(String.valueOf(this.retryAttempt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunSummary)) {
            return false;
        }

        TaskRunSummary other = (TaskRunSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.taskKey, other.taskKey) &&
            java.util.Objects.equals(this.jobRunKey, other.jobRunKey) &&
            java.util.Objects.equals(this.parentJobRunKey, other.parentJobRunKey) &&
            java.util.Objects.equals(this.rootJobRunKey, other.rootJobRunKey) &&
            java.util.Objects.equals(this.clusterValidationStartTime, other.clusterValidationStartTime) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.retryAttempt, other.retryAttempt);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.jobRunKey == null ? 43 : this.jobRunKey.hashCode());
        result = (result * PRIME) + (this.parentJobRunKey == null ? 43 : this.parentJobRunKey.hashCode());
        result = (result * PRIME) + (this.rootJobRunKey == null ? 43 : this.rootJobRunKey.hashCode());
        result = (result * PRIME) + (this.clusterValidationStartTime == null ? 43 : this.clusterValidationStartTime.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.retryAttempt == null ? 43 : this.retryAttempt.hashCode());
        return result;
    }


}
