package com.oracle.aidataplatform.dp.model;


/**
 * Provision user schema which includes creating user schema, persist credentials in credential store.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ProvisionUserSchemaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="actionType")

public final class ProvisionUserSchemaDetails extends ExecuteDatabaseUserWorkflowsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userSchemaName")
        private String userSchemaName;

                /**
         * The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.
         * @param userSchemaName the value to set
         * @return this builder
         **/
        

        public Builder userSchemaName(String userSchemaName) {
        this.userSchemaName = userSchemaName;
        return this;
        }
            /**
     * The grants to be assigned to the user schema.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("grants")
        private java.util.List<String> grants;

                /**
         * The grants to be assigned to the user schema.
         * @param grants the value to set
         * @return this builder
         **/
        

        public Builder grants(java.util.List<String> grants) {
        this.grants = grants;
        return this;
        }


        public ProvisionUserSchemaDetails build() {
            ProvisionUserSchemaDetails model = new ProvisionUserSchemaDetails(this.userSchemaName
                    , this.grants);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProvisionUserSchemaDetails model) {
                this.userSchemaName(model.getUserSchemaName());
    this.grants(model.getGrants());
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
    public ProvisionUserSchemaDetails(String userSchemaName, java.util.List<String> grants) {
        super();
        this.userSchemaName = userSchemaName;
        this.grants = grants;
    }


        /**
     * The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userSchemaName")
    private final String userSchemaName;

        /**
     * The user schema name, for example AIDP_<uniqueSuffix>_KB_READONLY.
     * @return the value
     **/
    
    public String getUserSchemaName() {
        return userSchemaName;
    }


        /**
     * The grants to be assigned to the user schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("grants")
    private final java.util.List<String> grants;

        /**
     * The grants to be assigned to the user schema.
     * @return the value
     **/
    
    public java.util.List<String> getGrants() {
        return grants;
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
        sb.append("ProvisionUserSchemaDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userSchemaName=").append(String.valueOf(this.userSchemaName));
        sb.append(", grants=").append(String.valueOf(this.grants));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProvisionUserSchemaDetails)) {
            return false;
        }

        ProvisionUserSchemaDetails other = (ProvisionUserSchemaDetails) o;
        return java.util.Objects.equals(this.userSchemaName, other.userSchemaName) &&
            java.util.Objects.equals(this.grants, other.grants) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userSchemaName == null ? 43 : this.userSchemaName.hashCode());
        result = (result * PRIME) + (this.grants == null ? 43 : this.grants.hashCode());
        return result;
    }


}
