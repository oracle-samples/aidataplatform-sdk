// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary of a lineage import.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageImportSummary.Builder.class)

public final class LineageImportSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "producerName", "producerUri", "jobNamespace", "timeCreated", "timeFinished", "createdBy", "lifecycleState"})
    public LineageImportSummary(String key, String producerName, String producerUri, String jobNamespace, java.util.Date timeCreated, java.util.Date timeFinished, String createdBy, LineageImportLifecycleState lifecycleState) {
        super();
        this.key = key;
        this.producerName = producerName;
        this.producerUri = producerUri;
        this.jobNamespace = jobNamespace;
        this.timeCreated = timeCreated;
        this.timeFinished = timeFinished;
        this.createdBy = createdBy;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Generated lineage import key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Generated lineage import key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Name of the producer that emitted the lineage event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("producerName")
private String producerName;

        /**
         * Name of the producer that emitted the lineage event.
         * @param producerName the value to set
         * @return this builder
         **/
        

public Builder producerName(String producerName) {
    this.producerName = producerName;
    return this;
}
            /**
     * URI of the lineage producer.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("producerUri")
private String producerUri;

        /**
         * URI of the lineage producer.
         * @param producerUri the value to set
         * @return this builder
         **/
        

public Builder producerUri(String producerUri) {
    this.producerUri = producerUri;
    return this;
}
            /**
     * Namespace of the OpenLineage job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobNamespace")
private String jobNamespace;

        /**
         * Namespace of the OpenLineage job.
         * @param jobNamespace the value to set
         * @return this builder
         **/
        

public Builder jobNamespace(String jobNamespace) {
    this.jobNamespace = jobNamespace;
    return this;
}
            /**
     * Time the import was accepted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Time the import was accepted.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Time import processing completed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
private java.util.Date timeFinished;

        /**
         * Time import processing completed.
         * @param timeFinished the value to set
         * @return this builder
         **/
        

public Builder timeFinished(java.util.Date timeFinished) {
    this.timeFinished = timeFinished;
    return this;
}
            /**
     * Principal that submitted the import.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * Principal that submitted the import.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Current processing state of the lineage import.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LineageImportLifecycleState lifecycleState;

        /**
         * Current processing state of the lineage import.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(LineageImportLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}


        public LineageImportSummary build() {
            LineageImportSummary model = new LineageImportSummary(this.key
                , this.producerName
                , this.producerUri
                , this.jobNamespace
                , this.timeCreated
                , this.timeFinished
                , this.createdBy
                , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageImportSummary model) {
                this.key(model.getKey());
    this.producerName(model.getProducerName());
    this.producerUri(model.getProducerUri());
    this.jobNamespace(model.getJobNamespace());
    this.timeCreated(model.getTimeCreated());
    this.timeFinished(model.getTimeFinished());
    this.createdBy(model.getCreatedBy());
    this.lifecycleState(model.getLifecycleState());
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
     * Generated lineage import key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Generated lineage import key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Name of the producer that emitted the lineage event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("producerName")
    private final String producerName;

        /**
     * Name of the producer that emitted the lineage event.
     * @return the value
     **/
    
    public String getProducerName() {
        return producerName;
    }


        /**
     * URI of the lineage producer.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("producerUri")
    private final String producerUri;

        /**
     * URI of the lineage producer.
     * @return the value
     **/
    
    public String getProducerUri() {
        return producerUri;
    }


        /**
     * Namespace of the OpenLineage job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobNamespace")
    private final String jobNamespace;

        /**
     * Namespace of the OpenLineage job.
     * @return the value
     **/
    
    public String getJobNamespace() {
        return jobNamespace;
    }


        /**
     * Time the import was accepted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Time the import was accepted.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Time import processing completed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

        /**
     * Time import processing completed.
     * @return the value
     **/
    
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }


        /**
     * Principal that submitted the import.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * Principal that submitted the import.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }

    
        /**
     * Current processing state of the lineage import.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LineageImportLifecycleState lifecycleState;

        /**
     * Current processing state of the lineage import.
     * @return the value
     **/
    
    public LineageImportLifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("LineageImportSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", producerName=").append(String.valueOf(this.producerName));
        sb.append(", producerUri=").append(String.valueOf(this.producerUri));
        sb.append(", jobNamespace=").append(String.valueOf(this.jobNamespace));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageImportSummary)) {
            return false;
        }

        LineageImportSummary other = (LineageImportSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.producerName, other.producerName) &&
            java.util.Objects.equals(this.producerUri, other.producerUri) &&
            java.util.Objects.equals(this.jobNamespace, other.jobNamespace) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeFinished, other.timeFinished) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.producerName == null ? 43 : this.producerName.hashCode());
        result = (result * PRIME) + (this.producerUri == null ? 43 : this.producerUri.hashCode());
        result = (result * PRIME) + (this.jobNamespace == null ? 43 : this.jobNamespace.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
