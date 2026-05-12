package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class FetchAiDataPlatformOutputResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For optimistic concurrency control. See {@code if-match}.
* 
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
* 
     * @return the value
     */
    public String getEtag() {
        return etag;
    }
    
    /**
     * The returned TaskRunOutput instance.
     */
    private com.oracle.aidataplatform.dp.model.TaskRunOutput taskRunOutput;

    /**
     * The returned TaskRunOutput instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.TaskRunOutput getTaskRunOutput() {
        return taskRunOutput;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "etag", "taskRunOutput"})
    private FetchAiDataPlatformOutputResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, String etag, com.oracle.aidataplatform.dp.model.TaskRunOutput taskRunOutput) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.taskRunOutput = taskRunOutput;

    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
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
         * For optimistic concurrency control. See {@code if-match}.
* 
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
* 
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned TaskRunOutput instance.
         */
        private com.oracle.aidataplatform.dp.model.TaskRunOutput taskRunOutput;

        /**
         * The returned TaskRunOutput instance.
         * @param taskRunOutput the value to set
         * @return this builder
         */
        public Builder taskRunOutput(com.oracle.aidataplatform.dp.model.TaskRunOutput taskRunOutput) {
            this.taskRunOutput = taskRunOutput;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(FetchAiDataPlatformOutputResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());etag(o.getEtag());
            taskRunOutput(o.getTaskRunOutput());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public FetchAiDataPlatformOutputResponse build() {
            return new FetchAiDataPlatformOutputResponse(__httpStatusCode__, headers, opcRequestId, etag, taskRunOutput);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",taskRunOutput=").append(String.valueOf(taskRunOutput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchAiDataPlatformOutputResponse)) {
            return false;
        }

        FetchAiDataPlatformOutputResponse other = (FetchAiDataPlatformOutputResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.taskRunOutput, other.taskRunOutput);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.taskRunOutput == null ? 43 : this.taskRunOutput.hashCode());
        return result;
    }
}