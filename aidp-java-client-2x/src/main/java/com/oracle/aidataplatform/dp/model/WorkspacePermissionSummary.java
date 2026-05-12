package com.oracle.aidataplatform.dp.model;


/**
 * Information about a workspace permission.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspacePermissionSummary.Builder.class)

public final class WorkspacePermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions"})
    public WorkspacePermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<WorkspacePrivilege> granteePermissions) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
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
     * The selected permissions for a workspace.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
        private java.util.List<WorkspacePrivilege> granteePermissions;

                /**
         * The selected permissions for a workspace.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

        public Builder granteePermissions(java.util.List<WorkspacePrivilege> granteePermissions) {
        this.granteePermissions = granteePermissions;
        return this;
        }


        public WorkspacePermissionSummary build() {
            WorkspacePermissionSummary model = new WorkspacePermissionSummary(this.grantee
                    , this.granteeName
                    , this.granteeType
                    , this.granteePermissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspacePermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
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
     * The selected permissions for a workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<WorkspacePrivilege> granteePermissions;

        /**
     * The selected permissions for a workspace.
     * @return the value
     **/
    
    public java.util.List<WorkspacePrivilege> getGranteePermissions() {
        return granteePermissions;
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
        sb.append("WorkspacePermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspacePermissionSummary)) {
            return false;
        }

        WorkspacePermissionSummary other = (WorkspacePermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        result = (result * PRIME) + (this.granteePermissions == null ? 43 : this.granteePermissions.hashCode());
        return result;
    }


}
