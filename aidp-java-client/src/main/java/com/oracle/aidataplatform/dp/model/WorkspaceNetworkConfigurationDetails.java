// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Private network configuration details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceNetworkConfigurationDetails.Builder.class)

public final class WorkspaceNetworkConfigurationDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "nsgIds", "scanDetails"})
    public WorkspaceNetworkConfigurationDetails(String subnetId, java.util.List<String> nsgIds, java.util.List<Scan> scanDetails) {
        super();
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.scanDetails = scanDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of a subnet.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("subnetId")
private String subnetId;

        /**
         * The OCID of a subnet.
* 
         * @param subnetId the value to set
         * @return this builder
         **/
        

public Builder subnetId(String subnetId) {
    this.subnetId = subnetId;
    return this;
}
            /**
     * An array of network security group OCIDs.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
private java.util.List<String> nsgIds;

        /**
         * An array of network security group OCIDs.
* 
         * @param nsgIds the value to set
         * @return this builder
         **/
        

public Builder nsgIds(java.util.List<String> nsgIds) {
    this.nsgIds = nsgIds;
    return this;
}
            /**
     * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
* [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("scanDetails")
private java.util.List<Scan> scanDetails;

        /**
         * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
* [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
* 
         * @param scanDetails the value to set
         * @return this builder
         **/
        

public Builder scanDetails(java.util.List<Scan> scanDetails) {
    this.scanDetails = scanDetails;
    return this;
}


        public WorkspaceNetworkConfigurationDetails build() {
            WorkspaceNetworkConfigurationDetails model = new WorkspaceNetworkConfigurationDetails(this.subnetId
                , this.nsgIds
                , this.scanDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceNetworkConfigurationDetails model) {
                this.subnetId(model.getSubnetId());
    this.nsgIds(model.getNsgIds());
    this.scanDetails(model.getScanDetails());
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
     * The OCID of a subnet.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

        /**
     * The OCID of a subnet.
* 
     * @return the value
     **/
    
    public String getSubnetId() {
        return subnetId;
    }


        /**
     * An array of network security group OCIDs.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

        /**
     * An array of network security group OCIDs.
* 
     * @return the value
     **/
    
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }


        /**
     * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
* [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scanDetails")
    private final java.util.List<Scan> scanDetails;

        /**
     * An array of fqdn/port pairs used to create private endpoint. Each object is a simple key-value pair with FQDN as key and port number as value.
* [ { fqdn: "scan1.oracle.com", port: "1521"}, { fqdn: "scan2.oracle.com", port: "1521" } ]
* 
     * @return the value
     **/
    
    public java.util.List<Scan> getScanDetails() {
        return scanDetails;
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
        sb.append("WorkspaceNetworkConfigurationDetails(");
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", scanDetails=").append(String.valueOf(this.scanDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceNetworkConfigurationDetails)) {
            return false;
        }

        WorkspaceNetworkConfigurationDetails other = (WorkspaceNetworkConfigurationDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId) &&
            java.util.Objects.equals(this.nsgIds, other.nsgIds) &&
            java.util.Objects.equals(this.scanDetails, other.scanDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.scanDetails == null ? 43 : this.scanDetails.hashCode());
        return result;
    }


}
