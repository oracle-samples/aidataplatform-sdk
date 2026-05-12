package com.oracle.aidataplatform.dp.model;



/**
 * Response object for logging experiment run metric
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunMetricResponseDetails.Builder.class)

public final class LogExperimentRunMetricResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    public LogExperimentRunMetricResponseDetails() {
        super();
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    

        public LogExperimentRunMetricResponseDetails build() {
            LogExperimentRunMetricResponseDetails model = new LogExperimentRunMetricResponseDetails();            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunMetricResponseDetails model) {
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
        sb.append("LogExperimentRunMetricResponseDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunMetricResponseDetails)) {
            return false;
        }

        LogExperimentRunMetricResponseDetails other = (LogExperimentRunMetricResponseDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
