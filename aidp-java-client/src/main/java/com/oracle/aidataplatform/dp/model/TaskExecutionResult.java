package com.oracle.aidataplatform.dp.model;



/**
 * Task run execution result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TaskExecutionResult.Builder.class)

public final class TaskExecutionResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "startTimeMillis", "endTimeMillis", "externalId", "metrics", "properties"})
    public TaskExecutionResult(State state, Long startTimeMillis, Long endTimeMillis, String externalId, java.util.Map<String, String> metrics, java.util.Map<String, Object> properties) {
        super();
        this.state = state;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.externalId = externalId;
        this.metrics = metrics;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;



public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
private Long startTimeMillis;

        /**
         * The time at which the job execution started in epoch milliseconds.
         * @param startTimeMillis the value to set
         * @return this builder
         **/
        

public Builder startTimeMillis(Long startTimeMillis) {
    this.startTimeMillis = startTimeMillis;
    return this;
}
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
private Long endTimeMillis;

        /**
         * The time at which the job execution started in epoch milliseconds.
         * @param endTimeMillis the value to set
         * @return this builder
         **/
        

public Builder endTimeMillis(Long endTimeMillis) {
    this.endTimeMillis = endTimeMillis;
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
     * The metrics of the task execution.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metrics")
private java.util.Map<String, String> metrics;

        /**
         * The metrics of the task execution.
         * @param metrics the value to set
         * @return this builder
         **/
        

public Builder metrics(java.util.Map<String, String> metrics) {
    this.metrics = metrics;
    return this;
}
            /**
     * The properties of the task execution.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, Object> properties;

        /**
         * The properties of the task execution.
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, Object> properties) {
    this.properties = properties;
    return this;
}


        public TaskExecutionResult build() {
            TaskExecutionResult model = new TaskExecutionResult(this.state
                , this.startTimeMillis
                , this.endTimeMillis
                , this.externalId
                , this.metrics
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskExecutionResult model) {
                this.state(model.getState());
    this.startTimeMillis(model.getStartTimeMillis());
    this.endTimeMillis(model.getEndTimeMillis());
    this.externalId(model.getExternalId());
    this.metrics(model.getMetrics());
    this.properties(model.getProperties());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    
    public State getState() {
        return state;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getEndTimeMillis() {
        return endTimeMillis;
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
     * The metrics of the task execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.Map<String, String> metrics;

        /**
     * The metrics of the task execution.
     * @return the value
     **/
    
    public java.util.Map<String, String> getMetrics() {
        return metrics;
    }


        /**
     * The properties of the task execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * The properties of the task execution.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
        return properties;
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
        sb.append("TaskExecutionResult(");
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskExecutionResult)) {
            return false;
        }

        TaskExecutionResult other = (TaskExecutionResult) o;
        return java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis) &&
            java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis) &&
            java.util.Objects.equals(this.externalId, other.externalId) &&
            java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.startTimeMillis == null ? 43 : this.startTimeMillis.hashCode());
        result = (result * PRIME) + (this.endTimeMillis == null ? 43 : this.endTimeMillis.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
