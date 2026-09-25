// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Model contract for the query-endpoint playground: input/output signatures and a sample request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GetModelDeploymentContractResponse.Builder.class)

public final class GetModelDeploymentContractResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"inputContract", "outputContract", "inputExample"})
    public GetModelDeploymentContractResponse(String inputContract, String outputContract, String inputExample) {
        super();
        this.inputContract = inputContract;
        this.outputContract = outputContract;
        this.inputExample = inputExample;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Model input signature (contract), captured at activation; null if the model has no signature.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("input_contract")
private String inputContract;

        /**
         * Model input signature (contract), captured at activation; null if the model has no signature.
         * @param inputContract the value to set
         * @return this builder
         **/
        

public Builder inputContract(String inputContract) {
    this.inputContract = inputContract;
    return this;
}
            /**
     * Model output signature (contract), captured at activation; null if the model has no signature.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("output_contract")
private String outputContract;

        /**
         * Model output signature (contract), captured at activation; null if the model has no signature.
         * @param outputContract the value to set
         * @return this builder
         **/
        

public Builder outputContract(String outputContract) {
    this.outputContract = outputContract;
    return this;
}
            /**
     * Sample request payload (input example), captured at activation; null if the model has no example.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("input_example")
private String inputExample;

        /**
         * Sample request payload (input example), captured at activation; null if the model has no example.
         * @param inputExample the value to set
         * @return this builder
         **/
        

public Builder inputExample(String inputExample) {
    this.inputExample = inputExample;
    return this;
}


        public GetModelDeploymentContractResponse build() {
            GetModelDeploymentContractResponse model = new GetModelDeploymentContractResponse(this.inputContract
                , this.outputContract
                , this.inputExample);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetModelDeploymentContractResponse model) {
                this.inputContract(model.getInputContract());
    this.outputContract(model.getOutputContract());
    this.inputExample(model.getInputExample());
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
     * Model input signature (contract), captured at activation; null if the model has no signature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("input_contract")
    private final String inputContract;

        /**
     * Model input signature (contract), captured at activation; null if the model has no signature.
     * @return the value
     **/
    
    public String getInputContract() {
        return inputContract;
    }


        /**
     * Model output signature (contract), captured at activation; null if the model has no signature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("output_contract")
    private final String outputContract;

        /**
     * Model output signature (contract), captured at activation; null if the model has no signature.
     * @return the value
     **/
    
    public String getOutputContract() {
        return outputContract;
    }


        /**
     * Sample request payload (input example), captured at activation; null if the model has no example.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("input_example")
    private final String inputExample;

        /**
     * Sample request payload (input example), captured at activation; null if the model has no example.
     * @return the value
     **/
    
    public String getInputExample() {
        return inputExample;
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
        sb.append("GetModelDeploymentContractResponse(");
        sb.append("inputContract=").append(String.valueOf(this.inputContract));
        sb.append(", outputContract=").append(String.valueOf(this.outputContract));
        sb.append(", inputExample=").append(String.valueOf(this.inputExample));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetModelDeploymentContractResponse)) {
            return false;
        }

        GetModelDeploymentContractResponse other = (GetModelDeploymentContractResponse) o;
        return java.util.Objects.equals(this.inputContract, other.inputContract) &&
            java.util.Objects.equals(this.outputContract, other.outputContract) &&
            java.util.Objects.equals(this.inputExample, other.inputExample);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inputContract == null ? 43 : this.inputContract.hashCode());
        result = (result * PRIME) + (this.outputContract == null ? 43 : this.outputContract.hashCode());
        result = (result * PRIME) + (this.inputExample == null ? 43 : this.inputExample.hashCode());
        return result;
    }


}
