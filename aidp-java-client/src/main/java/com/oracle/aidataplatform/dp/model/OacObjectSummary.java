// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about an Oracle Analytics object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectSummary.Builder.class)

public final class OacObjectSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "parentId", "name", "description", "path", "owner", "type", "objectId", "timeLastModified"})
    public OacObjectSummary(String id, String parentId, String name, String description, String path, String owner, String type, String objectId, java.util.Date timeLastModified) {
        super();
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.description = description;
        this.path = path;
        this.owner = owner;
        this.type = type;
        this.objectId = objectId;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Oracle Analytics object identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * The Oracle Analytics object identifier.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * The parent folder identifier when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentId")
private String parentId;

        /**
         * The parent folder identifier when available.
         * @param parentId the value to set
         * @return this builder
         **/
        

public Builder parentId(String parentId) {
    this.parentId = parentId;
    return this;
}
            /**
     * The Oracle Analytics object display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * The Oracle Analytics object display name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The Oracle Analytics object description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * The Oracle Analytics object description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The Oracle Analytics catalog path for the object when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The Oracle Analytics catalog path for the object when available.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * The Oracle Analytics object owner when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("owner")
private String owner;

        /**
         * The Oracle Analytics object owner when available.
         * @param owner the value to set
         * @return this builder
         **/
        

public Builder owner(String owner) {
    this.owner = owner;
    return this;
}
            /**
     * The Oracle Analytics object type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * The Oracle Analytics object type.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * The Oracle Analytics object identifier returned for dataset-backed items when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("objectId")
private String objectId;

        /**
         * The Oracle Analytics object identifier returned for dataset-backed items when available.
         * @param objectId the value to set
         * @return this builder
         **/
        

public Builder objectId(String objectId) {
    this.objectId = objectId;
    return this;
}
            /**
     * The last modified time reported by Oracle Analytics for the object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
private java.util.Date timeLastModified;

        /**
         * The last modified time reported by Oracle Analytics for the object.
         * @param timeLastModified the value to set
         * @return this builder
         **/
        

public Builder timeLastModified(java.util.Date timeLastModified) {
    this.timeLastModified = timeLastModified;
    return this;
}


        public OacObjectSummary build() {
            OacObjectSummary model = new OacObjectSummary(this.id
                , this.parentId
                , this.name
                , this.description
                , this.path
                , this.owner
                , this.type
                , this.objectId
                , this.timeLastModified);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectSummary model) {
                this.id(model.getId());
    this.parentId(model.getParentId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.path(model.getPath());
    this.owner(model.getOwner());
    this.type(model.getType());
    this.objectId(model.getObjectId());
    this.timeLastModified(model.getTimeLastModified());
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
     * The Oracle Analytics object identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * The Oracle Analytics object identifier.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * The parent folder identifier when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

        /**
     * The parent folder identifier when available.
     * @return the value
     **/
    
    public String getParentId() {
        return parentId;
    }


        /**
     * The Oracle Analytics object display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The Oracle Analytics object display name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The Oracle Analytics object description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The Oracle Analytics object description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The Oracle Analytics catalog path for the object when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The Oracle Analytics catalog path for the object when available.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The Oracle Analytics object owner when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

        /**
     * The Oracle Analytics object owner when available.
     * @return the value
     **/
    
    public String getOwner() {
        return owner;
    }


        /**
     * The Oracle Analytics object type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * The Oracle Analytics object type.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * The Oracle Analytics object identifier returned for dataset-backed items when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectId")
    private final String objectId;

        /**
     * The Oracle Analytics object identifier returned for dataset-backed items when available.
     * @return the value
     **/
    
    public String getObjectId() {
        return objectId;
    }


        /**
     * The last modified time reported by Oracle Analytics for the object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

        /**
     * The last modified time reported by Oracle Analytics for the object.
     * @return the value
     **/
    
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
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
        sb.append("OacObjectSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", objectId=").append(String.valueOf(this.objectId));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectSummary)) {
            return false;
        }

        OacObjectSummary other = (OacObjectSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.parentId, other.parentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.owner, other.owner) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.objectId, other.objectId) &&
            java.util.Objects.equals(this.timeLastModified, other.timeLastModified);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.objectId == null ? 43 : this.objectId.hashCode());
        result = (result * PRIME) + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        return result;
    }


}
