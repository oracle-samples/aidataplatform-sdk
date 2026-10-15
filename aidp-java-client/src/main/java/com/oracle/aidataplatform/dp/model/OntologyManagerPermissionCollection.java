// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Direct permission grants on an Ontology Manager scope.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyManagerPermissionCollection.Builder.class)

public final class OntologyManagerPermissionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissions", "d"})
    public OntologyManagerPermissionCollection(OntologyManagerReadPermissions permissions, java.util.Map<String, String> d) {
        super();
        this.permissions = permissions;
        this.d = d;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private OntologyManagerReadPermissions permissions;



public Builder permissions(OntologyManagerReadPermissions permissions) {
    this.permissions = permissions;
    return this;
}
            /**
     * One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("d")
private java.util.Map<String, String> d;

        /**
         * One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.
         * @param d the value to set
         * @return this builder
         **/
        

public Builder d(java.util.Map<String, String> d) {
    this.d = d;
    return this;
}


        public OntologyManagerPermissionCollection build() {
            OntologyManagerPermissionCollection model = new OntologyManagerPermissionCollection(this.permissions
                , this.d);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyManagerPermissionCollection model) {
                this.permissions(model.getPermissions());
    this.d(model.getD());
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
    private final OntologyManagerReadPermissions permissions;

    
    public OntologyManagerReadPermissions getPermissions() {
        return permissions;
    }


        /**
     * One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("d")
    private final java.util.Map<String, String> d;

        /**
     * One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.
     * @return the value
     **/
    
    public java.util.Map<String, String> getD() {
        return d;
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
        sb.append("OntologyManagerPermissionCollection(");
        sb.append("permissions=").append(String.valueOf(this.permissions));
        sb.append(", d=").append(String.valueOf(this.d));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyManagerPermissionCollection)) {
            return false;
        }

        OntologyManagerPermissionCollection other = (OntologyManagerPermissionCollection) o;
        return java.util.Objects.equals(this.permissions, other.permissions) &&
            java.util.Objects.equals(this.d, other.d);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        result = (result * PRIME) + (this.d == null ? 43 : this.d.hashCode());
        return result;
    }


}
