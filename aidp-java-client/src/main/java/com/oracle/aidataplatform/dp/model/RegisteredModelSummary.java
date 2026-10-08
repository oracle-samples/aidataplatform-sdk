// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Aggregate counts of the registered-model footprint within a catalog and schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RegisteredModelSummary.Builder.class)

public final class RegisteredModelSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"registeredModelsCount", "modelVersionsCount", "modelDeploymentsCount", "activeDeploymentCount"})
    public RegisteredModelSummary(Long registeredModelsCount, Long modelVersionsCount, Long modelDeploymentsCount, Long activeDeploymentCount) {
        super();
        this.registeredModelsCount = registeredModelsCount;
        this.modelVersionsCount = modelVersionsCount;
        this.modelDeploymentsCount = modelDeploymentsCount;
        this.activeDeploymentCount = activeDeploymentCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Number of registered models in the catalog and schema.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("registered_models_count")
private Long registeredModelsCount;

        /**
         * Number of registered models in the catalog and schema.
         * @param registeredModelsCount the value to set
         * @return this builder
         **/
        

public Builder registeredModelsCount(Long registeredModelsCount) {
    this.registeredModelsCount = registeredModelsCount;
    return this;
}
            /**
     * Number of model versions across those registered models.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_versions_count")
private Long modelVersionsCount;

        /**
         * Number of model versions across those registered models.
         * @param modelVersionsCount the value to set
         * @return this builder
         **/
        

public Builder modelVersionsCount(Long modelVersionsCount) {
    this.modelVersionsCount = modelVersionsCount;
    return this;
}
            /**
     * Number of model deployments across those registered models.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_deployments_count")
private Long modelDeploymentsCount;

        /**
         * Number of model deployments across those registered models.
         * @param modelDeploymentsCount the value to set
         * @return this builder
         **/
        

public Builder modelDeploymentsCount(Long modelDeploymentsCount) {
    this.modelDeploymentsCount = modelDeploymentsCount;
    return this;
}
            /**
     * Number of model deployments that are currently active.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("active_deployment_count")
private Long activeDeploymentCount;

        /**
         * Number of model deployments that are currently active.
         * @param activeDeploymentCount the value to set
         * @return this builder
         **/
        

public Builder activeDeploymentCount(Long activeDeploymentCount) {
    this.activeDeploymentCount = activeDeploymentCount;
    return this;
}


        public RegisteredModelSummary build() {
            RegisteredModelSummary model = new RegisteredModelSummary(this.registeredModelsCount
                , this.modelVersionsCount
                , this.modelDeploymentsCount
                , this.activeDeploymentCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisteredModelSummary model) {
                this.registeredModelsCount(model.getRegisteredModelsCount());
    this.modelVersionsCount(model.getModelVersionsCount());
    this.modelDeploymentsCount(model.getModelDeploymentsCount());
    this.activeDeploymentCount(model.getActiveDeploymentCount());
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
     * Number of registered models in the catalog and schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("registered_models_count")
    private final Long registeredModelsCount;

        /**
     * Number of registered models in the catalog and schema.
     * @return the value
     **/
    
    public Long getRegisteredModelsCount() {
        return registeredModelsCount;
    }


        /**
     * Number of model versions across those registered models.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_versions_count")
    private final Long modelVersionsCount;

        /**
     * Number of model versions across those registered models.
     * @return the value
     **/
    
    public Long getModelVersionsCount() {
        return modelVersionsCount;
    }


        /**
     * Number of model deployments across those registered models.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_deployments_count")
    private final Long modelDeploymentsCount;

        /**
     * Number of model deployments across those registered models.
     * @return the value
     **/
    
    public Long getModelDeploymentsCount() {
        return modelDeploymentsCount;
    }


        /**
     * Number of model deployments that are currently active.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("active_deployment_count")
    private final Long activeDeploymentCount;

        /**
     * Number of model deployments that are currently active.
     * @return the value
     **/
    
    public Long getActiveDeploymentCount() {
        return activeDeploymentCount;
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
        sb.append("RegisteredModelSummary(");
        sb.append("registeredModelsCount=").append(String.valueOf(this.registeredModelsCount));
        sb.append(", modelVersionsCount=").append(String.valueOf(this.modelVersionsCount));
        sb.append(", modelDeploymentsCount=").append(String.valueOf(this.modelDeploymentsCount));
        sb.append(", activeDeploymentCount=").append(String.valueOf(this.activeDeploymentCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisteredModelSummary)) {
            return false;
        }

        RegisteredModelSummary other = (RegisteredModelSummary) o;
        return java.util.Objects.equals(this.registeredModelsCount, other.registeredModelsCount) &&
            java.util.Objects.equals(this.modelVersionsCount, other.modelVersionsCount) &&
            java.util.Objects.equals(this.modelDeploymentsCount, other.modelDeploymentsCount) &&
            java.util.Objects.equals(this.activeDeploymentCount, other.activeDeploymentCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.registeredModelsCount == null ? 43 : this.registeredModelsCount.hashCode());
        result = (result * PRIME) + (this.modelVersionsCount == null ? 43 : this.modelVersionsCount.hashCode());
        result = (result * PRIME) + (this.modelDeploymentsCount == null ? 43 : this.modelDeploymentsCount.hashCode());
        result = (result * PRIME) + (this.activeDeploymentCount == null ? 43 : this.activeDeploymentCount.hashCode());
        return result;
    }


}
