// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information needed to fetch child/parent nodes of desired lineage node details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchLineageGraphNodeReferencesDetails.Builder.class)

public final class FetchLineageGraphNodeReferencesDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeId", "referenceType"})
    public FetchLineageGraphNodeReferencesDetails(String nodeId, ReferenceType referenceType) {
        super();
        this.nodeId = nodeId;
        this.referenceType = referenceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the node to fetch the details:
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodeId")
private String nodeId;

        /**
         * ID of the node to fetch the details:
* 
         * @param nodeId the value to set
         * @return this builder
         **/
        

public Builder nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
}
            /**
     * referenceType of the node
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("referenceType")
private ReferenceType referenceType;

        /**
         * referenceType of the node
         * @param referenceType the value to set
         * @return this builder
         **/
        

public Builder referenceType(ReferenceType referenceType) {
    this.referenceType = referenceType;
    return this;
}


        public FetchLineageGraphNodeReferencesDetails build() {
            FetchLineageGraphNodeReferencesDetails model = new FetchLineageGraphNodeReferencesDetails(this.nodeId
                , this.referenceType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchLineageGraphNodeReferencesDetails model) {
                this.nodeId(model.getNodeId());
    this.referenceType(model.getReferenceType());
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
     * ID of the node to fetch the details:
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

        /**
     * ID of the node to fetch the details:
* 
     * @return the value
     **/
    
    public String getNodeId() {
        return nodeId;
    }

    
        /**
     * referenceType of the node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    private final ReferenceType referenceType;

        /**
     * referenceType of the node
     * @return the value
     **/
    
    public ReferenceType getReferenceType() {
        return referenceType;
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
        sb.append("FetchLineageGraphNodeReferencesDetails(");
        sb.append("nodeId=").append(String.valueOf(this.nodeId));
        sb.append(", referenceType=").append(String.valueOf(this.referenceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchLineageGraphNodeReferencesDetails)) {
            return false;
        }

        FetchLineageGraphNodeReferencesDetails other = (FetchLineageGraphNodeReferencesDetails) o;
        return java.util.Objects.equals(this.nodeId, other.nodeId) &&
            java.util.Objects.equals(this.referenceType, other.referenceType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result = (result * PRIME) + (this.referenceType == null ? 43 : this.referenceType.hashCode());
        return result;
    }


}
