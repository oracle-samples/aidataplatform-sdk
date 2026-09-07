// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a table exposed by an Oracle Analytics object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectTableSummary.Builder.class)

public final class OacObjectTableSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "description", "childTables", "tables"})
    public OacObjectTableSummary(String id, String name, String description, java.util.List<OacObjectTableSummary> childTables, java.util.List<OacObjectTableSummary> tables) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.childTables = childTables;
        this.tables = tables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Oracle Analytics table identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * The Oracle Analytics table identifier.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * The Oracle Analytics table display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * The Oracle Analytics table display name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The Oracle Analytics table description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * The Oracle Analytics table description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Child tables nested under this Oracle Analytics table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("childTables")
private java.util.List<OacObjectTableSummary> childTables;

        /**
         * Child tables nested under this Oracle Analytics table.
         * @param childTables the value to set
         * @return this builder
         **/
        

public Builder childTables(java.util.List<OacObjectTableSummary> childTables) {
    this.childTables = childTables;
    return this;
}
            /**
     * Additional tables nested under this Oracle Analytics table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tables")
private java.util.List<OacObjectTableSummary> tables;

        /**
         * Additional tables nested under this Oracle Analytics table.
         * @param tables the value to set
         * @return this builder
         **/
        

public Builder tables(java.util.List<OacObjectTableSummary> tables) {
    this.tables = tables;
    return this;
}


        public OacObjectTableSummary build() {
            OacObjectTableSummary model = new OacObjectTableSummary(this.id
                , this.name
                , this.description
                , this.childTables
                , this.tables);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectTableSummary model) {
                this.id(model.getId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.childTables(model.getChildTables());
    this.tables(model.getTables());
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
     * The Oracle Analytics table identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * The Oracle Analytics table identifier.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * The Oracle Analytics table display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The Oracle Analytics table display name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The Oracle Analytics table description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The Oracle Analytics table description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Child tables nested under this Oracle Analytics table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("childTables")
    private final java.util.List<OacObjectTableSummary> childTables;

        /**
     * Child tables nested under this Oracle Analytics table.
     * @return the value
     **/
    
    public java.util.List<OacObjectTableSummary> getChildTables() {
        return childTables;
    }


        /**
     * Additional tables nested under this Oracle Analytics table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    private final java.util.List<OacObjectTableSummary> tables;

        /**
     * Additional tables nested under this Oracle Analytics table.
     * @return the value
     **/
    
    public java.util.List<OacObjectTableSummary> getTables() {
        return tables;
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
        sb.append("OacObjectTableSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", childTables=").append(String.valueOf(this.childTables));
        sb.append(", tables=").append(String.valueOf(this.tables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectTableSummary)) {
            return false;
        }

        OacObjectTableSummary other = (OacObjectTableSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.childTables, other.childTables) &&
            java.util.Objects.equals(this.tables, other.tables);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.childTables == null ? 43 : this.childTables.hashCode());
        result = (result * PRIME) + (this.tables == null ? 43 : this.tables.hashCode());
        return result;
    }


}
