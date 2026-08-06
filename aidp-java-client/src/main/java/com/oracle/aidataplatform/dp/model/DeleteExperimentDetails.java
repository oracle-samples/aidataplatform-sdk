// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the experiment to delete.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentDetails.Builder.class)

public final class DeleteExperimentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId", "isPermanent"})
    public DeleteExperimentDetails(String experimentId, Boolean isPermanent) {
        super();
        this.experimentId = experimentId;
        this.isPermanent = isPermanent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for the experiment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("experiment_id")
private String experimentId;

        /**
         * Unique identifier for the experiment.
         * @param experimentId the value to set
         * @return this builder
         **/
        

public Builder experimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
}
            /**
     * If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("is_permanent")
private Boolean isPermanent;

        /**
         * If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.
         * @param isPermanent the value to set
         * @return this builder
         **/
        

public Builder isPermanent(Boolean isPermanent) {
    this.isPermanent = isPermanent;
    return this;
}


        public DeleteExperimentDetails build() {
            DeleteExperimentDetails model = new DeleteExperimentDetails(this.experimentId
                , this.isPermanent);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentDetails model) {
                this.experimentId(model.getExperimentId());
    this.isPermanent(model.getIsPermanent());
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
     * Unique identifier for the experiment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("experiment_id")
    private final String experimentId;

        /**
     * Unique identifier for the experiment.
     * @return the value
     **/
    
    public String getExperimentId() {
        return experimentId;
    }


        /**
     * If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("is_permanent")
    private final Boolean isPermanent;

        /**
     * If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.
     * @return the value
     **/
    
    public Boolean getIsPermanent() {
        return isPermanent;
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
        sb.append("DeleteExperimentDetails(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", isPermanent=").append(String.valueOf(this.isPermanent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteExperimentDetails)) {
            return false;
        }

        DeleteExperimentDetails other = (DeleteExperimentDetails) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.isPermanent, other.isPermanent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.isPermanent == null ? 43 : this.isPermanent.hashCode());
        return result;
    }


}
