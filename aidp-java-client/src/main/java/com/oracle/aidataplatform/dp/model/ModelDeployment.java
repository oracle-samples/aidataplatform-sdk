// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A model deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelDeployment.Builder.class)

public final class ModelDeployment  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "name", "description", "modelName", "deploymentTargets", "workspaceKey", "computeKey", "status", "activatedTime", "activatedBy", "servingUri", "createdTime", "updatedTime", "createdBy", "updatedBy", "tags", "authType", "authDetails"})
    public ModelDeployment(String deploymentId, String name, String description, String modelName, java.util.List<DeploymentTarget> deploymentTargets, String workspaceKey, String computeKey, DeploymentStatus status, Long activatedTime, String activatedBy, String servingUri, String createdTime, String updatedTime, String createdBy, String updatedBy, java.util.List<ModelDeploymentTag> tags, DeploymentAuthType authType, DeploymentOAuthDetails authDetails) {
        super();
        this.deploymentId = deploymentId;
        this.name = name;
        this.description = description;
        this.modelName = modelName;
        this.deploymentTargets = deploymentTargets;
        this.workspaceKey = workspaceKey;
        this.computeKey = computeKey;
        this.status = status;
        this.activatedTime = activatedTime;
        this.activatedBy = activatedBy;
        this.servingUri = servingUri;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.tags = tags;
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
     * Name of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the deployment.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the deployment.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
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
     * Workspace key of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * Workspace key of the deployment.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Compute key of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeKey")
private String computeKey;

        /**
         * Compute key of the deployment.
         * @param computeKey the value to set
         * @return this builder
         **/
        

public Builder computeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
}
            /**
     * Status of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private DeploymentStatus status;

        /**
         * Status of the deployment.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(DeploymentStatus status) {
    this.status = status;
    return this;
}
            /**
     * Unix timestamp in milliseconds of when the deployment was activated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activated_time")
private Long activatedTime;

        /**
         * Unix timestamp in milliseconds of when the deployment was activated.
         * @param activatedTime the value to set
         * @return this builder
         **/
        

public Builder activatedTime(Long activatedTime) {
    this.activatedTime = activatedTime;
    return this;
}
            /**
     * User that activated the model deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activated_by")
private String activatedBy;

        /**
         * User that activated the model deployment.
         * @param activatedBy the value to set
         * @return this builder
         **/
        

public Builder activatedBy(String activatedBy) {
    this.activatedBy = activatedBy;
    return this;
}
            /**
     * Serving URI of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("serving_uri")
private String servingUri;

        /**
         * Serving URI of the deployment.
         * @param servingUri the value to set
         * @return this builder
         **/
        

public Builder servingUri(String servingUri) {
    this.servingUri = servingUri;
    return this;
}
            /**
     * Unix timestamp in milliseconds of when the deployment was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("created_time")
private String createdTime;

        /**
         * Unix timestamp in milliseconds of when the deployment was created.
         * @param createdTime the value to set
         * @return this builder
         **/
        

public Builder createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
}
            /**
     * Unix timestamp in milliseconds of when the deployment was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updated_time")
private String updatedTime;

        /**
         * Unix timestamp in milliseconds of when the deployment was updated.
         * @param updatedTime the value to set
         * @return this builder
         **/
        

