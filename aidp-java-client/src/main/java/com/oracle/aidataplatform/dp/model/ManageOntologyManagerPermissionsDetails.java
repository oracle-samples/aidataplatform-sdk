// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for replacing direct Ontology Manager permissions on a scope.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageOntologyManagerPermissionsDetails.Builder.class)

public final class ManageOntologyManagerPermissionsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissions"})
    public ManageOntologyManagerPermissionsDetails(OntologyManagerPermissions permissions) {
        super();
        this.permissions = permissions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private OntologyManagerPermissions permissions;



public Builder permissions(OntologyManagerPermissions permissions) {
    this.permissions = permissions;
    return this;
}


        public ManageOntologyManagerPermissionsDetails build() {
            ManageOntologyManagerPermissionsDetails model = new ManageOntologyManagerPermissionsDetails(this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageOntologyManagerPermissionsDetails model) {
                this.permissions(model.getPermissions());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final OntologyManagerPermissions permissions;

    
    public OntologyManagerPermissions getPermissions() {
        return permissions;
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
        sb.append("ManageOntologyManagerPermissionsDetails(");
        sb.append("permissions=").append(String.valueOf(this.permissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageOntologyManagerPermissionsDetails)) {
            return false;
        }

        ManageOntologyManagerPermissionsDetails other = (ManageOntologyManagerPermissionsDetails) o;
        return java.util.Objects.equals(this.permissions, other.permissions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        return result;
    }


}
