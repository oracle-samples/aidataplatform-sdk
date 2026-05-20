// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Model output.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelOutput.Builder.class)

public final class ModelOutput  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId", "step"})
    public ModelOutput(String modelId, Long step) {
        super();
        this.modelId = modelId;
        this.step = step;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the model input.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_id")
private String modelId;

        /**
         * ID of the model input.
         * @param modelId the value to set
         * @return this builder
         **/
        

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}
            /**
     * Step at which the model was produced.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("step")
private Long step;

        /**
         * Step at which the model was produced.
         * @param step the value to set
         * @return this builder
         **/
        

public Builder step(Long step) {
    this.step = step;
    return this;
}


        public ModelOutput build() {
            ModelOutput model = new ModelOutput(this.modelId
                , this.step);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelOutput model) {
                this.modelId(model.getModelId());
    this.step(model.getStep());
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
     * ID of the model input.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_id")
    private final String modelId;

        /**
     * ID of the model input.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * Step at which the model was produced.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("step")
    private final Long step;

        /**
     * Step at which the model was produced.
     * @return the value
     **/
    
    public Long getStep() {
        return step;
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
        sb.append("ModelOutput(");
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", step=").append(String.valueOf(this.step));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelOutput)) {
            return false;
        }

        ModelOutput other = (ModelOutput) o;
        return java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.step, other.step);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.step == null ? 43 : this.step.hashCode());
        return result;
    }


}
