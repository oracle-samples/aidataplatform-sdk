// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a registered model.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateRegisteredModelDetails.Builder.class)

public final class CreateRegisteredModelDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "tags", "description", "deploymentJobId"})
    public CreateRegisteredModelDetails(String name, java.util.List<RegisteredModelTag> tags, String description, String deploymentJobId) {
        super();
        this.name = name;
        this.tags = tags;
        this.description = description;
        this.deploymentJobId = deploymentJobId;
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
            /**
     * Description for the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Description for the registered model.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * Deployment job ID for this model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
        private String deploymentJobId;

                /**
         * Deployment job ID for this model.
         * @param deploymentJobId the value to set
         * @return this builder
         **/
        

        public Builder deploymentJobId(String deploymentJobId) {
        this.deploymentJobId = deploymentJobId;
        return this;
        }


        public CreateRegisteredModelDetails build() {
            CreateRegisteredModelDetails model = new CreateRegisteredModelDetails(this.name
                    , this.tags
                    , this.description
                    , this.deploymentJobId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRegisteredModelDetails model) {
                this.name(model.getName());
    this.tags(model.getTags());
    this.description(model.getDescription());
    this.deploymentJobId(model.getDeploymentJobId());
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


        /**
     * Description for the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description for the registered model.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Deployment job ID for this model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
    private final String deploymentJobId;

        /**
     * Deployment job ID for this model.
     * @return the value
     **/
    
    public String getDeploymentJobId() {
        return deploymentJobId;
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
        sb.append("CreateRegisteredModelDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", deploymentJobId=").append(String.valueOf(this.deploymentJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRegisteredModelDetails)) {
            return false;
        }

        CreateRegisteredModelDetails other = (CreateRegisteredModelDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.deploymentJobId, other.deploymentJobId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.deploymentJobId == null ? 43 : this.deploymentJobId.hashCode());
        return result;
    }


}
