// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Optional exact-match filters applied to correlated inference invocations before export.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportInferenceInvocationsFilters.Builder.class)

public final class ExportInferenceInvocationsFilters  {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "modelVersion", "requestUri"})
    public ExportInferenceInvocationsFilters(InferenceInvocationStatus status, String modelVersion, String requestUri) {
        super();
        this.status = status;
        this.modelVersion = modelVersion;
        this.requestUri = requestUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private InferenceInvocationStatus status;

        /**
         * Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(InferenceInvocationStatus status) {
    this.status = status;
    return this;
}
            /**
     * Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_version")
private String modelVersion;

        /**
         * Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * Only export invocations whose request URI exactly matches this value.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("request_uri")
private String requestUri;

        /**
         * Only export invocations whose request URI exactly matches this value.
         * @param requestUri the value to set
         * @return this builder
         **/
        

public Builder requestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
}


        public ExportInferenceInvocationsFilters build() {
            ExportInferenceInvocationsFilters model = new ExportInferenceInvocationsFilters(this.status
                , this.modelVersion
                , this.requestUri);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportInferenceInvocationsFilters model) {
                this.status(model.getStatus());
    this.modelVersion(model.getModelVersion());
    this.requestUri(model.getRequestUri());
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
     * Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final InferenceInvocationStatus status;

        /**
     * Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).
     * @return the value
     **/
    
    public InferenceInvocationStatus getStatus() {
        return status;
    }


        /**
     * Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_version")
    private final String modelVersion;

        /**
     * Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }


        /**
     * Only export invocations whose request URI exactly matches this value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("request_uri")
    private final String requestUri;

        /**
     * Only export invocations whose request URI exactly matches this value.
     * @return the value
     **/
    
    public String getRequestUri() {
        return requestUri;
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
        sb.append("ExportInferenceInvocationsFilters(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", requestUri=").append(String.valueOf(this.requestUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportInferenceInvocationsFilters)) {
            return false;
        }

        ExportInferenceInvocationsFilters other = (ExportInferenceInvocationsFilters) o;
        return java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.requestUri, other.requestUri);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.requestUri == null ? 43 : this.requestUri.hashCode());
        return result;
    }


}
