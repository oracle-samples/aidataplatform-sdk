// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information of table in the schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType", defaultImpl=TableSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StandardTableSummary.class, name = "STANDARD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AlhTableSummary.class, name = "ALH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExadataTableSummary.class, name = "EXADATA"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OacTableSummary.class, name = "ORACLE_ANALYTICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AdwTableSummary.class, name = "ADW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OracleTableSummary.class, name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AtpTableSummary.class, name = "ATP")
})

public class TableSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "tableType", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState"})
    protected TableSummary(String key, String displayName, TableType tableType, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, TableLifecycleState lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.tableType = tableType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
    }




        /**
     * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Table name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Table name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }

    
        /**
     * Type of table. Managed, external or mount table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableType")
    private final TableType tableType;

        /**
     * Type of table. Managed, external or mount table.
     * @return the value
     **/
    
    public TableType getTableType() {
        return tableType;
    }


        /**
     * The date and time the table was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the table was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the table was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the table was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The OCID of the user/principal who created the table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the user/principal who created the table.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the schema.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    
        /**
     * The state of the table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TableLifecycleState lifecycleState;

        /**
     * The state of the table.
     * @return the value
     **/
    
    public TableLifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("TableSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", tableType=").append(String.valueOf(this.tableType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableSummary)) {
            return false;
        }

        TableSummary other = (TableSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.tableType, other.tableType) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.tableType == null ? 43 : this.tableType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
