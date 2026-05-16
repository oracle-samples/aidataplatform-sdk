// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The details for updating a view.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ViewUpdateDetails.Builder.class)

public final class ViewUpdateDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "viewText", "viewFields", "addViewProperties", "dropViewProperties"})
    public ViewUpdateDetails(String displayName, String description, String viewText, java.util.List<ViewFieldDetails> viewFields, java.util.List<ViewProperty> addViewProperties, java.util.List<ViewProperty> dropViewProperties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.viewText = viewText;
        this.viewFields = viewFields;
        this.addViewProperties = addViewProperties;
        this.dropViewProperties = dropViewProperties;
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
            /**
     * View Properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("addViewProperties")
        private java.util.List<ViewProperty> addViewProperties;

                /**
         * View Properties.
         * @param addViewProperties the value to set
         * @return this builder
         **/
        

        public Builder addViewProperties(java.util.List<ViewProperty> addViewProperties) {
        this.addViewProperties = addViewProperties;
        return this;
        }
            /**
     * View Properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dropViewProperties")
        private java.util.List<ViewProperty> dropViewProperties;

                /**
         * View Properties.
         * @param dropViewProperties the value to set
         * @return this builder
         **/
        

        public Builder dropViewProperties(java.util.List<ViewProperty> dropViewProperties) {
        this.dropViewProperties = dropViewProperties;
        return this;
        }


        public ViewUpdateDetails build() {
            ViewUpdateDetails model = new ViewUpdateDetails(this.displayName
                    , this.description
                    , this.viewText
                    , this.viewFields
                    , this.addViewProperties
                    , this.dropViewProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ViewUpdateDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.viewText(model.getViewText());
    this.viewFields(model.getViewFields());
    this.addViewProperties(model.getAddViewProperties());
    this.dropViewProperties(model.getDropViewProperties());
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


        /**
     * View Properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("addViewProperties")
    private final java.util.List<ViewProperty> addViewProperties;

        /**
     * View Properties.
     * @return the value
     **/
    
    public java.util.List<ViewProperty> getAddViewProperties() {
        return addViewProperties;
    }


        /**
     * View Properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dropViewProperties")
    private final java.util.List<ViewProperty> dropViewProperties;

        /**
     * View Properties.
     * @return the value
     **/
    
    public java.util.List<ViewProperty> getDropViewProperties() {
        return dropViewProperties;
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
        sb.append("ViewUpdateDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", viewText=").append(String.valueOf(this.viewText));
        sb.append(", viewFields=").append(String.valueOf(this.viewFields));
        sb.append(", addViewProperties=").append(String.valueOf(this.addViewProperties));
        sb.append(", dropViewProperties=").append(String.valueOf(this.dropViewProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewUpdateDetails)) {
            return false;
        }

        ViewUpdateDetails other = (ViewUpdateDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.viewText, other.viewText) &&
            java.util.Objects.equals(this.viewFields, other.viewFields) &&
            java.util.Objects.equals(this.addViewProperties, other.addViewProperties) &&
            java.util.Objects.equals(this.dropViewProperties, other.dropViewProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.viewText == null ? 43 : this.viewText.hashCode());
        result = (result * PRIME) + (this.viewFields == null ? 43 : this.viewFields.hashCode());
        result = (result * PRIME) + (this.addViewProperties == null ? 43 : this.addViewProperties.hashCode());
        result = (result * PRIME) + (this.dropViewProperties == null ? 43 : this.dropViewProperties.hashCode());
        return result;
    }


}
