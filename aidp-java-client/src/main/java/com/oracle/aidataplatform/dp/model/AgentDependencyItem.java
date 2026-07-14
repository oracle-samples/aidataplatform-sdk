// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Agent dependency items.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentDependencyItem.Builder.class)

public final class AgentDependencyItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "key", "location"})
    public AgentDependencyItem(String type, String key, String location) {
        super();
        this.type = type;
        this.key = key;
        this.location = location;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * AICompute or file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * AICompute or file.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * AICompute key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * AICompute key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Location of file/folders.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("location")
private String location;

        /**
         * Location of file/folders.
         * @param location the value to set
         * @return this builder
         **/
        

public Builder location(String location) {
    this.location = location;
    return this;
}


        public AgentDependencyItem build() {
            AgentDependencyItem model = new AgentDependencyItem(this.type
                , this.key
                , this.location);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentDependencyItem model) {
                this.type(model.getType());
    this.key(model.getKey());
    this.location(model.getLocation());
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
     * AICompute or file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * AICompute or file.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * AICompute key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * AICompute key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Location of file/folders.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

        /**
     * Location of file/folders.
     * @return the value
     **/
    
    public String getLocation() {
        return location;
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
        sb.append("AgentDependencyItem(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentDependencyItem)) {
            return false;
        }

        AgentDependencyItem other = (AgentDependencyItem) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.location, other.location);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        return result;
    }


}
