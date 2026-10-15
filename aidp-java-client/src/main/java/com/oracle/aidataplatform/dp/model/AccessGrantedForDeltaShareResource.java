// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy DeltaShare resource.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForDeltaShareResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="resourceType")

public final class AccessGrantedForDeltaShareResource extends AccessGrantedForResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
private AccessGrantedForDeltaShareDetails resourceDetails;



public Builder resourceDetails(AccessGrantedForDeltaShareDetails resourceDetails) {
    this.resourceDetails = resourceDetails;
    return this;
}


        public AccessGrantedForDeltaShareResource build() {
            AccessGrantedForDeltaShareResource model = new AccessGrantedForDeltaShareResource(this.resourceDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForDeltaShareResource model) {
                this.resourceDetails(model.getResourceDetails());
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

    
    @Deprecated
    public AccessGrantedForDeltaShareResource(AccessGrantedForDeltaShareDetails resourceDetails) {
    super();
        this.resourceDetails = resourceDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
    private final AccessGrantedForDeltaShareDetails resourceDetails;

    
    public AccessGrantedForDeltaShareDetails getResourceDetails() {
        return resourceDetails;
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
        sb.append("AccessGrantedForDeltaShareResource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceDetails=").append(String.valueOf(this.resourceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForDeltaShareResource)) {
            return false;
        }

        AccessGrantedForDeltaShareResource other = (AccessGrantedForDeltaShareResource) o;
        return java.util.Objects.equals(this.resourceDetails, other.resourceDetails) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceDetails == null ? 43 : this.resourceDetails.hashCode());
        return result;
    }


}
