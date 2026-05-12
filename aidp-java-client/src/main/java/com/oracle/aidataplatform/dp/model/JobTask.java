package com.oracle.aidataplatform.dp.model;



/**
 * The information about the job task.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class JobTask extends Task {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
private String taskKey;

public Builder taskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
private java.util.List<DependsOn> dependsOn;

public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("runIf")
private RunIf runIf;

public Builder runIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
private Integer maxRetries;

public Builder maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("minRetryIntervalMillis")
private Integer minRetryIntervalMillis;

public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("isRetryOnTimeout")
private Boolean isRetryOnTimeout;

public Builder isRetryOnTimeout(Boolean isRetryOnTimeout) {
    this.isRetryOnTimeout = isRetryOnTimeout;
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


        public JobTask build() {
            JobTask model = new JobTask(this.taskKey
                , this.dependsOn
                , this.runIf
                , this.maxRetries
                , this.minRetryIntervalMillis
                , this.isRetryOnTimeout
                , this.jobKey
                , this.parameters
                , this.timeoutSeconds);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobTask model) {
                this.taskKey(model.getTaskKey());
    this.dependsOn(model.getDependsOn());
    this.runIf(model.getRunIf());
    this.maxRetries(model.getMaxRetries());
    this.minRetryIntervalMillis(model.getMinRetryIntervalMillis());
    this.isRetryOnTimeout(model.getIsRetryOnTimeout());
    this.jobKey(model.getJobKey());
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

    
    @Deprecated
    public JobTask(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout, String jobKey, java.util.List<Parameter> parameters, Integer timeoutSeconds) {
    super(taskKey, dependsOn, runIf, maxRetries, minRetryIntervalMillis, isRetryOnTimeout);
        this.jobKey = jobKey;
        this.parameters = parameters;
        this.timeoutSeconds = timeoutSeconds;
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
        sb.append("JobTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
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
        if (!(o instanceof JobTask)) {
            return false;
        }

        JobTask other = (JobTask) o;
        return java.util.Objects.equals(this.jobKey, other.jobKey) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        return result;
    }


}
