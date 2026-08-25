// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Column metadata for a table exposed by an Oracle Analytics object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectColumn.Builder.class)

public final class OacObjectColumn  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "formula", "isTime", "type", "hierarchyID", "hierarchyDisplayName", "dimensionID", "tableName", "levels", "sqlInfo"})
    public OacObjectColumn(String name, String description, String formula, Boolean isTime, String type, String hierarchyID, String hierarchyDisplayName, String dimensionID, String tableName, java.util.List<OacObjectHierarchyLevel> levels, OacObjectColumnSqlInfo sqlInfo) {
        super();
        this.name = name;
        this.description = description;
        this.formula = formula;
        this.isTime = isTime;
        this.type = type;
        this.hierarchyID = hierarchyID;
        this.hierarchyDisplayName = hierarchyDisplayName;
        this.dimensionID = dimensionID;
        this.tableName = tableName;
        this.levels = levels;
        this.sqlInfo = sqlInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Oracle Analytics column name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * The Oracle Analytics column name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The Oracle Analytics column description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * The Oracle Analytics column description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The Oracle Analytics expression backing the column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("formula")
private String formula;

        /**
         * The Oracle Analytics expression backing the column.
         * @param formula the value to set
         * @return this builder
         **/
        

public Builder formula(String formula) {
    this.formula = formula;
    return this;
}
            /**
     * Indicates whether this Oracle Analytics column represents time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isTime")
private Boolean isTime;

        /**
         * Indicates whether this Oracle Analytics column represents time.
         * @param isTime the value to set
         * @return this builder
         **/
        

public Builder isTime(Boolean isTime) {
    this.isTime = isTime;
    return this;
}
            /**
     * The Oracle Analytics column type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * The Oracle Analytics column type.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * The hierarchy identifier reported for an Oracle Analytics hierarchical column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hierarchyID")
private String hierarchyID;

        /**
         * The hierarchy identifier reported for an Oracle Analytics hierarchical column.
         * @param hierarchyID the value to set
         * @return this builder
         **/
        

public Builder hierarchyID(String hierarchyID) {
    this.hierarchyID = hierarchyID;
    return this;
}
            /**
     * The hierarchy display name reported for a hierarchical column in an OAC data object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hierarchyDisplayName")
private String hierarchyDisplayName;

        /**
         * The hierarchy display name reported for a hierarchical column in an OAC data object.
         * @param hierarchyDisplayName the value to set
         * @return this builder
         **/
        

public Builder hierarchyDisplayName(String hierarchyDisplayName) {
    this.hierarchyDisplayName = hierarchyDisplayName;
    return this;
}
            /**
     * The dimension identifier reported for an Oracle Analytics hierarchical column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dimensionID")
private String dimensionID;

        /**
         * The dimension identifier reported for an Oracle Analytics hierarchical column.
         * @param dimensionID the value to set
         * @return this builder
         **/
        

public Builder dimensionID(String dimensionID) {
    this.dimensionID = dimensionID;
    return this;
}
            /**
     * The table name reported for a hierarchical column in an OAC data object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableName")
private String tableName;

        /**
         * The table name reported for a hierarchical column in an OAC data object.
         * @param tableName the value to set
         * @return this builder
         **/
        

public Builder tableName(String tableName) {
    this.tableName = tableName;
    return this;
}
            /**
     * The hierarchy levels reported for an Oracle Analytics hierarchical column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("levels")
private java.util.List<OacObjectHierarchyLevel> levels;

        /**
         * The hierarchy levels reported for an Oracle Analytics hierarchical column.
         * @param levels the value to set
         * @return this builder
         **/
        

public Builder levels(java.util.List<OacObjectHierarchyLevel> levels) {
    this.levels = levels;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sqlInfo")
private OacObjectColumnSqlInfo sqlInfo;



public Builder sqlInfo(OacObjectColumnSqlInfo sqlInfo) {
    this.sqlInfo = sqlInfo;
    return this;
}


        public OacObjectColumn build() {
            OacObjectColumn model = new OacObjectColumn(this.name
                , this.description
                , this.formula
                , this.isTime
                , this.type
                , this.hierarchyID
                , this.hierarchyDisplayName
                , this.dimensionID
                , this.tableName
                , this.levels
                , this.sqlInfo);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectColumn model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.formula(model.getFormula());
    this.isTime(model.getIsTime());
    this.type(model.getType());
    this.hierarchyID(model.getHierarchyID());
    this.hierarchyDisplayName(model.getHierarchyDisplayName());
    this.dimensionID(model.getDimensionID());
    this.tableName(model.getTableName());
    this.levels(model.getLevels());
    this.sqlInfo(model.getSqlInfo());
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
     * The Oracle Analytics column name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The Oracle Analytics column name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The Oracle Analytics column description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The Oracle Analytics column description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The Oracle Analytics expression backing the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("formula")
    private final String formula;

        /**
     * The Oracle Analytics expression backing the column.
     * @return the value
     **/
    
    public String getFormula() {
        return formula;
    }


        /**
     * Indicates whether this Oracle Analytics column represents time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isTime")
    private final Boolean isTime;

        /**
     * Indicates whether this Oracle Analytics column represents time.
     * @return the value
     **/
    
    public Boolean getIsTime() {
        return isTime;
    }


        /**
     * The Oracle Analytics column type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * The Oracle Analytics column type.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * The hierarchy identifier reported for an Oracle Analytics hierarchical column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchyID")
    private final String hierarchyID;

        /**
     * The hierarchy identifier reported for an Oracle Analytics hierarchical column.
     * @return the value
     **/
    
    public String getHierarchyID() {
        return hierarchyID;
    }


        /**
     * The hierarchy display name reported for a hierarchical column in an OAC data object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchyDisplayName")
    private final String hierarchyDisplayName;

        /**
     * The hierarchy display name reported for a hierarchical column in an OAC data object.
     * @return the value
     **/
    
    public String getHierarchyDisplayName() {
        return hierarchyDisplayName;
    }


        /**
     * The dimension identifier reported for an Oracle Analytics hierarchical column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionID")
    private final String dimensionID;

        /**
     * The dimension identifier reported for an Oracle Analytics hierarchical column.
     * @return the value
     **/
    
    public String getDimensionID() {
        return dimensionID;
    }


        /**
     * The table name reported for a hierarchical column in an OAC data object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

        /**
     * The table name reported for a hierarchical column in an OAC data object.
     * @return the value
     **/
    
    public String getTableName() {
        return tableName;
    }


        /**
     * The hierarchy levels reported for an Oracle Analytics hierarchical column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("levels")
    private final java.util.List<OacObjectHierarchyLevel> levels;

        /**
     * The hierarchy levels reported for an Oracle Analytics hierarchical column.
     * @return the value
     **/
    
    public java.util.List<OacObjectHierarchyLevel> getLevels() {
        return levels;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInfo")
    private final OacObjectColumnSqlInfo sqlInfo;

    
    public OacObjectColumnSqlInfo getSqlInfo() {
        return sqlInfo;
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
        sb.append("OacObjectColumn(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", formula=").append(String.valueOf(this.formula));
        sb.append(", isTime=").append(String.valueOf(this.isTime));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", hierarchyID=").append(String.valueOf(this.hierarchyID));
        sb.append(", hierarchyDisplayName=").append(String.valueOf(this.hierarchyDisplayName));
        sb.append(", dimensionID=").append(String.valueOf(this.dimensionID));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(", levels=").append(String.valueOf(this.levels));
        sb.append(", sqlInfo=").append(String.valueOf(this.sqlInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectColumn)) {
            return false;
        }

        OacObjectColumn other = (OacObjectColumn) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.formula, other.formula) &&
            java.util.Objects.equals(this.isTime, other.isTime) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.hierarchyID, other.hierarchyID) &&
            java.util.Objects.equals(this.hierarchyDisplayName, other.hierarchyDisplayName) &&
            java.util.Objects.equals(this.dimensionID, other.dimensionID) &&
            java.util.Objects.equals(this.tableName, other.tableName) &&
            java.util.Objects.equals(this.levels, other.levels) &&
            java.util.Objects.equals(this.sqlInfo, other.sqlInfo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.formula == null ? 43 : this.formula.hashCode());
        result = (result * PRIME) + (this.isTime == null ? 43 : this.isTime.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.hierarchyID == null ? 43 : this.hierarchyID.hashCode());
        result = (result * PRIME) + (this.hierarchyDisplayName == null ? 43 : this.hierarchyDisplayName.hashCode());
        result = (result * PRIME) + (this.dimensionID == null ? 43 : this.dimensionID.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.levels == null ? 43 : this.levels.hashCode());
        result = (result * PRIME) + (this.sqlInfo == null ? 43 : this.sqlInfo.hashCode());
        return result;
    }


}
