// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The parameter details of each model
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelParameter.Builder.class)

public final class ModelParameter  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelName", "modelParameters"})
    public ModelParameter(String modelName, ModelParameterResponse modelParameters) {
        super();
        this.modelName = modelName;
        this.modelParameters = modelParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * name of the model
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelName")
private String modelName;

        /**
         * name of the model
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("modelParameters")
private ModelParameterResponse modelParameters;



public Builder modelParameters(ModelParameterResponse modelParameters) {
    this.modelParameters = modelParameters;
    return this;
}


        public ModelParameter build() {
            ModelParameter model = new ModelParameter(this.modelName
                , this.modelParameters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelParameter model) {
                this.modelName(model.getModelName());
    this.modelParameters(model.getModelParameters());
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
     * name of the model
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelName")
    private final String modelName;

        /**
     * name of the model
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("modelParameters")
    private final ModelParameterResponse modelParameters;

    
    public ModelParameterResponse getModelParameters() {
        return modelParameters;
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
        sb.append("ModelParameter(");
        sb.append("modelName=").append(String.valueOf(this.modelName));
        sb.append(", modelParameters=").append(String.valueOf(this.modelParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelParameter)) {
            return false;
        }

        ModelParameter other = (ModelParameter) o;
        return java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.modelParameters, other.modelParameters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.modelParameters == null ? 43 : this.modelParameters.hashCode());
        return result;
    }


}
