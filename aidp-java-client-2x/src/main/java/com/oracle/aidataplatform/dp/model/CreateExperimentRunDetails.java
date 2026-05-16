// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of run to create.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateExperimentRunDetails.Builder.class)

public final class CreateExperimentRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runName", "experimentId", "startTime", "tags"})
    public CreateExperimentRunDetails(String runName, String experimentId, Long startTime, java.util.List<ExperimentRunTag> tags) {
        super();
        this.runName = runName;
        this.experimentId = experimentId;
        this.startTime = startTime;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_name")
        private String runName;

                /**
         * Name of the run.
         * @param runName the value to set
         * @return this builder
         **/
        

        public Builder runName(String runName) {
        this.runName = runName;
        return this;
        }
            /**
     * ID of the associated experiment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("experiment_id")
        private String experimentId;

                /**
         * ID of the associated experiment.
         * @param experimentId the value to set
         * @return this builder
         **/
        

        public Builder experimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
        }
            /**
     * Unix timestamp in milliseconds when the run started.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("start_time")
        private Long startTime;

                /**
         * Unix timestamp in milliseconds when the run started.
         * @param startTime the value to set
         * @return this builder
         **/
        

        public Builder startTime(Long startTime) {
        this.startTime = startTime;
        return this;
        }
            /**
     * Tags to log.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<ExperimentRunTag> tags;

                /**
         * Tags to log.
         * @param tags the value to set
         * @return this builder
         **/
        

        public Builder tags(java.util.List<ExperimentRunTag> tags) {
        this.tags = tags;
        return this;
        }


        public CreateExperimentRunDetails build() {
            CreateExperimentRunDetails model = new CreateExperimentRunDetails(this.runName
                    , this.experimentId
                    , this.startTime
                    , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExperimentRunDetails model) {
                this.runName(model.getRunName());
    this.experimentId(model.getExperimentId());
    this.startTime(model.getStartTime());
    this.tags(model.getTags());
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
     * Name of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_name")
    private final String runName;

        /**
     * Name of the run.
     * @return the value
     **/
    
    public String getRunName() {
        return runName;
    }


        /**
     * ID of the associated experiment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("experiment_id")
    private final String experimentId;

        /**
     * ID of the associated experiment.
     * @return the value
     **/
    
    public String getExperimentId() {
        return experimentId;
    }


        /**
     * Unix timestamp in milliseconds when the run started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("start_time")
    private final Long startTime;

        /**
     * Unix timestamp in milliseconds when the run started.
     * @return the value
     **/
    
    public Long getStartTime() {
        return startTime;
    }


        /**
     * Tags to log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<ExperimentRunTag> tags;

        /**
     * Tags to log.
     * @return the value
     **/
    
    public java.util.List<ExperimentRunTag> getTags() {
        return tags;
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
        sb.append("CreateExperimentRunDetails(");
        sb.append("runName=").append(String.valueOf(this.runName));
        sb.append(", experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExperimentRunDetails)) {
            return false;
        }

        CreateExperimentRunDetails other = (CreateExperimentRunDetails) o;
        return java.util.Objects.equals(this.runName, other.runName) &&
            java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runName == null ? 43 : this.runName.hashCode());
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
