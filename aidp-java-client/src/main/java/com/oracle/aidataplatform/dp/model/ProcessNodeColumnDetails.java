// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Structured details for a column participating in a process-node column link.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ProcessNodeColumnDetails.Builder.class)

public final class ProcessNodeColumnDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "id", "qualifiedName", "type", "parentDisplayName", "parentId", "parentQualifiedName", "parentType"})
    public ProcessNodeColumnDetails(String displayName, String id, String qualifiedName, String type, String parentDisplayName, String parentId, String parentQualifiedName, String parentType) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.qualifiedName = qualifiedName;
        this.type = type;
        this.parentDisplayName = parentDisplayName;
        this.parentId = parentId;
        this.parentQualifiedName = parentQualifiedName;
        this.parentType = parentType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Display name of the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Display name of the column.
* 
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Unique identifier of the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Unique identifier of the column.
* 
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Qualified name of the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
private String qualifiedName;

        /**
         * Qualified name of the column.
* 
         * @param qualifiedName the value to set
         * @return this builder
         **/
        

public Builder qualifiedName(String qualifiedName) {
    this.qualifiedName = qualifiedName;
    return this;
}
            /**
     * Type of the column node.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Type of the column node.
* 
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Display name of the parent artifact containing the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentDisplayName")
private String parentDisplayName;

        /**
         * Display name of the parent artifact containing the column.
* 
         * @param parentDisplayName the value to set
         * @return this builder
         **/
        

public Builder parentDisplayName(String parentDisplayName) {
    this.parentDisplayName = parentDisplayName;
    return this;
}
            /**
     * Unique identifier of the parent artifact containing the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentId")
private String parentId;

        /**
         * Unique identifier of the parent artifact containing the column.
* 
         * @param parentId the value to set
         * @return this builder
         **/
        

public Builder parentId(String parentId) {
    this.parentId = parentId;
    return this;
}
            /**
     * Qualified name of the parent artifact containing the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentQualifiedName")
private String parentQualifiedName;

        /**
         * Qualified name of the parent artifact containing the column.
* 
         * @param parentQualifiedName the value to set
         * @return this builder
         **/
        

public Builder parentQualifiedName(String parentQualifiedName) {
    this.parentQualifiedName = parentQualifiedName;
    return this;
}
            /**
     * Type of the parent artifact containing the column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentType")
private String parentType;

        /**
         * Type of the parent artifact containing the column.
* 
         * @param parentType the value to set
         * @return this builder
         **/
        

public Builder parentType(String parentType) {
    this.parentType = parentType;
    return this;
}


        public ProcessNodeColumnDetails build() {
            ProcessNodeColumnDetails model = new ProcessNodeColumnDetails(this.displayName
                , this.id
                , this.qualifiedName
                , this.type
                , this.parentDisplayName
                , this.parentId
                , this.parentQualifiedName
                , this.parentType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessNodeColumnDetails model) {
                this.displayName(model.getDisplayName());
    this.id(model.getId());
    this.qualifiedName(model.getQualifiedName());
    this.type(model.getType());
    this.parentDisplayName(model.getParentDisplayName());
    this.parentId(model.getParentId());
    this.parentQualifiedName(model.getParentQualifiedName());
    this.parentType(model.getParentType());
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
     * Display name of the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name of the column.
* 
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Unique identifier of the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Unique identifier of the column.
* 
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Qualified name of the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("qualifiedName")
    private final String qualifiedName;

        /**
     * Qualified name of the column.
* 
     * @return the value
     **/
    
    public String getQualifiedName() {
        return qualifiedName;
    }


        /**
     * Type of the column node.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type of the column node.
* 
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Display name of the parent artifact containing the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentDisplayName")
    private final String parentDisplayName;

        /**
     * Display name of the parent artifact containing the column.
* 
     * @return the value
     **/
    
    public String getParentDisplayName() {
        return parentDisplayName;
    }


        /**
     * Unique identifier of the parent artifact containing the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

        /**
     * Unique identifier of the parent artifact containing the column.
* 
     * @return the value
     **/
    
    public String getParentId() {
        return parentId;
    }


        /**
     * Qualified name of the parent artifact containing the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentQualifiedName")
    private final String parentQualifiedName;

        /**
     * Qualified name of the parent artifact containing the column.
* 
     * @return the value
     **/
    
    public String getParentQualifiedName() {
        return parentQualifiedName;
    }


        /**
     * Type of the parent artifact containing the column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentType")
    private final String parentType;

        /**
     * Type of the parent artifact containing the column.
* 
     * @return the value
     **/
    
    public String getParentType() {
        return parentType;
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
        sb.append("ProcessNodeColumnDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", qualifiedName=").append(String.valueOf(this.qualifiedName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentDisplayName=").append(String.valueOf(this.parentDisplayName));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", parentQualifiedName=").append(String.valueOf(this.parentQualifiedName));
        sb.append(", parentType=").append(String.valueOf(this.parentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessNodeColumnDetails)) {
            return false;
        }

        ProcessNodeColumnDetails other = (ProcessNodeColumnDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.qualifiedName, other.qualifiedName) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.parentDisplayName, other.parentDisplayName) &&
            java.util.Objects.equals(this.parentId, other.parentId) &&
            java.util.Objects.equals(this.parentQualifiedName, other.parentQualifiedName) &&
            java.util.Objects.equals(this.parentType, other.parentType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.qualifiedName == null ? 43 : this.qualifiedName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.parentDisplayName == null ? 43 : this.parentDisplayName.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.parentQualifiedName == null ? 43 : this.parentQualifiedName.hashCode());
        result = (result * PRIME) + (this.parentType == null ? 43 : this.parentType.hashCode());
        return result;
    }


}
