// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information about a workspace object permission.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceObjectPermissionSummary.Builder.class)

public final class WorkspaceObjectPermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions", "isPermissionsInheritable"})
    public WorkspaceObjectPermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<WorkspaceObjectPrivilege> granteePermissions, Boolean isPermissionsInheritable) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
        this.isPermissionsInheritable = isPermissionsInheritable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of user/group and name in case of role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("grantee")
private String grantee;

        /**
         * The OCID of user/group and name in case of role.
         * @param grantee the value to set
         * @return this builder
         **/
        

public Builder grantee(String grantee) {
    this.grantee = grantee;
    return this;
}
            /**
     * The simplified name of the grantee.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("granteeName")
private String granteeName;

        /**
         * The simplified name of the grantee.
         * @param granteeName the value to set
         * @return this builder
         **/
        

public Builder granteeName(String granteeName) {
    this.granteeName = granteeName;
    return this;
}
            /**
     * The type of grantee.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("granteeType")
private GranteeType granteeType;

        /**
         * The type of grantee.
         * @param granteeType the value to set
         * @return this builder
         **/
        

public Builder granteeType(GranteeType granteeType) {
    this.granteeType = granteeType;
    return this;
}
            /**
     * The selected permissions for a workspace object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
private java.util.List<WorkspaceObjectPrivilege> granteePermissions;

        /**
         * The selected permissions for a workspace object.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

public Builder granteePermissions(java.util.List<WorkspaceObjectPrivilege> granteePermissions) {
    this.granteePermissions = granteePermissions;
    return this;
}
            /**
     * Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
private Boolean isPermissionsInheritable;

        /**
         * Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.
         * @param isPermissionsInheritable the value to set
         * @return this builder
         **/
        

public Builder isPermissionsInheritable(Boolean isPermissionsInheritable) {
    this.isPermissionsInheritable = isPermissionsInheritable;
    return this;
}


        public WorkspaceObjectPermissionSummary build() {
            WorkspaceObjectPermissionSummary model = new WorkspaceObjectPermissionSummary(this.grantee
                , this.granteeName
                , this.granteeType
                , this.granteePermissions
                , this.isPermissionsInheritable);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceObjectPermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
    this.isPermissionsInheritable(model.getIsPermissionsInheritable());
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
     * The OCID of user/group and name in case of role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("grantee")
    private final String grantee;

        /**
     * The OCID of user/group and name in case of role.
     * @return the value
     **/
    
    public String getGrantee() {
        return grantee;
    }


        /**
     * The simplified name of the grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeName")
    private final String granteeName;

        /**
     * The simplified name of the grantee.
     * @return the value
     **/
    
    public String getGranteeName() {
        return granteeName;
    }

    
        /**
     * The type of grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeType")
    private final GranteeType granteeType;

        /**
     * The type of grantee.
     * @return the value
     **/
    
    public GranteeType getGranteeType() {
        return granteeType;
    }

    
        /**
     * The selected permissions for a workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<WorkspaceObjectPrivilege> granteePermissions;

        /**
     * The selected permissions for a workspace object.
     * @return the value
     **/
    
    public java.util.List<WorkspaceObjectPrivilege> getGranteePermissions() {
        return granteePermissions;
    }


        /**
     * Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
    private final Boolean isPermissionsInheritable;

        /**
     * Property to determine if permission is inheritable or not. This is applicable only on workspace folders not on files.
     * @return the value
     **/
    
    public Boolean getIsPermissionsInheritable() {
        return isPermissionsInheritable;
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
        sb.append("WorkspaceObjectPermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(", isPermissionsInheritable=").append(String.valueOf(this.isPermissionsInheritable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceObjectPermissionSummary)) {
            return false;
        }

        WorkspaceObjectPermissionSummary other = (WorkspaceObjectPermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions) &&
            java.util.Objects.equals(this.isPermissionsInheritable, other.isPermissionsInheritable);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        result = (result * PRIME) + (this.granteePermissions == null ? 43 : this.granteePermissions.hashCode());
        result = (result * PRIME) + (this.isPermissionsInheritable == null ? 43 : this.isPermissionsInheritable.hashCode());
        return result;
    }


}
