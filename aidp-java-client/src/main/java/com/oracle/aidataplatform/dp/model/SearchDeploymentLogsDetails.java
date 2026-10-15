// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filters and pagination for searching deployment lifecycle logs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchDeploymentLogsDetails.Builder.class)

public final class SearchDeploymentLogsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "levels", "opcRequestId", "replicaId", "sortBy", "sortOrder", "limit", "pageToken"})
    public SearchDeploymentLogsDetails(java.util.Date timeStart, java.util.Date timeEnd, java.util.List<String> levels, String opcRequestId, String replicaId, SortBy sortBy, SortOrder sortOrder, Integer limit, String pageToken) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.levels = levels;
        this.opcRequestId = opcRequestId;
        this.replicaId = replicaId;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.limit = limit;
        this.pageToken = pageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Start of the requested publish-time window (RFC 3339, inclusive).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Start of the requested publish-time window (RFC 3339, inclusive).
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("levels")
private java.util.List<String> levels;

        /**
         * Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
         * @param levels the value to set
         * @return this builder
         **/
        

public Builder levels(java.util.List<String> levels) {
    this.levels = levels;
    return this;
}
            /**
     * Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
            /**
     * Optional exact match on the emitting replica or source scope.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicaId")
private String replicaId;

        /**
         * Optional exact match on the emitting replica or source scope.
         * @param replicaId the value to set
         * @return this builder
         **/
        

public Builder replicaId(String replicaId) {
    this.replicaId = replicaId;
    return this;
}
            /**
     * Sort column. Only TIMESTAMP is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortBy")
private SortBy sortBy;

        /**
         * Sort column. Only TIMESTAMP is supported.
         * @param sortBy the value to set
         * @return this builder
         **/
        

public Builder sortBy(SortBy sortBy) {
    this.sortBy = sortBy;
    return this;
}
            /**
     * Sort order. Only DESC is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
private SortOrder sortOrder;

        /**
         * Sort order. Only DESC is supported.
         * @param sortOrder the value to set
         * @return this builder
         **/
        

public Builder sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
}
            /**
     * Maximum rows per page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("limit")
private Integer limit;

        /**
         * Maximum rows per page.
         * @param limit the value to set
         * @return this builder
         **/
        

public Builder limit(Integer limit) {
    this.limit = limit;
    return this;
}
            /**
     * Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pageToken")
private String pageToken;

        /**
         * Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
         * @param pageToken the value to set
         * @return this builder
         **/
        

public Builder pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
}


        public SearchDeploymentLogsDetails build() {
            SearchDeploymentLogsDetails model = new SearchDeploymentLogsDetails(this.timeStart
                , this.timeEnd
                , this.levels
                , this.opcRequestId
                , this.replicaId
                , this.sortBy
                , this.sortOrder
                , this.limit
                , this.pageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchDeploymentLogsDetails model) {
                this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.levels(model.getLevels());
    this.opcRequestId(model.getOpcRequestId());
    this.replicaId(model.getReplicaId());
    this.sortBy(model.getSortBy());
    this.sortOrder(model.getSortOrder());
    this.limit(model.getLimit());
    this.pageToken(model.getPageToken());
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
     * Start of the requested publish-time window (RFC 3339, inclusive).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Start of the requested publish-time window (RFC 3339, inclusive).
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("levels")
    private final java.util.List<String> levels;

        /**
     * Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
     * @return the value
     **/
    
    public java.util.List<String> getLevels() {
        return levels;
    }


        /**
     * Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


        /**
     * Optional exact match on the emitting replica or source scope.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaId")
    private final String replicaId;

        /**
     * Optional exact match on the emitting replica or source scope.
     * @return the value
     **/
    
    public String getReplicaId() {
        return replicaId;
    }

    /**
     * Sort column. Only TIMESTAMP is supported.
     **/
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timestamp("TIMESTAMP"),
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
     * Sort column. Only TIMESTAMP is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

        /**
     * Sort column. Only TIMESTAMP is supported.
     * @return the value
     **/
    
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Sort order. Only DESC is supported.
     **/
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Desc("DESC"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
        /**
     * Sort order. Only DESC is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

        /**
     * Sort order. Only DESC is supported.
     * @return the value
     **/
    
    public SortOrder getSortOrder() {
        return sortOrder;
    }


        /**
     * Maximum rows per page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

        /**
     * Maximum rows per page.
     * @return the value
     **/
    
    public Integer getLimit() {
        return limit;
    }


        /**
     * Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pageToken")
    private final String pageToken;

        /**
     * Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
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
        sb.append("SearchDeploymentLogsDetails(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", levels=").append(String.valueOf(this.levels));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", replicaId=").append(String.valueOf(this.replicaId));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchDeploymentLogsDetails)) {
            return false;
        }

        SearchDeploymentLogsDetails other = (SearchDeploymentLogsDetails) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.levels, other.levels) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.replicaId, other.replicaId) &&
            java.util.Objects.equals(this.sortBy, other.sortBy) &&
            java.util.Objects.equals(this.sortOrder, other.sortOrder) &&
            java.util.Objects.equals(this.limit, other.limit) &&
            java.util.Objects.equals(this.pageToken, other.pageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.levels == null ? 43 : this.levels.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.replicaId == null ? 43 : this.replicaId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        return result;
    }


}
