// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filters and OCI-backed pagination for correlated inference invocation rows. Each response contains at most 20 rows; only the first 10,000 matching rows are available.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationSearchDetails.Builder.class)

public final class InferenceInvocationSearchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "status", "modelVersion", "requestUri", "pageToken"})
    public InferenceInvocationSearchDetails(java.util.Date timeStart, java.util.Date timeEnd, InferenceInvocationStatus status, String modelVersion, String requestUri, String pageToken) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.status = status;
        this.modelVersion = modelVersion;
        this.requestUri = requestUri;
        this.pageToken = pageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * Restricts results to correlated invocations with this status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private InferenceInvocationStatus status;

        /**
         * Restricts results to correlated invocations with this status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(InferenceInvocationStatus status) {
    this.status = status;
    return this;
}
            /**
     * Restricts results to invocations served by this model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
private String modelVersion;

        /**
         * Restricts results to invocations served by this model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * Restricts results to invocations against this inference endpoint URI.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requestUri")
private String requestUri;

        /**
         * Restricts results to invocations against this inference endpoint URI.
         * @param requestUri the value to set
         * @return this builder
         **/
        

public Builder requestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
}
            /**
     * Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pageToken")
private String pageToken;

        /**
         * Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
         * @param pageToken the value to set
         * @return this builder
         **/
        

public Builder pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
}


        public InferenceInvocationSearchDetails build() {
            InferenceInvocationSearchDetails model = new InferenceInvocationSearchDetails(this.timeStart
                , this.timeEnd
                , this.status
                , this.modelVersion
                , this.requestUri
                , this.pageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationSearchDetails model) {
                this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.status(model.getStatus());
    this.modelVersion(model.getModelVersion());
    this.requestUri(model.getRequestUri());
    this.pageToken(model.getPageToken());
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
     * Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    
        /**
     * Restricts results to correlated invocations with this status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final InferenceInvocationStatus status;

        /**
     * Restricts results to correlated invocations with this status.
     * @return the value
     **/
    
    public InferenceInvocationStatus getStatus() {
        return status;
    }


        /**
     * Restricts results to invocations served by this model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

        /**
     * Restricts results to invocations served by this model version.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }


        /**
     * Restricts results to invocations against this inference endpoint URI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requestUri")
    private final String requestUri;

        /**
     * Restricts results to invocations against this inference endpoint URI.
     * @return the value
     **/
    
    public String getRequestUri() {
        return requestUri;
    }


        /**
     * Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pageToken")
    private final String pageToken;

        /**
     * Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
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
        sb.append("InferenceInvocationSearchDetails(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", requestUri=").append(String.valueOf(this.requestUri));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationSearchDetails)) {
            return false;
        }

        InferenceInvocationSearchDetails other = (InferenceInvocationSearchDetails) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.requestUri, other.requestUri) &&
            java.util.Objects.equals(this.pageToken, other.pageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.requestUri == null ? 43 : this.requestUri.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        return result;
    }


}
