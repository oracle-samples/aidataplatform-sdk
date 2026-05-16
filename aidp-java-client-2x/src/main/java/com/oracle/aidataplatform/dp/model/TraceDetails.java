// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Trace object
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TraceDetails.Builder.class)

public final class TraceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"traceId", "parentSessionId", "spans", "startTime", "endTime", "resources"})
    public TraceDetails(String traceId, String parentSessionId, java.util.List<SpanDetails> spans, Long startTime, Long endTime, java.util.Map<String, Object> resources) {
        super();
        this.traceId = traceId;
        this.parentSessionId = parentSessionId;
        this.spans = spans;
        this.startTime = startTime;
        this.endTime = endTime;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * trace id
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("traceId")
        private String traceId;

                /**
         * trace id
         * @param traceId the value to set
         * @return this builder
         **/
        

        public Builder traceId(String traceId) {
        this.traceId = traceId;
        return this;
        }
            /**
     * session id
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("parentSessionId")
        private String parentSessionId;

                /**
         * session id
         * @param parentSessionId the value to set
         * @return this builder
         **/
        

        public Builder parentSessionId(String parentSessionId) {
        this.parentSessionId = parentSessionId;
        return this;
        }
            /**
     * collections of spans
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("spans")
        private java.util.List<SpanDetails> spans;

                /**
         * collections of spans
         * @param spans the value to set
         * @return this builder
         **/
        

        public Builder spans(java.util.List<SpanDetails> spans) {
        this.spans = spans;
        return this;
        }
            /**
     * startTime
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private Long startTime;

                /**
         * startTime
         * @param startTime the value to set
         * @return this builder
         **/
        

        public Builder startTime(Long startTime) {
        this.startTime = startTime;
        return this;
        }
            /**
     * endTime
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private Long endTime;

                /**
         * endTime
         * @param endTime the value to set
         * @return this builder
         **/
        

        public Builder endTime(Long endTime) {
        this.endTime = endTime;
        return this;
        }
            /**
     * Map of properties
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.Map<String, Object> resources;

                /**
         * Map of properties
         * @param resources the value to set
         * @return this builder
         **/
        

        public Builder resources(java.util.Map<String, Object> resources) {
        this.resources = resources;
        return this;
        }


        public TraceDetails build() {
            TraceDetails model = new TraceDetails(this.traceId
                    , this.parentSessionId
                    , this.spans
                    , this.startTime
                    , this.endTime
                    , this.resources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceDetails model) {
                this.traceId(model.getTraceId());
    this.parentSessionId(model.getParentSessionId());
    this.spans(model.getSpans());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.resources(model.getResources());
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("traceId")
    private final String traceId;

        /**
     * trace id
     * @return the value
     **/
    
    public String getTraceId() {
        return traceId;
    }


        /**
     * session id
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentSessionId")
    private final String parentSessionId;

        /**
     * session id
     * @return the value
     **/
    
    public String getParentSessionId() {
        return parentSessionId;
    }


        /**
     * collections of spans
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("spans")
    private final java.util.List<SpanDetails> spans;

        /**
     * collections of spans
     * @return the value
     **/
    
    public java.util.List<SpanDetails> getSpans() {
        return spans;
    }


        /**
     * startTime
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Long startTime;

        /**
     * startTime
     * @return the value
     **/
    
    public Long getStartTime() {
        return startTime;
    }


        /**
     * endTime
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final Long endTime;

        /**
     * endTime
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * Map of properties
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.Map<String, Object> resources;

        /**
     * Map of properties
     * @return the value
     **/
    
    public java.util.Map<String, Object> getResources() {
        return resources;
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
        sb.append("TraceDetails(");
        sb.append("traceId=").append(String.valueOf(this.traceId));
        sb.append(", parentSessionId=").append(String.valueOf(this.parentSessionId));
        sb.append(", spans=").append(String.valueOf(this.spans));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TraceDetails)) {
            return false;
        }

        TraceDetails other = (TraceDetails) o;
        return java.util.Objects.equals(this.traceId, other.traceId) &&
            java.util.Objects.equals(this.parentSessionId, other.parentSessionId) &&
            java.util.Objects.equals(this.spans, other.spans) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.resources, other.resources);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.traceId == null ? 43 : this.traceId.hashCode());
        result = (result * PRIME) + (this.parentSessionId == null ? 43 : this.parentSessionId.hashCode());
        result = (result * PRIME) + (this.spans == null ? 43 : this.spans.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        return result;
    }


}
