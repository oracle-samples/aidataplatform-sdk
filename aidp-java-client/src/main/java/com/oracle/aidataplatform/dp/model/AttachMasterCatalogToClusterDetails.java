// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details to attach a Master Catalog to a Cluster
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AttachMasterCatalogToClusterDetails.Builder.class)

public final class AttachMasterCatalogToClusterDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterKey"})
    public AttachMasterCatalogToClusterDetails(String clusterKey) {
        super();
        this.clusterKey = clusterKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The key of the Cluster to attach Master Catalog
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * The key of the Cluster to attach Master Catalog
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
    return this;
}


        public AttachMasterCatalogToClusterDetails build() {
            AttachMasterCatalogToClusterDetails model = new AttachMasterCatalogToClusterDetails(this.clusterKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachMasterCatalogToClusterDetails model) {
                this.clusterKey(model.getClusterKey());
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
     * The key of the Cluster to attach Master Catalog
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * The key of the Cluster to attach Master Catalog
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
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
        sb.append("AttachMasterCatalogToClusterDetails(");
        sb.append("clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachMasterCatalogToClusterDetails)) {
            return false;
        }

        AttachMasterCatalogToClusterDetails other = (AttachMasterCatalogToClusterDetails) o;
        return java.util.Objects.equals(this.clusterKey, other.clusterKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        return result;
    }


}
