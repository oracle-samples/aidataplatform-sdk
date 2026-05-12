package com.oracle.aidataplatform.dp.model;



/**
 * Details of the experiment run to delete.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentRunDetails.Builder.class)

public final class DeleteExperimentRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId"})
    public DeleteExperimentRunDetails(String runId) {
        super();
        this.runId = runId;
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


        public DeleteExperimentRunDetails build() {
            DeleteExperimentRunDetails model = new DeleteExperimentRunDetails(this.runId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentRunDetails model) {
                this.runId(model.getRunId());
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
        return java.util.Objects.equals(this.runId, other.runId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        return result;
    }


}
