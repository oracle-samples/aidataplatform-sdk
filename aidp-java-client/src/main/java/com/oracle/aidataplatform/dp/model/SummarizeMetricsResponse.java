package com.oracle.aidataplatform.dp.model;



/**
 * Response payload containing summarized metric data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SummarizeMetricsResponse.Builder.class)

public final class SummarizeMetricsResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"results"})
    public SummarizeMetricsResponse(java.util.List<MetricsSummary> results) {
        super();
        this.results = results;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of computed metric summary results.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("results")
private java.util.List<MetricsSummary> results;

        /**
         * List of computed metric summary results.
         * @param results the value to set
         * @return this builder
         **/
        

public Builder results(java.util.List<MetricsSummary> results) {
    this.results = results;
    return this;
}


        public SummarizeMetricsResponse build() {
            SummarizeMetricsResponse model = new SummarizeMetricsResponse(this.results);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeMetricsResponse model) {
                this.results(model.getResults());
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
     * List of computed metric summary results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<MetricsSummary> results;

        /**
     * List of computed metric summary results.
     * @return the value
     **/
    
    public java.util.List<MetricsSummary> getResults() {
        return results;
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
        sb.append("SummarizeMetricsResponse(");
        sb.append("results=").append(String.valueOf(this.results));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeMetricsResponse)) {
            return false;
        }

        SummarizeMetricsResponse other = (SummarizeMetricsResponse) o;
        return java.util.Objects.equals(this.results, other.results);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        return result;
    }


}
