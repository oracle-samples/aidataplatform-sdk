// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information needed to obtain neighbors for the node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchLineageGraphNodeNeighborsDetails.Builder.class)

public final class FetchLineageGraphNodeNeighborsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeId", "direction", "isWithColumns", "scopedColumns", "filter"})
    public FetchLineageGraphNodeNeighborsDetails(String nodeId, LineageDirection direction, Boolean isWithColumns, java.util.List<String> scopedColumns, LineageGraphNodeNeighborsFilter filter) {
        super();
        this.nodeId = nodeId;
        this.direction = direction;
        this.isWithColumns = isWithColumns;
        this.scopedColumns = scopedColumns;
        this.filter = filter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the node to fetch the details
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodeId")
private String nodeId;

        /**
         * ID of the node to fetch the details
* 
         * @param nodeId the value to set
         * @return this builder
         **/
        

public Builder nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
}
            /**
     * Direction of the lineage returned.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private LineageDirection direction;

        /**
         * Direction of the lineage returned.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(LineageDirection direction) {
    this.direction = direction;
    return this;
}
            /**
     * The flag to indicate whether columns also to be included while fetching neighbors. Default is false.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isWithColumns")
private Boolean isWithColumns;

        /**
         * The flag to indicate whether columns also to be included while fetching neighbors. Default is false.
* 
         * @param isWithColumns the value to set
         * @return this builder
         **/
        

public Builder isWithColumns(Boolean isWithColumns) {
    this.isWithColumns = isWithColumns;
    return this;
}
            /**
     * List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("scopedColumns")
private java.util.List<String> scopedColumns;

        /**
         * List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.
* 
         * @param scopedColumns the value to set
         * @return this builder
         **/
        

public Builder scopedColumns(java.util.List<String> scopedColumns) {
    this.scopedColumns = scopedColumns;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("filter")
private LineageGraphNodeNeighborsFilter filter;



public Builder filter(LineageGraphNodeNeighborsFilter filter) {
    this.filter = filter;
    return this;
}


        public FetchLineageGraphNodeNeighborsDetails build() {
            FetchLineageGraphNodeNeighborsDetails model = new FetchLineageGraphNodeNeighborsDetails(this.nodeId
                , this.direction
                , this.isWithColumns
                , this.scopedColumns
                , this.filter);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchLineageGraphNodeNeighborsDetails model) {
                this.nodeId(model.getNodeId());
    this.direction(model.getDirection());
    this.isWithColumns(model.getIsWithColumns());
    this.scopedColumns(model.getScopedColumns());
    this.filter(model.getFilter());
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
     * ID of the node to fetch the details
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

        /**
     * ID of the node to fetch the details
* 
     * @return the value
     **/
    
    public String getNodeId() {
        return nodeId;
    }

    
        /**
     * Direction of the lineage returned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

        /**
     * Direction of the lineage returned.
     * @return the value
     **/
    
    public LineageDirection getDirection() {
        return direction;
    }


        /**
     * The flag to indicate whether columns also to be included while fetching neighbors. Default is false.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isWithColumns")
    private final Boolean isWithColumns;

        /**
     * The flag to indicate whether columns also to be included while fetching neighbors. Default is false.
* 
     * @return the value
     **/
    
    public Boolean getIsWithColumns() {
        return isWithColumns;
    }


        /**
     * List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scopedColumns")
    private final java.util.List<String> scopedColumns;

        /**
     * List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.
* 
     * @return the value
     **/
    
    public java.util.List<String> getScopedColumns() {
        return scopedColumns;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final LineageGraphNodeNeighborsFilter filter;

    
    public LineageGraphNodeNeighborsFilter getFilter() {
        return filter;
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
        sb.append("FetchLineageGraphNodeNeighborsDetails(");
        sb.append("nodeId=").append(String.valueOf(this.nodeId));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", isWithColumns=").append(String.valueOf(this.isWithColumns));
        sb.append(", scopedColumns=").append(String.valueOf(this.scopedColumns));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchLineageGraphNodeNeighborsDetails)) {
            return false;
        }

        FetchLineageGraphNodeNeighborsDetails other = (FetchLineageGraphNodeNeighborsDetails) o;
        return java.util.Objects.equals(this.nodeId, other.nodeId) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.isWithColumns, other.isWithColumns) &&
            java.util.Objects.equals(this.scopedColumns, other.scopedColumns) &&
            java.util.Objects.equals(this.filter, other.filter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.isWithColumns == null ? 43 : this.isWithColumns.hashCode());
        result = (result * PRIME) + (this.scopedColumns == null ? 43 : this.scopedColumns.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        return result;
    }


}
