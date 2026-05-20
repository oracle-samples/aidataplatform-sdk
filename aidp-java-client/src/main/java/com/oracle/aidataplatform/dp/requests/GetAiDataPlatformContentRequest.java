// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformContentRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    private String aiDataPlatformId;

    

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    public String getAiDataPlatformId() {
        return aiDataPlatformId;
    }
        /**
     * The key of the Workspace
     */
    private String workspaceKey;

    

        /**
     * The key of the Workspace
     */
    public String getWorkspaceKey() {
        return workspaceKey;
    }
        /**
     * The path to the notebook file.
     */
    private String contentPath;

    

        /**
     * The path to the notebook file.
     */
    public String getContentPath() {
        return contentPath;
    }
        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    private String opcRequestId;

    

        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
        /**
     * Content type. Either file, directory, or notebook.
     */
    private Type type;

        /**
     * Content type. Either file, directory, or notebook.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        File("file"),
        Directory("directory"),
        Notebook("notebook"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };

        /**
     * Content type. Either file, directory, or notebook.
     */
    public Type getType() {
        return type;
    }
        /**
     * The format in which content should be returned. Either text, base64, or JSON.
     */
    private Format format;

        /**
     * The format in which content should be returned. Either text, base64, or JSON.
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Text("text"),
        Base64("base64"),
        Json("json"),
        ;

        

        private final String value;
        private static java.util.Map<String, Format> map;

        static {
            map = new java.util.HashMap<>();
            for (Format v : Format.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Format(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Format create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Format: " + key);
        }
    };

        /**
     * The format in which content should be returned. Either text, base64, or JSON.
     */
    public Format getFormat() {
        return format;
    }
        /**
     * Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
* 
     */
    private Integer content;

    

        /**
     * Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
* 
     */
    public Integer getContent() {
        return content;
    }
        /**
     * Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
* 
     */
    private Integer hash;

    

        /**
     * Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
* 
     */
    public Integer getHash() {
        return hash;
    }
        /**
     * A flag to identify if the recent list should be updated.
     */
    private Boolean shouldUpdateRecent;

    

        /**
     * A flag to identify if the recent list should be updated.
     */
    public Boolean getShouldUpdateRecent() {
        return shouldUpdateRecent;
    }
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<GetAiDataPlatformContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

            /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
        private String aiDataPlatformId = null;

        /**
         * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
         * @param aiDataPlatformId the value to set
         * @return this builder instance
         */
        public Builder aiDataPlatformId(String aiDataPlatformId) {
            this.aiDataPlatformId = aiDataPlatformId;
            return this;
        }

            /**
     * The key of the Workspace
     */
        private String workspaceKey = null;

        /**
         * The key of the Workspace
         * @param workspaceKey the value to set
         * @return this builder instance
         */
        public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = workspaceKey;
            return this;
        }

            /**
     * The path to the notebook file.
     */
        private String contentPath = null;

        /**
         * The path to the notebook file.
         * @param contentPath the value to set
         * @return this builder instance
         */
        public Builder contentPath(String contentPath) {
            this.contentPath = contentPath;
            return this;
        }

            /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

            /**
     * Content type. Either file, directory, or notebook.
     */
        private Type type = null;

        /**
         * Content type. Either file, directory, or notebook.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(Type type) {
            this.type = type;
            return this;
        }

            /**
     * The format in which content should be returned. Either text, base64, or JSON.
     */
        private Format format = null;

        /**
         * The format in which content should be returned. Either text, base64, or JSON.
         * @param format the value to set
         * @return this builder instance
         */
        public Builder format(Format format) {
            this.format = format;
            return this;
        }

            /**
     * Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
* 
     */
        private Integer content = null;

        /**
         * Returns content based on param value. When set to 0, content is NOT returned. When set to 1, content is returned.
* 
         * @param content the value to set
         * @return this builder instance
         */
        public Builder content(Integer content) {
            this.content = content;
            return this;
        }

            /**
     * Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
* 
     */
        private Integer hash = null;

        /**
         * Returns hash hexdigest string of content and the hash algorithm. 0 for no hash, 1 for return hash. 0 is default. It may be ignored by the content manager.
* 
         * @param hash the value to set
         * @return this builder instance
         */
        public Builder hash(Integer hash) {
            this.hash = hash;
            return this;
        }

            /**
     * A flag to identify if the recent list should be updated.
     */
        private Boolean shouldUpdateRecent = null;

        /**
         * A flag to identify if the recent list should be updated.
         * @param shouldUpdateRecent the value to set
         * @return this builder instance
         */
        public Builder shouldUpdateRecent(Boolean shouldUpdateRecent) {
            this.shouldUpdateRecent = shouldUpdateRecent;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
        com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAiDataPlatformContentRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());contentPath(o.getContentPath());opcRequestId(o.getOpcRequestId());type(o.getType());format(o.getFormat());content(o.getContent());hash(o.getHash());shouldUpdateRecent(o.getShouldUpdateRecent());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAiDataPlatformContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAiDataPlatformContentRequest
         */
        public GetAiDataPlatformContentRequest build() {
            GetAiDataPlatformContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAiDataPlatformContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAiDataPlatformContentRequest
         */
        public GetAiDataPlatformContentRequest buildWithoutInvocationCallback() {
            GetAiDataPlatformContentRequest request = new GetAiDataPlatformContentRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.contentPath = contentPath;
            request.opcRequestId = opcRequestId;
            request.type = type;
            request.format = format;
            request.content = content;
            request.hash = hash;
            request.shouldUpdateRecent = shouldUpdateRecent;
            return request;
            // new GetAiDataPlatformContentRequest(aiDataPlatformId, workspaceKey, contentPath, opcRequestId, type, format, content, hash, shouldUpdateRecent);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .workspaceKey(workspaceKey)
            .contentPath(contentPath)
            .opcRequestId(opcRequestId)
            .type(type)
            .format(format)
            .content(content)
            .hash(hash)
            .shouldUpdateRecent(shouldUpdateRecent);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",aiDataPlatformId=").append(String.valueOf(this.aiDataPlatformId));
        sb.append(",workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(",contentPath=").append(String.valueOf(this.contentPath));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",format=").append(String.valueOf(this.format));
        sb.append(",content=").append(String.valueOf(this.content));
        sb.append(",hash=").append(String.valueOf(this.hash));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAiDataPlatformContentRequest)) {
            return false;
        }

        GetAiDataPlatformContentRequest other = (GetAiDataPlatformContentRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.contentPath, other.contentPath)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.format, other.format)
            && java.util.Objects.equals(this.content, other.content)
            && java.util.Objects.equals(this.hash, other.hash)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.contentPath == null ? 43 : this.contentPath.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.hash == null ? 43 : this.hash.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        return result;
    }
}