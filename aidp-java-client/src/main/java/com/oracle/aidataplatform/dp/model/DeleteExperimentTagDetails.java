// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Tag details to delete on an experiment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentTagDetails.Builder.class)

public final class DeleteExperimentTagDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentId", "key"})
    public DeleteExperimentTagDetails(String experimentId, String key) {
        super();
        this.experimentId = experimentId;
        this.key = key;
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
     * Key of the experiment tag.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Key of the experiment tag.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}


        public DeleteExperimentTagDetails build() {
            DeleteExperimentTagDetails model = new DeleteExperimentTagDetails(this.experimentId
                , this.key);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentTagDetails model) {
                this.experimentId(model.getExperimentId());
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
     * Key of the experiment tag.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Key of the experiment tag.
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
        sb.append("DeleteExperimentTagDetails(");
        sb.append("experimentId=").append(String.valueOf(this.experimentId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteExperimentTagDetails)) {
            return false;
        }

        DeleteExperimentTagDetails other = (DeleteExperimentTagDetails) o;
        return java.util.Objects.equals(this.experimentId, other.experimentId) &&
            java.util.Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentId == null ? 43 : this.experimentId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }


}
