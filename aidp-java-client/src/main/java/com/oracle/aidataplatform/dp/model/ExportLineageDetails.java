// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information needed to export lineage as CSV.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportLineageDetails.Builder.class)

public final class ExportLineageDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"anchorNode", "direction"})
    public ExportLineageDetails(String anchorNode, LineageDirection direction) {
        super();
        this.anchorNode = anchorNode;
        this.direction = direction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Root entity node from which lineage is to be exported.
* Example format: {@code aidp://catalogs@<aidpocid>/o/{catalog.db.table}}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorNode")
private String anchorNode;

        /**
         * Root entity node from which lineage is to be exported.
* Example format: {@code aidp://catalogs@<aidpocid>/o/{catalog.db.table}}.
* 
         * @param anchorNode the value to set
         * @return this builder
         **/
        

public Builder anchorNode(String anchorNode) {
    this.anchorNode = anchorNode;
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


        public ExportLineageDetails build() {
            ExportLineageDetails model = new ExportLineageDetails(this.anchorNode
                , this.direction);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportLineageDetails model) {
                this.anchorNode(model.getAnchorNode());
    this.direction(model.getDirection());
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
     * Root entity node from which lineage is to be exported.
* Example format: {@code aidp://catalogs@<aidpocid>/o/{catalog.db.table}}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorNode")
    private final String anchorNode;

        /**
     * Root entity node from which lineage is to be exported.
* Example format: {@code aidp://catalogs@<aidpocid>/o/{catalog.db.table}}.
* 
     * @return the value
     **/
    
    public String getAnchorNode() {
        return anchorNode;
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
        sb.append("ExportLineageDetails(");
        sb.append("anchorNode=").append(String.valueOf(this.anchorNode));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportLineageDetails)) {
            return false;
        }

        ExportLineageDetails other = (ExportLineageDetails) o;
        return java.util.Objects.equals(this.anchorNode, other.anchorNode) &&
            java.util.Objects.equals(this.direction, other.direction);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.anchorNode == null ? 43 : this.anchorNode.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        return result;
    }


}
