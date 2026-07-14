// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions assigned on the table to assignee.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AssignTablePermissionDetails.Builder.class)

public final class AssignTablePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions", "includeColumns", "excludeColumns", "rowFilterType", "rowFilter"})
    public AssignTablePermissionDetails(PermissionAssignees assignees, java.util.List<TablePrivilegeForManage> permissions, java.util.List<String> includeColumns, java.util.List<String> excludeColumns, RowFilterType rowFilterType, String rowFilter) {
        super();
        this.assignees = assignees;
        this.permissions = permissions;
        this.includeColumns = includeColumns;
        this.excludeColumns = excludeColumns;
        this.rowFilterType = rowFilterType;
        this.rowFilter = rowFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignees")
private PermissionAssignees assignees;



public Builder assignees(PermissionAssignees assignees) {
    this.assignees = assignees;
    return this;
}
            /**
     * The permissions assigned to the assignees.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private java.util.List<TablePrivilegeForManage> permissions;

        /**
         * The permissions assigned to the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<TablePrivilegeForManage> permissions) {
    this.permissions = permissions;
    return this;
}
            /**
     * The list of columns to be included for the assigning of permissions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("includeColumns")
private java.util.List<String> includeColumns;

        /**
         * The list of columns to be included for the assigning of permissions.
         * @param includeColumns the value to set
         * @return this builder
         **/
        

public Builder includeColumns(java.util.List<String> includeColumns) {
    this.includeColumns = includeColumns;
    return this;
}
            /**
     * The list of columns to be excluded for the assigning of permissions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("excludeColumns")
private java.util.List<String> excludeColumns;

        /**
         * The list of columns to be excluded for the assigning of permissions.
         * @param excludeColumns the value to set
         * @return this builder
         **/
        

public Builder excludeColumns(java.util.List<String> excludeColumns) {
    this.excludeColumns = excludeColumns;
    return this;
}
            /**
     * Type of row filter expression.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rowFilterType")
private RowFilterType rowFilterType;

        /**
         * Type of row filter expression.
         * @param rowFilterType the value to set
         * @return this builder
         **/
        

public Builder rowFilterType(RowFilterType rowFilterType) {
    this.rowFilterType = rowFilterType;
    return this;
}
            /**
     * Row filter expression applied while assigning table permissions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rowFilter")
private String rowFilter;

        /**
         * Row filter expression applied while assigning table permissions.
         * @param rowFilter the value to set
         * @return this builder
         **/
        

public Builder rowFilter(String rowFilter) {
    this.rowFilter = rowFilter;
    return this;
}


        public AssignTablePermissionDetails build() {
            AssignTablePermissionDetails model = new AssignTablePermissionDetails(this.assignees
                , this.permissions
                , this.includeColumns
                , this.excludeColumns
                , this.rowFilterType
                , this.rowFilter);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignTablePermissionDetails model) {
                this.assignees(model.getAssignees());
    this.permissions(model.getPermissions());
    this.includeColumns(model.getIncludeColumns());
    this.excludeColumns(model.getExcludeColumns());
    this.rowFilterType(model.getRowFilterType());
    this.rowFilter(model.getRowFilter());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignees")
    private final PermissionAssignees assignees;

    
    public PermissionAssignees getAssignees() {
        return assignees;
    }

    
        /**
     * The permissions assigned to the assignees.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<TablePrivilegeForManage> permissions;

        /**
     * The permissions assigned to the assignees.
     * @return the value
     **/
    
    public java.util.List<TablePrivilegeForManage> getPermissions() {
        return permissions;
    }


        /**
     * The list of columns to be included for the assigning of permissions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("includeColumns")
    private final java.util.List<String> includeColumns;

        /**
     * The list of columns to be included for the assigning of permissions.
     * @return the value
     **/
    
    public java.util.List<String> getIncludeColumns() {
        return includeColumns;
    }


        /**
     * The list of columns to be excluded for the assigning of permissions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("excludeColumns")
    private final java.util.List<String> excludeColumns;

        /**
     * The list of columns to be excluded for the assigning of permissions.
     * @return the value
     **/
    
    public java.util.List<String> getExcludeColumns() {
        return excludeColumns;
    }

    
        /**
     * Type of row filter expression.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rowFilterType")
    private final RowFilterType rowFilterType;

        /**
     * Type of row filter expression.
     * @return the value
     **/
    
    public RowFilterType getRowFilterType() {
        return rowFilterType;
    }


        /**
     * Row filter expression applied while assigning table permissions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rowFilter")
    private final String rowFilter;

        /**
     * Row filter expression applied while assigning table permissions.
     * @return the value
     **/
    
    public String getRowFilter() {
        return rowFilter;
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
        sb.append("AssignTablePermissionDetails(");
        sb.append("assignees=").append(String.valueOf(this.assignees));
        sb.append(", permissions=").append(String.valueOf(this.permissions));
        sb.append(", includeColumns=").append(String.valueOf(this.includeColumns));
        sb.append(", excludeColumns=").append(String.valueOf(this.excludeColumns));
        sb.append(", rowFilterType=").append(String.valueOf(this.rowFilterType));
        sb.append(", rowFilter=").append(String.valueOf(this.rowFilter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignTablePermissionDetails)) {
            return false;
        }

        AssignTablePermissionDetails other = (AssignTablePermissionDetails) o;
        return java.util.Objects.equals(this.assignees, other.assignees) &&
            java.util.Objects.equals(this.permissions, other.permissions) &&
            java.util.Objects.equals(this.includeColumns, other.includeColumns) &&
            java.util.Objects.equals(this.excludeColumns, other.excludeColumns) &&
            java.util.Objects.equals(this.rowFilterType, other.rowFilterType) &&
            java.util.Objects.equals(this.rowFilter, other.rowFilter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignees == null ? 43 : this.assignees.hashCode());
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        result = (result * PRIME) + (this.includeColumns == null ? 43 : this.includeColumns.hashCode());
        result = (result * PRIME) + (this.excludeColumns == null ? 43 : this.excludeColumns.hashCode());
        result = (result * PRIME) + (this.rowFilterType == null ? 43 : this.rowFilterType.hashCode());
        result = (result * PRIME) + (this.rowFilter == null ? 43 : this.rowFilter.hashCode());
        return result;
    }


}
