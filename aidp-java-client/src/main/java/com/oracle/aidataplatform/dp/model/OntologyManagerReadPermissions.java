// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Normalized permission map returned by Ontology Manager permission GET operations.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyManagerReadPermissions.Builder.class)

public final class OntologyManagerReadPermissions  {
    @Deprecated
    @java.beans.ConstructorProperties({"r", "u", "m", "a"})
    public OntologyManagerReadPermissions(java.util.List<OntologyManagerPermissionGrant> r, java.util.List<OntologyManagerPermissionGrant> u, java.util.List<OntologyManagerPermissionGrant> m, java.util.List<OntologyManagerPermissionGrant> a) {
        super();
        this.r = r;
        this.u = u;
        this.m = m;
        this.a = a;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Normalized principals with direct read access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("r")
private java.util.List<OntologyManagerPermissionGrant> r;

        /**
         * Normalized principals with direct read access.
         * @param r the value to set
         * @return this builder
         **/
        

public Builder r(java.util.List<OntologyManagerPermissionGrant> r) {
    this.r = r;
    return this;
}
            /**
     * Normalized principals with direct use or execute access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("u")
private java.util.List<OntologyManagerPermissionGrant> u;

        /**
         * Normalized principals with direct use or execute access.
         * @param u the value to set
         * @return this builder
         **/
        

public Builder u(java.util.List<OntologyManagerPermissionGrant> u) {
    this.u = u;
    return this;
}
            /**
     * Normalized principals with direct manage access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("m")
private java.util.List<OntologyManagerPermissionGrant> m;

        /**
         * Normalized principals with direct manage access.
         * @param m the value to set
         * @return this builder
         **/
        

public Builder m(java.util.List<OntologyManagerPermissionGrant> m) {
    this.m = m;
    return this;
}
            /**
     * Normalized principals with direct admin access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("a")
private java.util.List<OntologyManagerPermissionGrant> a;

        /**
         * Normalized principals with direct admin access.
         * @param a the value to set
         * @return this builder
         **/
        

public Builder a(java.util.List<OntologyManagerPermissionGrant> a) {
    this.a = a;
    return this;
}


        public OntologyManagerReadPermissions build() {
            OntologyManagerReadPermissions model = new OntologyManagerReadPermissions(this.r
                , this.u
                , this.m
                , this.a);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyManagerReadPermissions model) {
                this.r(model.getR());
    this.u(model.getU());
    this.m(model.getM());
    this.a(model.getA());
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
     * Normalized principals with direct read access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("r")
    private final java.util.List<OntologyManagerPermissionGrant> r;

        /**
     * Normalized principals with direct read access.
     * @return the value
     **/
    
    public java.util.List<OntologyManagerPermissionGrant> getR() {
        return r;
    }


        /**
     * Normalized principals with direct use or execute access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("u")
    private final java.util.List<OntologyManagerPermissionGrant> u;

        /**
     * Normalized principals with direct use or execute access.
     * @return the value
     **/
    
    public java.util.List<OntologyManagerPermissionGrant> getU() {
        return u;
    }


        /**
     * Normalized principals with direct manage access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("m")
    private final java.util.List<OntologyManagerPermissionGrant> m;

        /**
     * Normalized principals with direct manage access.
     * @return the value
     **/
    
    public java.util.List<OntologyManagerPermissionGrant> getM() {
        return m;
    }


        /**
     * Normalized principals with direct admin access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("a")
    private final java.util.List<OntologyManagerPermissionGrant> a;

        /**
     * Normalized principals with direct admin access.
     * @return the value
     **/
    
    public java.util.List<OntologyManagerPermissionGrant> getA() {
        return a;
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
        sb.append("OntologyManagerReadPermissions(");
        sb.append("r=").append(String.valueOf(this.r));
        sb.append(", u=").append(String.valueOf(this.u));
        sb.append(", m=").append(String.valueOf(this.m));
        sb.append(", a=").append(String.valueOf(this.a));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyManagerReadPermissions)) {
            return false;
        }

        OntologyManagerReadPermissions other = (OntologyManagerReadPermissions) o;
        return java.util.Objects.equals(this.r, other.r) &&
            java.util.Objects.equals(this.u, other.u) &&
            java.util.Objects.equals(this.m, other.m) &&
            java.util.Objects.equals(this.a, other.a);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.r == null ? 43 : this.r.hashCode());
        result = (result * PRIME) + (this.u == null ? 43 : this.u.hashCode());
        result = (result * PRIME) + (this.m == null ? 43 : this.m.hashCode());
        result = (result * PRIME) + (this.a == null ? 43 : this.a.hashCode());
        return result;
    }


}
