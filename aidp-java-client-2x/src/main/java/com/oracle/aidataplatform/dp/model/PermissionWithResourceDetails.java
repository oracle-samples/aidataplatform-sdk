package com.oracle.aidataplatform.dp.model;


/**
 * A permission string with resource details.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PermissionWithResourceDetails.Builder.class)

public final class PermissionWithResourceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissions", "resourceType", "resourceKey"})
    public PermissionWithResourceDetails(AllPrivilegeType permissions, AllResourceType resourceType, String resourceKey) {
        super();
        this.permissions = permissions;
        this.resourceType = resourceType;
        this.resourceKey = resourceKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Permission or privilege name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("permissions")
        private AllPrivilegeType permissions;

                /**
         * Permission or privilege name.
         * @param permissions the value to set
         * @return this builder
         **/
        

        public Builder permissions(AllPrivilegeType permissions) {
        this.permissions = permissions;
        return this;
        }
            /**
     * All sub-resources in catalog and workspace.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private AllResourceType resourceType;

                /**
         * All sub-resources in catalog and workspace.
         * @param resourceType the value to set
         * @return this builder
         **/
        

        public Builder resourceType(AllResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
        }
            /**
     * Workspace and its sub-resources key.
* For example - For workspaceKey, clusterKey its a UUID
* Within catalog its a 3 level namespace
*    tableKey - <catalogName>.<schemaName>.<tableName> 
*    schemaKey - <catalogName>.<schemaName>
*    catalogKey - <catalogName>
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
        private String resourceKey;

                /**
         * Workspace and its sub-resources key.
* For example - For workspaceKey, clusterKey its a UUID
* Within catalog its a 3 level namespace
*    tableKey - <catalogName>.<schemaName>.<tableName> 
*    schemaKey - <catalogName>.<schemaName>
*    catalogKey - <catalogName>
* 
         * @param resourceKey the value to set
         * @return this builder
         **/
        

        public Builder resourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
        }


        public PermissionWithResourceDetails build() {
            PermissionWithResourceDetails model = new PermissionWithResourceDetails(this.permissions
                    , this.resourceType
                    , this.resourceKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PermissionWithResourceDetails model) {
                this.permissions(model.getPermissions());
    this.resourceType(model.getResourceType());
    this.resourceKey(model.getResourceKey());
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
     * Permission or privilege name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final AllPrivilegeType permissions;

        /**
     * Permission or privilege name.
     * @return the value
     **/
    
    public AllPrivilegeType getPermissions() {
        return permissions;
    }

    
        /**
     * All sub-resources in catalog and workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final AllResourceType resourceType;

        /**
     * All sub-resources in catalog and workspace.
     * @return the value
     **/
    
    public AllResourceType getResourceType() {
        return resourceType;
    }


        /**
     * Workspace and its sub-resources key.
* For example - For workspaceKey, clusterKey its a UUID
* Within catalog its a 3 level namespace
*    tableKey - <catalogName>.<schemaName>.<tableName> 
*    schemaKey - <catalogName>.<schemaName>
*    catalogKey - <catalogName>
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
    private final String resourceKey;

        /**
     * Workspace and its sub-resources key.
* For example - For workspaceKey, clusterKey its a UUID
* Within catalog its a 3 level namespace
*    tableKey - <catalogName>.<schemaName>.<tableName> 
*    schemaKey - <catalogName>.<schemaName>
*    catalogKey - <catalogName>
* 
     * @return the value
     **/
    
    public String getResourceKey() {
        return resourceKey;
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
        sb.append("PermissionWithResourceDetails(");
        sb.append("permissions=").append(String.valueOf(this.permissions));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceKey=").append(String.valueOf(this.resourceKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PermissionWithResourceDetails)) {
            return false;
        }

        PermissionWithResourceDetails other = (PermissionWithResourceDetails) o;
        return java.util.Objects.equals(this.permissions, other.permissions) &&
            java.util.Objects.equals(this.resourceType, other.resourceType) &&
            java.util.Objects.equals(this.resourceKey, other.resourceKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceKey == null ? 43 : this.resourceKey.hashCode());
        return result;
    }


}
