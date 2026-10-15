// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ExportModelDeploymentInferencesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
     */
    private String aidpAsyncOperationKey;

    /**
     * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
     * @return the value
     */
    public String getAidpAsyncOperationKey() {
        return aidpAsyncOperationKey;
    }
    
    /**
     * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * The destination the export will be written to. When the requested file already
* exists and is_overwrite is false, a non-colliding name is chosen by appending
* _copy before the extension, so this can differ from the requested volume_location.
* 
     */
    private String aidpExportDestination;

    /**
     * The destination the export will be written to. When the requested file already
* exists and is_overwrite is false, a non-colliding name is chosen by appending
* _copy before the extension, so this can differ from the requested volume_location.
* 
     * @return the value
     */
    public String getAidpExportDestination() {
        return aidpExportDestination;
    }
    
    

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "aidpAsyncOperationKey", "opcRequestId", "aidpExportDestination"})
    private ExportModelDeploymentInferencesResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String aidpAsyncOperationKey, String opcRequestId, String aidpExportDestination) {
        super(__httpStatusCode__, headers);
        this.aidpAsyncOperationKey = aidpAsyncOperationKey;
        this.opcRequestId = opcRequestId;
        this.aidpExportDestination = aidpExportDestination;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<ExportModelDeploymentInferencesResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
         */
        private String aidpAsyncOperationKey;

        /**
         * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
         * @param aidpAsyncOperationKey the value to set
         * @return this builder
         */
        public Builder aidpAsyncOperationKey(String aidpAsyncOperationKey) {
            this.aidpAsyncOperationKey = aidpAsyncOperationKey;
            return this;
        }

        /**
         * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The destination the export will be written to. When the requested file already
* exists and is_overwrite is false, a non-colliding name is chosen by appending
* _copy before the extension, so this can differ from the requested volume_location.
* 
         */
        private String aidpExportDestination;

        /**
         * The destination the export will be written to. When the requested file already
* exists and is_overwrite is false, a non-colliding name is chosen by appending
* _copy before the extension, so this can differ from the requested volume_location.
* 
         * @param aidpExportDestination the value to set
         * @return this builder
         */
        public Builder aidpExportDestination(String aidpExportDestination) {
            this.aidpExportDestination = aidpExportDestination;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(ExportModelDeploymentInferencesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            aidpAsyncOperationKey(o.getAidpAsyncOperationKey());opcRequestId(o.getOpcRequestId());aidpExportDestination(o.getAidpExportDestination());
            
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public ExportModelDeploymentInferencesResponse build() {
            return new ExportModelDeploymentInferencesResponse(__httpStatusCode__, headers, aidpAsyncOperationKey, opcRequestId, aidpExportDestination);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",aidpAsyncOperationKey=").append(String.valueOf(aidpAsyncOperationKey));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",aidpExportDestination=").append(String.valueOf(aidpExportDestination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportModelDeploymentInferencesResponse)) {
            return false;
        }

        ExportModelDeploymentInferencesResponse other = (ExportModelDeploymentInferencesResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aidpAsyncOperationKey, other.aidpAsyncOperationKey)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.aidpExportDestination, other.aidpExportDestination);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aidpAsyncOperationKey == null ? 43 : this.aidpAsyncOperationKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.aidpExportDestination == null ? 43 : this.aidpExportDestination.hashCode());
        return result;
    }
}