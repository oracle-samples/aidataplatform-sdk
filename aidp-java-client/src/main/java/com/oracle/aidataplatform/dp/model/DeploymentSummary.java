// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Deployment counts for a registered model. Returned by a registered-model search only when the search requests the deployment summary, and omitted when it cannot be resolved. Both counts are always present together, so a summary reporting 0 means the model genuinely has no deployments, while no summary at all means the counts were not requested or could not be resolved.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentSummary.Builder.class)

public final class DeploymentSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalDeployment", "activeDeployment"})
    public DeploymentSummary(Long totalDeployment, Long activeDeployment) {
        super();
        this.totalDeployment = totalDeployment;
        this.activeDeployment = activeDeployment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Number of model deployments for this registered model, in any status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("total_deployment")
private Long totalDeployment;

        /**
         * Number of model deployments for this registered model, in any status.
         * @param totalDeployment the value to set
         * @return this builder
         **/
        

public Builder totalDeployment(Long totalDeployment) {
    this.totalDeployment = totalDeployment;
    return this;
}
            /**
     * Number of those deployments that are currently active.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("active_deployment")
private Long activeDeployment;

        /**
         * Number of those deployments that are currently active.
         * @param activeDeployment the value to set
         * @return this builder
         **/
        

public Builder activeDeployment(Long activeDeployment) {
    this.activeDeployment = activeDeployment;
    return this;
}


        public DeploymentSummary build() {
            DeploymentSummary model = new DeploymentSummary(this.totalDeployment
                , this.activeDeployment);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentSummary model) {
                this.totalDeployment(model.getTotalDeployment());
    this.activeDeployment(model.getActiveDeployment());
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
     * Number of model deployments for this registered model, in any status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("total_deployment")
    private final Long totalDeployment;

        /**
     * Number of model deployments for this registered model, in any status.
     * @return the value
     **/
    
    public Long getTotalDeployment() {
        return totalDeployment;
    }


        /**
     * Number of those deployments that are currently active.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("active_deployment")
    private final Long activeDeployment;

        /**
     * Number of those deployments that are currently active.
     * @return the value
     **/
    
    public Long getActiveDeployment() {
        return activeDeployment;
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
        sb.append("DeploymentSummary(");
        sb.append("totalDeployment=").append(String.valueOf(this.totalDeployment));
        sb.append(", activeDeployment=").append(String.valueOf(this.activeDeployment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentSummary)) {
            return false;
        }

        DeploymentSummary other = (DeploymentSummary) o;
        return java.util.Objects.equals(this.totalDeployment, other.totalDeployment) &&
            java.util.Objects.equals(this.activeDeployment, other.activeDeployment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalDeployment == null ? 43 : this.totalDeployment.hashCode());
        result = (result * PRIME) + (this.activeDeployment == null ? 43 : this.activeDeployment.hashCode());
        return result;
    }


}
