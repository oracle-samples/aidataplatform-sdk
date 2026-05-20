// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Response indicating whether the principal has AIDP admin RBAC privileges.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IsPrincipalAidpAdmin.Builder.class)

public final class IsPrincipalAidpAdmin  {
    @Deprecated
    @java.beans.ConstructorProperties({"isAidpAdmin"})
    public IsPrincipalAidpAdmin(Boolean isAidpAdmin) {
        super();
        this.isAidpAdmin = isAidpAdmin;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * True if the principal has AIDP admin RBAC privileges , otherwise false.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isAidpAdmin")
        private Boolean isAidpAdmin;

                /**
         * True if the principal has AIDP admin RBAC privileges , otherwise false.
         * @param isAidpAdmin the value to set
         * @return this builder
         **/
        

        public Builder isAidpAdmin(Boolean isAidpAdmin) {
        this.isAidpAdmin = isAidpAdmin;
        return this;
        }


        public IsPrincipalAidpAdmin build() {
            IsPrincipalAidpAdmin model = new IsPrincipalAidpAdmin(this.isAidpAdmin);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IsPrincipalAidpAdmin model) {
                this.isAidpAdmin(model.getIsAidpAdmin());
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
     * True if the principal has AIDP admin RBAC privileges , otherwise false.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAidpAdmin")
    private final Boolean isAidpAdmin;

        /**
     * True if the principal has AIDP admin RBAC privileges , otherwise false.
     * @return the value
     **/
    
    public Boolean getIsAidpAdmin() {
        return isAidpAdmin;
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
        sb.append("IsPrincipalAidpAdmin(");
        sb.append("isAidpAdmin=").append(String.valueOf(this.isAidpAdmin));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IsPrincipalAidpAdmin)) {
            return false;
        }

        IsPrincipalAidpAdmin other = (IsPrincipalAidpAdmin) o;
        return java.util.Objects.equals(this.isAidpAdmin, other.isAidpAdmin);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isAidpAdmin == null ? 43 : this.isAidpAdmin.hashCode());
        return result;
    }


}
