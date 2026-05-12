package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CreateAiDataPlatformWorkspaceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL for the created AI Data Platform Workbench workspace. The AI Data Platform Workbench workspace key is generated after this request is sent.
     */
    private String location;

    /**
     * URL for the created AI Data Platform Workbench workspace. The AI Data Platform Workbench workspace key is generated after this request is sent.
     * @return the value
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Same as location.
     */
    private String contentLocation;

    /**
     * Same as location.
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * The returned {@code Workspace} instance.
     */
    private com.oracle.aidataplatform.dp.model.Workspace workspace;

    /**
     * The returned {@code Workspace} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.Workspace getWorkspace() {
        return workspace;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "location", "contentLocation", "etag", "aidpAsyncOperationKey", "opcRequestId", "workspace"})
    private CreateAiDataPlatformWorkspaceResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String location, String contentLocation, String etag, String aidpAsyncOperationKey, String opcRequestId, com.oracle.aidataplatform.dp.model.Workspace workspace) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.aidpAsyncOperationKey = aidpAsyncOperationKey;
        this.opcRequestId = opcRequestId;
        this.workspace = workspace;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<CreateAiDataPlatformWorkspaceResponse> {
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
         * URL for the created AI Data Platform Workbench workspace. The AI Data Platform Workbench workspace key is generated after this request is sent.
         */
        private String location;

        /**
         * URL for the created AI Data Platform Workbench workspace. The AI Data Platform Workbench workspace key is generated after this request is sent.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Same as location.
         */
        private String contentLocation;

        /**
         * Same as location.
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned {@code Workspace} instance.
         */
        private com.oracle.aidataplatform.dp.model.Workspace workspace;

        /**
         * The returned {@code Workspace} instance.
         * @param workspace the value to set
         * @return this builder
         */
        public Builder workspace(com.oracle.aidataplatform.dp.model.Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateAiDataPlatformWorkspaceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());contentLocation(o.getContentLocation());etag(o.getEtag());aidpAsyncOperationKey(o.getAidpAsyncOperationKey());opcRequestId(o.getOpcRequestId());
            workspace(o.getWorkspace());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public CreateAiDataPlatformWorkspaceResponse build() {
            return new CreateAiDataPlatformWorkspaceResponse(__httpStatusCode__, headers, location, contentLocation, etag, aidpAsyncOperationKey, opcRequestId, workspace);
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
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",aidpAsyncOperationKey=").append(String.valueOf(aidpAsyncOperationKey));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",workspace=").append(String.valueOf(workspace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAiDataPlatformWorkspaceResponse)) {
            return false;
        }

        CreateAiDataPlatformWorkspaceResponse other = (CreateAiDataPlatformWorkspaceResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.location, other.location)
            && java.util.Objects.equals(this.contentLocation, other.contentLocation)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.aidpAsyncOperationKey, other.aidpAsyncOperationKey)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.workspace, other.workspace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.aidpAsyncOperationKey == null ? 43 : this.aidpAsyncOperationKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.workspace == null ? 43 : this.workspace.hashCode());
        return result;
    }
}