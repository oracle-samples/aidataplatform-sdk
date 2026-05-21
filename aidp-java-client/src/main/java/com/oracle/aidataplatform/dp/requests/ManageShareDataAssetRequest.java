// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ManageShareDataAssetRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails> {

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
     * The unique key of the Share.
     */
    private String shareKey;

    

        /**
     * The unique key of the Share.
     */
    public String getShareKey() {
        return shareKey;
    }
        /**
     * The Delta Share data asset information to be updated.
     */
    private com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails manageShareDataAssetDetails;

    

        /**
     * The Delta Share data asset information to be updated.
     */
    public com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails getManageShareDataAssetDetails() {
        return manageShareDataAssetDetails;
    }
        /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
    private String ifMatch;

    

        /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
    public String getIfMatch() {
        return ifMatch;
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
     * A flag to identify if the recent list should be updated.
     */
    private Boolean shouldUpdateRecent;

    

        /**
     * A flag to identify if the recent list should be updated.
     */
    public Boolean getShouldUpdateRecent() {
        return shouldUpdateRecent;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails getBody$() {
        return manageShareDataAssetDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ManageShareDataAssetRequest, com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails> {
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
     * The unique key of the Share.
     */
        private String shareKey = null;

        /**
         * The unique key of the Share.
         * @param shareKey the value to set
         * @return this builder instance
         */
        public Builder shareKey(String shareKey) {
            this.shareKey = shareKey;
            return this;
        }

            /**
     * The Delta Share data asset information to be updated.
     */
        private com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails manageShareDataAssetDetails = null;

        /**
         * The Delta Share data asset information to be updated.
         * @param manageShareDataAssetDetails the value to set
         * @return this builder instance
         */
        public Builder manageShareDataAssetDetails(com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails manageShareDataAssetDetails) {
            this.manageShareDataAssetDetails = manageShareDataAssetDetails;
            return this;
        }

            /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ManageShareDataAssetRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());shareKey(o.getShareKey());manageShareDataAssetDetails(o.getManageShareDataAssetDetails());ifMatch(o.getIfMatch());opcRequestId(o.getOpcRequestId());shouldUpdateRecent(o.getShouldUpdateRecent());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ManageShareDataAssetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ManageShareDataAssetRequest
         */
        public ManageShareDataAssetRequest build() {
            ManageShareDataAssetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.aidataplatform.dp.model.ManageShareDataAssetDetails body) {
            manageShareDataAssetDetails(body);
            return this;
        }

        /**
         * Build the instance of ManageShareDataAssetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ManageShareDataAssetRequest
         */
        public ManageShareDataAssetRequest buildWithoutInvocationCallback() {
            ManageShareDataAssetRequest request = new ManageShareDataAssetRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.shareKey = shareKey;
            request.manageShareDataAssetDetails = manageShareDataAssetDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.shouldUpdateRecent = shouldUpdateRecent;
            return request;
            // new ManageShareDataAssetRequest(aiDataPlatformId, shareKey, manageShareDataAssetDetails, ifMatch, opcRequestId, shouldUpdateRecent);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .shareKey(shareKey)
            .manageShareDataAssetDetails(manageShareDataAssetDetails)
            .ifMatch(ifMatch)
            .opcRequestId(opcRequestId)
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
        sb.append(",shareKey=").append(String.valueOf(this.shareKey));
        sb.append(",manageShareDataAssetDetails=").append(String.valueOf(this.manageShareDataAssetDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageShareDataAssetRequest)) {
            return false;
        }

        ManageShareDataAssetRequest other = (ManageShareDataAssetRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.shareKey, other.shareKey)
            && java.util.Objects.equals(this.manageShareDataAssetDetails, other.manageShareDataAssetDetails)
            && java.util.Objects.equals(this.ifMatch, other.ifMatch)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.shareKey == null ? 43 : this.shareKey.hashCode());
        result = (result * PRIME) + (this.manageShareDataAssetDetails == null ? 43 : this.manageShareDataAssetDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        return result;
    }
}