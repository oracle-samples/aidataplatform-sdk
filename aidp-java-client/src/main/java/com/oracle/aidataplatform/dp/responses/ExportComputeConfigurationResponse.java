// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ExportComputeConfigurationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL for the created workspace object.
     */
    private String location;

    /**
     * URL for the created workspace object.
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
     * Full path of the YAML workspace object.
     */
    private String path;

    /**
     * Full path of the YAML workspace object.
     * @return the value
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Workspace object type.
     */
    private String type;

    /**
     * Workspace object type.
     * @return the value
     */
    public String getType() {
        return type;
    }
    
    /**
     * Date and time when the YAML workspace object was created.
     */
    private java.util.Date timeUpdated;

    /**
     * Date and time when the YAML workspace object was created.
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


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "location", "contentLocation", "opcRequestId", "path", "type", "timeUpdated", "inputStream"})
    private ExportComputeConfigurationResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String location, String contentLocation, String opcRequestId, String path, String type, java.util.Date timeUpdated, java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.contentLocation = contentLocation;
        this.opcRequestId = opcRequestId;
        this.path = path;
        this.type = type;
        this.timeUpdated = timeUpdated;
        this.inputStream = inputStream;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<ExportComputeConfigurationResponse> {
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
         * URL for the created workspace object.
         */
        private String location;

        /**
         * URL for the created workspace object.
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
         * Full path of the YAML workspace object.
         */
        private String path;

        /**
         * Full path of the YAML workspace object.
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Workspace object type.
         */
        private String type;

        /**
         * Workspace object type.
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Date and time when the YAML workspace object was created.
         */
        private java.util.Date timeUpdated;

        /**
         * Date and time when the YAML workspace object was created.
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
        public Builder copy(ExportComputeConfigurationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());contentLocation(o.getContentLocation());opcRequestId(o.getOpcRequestId());path(o.getPath());type(o.getType());timeUpdated(o.getTimeUpdated());
            inputStream(o.getInputStream());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public ExportComputeConfigurationResponse build() {
            return new ExportComputeConfigurationResponse(__httpStatusCode__, headers, location, contentLocation, opcRequestId, path, type, timeUpdated, inputStream);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
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
        if (!(o instanceof ExportComputeConfigurationResponse)) {
            return false;
        }

        ExportComputeConfigurationResponse other = (ExportComputeConfigurationResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.location, other.location)
            && java.util.Objects.equals(this.contentLocation, other.contentLocation)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
            && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}