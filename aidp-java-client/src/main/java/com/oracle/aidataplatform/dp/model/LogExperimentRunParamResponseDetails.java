// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response object for logging experiment run param.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunParamResponseDetails.Builder.class)

public final class LogExperimentRunParamResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    public LogExperimentRunParamResponseDetails() {
        super();
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    

        public LogExperimentRunParamResponseDetails build() {
            LogExperimentRunParamResponseDetails model = new LogExperimentRunParamResponseDetails();            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunParamResponseDetails model) {
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
        sb.append("LogExperimentRunParamResponseDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunParamResponseDetails)) {
            return false;
        }

        LogExperimentRunParamResponseDetails other = (LogExperimentRunParamResponseDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
