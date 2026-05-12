package com.oracle.aidataplatform.dp.model;



/**
 * Response indicating whether the principal has admin privileges.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IsPrincipalAdmin.Builder.class)

public final class IsPrincipalAdmin  {
    @Deprecated
    @java.beans.ConstructorProperties({"isAdmin"})
    public IsPrincipalAdmin(Boolean isAdmin) {
        super();
        this.isAdmin = isAdmin;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * True if the principal has admin privileges, otherwise false.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isAdmin")
private Boolean isAdmin;

        /**
         * True if the principal has admin privileges, otherwise false.
         * @param isAdmin the value to set
         * @return this builder
         **/
        

public Builder isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
}


        public IsPrincipalAdmin build() {
            IsPrincipalAdmin model = new IsPrincipalAdmin(this.isAdmin);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IsPrincipalAdmin model) {
                this.isAdmin(model.getIsAdmin());
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
     * True if the principal has admin privileges, otherwise false.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAdmin")
    private final Boolean isAdmin;

        /**
     * True if the principal has admin privileges, otherwise false.
     * @return the value
     **/
    
    public Boolean getIsAdmin() {
        return isAdmin;
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
        sb.append("IsPrincipalAdmin(");
        sb.append("isAdmin=").append(String.valueOf(this.isAdmin));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IsPrincipalAdmin)) {
            return false;
        }

        IsPrincipalAdmin other = (IsPrincipalAdmin) o;
        return java.util.Objects.equals(this.isAdmin, other.isAdmin);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isAdmin == null ? 43 : this.isAdmin.hashCode());
        return result;
    }


}
