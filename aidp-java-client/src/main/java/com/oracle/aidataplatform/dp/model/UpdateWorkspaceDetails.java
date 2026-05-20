// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateWorkspaceDetails.Builder.class)

public final class UpdateWorkspaceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "defaultCatalogKey", "networkConfigurationDetails"})
    public UpdateWorkspaceDetails(String displayName, String description, String defaultCatalogKey, WorkspaceNetworkConfigurationDetails networkConfigurationDetails) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.defaultCatalogKey = defaultCatalogKey;
        this.networkConfigurationDetails = networkConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Description of the workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the workspace.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("defaultCatalogKey")
private String defaultCatalogKey;

        /**
         * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
         * @param defaultCatalogKey the value to set
         * @return this builder
         **/
        

public Builder defaultCatalogKey(String defaultCatalogKey) {
    this.defaultCatalogKey = defaultCatalogKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("networkConfigurationDetails")
private WorkspaceNetworkConfigurationDetails networkConfigurationDetails;



public Builder networkConfigurationDetails(WorkspaceNetworkConfigurationDetails networkConfigurationDetails) {
    this.networkConfigurationDetails = networkConfigurationDetails;
    return this;
}


        public UpdateWorkspaceDetails build() {
            UpdateWorkspaceDetails model = new UpdateWorkspaceDetails(this.displayName
                , this.description
                , this.defaultCatalogKey
                , this.networkConfigurationDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWorkspaceDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.defaultCatalogKey(model.getDefaultCatalogKey());
    this.networkConfigurationDetails(model.getNetworkConfigurationDetails());
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
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Description of the workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the workspace.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCatalogKey")
    private final String defaultCatalogKey;

        /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     * @return the value
     **/
    
    public String getDefaultCatalogKey() {
        return defaultCatalogKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("networkConfigurationDetails")
    private final WorkspaceNetworkConfigurationDetails networkConfigurationDetails;

    
    public WorkspaceNetworkConfigurationDetails getNetworkConfigurationDetails() {
        return networkConfigurationDetails;
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
        sb.append("UpdateWorkspaceDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultCatalogKey=").append(String.valueOf(this.defaultCatalogKey));
        sb.append(", networkConfigurationDetails=").append(String.valueOf(this.networkConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateWorkspaceDetails)) {
            return false;
        }

        UpdateWorkspaceDetails other = (UpdateWorkspaceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.defaultCatalogKey, other.defaultCatalogKey) &&
            java.util.Objects.equals(this.networkConfigurationDetails, other.networkConfigurationDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.defaultCatalogKey == null ? 43 : this.defaultCatalogKey.hashCode());
        result = (result * PRIME) + (this.networkConfigurationDetails == null ? 43 : this.networkConfigurationDetails.hashCode());
        return result;
    }


}
