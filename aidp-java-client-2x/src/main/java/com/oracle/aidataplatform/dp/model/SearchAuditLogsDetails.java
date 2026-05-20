// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information needed to search the audit logs.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchAuditLogsDetails.Builder.class)

public final class SearchAuditLogsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeBegin", "timeEnd", "objectType", "objectName", "operation", "status", "startedBy", "query", "sortBy", "sortOrder"})
    public SearchAuditLogsDetails(java.util.Date timeBegin, java.util.Date timeEnd, ObjectType objectType, String objectName, Operation operation, Status status, String startedBy, String query, SortBy sortBy, SortOrder sortOrder) {
        super();
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.objectType = objectType;
        this.objectName = objectName;
        this.operation = operation;
        this.status = status;
        this.startedBy = startedBy;
        this.query = query;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Start time of the logs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

                /**
         * Start time of the logs.
         * @param timeBegin the value to set
         * @return this builder
         **/
        

        public Builder timeBegin(java.util.Date timeBegin) {
        this.timeBegin = timeBegin;
        return this;
        }
            /**
     * End time of the logs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

                /**
         * End time of the logs.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

        public Builder timeEnd(java.util.Date timeEnd) {
        this.timeEnd = timeEnd;
        return this;
        }
            /**
     * Type of object.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

                /**
         * Type of object.
         * @param objectType the value to set
         * @return this builder
         **/
        

        public Builder objectType(ObjectType objectType) {
        this.objectType = objectType;
        return this;
        }
            /**
     * Name of the object.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

                /**
         * Name of the object.
         * @param objectName the value to set
         * @return this builder
         **/
        

        public Builder objectName(String objectName) {
        this.objectName = objectName;
        return this;
        }
            /**
     * Type of operation.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

                /**
         * Type of operation.
         * @param operation the value to set
         * @return this builder
         **/
        

        public Builder operation(Operation operation) {
        this.operation = operation;
        return this;
        }
            /**
     * Status of log.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

                /**
         * Status of log.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(Status status) {
        this.status = status;
        return this;
        }
            /**
     * Operation started by.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("startedBy")
        private String startedBy;

                /**
         * Operation started by.
         * @param startedBy the value to set
         * @return this builder
         **/
        

        public Builder startedBy(String startedBy) {
        this.startedBy = startedBy;
        return this;
        }
            /**
     * Query to search the log.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

                /**
         * Query to search the log.
         * @param query the value to set
         * @return this builder
         **/
        

        public Builder query(String query) {
        this.query = query;
        return this;
        }
            /**
     * The field to sort by.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

                /**
         * The field to sort by.
* 
         * @param sortBy the value to set
         * @return this builder
         **/
        

        public Builder sortBy(SortBy sortBy) {
        this.sortBy = sortBy;
        return this;
        }
            /**
     * Sort order for search results.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

                /**
         * Sort order for search results.
         * @param sortOrder the value to set
         * @return this builder
         **/
        

        public Builder sortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        return this;
        }


        public SearchAuditLogsDetails build() {
            SearchAuditLogsDetails model = new SearchAuditLogsDetails(this.timeBegin
                    , this.timeEnd
                    , this.objectType
                    , this.objectName
                    , this.operation
                    , this.status
                    , this.startedBy
                    , this.query
                    , this.sortBy
                    , this.sortOrder);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchAuditLogsDetails model) {
                this.timeBegin(model.getTimeBegin());
    this.timeEnd(model.getTimeEnd());
    this.objectType(model.getObjectType());
    this.objectName(model.getObjectName());
    this.operation(model.getOperation());
    this.status(model.getStatus());
    this.startedBy(model.getStartedBy());
    this.query(model.getQuery());
    this.sortBy(model.getSortBy());
    this.sortOrder(model.getSortOrder());
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
     * Start time of the logs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

        /**
     * Start time of the logs.
     * @return the value
     **/
    
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }


        /**
     * End time of the logs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End time of the logs.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    
        /**
     * Type of object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

        /**
     * Type of object.
     * @return the value
     **/
    
    public ObjectType getObjectType() {
        return objectType;
    }


        /**
     * Name of the object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

        /**
     * Name of the object.
     * @return the value
     **/
    
    public String getObjectName() {
        return objectName;
    }

    
        /**
     * Type of operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

        /**
     * Type of operation.
     * @return the value
     **/
    
    public Operation getOperation() {
        return operation;
    }

    
        /**
     * Status of log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Status of log.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * Operation started by.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startedBy")
    private final String startedBy;

        /**
     * Operation started by.
     * @return the value
     **/
    
    public String getStartedBy() {
        return startedBy;
    }


        /**
     * Query to search the log.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * Query to search the log.
     * @return the value
     **/
    
    public String getQuery() {
        return query;
    }

    /**
     * The field to sort by.
* 
     **/
    public enum SortBy {
        StartedBy("startedBy"),
        Status("status"),
        Operation("operation"),
        ObjectType("objectType"),
        ObjectName("objectName"),
        Time("time"),
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
     * The field to sort by.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

        /**
     * The field to sort by.
* 
     * @return the value
     **/
    
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Sort order for search results.
     **/
    public enum SortOrder {
        Asc("ASC"),
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
     * Sort order for search results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

        /**
     * Sort order for search results.
     * @return the value
     **/
    
    public SortOrder getSortOrder() {
        return sortOrder;
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
        sb.append("SearchAuditLogsDetails(");
        sb.append("timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startedBy=").append(String.valueOf(this.startedBy));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchAuditLogsDetails)) {
            return false;
        }

        SearchAuditLogsDetails other = (SearchAuditLogsDetails) o;
        return java.util.Objects.equals(this.timeBegin, other.timeBegin) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.objectType, other.objectType) &&
            java.util.Objects.equals(this.objectName, other.objectName) &&
            java.util.Objects.equals(this.operation, other.operation) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.startedBy, other.startedBy) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.sortBy, other.sortBy) &&
            java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.startedBy == null ? 43 : this.startedBy.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }


}
