package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CreateAiDataPlatformDataTableResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
     */
    private String opcWorkRequestId;

    /**
     * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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
    
    

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcWorkRequestId", "opcRequestId", "aidpAsyncOperationKey"})
    private CreateAiDataPlatformDataTableResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcWorkRequestId, String opcRequestId, String aidpAsyncOperationKey) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.aidpAsyncOperationKey = aidpAsyncOperationKey;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<CreateAiDataPlatformDataTableResponse> {
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
         * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
         */
        private String opcWorkRequestId;

        /**
         * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateAiDataPlatformDataTableResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());opcRequestId(o.getOpcRequestId());aidpAsyncOperationKey(o.getAidpAsyncOperationKey());
            
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public CreateAiDataPlatformDataTableResponse build() {
            return new CreateAiDataPlatformDataTableResponse(__httpStatusCode__, headers, opcWorkRequestId, opcRequestId, aidpAsyncOperationKey);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",aidpAsyncOperationKey=").append(String.valueOf(aidpAsyncOperationKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAiDataPlatformDataTableResponse)) {
            return false;
        }

        CreateAiDataPlatformDataTableResponse other = (CreateAiDataPlatformDataTableResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.aidpAsyncOperationKey, other.aidpAsyncOperationKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.aidpAsyncOperationKey == null ? 43 : this.aidpAsyncOperationKey.hashCode());
        return result;
    }
}