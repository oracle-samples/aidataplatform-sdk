// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lazy-loaded ontology tree node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphTreeSearchNode.Builder.class)

public final class OntologyGraphTreeSearchNode  {
    @Deprecated
    @java.beans.ConstructorProperties({"uid", "parentUid", "type", "name", "displayName", "hasChildren", "contextPath"})
    public OntologyGraphTreeSearchNode(String uid, String parentUid, String type, String name, String displayName, Boolean hasChildren, java.util.List<OntologyGraphTreeContextPathItem> contextPath) {
        super();
        this.uid = uid;
        this.parentUid = parentUid;
        this.type = type;
        this.name = name;
        this.displayName = displayName;
        this.hasChildren = hasChildren;
        this.contextPath = contextPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Stable unique identifier used as parentUid on expansion requests.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uid")
private String uid;

        /**
         * Stable unique identifier used as parentUid on expansion requests.
         * @param uid the value to set
         * @return this builder
         **/
        

public Builder uid(String uid) {
    this.uid = uid;
    return this;
}
            /**
     * Parent node UID, or null for root ontology nodes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentUid")
private String parentUid;

        /**
         * Parent node UID, or null for root ontology nodes.
         * @param parentUid the value to set
         * @return this builder
         **/
        

public Builder parentUid(String parentUid) {
    this.parentUid = parentUid;
    return this;
}
            /**
     * Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;



public Builder name(String name) {
    this.name = name;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;



public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("hasChildren")
private Boolean hasChildren;



public Builder hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
}
            /**
     * Root-to-item context path for this tree node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("contextPath")
private java.util.List<OntologyGraphTreeContextPathItem> contextPath;

        /**
         * Root-to-item context path for this tree node.
         * @param contextPath the value to set
         * @return this builder
         **/
        

public Builder contextPath(java.util.List<OntologyGraphTreeContextPathItem> contextPath) {
    this.contextPath = contextPath;
    return this;
}


        public OntologyGraphTreeSearchNode build() {
            OntologyGraphTreeSearchNode model = new OntologyGraphTreeSearchNode(this.uid
                , this.parentUid
                , this.type
                , this.name
                , this.displayName
                , this.hasChildren
                , this.contextPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphTreeSearchNode model) {
                this.uid(model.getUid());
    this.parentUid(model.getParentUid());
    this.type(model.getType());
    this.name(model.getName());
    this.displayName(model.getDisplayName());
    this.hasChildren(model.getHasChildren());
    this.contextPath(model.getContextPath());
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
     * Stable unique identifier used as parentUid on expansion requests.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    private final String uid;

        /**
     * Stable unique identifier used as parentUid on expansion requests.
     * @return the value
     **/
    
    public String getUid() {
        return uid;
    }


        /**
     * Parent node UID, or null for root ontology nodes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentUid")
    private final String parentUid;

        /**
     * Parent node UID, or null for root ontology nodes.
     * @return the value
     **/
    
    public String getParentUid() {
        return parentUid;
    }


        /**
     * Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Node type. Supported values include ontology, class, subclass, relationship, property, constraint, and annotation.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    
    public String getName() {
        return name;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    
    public String getDisplayName() {
        return displayName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("hasChildren")
    private final Boolean hasChildren;

    
    public Boolean getHasChildren() {
        return hasChildren;
    }


        /**
     * Root-to-item context path for this tree node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("contextPath")
    private final java.util.List<OntologyGraphTreeContextPathItem> contextPath;

        /**
     * Root-to-item context path for this tree node.
     * @return the value
     **/
    
    public java.util.List<OntologyGraphTreeContextPathItem> getContextPath() {
        return contextPath;
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
        sb.append("OntologyGraphTreeSearchNode(");
        sb.append("uid=").append(String.valueOf(this.uid));
        sb.append(", parentUid=").append(String.valueOf(this.parentUid));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", hasChildren=").append(String.valueOf(this.hasChildren));
        sb.append(", contextPath=").append(String.valueOf(this.contextPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphTreeSearchNode)) {
            return false;
        }

        OntologyGraphTreeSearchNode other = (OntologyGraphTreeSearchNode) o;
        return java.util.Objects.equals(this.uid, other.uid) &&
            java.util.Objects.equals(this.parentUid, other.parentUid) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.hasChildren, other.hasChildren) &&
            java.util.Objects.equals(this.contextPath, other.contextPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uid == null ? 43 : this.uid.hashCode());
        result = (result * PRIME) + (this.parentUid == null ? 43 : this.parentUid.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.hasChildren == null ? 43 : this.hasChildren.hashCode());
        result = (result * PRIME) + (this.contextPath == null ? 43 : this.contextPath.hashCode());
        return result;
    }


}
