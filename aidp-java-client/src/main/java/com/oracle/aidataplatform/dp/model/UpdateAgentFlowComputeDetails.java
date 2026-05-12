package com.oracle.aidataplatform.dp.model;



/**
 * Agent Flow Compute cluster details for creation
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentFlowComputeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class UpdateAgentFlowComputeDetails extends UpdateClusterDetails {
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


        public UpdateAgentFlowComputeDetails build() {
            UpdateAgentFlowComputeDetails model = new UpdateAgentFlowComputeDetails(this.displayName
                , this.description
                , this.driverConfig
                , this.nodeType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentFlowComputeDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.driverConfig(model.getDriverConfig());
    this.nodeType(model.getNodeType());
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
    public UpdateAgentFlowComputeDetails(String displayName, String description, DriverConfig driverConfig, String nodeType) {
    super(displayName, description, driverConfig, nodeType);
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
        sb.append("UpdateAgentFlowComputeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentFlowComputeDetails)) {
            return false;
        }

        UpdateAgentFlowComputeDetails other = (UpdateAgentFlowComputeDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
