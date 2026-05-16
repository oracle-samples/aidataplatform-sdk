// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Run data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunData.Builder.class)

public final class ExperimentRunData  {
    @Deprecated
    @java.beans.ConstructorProperties({"metrics", "params", "tags"})
    public ExperimentRunData(java.util.List<ExperimentRunMetric> metrics, java.util.List<ExperimentRunParam> params, java.util.List<ExperimentRunTag> tags) {
        super();
        this.metrics = metrics;
        this.params = params;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Metrics logged for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metrics")
private java.util.List<ExperimentRunMetric> metrics;

        /**
         * Metrics logged for the run.
         * @param metrics the value to set
         * @return this builder
         **/
        

public Builder metrics(java.util.List<ExperimentRunMetric> metrics) {
    this.metrics = metrics;
    return this;
}
            /**
     * Parameters logged for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("params")
private java.util.List<ExperimentRunParam> params;

        /**
         * Parameters logged for the run.
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


        public ExperimentRunData build() {
            ExperimentRunData model = new ExperimentRunData(this.metrics
                , this.params
                , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunData model) {
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
     * Metrics logged for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<ExperimentRunMetric> metrics;

        /**
     * Metrics logged for the run.
     * @return the value
     **/
    
    public java.util.List<ExperimentRunMetric> getMetrics() {
        return metrics;
    }


        /**
     * Parameters logged for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    private final java.util.List<ExperimentRunParam> params;

        /**
     * Parameters logged for the run.
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
        sb.append("ExperimentRunData(");
        sb.append("metrics=").append(String.valueOf(this.metrics));
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
        if (!(o instanceof ExperimentRunData)) {
            return false;
        }

        ExperimentRunData other = (ExperimentRunData) o;
        return java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.params, other.params) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.params == null ? 43 : this.params.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
