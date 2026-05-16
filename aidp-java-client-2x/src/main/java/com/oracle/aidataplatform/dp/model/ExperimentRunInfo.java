// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Run metadata.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunInfo.Builder.class)

public final class ExperimentRunInfo  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "runName", "experimentId", "status", "startTime", "endTime", "artifactUri", "lifecycleStage", "runUuid", "userId"})
    public ExperimentRunInfo(String runId, String runName, String experimentId, ExperimentRunStatus status, Long startTime, Long endTime, String artifactUri, String lifecycleStage, String runUuid, String userId) {
        super();
        this.runId = runId;
        this.runName = runName;
        this.experimentId = experimentId;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.artifactUri = artifactUri;
        this.lifecycleStage = lifecycleStage;
        this.runUuid = runUuid;
        this.userId = userId;
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
     * Status of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ExperimentRunStatus status;

                /**
         * Status of the run.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(ExperimentRunStatus status) {
        this.status = status;
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
     * Unix timestamp in milliseconds when the run ended.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("end_time")
        private Long endTime;

                /**
         * Unix timestamp in milliseconds when the run ended.
         * @param endTime the value to set
         * @return this builder
         **/
        

        public Builder endTime(Long endTime) {
        this.endTime = endTime;
        return this;
        }
            /**
     * Artifact URI of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("artifact_uri")
        private String artifactUri;

                /**
         * Artifact URI of the run.
         * @param artifactUri the value to set
         * @return this builder
         **/
        

        public Builder artifactUri(String artifactUri) {
        this.artifactUri = artifactUri;
        return this;
        }
            /**
     * Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycle_stage")
        private String lifecycleStage;

                /**
         * Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.
         * @param lifecycleStage the value to set
         * @return this builder
         **/
        

        public Builder lifecycleStage(String lifecycleStage) {
        this.lifecycleStage = lifecycleStage;
        return this;
        }
            /**
     * uuid of the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_uuid")
        private String runUuid;

                /**
         * uuid of the run.
         * @param runUuid the value to set
         * @return this builder
         **/
        

        public Builder runUuid(String runUuid) {
        this.runUuid = runUuid;
        return this;
        }
            /**
     * User ID that created the run.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("user_id")
        private String userId;

                /**
         * User ID that created the run.
         * @param userId the value to set
         * @return this builder
         **/
        

        public Builder userId(String userId) {
        this.userId = userId;
        return this;
        }


        public ExperimentRunInfo build() {
            ExperimentRunInfo model = new ExperimentRunInfo(this.runId
                    , this.runName
                    , this.experimentId
                    , this.status
                    , this.startTime
                    , this.endTime
                    , this.artifactUri
                    , this.lifecycleStage
                    , this.runUuid
                    , this.userId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunInfo model) {
                this.runId(model.getRunId());
    this.runName(model.getRunName());
    this.experimentId(model.getExperimentId());
    this.status(model.getStatus());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.artifactUri(model.getArtifactUri());
    this.lifecycleStage(model.getLifecycleStage());
    this.runUuid(model.getRunUuid());
    this.userId(model.getUserId());
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
     * Status of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ExperimentRunStatus status;

        /**
     * Status of the run.
     * @return the value
     **/
    
    public ExperimentRunStatus getStatus() {
        return status;
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
     * Unix timestamp in milliseconds when the run ended.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("end_time")
    private final Long endTime;

        /**
     * Unix timestamp in milliseconds when the run ended.
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * Artifact URI of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("artifact_uri")
    private final String artifactUri;

        /**
     * Artifact URI of the run.
     * @return the value
     **/
    
    public String getArtifactUri() {
        return artifactUri;
    }


        /**
     * Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycle_stage")
    private final String lifecycleStage;

        /**
     * Lifecycle stage of the experiment, e.g., 'active' or 'deleted'.
     * @return the value
     **/
    
    public String getLifecycleStage() {
        return lifecycleStage;
    }


        /**
     * uuid of the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_uuid")
    private final String runUuid;

        /**
     * uuid of the run.
     * @return the value
     **/
    
    public String getRunUuid() {
        return runUuid;
    }


        /**
     * User ID that created the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("user_id")
    private final String userId;

        /**
     * User ID that created the run.
     * @return the value
     **/
    
    public String getUserId() {
        return userId;
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
        sb.append("ExperimentRunInfo(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", runName=").append(String.valueOf(this.runName));
        sb.append(", experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", artifactUri=").append(String.valueOf(this.artifactUri));
        sb.append(", lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(", runUuid=").append(String.valueOf(this.runUuid));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRunInfo)) {
            return false;
        }

        ExperimentRunInfo other = (ExperimentRunInfo) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.runName, other.runName) &&
            java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.artifactUri, other.artifactUri) &&
            java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage) &&
            java.util.Objects.equals(this.runUuid, other.runUuid) &&
            java.util.Objects.equals(this.userId, other.userId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.runName == null ? 43 : this.runName.hashCode());
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.artifactUri == null ? 43 : this.artifactUri.hashCode());
        result = (result * PRIME) + (this.lifecycleStage == null ? 43 : this.lifecycleStage.hashCode());
        result = (result * PRIME) + (this.runUuid == null ? 43 : this.runUuid.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        return result;
    }


}
