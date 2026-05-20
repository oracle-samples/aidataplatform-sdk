// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Representation of a task run retry. Maximum of 10 retries are allowed.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TaskRunRetry.Builder.class)

public final class TaskRunRetry  {
    @Deprecated
    @java.beans.ConstructorProperties({"startTime", "endTime", "clusterValidationStartTime", "state", "setupDuration", "executionDuration", "cleanupDuration", "outputKey", "externalId", "retryNumber"})
    public TaskRunRetry(Long startTime, Long endTime, Long clusterValidationStartTime, State state, Long setupDuration, Long executionDuration, Long cleanupDuration, String outputKey, String externalId, Integer retryNumber) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
        this.clusterValidationStartTime = clusterValidationStartTime;
        this.state = state;
        this.setupDuration = setupDuration;
        this.executionDuration = executionDuration;
        this.cleanupDuration = cleanupDuration;
        this.outputKey = outputKey;
        this.externalId = externalId;
        this.retryNumber = retryNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("retryNumber")
        private Integer retryNumber;

                /**
         * Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
         * @param retryNumber the value to set
         * @return this builder
         **/
        

        public Builder retryNumber(Integer retryNumber) {
        this.retryNumber = retryNumber;
        return this;
        }


        public TaskRunRetry build() {
            TaskRunRetry model = new TaskRunRetry(this.startTime
                    , this.endTime
                    , this.clusterValidationStartTime
                    , this.state
                    , this.setupDuration
                    , this.executionDuration
                    , this.cleanupDuration
                    , this.outputKey
                    , this.externalId
                    , this.retryNumber);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunRetry model) {
                this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.clusterValidationStartTime(model.getClusterValidationStartTime());
    this.state(model.getState());
    this.setupDuration(model.getSetupDuration());
    this.executionDuration(model.getExecutionDuration());
    this.cleanupDuration(model.getCleanupDuration());
    this.outputKey(model.getOutputKey());
    this.externalId(model.getExternalId());
    this.retryNumber(model.getRetryNumber());
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
     * Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retryNumber")
    private final Integer retryNumber;

        /**
     * Sequence number of the retry attempt. 0 for the original. 1, 2, 3, ... for subsequent retry attempts.
     * @return the value
     **/
    
    public Integer getRetryNumber() {
        return retryNumber;
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
        sb.append("TaskRunRetry(");
        sb.append("startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", clusterValidationStartTime=").append(String.valueOf(this.clusterValidationStartTime));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", setupDuration=").append(String.valueOf(this.setupDuration));
        sb.append(", executionDuration=").append(String.valueOf(this.executionDuration));
        sb.append(", cleanupDuration=").append(String.valueOf(this.cleanupDuration));
        sb.append(", outputKey=").append(String.valueOf(this.outputKey));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", retryNumber=").append(String.valueOf(this.retryNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunRetry)) {
            return false;
        }

        TaskRunRetry other = (TaskRunRetry) o;
        return java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.clusterValidationStartTime, other.clusterValidationStartTime) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.setupDuration, other.setupDuration) &&
            java.util.Objects.equals(this.executionDuration, other.executionDuration) &&
            java.util.Objects.equals(this.cleanupDuration, other.cleanupDuration) &&
            java.util.Objects.equals(this.outputKey, other.outputKey) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.retryNumber, other.retryNumber);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.clusterValidationStartTime == null ? 43 : this.clusterValidationStartTime.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.setupDuration == null ? 43 : this.setupDuration.hashCode());
        result = (result * PRIME) + (this.executionDuration == null ? 43 : this.executionDuration.hashCode());
        result = (result * PRIME) + (this.cleanupDuration == null ? 43 : this.cleanupDuration.hashCode());
        result = (result * PRIME) + (this.outputKey == null ? 43 : this.outputKey.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.retryNumber == null ? 43 : this.retryNumber.hashCode());
        return result;
    }


}
