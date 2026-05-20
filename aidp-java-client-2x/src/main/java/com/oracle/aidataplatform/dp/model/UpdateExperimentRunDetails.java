// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to update an experiment run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateExperimentRunDetails.Builder.class)

public final class UpdateExperimentRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "status", "endTime", "runName"})
    public UpdateExperimentRunDetails(String runId, ExperimentRunStatus status, Long endTime, String runName) {
        super();
        this.runId = runId;
        this.status = status;
        this.endTime = endTime;
        this.runName = runName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Unique identifier for the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_id")
        private String runId;

                /**
         * Unique identifier for the run.
         * @param runId the value to set
         * @return this builder
         **/
        

        public Builder runId(String runId) {
        this.runId = runId;
        return this;
        }
            /**
     * Updated status of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ExperimentRunStatus status;

                /**
         * Updated status of the run.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(ExperimentRunStatus status) {
        this.status = status;
        return this;
        }
            /**
     * Unix timestamp in milliseconds when the run ended.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("end_time")
        private Long endTime;

                /**
         * Unix timestamp in milliseconds when the run ended.
         * @param endTime the value to set
         * @return this builder
         **/
        

        public Builder endTime(Long endTime) {
        this.endTime = endTime;
        return this;
        }
            /**
     * Updated name of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_name")
        private String runName;

                /**
         * Updated name of the run.
         * @param runName the value to set
         * @return this builder
         **/
        

        public Builder runName(String runName) {
        this.runName = runName;
        return this;
        }


        public UpdateExperimentRunDetails build() {
            UpdateExperimentRunDetails model = new UpdateExperimentRunDetails(this.runId
                    , this.status
                    , this.endTime
                    , this.runName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExperimentRunDetails model) {
                this.runId(model.getRunId());
    this.status(model.getStatus());
    this.endTime(model.getEndTime());
    this.runName(model.getRunName());
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
     * Unique identifier for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Unique identifier for the run.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
    }

    
        /**
     * Updated status of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ExperimentRunStatus status;

        /**
     * Updated status of the run.
     * @return the value
     **/
    
    public ExperimentRunStatus getStatus() {
        return status;
    }


        /**
     * Unix timestamp in milliseconds when the run ended.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("end_time")
    private final Long endTime;

        /**
     * Unix timestamp in milliseconds when the run ended.
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * Updated name of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_name")
    private final String runName;

        /**
     * Updated name of the run.
     * @return the value
     **/
    
    public String getRunName() {
        return runName;
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
        sb.append("UpdateExperimentRunDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", runName=").append(String.valueOf(this.runName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExperimentRunDetails)) {
            return false;
        }

        UpdateExperimentRunDetails other = (UpdateExperimentRunDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.runName, other.runName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.runName == null ? 43 : this.runName.hashCode());
        return result;
    }


}
