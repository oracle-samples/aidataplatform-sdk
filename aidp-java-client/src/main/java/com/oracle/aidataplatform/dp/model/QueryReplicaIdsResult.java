// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response payload containing compute replica identifiers that emitted matching metric data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=QueryReplicaIdsResult.Builder.class)

public final class QueryReplicaIdsResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"replicaIds"})
    public QueryReplicaIdsResult(java.util.List<String> replicaIds) {
        super();
        this.replicaIds = replicaIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicaIds")
private java.util.List<String> replicaIds;

        /**
         * Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension.
         * @param replicaIds the value to set
         * @return this builder
         **/
        

public Builder replicaIds(java.util.List<String> replicaIds) {
    this.replicaIds = replicaIds;
    return this;
}


        public QueryReplicaIdsResult build() {
            QueryReplicaIdsResult model = new QueryReplicaIdsResult(this.replicaIds);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryReplicaIdsResult model) {
                this.replicaIds(model.getReplicaIds());
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
     * Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaIds")
    private final java.util.List<String> replicaIds;

        /**
     * Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension.
     * @return the value
     **/
    
    public java.util.List<String> getReplicaIds() {
        return replicaIds;
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
        sb.append("QueryReplicaIdsResult(");
        sb.append("replicaIds=").append(String.valueOf(this.replicaIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryReplicaIdsResult)) {
            return false;
        }

        QueryReplicaIdsResult other = (QueryReplicaIdsResult) o;
        return java.util.Objects.equals(this.replicaIds, other.replicaIds);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.replicaIds == null ? 43 : this.replicaIds.hashCode());
        return result;
    }


}
