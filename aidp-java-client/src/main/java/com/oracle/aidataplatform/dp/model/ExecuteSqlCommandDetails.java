// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Running SQL command.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExecuteSqlCommandDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="actionType")

public final class ExecuteSqlCommandDetails extends ExecuteDatabaseUserWorkflowsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The user schema name. Only supports a valid knowledge base user and ADMIN.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("userSchemaName")
private String userSchemaName;

        /**
         * The user schema name. Only supports a valid knowledge base user and ADMIN.
         * @param userSchemaName the value to set
         * @return this builder
         **/
        

public Builder userSchemaName(String userSchemaName) {
    this.userSchemaName = userSchemaName;
    return this;
}
            /**
     * Base64-encoded SQL command.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
private String sqlCommand;

        /**
         * Base64-encoded SQL command.
         * @param sqlCommand the value to set
         * @return this builder
         **/
        

public Builder sqlCommand(String sqlCommand) {
    this.sqlCommand = sqlCommand;
    return this;
}


        public ExecuteSqlCommandDetails build() {
            ExecuteSqlCommandDetails model = new ExecuteSqlCommandDetails(this.userSchemaName
                , this.sqlCommand);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlCommandDetails model) {
                this.userSchemaName(model.getUserSchemaName());
    this.sqlCommand(model.getSqlCommand());
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
    public ExecuteSqlCommandDetails(String userSchemaName, String sqlCommand) {
    super();
        this.userSchemaName = userSchemaName;
        this.sqlCommand = sqlCommand;
    }


        /**
     * The user schema name. Only supports a valid knowledge base user and ADMIN.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userSchemaName")
    private final String userSchemaName;

        /**
     * The user schema name. Only supports a valid knowledge base user and ADMIN.
     * @return the value
     **/
    
    public String getUserSchemaName() {
        return userSchemaName;
    }


        /**
     * Base64-encoded SQL command.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sqlCommand")
    private final String sqlCommand;

        /**
     * Base64-encoded SQL command.
     * @return the value
     **/
    
    public String getSqlCommand() {
        return sqlCommand;
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
        sb.append("ExecuteSqlCommandDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userSchemaName=").append(String.valueOf(this.userSchemaName));
        sb.append(", sqlCommand=").append(String.valueOf(this.sqlCommand));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlCommandDetails)) {
            return false;
        }

        ExecuteSqlCommandDetails other = (ExecuteSqlCommandDetails) o;
        return java.util.Objects.equals(this.userSchemaName, other.userSchemaName) &&
            java.util.Objects.equals(this.sqlCommand, other.sqlCommand) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userSchemaName == null ? 43 : this.userSchemaName.hashCode());
        result = (result * PRIME) + (this.sqlCommand == null ? 43 : this.sqlCommand.hashCode());
        return result;
    }


}
