// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a ModelVersion.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateModelVersionDetails.Builder.class)

public final class CreateModelVersionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "source", "runId", "tags", "runLink", "modelId"})
    public CreateModelVersionDetails(String name, String description, String source, String runId, java.util.List<ModelVersionTag> tags, String runLink, String modelId) {
        super();
        this.name = name;
        this.description = description;
        this.source = source;
        this.runId = runId;
        this.tags = tags;
        this.runLink = runLink;
        this.modelId = modelId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Register models under this name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Register models under this name.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
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
     * URI indicating the location of the source model artifacts.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

                /**
         * URI indicating the location of the source model artifacts.
         * @param source the value to set
         * @return this builder
         **/
        

        public Builder source(String source) {
        this.source = source;
        return this;
        }
            /**
     * Run ID that generated the model version.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_id")
        private String runId;

                /**
         * Run ID that generated the model version.
         * @param runId the value to set
         * @return this builder
         **/
        

        public Builder runId(String runId) {
        this.runId = runId;
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
     * Run Link: Direct link to the run that generated this version.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_link")
        private String runLink;

                /**
         * Run Link: Direct link to the run that generated this version.
         * @param runLink the value to set
         * @return this builder
         **/
        

        public Builder runLink(String runLink) {
        this.runLink = runLink;
        return this;
        }
            /**
     * Model id for model version that is used to link the registered model to the source logged model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("model_id")
        private String modelId;

                /**
         * Model id for model version that is used to link the registered model to the source logged model.
         * @param modelId the value to set
         * @return this builder
         **/
        

        public Builder modelId(String modelId) {
        this.modelId = modelId;
        return this;
        }


        public CreateModelVersionDetails build() {
            CreateModelVersionDetails model = new CreateModelVersionDetails(this.name
                    , this.description
                    , this.source
                    , this.runId
                    , this.tags
                    , this.runLink
                    , this.modelId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateModelVersionDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.source(model.getSource());
    this.runId(model.getRunId());
    this.tags(model.getTags());
    this.runLink(model.getRunLink());
    this.modelId(model.getModelId());
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
     * Register models under this name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Register models under this name.
     * @return the value
     **/
    
    public String getName() {
        return name;
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
     * URI indicating the location of the source model artifacts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

        /**
     * URI indicating the location of the source model artifacts.
     * @return the value
     **/
    
    public String getSource() {
        return source;
    }


        /**
     * Run ID that generated the model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Run ID that generated the model version.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
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
     * Run Link: Direct link to the run that generated this version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_link")
    private final String runLink;

        /**
     * Run Link: Direct link to the run that generated this version.
     * @return the value
     **/
    
    public String getRunLink() {
        return runLink;
    }


        /**
     * Model id for model version that is used to link the registered model to the source logged model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_id")
    private final String modelId;

        /**
     * Model id for model version that is used to link the registered model to the source logged model.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
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
        sb.append("CreateModelVersionDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", runId=").append(String.valueOf(this.runId));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", runLink=").append(String.valueOf(this.runLink));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateModelVersionDetails)) {
            return false;
        }

        CreateModelVersionDetails other = (CreateModelVersionDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.runLink, other.runLink) &&
            java.util.Objects.equals(this.modelId, other.modelId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.runLink == null ? 43 : this.runLink.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        return result;
    }


}
