// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Minimal deployment configuration for a deployment-activity list row: the registered model and the served model versions. The full configuration snapshot is available from the single-activity read.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentDetailsSummary.Builder.class)

public final class DeploymentDetailsSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelName", "deploymentTargets"})
    public DeploymentDetailsSummary(String modelName, java.util.List<DeploymentTarget> deploymentTargets) {
        super();
        this.modelName = modelName;
        this.deploymentTargets = deploymentTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the registered model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_name")
private String modelName;

        /**
         * Name of the registered model.
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
            /**
     * Model versions served by the deployment and their traffic share.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
private java.util.List<DeploymentTarget> deploymentTargets;

        /**
         * Model versions served by the deployment and their traffic share.
         * @param deploymentTargets the value to set
         * @return this builder
         **/
        

public Builder deploymentTargets(java.util.List<DeploymentTarget> deploymentTargets) {
    this.deploymentTargets = deploymentTargets;
    return this;
}


        public DeploymentDetailsSummary build() {
            DeploymentDetailsSummary model = new DeploymentDetailsSummary(this.modelName
                , this.deploymentTargets);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentDetailsSummary model) {
                this.modelName(model.getModelName());
    this.deploymentTargets(model.getDeploymentTargets());
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
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_name")
    private final String modelName;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


        /**
     * Model versions served by the deployment and their traffic share.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
    private final java.util.List<DeploymentTarget> deploymentTargets;

        /**
     * Model versions served by the deployment and their traffic share.
     * @return the value
     **/
    
    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        return deploymentTargets;
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
        sb.append("DeploymentDetailsSummary(");
        sb.append("modelName=").append(String.valueOf(this.modelName));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentDetailsSummary)) {
            return false;
        }

        DeploymentDetailsSummary other = (DeploymentDetailsSummary) o;
        return java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        return result;
    }


}
