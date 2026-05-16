// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to update an experiment.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateExperimentDetails.Builder.class)

public final class UpdateExperimentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId", "newName"})
    public UpdateExperimentDetails(String experimentId, String newName) {
        super();
        this.experimentId = experimentId;
        this.newName = newName;
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
     * If provided, name of the experiment is changed to the new name. The new name must be unique.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("new_name")
        private String newName;

                /**
         * If provided, name of the experiment is changed to the new name. The new name must be unique.
         * @param newName the value to set
         * @return this builder
         **/
        

        public Builder newName(String newName) {
        this.newName = newName;
        return this;
        }


        public UpdateExperimentDetails build() {
            UpdateExperimentDetails model = new UpdateExperimentDetails(this.experimentId
                    , this.newName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExperimentDetails model) {
                this.experimentId(model.getExperimentId());
    this.newName(model.getNewName());
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
     * If provided, name of the experiment is changed to the new name. The new name must be unique.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("new_name")
    private final String newName;

        /**
     * If provided, name of the experiment is changed to the new name. The new name must be unique.
     * @return the value
     **/
    
    public String getNewName() {
        return newName;
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
        sb.append("UpdateExperimentDetails(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", newName=").append(String.valueOf(this.newName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExperimentDetails)) {
            return false;
        }

        UpdateExperimentDetails other = (UpdateExperimentDetails) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.newName, other.newName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.newName == null ? 43 : this.newName.hashCode());
        return result;
    }


}
