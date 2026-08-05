// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request payload for querying compute replica identifiers from metric data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=QueryReplicaIdsDetails.Builder.class)

public final class QueryReplicaIdsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"metricName", "timeBegin", "timeEnd"})
    public QueryReplicaIdsDetails(String metricName, java.util.Date timeBegin, java.util.Date timeEnd) {
        super();
        this.metricName = metricName;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The metric to use when discovering replica identifiers for the selected compute cluster.
* Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metricName")
private String metricName;

        /**
         * The metric to use when discovering replica identifiers for the selected compute cluster.
* Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
* 
         * @param metricName the value to set
         * @return this builder
         **/
        

public Builder metricName(String metricName) {
    this.metricName = metricName;
    return this;
}
            /**
     * The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
private java.util.Date timeBegin;

        /**
         * The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
         * @param timeBegin the value to set
         * @return this builder
         **/
        

public Builder timeBegin(java.util.Date timeBegin) {
    this.timeBegin = timeBegin;
    return this;
}
            /**
     * The end of the time range to use when searching for replica metric data points. Format is RFC 3339.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * The end of the time range to use when searching for replica metric data points. Format is RFC 3339.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}


        public QueryReplicaIdsDetails build() {
            QueryReplicaIdsDetails model = new QueryReplicaIdsDetails(this.metricName
                , this.timeBegin
                , this.timeEnd);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryReplicaIdsDetails model) {
                this.metricName(model.getMetricName());
    this.timeBegin(model.getTimeBegin());
    this.timeEnd(model.getTimeEnd());
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
     * The metric to use when discovering replica identifiers for the selected compute cluster.
* Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

        /**
     * The metric to use when discovering replica identifiers for the selected compute cluster.
* Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
* 
     * @return the value
     **/
    
    public String getMetricName() {
        return metricName;
    }


        /**
     * The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

        /**
     * The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
     * @return the value
     **/
    
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }


        /**
     * The end of the time range to use when searching for replica metric data points. Format is RFC 3339.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * The end of the time range to use when searching for replica metric data points. Format is RFC 3339.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
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
        sb.append("QueryReplicaIdsDetails(");
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryReplicaIdsDetails)) {
            return false;
        }

        QueryReplicaIdsDetails other = (QueryReplicaIdsDetails) o;
        return java.util.Objects.equals(this.metricName, other.metricName) &&
            java.util.Objects.equals(this.timeBegin, other.timeBegin) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        return result;
    }


}
