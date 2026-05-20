// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Alias of the registered model
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RegisteredModelAlias.Builder.class)

public final class RegisteredModelAlias  {
    @Deprecated
    @java.beans.ConstructorProperties({"alias", "version"})
    public RegisteredModelAlias(String alias, String version) {
        super();
        this.alias = alias;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The name of the alias.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("alias")
private String alias;

        /**
         * The name of the alias.
         * @param alias the value to set
         * @return this builder
         **/
        

public Builder alias(String alias) {
    this.alias = alias;
    return this;
}
            /**
     * The model version number that the alias points to.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * The model version number that the alias points to.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(String version) {
    this.version = version;
    return this;
}


        public RegisteredModelAlias build() {
            RegisteredModelAlias model = new RegisteredModelAlias(this.alias
                , this.version);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisteredModelAlias model) {
                this.alias(model.getAlias());
    this.version(model.getVersion());
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
     * The name of the alias.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

        /**
     * The name of the alias.
     * @return the value
     **/
    
    public String getAlias() {
        return alias;
    }


        /**
     * The model version number that the alias points to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * The model version number that the alias points to.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
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
        sb.append("RegisteredModelAlias(");
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisteredModelAlias)) {
            return false;
        }

        RegisteredModelAlias other = (RegisteredModelAlias) o;
        return java.util.Objects.equals(this.alias, other.alias) &&
            java.util.Objects.equals(this.version, other.version);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }


}
