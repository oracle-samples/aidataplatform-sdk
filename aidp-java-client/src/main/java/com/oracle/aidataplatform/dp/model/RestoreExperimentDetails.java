package com.oracle.aidataplatform.dp.model;



/**
 * Details of the experiment to restore.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RestoreExperimentDetails.Builder.class)

public final class RestoreExperimentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId"})
    public RestoreExperimentDetails(String experimentId) {
        super();
        this.experimentId = experimentId;
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


        public RestoreExperimentDetails build() {
            RestoreExperimentDetails model = new RestoreExperimentDetails(this.experimentId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreExperimentDetails model) {
                this.experimentId(model.getExperimentId());
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
        sb.append("RestoreExperimentDetails(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreExperimentDetails)) {
            return false;
        }

        RestoreExperimentDetails other = (RestoreExperimentDetails) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        return result;
    }


}
