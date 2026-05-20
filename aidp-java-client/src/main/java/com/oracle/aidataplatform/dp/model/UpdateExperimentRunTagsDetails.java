// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of the ExperimentRun tags to update.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateExperimentRunTagsDetails.Builder.class)

public final class UpdateExperimentRunTagsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "setTags", "deleteTags"})
    public UpdateExperimentRunTagsDetails(String runId, java.util.List<ExperimentRunTag> setTags, java.util.List<ExperimentRunTagKey> deleteTags) {
        super();
        this.runId = runId;
        this.setTags = setTags;
        this.deleteTags = deleteTags;
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
     * ExperimentRun tags to set
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("set_tags")
private java.util.List<ExperimentRunTag> setTags;

        /**
         * ExperimentRun tags to set
         * @param setTags the value to set
         * @return this builder
         **/
        

public Builder setTags(java.util.List<ExperimentRunTag> setTags) {
    this.setTags = setTags;
    return this;
}
            /**
     * ExperimentRun tags to delete
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
private java.util.List<ExperimentRunTagKey> deleteTags;

        /**
         * ExperimentRun tags to delete
         * @param deleteTags the value to set
         * @return this builder
         **/
        

public Builder deleteTags(java.util.List<ExperimentRunTagKey> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
}


        public UpdateExperimentRunTagsDetails build() {
            UpdateExperimentRunTagsDetails model = new UpdateExperimentRunTagsDetails(this.runId
                , this.setTags
                , this.deleteTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExperimentRunTagsDetails model) {
                this.runId(model.getRunId());
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
     * ExperimentRun tags to set
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
    private final java.util.List<ExperimentRunTag> setTags;

        /**
     * ExperimentRun tags to set
     * @return the value
     **/
    
    public java.util.List<ExperimentRunTag> getSetTags() {
        return setTags;
    }


        /**
     * ExperimentRun tags to delete
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
    private final java.util.List<ExperimentRunTagKey> deleteTags;

        /**
     * ExperimentRun tags to delete
     * @return the value
     **/
    
    public java.util.List<ExperimentRunTagKey> getDeleteTags() {
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
        sb.append("UpdateExperimentRunTagsDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
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
        if (!(o instanceof UpdateExperimentRunTagsDetails)) {
            return false;
        }

        UpdateExperimentRunTagsDetails other = (UpdateExperimentRunTagsDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.setTags, other.setTags) &&
            java.util.Objects.equals(this.deleteTags, other.deleteTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.setTags == null ? 43 : this.setTags.hashCode());
        result = (result * PRIME) + (this.deleteTags == null ? 43 : this.deleteTags.hashCode());
        return result;
    }


}
