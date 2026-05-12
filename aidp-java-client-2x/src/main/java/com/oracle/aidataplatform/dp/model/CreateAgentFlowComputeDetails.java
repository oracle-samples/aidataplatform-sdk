package com.oracle.aidataplatform.dp.model;


/**
 * Agent flow compute cluster details for creation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAgentFlowComputeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class CreateAgentFlowComputeDetails extends CreateClusterDetails {
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


        public CreateAgentFlowComputeDetails build() {
            CreateAgentFlowComputeDetails model = new CreateAgentFlowComputeDetails(this.displayName
                    , this.description
                    , this.driverConfig
                    , this.nodeType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentFlowComputeDetails model) {
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
    public CreateAgentFlowComputeDetails(String displayName, String description, DriverConfig driverConfig, String nodeType) {
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
        sb.append("CreateAgentFlowComputeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentFlowComputeDetails)) {
            return false;
        }

        CreateAgentFlowComputeDetails other = (CreateAgentFlowComputeDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
