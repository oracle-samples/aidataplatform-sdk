// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a direct child item returned from an Oracle Analytics catalog browse request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacChildItemSummary.Builder.class)

public final class OacChildItemSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "parentId", "name", "path", "owner", "type", "timeLastModified"})
    public OacChildItemSummary(String id, String parentId, String name, String path, String owner, String type, java.util.Date timeLastModified) {
        super();
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.path = path;
        this.owner = owner;
        this.type = type;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The item identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * The item identifier.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * The parent folder identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentId")
private String parentId;

        /**
         * The parent folder identifier.
         * @param parentId the value to set
         * @return this builder
         **/
        

public Builder parentId(String parentId) {
    this.parentId = parentId;
    return this;
}
            /**
     * The item display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * The item display name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The Oracle Analytics catalog path for the item.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The Oracle Analytics catalog path for the item.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * The item owner.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("owner")
private String owner;

        /**
         * The item owner.
         * @param owner the value to set
         * @return this builder
         **/
        

public Builder owner(String owner) {
    this.owner = owner;
    return this;
}
            /**
     * The Oracle Analytics object type returned by the connector.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * The Oracle Analytics object type returned by the connector.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * The last modified time reported by Oracle Analytics for the item.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
private java.util.Date timeLastModified;

        /**
         * The last modified time reported by Oracle Analytics for the item.
         * @param timeLastModified the value to set
         * @return this builder
         **/
        

public Builder timeLastModified(java.util.Date timeLastModified) {
    this.timeLastModified = timeLastModified;
    return this;
}


        public OacChildItemSummary build() {
            OacChildItemSummary model = new OacChildItemSummary(this.id
                , this.parentId
                , this.name
                , this.path
                , this.owner
                , this.type
                , this.timeLastModified);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacChildItemSummary model) {
                this.id(model.getId());
    this.parentId(model.getParentId());
    this.name(model.getName());
    this.path(model.getPath());
    this.owner(model.getOwner());
    this.type(model.getType());
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
     * The item identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * The item identifier.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * The parent folder identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

        /**
     * The parent folder identifier.
     * @return the value
     **/
    
    public String getParentId() {
        return parentId;
    }


        /**
     * The item display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The item display name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The Oracle Analytics catalog path for the item.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The Oracle Analytics catalog path for the item.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The item owner.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

        /**
     * The item owner.
     * @return the value
     **/
    
    public String getOwner() {
        return owner;
    }


        /**
     * The Oracle Analytics object type returned by the connector.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * The Oracle Analytics object type returned by the connector.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * The last modified time reported by Oracle Analytics for the item.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

        /**
     * The last modified time reported by Oracle Analytics for the item.
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
        sb.append("OacChildItemSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacChildItemSummary)) {
            return false;
        }

        OacChildItemSummary other = (OacChildItemSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.parentId, other.parentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.owner, other.owner) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.timeLastModified, other.timeLastModified);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        return result;
    }


}
