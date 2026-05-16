// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Run inputs.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunInputs.Builder.class)

public final class ExperimentRunInputs  {
    @Deprecated
    @java.beans.ConstructorProperties({"datasetInputs", "modelInputs"})
    public ExperimentRunInputs(java.util.List<DatasetInput> datasetInputs, java.util.List<ModelInput> modelInputs) {
        super();
        this.datasetInputs = datasetInputs;
        this.modelInputs = modelInputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
            /**
     * Model inputs for the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("model_inputs")
        private java.util.List<ModelInput> modelInputs;

                /**
         * Model inputs for the run.
         * @param modelInputs the value to set
         * @return this builder
         **/
        

        public Builder modelInputs(java.util.List<ModelInput> modelInputs) {
        this.modelInputs = modelInputs;
        return this;
        }


        public ExperimentRunInputs build() {
            ExperimentRunInputs model = new ExperimentRunInputs(this.datasetInputs
                    , this.modelInputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunInputs model) {
                this.datasetInputs(model.getDatasetInputs());
    this.modelInputs(model.getModelInputs());
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


        /**
     * Model inputs for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_inputs")
    private final java.util.List<ModelInput> modelInputs;

        /**
     * Model inputs for the run.
     * @return the value
     **/
    
    public java.util.List<ModelInput> getModelInputs() {
        return modelInputs;
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
        sb.append("ExperimentRunInputs(");
        sb.append("datasetInputs=").append(String.valueOf(this.datasetInputs));
        sb.append(", modelInputs=").append(String.valueOf(this.modelInputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRunInputs)) {
            return false;
        }

        ExperimentRunInputs other = (ExperimentRunInputs) o;
        return java.util.Objects.equals(this.datasetInputs, other.datasetInputs) &&
            java.util.Objects.equals(this.modelInputs, other.modelInputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.datasetInputs == null ? 43 : this.datasetInputs.hashCode());
        result = (result * PRIME) + (this.modelInputs == null ? 43 : this.modelInputs.hashCode());
        return result;
    }


}
