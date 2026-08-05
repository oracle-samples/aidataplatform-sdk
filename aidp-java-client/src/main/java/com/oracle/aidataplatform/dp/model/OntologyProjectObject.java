// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Folder or file under an ontology project root.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectObject.Builder.class)

public final class OntologyProjectObject  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "name", "objectType", "contentType", "sizeInBytes", "timeUpdated"})
    public OntologyProjectObject(String path, String name, String objectType, String contentType, Long sizeInBytes, java.util.Date timeUpdated) {
        super();
        this.path = path;
        this.name = name;
        this.objectType = objectType;
        this.contentType = contentType;
        this.sizeInBytes = sizeInBytes;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Project-relative folder or file path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Project-relative folder or file path.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;



public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * FOLDER or FILE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("objectType")
private String objectType;

        /**
         * FOLDER or FILE.
         * @param objectType the value to set
         * @return this builder
         **/
        

public Builder objectType(String objectType) {
    this.objectType = objectType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("contentType")
private String contentType;



public Builder contentType(String contentType) {
    this.contentType = contentType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
private Long sizeInBytes;



public Builder sizeInBytes(Long sizeInBytes) {
    this.sizeInBytes = sizeInBytes;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;



public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}


        public OntologyProjectObject build() {
            OntologyProjectObject model = new OntologyProjectObject(this.path
                , this.name
                , this.objectType
                , this.contentType
                , this.sizeInBytes
                , this.timeUpdated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectObject model) {
                this.path(model.getPath());
    this.name(model.getName());
    this.objectType(model.getObjectType());
    this.contentType(model.getContentType());
    this.sizeInBytes(model.getSizeInBytes());
    this.timeUpdated(model.getTimeUpdated());
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
     * Project-relative folder or file path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Project-relative folder or file path.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    
    public String getName() {
        return name;
    }


        /**
     * FOLDER or FILE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

        /**
     * FOLDER or FILE.
     * @return the value
     **/
    
    public String getObjectType() {
        return objectType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    
    public String getContentType() {
        return contentType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    
    public Long getSizeInBytes() {
        return sizeInBytes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("OntologyProjectObject(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectObject)) {
            return false;
        }

        OntologyProjectObject other = (OntologyProjectObject) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.objectType, other.objectType) &&
            java.util.Objects.equals(this.contentType, other.contentType) &&
            java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        return result;
    }


}
