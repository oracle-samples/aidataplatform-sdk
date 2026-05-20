// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Run batch data to log.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunBatchDetails.Builder.class)

public final class LogExperimentRunBatchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "metrics", "params", "tags"})
    public LogExperimentRunBatchDetails(String runId, java.util.List<ExperimentRunMetric> metrics, java.util.List<ExperimentRunParam> params, java.util.List<ExperimentRunTag> tags) {
        super();
        this.runId = runId;
        this.metrics = metrics;
        this.params = params;
        this.tags = tags;
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
     * Metrics to log.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metrics")
private java.util.List<ExperimentRunMetric> metrics;

        /**
         * Metrics to log.
         * @param metrics the value to set
         * @return this builder
         **/
        

public Builder metrics(java.util.List<ExperimentRunMetric> metrics) {
    this.metrics = metrics;
    return this;
}
            /**
     * Params to log.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("params")
private java.util.List<ExperimentRunParam> params;

        /**
         * Params to log.
         * @param params the value to set
         * @return this builder
         **/
        

public Builder params(java.util.List<ExperimentRunParam> params) {
    this.params = params;
    return this;
}
            /**
     * Tags to log.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.List<ExperimentRunTag> tags;

        /**
         * Tags to log.
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.List<ExperimentRunTag> tags) {
    this.tags = tags;
    return this;
}


        public LogExperimentRunBatchDetails build() {
            LogExperimentRunBatchDetails model = new LogExperimentRunBatchDetails(this.runId
                , this.metrics
                , this.params
                , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunBatchDetails model) {
                this.runId(model.getRunId());
    this.metrics(model.getMetrics());
    this.params(model.getParams());
    this.tags(model.getTags());
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
     * Metrics to log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<ExperimentRunMetric> metrics;

        /**
     * Metrics to log.
     * @return the value
     **/
    
    public java.util.List<ExperimentRunMetric> getMetrics() {
        return metrics;
    }


        /**
     * Params to log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    private final java.util.List<ExperimentRunParam> params;

        /**
     * Params to log.
     * @return the value
     **/
    
    public java.util.List<ExperimentRunParam> getParams() {
        return params;
    }


        /**
     * Tags to log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<ExperimentRunTag> tags;

        /**
     * Tags to log.
     * @return the value
     **/
    
    public java.util.List<ExperimentRunTag> getTags() {
        return tags;
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
        sb.append("LogExperimentRunBatchDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", params=").append(String.valueOf(this.params));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunBatchDetails)) {
            return false;
        }

        LogExperimentRunBatchDetails other = (LogExperimentRunBatchDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.params, other.params) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.params == null ? 43 : this.params.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
