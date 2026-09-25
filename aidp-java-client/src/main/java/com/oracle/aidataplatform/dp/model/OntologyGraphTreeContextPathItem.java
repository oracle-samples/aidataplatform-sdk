// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Compact ontology tree path item.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphTreeContextPathItem.Builder.class)

public final class OntologyGraphTreeContextPathItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"uid", "type", "displayName"})
    public OntologyGraphTreeContextPathItem(String uid, String type, String displayName) {
        super();
        this.uid = uid;
        this.type = type;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Stable unique identifier for the path item.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uid")
private String uid;

        /**
         * Stable unique identifier for the path item.
         * @param uid the value to set
         * @return this builder
         **/
        

public Builder uid(String uid) {
    this.uid = uid;
    return this;
}
            /**
     * Node type for the path item.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Node type for the path item.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;



public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}


        public OntologyGraphTreeContextPathItem build() {
            OntologyGraphTreeContextPathItem model = new OntologyGraphTreeContextPathItem(this.uid
                , this.type
                , this.displayName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphTreeContextPathItem model) {
                this.uid(model.getUid());
    this.type(model.getType());
    this.displayName(model.getDisplayName());
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
     * Stable unique identifier for the path item.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    private final String uid;

        /**
     * Stable unique identifier for the path item.
     * @return the value
     **/
    
    public String getUid() {
        return uid;
    }


        /**
     * Node type for the path item.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Node type for the path item.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    
    public String getDisplayName() {
        return displayName;
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
        sb.append("OntologyGraphTreeContextPathItem(");
        sb.append("uid=").append(String.valueOf(this.uid));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphTreeContextPathItem)) {
            return false;
        }

        OntologyGraphTreeContextPathItem other = (OntologyGraphTreeContextPathItem) o;
        return java.util.Objects.equals(this.uid, other.uid) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uid == null ? 43 : this.uid.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }


}
