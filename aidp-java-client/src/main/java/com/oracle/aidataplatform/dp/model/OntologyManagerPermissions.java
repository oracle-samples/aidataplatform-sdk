// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Compact Ontology Manager permission buckets. Principal identifiers are prefixed u: for a user, g: for a group and r: for a role.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyManagerPermissions.Builder.class)

public final class OntologyManagerPermissions  {
    @Deprecated
    @java.beans.ConstructorProperties({"r", "u", "m", "a"})
    public OntologyManagerPermissions(java.util.List<String> r, java.util.List<String> u, java.util.List<String> m, java.util.List<String> a) {
        super();
        this.r = r;
        this.u = u;
        this.m = m;
        this.a = a;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Principals with read access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("r")
private java.util.List<String> r;

        /**
         * Principals with read access.
         * @param r the value to set
         * @return this builder
         **/
        

public Builder r(java.util.List<String> r) {
    this.r = r;
    return this;
}
            /**
     * Principals with use or execute access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("u")
private java.util.List<String> u;

        /**
         * Principals with use or execute access.
         * @param u the value to set
         * @return this builder
         **/
        

public Builder u(java.util.List<String> u) {
    this.u = u;
    return this;
}
            /**
     * Principals with manage access.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("m")
private java.util.List<String> m;

        /**
         * Principals with manage access.
         * @param m the value to set
         * @return this builder
         **/
        

public Builder m(java.util.List<String> m) {
    this.m = m;
    return this;
}
            /**
     * Principals with admin access, including permission management.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("a")
private java.util.List<String> a;

        /**
         * Principals with admin access, including permission management.
         * @param a the value to set
         * @return this builder
         **/
        

public Builder a(java.util.List<String> a) {
    this.a = a;
    return this;
}


        public OntologyManagerPermissions build() {
            OntologyManagerPermissions model = new OntologyManagerPermissions(this.r
                , this.u
                , this.m
                , this.a);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyManagerPermissions model) {
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
     * Principals with read access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("r")
    private final java.util.List<String> r;

        /**
     * Principals with read access.
     * @return the value
     **/
    
    public java.util.List<String> getR() {
        return r;
    }


        /**
     * Principals with use or execute access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("u")
    private final java.util.List<String> u;

        /**
     * Principals with use or execute access.
     * @return the value
     **/
    
    public java.util.List<String> getU() {
        return u;
    }


        /**
     * Principals with manage access.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("m")
    private final java.util.List<String> m;

        /**
     * Principals with manage access.
     * @return the value
     **/
    
    public java.util.List<String> getM() {
        return m;
    }


        /**
     * Principals with admin access, including permission management.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("a")
    private final java.util.List<String> a;

        /**
     * Principals with admin access, including permission management.
     * @return the value
     **/
    
    public java.util.List<String> getA() {
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
        sb.append("OntologyManagerPermissions(");
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
        if (!(o instanceof OntologyManagerPermissions)) {
            return false;
        }

        OntologyManagerPermissions other = (OntologyManagerPermissions) o;
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
