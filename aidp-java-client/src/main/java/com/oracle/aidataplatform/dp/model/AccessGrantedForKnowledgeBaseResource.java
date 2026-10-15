// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy KnowledgeBase resource.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForKnowledgeBaseResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="resourceType")

public final class AccessGrantedForKnowledgeBaseResource extends AccessGrantedForResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
private AccessGrantedForKnowledgeBaseDetails resourceDetails;



public Builder resourceDetails(AccessGrantedForKnowledgeBaseDetails resourceDetails) {
    this.resourceDetails = resourceDetails;
    return this;
}


        public AccessGrantedForKnowledgeBaseResource build() {
            AccessGrantedForKnowledgeBaseResource model = new AccessGrantedForKnowledgeBaseResource(this.resourceDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForKnowledgeBaseResource model) {
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
    public AccessGrantedForKnowledgeBaseResource(AccessGrantedForKnowledgeBaseDetails resourceDetails) {
    super();
        this.resourceDetails = resourceDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
    private final AccessGrantedForKnowledgeBaseDetails resourceDetails;

    
    public AccessGrantedForKnowledgeBaseDetails getResourceDetails() {
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
        sb.append("AccessGrantedForKnowledgeBaseResource(");
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
        if (!(o instanceof AccessGrantedForKnowledgeBaseResource)) {
            return false;
        }

        AccessGrantedForKnowledgeBaseResource other = (AccessGrantedForKnowledgeBaseResource) o;
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
