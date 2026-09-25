// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the model deployment tags to update.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateModelDeploymentTagsDetails.Builder.class)

public final class UpdateModelDeploymentTagsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "setTags", "deleteTags"})
    public UpdateModelDeploymentTagsDetails(String deploymentId, java.util.List<ModelDeploymentTag> setTags, java.util.List<ModelDeploymentTagKey> deleteTags) {
        super();
        this.deploymentId = deploymentId;
        this.setTags = setTags;
        this.deleteTags = deleteTags;
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
     * Model deployment tags to set.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("set_tags")
private java.util.List<ModelDeploymentTag> setTags;

        /**
         * Model deployment tags to set.
         * @param setTags the value to set
         * @return this builder
         **/
        

public Builder setTags(java.util.List<ModelDeploymentTag> setTags) {
    this.setTags = setTags;
    return this;
}
            /**
     * Model deployment tags to delete.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
private java.util.List<ModelDeploymentTagKey> deleteTags;

        /**
         * Model deployment tags to delete.
         * @param deleteTags the value to set
         * @return this builder
         **/
        

public Builder deleteTags(java.util.List<ModelDeploymentTagKey> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
}


        public UpdateModelDeploymentTagsDetails build() {
            UpdateModelDeploymentTagsDetails model = new UpdateModelDeploymentTagsDetails(this.deploymentId
                , this.setTags
                , this.deleteTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDeploymentTagsDetails model) {
                this.deploymentId(model.getDeploymentId());
    this.setTags(model.getSetTags());
    this.deleteTags(model.getDeleteTags());
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
     * Model deployment tags to set.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
    private final java.util.List<ModelDeploymentTag> setTags;

        /**
     * Model deployment tags to set.
     * @return the value
     **/
    
    public java.util.List<ModelDeploymentTag> getSetTags() {
        return setTags;
    }


        /**
     * Model deployment tags to delete.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
    private final java.util.List<ModelDeploymentTagKey> deleteTags;

        /**
     * Model deployment tags to delete.
     * @return the value
     **/
    
    public java.util.List<ModelDeploymentTagKey> getDeleteTags() {
        return deleteTags;
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
        sb.append("UpdateModelDeploymentTagsDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", setTags=").append(String.valueOf(this.setTags));
        sb.append(", deleteTags=").append(String.valueOf(this.deleteTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDeploymentTagsDetails)) {
            return false;
        }

        UpdateModelDeploymentTagsDetails other = (UpdateModelDeploymentTagsDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.setTags, other.setTags) &&
            java.util.Objects.equals(this.deleteTags, other.deleteTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.setTags == null ? 43 : this.setTags.hashCode());
        result = (result * PRIME) + (this.deleteTags == null ? 43 : this.deleteTags.hashCode());
        return result;
    }


}
