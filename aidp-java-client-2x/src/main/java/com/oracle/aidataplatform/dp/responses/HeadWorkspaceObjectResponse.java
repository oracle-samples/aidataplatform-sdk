// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class HeadWorkspaceObjectResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * File metadata of the file.
* 
     */
    private String fileMetadata;

    /**
     * File metadata of the file.
* 
     * @return the value
     */
    public String getFileMetadata() {
        return fileMetadata;
    }
    
    /**
     * The file composite (data + metadata) etag.
* 
     */
    private String compositeEtag;

    /**
     * The file composite (data + metadata) etag.
* 
     * @return the value
     */
    public String getCompositeEtag() {
        return compositeEtag;
    }
    
    


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "objectKey", "path", "type", "timeUpdated", "fileMetadata", "compositeEtag"})
    private HeadWorkspaceObjectResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, String objectKey, String path, String type, java.util.Date timeUpdated, String fileMetadata, String compositeEtag) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.objectKey = objectKey;
        this.path = path;
        this.type = type;
        this.timeUpdated = timeUpdated;
        this.fileMetadata = fileMetadata;
        this.compositeEtag = compositeEtag;

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
         * File metadata of the file.
* 
         */
        private String fileMetadata;

        /**
         * File metadata of the file.
* 
         * @param fileMetadata the value to set
         * @return this builder
         */
        public Builder fileMetadata(String fileMetadata) {
            this.fileMetadata = fileMetadata;
            return this;
        }

        /**
         * The file composite (data + metadata) etag.
* 
         */
        private String compositeEtag;

        /**
         * The file composite (data + metadata) etag.
* 
         * @param compositeEtag the value to set
         * @return this builder
         */
        public Builder compositeEtag(String compositeEtag) {
            this.compositeEtag = compositeEtag;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(HeadWorkspaceObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());objectKey(o.getObjectKey());path(o.getPath());type(o.getType());timeUpdated(o.getTimeUpdated());fileMetadata(o.getFileMetadata());compositeEtag(o.getCompositeEtag());
            
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public HeadWorkspaceObjectResponse build() {
            return new HeadWorkspaceObjectResponse(__httpStatusCode__, headers, opcRequestId, objectKey, path, type, timeUpdated, fileMetadata, compositeEtag);
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
        sb.append(",objectKey=").append(String.valueOf(objectKey));
        sb.append(",path=").append(String.valueOf(path));
        sb.append(",type=").append(String.valueOf(type));
        sb.append(",timeUpdated=").append(String.valueOf(timeUpdated));
        sb.append(",fileMetadata=").append(String.valueOf(fileMetadata));
        sb.append(",compositeEtag=").append(String.valueOf(compositeEtag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeadWorkspaceObjectResponse)) {
            return false;
        }

        HeadWorkspaceObjectResponse other = (HeadWorkspaceObjectResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.objectKey, other.objectKey)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
            && java.util.Objects.equals(this.fileMetadata, other.fileMetadata)
            && java.util.Objects.equals(this.compositeEtag, other.compositeEtag);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.objectKey == null ? 43 : this.objectKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.fileMetadata == null ? 43 : this.fileMetadata.hashCode());
        result = (result * PRIME) + (this.compositeEtag == null ? 43 : this.compositeEtag.hashCode());
        return result;
    }
}