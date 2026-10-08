// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to delete a model deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteModelDeploymentDetails.Builder.class)

public final class DeleteModelDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId"})
    public DeleteModelDeploymentDetails(String deploymentId) {
        super();
        this.deploymentId = deploymentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment to delete.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
private String deploymentId;

        /**
         * ID of the deployment to delete.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}


        public DeleteModelDeploymentDetails build() {
            DeleteModelDeploymentDetails model = new DeleteModelDeploymentDetails(this.deploymentId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteModelDeploymentDetails model) {
                this.deploymentId(model.getDeploymentId());
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
     * ID of the deployment to delete.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
    private final String deploymentId;

        /**
     * ID of the deployment to delete.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
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
        sb.append("DeleteModelDeploymentDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteModelDeploymentDetails)) {
            return false;
        }

        DeleteModelDeploymentDetails other = (DeleteModelDeploymentDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        return result;
    }


}
