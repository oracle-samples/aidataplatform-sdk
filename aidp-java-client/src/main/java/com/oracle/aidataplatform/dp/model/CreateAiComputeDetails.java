// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * AI compute cluster details for creation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAiComputeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class CreateAiComputeDetails extends CreateClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
private DriverConfig driverConfig;

public Builder driverConfig(DriverConfig driverConfig) {
    this.driverConfig = driverConfig;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("nodeType")
private String nodeType;

public Builder nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("replicaConfig")
private ReplicaConfig replicaConfig;



public Builder replicaConfig(ReplicaConfig replicaConfig) {
    this.replicaConfig = replicaConfig;
    return this;
}


        public CreateAiComputeDetails build() {
            CreateAiComputeDetails model = new CreateAiComputeDetails(this.displayName
                , this.description
                , this.driverConfig
                , this.nodeType
                , this.replicaConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAiComputeDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.driverConfig(model.getDriverConfig());
    this.nodeType(model.getNodeType());
    this.replicaConfig(model.getReplicaConfig());
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

    
    @Deprecated
    public CreateAiComputeDetails(String displayName, String description, DriverConfig driverConfig, String nodeType, ReplicaConfig replicaConfig) {
    super(displayName, description, driverConfig, nodeType);
        this.replicaConfig = replicaConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaConfig")
    private final ReplicaConfig replicaConfig;

    
    public ReplicaConfig getReplicaConfig() {
        return replicaConfig;
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
        sb.append("CreateAiComputeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", replicaConfig=").append(String.valueOf(this.replicaConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAiComputeDetails)) {
            return false;
        }

        CreateAiComputeDetails other = (CreateAiComputeDetails) o;
        return java.util.Objects.equals(this.replicaConfig, other.replicaConfig) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.replicaConfig == null ? 43 : this.replicaConfig.hashCode());
        return result;
    }


}
