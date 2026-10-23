// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * High-level details of an imported OpenLineage run event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageImportRunEvent.Builder.class)

public final class LineageImportRunEvent  {
    @Deprecated
    @java.beans.ConstructorProperties({"eventType", "eventTime", "key", "jobName", "ingestionLifecycleState", "inputs", "outputs"})
    public LineageImportRunEvent(String eventType, java.util.Date eventTime, String key, String jobName, LineageImportRunEventIngestionLifecycleState ingestionLifecycleState, java.util.List<LineageImportRunEventDataset> inputs, java.util.List<LineageImportRunEventDataset> outputs) {
        super();
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.key = key;
        this.jobName = jobName;
        this.ingestionLifecycleState = ingestionLifecycleState;
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * OpenLineage event type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eventType")
private String eventType;

        /**
         * OpenLineage event type.
         * @param eventType the value to set
         * @return this builder
         **/
        

public Builder eventType(String eventType) {
    this.eventType = eventType;
    return this;
}
            /**
     * Time the OpenLineage event occurred.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eventTime")
private java.util.Date eventTime;

        /**
         * Time the OpenLineage event occurred.
         * @param eventTime the value to set
         * @return this builder
         **/
        

public Builder eventTime(java.util.Date eventTime) {
    this.eventTime = eventTime;
    return this;
}
            /**
     * Unique identifier for the imported run event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique identifier for the imported run event.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Name of the OpenLineage job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobName")
private String jobName;

        /**
         * Name of the OpenLineage job.
         * @param jobName the value to set
         * @return this builder
         **/
        

public Builder jobName(String jobName) {
    this.jobName = jobName;
    return this;
}
            /**
     * Graph-ingestion state for this imported run event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ingestionLifecycleState")
private LineageImportRunEventIngestionLifecycleState ingestionLifecycleState;

        /**
         * Graph-ingestion state for this imported run event.
         * @param ingestionLifecycleState the value to set
         * @return this builder
         **/
        

public Builder ingestionLifecycleState(LineageImportRunEventIngestionLifecycleState ingestionLifecycleState) {
    this.ingestionLifecycleState = ingestionLifecycleState;
    return this;
}
            /**
     * Input datasets referenced by the run event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("inputs")
private java.util.List<LineageImportRunEventDataset> inputs;

        /**
         * Input datasets referenced by the run event.
         * @param inputs the value to set
         * @return this builder
         **/
        

public Builder inputs(java.util.List<LineageImportRunEventDataset> inputs) {
    this.inputs = inputs;
    return this;
}
            /**
     * Output datasets referenced by the run event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("outputs")
private java.util.List<LineageImportRunEventDataset> outputs;

        /**
         * Output datasets referenced by the run event.
         * @param outputs the value to set
         * @return this builder
         **/
        

public Builder outputs(java.util.List<LineageImportRunEventDataset> outputs) {
    this.outputs = outputs;
    return this;
}


        public LineageImportRunEvent build() {
            LineageImportRunEvent model = new LineageImportRunEvent(this.eventType
                , this.eventTime
                , this.key
                , this.jobName
                , this.ingestionLifecycleState
                , this.inputs
                , this.outputs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageImportRunEvent model) {
                this.eventType(model.getEventType());
    this.eventTime(model.getEventTime());
    this.key(model.getKey());
    this.jobName(model.getJobName());
    this.ingestionLifecycleState(model.getIngestionLifecycleState());
    this.inputs(model.getInputs());
    this.outputs(model.getOutputs());
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
     * OpenLineage event type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    private final String eventType;

        /**
     * OpenLineage event type.
     * @return the value
     **/
    
    public String getEventType() {
        return eventType;
    }


        /**
     * Time the OpenLineage event occurred.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
    private final java.util.Date eventTime;

        /**
     * Time the OpenLineage event occurred.
     * @return the value
     **/
    
    public java.util.Date getEventTime() {
        return eventTime;
    }


        /**
     * Unique identifier for the imported run event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for the imported run event.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Name of the OpenLineage job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

        /**
     * Name of the OpenLineage job.
     * @return the value
     **/
    
    public String getJobName() {
        return jobName;
    }

    
        /**
     * Graph-ingestion state for this imported run event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ingestionLifecycleState")
    private final LineageImportRunEventIngestionLifecycleState ingestionLifecycleState;

        /**
     * Graph-ingestion state for this imported run event.
     * @return the value
     **/
    
    public LineageImportRunEventIngestionLifecycleState getIngestionLifecycleState() {
        return ingestionLifecycleState;
    }


        /**
     * Input datasets referenced by the run event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.List<LineageImportRunEventDataset> inputs;

        /**
     * Input datasets referenced by the run event.
     * @return the value
     **/
    
    public java.util.List<LineageImportRunEventDataset> getInputs() {
        return inputs;
    }


        /**
     * Output datasets referenced by the run event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.List<LineageImportRunEventDataset> outputs;

        /**
     * Output datasets referenced by the run event.
     * @return the value
     **/
    
    public java.util.List<LineageImportRunEventDataset> getOutputs() {
        return outputs;
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
        sb.append("LineageImportRunEvent(");
        sb.append("eventType=").append(String.valueOf(this.eventType));
        sb.append(", eventTime=").append(String.valueOf(this.eventTime));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", ingestionLifecycleState=").append(String.valueOf(this.ingestionLifecycleState));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageImportRunEvent)) {
            return false;
        }

        LineageImportRunEvent other = (LineageImportRunEvent) o;
        return java.util.Objects.equals(this.eventType, other.eventType) &&
            java.util.Objects.equals(this.eventTime, other.eventTime) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.jobName, other.jobName) &&
            java.util.Objects.equals(this.ingestionLifecycleState, other.ingestionLifecycleState) &&
            java.util.Objects.equals(this.inputs, other.inputs) &&
            java.util.Objects.equals(this.outputs, other.outputs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.eventType == null ? 43 : this.eventType.hashCode());
        result = (result * PRIME) + (this.eventTime == null ? 43 : this.eventTime.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result = (result * PRIME) + (this.ingestionLifecycleState == null ? 43 : this.ingestionLifecycleState.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        return result;
    }


}
