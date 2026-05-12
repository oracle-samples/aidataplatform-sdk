package com.oracle.aidataplatform.dp.model;



/**
 * Information about the view in the schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=View.Builder.class)

public final class View  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "catalogKey", "schemaKey", "viewText", "description", "viewFields", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "viewProperties", "lifecycleState", "lifecycleStateDetails"})
    public View(String key, String displayName, String catalogKey, String schemaKey, String viewText, String description, java.util.List<ViewFieldDetails> viewFields, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, java.util.List<ViewProperty> viewProperties, ViewLifecycleState lifecycleState, String lifecycleStateDetails) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.viewText = viewText;
        this.description = description;
        this.viewFields = viewFields;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.viewProperties = viewProperties;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
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
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The ID of the user/principal who created the view.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user/principal who created the view.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The ID of the user who last updated the view.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the user who last updated the view.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
     * The state of the view.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private ViewLifecycleState lifecycleState;

        /**
         * The state of the view.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(ViewLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}


        public View build() {
            View model = new View(this.key
                , this.displayName
                , this.catalogKey
                , this.schemaKey
                , this.viewText
                , this.description
                , this.viewFields
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.viewProperties
                , this.lifecycleState
                , this.lifecycleStateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(View model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.viewText(model.getViewText());
    this.description(model.getDescription());
    this.viewFields(model.getViewFields());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.viewProperties(model.getViewProperties());
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

    


        /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The ID of the user/principal who created the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user/principal who created the view.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the view.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
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
     * The state of the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ViewLifecycleState lifecycleState;

        /**
     * The state of the view.
     * @return the value
     **/
    
    public ViewLifecycleState getLifecycleState() {
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
        sb.append("View(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", viewText=").append(String.valueOf(this.viewText));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", viewFields=").append(String.valueOf(this.viewFields));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", viewProperties=").append(String.valueOf(this.viewProperties));
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
        if (!(o instanceof View)) {
            return false;
        }

        View other = (View) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.viewText, other.viewText) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.viewFields, other.viewFields) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.viewProperties, other.viewProperties) &&
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
        result = (result * PRIME) + (this.viewText == null ? 43 : this.viewText.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.viewFields == null ? 43 : this.viewFields.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.viewProperties == null ? 43 : this.viewProperties.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        return result;
    }


}
