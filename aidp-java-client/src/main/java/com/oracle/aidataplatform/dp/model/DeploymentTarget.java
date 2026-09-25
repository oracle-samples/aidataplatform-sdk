// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A model version targeted by a deployment and its traffic share.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentTarget.Builder.class)

public final class DeploymentTarget  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelVersion", "trafficPercentage"})
    public DeploymentTarget(String modelVersion, Integer trafficPercentage) {
        super();
        this.modelVersion = modelVersion;
        this.trafficPercentage = trafficPercentage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Version number of the model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_version")
private String modelVersion;

        /**
         * Version number of the model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * Percentage of deployment traffic routed to this model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("traffic_percentage")
private Integer trafficPercentage;

        /**
         * Percentage of deployment traffic routed to this model version.
         * @param trafficPercentage the value to set
         * @return this builder
         **/
        

public Builder trafficPercentage(Integer trafficPercentage) {
    this.trafficPercentage = trafficPercentage;
    return this;
}


        public DeploymentTarget build() {
            DeploymentTarget model = new DeploymentTarget(this.modelVersion
                , this.trafficPercentage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentTarget model) {
                this.modelVersion(model.getModelVersion());
    this.trafficPercentage(model.getTrafficPercentage());
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
     * Version number of the model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_version")
    private final String modelVersion;

        /**
     * Version number of the model version.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }


        /**
     * Percentage of deployment traffic routed to this model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("traffic_percentage")
    private final Integer trafficPercentage;

        /**
     * Percentage of deployment traffic routed to this model version.
     * @return the value
     **/
    
    public Integer getTrafficPercentage() {
        return trafficPercentage;
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
        sb.append("DeploymentTarget(");
        sb.append("modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", trafficPercentage=").append(String.valueOf(this.trafficPercentage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentTarget)) {
            return false;
        }

        DeploymentTarget other = (DeploymentTarget) o;
        return java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.trafficPercentage, other.trafficPercentage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.trafficPercentage == null ? 43 : this.trafficPercentage.hashCode());
        return result;
    }


}
