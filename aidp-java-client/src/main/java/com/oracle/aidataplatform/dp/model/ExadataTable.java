// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Derived model for table of a Exadata catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExadataTable.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType")

public final class ExadataTable extends Table {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

public Builder key(String key) {
    this.key = key;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("location")
private String location;

public Builder location(String location) {
    this.location = location;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("tableType")
private TableType tableType;

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
@com.fasterxml.jackson.annotation.JsonProperty("tableFields")
private java.util.List<TableFieldDetails> tableFields;

public Builder tableFields(java.util.List<TableFieldDetails> tableFields) {
    this.tableFields = tableFields;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("partitionKeys")
private java.util.List<TableFieldDetails> partitionKeys;

public Builder partitionKeys(java.util.List<TableFieldDetails> partitionKeys) {
    this.partitionKeys = partitionKeys;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("tableProperties")
private java.util.List<TableProperty> tableProperties;

public Builder tableProperties(java.util.List<TableProperty> tableProperties) {
    this.tableProperties = tableProperties;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private TableLifecycleState lifecycleState;

public Builder lifecycleState(TableLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}


        public ExadataTable build() {
            ExadataTable model = new ExadataTable(this.key
                , this.displayName
                , this.catalogKey
                , this.schemaKey
                , this.location
                , this.description
                , this.tableType
                , this.managedTableDefinition
                , this.externalTableDefinition
                , this.tableFields
                , this.partitionKeys
                , this.tableProperties
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.lifecycleState
                , this.lifecycleStateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataTable model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.location(model.getLocation());
    this.description(model.getDescription());
    this.tableType(model.getTableType());
    this.managedTableDefinition(model.getManagedTableDefinition());
    this.externalTableDefinition(model.getExternalTableDefinition());
    this.tableFields(model.getTableFields());
    this.partitionKeys(model.getPartitionKeys());
    this.tableProperties(model.getTableProperties());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
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

    
    @Deprecated
    public ExadataTable(String key, String displayName, String catalogKey, String schemaKey, String location, String description, TableType tableType, ManagedTableDefinition managedTableDefinition, ExternalTableDefinition externalTableDefinition, java.util.List<TableFieldDetails> tableFields, java.util.List<TableFieldDetails> partitionKeys, java.util.List<TableProperty> tableProperties, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, TableLifecycleState lifecycleState, String lifecycleStateDetails) {
    super(key, displayName, catalogKey, schemaKey, location, description, tableType, managedTableDefinition, externalTableDefinition, tableFields, partitionKeys, tableProperties, timeCreated, timeUpdated, createdBy, updatedBy, lifecycleState, lifecycleStateDetails);
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
        sb.append("ExadataTable(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataTable)) {
            return false;
        }

        ExadataTable other = (ExadataTable) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
