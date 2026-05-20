// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of an experiment run model.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunModelDetails.Builder.class)

public final class LogExperimentRunModelDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "modelJson"})
    public LogExperimentRunModelDetails(String runId, String modelJson) {
        super();
        this.runId = runId;
        this.modelJson = modelJson;
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
     * Model file in JSON format
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("model_json")
        private String modelJson;

                /**
         * Model file in JSON format
         * @param modelJson the value to set
         * @return this builder
         **/
        

        public Builder modelJson(String modelJson) {
        this.modelJson = modelJson;
        return this;
        }


        public LogExperimentRunModelDetails build() {
            LogExperimentRunModelDetails model = new LogExperimentRunModelDetails(this.runId
                    , this.modelJson);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunModelDetails model) {
                this.runId(model.getRunId());
    this.modelJson(model.getModelJson());
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
     * Model file in JSON format
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_json")
    private final String modelJson;

        /**
     * Model file in JSON format
     * @return the value
     **/
    
    public String getModelJson() {
        return modelJson;
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
        sb.append("LogExperimentRunModelDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", modelJson=").append(String.valueOf(this.modelJson));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunModelDetails)) {
            return false;
        }

        LogExperimentRunModelDetails other = (LogExperimentRunModelDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.modelJson, other.modelJson);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.modelJson == null ? 43 : this.modelJson.hashCode());
        return result;
    }


}
