package com.oracle.aidataplatform.dp.model;



/**
 * ModelVersion tag.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelVersionDeploymentJobState.Builder.class)

public final class ModelVersionDeploymentJobState  {
    @Deprecated
    @java.beans.ConstructorProperties({"jobId", "runId", "jobState", "runState", "currentTaskName"})
    public ModelVersionDeploymentJobState(String jobId, String runId, DeploymentJobState jobState, DeploymentJobRunState runState, String currentTaskName) {
        super();
        this.jobId = jobId;
        this.runId = runId;
        this.jobState = jobState;
        this.runState = runState;
        this.currentTaskName = currentTaskName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Job ID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("job_id")
private String jobId;

        /**
         * Job ID.
         * @param jobId the value to set
         * @return this builder
         **/
        

public Builder jobId(String jobId) {
    this.jobId = jobId;
    return this;
}
            /**
     * Run ID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_id")
private String runId;

        /**
         * Run ID.
         * @param runId the value to set
         * @return this builder
         **/
        

public Builder runId(String runId) {
    this.runId = runId;
    return this;
}
            /**
     * Job state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("job_state")
private DeploymentJobState jobState;

        /**
         * Job state.
         * @param jobState the value to set
         * @return this builder
         **/
        

public Builder jobState(DeploymentJobState jobState) {
    this.jobState = jobState;
    return this;
}
            /**
     * Run state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_state")
private DeploymentJobRunState runState;

        /**
         * Run state.
         * @param runState the value to set
         * @return this builder
         **/
        

public Builder runState(DeploymentJobRunState runState) {
    this.runState = runState;
    return this;
}
            /**
     * Current task name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("current_task_name")
private String currentTaskName;

        /**
         * Current task name.
         * @param currentTaskName the value to set
         * @return this builder
         **/
        

public Builder currentTaskName(String currentTaskName) {
    this.currentTaskName = currentTaskName;
    return this;
}


        public ModelVersionDeploymentJobState build() {
            ModelVersionDeploymentJobState model = new ModelVersionDeploymentJobState(this.jobId
                , this.runId
                , this.jobState
                , this.runState
                , this.currentTaskName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelVersionDeploymentJobState model) {
                this.jobId(model.getJobId());
    this.runId(model.getRunId());
    this.jobState(model.getJobState());
    this.runState(model.getRunState());
    this.currentTaskName(model.getCurrentTaskName());
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
     * Job ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("job_id")
    private final String jobId;

        /**
     * Job ID.
     * @return the value
     **/
    
    public String getJobId() {
        return jobId;
    }


        /**
     * Run ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Run ID.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
    }

    
        /**
     * Job state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("job_state")
    private final DeploymentJobState jobState;

        /**
     * Job state.
     * @return the value
     **/
    
    public DeploymentJobState getJobState() {
        return jobState;
    }

    
        /**
     * Run state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_state")
    private final DeploymentJobRunState runState;

        /**
     * Run state.
     * @return the value
     **/
    
    public DeploymentJobRunState getRunState() {
        return runState;
    }


        /**
     * Current task name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("current_task_name")
    private final String currentTaskName;

        /**
     * Current task name.
     * @return the value
     **/
    
    public String getCurrentTaskName() {
        return currentTaskName;
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
        sb.append("ModelVersionDeploymentJobState(");
        sb.append("jobId=").append(String.valueOf(this.jobId));
        sb.append(", runId=").append(String.valueOf(this.runId));
        sb.append(", jobState=").append(String.valueOf(this.jobState));
        sb.append(", runState=").append(String.valueOf(this.runState));
        sb.append(", currentTaskName=").append(String.valueOf(this.currentTaskName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelVersionDeploymentJobState)) {
            return false;
        }

        ModelVersionDeploymentJobState other = (ModelVersionDeploymentJobState) o;
        return java.util.Objects.equals(this.jobId, other.jobId) &&
            java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.jobState, other.jobState) &&
            java.util.Objects.equals(this.runState, other.runState) &&
            java.util.Objects.equals(this.currentTaskName, other.currentTaskName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.jobState == null ? 43 : this.jobState.hashCode());
        result = (result * PRIME) + (this.runState == null ? 43 : this.runState.hashCode());
        result = (result * PRIME) + (this.currentTaskName == null ? 43 : this.currentTaskName.hashCode());
        return result;
    }


}
