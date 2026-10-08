// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Derived association between a supplied non-anchor column and an anchor column.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AnchorColumnLink.Builder.class)

public final class AnchorColumnLink  {
    @Deprecated
    @java.beans.ConstructorProperties({"scopedColumnId", "anchorColumnId"})
    public AnchorColumnLink(String scopedColumnId, String anchorColumnId) {
        super();
        this.scopedColumnId = scopedColumnId;
        this.anchorColumnId = anchorColumnId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of a non-anchor column supplied in nodeColumns.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("scopedColumnId")
private String scopedColumnId;

        /**
         * ID of a non-anchor column supplied in nodeColumns.
         * @param scopedColumnId the value to set
         * @return this builder
         **/
        

public Builder scopedColumnId(String scopedColumnId) {
    this.scopedColumnId = scopedColumnId;
    return this;
}
            /**
     * ID of an anchor column connected to the scoped column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorColumnId")
private String anchorColumnId;

        /**
         * ID of an anchor column connected to the scoped column.
         * @param anchorColumnId the value to set
         * @return this builder
         **/
        

public Builder anchorColumnId(String anchorColumnId) {
    this.anchorColumnId = anchorColumnId;
    return this;
}


        public AnchorColumnLink build() {
            AnchorColumnLink model = new AnchorColumnLink(this.scopedColumnId
                , this.anchorColumnId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnchorColumnLink model) {
                this.scopedColumnId(model.getScopedColumnId());
    this.anchorColumnId(model.getAnchorColumnId());
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
     * ID of a non-anchor column supplied in nodeColumns.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scopedColumnId")
    private final String scopedColumnId;

        /**
     * ID of a non-anchor column supplied in nodeColumns.
     * @return the value
     **/
    
    public String getScopedColumnId() {
        return scopedColumnId;
    }


        /**
     * ID of an anchor column connected to the scoped column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorColumnId")
    private final String anchorColumnId;

        /**
     * ID of an anchor column connected to the scoped column.
     * @return the value
     **/
    
    public String getAnchorColumnId() {
        return anchorColumnId;
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
        sb.append("AnchorColumnLink(");
        sb.append("scopedColumnId=").append(String.valueOf(this.scopedColumnId));
        sb.append(", anchorColumnId=").append(String.valueOf(this.anchorColumnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnchorColumnLink)) {
            return false;
        }

        AnchorColumnLink other = (AnchorColumnLink) o;
        return java.util.Objects.equals(this.scopedColumnId, other.scopedColumnId) &&
            java.util.Objects.equals(this.anchorColumnId, other.anchorColumnId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scopedColumnId == null ? 43 : this.scopedColumnId.hashCode());
        result = (result * PRIME) + (this.anchorColumnId == null ? 43 : this.anchorColumnId.hashCode());
        return result;
    }


}
