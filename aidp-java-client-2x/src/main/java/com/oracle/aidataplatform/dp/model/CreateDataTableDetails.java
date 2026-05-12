package com.oracle.aidataplatform.dp.model;


/**
 * The details to create a managed table with data.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateDataTableDetails.Builder.class)

public final class CreateDataTableDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "catalogKey", "schemaKey", "tableFields", "partitionKeys", "tableProperties", "managedTableDefinition", "selectedColumns", "fileFormat", "objectStorageLocationPath"})
    public CreateDataTableDetails(String displayName, String description, String catalogKey, String schemaKey, java.util.List<TableFieldDetails> tableFields, java.util.List<TableFieldDetails> partitionKeys, java.util.List<TableProperty> tableProperties, ManagedTableDefinition managedTableDefinition, java.util.List<String> selectedColumns, DataFormat fileFormat, String objectStorageLocationPath) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.tableFields = tableFields;
        this.partitionKeys = partitionKeys;
        this.tableProperties = tableProperties;
        this.managedTableDefinition = managedTableDefinition;
        this.selectedColumns = selectedColumns;
        this.fileFormat = fileFormat;
        this.objectStorageLocationPath = objectStorageLocationPath;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("managedTableDefinition")
        private ManagedTableDefinition managedTableDefinition;

        

        public Builder managedTableDefinition(ManagedTableDefinition managedTableDefinition) {
        this.managedTableDefinition = managedTableDefinition;
        return this;
        }
            /**
     * The list of the columns from which data needs to be copied.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("selectedColumns")
        private java.util.List<String> selectedColumns;

                /**
         * The list of the columns from which data needs to be copied.
         * @param selectedColumns the value to set
         * @return this builder
         **/
        

        public Builder selectedColumns(java.util.List<String> selectedColumns) {
        this.selectedColumns = selectedColumns;
        return this;
        }
            /**
     * Format of the sample file from which data needs to be copied.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fileFormat")
        private DataFormat fileFormat;

                /**
         * Format of the sample file from which data needs to be copied.
         * @param fileFormat the value to set
         * @return this builder
         **/
        

        public Builder fileFormat(DataFormat fileFormat) {
        this.fileFormat = fileFormat;
        return this;
        }
            /**
     * The file location from which table details will be used.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageLocationPath")
        private String objectStorageLocationPath;

                /**
         * The file location from which table details will be used.
         * @param objectStorageLocationPath the value to set
         * @return this builder
         **/
        

        public Builder objectStorageLocationPath(String objectStorageLocationPath) {
        this.objectStorageLocationPath = objectStorageLocationPath;
        return this;
        }


        public CreateDataTableDetails build() {
            CreateDataTableDetails model = new CreateDataTableDetails(this.displayName
                    , this.description
                    , this.catalogKey
                    , this.schemaKey
                    , this.tableFields
                    , this.partitionKeys
                    , this.tableProperties
                    , this.managedTableDefinition
                    , this.selectedColumns
                    , this.fileFormat
                    , this.objectStorageLocationPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataTableDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.tableFields(model.getTableFields());
    this.partitionKeys(model.getPartitionKeys());
    this.tableProperties(model.getTableProperties());
    this.managedTableDefinition(model.getManagedTableDefinition());
    this.selectedColumns(model.getSelectedColumns());
    this.fileFormat(model.getFileFormat());
    this.objectStorageLocationPath(model.getObjectStorageLocationPath());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("managedTableDefinition")
    private final ManagedTableDefinition managedTableDefinition;

    
    public ManagedTableDefinition getManagedTableDefinition() {
        return managedTableDefinition;
    }


        /**
     * The list of the columns from which data needs to be copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("selectedColumns")
    private final java.util.List<String> selectedColumns;

        /**
     * The list of the columns from which data needs to be copied.
     * @return the value
     **/
    
    public java.util.List<String> getSelectedColumns() {
        return selectedColumns;
    }

    
        /**
     * Format of the sample file from which data needs to be copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fileFormat")
    private final DataFormat fileFormat;

        /**
     * Format of the sample file from which data needs to be copied.
     * @return the value
     **/
    
    public DataFormat getFileFormat() {
        return fileFormat;
    }


        /**
     * The file location from which table details will be used.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageLocationPath")
    private final String objectStorageLocationPath;

        /**
     * The file location from which table details will be used.
     * @return the value
     **/
    
    public String getObjectStorageLocationPath() {
        return objectStorageLocationPath;
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
        sb.append("CreateDataTableDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", tableFields=").append(String.valueOf(this.tableFields));
        sb.append(", partitionKeys=").append(String.valueOf(this.partitionKeys));
        sb.append(", tableProperties=").append(String.valueOf(this.tableProperties));
        sb.append(", managedTableDefinition=").append(String.valueOf(this.managedTableDefinition));
        sb.append(", selectedColumns=").append(String.valueOf(this.selectedColumns));
        sb.append(", fileFormat=").append(String.valueOf(this.fileFormat));
        sb.append(", objectStorageLocationPath=").append(String.valueOf(this.objectStorageLocationPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataTableDetails)) {
            return false;
        }

        CreateDataTableDetails other = (CreateDataTableDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.tableFields, other.tableFields) &&
            java.util.Objects.equals(this.partitionKeys, other.partitionKeys) &&
            java.util.Objects.equals(this.tableProperties, other.tableProperties) &&
            java.util.Objects.equals(this.managedTableDefinition, other.managedTableDefinition) &&
            java.util.Objects.equals(this.selectedColumns, other.selectedColumns) &&
            java.util.Objects.equals(this.fileFormat, other.fileFormat) &&
            java.util.Objects.equals(this.objectStorageLocationPath, other.objectStorageLocationPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.tableFields == null ? 43 : this.tableFields.hashCode());
        result = (result * PRIME) + (this.partitionKeys == null ? 43 : this.partitionKeys.hashCode());
        result = (result * PRIME) + (this.tableProperties == null ? 43 : this.tableProperties.hashCode());
        result = (result * PRIME) + (this.managedTableDefinition == null ? 43 : this.managedTableDefinition.hashCode());
        result = (result * PRIME) + (this.selectedColumns == null ? 43 : this.selectedColumns.hashCode());
        result = (result * PRIME) + (this.fileFormat == null ? 43 : this.fileFormat.hashCode());
        result = (result * PRIME) + (this.objectStorageLocationPath == null ? 43 : this.objectStorageLocationPath.hashCode());
        return result;
    }


}
