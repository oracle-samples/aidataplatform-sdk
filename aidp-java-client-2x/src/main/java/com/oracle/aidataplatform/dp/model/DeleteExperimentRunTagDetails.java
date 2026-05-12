package com.oracle.aidataplatform.dp.model;


/**
 * Tag details to delete on an Experiment Run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentRunTagDetails.Builder.class)

public final class DeleteExperimentRunTagDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "key"})
    public DeleteExperimentRunTagDetails(String runId, String key) {
        super();
        this.runId = runId;
        this.key = key;
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
     * Key of the run tag
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * Key of the run tag
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }


        public DeleteExperimentRunTagDetails build() {
            DeleteExperimentRunTagDetails model = new DeleteExperimentRunTagDetails(this.runId
                    , this.key);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentRunTagDetails model) {
                this.runId(model.getRunId());
    this.key(model.getKey());
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
     * Key of the run tag
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Key of the run tag
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
        sb.append("DeleteExperimentRunTagDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteExperimentRunTagDetails)) {
            return false;
        }

        DeleteExperimentRunTagDetails other = (DeleteExperimentRunTagDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }


}
