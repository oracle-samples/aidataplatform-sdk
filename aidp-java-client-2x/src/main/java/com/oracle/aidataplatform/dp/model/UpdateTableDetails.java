package com.oracle.aidataplatform.dp.model;


/**
 * The data to update a table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateTableDetails.Builder.class)

public final class UpdateTableDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "addTableFields", "dropTableFields", "renameTableFields", "addTableProperties", "dropTableProperties", "updateTableFields"})
    public UpdateTableDetails(String displayName, String description, java.util.List<TableFieldDetails> addTableFields, java.util.List<TableFieldDetails> dropTableFields, java.util.List<RenameTableFieldDetails> renameTableFields, java.util.List<TableProperty> addTableProperties, java.util.List<TableProperty> dropTableProperties, java.util.List<UpdateTableFieldDetails> updateTableFields) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.addTableFields = addTableFields;
        this.dropTableFields = dropTableFields;
        this.renameTableFields = renameTableFields;
        this.addTableProperties = addTableProperties;
        this.dropTableProperties = dropTableProperties;
        this.updateTableFields = updateTableFields;
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
     * Columns for table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("addTableFields")
        private java.util.List<TableFieldDetails> addTableFields;

                /**
         * Columns for table.
         * @param addTableFields the value to set
         * @return this builder
         **/
        

        public Builder addTableFields(java.util.List<TableFieldDetails> addTableFields) {
        this.addTableFields = addTableFields;
        return this;
        }
            /**
     * Columns for table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dropTableFields")
        private java.util.List<TableFieldDetails> dropTableFields;

                /**
         * Columns for table.
         * @param dropTableFields the value to set
         * @return this builder
         **/
        

        public Builder dropTableFields(java.util.List<TableFieldDetails> dropTableFields) {
        this.dropTableFields = dropTableFields;
        return this;
        }
            /**
     * Columns for table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("renameTableFields")
        private java.util.List<RenameTableFieldDetails> renameTableFields;

                /**
         * Columns for table.
         * @param renameTableFields the value to set
         * @return this builder
         **/
        

        public Builder renameTableFields(java.util.List<RenameTableFieldDetails> renameTableFields) {
        this.renameTableFields = renameTableFields;
        return this;
        }
            /**
     * Table properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("addTableProperties")
        private java.util.List<TableProperty> addTableProperties;

                /**
         * Table properties.
         * @param addTableProperties the value to set
         * @return this builder
         **/
        

        public Builder addTableProperties(java.util.List<TableProperty> addTableProperties) {
        this.addTableProperties = addTableProperties;
        return this;
        }
            /**
     * Table properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dropTableProperties")
        private java.util.List<TableProperty> dropTableProperties;

                /**
         * Table properties.
         * @param dropTableProperties the value to set
         * @return this builder
         **/
        

        public Builder dropTableProperties(java.util.List<TableProperty> dropTableProperties) {
        this.dropTableProperties = dropTableProperties;
        return this;
        }
            /**
     * Update columns in table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updateTableFields")
        private java.util.List<UpdateTableFieldDetails> updateTableFields;

                /**
         * Update columns in table.
         * @param updateTableFields the value to set
         * @return this builder
         **/
        

        public Builder updateTableFields(java.util.List<UpdateTableFieldDetails> updateTableFields) {
        this.updateTableFields = updateTableFields;
        return this;
        }


        public UpdateTableDetails build() {
            UpdateTableDetails model = new UpdateTableDetails(this.displayName
                    , this.description
                    , this.addTableFields
                    , this.dropTableFields
                    , this.renameTableFields
                    , this.addTableProperties
                    , this.dropTableProperties
                    , this.updateTableFields);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTableDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.addTableFields(model.getAddTableFields());
    this.dropTableFields(model.getDropTableFields());
    this.renameTableFields(model.getRenameTableFields());
    this.addTableProperties(model.getAddTableProperties());
    this.dropTableProperties(model.getDropTableProperties());
    this.updateTableFields(model.getUpdateTableFields());
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
     * Columns for table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("addTableFields")
    private final java.util.List<TableFieldDetails> addTableFields;

        /**
     * Columns for table.
     * @return the value
     **/
    
    public java.util.List<TableFieldDetails> getAddTableFields() {
        return addTableFields;
    }


        /**
     * Columns for table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dropTableFields")
    private final java.util.List<TableFieldDetails> dropTableFields;

        /**
     * Columns for table.
     * @return the value
     **/
    
    public java.util.List<TableFieldDetails> getDropTableFields() {
        return dropTableFields;
    }


        /**
     * Columns for table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("renameTableFields")
    private final java.util.List<RenameTableFieldDetails> renameTableFields;

        /**
     * Columns for table.
     * @return the value
     **/
    
    public java.util.List<RenameTableFieldDetails> getRenameTableFields() {
        return renameTableFields;
    }


        /**
     * Table properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("addTableProperties")
    private final java.util.List<TableProperty> addTableProperties;

        /**
     * Table properties.
     * @return the value
     **/
    
    public java.util.List<TableProperty> getAddTableProperties() {
        return addTableProperties;
    }


        /**
     * Table properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dropTableProperties")
    private final java.util.List<TableProperty> dropTableProperties;

        /**
     * Table properties.
     * @return the value
     **/
    
    public java.util.List<TableProperty> getDropTableProperties() {
        return dropTableProperties;
    }


        /**
     * Update columns in table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updateTableFields")
    private final java.util.List<UpdateTableFieldDetails> updateTableFields;

        /**
     * Update columns in table.
     * @return the value
     **/
    
    public java.util.List<UpdateTableFieldDetails> getUpdateTableFields() {
        return updateTableFields;
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
        sb.append("UpdateTableDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", addTableFields=").append(String.valueOf(this.addTableFields));
        sb.append(", dropTableFields=").append(String.valueOf(this.dropTableFields));
        sb.append(", renameTableFields=").append(String.valueOf(this.renameTableFields));
        sb.append(", addTableProperties=").append(String.valueOf(this.addTableProperties));
        sb.append(", dropTableProperties=").append(String.valueOf(this.dropTableProperties));
        sb.append(", updateTableFields=").append(String.valueOf(this.updateTableFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTableDetails)) {
            return false;
        }

        UpdateTableDetails other = (UpdateTableDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.addTableFields, other.addTableFields) &&
            java.util.Objects.equals(this.dropTableFields, other.dropTableFields) &&
            java.util.Objects.equals(this.renameTableFields, other.renameTableFields) &&
            java.util.Objects.equals(this.addTableProperties, other.addTableProperties) &&
            java.util.Objects.equals(this.dropTableProperties, other.dropTableProperties) &&
            java.util.Objects.equals(this.updateTableFields, other.updateTableFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.addTableFields == null ? 43 : this.addTableFields.hashCode());
        result = (result * PRIME) + (this.dropTableFields == null ? 43 : this.dropTableFields.hashCode());
        result = (result * PRIME) + (this.renameTableFields == null ? 43 : this.renameTableFields.hashCode());
        result = (result * PRIME) + (this.addTableProperties == null ? 43 : this.addTableProperties.hashCode());
        result = (result * PRIME) + (this.dropTableProperties == null ? 43 : this.dropTableProperties.hashCode());
        result = (result * PRIME) + (this.updateTableFields == null ? 43 : this.updateTableFields.hashCode());
        return result;
    }


}
