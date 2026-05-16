// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information about a new compute cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=CreateClusterDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentFlowComputeDetails.class, name = "AGENT_FLOW_COMPUTE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateSparkClusterDetails.class, name = "USER")
})

public class CreateClusterDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "driverConfig", "nodeType"})
    protected CreateClusterDetails(String displayName, String description, DriverConfig driverConfig, String nodeType) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.driverConfig = driverConfig;
        this.nodeType = nodeType;
    }




        /**
     * Cluster name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Cluster name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Cluster description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Cluster description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
    private final DriverConfig driverConfig;

    
    public DriverConfig getDriverConfig() {
        return driverConfig;
    }


        /**
     * Cluster node type encodes the node shape and associated resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final String nodeType;

        /**
     * Cluster node type encodes the node shape and associated resources.
     * @return the value
     **/
    
    public String getNodeType() {
        return nodeType;
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
        sb.append("CreateClusterDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", driverConfig=").append(String.valueOf(this.driverConfig));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateClusterDetails)) {
            return false;
        }

        CreateClusterDetails other = (CreateClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.driverConfig, other.driverConfig) &&
            java.util.Objects.equals(this.nodeType, other.nodeType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.driverConfig == null ? 43 : this.driverConfig.hashCode());
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        return result;
    }


}
