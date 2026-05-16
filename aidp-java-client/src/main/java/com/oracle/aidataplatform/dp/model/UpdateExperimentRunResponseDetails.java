// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of updated run info.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateExperimentRunResponseDetails.Builder.class)

public final class UpdateExperimentRunResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runInfo"})
    public UpdateExperimentRunResponseDetails(ExperimentRunInfo runInfo) {
        super();
        this.runInfo = runInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("run_info")
private ExperimentRunInfo runInfo;



public Builder runInfo(ExperimentRunInfo runInfo) {
    this.runInfo = runInfo;
    return this;
}


        public UpdateExperimentRunResponseDetails build() {
            UpdateExperimentRunResponseDetails model = new UpdateExperimentRunResponseDetails(this.runInfo);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExperimentRunResponseDetails model) {
                this.runInfo(model.getRunInfo());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("run_info")
    private final ExperimentRunInfo runInfo;

    
    public ExperimentRunInfo getRunInfo() {
        return runInfo;
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
        sb.append("UpdateExperimentRunResponseDetails(");
        sb.append("runInfo=").append(String.valueOf(this.runInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExperimentRunResponseDetails)) {
            return false;
        }

        UpdateExperimentRunResponseDetails other = (UpdateExperimentRunResponseDetails) o;
        return java.util.Objects.equals(this.runInfo, other.runInfo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runInfo == null ? 43 : this.runInfo.hashCode());
        return result;
    }


}
