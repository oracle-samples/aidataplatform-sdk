package com.oracle.aidataplatform.dp.model;



/**
 * Derived model for schema of a ALH external catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AlhSchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType")

public final class AlhSchema extends Schema {
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
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
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
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, String> properties;

public Builder properties(java.util.Map<String, String> properties) {
    this.properties = properties;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private SchemaLifecycleState lifecycleState;

public Builder lifecycleState(SchemaLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("details")
private java.util.Map<String, String> details;

public Builder details(java.util.Map<String, String> details) {
    this.details = details;
    return this;
}


        public AlhSchema build() {
            AlhSchema model = new AlhSchema(this.key
                , this.displayName
                , this.description
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.properties
                , this.catalogName
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.details);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlhSchema model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.properties(model.getProperties());
    this.catalogName(model.getCatalogName());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.details(model.getDetails());
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
    public AlhSchema(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, java.util.Map<String, String> properties, String catalogName, SchemaLifecycleState lifecycleState, String lifecycleStateDetails, java.util.Map<String, String> details) {
    super(key, displayName, description, timeCreated, timeUpdated, createdBy, updatedBy, properties, catalogName, lifecycleState, lifecycleStateDetails, details);
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
        sb.append("AlhSchema(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlhSchema)) {
            return false;
        }

        AlhSchema other = (AlhSchema) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
