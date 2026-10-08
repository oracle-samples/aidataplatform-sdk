// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to roll a model deployment back to a lower model version of the same registered model. Exactly one deployment target may be provided; its model_version must be lower than the version currently configured on the deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RollBackModelDeploymentDetails.Builder.class)

public final class RollBackModelDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "message", "deploymentTargets"})
    public RollBackModelDeploymentDetails(String deploymentId, String message, java.util.List<DeploymentTarget> deploymentTargets) {
        super();
        this.deploymentId = deploymentId;
        this.message = message;
        this.deploymentTargets = deploymentTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment to roll back.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
private String deploymentId;

        /**
         * ID of the deployment to roll back.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
            /**
     * Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * The single target model version to roll back to (exactly one, at 100% traffic).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
private java.util.List<DeploymentTarget> deploymentTargets;

        /**
         * The single target model version to roll back to (exactly one, at 100% traffic).
         * @param deploymentTargets the value to set
         * @return this builder
         **/
        

public Builder deploymentTargets(java.util.List<DeploymentTarget> deploymentTargets) {
    this.deploymentTargets = deploymentTargets;
    return this;
}


        public RollBackModelDeploymentDetails build() {
            RollBackModelDeploymentDetails model = new RollBackModelDeploymentDetails(this.deploymentId
                , this.message
                , this.deploymentTargets);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RollBackModelDeploymentDetails model) {
                this.deploymentId(model.getDeploymentId());
    this.message(model.getMessage());
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
     * ID of the deployment to roll back.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
    private final String deploymentId;

        /**
     * ID of the deployment to roll back.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
    }


        /**
     * Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Optional deployment roll-back message. At most 2000 characters and 2000 UTF-8 bytes.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * The single target model version to roll back to (exactly one, at 100% traffic).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
    private final java.util.List<DeploymentTarget> deploymentTargets;

        /**
     * The single target model version to roll back to (exactly one, at 100% traffic).
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
        sb.append("RollBackModelDeploymentDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RollBackModelDeploymentDetails)) {
            return false;
        }

        RollBackModelDeploymentDetails other = (RollBackModelDeploymentDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        return result;
    }


}
