// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result envelope for a design-time ontology entity mutation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityMutationResult.Builder.class)

public final class OntologyEntityMutationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"success", "code", "createdEntities", "deletedEntities", "updatedEntities", "errors"})
    public OntologyEntityMutationResult(Boolean success, Integer code, java.util.List<String> createdEntities, java.util.List<String> deletedEntities, java.util.List<String> updatedEntities, java.util.List<OntologyEntityError> errors) {
        super();
        this.success = success;
        this.code = code;
        this.createdEntities = createdEntities;
        this.deletedEntities = deletedEntities;
        this.updatedEntities = updatedEntities;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether the mutation completed successfully.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("success")
private Boolean success;

        /**
         * Whether the mutation completed successfully.
         * @param success the value to set
         * @return this builder
         **/
        

public Builder success(Boolean success) {
    this.success = success;
    return this;
}
            /**
     * HTTP-like status code for the mutation result.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("code")
private Integer code;

        /**
         * HTTP-like status code for the mutation result.
         * @param code the value to set
         * @return this builder
         **/
        

public Builder code(Integer code) {
    this.code = code;
    return this;
}
            /**
     * Entity identifiers created by this mutation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdEntities")
private java.util.List<String> createdEntities;

        /**
         * Entity identifiers created by this mutation.
         * @param createdEntities the value to set
         * @return this builder
         **/
        

public Builder createdEntities(java.util.List<String> createdEntities) {
    this.createdEntities = createdEntities;
    return this;
}
            /**
     * Entity identifiers deleted by this mutation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deletedEntities")
private java.util.List<String> deletedEntities;

        /**
         * Entity identifiers deleted by this mutation.
         * @param deletedEntities the value to set
         * @return this builder
         **/
        

public Builder deletedEntities(java.util.List<String> deletedEntities) {
    this.deletedEntities = deletedEntities;
    return this;
}
            /**
     * Entity identifiers updated by this mutation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedEntities")
private java.util.List<String> updatedEntities;

        /**
         * Entity identifiers updated by this mutation.
         * @param updatedEntities the value to set
         * @return this builder
         **/
        

public Builder updatedEntities(java.util.List<String> updatedEntities) {
    this.updatedEntities = updatedEntities;
    return this;
}
            /**
     * Mutation errors when success is false.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errors")
private java.util.List<OntologyEntityError> errors;

        /**
         * Mutation errors when success is false.
         * @param errors the value to set
         * @return this builder
         **/
        

public Builder errors(java.util.List<OntologyEntityError> errors) {
    this.errors = errors;
    return this;
}


        public OntologyEntityMutationResult build() {
            OntologyEntityMutationResult model = new OntologyEntityMutationResult(this.success
                , this.code
                , this.createdEntities
                , this.deletedEntities
                , this.updatedEntities
                , this.errors);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityMutationResult model) {
                this.success(model.getSuccess());
    this.code(model.getCode());
    this.createdEntities(model.getCreatedEntities());
    this.deletedEntities(model.getDeletedEntities());
    this.updatedEntities(model.getUpdatedEntities());
    this.errors(model.getErrors());
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
     * Whether the mutation completed successfully.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("success")
    private final Boolean success;

        /**
     * Whether the mutation completed successfully.
     * @return the value
     **/
    
    public Boolean getSuccess() {
        return success;
    }


        /**
     * HTTP-like status code for the mutation result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final Integer code;

        /**
     * HTTP-like status code for the mutation result.
     * @return the value
     **/
    
    public Integer getCode() {
        return code;
    }


        /**
     * Entity identifiers created by this mutation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdEntities")
    private final java.util.List<String> createdEntities;

        /**
     * Entity identifiers created by this mutation.
     * @return the value
     **/
    
    public java.util.List<String> getCreatedEntities() {
        return createdEntities;
    }


        /**
     * Entity identifiers deleted by this mutation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deletedEntities")
    private final java.util.List<String> deletedEntities;

        /**
     * Entity identifiers deleted by this mutation.
     * @return the value
     **/
    
    public java.util.List<String> getDeletedEntities() {
        return deletedEntities;
    }


        /**
     * Entity identifiers updated by this mutation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedEntities")
    private final java.util.List<String> updatedEntities;

        /**
     * Entity identifiers updated by this mutation.
     * @return the value
     **/
    
    public java.util.List<String> getUpdatedEntities() {
        return updatedEntities;
    }


        /**
     * Mutation errors when success is false.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<OntologyEntityError> errors;

        /**
     * Mutation errors when success is false.
     * @return the value
     **/
    
    public java.util.List<OntologyEntityError> getErrors() {
        return errors;
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
        sb.append("OntologyEntityMutationResult(");
        sb.append("success=").append(String.valueOf(this.success));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", createdEntities=").append(String.valueOf(this.createdEntities));
        sb.append(", deletedEntities=").append(String.valueOf(this.deletedEntities));
        sb.append(", updatedEntities=").append(String.valueOf(this.updatedEntities));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityMutationResult)) {
            return false;
        }

        OntologyEntityMutationResult other = (OntologyEntityMutationResult) o;
        return java.util.Objects.equals(this.success, other.success) &&
            java.util.Objects.equals(this.code, other.code) &&
            java.util.Objects.equals(this.createdEntities, other.createdEntities) &&
            java.util.Objects.equals(this.deletedEntities, other.deletedEntities) &&
            java.util.Objects.equals(this.updatedEntities, other.updatedEntities) &&
            java.util.Objects.equals(this.errors, other.errors);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.success == null ? 43 : this.success.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.createdEntities == null ? 43 : this.createdEntities.hashCode());
        result = (result * PRIME) + (this.deletedEntities == null ? 43 : this.deletedEntities.hashCode());
        result = (result * PRIME) + (this.updatedEntities == null ? 43 : this.updatedEntities.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        return result;
    }


}
