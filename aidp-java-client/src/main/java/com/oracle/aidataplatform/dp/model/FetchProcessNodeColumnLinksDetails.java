// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information needed to obtain column transformations done by a process.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchProcessNodeColumnLinksDetails.Builder.class)

public final class FetchProcessNodeColumnLinksDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"anchorNodeId", "processNodeId", "processDepth", "direction", "filter"})
    public FetchProcessNodeColumnLinksDetails(String anchorNodeId, String processNodeId, Integer processDepth, LineageDirection direction, ProcessNodeColumnLinksFilter filter) {
        super();
        this.anchorNodeId = anchorNodeId;
        this.processNodeId = processNodeId;
        this.processDepth = processDepth;
        this.direction = direction;
        this.filter = filter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the lineage anchor node from which the traversal context is derived.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorNodeId")
private String anchorNodeId;

        /**
         * ID of the lineage anchor node from which the traversal context is derived.
* 
         * @param anchorNodeId the value to set
         * @return this builder
         **/
        

public Builder anchorNodeId(String anchorNodeId) {
    this.anchorNodeId = anchorNodeId;
    return this;
}
            /**
     * ID of process node for which column transformation links are requested.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("processNodeId")
private String processNodeId;

        /**
         * ID of process node for which column transformation links are requested.
* 
         * @param processNodeId the value to set
         * @return this builder
         **/
        

public Builder processNodeId(String processNodeId) {
    this.processNodeId = processNodeId;
    return this;
}
            /**
     * Depth of the process node relative to the anchor node within the lineage traversal.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("processDepth")
private Integer processDepth;

        /**
         * Depth of the process node relative to the anchor node within the lineage traversal.
* 
         * @param processDepth the value to set
         * @return this builder
         **/
        

public Builder processDepth(Integer processDepth) {
    this.processDepth = processDepth;
    return this;
}
            /**
     * Direction of the process node with respect to Anchor node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private LineageDirection direction;

        /**
         * Direction of the process node with respect to Anchor node.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(LineageDirection direction) {
    this.direction = direction;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("filter")
private ProcessNodeColumnLinksFilter filter;



public Builder filter(ProcessNodeColumnLinksFilter filter) {
    this.filter = filter;
    return this;
}


        public FetchProcessNodeColumnLinksDetails build() {
            FetchProcessNodeColumnLinksDetails model = new FetchProcessNodeColumnLinksDetails(this.anchorNodeId
                , this.processNodeId
                , this.processDepth
                , this.direction
                , this.filter);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchProcessNodeColumnLinksDetails model) {
                this.anchorNodeId(model.getAnchorNodeId());
    this.processNodeId(model.getProcessNodeId());
    this.processDepth(model.getProcessDepth());
    this.direction(model.getDirection());
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
     * ID of the lineage anchor node from which the traversal context is derived.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorNodeId")
    private final String anchorNodeId;

        /**
     * ID of the lineage anchor node from which the traversal context is derived.
* 
     * @return the value
     **/
    
    public String getAnchorNodeId() {
        return anchorNodeId;
    }


        /**
     * ID of process node for which column transformation links are requested.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("processNodeId")
    private final String processNodeId;

        /**
     * ID of process node for which column transformation links are requested.
* 
     * @return the value
     **/
    
    public String getProcessNodeId() {
        return processNodeId;
    }


        /**
     * Depth of the process node relative to the anchor node within the lineage traversal.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("processDepth")
    private final Integer processDepth;

        /**
     * Depth of the process node relative to the anchor node within the lineage traversal.
* 
     * @return the value
     **/
    
    public Integer getProcessDepth() {
        return processDepth;
    }

    
        /**
     * Direction of the process node with respect to Anchor node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

        /**
     * Direction of the process node with respect to Anchor node.
     * @return the value
     **/
    
    public LineageDirection getDirection() {
        return direction;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final ProcessNodeColumnLinksFilter filter;

    
    public ProcessNodeColumnLinksFilter getFilter() {
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
        sb.append("FetchProcessNodeColumnLinksDetails(");
        sb.append("anchorNodeId=").append(String.valueOf(this.anchorNodeId));
        sb.append(", processNodeId=").append(String.valueOf(this.processNodeId));
        sb.append(", processDepth=").append(String.valueOf(this.processDepth));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchProcessNodeColumnLinksDetails)) {
            return false;
        }

        FetchProcessNodeColumnLinksDetails other = (FetchProcessNodeColumnLinksDetails) o;
        return java.util.Objects.equals(this.anchorNodeId, other.anchorNodeId) &&
            java.util.Objects.equals(this.processNodeId, other.processNodeId) &&
            java.util.Objects.equals(this.processDepth, other.processDepth) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.filter, other.filter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.anchorNodeId == null ? 43 : this.anchorNodeId.hashCode());
        result = (result * PRIME) + (this.processNodeId == null ? 43 : this.processNodeId.hashCode());
        result = (result * PRIME) + (this.processDepth == null ? 43 : this.processDepth.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        return result;
    }


}
