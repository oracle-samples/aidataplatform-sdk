// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Span details
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SpanDetails.Builder.class)

public final class SpanDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"parentTraceId", "spanId", "parentSpanId", "startTime", "endTime", "kind", "spanName", "attributes", "events", "status"})
    public SpanDetails(String parentTraceId, String spanId, String parentSpanId, Long startTime, Long endTime, String kind, String spanName, java.util.Map<String, Object> attributes, java.util.List<TraceEvent> events, SpanStatus status) {
        super();
        this.parentTraceId = parentTraceId;
        this.spanId = spanId;
        this.parentSpanId = parentSpanId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.kind = kind;
        this.spanName = spanName;
        this.attributes = attributes;
        this.events = events;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * trace id
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentTraceId")
private String parentTraceId;

        /**
         * trace id
         * @param parentTraceId the value to set
         * @return this builder
         **/
        

public Builder parentTraceId(String parentTraceId) {
    this.parentTraceId = parentTraceId;
    return this;
}
            /**
     * span id
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("spanId")
private String spanId;

        /**
         * span id
         * @param spanId the value to set
         * @return this builder
         **/
        

public Builder spanId(String spanId) {
    this.spanId = spanId;
    return this;
}
            /**
     * parent span id
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentSpanId")
private String parentSpanId;

        /**
         * parent span id
         * @param parentSpanId the value to set
         * @return this builder
         **/
        

public Builder parentSpanId(String parentSpanId) {
    this.parentSpanId = parentSpanId;
    return this;
}
            /**
     * start time
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("startTime")
private Long startTime;

        /**
         * start time
         * @param startTime the value to set
         * @return this builder
         **/
        

public Builder startTime(Long startTime) {
    this.startTime = startTime;
    return this;
}
            /**
     * end time
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("endTime")
private Long endTime;

        /**
         * end time
         * @param endTime the value to set
         * @return this builder
         **/
        

public Builder endTime(Long endTime) {
    this.endTime = endTime;
    return this;
}
            /**
     * type of span
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;

        /**
         * type of span
         * @param kind the value to set
         * @return this builder
         **/
        

public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
            /**
     * span name
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("spanName")
private String spanName;

        /**
         * span name
         * @param spanName the value to set
         * @return this builder
         **/
        

public Builder spanName(String spanName) {
    this.spanName = spanName;
    return this;
}
            /**
     * span attributes
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("attributes")
private java.util.Map<String, Object> attributes;

        /**
         * span attributes
         * @param attributes the value to set
         * @return this builder
         **/
        

public Builder attributes(java.util.Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
}
            /**
     * collections of trace objects
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("events")
private java.util.List<TraceEvent> events;

        /**
         * collections of trace objects
         * @param events the value to set
         * @return this builder
         **/
        

public Builder events(java.util.List<TraceEvent> events) {
    this.events = events;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("status")
private SpanStatus status;



public Builder status(SpanStatus status) {
    this.status = status;
    return this;
}


        public SpanDetails build() {
            SpanDetails model = new SpanDetails(this.parentTraceId
                , this.spanId
                , this.parentSpanId
                , this.startTime
                , this.endTime
                , this.kind
                , this.spanName
                , this.attributes
                , this.events
                , this.status);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanDetails model) {
                this.parentTraceId(model.getParentTraceId());
    this.spanId(model.getSpanId());
    this.parentSpanId(model.getParentSpanId());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.kind(model.getKind());
    this.spanName(model.getSpanName());
    this.attributes(model.getAttributes());
    this.events(model.getEvents());
    this.status(model.getStatus());
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
     * trace id
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentTraceId")
    private final String parentTraceId;

        /**
     * trace id
     * @return the value
     **/
    
    public String getParentTraceId() {
        return parentTraceId;
    }


        /**
     * span id
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("spanId")
    private final String spanId;

        /**
     * span id
     * @return the value
     **/
    
    public String getSpanId() {
        return spanId;
    }


        /**
     * parent span id
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentSpanId")
    private final String parentSpanId;

        /**
     * parent span id
     * @return the value
     **/
    
    public String getParentSpanId() {
        return parentSpanId;
    }


        /**
     * start time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Long startTime;

        /**
     * start time
     * @return the value
     **/
    
    public Long getStartTime() {
        return startTime;
    }


        /**
     * end time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final Long endTime;

        /**
     * end time
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * type of span
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

        /**
     * type of span
     * @return the value
     **/
    
    public String getKind() {
        return kind;
    }


        /**
     * span name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("spanName")
    private final String spanName;

        /**
     * span name
     * @return the value
     **/
    
    public String getSpanName() {
        return spanName;
    }


        /**
     * span attributes
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.Map<String, Object> attributes;

        /**
     * span attributes
     * @return the value
     **/
    
    public java.util.Map<String, Object> getAttributes() {
        return attributes;
    }


        /**
     * collections of trace objects
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    private final java.util.List<TraceEvent> events;

        /**
     * collections of trace objects
     * @return the value
     **/
    
    public java.util.List<TraceEvent> getEvents() {
        return events;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final SpanStatus status;

    
    public SpanStatus getStatus() {
        return status;
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
        sb.append("SpanDetails(");
        sb.append("parentTraceId=").append(String.valueOf(this.parentTraceId));
        sb.append(", spanId=").append(String.valueOf(this.spanId));
        sb.append(", parentSpanId=").append(String.valueOf(this.parentSpanId));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", spanName=").append(String.valueOf(this.spanName));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", events=").append(String.valueOf(this.events));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanDetails)) {
            return false;
        }

        SpanDetails other = (SpanDetails) o;
        return java.util.Objects.equals(this.parentTraceId, other.parentTraceId) &&
            java.util.Objects.equals(this.spanId, other.spanId) &&
            java.util.Objects.equals(this.parentSpanId, other.parentSpanId) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.spanName, other.spanName) &&
            java.util.Objects.equals(this.attributes, other.attributes) &&
            java.util.Objects.equals(this.events, other.events) &&
            java.util.Objects.equals(this.status, other.status);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parentTraceId == null ? 43 : this.parentTraceId.hashCode());
        result = (result * PRIME) + (this.spanId == null ? 43 : this.spanId.hashCode());
        result = (result * PRIME) + (this.parentSpanId == null ? 43 : this.parentSpanId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.spanName == null ? 43 : this.spanName.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + (this.events == null ? 43 : this.events.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        return result;
    }


}
