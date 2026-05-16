// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a job run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateJobRunDetails.Builder.class)

public final class CreateJobRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "jobKey", "originalAttemptRunId", "schedule", "parameters", "queue", "repairHistory"})
    public CreateJobRunDetails(String key, String jobKey, String originalAttemptRunId, Schedule schedule, java.util.List<Parameter> parameters, Queue queue, java.util.List<RepairHistory> repairHistory) {
        super();
        this.key = key;
        this.jobKey = jobKey;
        this.originalAttemptRunId = originalAttemptRunId;
        this.schedule = schedule;
        this.parameters = parameters;
        this.queue = queue;
        this.repairHistory = repairHistory;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private Schedule schedule;

        

        public Builder schedule(Schedule schedule) {
        this.schedule = schedule;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("queue")
        private Queue queue;

        

        public Builder queue(Queue queue) {
        this.queue = queue;
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


        public CreateJobRunDetails build() {
            CreateJobRunDetails model = new CreateJobRunDetails(this.key
                    , this.jobKey
                    , this.originalAttemptRunId
                    , this.schedule
                    , this.parameters
                    , this.queue
                    , this.repairHistory);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobRunDetails model) {
                this.key(model.getKey());
    this.jobKey(model.getJobKey());
    this.originalAttemptRunId(model.getOriginalAttemptRunId());
    this.schedule(model.getSchedule());
    this.parameters(model.getParameters());
    this.queue(model.getQueue());
    this.repairHistory(model.getRepairHistory());
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("originalAttemptRunId")
    private final String originalAttemptRunId;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getOriginalAttemptRunId() {
        return originalAttemptRunId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final Schedule schedule;

    
    public Schedule getSchedule() {
        return schedule;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("queue")
    private final Queue queue;

    
    public Queue getQueue() {
        return queue;
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
        sb.append("CreateJobRunDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", originalAttemptRunId=").append(String.valueOf(this.originalAttemptRunId));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", queue=").append(String.valueOf(this.queue));
        sb.append(", repairHistory=").append(String.valueOf(this.repairHistory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobRunDetails)) {
            return false;
        }

        CreateJobRunDetails other = (CreateJobRunDetails) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.jobKey, other.jobKey) &&
            java.util.Objects.equals(this.originalAttemptRunId, other.originalAttemptRunId) &&
            java.util.Objects.equals(this.schedule, other.schedule) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.queue, other.queue) &&
            java.util.Objects.equals(this.repairHistory, other.repairHistory);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.originalAttemptRunId == null ? 43 : this.originalAttemptRunId.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.queue == null ? 43 : this.queue.hashCode());
        result = (result * PRIME) + (this.repairHistory == null ? 43 : this.repairHistory.hashCode());
        return result;
    }


}
