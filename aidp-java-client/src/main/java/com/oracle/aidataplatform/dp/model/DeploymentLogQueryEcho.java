// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Echo of the executed query and its consistency.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogQueryEcho.Builder.class)

public final class DeploymentLogQueryEcho  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "sortBy", "sortOrder", "timeEvaluated", "consistency"})
    public DeploymentLogQueryEcho(java.util.Date timeStart, java.util.Date timeEnd, String sortBy, String sortOrder, java.util.Date timeEvaluated, Consistency consistency) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.timeEvaluated = timeEvaluated;
        this.consistency = consistency;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * End of the publish-time window the query was evaluated against (RFC 3339, exclusive).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * End of the publish-time window the query was evaluated against (RFC 3339, exclusive).
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * Sort column applied to the results. Only TIMESTAMP is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortBy")
private String sortBy;

        /**
         * Sort column applied to the results. Only TIMESTAMP is supported.
         * @param sortBy the value to set
         * @return this builder
         **/
        

public Builder sortBy(String sortBy) {
    this.sortBy = sortBy;
    return this;
}
            /**
     * Sort order applied to the results. Only DESC is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
private String sortOrder;

        /**
         * Sort order applied to the results. Only DESC is supported.
         * @param sortOrder the value to set
         * @return this builder
         **/
        

public Builder sortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
}
            /**
     * Retrieval time. Not a claim that ingestion is complete through this instant.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEvaluated")
private java.util.Date timeEvaluated;

        /**
         * Retrieval time. Not a claim that ingestion is complete through this instant.
         * @param timeEvaluated the value to set
         * @return this builder
         **/
        

public Builder timeEvaluated(java.util.Date timeEvaluated) {
    this.timeEvaluated = timeEvaluated;
    return this;
}
            /**
     * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("consistency")
private Consistency consistency;

        /**
         * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
         * @param consistency the value to set
         * @return this builder
         **/
        

public Builder consistency(Consistency consistency) {
    this.consistency = consistency;
    return this;
}


        public DeploymentLogQueryEcho build() {
            DeploymentLogQueryEcho model = new DeploymentLogQueryEcho(this.timeStart
                , this.timeEnd
                , this.sortBy
                , this.sortOrder
                , this.timeEvaluated
                , this.consistency);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogQueryEcho model) {
                this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.sortBy(model.getSortBy());
    this.sortOrder(model.getSortOrder());
    this.timeEvaluated(model.getTimeEvaluated());
    this.consistency(model.getConsistency());
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
     * Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * End of the publish-time window the query was evaluated against (RFC 3339, exclusive).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End of the publish-time window the query was evaluated against (RFC 3339, exclusive).
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * Sort column applied to the results. Only TIMESTAMP is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final String sortBy;

        /**
     * Sort column applied to the results. Only TIMESTAMP is supported.
     * @return the value
     **/
    
    public String getSortBy() {
        return sortBy;
    }


        /**
     * Sort order applied to the results. Only DESC is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final String sortOrder;

        /**
     * Sort order applied to the results. Only DESC is supported.
     * @return the value
     **/
    
    public String getSortOrder() {
        return sortOrder;
    }


        /**
     * Retrieval time. Not a claim that ingestion is complete through this instant.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEvaluated")
    private final java.util.Date timeEvaluated;

        /**
     * Retrieval time. Not a claim that ingestion is complete through this instant.
     * @return the value
     **/
    
    public java.util.Date getTimeEvaluated() {
        return timeEvaluated;
    }

    /**
     * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
     **/
    public enum Consistency implements com.oracle.bmc.http.internal.BmcEnum {
        BestEffort("BEST_EFFORT"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Consistency.class);

        private final String value;
        private static java.util.Map<String, Consistency> map;

        static {
            map = new java.util.HashMap<>();
            for (Consistency v : Consistency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Consistency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Consistency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Consistency', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("consistency")
    private final Consistency consistency;

        /**
     * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
     * @return the value
     **/
    
    public Consistency getConsistency() {
        return consistency;
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
        sb.append("DeploymentLogQueryEcho(");
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", timeEvaluated=").append(String.valueOf(this.timeEvaluated));
        sb.append(", consistency=").append(String.valueOf(this.consistency));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogQueryEcho)) {
            return false;
        }

        DeploymentLogQueryEcho other = (DeploymentLogQueryEcho) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.sortBy, other.sortBy) &&
            java.util.Objects.equals(this.sortOrder, other.sortOrder) &&
            java.util.Objects.equals(this.timeEvaluated, other.timeEvaluated) &&
            java.util.Objects.equals(this.consistency, other.consistency);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.timeEvaluated == null ? 43 : this.timeEvaluated.hashCode());
        result = (result * PRIME) + (this.consistency == null ? 43 : this.consistency.hashCode());
        return result;
    }


}
