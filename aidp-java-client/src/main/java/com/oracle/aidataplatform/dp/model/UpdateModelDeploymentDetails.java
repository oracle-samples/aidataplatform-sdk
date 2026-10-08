// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a model deployment. The registered model and model version cannot be changed here; use the roll-forward and roll-back actions instead.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateModelDeploymentDetails.Builder.class)

public final class UpdateModelDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "name", "description", "workspaceKey", "computeKey", "deploymentTargets", "authType", "authDetails"})
    public UpdateModelDeploymentDetails(String deploymentId, String name, String description, String workspaceKey, String computeKey, java.util.List<DeploymentTarget> deploymentTargets, DeploymentAuthType authType, DeploymentOAuthDetails authDetails) {
        super();
        this.deploymentId = deploymentId;
        this.name = name;
        this.description = description;
        this.workspaceKey = workspaceKey;
        this.computeKey = computeKey;
        this.deploymentTargets = deploymentTargets;
        this.authType = authType;
        this.authDetails = authDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
private String deploymentId;

        /**
         * ID of the deployment.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
            /**
     * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeKey")
private String computeKey;

        /**
         * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
         * @param computeKey the value to set
         * @return this builder
         **/
        

public Builder computeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
}
            /**
     * Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
private java.util.List<DeploymentTarget> deploymentTargets;

        /**
         * Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
         * @param deploymentTargets the value to set
         * @return this builder
         **/
        

public Builder deploymentTargets(java.util.List<DeploymentTarget> deploymentTargets) {
    this.deploymentTargets = deploymentTargets;
    return this;
}
            /**
     * Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authType")
private DeploymentAuthType authType;

        /**
         * Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.
         * @param authType the value to set
         * @return this builder
         **/
        

public Builder authType(DeploymentAuthType authType) {
    this.authType = authType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("authDetails")
private DeploymentOAuthDetails authDetails;



public Builder authDetails(DeploymentOAuthDetails authDetails) {
    this.authDetails = authDetails;
    return this;
}


        public UpdateModelDeploymentDetails build() {
            UpdateModelDeploymentDetails model = new UpdateModelDeploymentDetails(this.deploymentId
                , this.name
                , this.description
                , this.workspaceKey
                , this.computeKey
                , this.deploymentTargets
                , this.authType
                , this.authDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDeploymentDetails model) {
                this.deploymentId(model.getDeploymentId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.workspaceKey(model.getWorkspaceKey());
    this.computeKey(model.getComputeKey());
    this.deploymentTargets(model.getDeploymentTargets());
    this.authType(model.getAuthType());
    this.authDetails(model.getAuthDetails());
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
     * ID of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
    private final String deploymentId;

        /**
     * ID of the deployment.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
    }


        /**
     * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }


        /**
     * Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
    private final java.util.List<DeploymentTarget> deploymentTargets;

        /**
     * Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
     * @return the value
     **/
    
    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        return deploymentTargets;
    }

    
        /**
     * Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    private final DeploymentAuthType authType;

        /**
     * Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.
     * @return the value
     **/
    
    public DeploymentAuthType getAuthType() {
        return authType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
    private final DeploymentOAuthDetails authDetails;

    
    public DeploymentOAuthDetails getAuthDetails() {
        return authDetails;
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
        sb.append("UpdateModelDeploymentDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(", authType=").append(String.valueOf(this.authType));
        sb.append(", authDetails=").append(String.valueOf(this.authDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDeploymentDetails)) {
            return false;
        }

        UpdateModelDeploymentDetails other = (UpdateModelDeploymentDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets) &&
            java.util.Objects.equals(this.authType, other.authType) &&
            java.util.Objects.equals(this.authDetails, other.authDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        result = (result * PRIME) + (this.authType == null ? 43 : this.authType.hashCode());
        result = (result * PRIME) + (this.authDetails == null ? 43 : this.authDetails.hashCode());
        return result;
    }


}
