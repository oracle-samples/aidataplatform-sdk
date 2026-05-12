package com.oracle.aidataplatform.dp.model;


/**
 * Details of the registered model
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RegisteredModel.Builder.class)

public final class RegisteredModel  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "creationTimestamp", "lastUpdatedTimestamp", "description", "latestVersions", "aliases", "deploymentJobId", "deploymentJobState", "tags"})
    public RegisteredModel(String name, Long creationTimestamp, Long lastUpdatedTimestamp, String description, java.util.List<ModelVersion> latestVersions, java.util.List<RegisteredModelAlias> aliases, String deploymentJobId, DeploymentJobState deploymentJobState, java.util.List<RegisteredModelTag> tags) {
        super();
        this.name = name;
        this.creationTimestamp = creationTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.description = description;
        this.latestVersions = latestVersions;
        this.aliases = aliases;
        this.deploymentJobId = deploymentJobId;
        this.deploymentJobState = deploymentJobState;
        this.tags = tags;
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
     * Timestamp in milliseconds when the model was created.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp")
        private Long creationTimestamp;

                /**
         * Timestamp in milliseconds when the model was created.
         * @param creationTimestamp the value to set
         * @return this builder
         **/
        

        public Builder creationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
        }
            /**
     * Timestamp in milliseconds when metadata for the model was last updated.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp")
        private Long lastUpdatedTimestamp;

                /**
         * Timestamp in milliseconds when metadata for the model was last updated.
         * @param lastUpdatedTimestamp the value to set
         * @return this builder
         **/
        

        public Builder lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
        }
            /**
     * Description of the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Description of the registered model.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * Collection of latest model versions for each stage. Only contains models with current READY status.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("latest_versions")
        private java.util.List<ModelVersion> latestVersions;

                /**
         * Collection of latest model versions for each stage. Only contains models with current READY status.
         * @param latestVersions the value to set
         * @return this builder
         **/
        

        public Builder latestVersions(java.util.List<ModelVersion> latestVersions) {
        this.latestVersions = latestVersions;
        return this;
        }
            /**
     * Aliases pointing to model versions associated with this registered_model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("aliases")
        private java.util.List<RegisteredModelAlias> aliases;

                /**
         * Aliases pointing to model versions associated with this registered_model.
         * @param aliases the value to set
         * @return this builder
         **/
        

        public Builder aliases(java.util.List<RegisteredModelAlias> aliases) {
        this.aliases = aliases;
        return this;
        }
            /**
     * Deployment job ID.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
        private String deploymentJobId;

                /**
         * Deployment job ID.
         * @param deploymentJobId the value to set
         * @return this builder
         **/
        

        public Builder deploymentJobId(String deploymentJobId) {
        this.deploymentJobId = deploymentJobId;
        return this;
        }
            /**
     * Job state.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_state")
        private DeploymentJobState deploymentJobState;

                /**
         * Job state.
         * @param deploymentJobState the value to set
         * @return this builder
         **/
        

        public Builder deploymentJobState(DeploymentJobState deploymentJobState) {
        this.deploymentJobState = deploymentJobState;
        return this;
        }
            /**
     * Tags for the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<RegisteredModelTag> tags;

                /**
         * Tags for the registered model.
         * @param tags the value to set
         * @return this builder
         **/
        

        public Builder tags(java.util.List<RegisteredModelTag> tags) {
        this.tags = tags;
        return this;
        }


        public RegisteredModel build() {
            RegisteredModel model = new RegisteredModel(this.name
                    , this.creationTimestamp
                    , this.lastUpdatedTimestamp
                    , this.description
                    , this.latestVersions
                    , this.aliases
                    , this.deploymentJobId
                    , this.deploymentJobState
                    , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisteredModel model) {
                this.name(model.getName());
    this.creationTimestamp(model.getCreationTimestamp());
    this.lastUpdatedTimestamp(model.getLastUpdatedTimestamp());
    this.description(model.getDescription());
    this.latestVersions(model.getLatestVersions());
    this.aliases(model.getAliases());
    this.deploymentJobId(model.getDeploymentJobId());
    this.deploymentJobState(model.getDeploymentJobState());
    this.tags(model.getTags());
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
     * Timestamp in milliseconds when the model was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp")
    private final Long creationTimestamp;

        /**
     * Timestamp in milliseconds when the model was created.
     * @return the value
     **/
    
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }


        /**
     * Timestamp in milliseconds when metadata for the model was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp")
    private final Long lastUpdatedTimestamp;

        /**
     * Timestamp in milliseconds when metadata for the model was last updated.
     * @return the value
     **/
    
    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }


        /**
     * Description of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the registered model.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Collection of latest model versions for each stage. Only contains models with current READY status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("latest_versions")
    private final java.util.List<ModelVersion> latestVersions;

        /**
     * Collection of latest model versions for each stage. Only contains models with current READY status.
     * @return the value
     **/
    
    public java.util.List<ModelVersion> getLatestVersions() {
        return latestVersions;
    }


        /**
     * Aliases pointing to model versions associated with this registered_model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aliases")
    private final java.util.List<RegisteredModelAlias> aliases;

        /**
     * Aliases pointing to model versions associated with this registered_model.
     * @return the value
     **/
    
    public java.util.List<RegisteredModelAlias> getAliases() {
        return aliases;
    }


        /**
     * Deployment job ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
    private final String deploymentJobId;

        /**
     * Deployment job ID.
     * @return the value
     **/
    
    public String getDeploymentJobId() {
        return deploymentJobId;
    }

    
        /**
     * Job state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_state")
    private final DeploymentJobState deploymentJobState;

        /**
     * Job state.
     * @return the value
     **/
    
    public DeploymentJobState getDeploymentJobState() {
        return deploymentJobState;
    }


        /**
     * Tags for the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<RegisteredModelTag> tags;

        /**
     * Tags for the registered model.
     * @return the value
     **/
    
    public java.util.List<RegisteredModelTag> getTags() {
        return tags;
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
        sb.append("RegisteredModel(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", creationTimestamp=").append(String.valueOf(this.creationTimestamp));
        sb.append(", lastUpdatedTimestamp=").append(String.valueOf(this.lastUpdatedTimestamp));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", latestVersions=").append(String.valueOf(this.latestVersions));
        sb.append(", aliases=").append(String.valueOf(this.aliases));
        sb.append(", deploymentJobId=").append(String.valueOf(this.deploymentJobId));
        sb.append(", deploymentJobState=").append(String.valueOf(this.deploymentJobState));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisteredModel)) {
            return false;
        }

        RegisteredModel other = (RegisteredModel) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.creationTimestamp, other.creationTimestamp) &&
            java.util.Objects.equals(this.lastUpdatedTimestamp, other.lastUpdatedTimestamp) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.latestVersions, other.latestVersions) &&
            java.util.Objects.equals(this.aliases, other.aliases) &&
            java.util.Objects.equals(this.deploymentJobId, other.deploymentJobId) &&
            java.util.Objects.equals(this.deploymentJobState, other.deploymentJobState) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.creationTimestamp == null ? 43 : this.creationTimestamp.hashCode());
        result = (result * PRIME) + (this.lastUpdatedTimestamp == null ? 43 : this.lastUpdatedTimestamp.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.latestVersions == null ? 43 : this.latestVersions.hashCode());
        result = (result * PRIME) + (this.aliases == null ? 43 : this.aliases.hashCode());
        result = (result * PRIME) + (this.deploymentJobId == null ? 43 : this.deploymentJobId.hashCode());
        result = (result * PRIME) + (this.deploymentJobState == null ? 43 : this.deploymentJobState.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
