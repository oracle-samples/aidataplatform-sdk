// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for replacing direct Ontology Manager project permissions.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageOntologyProjectPermissionsDetails.Builder.class)

public final class ManageOntologyProjectPermissionsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissions"})
    public ManageOntologyProjectPermissionsDetails(OntologyManagerPermissions permissions) {
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


        public ManageOntologyProjectPermissionsDetails build() {
            ManageOntologyProjectPermissionsDetails model = new ManageOntologyProjectPermissionsDetails(this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageOntologyProjectPermissionsDetails model) {
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
        sb.append("ManageOntologyProjectPermissionsDetails(");
        sb.append("permissions=").append(String.valueOf(this.permissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageOntologyProjectPermissionsDetails)) {
            return false;
        }

        ManageOntologyProjectPermissionsDetails other = (ManageOntologyProjectPermissionsDetails) o;
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
