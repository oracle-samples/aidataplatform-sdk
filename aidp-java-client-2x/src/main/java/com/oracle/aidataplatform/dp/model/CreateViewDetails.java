// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a view.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateViewDetails.Builder.class)

public final class CreateViewDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "catalogKey", "schemaKey", "description", "viewText", "viewProperties", "viewFields"})
    public CreateViewDetails(String displayName, String catalogKey, String schemaKey, String description, String viewText, java.util.List<ViewProperty> viewProperties, java.util.List<ViewFieldDetails> viewFields) {
        super();
        this.displayName = displayName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.description = description;
        this.viewText = viewText;
        this.viewProperties = viewProperties;
        this.viewFields = viewFields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * The name of the catalog to which this view belongs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
        private String catalogKey;

                /**
         * The name of the catalog to which this view belongs.
         * @param catalogKey the value to set
         * @return this builder
         **/
        

        public Builder catalogKey(String catalogKey) {
        this.catalogKey = catalogKey;
        return this;
        }
            /**
     * The name of the Schema to which this view belongs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
        private String schemaKey;

                /**
         * The name of the Schema to which this view belongs.
         * @param schemaKey the value to set
         * @return this builder
         **/
        

        public Builder schemaKey(String schemaKey) {
        this.schemaKey = schemaKey;
        return this;
        }
            /**
     * The description of the view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of the view.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The Query used to create the view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("viewText")
        private String viewText;

                /**
         * The Query used to create the view.
         * @param viewText the value to set
         * @return this builder
         **/
        

        public Builder viewText(String viewText) {
        this.viewText = viewText;
        return this;
        }
            /**
     * View Properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("viewProperties")
        private java.util.List<ViewProperty> viewProperties;

                /**
         * View Properties.
         * @param viewProperties the value to set
         * @return this builder
         **/
        

        public Builder viewProperties(java.util.List<ViewProperty> viewProperties) {
        this.viewProperties = viewProperties;
        return this;
        }
            /**
     * Columns for view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("viewFields")
        private java.util.List<ViewFieldDetails> viewFields;

                /**
         * Columns for view.
         * @param viewFields the value to set
         * @return this builder
         **/
        

        public Builder viewFields(java.util.List<ViewFieldDetails> viewFields) {
        this.viewFields = viewFields;
        return this;
        }


        public CreateViewDetails build() {
            CreateViewDetails model = new CreateViewDetails(this.displayName
                    , this.catalogKey
                    , this.schemaKey
                    , this.description
                    , this.viewText
                    , this.viewProperties
                    , this.viewFields);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateViewDetails model) {
                this.displayName(model.getDisplayName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.description(model.getDescription());
    this.viewText(model.getViewText());
    this.viewProperties(model.getViewProperties());
    this.viewFields(model.getViewFields());
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
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The name of the catalog to which this view belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The name of the catalog to which this view belongs.
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * The name of the Schema to which this view belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The name of the Schema to which this view belongs.
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * The description of the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of the view.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The Query used to create the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("viewText")
    private final String viewText;

        /**
     * The Query used to create the view.
     * @return the value
     **/
    
    public String getViewText() {
        return viewText;
    }


        /**
     * View Properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("viewProperties")
    private final java.util.List<ViewProperty> viewProperties;

        /**
     * View Properties.
     * @return the value
     **/
    
    public java.util.List<ViewProperty> getViewProperties() {
        return viewProperties;
    }


        /**
     * Columns for view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("viewFields")
    private final java.util.List<ViewFieldDetails> viewFields;

        /**
     * Columns for view.
     * @return the value
     **/
    
    public java.util.List<ViewFieldDetails> getViewFields() {
        return viewFields;
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
        sb.append("CreateViewDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", viewText=").append(String.valueOf(this.viewText));
        sb.append(", viewProperties=").append(String.valueOf(this.viewProperties));
        sb.append(", viewFields=").append(String.valueOf(this.viewFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateViewDetails)) {
            return false;
        }

        CreateViewDetails other = (CreateViewDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.viewText, other.viewText) &&
            java.util.Objects.equals(this.viewProperties, other.viewProperties) &&
            java.util.Objects.equals(this.viewFields, other.viewFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.viewText == null ? 43 : this.viewText.hashCode());
        result = (result * PRIME) + (this.viewProperties == null ? 43 : this.viewProperties.hashCode());
        result = (result * PRIME) + (this.viewFields == null ? 43 : this.viewFields.hashCode());
        return result;
    }


}
