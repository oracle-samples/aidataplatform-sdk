// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Paginated correlated inference invocation rows. Each response contains at most 20 rows; pagination is backed by OCI Logging. At most 10,000 matching rows can be retrieved.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationSearchResult.Builder.class)

public final class InferenceInvocationSearchResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "items", "nextPageToken", "statuses", "requestUris", "modelVersions"})
    public InferenceInvocationSearchResult(java.util.Date timeStart, java.util.Date timeEnd, java.util.List<InferenceInvocationSummary> items, String nextPageToken, java.util.List<InferenceInvocationStatus> statuses, java.util.List<String> requestUris, java.util.List<String> modelVersions) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.items = items;
        this.nextPageToken = nextPageToken;
        this.statuses = statuses;
        this.requestUris = requestUris;
        this.modelVersions = modelVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Inclusive start time resolved for this search query.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Inclusive start time resolved for this search query.
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * Inclusive end time resolved for this search query.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * Inclusive end time resolved for this search query.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * Correlated inference invocation rows for the requested page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<InferenceInvocationSummary> items;

        /**
         * Correlated inference invocation rows for the requested page.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<InferenceInvocationSummary> items) {
    this.items = items;
    return this;
}
            /**
     * Opaque token for retrieving the next page. Omitted when no additional page is available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextPageToken")
private String nextPageToken;

        /**
         * Opaque token for retrieving the next page. Omitted when no additional page is available.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}
            /**
     * Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("statuses")
private java.util.List<InferenceInvocationStatus> statuses;

        /**
         * Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
         * @param statuses the value to set
         * @return this builder
         **/
        

public Builder statuses(java.util.List<InferenceInvocationStatus> statuses) {
    this.statuses = statuses;
    return this;
}
            /**
     * Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requestUris")
private java.util.List<String> requestUris;

        /**
         * Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
         * @param requestUris the value to set
         * @return this builder
         **/
        

public Builder requestUris(java.util.List<String> requestUris) {
    this.requestUris = requestUris;
    return this;
}
            /**
     * Model versions configured on the requested deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersions")
private java.util.List<String> modelVersions;

        /**
         * Model versions configured on the requested deployment.
         * @param modelVersions the value to set
         * @return this builder
         **/
        

public Builder modelVersions(java.util.List<String> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
}


        public InferenceInvocationSearchResult build() {
            InferenceInvocationSearchResult model = new InferenceInvocationSearchResult(this.timeStart
                , this.timeEnd
                , this.items
                , this.nextPageToken
                , this.statuses
                , this.requestUris
                , this.modelVersions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationSearchResult model) {
                this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.items(model.getItems());
    this.nextPageToken(model.getNextPageToken());
    this.statuses(model.getStatuses());
    this.requestUris(model.getRequestUris());
    this.modelVersions(model.getModelVersions());
return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }


    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    


        /**
     * Inclusive start time resolved for this search query.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Inclusive start time resolved for this search query.
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * Inclusive end time resolved for this search query.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * Inclusive end time resolved for this search query.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * Correlated inference invocation rows for the requested page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<InferenceInvocationSummary> items;

        /**
     * Correlated inference invocation rows for the requested page.
     * @return the value
     **/
    
    public java.util.List<InferenceInvocationSummary> getItems() {
        return items;
    }


        /**
     * Opaque token for retrieving the next page. Omitted when no additional page is available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPageToken")
    private final String nextPageToken;

        /**
     * Opaque token for retrieving the next page. Omitted when no additional page is available.
     * @return the value
     **/
    
    public String getNextPageToken() {
        return nextPageToken;
    }


        /**
     * Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("statuses")
    private final java.util.List<InferenceInvocationStatus> statuses;

        /**
     * Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     * @return the value
     **/
    
    public java.util.List<InferenceInvocationStatus> getStatuses() {
        return statuses;
    }


        /**
     * Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requestUris")
    private final java.util.List<String> requestUris;

        /**
     * Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
     * @return the value
     **/
    
    public java.util.List<String> getRequestUris() {
        return requestUris;
    }


        /**
     * Model versions configured on the requested deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersions")
    private final java.util.List<String> modelVersions;

        /**
     * Model versions configured on the requested deployment.
     * @return the value
     **/
    
    public java.util.List<String> getModelVersions() {
        return modelVersions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InferenceInvocationSearchResult(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(", statuses=").append(String.valueOf(this.statuses));
        sb.append(", requestUris=").append(String.valueOf(this.requestUris));
        sb.append(", modelVersions=").append(String.valueOf(this.modelVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationSearchResult)) {
            return false;
        }

        InferenceInvocationSearchResult other = (InferenceInvocationSearchResult) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken) &&
            java.util.Objects.equals(this.statuses, other.statuses) &&
            java.util.Objects.equals(this.requestUris, other.requestUris) &&
            java.util.Objects.equals(this.modelVersions, other.modelVersions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        result = (result * PRIME) + (this.statuses == null ? 43 : this.statuses.hashCode());
        result = (result * PRIME) + (this.requestUris == null ? 43 : this.requestUris.hashCode());
        result = (result * PRIME) + (this.modelVersions == null ? 43 : this.modelVersions.hashCode());
        return result;
    }


}
