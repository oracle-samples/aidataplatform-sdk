// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information about a view permission.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ViewPermissionSummary.Builder.class)

public final class ViewPermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions", "columns", "excludedColumns", "isInherited", "resourceName"})
    public ViewPermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<ViewPrivilege> granteePermissions, java.util.List<String> columns, java.util.List<String> excludedColumns, Boolean isInherited, String resourceName) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
        this.columns = columns;
        this.excludedColumns = excludedColumns;
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
     * The selected permissions for a view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
        private java.util.List<ViewPrivilege> granteePermissions;

                /**
         * The selected permissions for a view.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

        public Builder granteePermissions(java.util.List<ViewPrivilege> granteePermissions) {
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
    
        @com.fasterxml.jackson.annotation.JsonProperty("excludedColumns")
        private java.util.List<String> excludedColumns;

                /**
         * The list of the columns excluded from permission assignment.
         * @param excludedColumns the value to set
         * @return this builder
         **/
        

        public Builder excludedColumns(java.util.List<String> excludedColumns) {
        this.excludedColumns = excludedColumns;
        return this;
        }
            /**
     * The permission listed is inherited or not from object up in hierarchy.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
        private Boolean isInherited;

                /**
         * The permission listed is inherited or not from object up in hierarchy.
         * @param isInherited the value to set
         * @return this builder
         **/
        

        public Builder isInherited(Boolean isInherited) {
        this.isInherited = isInherited;
        return this;
        }
            /**
     * Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

                /**
         * Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.
         * @param resourceName the value to set
         * @return this builder
         **/
        

        public Builder resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
        }


        public ViewPermissionSummary build() {
            ViewPermissionSummary model = new ViewPermissionSummary(this.grantee
                    , this.granteeName
                    , this.granteeType
                    , this.granteePermissions
                    , this.columns
                    , this.excludedColumns
                    , this.isInherited
                    , this.resourceName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ViewPermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
    this.columns(model.getColumns());
    this.excludedColumns(model.getExcludedColumns());
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
     * The selected permissions for a view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<ViewPrivilege> granteePermissions;

        /**
     * The selected permissions for a view.
     * @return the value
     **/
    
    public java.util.List<ViewPrivilege> getGranteePermissions() {
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("excludedColumns")
    private final java.util.List<String> excludedColumns;

        /**
     * The list of the columns excluded from permission assignment.
     * @return the value
     **/
    
    public java.util.List<String> getExcludedColumns() {
        return excludedColumns;
    }


        /**
     * The permission listed is inherited or not from object up in hierarchy.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
    private final Boolean isInherited;

        /**
     * The permission listed is inherited or not from object up in hierarchy.
     * @return the value
     **/
    
    public Boolean getIsInherited() {
        return isInherited;
    }


        /**
     * Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

        /**
     * Name of the object to which this permission belong to. This would be the name of view if permission is not inherited or name of object up in hierarchy if permission is inherited.
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
        sb.append("ViewPermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", excludedColumns=").append(String.valueOf(this.excludedColumns));
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
        if (!(o instanceof ViewPermissionSummary)) {
            return false;
        }

        ViewPermissionSummary other = (ViewPermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions) &&
            java.util.Objects.equals(this.columns, other.columns) &&
            java.util.Objects.equals(this.excludedColumns, other.excludedColumns) &&
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
        result = (result * PRIME) + (this.excludedColumns == null ? 43 : this.excludedColumns.hashCode());
        result = (result * PRIME) + (this.isInherited == null ? 43 : this.isInherited.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        return result;
    }


}
