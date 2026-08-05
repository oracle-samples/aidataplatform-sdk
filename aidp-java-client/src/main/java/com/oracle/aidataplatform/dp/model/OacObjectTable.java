// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Table and column metadata exposed by an Oracle Analytics object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectTable.Builder.class)

public final class OacObjectTable  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "description", "columns"})
    public OacObjectTable(String id, String name, String description, java.util.List<OacObjectColumn> columns) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.columns = columns;
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
     * The Oracle Analytics columns in the table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("columns")
private java.util.List<OacObjectColumn> columns;

        /**
         * The Oracle Analytics columns in the table.
         * @param columns the value to set
         * @return this builder
         **/
        

public Builder columns(java.util.List<OacObjectColumn> columns) {
    this.columns = columns;
    return this;
}


        public OacObjectTable build() {
            OacObjectTable model = new OacObjectTable(this.id
                , this.name
                , this.description
                , this.columns);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectTable model) {
                this.id(model.getId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.columns(model.getColumns());
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
     * The Oracle Analytics columns in the table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<OacObjectColumn> columns;

        /**
     * The Oracle Analytics columns in the table.
     * @return the value
     **/
    
    public java.util.List<OacObjectColumn> getColumns() {
        return columns;
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
        sb.append("OacObjectTable(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectTable)) {
            return false;
        }

        OacObjectTable other = (OacObjectTable) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.columns, other.columns);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        return result;
    }


}
