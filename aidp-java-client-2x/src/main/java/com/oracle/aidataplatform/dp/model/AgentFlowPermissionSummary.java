// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information about a Agent flow permission.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowPermissionSummary.Builder.class)

public final class AgentFlowPermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions", "columns", "excludeColumns", "isInherited", "resourceName"})
    public AgentFlowPermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<AgentFlowPrivilege> granteePermissions, java.util.List<String> columns, java.util.List<String> excludeColumns, Boolean isInherited, String resourceName) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
        this.columns = columns;
        this.excludeColumns = excludeColumns;
        this.isInherited = isInherited;
        this.resourceName = resourceName;
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
     * The selected permissions for a Agent flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
        private java.util.List<AgentFlowPrivilege> granteePermissions;

                /**
         * The selected permissions for a Agent flow.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

        public Builder granteePermissions(java.util.List<AgentFlowPrivilege> granteePermissions) {
        this.granteePermissions = granteePermissions;
        return this;
        }
            /**
     * The list of the columns included for permission assignment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<String> columns;

                /**
         * The list of the columns included for permission assignment.
         * @param columns the value to set
         * @return this builder
         **/
        

        public Builder columns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
        }
            /**
     * The list of the columns excluded from permission assignment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("excludeColumns")
        private java.util.List<String> excludeColumns;

                /**
         * The list of the columns excluded from permission assignment.
         * @param excludeColumns the value to set
         * @return this builder
         **/
        

        public Builder excludeColumns(java.util.List<String> excludeColumns) {
        this.excludeColumns = excludeColumns;
        return this;
        }
            /**
     * If the permission listed is inherited or not from object higher up in hierarchy.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
        private Boolean isInherited;

                /**
         * If the permission listed is inherited or not from object higher up in hierarchy.
         * @param isInherited the value to set
         * @return this builder
         **/
        

        public Builder isInherited(Boolean isInherited) {
        this.isInherited = isInherited;
        return this;
        }
            /**
     * Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

                /**
         * Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
         * @param resourceName the value to set
         * @return this builder
         **/
        

        public Builder resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
        }


        public AgentFlowPermissionSummary build() {
            AgentFlowPermissionSummary model = new AgentFlowPermissionSummary(this.grantee
                    , this.granteeName
                    , this.granteeType
                    , this.granteePermissions
                    , this.columns
                    , this.excludeColumns
                    , this.isInherited
                    , this.resourceName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowPermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
    this.columns(model.getColumns());
    this.excludeColumns(model.getExcludeColumns());
    this.isInherited(model.getIsInherited());
    this.resourceName(model.getResourceName());
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
     * The selected permissions for a Agent flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<AgentFlowPrivilege> granteePermissions;

        /**
     * The selected permissions for a Agent flow.
     * @return the value
     **/
    
    public java.util.List<AgentFlowPrivilege> getGranteePermissions() {
        return granteePermissions;
    }


        /**
     * The list of the columns included for permission assignment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<String> columns;

        /**
     * The list of the columns included for permission assignment.
     * @return the value
     **/
    
    public java.util.List<String> getColumns() {
        return columns;
    }


        /**
     * The list of the columns excluded from permission assignment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("excludeColumns")
    private final java.util.List<String> excludeColumns;

        /**
     * The list of the columns excluded from permission assignment.
     * @return the value
     **/
    
    public java.util.List<String> getExcludeColumns() {
        return excludeColumns;
    }


        /**
     * If the permission listed is inherited or not from object higher up in hierarchy.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
    private final Boolean isInherited;

        /**
     * If the permission listed is inherited or not from object higher up in hierarchy.
     * @return the value
     **/
    
    public Boolean getIsInherited() {
        return isInherited;
    }


        /**
     * Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

        /**
     * Name of the object to which this permission belong to. Name of Agent flow if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     * @return the value
     **/
    
    public String getResourceName() {
        return resourceName;
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
        sb.append("AgentFlowPermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", excludeColumns=").append(String.valueOf(this.excludeColumns));
        sb.append(", isInherited=").append(String.valueOf(this.isInherited));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowPermissionSummary)) {
            return false;
        }

        AgentFlowPermissionSummary other = (AgentFlowPermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions) &&
            java.util.Objects.equals(this.columns, other.columns) &&
            java.util.Objects.equals(this.excludeColumns, other.excludeColumns) &&
            java.util.Objects.equals(this.isInherited, other.isInherited) &&
            java.util.Objects.equals(this.resourceName, other.resourceName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        result = (result * PRIME) + (this.granteePermissions == null ? 43 : this.granteePermissions.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.excludeColumns == null ? 43 : this.excludeColumns.hashCode());
        result = (result * PRIME) + (this.isInherited == null ? 43 : this.isInherited.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        return result;
    }


}
