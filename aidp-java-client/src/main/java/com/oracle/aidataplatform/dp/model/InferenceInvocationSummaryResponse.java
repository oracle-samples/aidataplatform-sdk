// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Aggregate metrics for a model deployment's inference invocations.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationSummaryResponse.Builder.class)

public final class InferenceInvocationSummaryResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "summary"})
    public InferenceInvocationSummaryResponse(java.util.Date timeStart, java.util.Date timeEnd, InferenceInvocationSummaryMetrics summary) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.summary = summary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Inclusive start time resolved for this summary query.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Inclusive start time resolved for this summary query.
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * Inclusive end time resolved for this summary query.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * Inclusive end time resolved for this summary query.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("summary")
private InferenceInvocationSummaryMetrics summary;



public Builder summary(InferenceInvocationSummaryMetrics summary) {
    this.summary = summary;
    return this;
}


        public InferenceInvocationSummaryResponse build() {
            InferenceInvocationSummaryResponse model = new InferenceInvocationSummaryResponse(this.timeStart
                , this.timeEnd
                , this.summary);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationSummaryResponse model) {
                this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.summary(model.getSummary());
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
     * Inclusive start time resolved for this summary query.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Inclusive start time resolved for this summary query.
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * Inclusive end time resolved for this summary query.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * Inclusive end time resolved for this summary query.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final InferenceInvocationSummaryMetrics summary;

    
    public InferenceInvocationSummaryMetrics getSummary() {
        return summary;
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
        sb.append("InferenceInvocationSummaryResponse(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationSummaryResponse)) {
            return false;
        }

        InferenceInvocationSummaryResponse other = (InferenceInvocationSummaryResponse) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.summary, other.summary);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        return result;
    }


}
