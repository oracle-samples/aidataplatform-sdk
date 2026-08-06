// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the experiment run to delete.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentRunDetails.Builder.class)

public final class DeleteExperimentRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "isPermanent"})
    public DeleteExperimentRunDetails(String runId, Boolean isPermanent) {
        super();
        this.runId = runId;
        this.isPermanent = isPermanent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_id")
private String runId;

        /**
         * Unique identifier for the run.
         * @param runId the value to set
         * @return this builder
         **/
        

public Builder runId(String runId) {
    this.runId = runId;
    return this;
}
            /**
     * If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("is_permanent")
private Boolean isPermanent;

        /**
         * If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
         * @param isPermanent the value to set
         * @return this builder
         **/
        

public Builder isPermanent(Boolean isPermanent) {
    this.isPermanent = isPermanent;
    return this;
}


        public DeleteExperimentRunDetails build() {
            DeleteExperimentRunDetails model = new DeleteExperimentRunDetails(this.runId
                , this.isPermanent);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentRunDetails model) {
                this.runId(model.getRunId());
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
     * Unique identifier for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Unique identifier for the run.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
    }


        /**
     * If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("is_permanent")
    private final Boolean isPermanent;

        /**
     * If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
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
        sb.append("DeleteExperimentRunDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", isPermanent=").append(String.valueOf(this.isPermanent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteExperimentRunDetails)) {
            return false;
        }

        DeleteExperimentRunDetails other = (DeleteExperimentRunDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.isPermanent, other.isPermanent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.isPermanent == null ? 43 : this.isPermanent.hashCode());
        return result;
    }


}
