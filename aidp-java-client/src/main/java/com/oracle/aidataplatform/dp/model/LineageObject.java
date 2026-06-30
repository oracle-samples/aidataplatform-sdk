// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Object describing an individual element of object lineage.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageObject.Builder.class)

public final class LineageObject  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "qualifiedName", "displayName", "parentId", "type", "direction", "depth", "properties"})
    public LineageObject(String id, String qualifiedName, String displayName, String parentId, String type, LineageDirection direction, Integer depth, java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.id = id;
        this.qualifiedName = qualifiedName;
        this.displayName = displayName;
        this.parentId = parentId;
        this.type = type;
        this.direction = direction;
        this.depth = depth;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Key of the object, such as an entity, about which this lineage applies.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Key of the object, such as an entity, about which this lineage applies.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * External source identifier name of the object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
private String qualifiedName;

        /**
         * External source identifier name of the object.
         * @param qualifiedName the value to set
         * @return this builder
         **/
        

public Builder qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
}
            /**
     * Display name of the object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Display name of the object.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Key of the parent object for this object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentId")
private String parentId;

        /**
         * Key of the parent object for this object.
         * @param parentId the value to set
         * @return this builder
         **/
        

public Builder parentId(String parentId) {
    this.parentId = parentId;
    return this;
}
            /**
     * Type name of the object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Type name of the object.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Direction of the lineage.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private LineageDirection direction;

        /**
         * Direction of the lineage.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(LineageDirection direction) {
    this.direction = direction;
    return this;
}
            /**
     * Depth is measured as number of links from anchor node to matching nodes.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("depth")
private Integer depth;

        /**
         * Depth is measured as number of links from anchor node to matching nodes.
* 
         * @param depth the value to set
         * @return this builder
         **/
        

public Builder depth(Integer depth) {
    this.depth = depth;
    return this;
}
            /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
* definition defines it's set of required and optional properties. The map keys are category names and the
* values are maps of property name to property value. Every property is contained inside of a category. Most
* data entities have required properties within the "default" category.
* Example: {@code {"properties": { "default": { "key1": "value1"}}}}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the entity type. Each entity type
* definition defines it's set of required and optional properties. The map keys are category names and the
* values are maps of property name to property value. Every property is contained inside of a category. Most
* data entities have required properties within the "default" category.
* Example: {@code {"properties": { "default": { "key1": "value1"}}}}
* 
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
    this.properties = properties;
    return this;
}


        public LineageObject build() {
            LineageObject model = new LineageObject(this.id
                , this.qualifiedName
                , this.displayName
                , this.parentId
                , this.type
                , this.direction
                , this.depth
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageObject model) {
                this.id(model.getId());
    this.qualifiedName(model.getQualifiedName());
    this.displayName(model.getDisplayName());
    this.parentId(model.getParentId());
    this.type(model.getType());
    this.direction(model.getDirection());
    this.depth(model.getDepth());
    this.properties(model.getProperties());
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
     * Key of the object, such as an entity, about which this lineage applies.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Key of the object, such as an entity, about which this lineage applies.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * External source identifier name of the object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
    private final String qualifiedName;

        /**
     * External source identifier name of the object.
     * @return the value
     **/
    
    public String getQualifiedName() {
        return qualifiedName;
    }


        /**
     * Display name of the object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name of the object.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Key of the parent object for this object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

        /**
     * Key of the parent object for this object.
     * @return the value
     **/
    
    public String getParentId() {
        return parentId;
    }


        /**
     * Type name of the object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type name of the object.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }

    
        /**
     * Direction of the lineage.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

        /**
     * Direction of the lineage.
     * @return the value
     **/
    
    public LineageDirection getDirection() {
        return direction;
    }


        /**
     * Depth is measured as number of links from anchor node to matching nodes.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    private final Integer depth;

        /**
     * Depth is measured as number of links from anchor node to matching nodes.
* 
     * @return the value
     **/
    
    public Integer getDepth() {
        return depth;
    }


        /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
* definition defines it's set of required and optional properties. The map keys are category names and the
* values are maps of property name to property value. Every property is contained inside of a category. Most
* data entities have required properties within the "default" category.
* Example: {@code {"properties": { "default": { "key1": "value1"}}}}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

        /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
* definition defines it's set of required and optional properties. The map keys are category names and the
* values are maps of property name to property value. Every property is contained inside of a category. Most
* data entities have required properties within the "default" category.
* Example: {@code {"properties": { "default": { "key1": "value1"}}}}
* 
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("LineageObject(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", qualifiedName=").append(String.valueOf(this.qualifiedName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", depth=").append(String.valueOf(this.depth));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageObject)) {
            return false;
        }

        LineageObject other = (LineageObject) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.qualifiedName, other.qualifiedName) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.parentId, other.parentId) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.depth, other.depth) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.qualifiedName == null ? 43 : this.qualifiedName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
