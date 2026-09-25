// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary of a model deployment returned by a search.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelDeploymentSummary.Builder.class)

public final class ModelDeploymentSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "name", "description", "modelName", "status", "createdBy", "createdTime", "activatedTime", "activatedBy", "servingUri", "updatedTime", "updatedBy"})
    public ModelDeploymentSummary(String deploymentId, String name, String description, String modelName, DeploymentStatus status, String createdBy, String createdTime, Long activatedTime, String activatedBy, String servingUri, String updatedTime, String updatedBy) {
        super();
        this.deploymentId = deploymentId;
        this.name = name;
        this.description = description;
        this.modelName = modelName;
        this.status = status;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.activatedTime = activatedTime;
        this.activatedBy = activatedBy;
        this.servingUri = servingUri;
        this.updatedTime = updatedTime;
        this.updatedBy = updatedBy;
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


        public ModelDeploymentSummary build() {
            ModelDeploymentSummary model = new ModelDeploymentSummary(this.deploymentId
                , this.name
                , this.description
                , this.modelName
                , this.status
                , this.createdBy
                , this.createdTime
                , this.activatedTime
                , this.activatedBy
                , this.servingUri
                , this.updatedTime
                , this.updatedBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentSummary model) {
                this.deploymentId(model.getDeploymentId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.modelName(model.getModelName());
    this.status(model.getStatus());
    this.createdBy(model.getCreatedBy());
    this.createdTime(model.getCreatedTime());
    this.activatedTime(model.getActivatedTime());
    this.activatedBy(model.getActivatedBy());
    this.servingUri(model.getServingUri());
    this.updatedTime(model.getUpdatedTime());
    this.updatedBy(model.getUpdatedBy());
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
        sb.append("ModelDeploymentSummary(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdTime=").append(String.valueOf(this.createdTime));
        sb.append(", activatedTime=").append(String.valueOf(this.activatedTime));
        sb.append(", activatedBy=").append(String.valueOf(this.activatedBy));
        sb.append(", servingUri=").append(String.valueOf(this.servingUri));
        sb.append(", updatedTime=").append(String.valueOf(this.updatedTime));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentSummary)) {
            return false;
        }

        ModelDeploymentSummary other = (ModelDeploymentSummary) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdTime, other.createdTime) &&
            java.util.Objects.equals(this.activatedTime, other.activatedTime) &&
            java.util.Objects.equals(this.activatedBy, other.activatedBy) &&
            java.util.Objects.equals(this.servingUri, other.servingUri) &&
            java.util.Objects.equals(this.updatedTime, other.updatedTime) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdTime == null ? 43 : this.createdTime.hashCode());
        result = (result * PRIME) + (this.activatedTime == null ? 43 : this.activatedTime.hashCode());
        result = (result * PRIME) + (this.activatedBy == null ? 43 : this.activatedBy.hashCode());
        result = (result * PRIME) + (this.servingUri == null ? 43 : this.servingUri.hashCode());
        result = (result * PRIME) + (this.updatedTime == null ? 43 : this.updatedTime.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        return result;
    }


}
