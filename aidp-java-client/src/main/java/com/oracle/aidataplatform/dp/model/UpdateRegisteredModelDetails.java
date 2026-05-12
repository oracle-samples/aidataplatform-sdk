package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a RegisteredModel.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateRegisteredModelDetails.Builder.class)

public final class UpdateRegisteredModelDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "deploymentJobId"})
    public UpdateRegisteredModelDetails(String name, String description, String deploymentJobId) {
        super();
        this.name = name;
        this.description = description;
        this.deploymentJobId = deploymentJobId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Registered model unique name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Registered model unique name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
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
     * Deployment job id for this model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
private String deploymentJobId;

        /**
         * Deployment job id for this model.
         * @param deploymentJobId the value to set
         * @return this builder
         **/
        

public Builder deploymentJobId(String deploymentJobId) {
    this.deploymentJobId = deploymentJobId;
    return this;
}


        public UpdateRegisteredModelDetails build() {
            UpdateRegisteredModelDetails model = new UpdateRegisteredModelDetails(this.name
                , this.description
                , this.deploymentJobId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRegisteredModelDetails model) {
                this.name(model.getName());
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
     * Registered model unique name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Registered model unique name.
     * @return the value
     **/
    
    public String getName() {
        return name;
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
     * Deployment job id for this model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_job_id")
    private final String deploymentJobId;

        /**
     * Deployment job id for this model.
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
        sb.append("UpdateRegisteredModelDetails(");
        sb.append("name=").append(String.valueOf(this.name));
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
        if (!(o instanceof UpdateRegisteredModelDetails)) {
            return false;
        }

        UpdateRegisteredModelDetails other = (UpdateRegisteredModelDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.deploymentJobId, other.deploymentJobId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.deploymentJobId == null ? 43 : this.deploymentJobId.hashCode());
        return result;
    }


}
