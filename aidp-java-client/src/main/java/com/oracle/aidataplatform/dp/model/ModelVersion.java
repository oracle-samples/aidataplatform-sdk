// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the model version.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelVersion.Builder.class)

public final class ModelVersion  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "creationTimestamp", "lastUpdatedTimestamp", "userId", "currentStage", "description", "source", "runId", "status", "statusMessage", "tags", "runLink", "aliases", "modelId", "modelMetrics", "modelParams", "deploymentJobState"})
    public ModelVersion(String name, String version, Long creationTimestamp, Long lastUpdatedTimestamp, String userId, String currentStage, String description, String source, String runId, ModelVersionStatus status, String statusMessage, java.util.List<ModelVersionTag> tags, String runLink, java.util.List<String> aliases, String modelId, java.util.List<ModelMetric> modelMetrics, java.util.List<ModelParam> modelParams, ModelVersionDeploymentJobState deploymentJobState) {
        super();
        this.name = name;
        this.version = version;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.userId = userId;
        this.currentStage = currentStage;
        this.description = description;
        this.source = source;
        this.runId = runId;
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.runLink = runLink;
        this.aliases = aliases;
        this.modelId = modelId;
        this.modelMetrics = modelMetrics;
        this.modelParams = modelParams;
        this.deploymentJobState = deploymentJobState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique name for the model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Unique name for the model.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Model\u2019s version number.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * Model\u2019s version number.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(String version) {
    this.version = version;
    return this;
}
            /**
     * Timestamp in milliseconds when the model version was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp")
private Long creationTimestamp;

        /**
         * Timestamp in milliseconds when the model version was created.
         * @param creationTimestamp the value to set
         * @return this builder
         **/
        

public Builder creationTimestamp(Long creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
}
            /**
     * Timestamp in milliseconds when metadata for the model version was last updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp")
private Long lastUpdatedTimestamp;

        /**
         * Timestamp in milliseconds when metadata for the model version was last updated.
         * @param lastUpdatedTimestamp the value to set
         * @return this builder
         **/
        

public Builder lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
}
            /**
     * User that created this model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("user_id")
private String userId;

        /**
         * User that created this model version.
         * @param userId the value to set
         * @return this builder
         **/
        

public Builder userId(String userId) {
    this.userId = userId;
    return this;
}
            /**
     * Current stage for this model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("current_stage")
private String currentStage;

        /**
         * Current stage for this model version.
         * @param currentStage the value to set
         * @return this builder
         **/
        

public Builder currentStage(String currentStage) {
    this.currentStage = currentStage;
    return this;
}
            /**
     * Description of this model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of this model version.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * URI indicating the location of the source model artifacts, used when creating model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("source")
private String source;

        /**
         * URI indicating the location of the source model artifacts, used when creating model version.
         * @param source the value to set
         * @return this builder
         **/
        

public Builder source(String source) {
    this.source = source;
    return this;
}
            /**
     * Run ID used when creating model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_id")
private String runId;

        /**
         * Run ID used when creating model version.
         * @param runId the value to set
         * @return this builder
         **/
        

public Builder runId(String runId) {
    this.runId = runId;
    return this;
}
            /**
     * Current status of model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private ModelVersionStatus status;

        /**
         * Current status of model version.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(ModelVersionStatus status) {
    this.status = status;
    return this;
}
            /**
     * Details on current status, if it is pending or failed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status_message")
private String statusMessage;

        /**
         * Details on current status, if it is pending or failed.
         * @param statusMessage the value to set
         * @return this builder
         **/
        

public Builder statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
}
            /**
     * Tags of model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.List<ModelVersionTag> tags;

        /**
         * Tags of model version.
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.List<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
}
            /**
     * Direct link to the run that generated this version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_link")
private String runLink;

        /**
         * Direct link to the run that generated this version.
         * @param runLink the value to set
         * @return this builder
         **/
        

