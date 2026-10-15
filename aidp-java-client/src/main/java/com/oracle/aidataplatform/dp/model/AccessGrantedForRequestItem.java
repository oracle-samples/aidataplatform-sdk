// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One resource and requested access type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForRequestItem.Builder.class)

public final class AccessGrantedForRequestItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"resource", "accessType"})
    public AccessGrantedForRequestItem(AccessGrantedForResource resource, String accessType) {
        super();
        this.resource = resource;
        this.accessType = accessType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("resource")
private AccessGrantedForResource resource;



public Builder resource(AccessGrantedForResource resource) {
    this.resource = resource;
    return this;
}
            /**
     * Lakeproxy access type for the selected resource.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("accessType")
private String accessType;

        /**
         * Lakeproxy access type for the selected resource.
         * @param accessType the value to set
         * @return this builder
         **/
        

public Builder accessType(String accessType) {
    this.accessType = accessType;
    return this;
}


        public AccessGrantedForRequestItem build() {
            AccessGrantedForRequestItem model = new AccessGrantedForRequestItem(this.resource
                , this.accessType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForRequestItem model) {
                this.resource(model.getResource());
    this.accessType(model.getAccessType());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final AccessGrantedForResource resource;

    
    public AccessGrantedForResource getResource() {
        return resource;
    }


        /**
     * Lakeproxy access type for the selected resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    private final String accessType;

        /**
     * Lakeproxy access type for the selected resource.
     * @return the value
     **/
    
    public String getAccessType() {
        return accessType;
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
        sb.append("AccessGrantedForRequestItem(");
        sb.append("resource=").append(String.valueOf(this.resource));
        sb.append(", accessType=").append(String.valueOf(this.accessType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForRequestItem)) {
            return false;
        }

        AccessGrantedForRequestItem other = (AccessGrantedForRequestItem) o;
        return java.util.Objects.equals(this.resource, other.resource) &&
            java.util.Objects.equals(this.accessType, other.accessType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result = (result * PRIME) + (this.accessType == null ? 43 : this.accessType.hashCode());
        return result;
    }


}
