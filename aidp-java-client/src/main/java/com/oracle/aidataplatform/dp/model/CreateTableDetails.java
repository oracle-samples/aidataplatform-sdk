// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to create a table.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateTableDetails.Builder.class)

public final class CreateTableDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "catalogKey", "schemaKey", "description", "tableType", "managedTableDefinition", "externalTableDefinition", "tableFields", "partitionKeys", "tableProperties"})
    public CreateTableDetails(String displayName, String catalogKey, String schemaKey, String description, TableType tableType, ManagedTableDefinition managedTableDefinition, ExternalTableDefinition externalTableDefinition, java.util.List<TableFieldDetails> tableFields, java.util.List<TableFieldDetails> partitionKeys, java.util.List<TableProperty> tableProperties) {
        super();
        this.displayName = displayName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.description = description;
        this.tableType = tableType;
        this.managedTableDefinition = managedTableDefinition;
        this.externalTableDefinition = externalTableDefinition;
        this.tableFields = tableFields;
        this.partitionKeys = partitionKeys;
        this.tableProperties = tableProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Table name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Table name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The name of the catalog to which this table belongs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * The name of the catalog to which this table belongs.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * The name of the schema to which this table belongs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * The name of the schema to which this table belongs.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
            /**
     * Table description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Table description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Type of table. Managed, external or mount table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableType")
private TableType tableType;

        /**
         * Type of table. Managed, external or mount table.
         * @param tableType the value to set
         * @return this builder
         **/
        

public Builder tableType(TableType tableType) {
    this.tableType = tableType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("managedTableDefinition")
private ManagedTableDefinition managedTableDefinition;



public Builder managedTableDefinition(ManagedTableDefinition managedTableDefinition) {
    this.managedTableDefinition = managedTableDefinition;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("externalTableDefinition")
private ExternalTableDefinition externalTableDefinition;



public Builder externalTableDefinition(ExternalTableDefinition externalTableDefinition) {
    this.externalTableDefinition = externalTableDefinition;
    return this;
}
            /**
     * Columns for table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableFields")
private java.util.List<TableFieldDetails> tableFields;

        /**
         * Columns for table.
         * @param tableFields the value to set
         * @return this builder
         **/
        

public Builder tableFields(java.util.List<TableFieldDetails> tableFields) {
    this.tableFields = tableFields;
    return this;
}
            /**
     * Columns to be used in partition for table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("partitionKeys")
private java.util.List<TableFieldDetails> partitionKeys;

        /**
         * Columns to be used in partition for table.
         * @param partitionKeys the value to set
         * @return this builder
         **/
        

public Builder partitionKeys(java.util.List<TableFieldDetails> partitionKeys) {
    this.partitionKeys = partitionKeys;
    return this;
}
            /**
     * Table properties.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableProperties")
private java.util.List<TableProperty> tableProperties;

        /**
         * Table properties.
         * @param tableProperties the value to set
         * @return this builder
         **/
        

public Builder tableProperties(java.util.List<TableProperty> tableProperties) {
    this.tableProperties = tableProperties;
    return this;
}


        public CreateTableDetails build() {
            CreateTableDetails model = new CreateTableDetails(this.displayName
                , this.catalogKey
                , this.schemaKey
                , this.description
                , this.tableType
                , this.managedTableDefinition
                , this.externalTableDefinition
                , this.tableFields
                , this.partitionKeys
                , this.tableProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTableDetails model) {
                this.displayName(model.getDisplayName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.description(model.getDescription());
    this.tableType(model.getTableType());
    this.managedTableDefinition(model.getManagedTableDefinition());
    this.externalTableDefinition(model.getExternalTableDefinition());
    this.tableFields(model.getTableFields());
    this.partitionKeys(model.getPartitionKeys());
    this.tableProperties(model.getTableProperties());
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
        sb.append("CreateTableDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tableType=").append(String.valueOf(this.tableType));
        sb.append(", managedTableDefinition=").append(String.valueOf(this.managedTableDefinition));
        sb.append(", externalTableDefinition=").append(String.valueOf(this.externalTableDefinition));
        sb.append(", tableFields=").append(String.valueOf(this.tableFields));
        sb.append(", partitionKeys=").append(String.valueOf(this.partitionKeys));
        sb.append(", tableProperties=").append(String.valueOf(this.tableProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTableDetails)) {
            return false;
        }

        CreateTableDetails other = (CreateTableDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.tableType, other.tableType) &&
            java.util.Objects.equals(this.managedTableDefinition, other.managedTableDefinition) &&
            java.util.Objects.equals(this.externalTableDefinition, other.externalTableDefinition) &&
            java.util.Objects.equals(this.tableFields, other.tableFields) &&
            java.util.Objects.equals(this.partitionKeys, other.partitionKeys) &&
            java.util.Objects.equals(this.tableProperties, other.tableProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.tableType == null ? 43 : this.tableType.hashCode());
        result = (result * PRIME) + (this.managedTableDefinition == null ? 43 : this.managedTableDefinition.hashCode());
        result = (result * PRIME) + (this.externalTableDefinition == null ? 43 : this.externalTableDefinition.hashCode());
        result = (result * PRIME) + (this.tableFields == null ? 43 : this.tableFields.hashCode());
        result = (result * PRIME) + (this.partitionKeys == null ? 43 : this.partitionKeys.hashCode());
        result = (result * PRIME) + (this.tableProperties == null ? 43 : this.tableProperties.hashCode());
        return result;
    }


}
