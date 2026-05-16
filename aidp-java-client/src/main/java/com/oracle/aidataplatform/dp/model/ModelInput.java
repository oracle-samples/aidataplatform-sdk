// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Model input.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelInput.Builder.class)

public final class ModelInput  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId"})
    public ModelInput(String modelId) {
        super();
        this.modelId = modelId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the model input
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_id")
private String modelId;

        /**
         * ID of the model input
         * @param modelId the value to set
         * @return this builder
         **/
        

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}


        public ModelInput build() {
            ModelInput model = new ModelInput(this.modelId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelInput model) {
                this.modelId(model.getModelId());
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
     * ID of the model input
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_id")
    private final String modelId;

        /**
     * ID of the model input
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
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
        sb.append("ModelInput(");
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelInput)) {
            return false;
        }

        ModelInput other = (ModelInput) o;
        return java.util.Objects.equals(this.modelId, other.modelId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        return result;
    }


}
