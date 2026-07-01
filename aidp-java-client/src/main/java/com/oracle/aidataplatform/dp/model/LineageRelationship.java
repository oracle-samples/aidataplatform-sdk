// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Declares how two elements of object lineage are related.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageRelationship.Builder.class)

public final class LineageRelationship  {
    @Deprecated
    @java.beans.ConstructorProperties({"fromNodeId", "toNodeId", "type", "providerType", "properties"})
    public LineageRelationship(String fromNodeId, String toNodeId, String type, String providerType, java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.fromNodeId = fromNodeId;
        this.toNodeId = toNodeId;
        this.type = type;
        this.providerType = providerType;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Object key of source lineage element.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fromNodeId")
private String fromNodeId;

        /**
         * Object key of source lineage element.
         * @param fromNodeId the value to set
         * @return this builder
         **/
        

public Builder fromNodeId(String fromNodeId) {
    this.fromNodeId = fromNodeId;
    return this;
}
            /**
     * Object key of target lineage element.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toNodeId")
private String toNodeId;

        /**
         * Object key of target lineage element.
         * @param toNodeId the value to set
         * @return this builder
         **/
        

public Builder toNodeId(String toNodeId) {
    this.toNodeId = toNodeId;
    return this;
}
            /**
     * Type of the relationship.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Type of the relationship.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Type of the relationship.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("providerType")
private String providerType;

        /**
         * Type of the relationship.
         * @param providerType the value to set
         * @return this builder
         **/
        

public Builder providerType(String providerType) {
    this.providerType = providerType;
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


        public LineageRelationship build() {
            LineageRelationship model = new LineageRelationship(this.fromNodeId
                , this.toNodeId
                , this.type
                , this.providerType
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageRelationship model) {
                this.fromNodeId(model.getFromNodeId());
    this.toNodeId(model.getToNodeId());
    this.type(model.getType());
    this.providerType(model.getProviderType());
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
     * Object key of source lineage element.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fromNodeId")
    private final String fromNodeId;

        /**
     * Object key of source lineage element.
     * @return the value
     **/
    
    public String getFromNodeId() {
        return fromNodeId;
    }


        /**
     * Object key of target lineage element.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toNodeId")
    private final String toNodeId;

        /**
     * Object key of target lineage element.
     * @return the value
     **/
    
    public String getToNodeId() {
        return toNodeId;
    }


        /**
     * Type of the relationship.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type of the relationship.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Type of the relationship.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("providerType")
    private final String providerType;

        /**
     * Type of the relationship.
     * @return the value
     **/
    
    public String getProviderType() {
        return providerType;
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
        sb.append("LineageRelationship(");
        sb.append("fromNodeId=").append(String.valueOf(this.fromNodeId));
        sb.append(", toNodeId=").append(String.valueOf(this.toNodeId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", providerType=").append(String.valueOf(this.providerType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageRelationship)) {
            return false;
        }

        LineageRelationship other = (LineageRelationship) o;
        return java.util.Objects.equals(this.fromNodeId, other.fromNodeId) &&
            java.util.Objects.equals(this.toNodeId, other.toNodeId) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.providerType, other.providerType) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fromNodeId == null ? 43 : this.fromNodeId.hashCode());
        result = (result * PRIME) + (this.toNodeId == null ? 43 : this.toNodeId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.providerType == null ? 43 : this.providerType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
