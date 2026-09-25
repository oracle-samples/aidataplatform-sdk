// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to activate a model deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ActivateModelDeploymentDetails.Builder.class)

public final class ActivateModelDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "message"})
    public ActivateModelDeploymentDetails(String deploymentId, String message) {
        super();
        this.deploymentId = deploymentId;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment to activate.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
private String deploymentId;

        /**
         * ID of the deployment to activate.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
            /**
     * Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}


        public ActivateModelDeploymentDetails build() {
            ActivateModelDeploymentDetails model = new ActivateModelDeploymentDetails(this.deploymentId
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateModelDeploymentDetails model) {
                this.deploymentId(model.getDeploymentId());
    this.message(model.getMessage());
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
     * ID of the deployment to activate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
    private final String deploymentId;

        /**
     * ID of the deployment to activate.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
    }


        /**
     * Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
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
        sb.append("ActivateModelDeploymentDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateModelDeploymentDetails)) {
            return false;
        }

        ActivateModelDeploymentDetails other = (ActivateModelDeploymentDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
