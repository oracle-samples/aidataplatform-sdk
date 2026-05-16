// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the Experiment tags to update.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateExperimentTagsDetails.Builder.class)

public final class UpdateExperimentTagsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId", "setTags", "deleteTags"})
    public UpdateExperimentTagsDetails(String experimentId, java.util.List<ExperimentTag> setTags, java.util.List<ExperimentTagKey> deleteTags) {
        super();
        this.experimentId = experimentId;
        this.setTags = setTags;
        this.deleteTags = deleteTags;
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
     * Experiment tags to set
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("set_tags")
private java.util.List<ExperimentTag> setTags;

        /**
         * Experiment tags to set
         * @param setTags the value to set
         * @return this builder
         **/
        

public Builder setTags(java.util.List<ExperimentTag> setTags) {
    this.setTags = setTags;
    return this;
}
            /**
     * Experiment tags to delete
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
private java.util.List<ExperimentTagKey> deleteTags;

        /**
         * Experiment tags to delete
         * @param deleteTags the value to set
         * @return this builder
         **/
        

public Builder deleteTags(java.util.List<ExperimentTagKey> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
}


        public UpdateExperimentTagsDetails build() {
            UpdateExperimentTagsDetails model = new UpdateExperimentTagsDetails(this.experimentId
                , this.setTags
                , this.deleteTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExperimentTagsDetails model) {
                this.experimentId(model.getExperimentId());
    this.setTags(model.getSetTags());
    this.deleteTags(model.getDeleteTags());
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
     * Experiment tags to set
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
    private final java.util.List<ExperimentTag> setTags;

        /**
     * Experiment tags to set
     * @return the value
     **/
    
    public java.util.List<ExperimentTag> getSetTags() {
        return setTags;
    }


        /**
     * Experiment tags to delete
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
    private final java.util.List<ExperimentTagKey> deleteTags;

        /**
     * Experiment tags to delete
     * @return the value
     **/
    
    public java.util.List<ExperimentTagKey> getDeleteTags() {
        return deleteTags;
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
        sb.append("UpdateExperimentTagsDetails(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", setTags=").append(String.valueOf(this.setTags));
        sb.append(", deleteTags=").append(String.valueOf(this.deleteTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExperimentTagsDetails)) {
            return false;
        }

        UpdateExperimentTagsDetails other = (UpdateExperimentTagsDetails) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.setTags, other.setTags) &&
            java.util.Objects.equals(this.deleteTags, other.deleteTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.setTags == null ? 43 : this.setTags.hashCode());
        result = (result * PRIME) + (this.deleteTags == null ? 43 : this.deleteTags.hashCode());
        return result;
    }


}
