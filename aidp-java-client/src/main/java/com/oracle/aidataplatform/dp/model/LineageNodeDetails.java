// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lineage for a data entity.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageNodeDetails.Builder.class)

public final class LineageNodeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "qualifiedName", "referenceType", "name", "type", "parentId", "properties"})
    public LineageNodeDetails(String id, String qualifiedName, ReferenceType referenceType, String name, String type, String parentId, java.util.Map<String, Object> properties) {
        super();
        this.id = id;
        this.qualifiedName = qualifiedName;
        this.referenceType = referenceType;
        this.name = name;
        this.type = type;
        this.parentId = parentId;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier (GUID) of the node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Unique identifier (GUID) of the node.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Fully\u2011qualified name ({@code namespace:name}) of the node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
private String qualifiedName;

        /**
         * Fully\u2011qualified name ({@code namespace:name}) of the node.
         * @param qualifiedName the value to set
         * @return this builder
         **/
        

public Builder qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
}
            /**
     * referenceType of the node
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("referenceType")
private ReferenceType referenceType;

        /**
         * referenceType of the node
         * @param referenceType the value to set
         * @return this builder
         **/
        

public Builder referenceType(ReferenceType referenceType) {
    this.referenceType = referenceType;
    return this;
}
            /**
     * Human\u2011readable name of the node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Human\u2011readable name of the node.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Parent of the node
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentId")
private String parentId;

        /**
         * Parent of the node
         * @param parentId the value to set
         * @return this builder
         **/
        

public Builder parentId(String parentId) {
    this.parentId = parentId;
    return this;
}
            /**
     * A generic property bag associated with the Node
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, Object> properties;

        /**
         * A generic property bag associated with the Node
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, Object> properties) {
    this.properties = properties;
    return this;
}


        public LineageNodeDetails build() {
            LineageNodeDetails model = new LineageNodeDetails(this.id
                , this.qualifiedName
                , this.referenceType
                , this.name
                , this.type
                , this.parentId
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageNodeDetails model) {
                this.id(model.getId());
    this.qualifiedName(model.getQualifiedName());
    this.referenceType(model.getReferenceType());
    this.name(model.getName());
    this.type(model.getType());
    this.parentId(model.getParentId());
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
     * Unique identifier (GUID) of the node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Unique identifier (GUID) of the node.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Fully\u2011qualified name ({@code namespace:name}) of the node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
    private final String qualifiedName;

        /**
     * Fully\u2011qualified name ({@code namespace:name}) of the node.
     * @return the value
     **/
    
    public String getQualifiedName() {
        return qualifiedName;
    }

    
        /**
     * referenceType of the node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("referenceType")
    private final ReferenceType referenceType;

        /**
     * referenceType of the node
     * @return the value
     **/
    
    public ReferenceType getReferenceType() {
        return referenceType;
    }


        /**
     * Human\u2011readable name of the node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Human\u2011readable name of the node.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Parent of the node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

        /**
     * Parent of the node
     * @return the value
     **/
    
    public String getParentId() {
        return parentId;
    }


        /**
     * A generic property bag associated with the Node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * A generic property bag associated with the Node
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
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
        sb.append("LineageNodeDetails(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", qualifiedName=").append(String.valueOf(this.qualifiedName));
        sb.append(", referenceType=").append(String.valueOf(this.referenceType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageNodeDetails)) {
            return false;
        }

        LineageNodeDetails other = (LineageNodeDetails) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.qualifiedName, other.qualifiedName) &&
            java.util.Objects.equals(this.referenceType, other.referenceType) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.parentId, other.parentId) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.qualifiedName == null ? 43 : this.qualifiedName.hashCode());
        result = (result * PRIME) + (this.referenceType == null ? 43 : this.referenceType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