public Builder updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
}
            /**
     * User that created the model deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("created_by")
private String createdBy;

        /**
         * User that created the model deployment.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * User that last updated the model deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updated_by")
private String updatedBy;

        /**
         * User that last updated the model deployment.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
     * Authentication mechanism selected for the deployment's query endpoint.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authType")
private DeploymentAuthType authType;

        /**
         * Authentication mechanism selected for the deployment's query endpoint.
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


        public ModelDeployment build() {
            ModelDeployment model = new ModelDeployment(this.deploymentId
                , this.name
                , this.description
                , this.modelName
                , this.deploymentTargets
                , this.workspaceKey
                , this.computeKey
                , this.status
                , this.activatedTime
                , this.activatedBy
                , this.servingUri
                , this.createdTime
                , this.updatedTime
                , this.createdBy
                , this.updatedBy
                , this.tags
                , this.authType
                , this.authDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeployment model) {
                this.deploymentId(model.getDeploymentId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.modelName(model.getModelName());
    this.deploymentTargets(model.getDeploymentTargets());
    this.workspaceKey(model.getWorkspaceKey());
    this.computeKey(model.getComputeKey());
    this.status(model.getStatus());
    this.activatedTime(model.getActivatedTime());
    this.activatedBy(model.getActivatedBy());
    this.servingUri(model.getServingUri());
    this.createdTime(model.getCreatedTime());
    this.updatedTime(model.getUpdatedTime());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
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
     * Name of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the deployment.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the deployment.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
     * Workspace key of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Workspace key of the deployment.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Compute key of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * Compute key of the deployment.
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }

    
        /**
     * Status of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DeploymentStatus status;

        /**
     * Status of the deployment.
     * @return the value
     **/
    
    public DeploymentStatus getStatus() {
        return status;
    }


        /**
     * Unix timestamp in milliseconds of when the deployment was activated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activated_time")
    private final Long activatedTime;

        /**
     * Unix timestamp in milliseconds of when the deployment was activated.
     * @return the value
     **/
    
    public Long getActivatedTime() {
        return activatedTime;
    }


        /**
     * User that activated the model deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activated_by")
    private final String activatedBy;

        /**
     * User that activated the model deployment.
     * @return the value
     **/
    
    public String getActivatedBy() {
        return activatedBy;
    }


        /**
     * Serving URI of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("serving_uri")
    private final String servingUri;

        /**
     * Serving URI of the deployment.
     * @return the value
     **/
    
    public String getServingUri() {
        return servingUri;
    }


        /**
     * Unix timestamp in milliseconds of when the deployment was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("created_time")
    private final String createdTime;

        /**
     * Unix timestamp in milliseconds of when the deployment was created.
     * @return the value
     **/
    
    public String getCreatedTime() {
        return createdTime;
    }


        /**
     * Unix timestamp in milliseconds of when the deployment was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updated_time")
    private final String updatedTime;

        /**
     * Unix timestamp in milliseconds of when the deployment was updated.
     * @return the value
     **/
    
    public String getUpdatedTime() {
        return updatedTime;
    }


        /**
     * User that created the model deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("created_by")
    private final String createdBy;

        /**
     * User that created the model deployment.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * User that last updated the model deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updated_by")
    private final String updatedBy;

        /**
     * User that last updated the model deployment.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
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
     * Authentication mechanism selected for the deployment's query endpoint.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    private final DeploymentAuthType authType;

        /**
     * Authentication mechanism selected for the deployment's query endpoint.
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
        sb.append("ModelDeployment(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", activatedTime=").append(String.valueOf(this.activatedTime));
        sb.append(", activatedBy=").append(String.valueOf(this.activatedBy));
        sb.append(", servingUri=").append(String.valueOf(this.servingUri));
        sb.append(", createdTime=").append(String.valueOf(this.createdTime));
        sb.append(", updatedTime=").append(String.valueOf(this.updatedTime));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
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
        if (!(o instanceof ModelDeployment)) {
            return false;
        }

        ModelDeployment other = (ModelDeployment) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.activatedTime, other.activatedTime) &&
            java.util.Objects.equals(this.activatedBy, other.activatedBy) &&
            java.util.Objects.equals(this.servingUri, other.servingUri) &&
            java.util.Objects.equals(this.createdTime, other.createdTime) &&
            java.util.Objects.equals(this.updatedTime, other.updatedTime) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.tags, other.tags) &&
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
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.activatedTime == null ? 43 : this.activatedTime.hashCode());
        result = (result * PRIME) + (this.activatedBy == null ? 43 : this.activatedBy.hashCode());
        result = (result * PRIME) + (this.servingUri == null ? 43 : this.servingUri.hashCode());
        result = (result * PRIME) + (this.createdTime == null ? 43 : this.createdTime.hashCode());
        result = (result * PRIME) + (this.updatedTime == null ? 43 : this.updatedTime.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.authType == null ? 43 : this.authType.hashCode());
        result = (result * PRIME) + (this.authDetails == null ? 43 : this.authDetails.hashCode());
        return result;
    }


}
