// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A normalized permission grantee. Exactly one of u, g, or r identifies the user, group, or role without the compact prefix; the other principal keys are omitted rather than returned with null values. d indexes the collection-level display-name map.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyManagerPermissionGrant.Builder.class)

public final class OntologyManagerPermissionGrant  {
    @Deprecated
    @java.beans.ConstructorProperties({"u", "g", "r", "d"})
    public OntologyManagerPermissionGrant(String u, String g, String r, Integer d) {
        super();
        this.u = u;
        this.g = g;
        this.r = r;
        this.d = d;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * User OCID when this grant targets a user.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("u")
private String u;

        /**
         * User OCID when this grant targets a user.
         * @param u the value to set
         * @return this builder
         **/
        

public Builder u(String u) {
    this.u = u;
    return this;
}
            /**
     * Group OCID when this grant targets a group.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("g")
private String g;

        /**
         * Group OCID when this grant targets a group.
         * @param g the value to set
         * @return this builder
         **/
        

public Builder g(String g) {
    this.g = g;
    return this;
}
            /**
     * Role identifier when this grant targets a role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("r")
private String r;

        /**
         * Role identifier when this grant targets a role.
         * @param r the value to set
         * @return this builder
         **/
        

public Builder r(String r) {
    this.r = r;
    return this;
}
            /**
     * One-based index into the collection-level display-name map.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("d")
private Integer d;

        /**
         * One-based index into the collection-level display-name map.
         * @param d the value to set
         * @return this builder
         **/
        

public Builder d(Integer d) {
    this.d = d;
    return this;
}


        public OntologyManagerPermissionGrant build() {
            OntologyManagerPermissionGrant model = new OntologyManagerPermissionGrant(this.u
                , this.g
                , this.r
                , this.d);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyManagerPermissionGrant model) {
                this.u(model.getU());
    this.g(model.getG());
    this.r(model.getR());
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

    


        /**
     * User OCID when this grant targets a user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("u")
    private final String u;

        /**
     * User OCID when this grant targets a user.
     * @return the value
     **/
    
    public String getU() {
        return u;
    }


        /**
     * Group OCID when this grant targets a group.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("g")
    private final String g;

        /**
     * Group OCID when this grant targets a group.
     * @return the value
     **/
    
    public String getG() {
        return g;
    }


        /**
     * Role identifier when this grant targets a role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("r")
    private final String r;

        /**
     * Role identifier when this grant targets a role.
     * @return the value
     **/
    
    public String getR() {
        return r;
    }


        /**
     * One-based index into the collection-level display-name map.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("d")
    private final Integer d;

        /**
     * One-based index into the collection-level display-name map.
     * @return the value
     **/
    
    public Integer getD() {
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
        sb.append("OntologyManagerPermissionGrant(");
        sb.append("u=").append(String.valueOf(this.u));
        sb.append(", g=").append(String.valueOf(this.g));
        sb.append(", r=").append(String.valueOf(this.r));
        sb.append(", d=").append(String.valueOf(this.d));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyManagerPermissionGrant)) {
            return false;
        }

        OntologyManagerPermissionGrant other = (OntologyManagerPermissionGrant) o;
        return java.util.Objects.equals(this.u, other.u) &&
            java.util.Objects.equals(this.g, other.g) &&
            java.util.Objects.equals(this.r, other.r) &&
            java.util.Objects.equals(this.d, other.d);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.u == null ? 43 : this.u.hashCode());
        result = (result * PRIME) + (this.g == null ? 43 : this.g.hashCode());
        result = (result * PRIME) + (this.r == null ? 43 : this.r.hashCode());
        result = (result * PRIME) + (this.d == null ? 43 : this.d.hashCode());
        return result;
    }


}
