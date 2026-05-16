// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of an experiment run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRun.Builder.class)

public final class ExperimentRun  {
    @Deprecated
    @java.beans.ConstructorProperties({"info", "data", "inputs", "outputs"})
    public ExperimentRun(ExperimentRunInfo info, ExperimentRunData data, ExperimentRunInputs inputs, ExperimentRunOutputs outputs) {
        super();
        this.info = info;
        this.data = data;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("info")
        private ExperimentRunInfo info;

        

        public Builder info(ExperimentRunInfo info) {
        this.info = info;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private ExperimentRunData data;

        

        public Builder data(ExperimentRunData data) {
        this.data = data;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private ExperimentRunInputs inputs;

        

        public Builder inputs(ExperimentRunInputs inputs) {
        this.inputs = inputs;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private ExperimentRunOutputs outputs;

        

        public Builder outputs(ExperimentRunOutputs outputs) {
        this.outputs = outputs;
        return this;
        }


        public ExperimentRun build() {
            ExperimentRun model = new ExperimentRun(this.info
                    , this.data
                    , this.inputs
                    , this.outputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRun model) {
                this.info(model.getInfo());
    this.data(model.getData());
    this.inputs(model.getInputs());
    this.outputs(model.getOutputs());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("info")
    private final ExperimentRunInfo info;

    
    public ExperimentRunInfo getInfo() {
        return info;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final ExperimentRunData data;

    
    public ExperimentRunData getData() {
        return data;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final ExperimentRunInputs inputs;

    
    public ExperimentRunInputs getInputs() {
        return inputs;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final ExperimentRunOutputs outputs;

    
    public ExperimentRunOutputs getOutputs() {
        return outputs;
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
        sb.append("ExperimentRun(");
        sb.append("info=").append(String.valueOf(this.info));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRun)) {
            return false;
        }

        ExperimentRun other = (ExperimentRun) o;
        return java.util.Objects.equals(this.info, other.info) &&
            java.util.Objects.equals(this.data, other.data) &&
            java.util.Objects.equals(this.inputs, other.inputs) &&
            java.util.Objects.equals(this.outputs, other.outputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.info == null ? 43 : this.info.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        return result;
    }


}
