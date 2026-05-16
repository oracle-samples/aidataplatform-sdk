// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the LoggedModel Info.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LoggedModelInfo.Builder.class)

public final class LoggedModelInfo  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId", "experimentId", "name", "creationTimestampMs", "lastUpdatedTimestampMs", "artifactUri", "status", "modelType", "sourceRunId", "tags"})
    public LoggedModelInfo(String modelId, String experimentId, String name, Long creationTimestampMs, Long lastUpdatedTimestampMs, String artifactUri, String status, String modelType, String sourceRunId, java.util.List<LoggedModelTag> tags) {
        super();
        this.modelId = modelId;
        this.experimentId = experimentId;
        this.name = name;
        this.creationTimestampMs = creationTimestampMs;
        this.lastUpdatedTimestampMs = lastUpdatedTimestampMs;
        this.artifactUri = artifactUri;
        this.status = status;
        this.modelType = modelType;
        this.sourceRunId = sourceRunId;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * id of logged-model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_id")
private String modelId;

        /**
         * id of logged-model.
         * @param modelId the value to set
         * @return this builder
         **/
        

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}
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
     * name of logged-model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * name of logged-model.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Unix timestamp in milliseconds when the logged-model was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp_ms")
private Long creationTimestampMs;

        /**
         * Unix timestamp in milliseconds when the logged-model was created.
         * @param creationTimestampMs the value to set
         * @return this builder
         **/
        

public Builder creationTimestampMs(Long creationTimestampMs) {
    this.creationTimestampMs = creationTimestampMs;
    return this;
}
            /**
     * Unix timestamp in milliseconds when the logged-model was last updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp_ms")
private Long lastUpdatedTimestampMs;

        /**
         * Unix timestamp in milliseconds when the logged-model was last updated.
         * @param lastUpdatedTimestampMs the value to set
         * @return this builder
         **/
        

public Builder lastUpdatedTimestampMs(Long lastUpdatedTimestampMs) {
    this.lastUpdatedTimestampMs = lastUpdatedTimestampMs;
    return this;
}
            /**
     * artifact_uri.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("artifact_uri")
private String artifactUri;

        /**
         * artifact_uri.
         * @param artifactUri the value to set
         * @return this builder
         **/
        

public Builder artifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
}
            /**
     * status of logged-model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * status of logged-model.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
    return this;
}
            /**
     * model_type of logged-model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_type")
private String modelType;

        /**
         * model_type of logged-model.
         * @param modelType the value to set
         * @return this builder
         **/
        

public Builder modelType(String modelType) {
    this.modelType = modelType;
    return this;
}
            /**
     * source_run_id of logged-model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("source_run_id")
private String sourceRunId;

        /**
         * source_run_id of logged-model.
         * @param sourceRunId the value to set
         * @return this builder
         **/
        

public Builder sourceRunId(String sourceRunId) {
    this.sourceRunId = sourceRunId;
    return this;
}
            /**
     * tags of logged-model
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.List<LoggedModelTag> tags;

        /**
         * tags of logged-model
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.List<LoggedModelTag> tags) {
    this.tags = tags;
    return this;
}


        public LoggedModelInfo build() {
            LoggedModelInfo model = new LoggedModelInfo(this.modelId
                , this.experimentId
                , this.name
                , this.creationTimestampMs
                , this.lastUpdatedTimestampMs
                , this.artifactUri
                , this.status
                , this.modelType
                , this.sourceRunId
                , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggedModelInfo model) {
                this.modelId(model.getModelId());
    this.experimentId(model.getExperimentId());
    this.name(model.getName());
    this.creationTimestampMs(model.getCreationTimestampMs());
    this.lastUpdatedTimestampMs(model.getLastUpdatedTimestampMs());
    this.artifactUri(model.getArtifactUri());
    this.status(model.getStatus());
    this.modelType(model.getModelType());
    this.sourceRunId(model.getSourceRunId());
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
     * id of logged-model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_id")
    private final String modelId;

        /**
     * id of logged-model.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
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
     * name of logged-model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * name of logged-model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Unix timestamp in milliseconds when the logged-model was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creation_timestamp_ms")
    private final Long creationTimestampMs;

        /**
     * Unix timestamp in milliseconds when the logged-model was created.
     * @return the value
     **/
    
    public Long getCreationTimestampMs() {
        return creationTimestampMs;
    }


        /**
     * Unix timestamp in milliseconds when the logged-model was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_updated_timestamp_ms")
    private final Long lastUpdatedTimestampMs;

        /**
     * Unix timestamp in milliseconds when the logged-model was last updated.
     * @return the value
     **/
    
    public Long getLastUpdatedTimestampMs() {
        return lastUpdatedTimestampMs;
    }


        /**
     * artifact_uri.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("artifact_uri")
    private final String artifactUri;

        /**
     * artifact_uri.
     * @return the value
     **/
    
    public String getArtifactUri() {
        return artifactUri;
    }


        /**
     * status of logged-model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * status of logged-model.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
    }


        /**
     * model_type of logged-model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_type")
    private final String modelType;

        /**
     * model_type of logged-model.
     * @return the value
     **/
    
    public String getModelType() {
        return modelType;
    }


        /**
     * source_run_id of logged-model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source_run_id")
    private final String sourceRunId;

        /**
     * source_run_id of logged-model.
     * @return the value
     **/
    
    public String getSourceRunId() {
        return sourceRunId;
    }


        /**
     * tags of logged-model
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<LoggedModelTag> tags;

        /**
     * tags of logged-model
     * @return the value
     **/
    
    public java.util.List<LoggedModelTag> getTags() {
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
        sb.append("LoggedModelInfo(");
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", creationTimestampMs=").append(String.valueOf(this.creationTimestampMs));
        sb.append(", lastUpdatedTimestampMs=").append(String.valueOf(this.lastUpdatedTimestampMs));
        sb.append(", artifactUri=").append(String.valueOf(this.artifactUri));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", sourceRunId=").append(String.valueOf(this.sourceRunId));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggedModelInfo)) {
            return false;
        }

        LoggedModelInfo other = (LoggedModelInfo) o;
        return java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.creationTimestampMs, other.creationTimestampMs) &&
            java.util.Objects.equals(this.lastUpdatedTimestampMs, other.lastUpdatedTimestampMs) &&
            java.util.Objects.equals(this.artifactUri, other.artifactUri) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.modelType, other.modelType) &&
            java.util.Objects.equals(this.sourceRunId, other.sourceRunId) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.creationTimestampMs == null ? 43 : this.creationTimestampMs.hashCode());
        result = (result * PRIME) + (this.lastUpdatedTimestampMs == null ? 43 : this.lastUpdatedTimestampMs.hashCode());
        result = (result * PRIME) + (this.artifactUri == null ? 43 : this.artifactUri.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.sourceRunId == null ? 43 : this.sourceRunId.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
