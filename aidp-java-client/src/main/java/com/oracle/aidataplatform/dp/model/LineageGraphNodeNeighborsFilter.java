// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Optional filter criteria for fetching lineage graph node neighbors.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageGraphNodeNeighborsFilter.Builder.class)

public final class LineageGraphNodeNeighborsFilter  {
    @Deprecated
    @java.beans.ConstructorProperties({"processRunStageId"})
    public LineageGraphNodeNeighborsFilter(String processRunStageId) {
        super();
        this.processRunStageId = processRunStageId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Filters only the neighbors for a particular stage in a multi-stage process.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("processRunStageId")
private String processRunStageId;

        /**
         * Filters only the neighbors for a particular stage in a multi-stage process.
* 
         * @param processRunStageId the value to set
         * @return this builder
         **/
        

public Builder processRunStageId(String processRunStageId) {
    this.processRunStageId = processRunStageId;
    return this;
}


        public LineageGraphNodeNeighborsFilter build() {
            LineageGraphNodeNeighborsFilter model = new LineageGraphNodeNeighborsFilter(this.processRunStageId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageGraphNodeNeighborsFilter model) {
                this.processRunStageId(model.getProcessRunStageId());
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
     * Filters only the neighbors for a particular stage in a multi-stage process.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("processRunStageId")
    private final String processRunStageId;

        /**
     * Filters only the neighbors for a particular stage in a multi-stage process.
* 
     * @return the value
     **/
    
    public String getProcessRunStageId() {
        return processRunStageId;
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
        sb.append("LineageGraphNodeNeighborsFilter(");
        sb.append("processRunStageId=").append(String.valueOf(this.processRunStageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageGraphNodeNeighborsFilter)) {
            return false;
        }

        LineageGraphNodeNeighborsFilter other = (LineageGraphNodeNeighborsFilter) o;
        return java.util.Objects.equals(this.processRunStageId, other.processRunStageId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.processRunStageId == null ? 43 : this.processRunStageId.hashCode());
        return result;
    }


}
