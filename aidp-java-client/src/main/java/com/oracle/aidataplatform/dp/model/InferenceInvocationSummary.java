// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One correlated inference request and response record.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationSummary.Builder.class)

public final class InferenceInvocationSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"requestTimestamp", "requestUri", "modelVersion", "status", "latencyMs", "requestId"})
    public InferenceInvocationSummary(java.util.Date requestTimestamp, String requestUri, String modelVersion, InferenceInvocationStatus status, Long latencyMs, String requestId) {
        super();
        this.requestTimestamp = requestTimestamp;
        this.requestUri = requestUri;
        this.modelVersion = modelVersion;
        this.status = status;
        this.latencyMs = latencyMs;
        this.requestId = requestId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Timestamp recorded for the inference request event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requestTimestamp")
private java.util.Date requestTimestamp;

        /**
         * Timestamp recorded for the inference request event.
         * @param requestTimestamp the value to set
         * @return this builder
         **/
        

public Builder requestTimestamp(java.util.Date requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
}
            /**
     * Inference endpoint URI.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requestUri")
private String requestUri;

        /**
         * Inference endpoint URI.
         * @param requestUri the value to set
         * @return this builder
         **/
        

public Builder requestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
}
            /**
     * Model version associated with the invocation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
private String modelVersion;

        /**
         * Model version associated with the invocation.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * Status derived from the correlated inference response event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private InferenceInvocationStatus status;

        /**
         * Status derived from the correlated inference response event.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(InferenceInvocationStatus status) {
    this.status = status;
    return this;
}
            /**
     * Response latency in milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("latencyMs")
private Long latencyMs;

        /**
         * Response latency in milliseconds.
         * @param latencyMs the value to set
         * @return this builder
         **/
        

public Builder latencyMs(Long latencyMs) {
    this.latencyMs = latencyMs;
    return this;
}
            /**
     * Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requestId")
private String requestId;

        /**
         * Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.
         * @param requestId the value to set
         * @return this builder
         **/
        

public Builder requestId(String requestId) {
    this.requestId = requestId;
    return this;
}


        public InferenceInvocationSummary build() {
            InferenceInvocationSummary model = new InferenceInvocationSummary(this.requestTimestamp
                , this.requestUri
                , this.modelVersion
                , this.status
                , this.latencyMs
                , this.requestId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationSummary model) {
                this.requestTimestamp(model.getRequestTimestamp());
    this.requestUri(model.getRequestUri());
    this.modelVersion(model.getModelVersion());
    this.status(model.getStatus());
    this.latencyMs(model.getLatencyMs());
    this.requestId(model.getRequestId());
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
     * Timestamp recorded for the inference request event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requestTimestamp")
    private final java.util.Date requestTimestamp;

        /**
     * Timestamp recorded for the inference request event.
     * @return the value
     **/
    
    public java.util.Date getRequestTimestamp() {
        return requestTimestamp;
    }


        /**
     * Inference endpoint URI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requestUri")
    private final String requestUri;

        /**
     * Inference endpoint URI.
     * @return the value
     **/
    
    public String getRequestUri() {
        return requestUri;
    }


        /**
     * Model version associated with the invocation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

        /**
     * Model version associated with the invocation.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }

    
        /**
     * Status derived from the correlated inference response event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final InferenceInvocationStatus status;

        /**
     * Status derived from the correlated inference response event.
     * @return the value
     **/
    
    public InferenceInvocationStatus getStatus() {
        return status;
    }


        /**
     * Response latency in milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("latencyMs")
    private final Long latencyMs;

        /**
     * Response latency in milliseconds.
     * @return the value
     **/
    
    public Long getLatencyMs() {
        return latencyMs;
    }


        /**
     * Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

        /**
     * Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.
     * @return the value
     **/
    
    public String getRequestId() {
        return requestId;
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
        sb.append("InferenceInvocationSummary(");
        sb.append("requestTimestamp=").append(String.valueOf(this.requestTimestamp));
        sb.append(", requestUri=").append(String.valueOf(this.requestUri));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", latencyMs=").append(String.valueOf(this.latencyMs));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationSummary)) {
            return false;
        }

        InferenceInvocationSummary other = (InferenceInvocationSummary) o;
        return java.util.Objects.equals(this.requestTimestamp, other.requestTimestamp) &&
            java.util.Objects.equals(this.requestUri, other.requestUri) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.latencyMs, other.latencyMs) &&
            java.util.Objects.equals(this.requestId, other.requestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.requestTimestamp == null ? 43 : this.requestTimestamp.hashCode());
        result = (result * PRIME) + (this.requestUri == null ? 43 : this.requestUri.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.latencyMs == null ? 43 : this.latencyMs.hashCode());
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        return result;
    }


}
