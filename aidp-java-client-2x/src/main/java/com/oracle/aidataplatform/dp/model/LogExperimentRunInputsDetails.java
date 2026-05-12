package com.oracle.aidataplatform.dp.model;


/**
 * Run inputs.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunInputsDetails.Builder.class)

public final class LogExperimentRunInputsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "datasetInputs"})
    public LogExperimentRunInputsDetails(String runId, java.util.List<DatasetInput> datasetInputs) {
        super();
        this.runId = runId;
        this.datasetInputs = datasetInputs;
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
     * Dataset inputs for the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dataset_inputs")
        private java.util.List<DatasetInput> datasetInputs;

                /**
         * Dataset inputs for the run.
         * @param datasetInputs the value to set
         * @return this builder
         **/
        

        public Builder datasetInputs(java.util.List<DatasetInput> datasetInputs) {
        this.datasetInputs = datasetInputs;
        return this;
        }


        public LogExperimentRunInputsDetails build() {
            LogExperimentRunInputsDetails model = new LogExperimentRunInputsDetails(this.runId
                    , this.datasetInputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunInputsDetails model) {
                this.runId(model.getRunId());
    this.datasetInputs(model.getDatasetInputs());
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
     * Dataset inputs for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataset_inputs")
    private final java.util.List<DatasetInput> datasetInputs;

        /**
     * Dataset inputs for the run.
     * @return the value
     **/
    
    public java.util.List<DatasetInput> getDatasetInputs() {
        return datasetInputs;
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
        sb.append("LogExperimentRunInputsDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", datasetInputs=").append(String.valueOf(this.datasetInputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunInputsDetails)) {
            return false;
        }

        LogExperimentRunInputsDetails other = (LogExperimentRunInputsDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.datasetInputs, other.datasetInputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.datasetInputs == null ? 43 : this.datasetInputs.hashCode());
        return result;
    }


}
