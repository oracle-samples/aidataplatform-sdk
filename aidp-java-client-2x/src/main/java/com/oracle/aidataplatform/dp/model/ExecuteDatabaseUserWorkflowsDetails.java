package com.oracle.aidataplatform.dp.model;


/**
 * Base schema for database user workflow execution. Contains common workflow fields.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="actionType", defaultImpl=ExecuteDatabaseUserWorkflowsDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExecuteSqlCommandDetails.class, name = "EXECUTE_SQL_COMMAND"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DeProvisionUserSchemasDetails.class, name = "DEPROVISION_USER_SCHEMAS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = EmbeddingModelDetails.class, name = "LOAD_EMBEDDING_MODELS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ProvisionUserSchemaDetails.class, name = "PROVISION_USER_SCHEMA")
})

public class ExecuteDatabaseUserWorkflowsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected ExecuteDatabaseUserWorkflowsDetails() {
        super();
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
        sb.append("ExecuteDatabaseUserWorkflowsDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteDatabaseUserWorkflowsDetails)) {
            return false;
        }

        ExecuteDatabaseUserWorkflowsDetails other = (ExecuteDatabaseUserWorkflowsDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
