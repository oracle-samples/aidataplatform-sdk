// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformJobsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }
    
    /**
     * For list pagination. When this header appears in the response, previous pages of results remain.
     */
    private String opcPrevPage;

    /**
     * For list pagination. When this header appears in the response, previous pages of results remain.
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }
    
    /**
     * For list pagination. This header provides total number of items available.
     */
    private Integer opcTotalItems;

    /**
     * For list pagination. This header provides total number of items available.
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }
    
    /**
     * The returned JobCollection instance.
     */
    private com.oracle.aidataplatform.dp.model.JobCollection jobCollection;

    /**
     * The returned JobCollection instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.JobCollection getJobCollection() {
        return jobCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "opcNextPage", "opcPrevPage", "opcTotalItems", "jobCollection"})
    private ListAiDataPlatformJobsResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, String opcNextPage, String opcPrevPage, Integer opcTotalItems, com.oracle.aidataplatform.dp.model.JobCollection jobCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.opcTotalItems = opcTotalItems;
        this.jobCollection = jobCollection;

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
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, previous pages of results remain.
         */
        private String opcPrevPage;

        /**
         * For list pagination. When this header appears in the response, previous pages of results remain.
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * For list pagination. This header provides total number of items available.
         */
        private Integer opcTotalItems;

        /**
         * For list pagination. This header provides total number of items available.
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /**
         * The returned JobCollection instance.
         */
        private com.oracle.aidataplatform.dp.model.JobCollection jobCollection;

        /**
         * The returned JobCollection instance.
         * @param jobCollection the value to set
         * @return this builder
         */
        public Builder jobCollection(com.oracle.aidataplatform.dp.model.JobCollection jobCollection) {
            this.jobCollection = jobCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAiDataPlatformJobsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());opcNextPage(o.getOpcNextPage());opcPrevPage(o.getOpcPrevPage());opcTotalItems(o.getOpcTotalItems());
            jobCollection(o.getJobCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListAiDataPlatformJobsResponse build() {
            return new ListAiDataPlatformJobsResponse(__httpStatusCode__, headers, opcRequestId, opcNextPage, opcPrevPage, opcTotalItems, jobCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",jobCollection=").append(String.valueOf(jobCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAiDataPlatformJobsResponse)) {
            return false;
        }

        ListAiDataPlatformJobsResponse other = (ListAiDataPlatformJobsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
            && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
            && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
            && java.util.Objects.equals(this.jobCollection, other.jobCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result = (result * PRIME) + (this.jobCollection == null ? 43 : this.jobCollection.hashCode());
        return result;
    }
}