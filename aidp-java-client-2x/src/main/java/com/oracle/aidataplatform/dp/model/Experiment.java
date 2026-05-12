package com.oracle.aidataplatform.dp.model;


/**
 * Details of an MLflow experiment.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Experiment.Builder.class)

public final class Experiment  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId", "name", "artifactLocation", "lifecycleStage", "creationTime", "lastUpdateTime", "tags"})
    public Experiment(String experimentId, String name, String artifactLocation, String lifecycleStage, Long creationTime, Long lastUpdateTime, java.util.List<ExperimentTag> tags) {
        super();
        this.experimentId = experimentId;
        this.name = name;
        this.artifactLocation = artifactLocation;
        this.lifecycleStage = lifecycleStage;
        this.creationTime = creationTime;
        this.lastUpdateTime = lastUpdateTime;
        this.tags = tags;
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
     * Name of the experiment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name of the experiment.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("artifact_location")
        private String artifactLocation;

                /**
         * Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.
         * @param artifactLocation the value to set
         * @return this builder
         **/
        

        public Builder artifactLocation(String artifactLocation) {
        this.artifactLocation = artifactLocation;
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
     * Unix timestamp in milliseconds when the experiment was created.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("creation_time")
        private Long creationTime;

                /**
         * Unix timestamp in milliseconds when the experiment was created.
         * @param creationTime the value to set
         * @return this builder
         **/
        

        public Builder creationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
        }
            /**
     * Unix timestamp in milliseconds when the experiment was last updated.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("last_update_time")
        private Long lastUpdateTime;

                /**
         * Unix timestamp in milliseconds when the experiment was last updated.
         * @param lastUpdateTime the value to set
         * @return this builder
         **/
        

        public Builder lastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
        }
            /**
     * List of tags set on the experiment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<ExperimentTag> tags;

                /**
         * List of tags set on the experiment.
         * @param tags the value to set
         * @return this builder
         **/
        

        public Builder tags(java.util.List<ExperimentTag> tags) {
        this.tags = tags;
        return this;
        }


        public Experiment build() {
            Experiment model = new Experiment(this.experimentId
                    , this.name
                    , this.artifactLocation
                    , this.lifecycleStage
                    , this.creationTime
                    , this.lastUpdateTime
                    , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Experiment model) {
                this.experimentId(model.getExperimentId());
    this.name(model.getName());
    this.artifactLocation(model.getArtifactLocation());
    this.lifecycleStage(model.getLifecycleStage());
    this.creationTime(model.getCreationTime());
    this.lastUpdateTime(model.getLastUpdateTime());
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
     * Name of the experiment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the experiment.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("artifact_location")
    private final String artifactLocation;

        /**
     * Location where all artifacts for the experiment are stored. If not provided, the remote server will select an appropriate default.
     * @return the value
     **/
    
    public String getArtifactLocation() {
        return artifactLocation;
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
     * Unix timestamp in milliseconds when the experiment was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creation_time")
    private final Long creationTime;

        /**
     * Unix timestamp in milliseconds when the experiment was created.
     * @return the value
     **/
    
    public Long getCreationTime() {
        return creationTime;
    }


        /**
     * Unix timestamp in milliseconds when the experiment was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_update_time")
    private final Long lastUpdateTime;

        /**
     * Unix timestamp in milliseconds when the experiment was last updated.
     * @return the value
     **/
    
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }


        /**
     * List of tags set on the experiment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<ExperimentTag> tags;

        /**
     * List of tags set on the experiment.
     * @return the value
     **/
    
    public java.util.List<ExperimentTag> getTags() {
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
        sb.append("Experiment(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", artifactLocation=").append(String.valueOf(this.artifactLocation));
        sb.append(", lifecycleStage=").append(String.valueOf(this.lifecycleStage));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(", lastUpdateTime=").append(String.valueOf(this.lastUpdateTime));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Experiment)) {
            return false;
        }

        Experiment other = (Experiment) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.artifactLocation, other.artifactLocation) &&
            java.util.Objects.equals(this.lifecycleStage, other.lifecycleStage) &&
            java.util.Objects.equals(this.creationTime, other.creationTime) &&
            java.util.Objects.equals(this.lastUpdateTime, other.lastUpdateTime) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.artifactLocation == null ? 43 : this.artifactLocation.hashCode());
        result = (result * PRIME) + (this.lifecycleStage == null ? 43 : this.lifecycleStage.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result = (result * PRIME) + (this.lastUpdateTime == null ? 43 : this.lastUpdateTime.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
