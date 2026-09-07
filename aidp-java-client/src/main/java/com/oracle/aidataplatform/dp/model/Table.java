// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information about the table in the schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType", defaultImpl=Table.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OracleTable.class, name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AdwTable.class, name = "ADW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AlhTable.class, name = "ALH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MysqlTable.class, name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SqlServerOnAzureTable.class, name = "AZURE_SQLSERVER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StandardTable.class, name = "STANDARD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Db2Table.class, name = "DB2"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExadataTable.class, name = "EXADATA"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AtpTable.class, name = "ATP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OacTable.class, name = "ORACLE_ANALYTICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SnowflakeTable.class, name = "SNOWFLAKE")
})

public class Table  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "catalogKey", "schemaKey", "location", "description", "tableType", "managedTableDefinition", "externalTableDefinition", "tableFields", "partitionKeys", "tableProperties", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState", "lifecycleStateDetails"})
    protected Table(String key, String displayName, String catalogKey, String schemaKey, String location, String description, TableType tableType, ManagedTableDefinition managedTableDefinition, ExternalTableDefinition externalTableDefinition, java.util.List<TableFieldDetails> tableFields, java.util.List<TableFieldDetails> partitionKeys, java.util.List<TableProperty> tableProperties, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, TableLifecycleState lifecycleState, String lifecycleStateDetails) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.location = location;
        this.description = description;
        this.tableType = tableType;
        this.managedTableDefinition = managedTableDefinition;
        this.externalTableDefinition = externalTableDefinition;
        this.tableFields = tableFields;
        this.partitionKeys = partitionKeys;
        this.tableProperties = tableProperties;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
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
     * The name of the catalog to which this table belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The name of the catalog to which this table belongs.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * The name of the schema to which this table belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The name of the schema to which this table belongs.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * Location of the table data.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

        /**
     * Location of the table data.
     * @return the value
     **/
    
    public String getLocation() {
        return location;
    }


        /**
     * Table description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Table description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("managedTableDefinition")
    private final ManagedTableDefinition managedTableDefinition;

    
    public ManagedTableDefinition getManagedTableDefinition() {
        return managedTableDefinition;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("externalTableDefinition")
    private final ExternalTableDefinition externalTableDefinition;

    
    public ExternalTableDefinition getExternalTableDefinition() {
        return externalTableDefinition;
    }


        /**
     * Columns for table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableFields")
    private final java.util.List<TableFieldDetails> tableFields;

        /**
     * Columns for table.
     * @return the value
     **/
    
    public java.util.List<TableFieldDetails> getTableFields() {
        return tableFields;
    }


        /**
     * Columns to be used in partition for table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("partitionKeys")
    private final java.util.List<TableFieldDetails> partitionKeys;

        /**
     * Columns to be used in partition for table.
     * @return the value
     **/
    
    public java.util.List<TableFieldDetails> getPartitionKeys() {
        return partitionKeys;
    }


        /**
     * Table properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableProperties")
    private final java.util.List<TableProperty> tableProperties;

        /**
     * Table properties.
     * @return the value
     **/
    
    public java.util.List<TableProperty> getTableProperties() {
        return tableProperties;
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


        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
        sb.append("Table(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tableType=").append(String.valueOf(this.tableType));
        sb.append(", managedTableDefinition=").append(String.valueOf(this.managedTableDefinition));
        sb.append(", externalTableDefinition=").append(String.valueOf(this.externalTableDefinition));
        sb.append(", tableFields=").append(String.valueOf(this.tableFields));
        sb.append(", partitionKeys=").append(String.valueOf(this.partitionKeys));
        sb.append(", tableProperties=").append(String.valueOf(this.tableProperties));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Table)) {
            return false;
        }

        Table other = (Table) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.location, other.location) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.tableType, other.tableType) &&
            java.util.Objects.equals(this.managedTableDefinition, other.managedTableDefinition) &&
            java.util.Objects.equals(this.externalTableDefinition, other.externalTableDefinition) &&
            java.util.Objects.equals(this.tableFields, other.tableFields) &&
            java.util.Objects.equals(this.partitionKeys, other.partitionKeys) &&
            java.util.Objects.equals(this.tableProperties, other.tableProperties) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.tableType == null ? 43 : this.tableType.hashCode());
        result = (result * PRIME) + (this.managedTableDefinition == null ? 43 : this.managedTableDefinition.hashCode());
        result = (result * PRIME) + (this.externalTableDefinition == null ? 43 : this.externalTableDefinition.hashCode());
        result = (result * PRIME) + (this.tableFields == null ? 43 : this.tableFields.hashCode());
        result = (result * PRIME) + (this.partitionKeys == null ? 43 : this.partitionKeys.hashCode());
        result = (result * PRIME) + (this.tableProperties == null ? 43 : this.tableProperties.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        return result;
    }


}
