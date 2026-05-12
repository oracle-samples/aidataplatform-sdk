package com.oracle.aidataplatform.dp.model;


/**
 * The data to create an experiment.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateExperimentDetails.Builder.class)

public final class CreateExperimentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "artifactLocation", "tags"})
    public CreateExperimentDetails(String name, String artifactLocation, java.util.List<ExperimentTag> tags) {
        super();
        this.name = name;
        this.artifactLocation = artifactLocation;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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


        public CreateExperimentDetails build() {
            CreateExperimentDetails model = new CreateExperimentDetails(this.name
                    , this.artifactLocation
                    , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExperimentDetails model) {
                this.name(model.getName());
    this.artifactLocation(model.getArtifactLocation());
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
        sb.append("CreateExperimentDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", artifactLocation=").append(String.valueOf(this.artifactLocation));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExperimentDetails)) {
            return false;
        }

        CreateExperimentDetails other = (CreateExperimentDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.artifactLocation, other.artifactLocation) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.artifactLocation == null ? 43 : this.artifactLocation.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
