package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformWorkspaceObjectResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Unique key of the object.
* 
     */
    private String objectKey;

    /**
     * Unique key of the object.
* 
     * @return the value
     */
    public String getObjectKey() {
        return objectKey;
    }
    
    /**
     * The full path of the object.
* 
     */
    private String path;

    /**
     * The full path of the object.
* 
     * @return the value
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Type of the object
* 
     */
    private String type;

    /**
     * Type of the object
* 
     * @return the value
     */
    public String getType() {
        return type;
    }
    
    /**
     * The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     */
    private java.util.Date timeUpdated;

    /**
     * The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    
    /**
     * The returned {@code java.io.InputStream} instance.
     */
    private java.io.InputStream inputStream;

    /**
     * The returned {@code java.io.InputStream} instance.
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "objectKey", "path", "type", "timeUpdated", "inputStream"})
    private GetAiDataPlatformWorkspaceObjectResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, String objectKey, String path, String type, java.util.Date timeUpdated, java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.objectKey = objectKey;
        this.path = path;
        this.type = type;
        this.timeUpdated = timeUpdated;
        this.inputStream = inputStream;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<GetAiDataPlatformWorkspaceObjectResponse> {
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
         * Unique key of the object.
* 
         */
        private String objectKey;

        /**
         * Unique key of the object.
* 
         * @param objectKey the value to set
         * @return this builder
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * The full path of the object.
* 
         */
        private String path;

        /**
         * The full path of the object.
* 
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Type of the object
* 
         */
        private String type;

        /**
         * Type of the object
* 
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         */
        private java.util.Date timeUpdated;

        /**
         * The date and time when Workspace Object was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * The returned {@code java.io.InputStream} instance.
         */
        private java.io.InputStream inputStream;

        /**
         * The returned {@code java.io.InputStream} instance.
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(GetAiDataPlatformWorkspaceObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());objectKey(o.getObjectKey());path(o.getPath());type(o.getType());timeUpdated(o.getTimeUpdated());
            inputStream(o.getInputStream());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public GetAiDataPlatformWorkspaceObjectResponse build() {
            return new GetAiDataPlatformWorkspaceObjectResponse(__httpStatusCode__, headers, etag, opcRequestId, objectKey, path, type, timeUpdated, inputStream);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",objectKey=").append(String.valueOf(objectKey));
        sb.append(",path=").append(String.valueOf(path));
        sb.append(",type=").append(String.valueOf(type));
        sb.append(",timeUpdated=").append(String.valueOf(timeUpdated));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAiDataPlatformWorkspaceObjectResponse)) {
            return false;
        }

        GetAiDataPlatformWorkspaceObjectResponse other = (GetAiDataPlatformWorkspaceObjectResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.objectKey, other.objectKey)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
            && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.objectKey == null ? 43 : this.objectKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}