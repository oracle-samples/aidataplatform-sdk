package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateAiDataPlatformContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL for the new file.
     */
    private String location;

    /**
     * URL for the new file.
     * @return the value
     */
    public String getLocation() {
        return location;
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
     * The returned Content instance.
     */
    private com.oracle.aidataplatform.dp.model.Content content;

    /**
     * The returned Content instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.Content getContent() {
        return content;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "location", "etag", "opcWorkRequestId", "opcRequestId", "content"})
    private UpdateAiDataPlatformContentResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String location, String etag, String opcWorkRequestId, String opcRequestId, com.oracle.aidataplatform.dp.model.Content content) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.content = content;

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
         * URL for the new file.
         */
        private String location;

        /**
         * URL for the new file.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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
         * The returned Content instance.
         */
        private com.oracle.aidataplatform.dp.model.Content content;

        /**
         * The returned Content instance.
         * @param content the value to set
         * @return this builder
         */
        public Builder content(com.oracle.aidataplatform.dp.model.Content content) {
            this.content = content;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAiDataPlatformContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());etag(o.getEtag());opcWorkRequestId(o.getOpcWorkRequestId());opcRequestId(o.getOpcRequestId());
            content(o.getContent());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateAiDataPlatformContentResponse build() {
            return new UpdateAiDataPlatformContentResponse(__httpStatusCode__, headers, location, etag, opcWorkRequestId, opcRequestId, content);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",content=").append(String.valueOf(content));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAiDataPlatformContentResponse)) {
            return false;
        }

        UpdateAiDataPlatformContentResponse other = (UpdateAiDataPlatformContentResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.location, other.location)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.content, other.content);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        return result;
    }
}