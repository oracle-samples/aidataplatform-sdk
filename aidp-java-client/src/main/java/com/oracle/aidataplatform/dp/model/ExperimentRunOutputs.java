package com.oracle.aidataplatform.dp.model;



/**
 * Run outputs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunOutputs.Builder.class)

public final class ExperimentRunOutputs  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelOutputs"})
    public ExperimentRunOutputs(java.util.List<ModelOutput> modelOutputs) {
        super();
        this.modelOutputs = modelOutputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Model outputs for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_outputs")
private java.util.List<ModelOutput> modelOutputs;

        /**
         * Model outputs for the run.
         * @param modelOutputs the value to set
         * @return this builder
         **/
        

public Builder modelOutputs(java.util.List<ModelOutput> modelOutputs) {
    this.modelOutputs = modelOutputs;
    return this;
}


        public ExperimentRunOutputs build() {
            ExperimentRunOutputs model = new ExperimentRunOutputs(this.modelOutputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunOutputs model) {
                this.modelOutputs(model.getModelOutputs());
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
     * Model outputs for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_outputs")
    private final java.util.List<ModelOutput> modelOutputs;

        /**
     * Model outputs for the run.
     * @return the value
     **/
    
    public java.util.List<ModelOutput> getModelOutputs() {
        return modelOutputs;
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
        sb.append("ExperimentRunOutputs(");
        sb.append("modelOutputs=").append(String.valueOf(this.modelOutputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRunOutputs)) {
            return false;
        }

        ExperimentRunOutputs other = (ExperimentRunOutputs) o;
        return java.util.Objects.equals(this.modelOutputs, other.modelOutputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelOutputs == null ? 43 : this.modelOutputs.hashCode());
        return result;
    }


}
