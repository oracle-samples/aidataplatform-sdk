// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A Data Lake AiModel details
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AiModel.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="modelType")

public final class AiModel extends Model {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

public Builder id(String id) {
    this.id = id;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("modelName")
private String modelName;

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
private String namespaceName;

public Builder namespaceName(String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LifecycleState lifecycleState;

public Builder lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
private String lifecycleDetails;

public Builder lifecycleDetails(String lifecycleDetails) {
    this.lifecycleDetails = lifecycleDetails;
    return this;
}
            /**
     * Provides Ai Model's Capabilities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelCapabilities")
private java.util.List<AiModelCapabilitiesEnum> modelCapabilities;

        /**
         * Provides Ai Model's Capabilities.
         * @param modelCapabilities the value to set
         * @return this builder
         **/
        

public Builder modelCapabilities(java.util.List<AiModelCapabilitiesEnum> modelCapabilities) {
    this.modelCapabilities = modelCapabilities;
    return this;
}
            /**
     * version that is available for that AI Model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
private String modelVersion;

        /**
         * version that is available for that AI Model.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * vendor name for that Model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("vendor")
private String vendor;

        /**
         * vendor name for that Model.
         * @param vendor the value to set
         * @return this builder
         **/
        

public Builder vendor(String vendor) {
    this.vendor = vendor;
    return this;
}
            /**
     * region source of that model
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("regionId")
private String regionId;

        /**
         * region source of that model
         * @param regionId the value to set
         * @return this builder
         **/
        

public Builder regionId(String regionId) {
    this.regionId = regionId;
    return this;
}


        public AiModel build() {
            AiModel model = new AiModel(this.id
                , this.modelName
                , this.displayName
                , this.namespaceName
                , this.description
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.lifecycleState
                , this.lifecycleDetails
                , this.modelCapabilities
                , this.modelVersion
                , this.vendor
                , this.regionId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AiModel model) {
                this.id(model.getId());
    this.modelName(model.getModelName());
    this.displayName(model.getDisplayName());
    this.namespaceName(model.getNamespaceName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.modelCapabilities(model.getModelCapabilities());
    this.modelVersion(model.getModelVersion());
    this.vendor(model.getVendor());
    this.regionId(model.getRegionId());
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
    public AiModel(String id, String modelName, String displayName, String namespaceName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, LifecycleState lifecycleState, String lifecycleDetails, java.util.List<AiModelCapabilitiesEnum> modelCapabilities, String modelVersion, String vendor, String regionId) {
    super(id, modelName, displayName, namespaceName, description, timeCreated, timeUpdated, createdBy, updatedBy, lifecycleState, lifecycleDetails);
        this.modelCapabilities = modelCapabilities;
        this.modelVersion = modelVersion;
        this.vendor = vendor;
        this.regionId = regionId;
    }


        /**
     * Provides Ai Model's Capabilities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelCapabilities")
    private final java.util.List<AiModelCapabilitiesEnum> modelCapabilities;

        /**
     * Provides Ai Model's Capabilities.
     * @return the value
     **/
    
    public java.util.List<AiModelCapabilitiesEnum> getModelCapabilities() {
        return modelCapabilities;
    }


        /**
     * version that is available for that AI Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

        /**
     * version that is available for that AI Model.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }


        /**
     * vendor name for that Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

        /**
     * vendor name for that Model.
     * @return the value
     **/
    
    public String getVendor() {
        return vendor;
    }


        /**
     * region source of that model
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

        /**
     * region source of that model
     * @return the value
     **/
    
    public String getRegionId() {
        return regionId;
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
        sb.append("AiModel(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelCapabilities=").append(String.valueOf(this.modelCapabilities));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AiModel)) {
            return false;
        }

        AiModel other = (AiModel) o;
        return java.util.Objects.equals(this.modelCapabilities, other.modelCapabilities) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.vendor, other.vendor) &&
            java.util.Objects.equals(this.regionId, other.regionId) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelCapabilities == null ? 43 : this.modelCapabilities.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        return result;
    }


}
