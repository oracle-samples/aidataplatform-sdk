// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListCatalogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return only resources that match the given display name exactly.
     */
    private String displayName;

    

        /**
     * A filter to return only resources that match the given display name exactly.
     */
    public String getDisplayName() {
        return displayName;
    }
        /**
     * The state of the catalog.
     */
    private CatalogState catalogState;

        /**
     * The state of the catalog.
     **/
    public enum CatalogState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        ;

        

        private final String value;
        private static java.util.Map<String, CatalogState> map;

        static {
            map = new java.util.HashMap<>();
            for (CatalogState v : CatalogState.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        CatalogState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CatalogState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CatalogState: " + key);
        }
    };

        /**
     * The state of the catalog.
     */
    public CatalogState getCatalogState() {
        return catalogState;
    }
        /**
     * The type of the catalog.
     */
    private CatalogType catalogType;

        /**
     * The type of the catalog.
     **/
    public enum CatalogType implements com.oracle.bmc.http.internal.BmcEnum {
        Internal("INTERNAL"),
        External("EXTERNAL"),
        ;

        

        private final String value;
        private static java.util.Map<String, CatalogType> map;

        static {
            map = new java.util.HashMap<>();
            for (CatalogType v : CatalogType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        CatalogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CatalogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CatalogType: " + key);
        }
    };

        /**
     * The type of the catalog.
     */
    public CatalogType getCatalogType() {
        return catalogType;
    }
        /**
     * When true, skip user OCID translation and return raw OCIDs.
     */
    private Boolean shouldSkipOcidTranslation;

    

        /**
     * When true, skip user OCID translation and return raw OCIDs.
     */
    public Boolean getShouldSkipOcidTranslation() {
        return shouldSkipOcidTranslation;
    }
        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    private Integer limit;

    

        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    public Integer getLimit() {
        return limit;
    }
        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    private String page;

    

        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    public String getPage() {
        return page;
    }
        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private com.oracle.aidataplatform.dp.model.SortOrder sortOrder;

        

        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public com.oracle.aidataplatform.dp.model.SortOrder getSortOrder() {
        return sortOrder;
    }
        /**
     * The field to sort by. You can provide only one sort order. Default order for timeCreated
* is descending. Default order for displayName is ascending.
* 
     */
    private SortBy sortBy;

        /**
     * The field to sort by. You can provide only one sort order. Default order for timeCreated
* is descending. Default order for displayName is ascending.
* 
     **/
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

        /**
     * The field to sort by. You can provide only one sort order. Default order for timeCreated
* is descending. Default order for displayName is ascending.
* 
     */
    public SortBy getSortBy() {
        return sortBy;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListCatalogsRequest, java.lang.Void> {
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
     * A filter to return only resources that match the given display name exactly.
     */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

            /**
     * The state of the catalog.
     */
        private CatalogState catalogState = null;

        /**
         * The state of the catalog.
         * @param catalogState the value to set
         * @return this builder instance
         */
        public Builder catalogState(CatalogState catalogState) {
            this.catalogState = catalogState;
            return this;
        }

            /**
     * The type of the catalog.
     */
        private CatalogType catalogType = null;

        /**
         * The type of the catalog.
         * @param catalogType the value to set
         * @return this builder instance
         */
        public Builder catalogType(CatalogType catalogType) {
            this.catalogType = catalogType;
            return this;
        }

            /**
     * When true, skip user OCID translation and return raw OCIDs.
     */
        private Boolean shouldSkipOcidTranslation = null;

        /**
         * When true, skip user OCID translation and return raw OCIDs.
         * @param shouldSkipOcidTranslation the value to set
         * @return this builder instance
         */
        public Builder shouldSkipOcidTranslation(Boolean shouldSkipOcidTranslation) {
            this.shouldSkipOcidTranslation = shouldSkipOcidTranslation;
            return this;
        }

            /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

            /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

            /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
        private com.oracle.aidataplatform.dp.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.aidataplatform.dp.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

            /**
     * The field to sort by. You can provide only one sort order. Default order for timeCreated
* is descending. Default order for displayName is ascending.
* 
     */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for timeCreated
* is descending. Default order for displayName is ascending.
* 
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListCatalogsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());displayName(o.getDisplayName());catalogState(o.getCatalogState());catalogType(o.getCatalogType());shouldSkipOcidTranslation(o.getShouldSkipOcidTranslation());limit(o.getLimit());page(o.getPage());sortOrder(o.getSortOrder());sortBy(o.getSortBy());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCatalogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCatalogsRequest
         */
        public ListCatalogsRequest build() {
            ListCatalogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCatalogsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCatalogsRequest
         */
        public ListCatalogsRequest buildWithoutInvocationCallback() {
            ListCatalogsRequest request = new ListCatalogsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.displayName = displayName;
            request.catalogState = catalogState;
            request.catalogType = catalogType;
            request.shouldSkipOcidTranslation = shouldSkipOcidTranslation;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCatalogsRequest(aiDataPlatformId, displayName, catalogState, catalogType, shouldSkipOcidTranslation, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .displayName(displayName)
            .catalogState(catalogState)
            .catalogType(catalogType)
            .shouldSkipOcidTranslation(shouldSkipOcidTranslation)
            .limit(limit)
            .page(page)
            .sortOrder(sortOrder)
            .sortBy(sortBy)
            .opcRequestId(opcRequestId);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",catalogState=").append(String.valueOf(this.catalogState));
        sb.append(",catalogType=").append(String.valueOf(this.catalogType));
        sb.append(",shouldSkipOcidTranslation=").append(String.valueOf(this.shouldSkipOcidTranslation));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCatalogsRequest)) {
            return false;
        }

        ListCatalogsRequest other = (ListCatalogsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.displayName, other.displayName)
            && java.util.Objects.equals(this.catalogState, other.catalogState)
            && java.util.Objects.equals(this.catalogType, other.catalogType)
            && java.util.Objects.equals(this.shouldSkipOcidTranslation, other.shouldSkipOcidTranslation)
            && java.util.Objects.equals(this.limit, other.limit)
            && java.util.Objects.equals(this.page, other.page)
            && java.util.Objects.equals(this.sortOrder, other.sortOrder)
            && java.util.Objects.equals(this.sortBy, other.sortBy)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogState == null ? 43 : this.catalogState.hashCode());
        result = (result * PRIME) + (this.catalogType == null ? 43 : this.catalogType.hashCode());
        result = (result * PRIME) + (this.shouldSkipOcidTranslation == null ? 43 : this.shouldSkipOcidTranslation.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}