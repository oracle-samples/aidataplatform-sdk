// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to create a model deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateModelDeploymentDetails.Builder.class)

public final class CreateModelDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "modelName", "deploymentTargets", "workspaceKey", "computeKey", "tags", "authType", "authDetails"})
    public CreateModelDeploymentDetails(String name, String description, String modelName, java.util.List<DeploymentTarget> deploymentTargets, String workspaceKey, String computeKey, java.util.List<ModelDeploymentTag> tags, DeploymentAuthType authType, DeploymentOAuthDetails authDetails) {
        super();
        this.name = name;
        this.description = description;
        this.modelName = modelName;
        this.deploymentTargets = deploymentTargets;
        this.workspaceKey = workspaceKey;
        this.computeKey = computeKey;
        this.tags = tags;
        this.authType = authType;
        this.authDetails = authDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_name")
private String modelName;

        /**
         * Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
            /**
     * Deployment targets of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
private java.util.List<DeploymentTarget> deploymentTargets;

        /**
         * Deployment targets of the deployment.
         * @param deploymentTargets the value to set
         * @return this builder
         **/
        

public Builder deploymentTargets(java.util.List<DeploymentTarget> deploymentTargets) {
    this.deploymentTargets = deploymentTargets;
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
     * List of tags set on the model deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.List<ModelDeploymentTag> tags;

        /**
         * List of tags set on the model deployment.
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.List<ModelDeploymentTag> tags) {
    this.tags = tags;
    return this;
}
            /**
     * Authentication mechanism for the deployment's query endpoint. Required.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authType")
private DeploymentAuthType authType;

        /**
         * Authentication mechanism for the deployment's query endpoint. Required.
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


        public CreateModelDeploymentDetails build() {
            CreateModelDeploymentDetails model = new CreateModelDeploymentDetails(this.name
                , this.description
                , this.modelName
                , this.deploymentTargets
                , this.workspaceKey
                , this.computeKey
                , this.tags
                , this.authType
                , this.authDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateModelDeploymentDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.modelName(model.getModelName());
    this.deploymentTargets(model.getDeploymentTargets());
    this.workspaceKey(model.getWorkspaceKey());
    this.computeKey(model.getComputeKey());
    this.tags(model.getTags());
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
     * Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_name")
    private final String modelName;

        /**
     * Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


        /**
     * Deployment targets of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
    private final java.util.List<DeploymentTarget> deploymentTargets;

        /**
     * Deployment targets of the deployment.
     * @return the value
     **/
    
    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        return deploymentTargets;
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
     * List of tags set on the model deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<ModelDeploymentTag> tags;

        /**
     * List of tags set on the model deployment.
     * @return the value
     **/
    
    public java.util.List<ModelDeploymentTag> getTags() {
        return tags;
    }

    
        /**
     * Authentication mechanism for the deployment's query endpoint. Required.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    private final DeploymentAuthType authType;

        /**
     * Authentication mechanism for the deployment's query endpoint. Required.
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
        sb.append("CreateModelDeploymentDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", tags=").append(String.valueOf(this.tags));
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
        if (!(o instanceof CreateModelDeploymentDetails)) {
            return false;
        }

        CreateModelDeploymentDetails other = (CreateModelDeploymentDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.authType, other.authType) &&
            java.util.Objects.equals(this.authDetails, other.authDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.authType == null ? 43 : this.authType.hashCode());
        result = (result * PRIME) + (this.authDetails == null ? 43 : this.authDetails.hashCode());
        return result;
    }


}