public Builder runLink(String runLink) {
    this.runLink = runLink;
    return this;
}
            /**
     * Aliases pointing to this version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aliases")
private java.util.List<String> aliases;

        /**
         * Aliases pointing to this version.
         * @param aliases the value to set
         * @return this builder
         **/
        

public Builder aliases(java.util.List<String> aliases) {
    this.aliases = aliases;
    return this;
}
            /**
     * Model ID for model version that is used to link the registered model to the source logged model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_id")
private String modelId;

        /**
         * Model ID for model version that is used to link the registered model to the source logged model.
         * @param modelId the value to set
         * @return this builder
         **/
        

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}
            /**
     * Metrics logged for the model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_metrics")
private java.util.List<ModelMetric> modelMetrics;

        /**
         * Metrics logged for the model.
         * @param modelMetrics the value to set
         * @return this builder
         **/
        

public Builder modelMetrics(java.util.List<ModelMetric> modelMetrics) {
    this.modelMetrics = modelMetrics;
    return this;
}
            /**
     * Parameters logged for the model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_params")
private java.util.List<ModelParam> modelParams;

        /**
         * Parameters logged for the model.
         * @param modelParams the value to set
         * @return this builder
         **/
        

public Builder modelParams(java.util.List<ModelParam> modelParams) {
    this.modelParams = modelParams;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("deployment_job_state")
private ModelVersionDeploymentJobState deploymentJobState;



public Builder deploymentJobState(ModelVersionDeploymentJobState deploymentJobState) {
    this.deploymentJobState = deploymentJobState;
    return this;
}


        public ModelVersion build() {
            ModelVersion model = new ModelVersion(this.name
                , this.version
                , this.creationTimestamp
                , this.lastUpdatedTimestamp
                , this.userId
                , this.currentStage
                , this.description
                , this.source
                , this.runId
                , this.status
                , this.statusMessage
                , this.tags
                , this.runLink
                , this.aliases
                , this.modelId
                , this.modelMetrics
                , this.modelParams
                , this.deploymentJobState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelVersion model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.creationTimestamp(model.getCreationTimestamp());
    this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
    this.userId(model.getUserId());
    this.currentStage(model.getCurrentStage());
    this.description(model.getDescription());
    this.source(model.getSource());
    this.runId(model.getRunId());
    this.status(model.getStatus());
    this.statusMessage(model.getStatusMessage());
    this.tags(model.getTags());
    this.runLink(model.getRunLink());
    this.aliases(model.getAliases());
    this.modelId(model.getModelId());
    this.modelMetrics(model.getModelMetrics());
    this.modelParams(model.getModelParams());
    this.deploymentJobState(model.getDeploymentJobState());
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
     * Unique name for the model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Unique name for the model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Model\u2019s version number.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Model\u2019s version number.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * Timestamp in milliseconds when the model version was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp")
    private final Long creationTimestamp;

        /**
     * Timestamp in milliseconds when the model version was created.
     * @return the value
     **/
    
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }


        /**
     * Timestamp in milliseconds when metadata for the model version was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp")
    private final Long lastUpdatedTimestamp;

        /**
     * Timestamp in milliseconds when metadata for the model version was last updated.
     * @return the value
     **/
    
    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }


        /**
     * User that created this model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("user_id")
    private final String userId;

        /**
     * User that created this model version.
     * @return the value
     **/
    
    public String getUserId() {
        return userId;
    }


        /**
     * Current stage for this model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("current_stage")
    private final String currentStage;

        /**
     * Current stage for this model version.
     * @return the value
     **/
    
    public String getCurrentStage() {
        return currentStage;
    }


        /**
     * Description of this model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of this model version.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * URI indicating the location of the source model artifacts, used when creating model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

        /**
     * URI indicating the location of the source model artifacts, used when creating model version.
     * @return the value
     **/
    
    public String getSource() {
        return source;
    }


        /**
     * Run ID used when creating model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Run ID used when creating model version.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
    }

    
        /**
     * Current status of model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ModelVersionStatus status;

        /**
     * Current status of model version.
     * @return the value
     **/
    
    public ModelVersionStatus getStatus() {
        return status;
    }


        /**
     * Details on current status, if it is pending or failed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status_message")
    private final String statusMessage;

        /**
     * Details on current status, if it is pending or failed.
     * @return the value
     **/
    
    public String getStatusMessage() {
        return statusMessage;
    }


        /**
     * Tags of model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<ModelVersionTag> tags;

        /**
     * Tags of model version.
     * @return the value
     **/
    
    public java.util.List<ModelVersionTag> getTags() {
        return tags;
    }


        /**
     * Direct link to the run that generated this version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_link")
    private final String runLink;

        /**
     * Direct link to the run that generated this version.
     * @return the value
     **/
    
    public String getRunLink() {
        return runLink;
    }


        /**
     * Aliases pointing to this version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final java.util.List<String> aliases;

        /**
     * Aliases pointing to this version.
     * @return the value
     **/
    
    public java.util.List<String> getAliases() {
        return aliases;
    }


        /**
     * Model ID for model version that is used to link the registered model to the source logged model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_id")
    private final String modelId;

        /**
     * Model ID for model version that is used to link the registered model to the source logged model.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * Metrics logged for the model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_metrics")
    private final java.util.List<ModelMetric> modelMetrics;

        /**
     * Metrics logged for the model.
     * @return the value
     **/
    
    public java.util.List<ModelMetric> getModelMetrics() {
        return modelMetrics;
    }


        /**
     * Parameters logged for the model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_params")
    private final java.util.List<ModelParam> modelParams;

        /**
     * Parameters logged for the model.
     * @return the value
     **/
    
    public java.util.List<ModelParam> getModelParams() {
        return modelParams;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_state")
    private final ModelVersionDeploymentJobState deploymentJobState;

    
    public ModelVersionDeploymentJobState getDeploymentJobState() {
        return deploymentJobState;
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
        sb.append("ModelVersion(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", creationTimestamp=").append(String.valueOf(this.creationTimestamp));
        sb.append(", lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", currentStage=").append(String.valueOf(this.currentStage));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", runId=").append(String.valueOf(this.runId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", runLink=").append(String.valueOf(this.runLink));
        sb.append(", aliases=").append(String.valueOf(this.aliases));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", modelMetrics=").append(String.valueOf(this.modelMetrics));
        sb.append(", modelParams=").append(String.valueOf(this.modelParams));
        sb.append(", deploymentJobState=").append(String.valueOf(this.deploymentJobState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelVersion)) {
            return false;
        }

        ModelVersion other = (ModelVersion) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.creationTimestamp, other.creationTimestamp) &&
            java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp) &&
            java.util.Objects.equals(this.userId, other.userId) &&
            java.util.Objects.equals(this.currentStage, other.currentStage) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.statusMessage, other.statusMessage) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.runLink, other.runLink) &&
            java.util.Objects.equals(this.aliases, other.aliases) &&
            java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.modelMetrics, other.modelMetrics) &&
            java.util.Objects.equals(this.modelParams, other.modelParams) &&
            java.util.Objects.equals(this.deploymentJobState, other.deploymentJobState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.creationTimestamp == null ? 43 : this.creationTimestamp.hashCode());
        result = (result * PRIME) + (this.lastUpdatedTimestamp == null ? 43 : this.lastUpdatedTimestamp.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.currentStage == null ? 43 : this.currentStage.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.runLink == null ? 43 : this.runLink.hashCode());
        result = (result * PRIME) + (this.aliases == null ? 43 : this.aliases.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.modelMetrics == null ? 43 : this.modelMetrics.hashCode());
        result = (result * PRIME) + (this.modelParams == null ? 43 : this.modelParams.hashCode());
        result = (result * PRIME) + (this.deploymentJobState == null ? 43 : this.deploymentJobState.hashCode());
        return result;
    }


}
