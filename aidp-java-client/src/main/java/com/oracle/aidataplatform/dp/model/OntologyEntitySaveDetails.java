// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Ordered transaction envelope for ontology entity save and autosave.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntitySaveDetails.Builder.class)

public final class OntologyEntitySaveDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "baseRevision", "clientMutationId", "mode", "operations"})
    public OntologyEntitySaveDetails(String projectId, String baseRevision, String clientMutationId, String mode, java.util.List<OntologyEntitySaveOperation> operations) {
        super();
        this.projectId = projectId;
        this.baseRevision = baseRevision;
        this.clientMutationId = clientMutationId;
        this.mode = mode;
        this.operations = operations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Project being saved. The path projectId is authoritative.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;

        /**
         * Project being saved. The path projectId is authoritative.
         * @param projectId the value to set
         * @return this builder
         **/
        

public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
            /**
     * Server revision the client edited from.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("baseRevision")
private String baseRevision;

        /**
         * Server revision the client edited from.
         * @param baseRevision the value to set
         * @return this builder
         **/
        

public Builder baseRevision(String baseRevision) {
    this.baseRevision = baseRevision;
    return this;
}
            /**
     * Unique ID for this save/autosave request, used for retry safety.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clientMutationId")
private String clientMutationId;

        /**
         * Unique ID for this save/autosave request, used for retry safety.
         * @param clientMutationId the value to set
         * @return this builder
         **/
        

public Builder clientMutationId(String clientMutationId) {
    this.clientMutationId = clientMutationId;
    return this;
}
            /**
     * Save mode. Supported values are save and autosave.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("mode")
private String mode;

        /**
         * Save mode. Supported values are save and autosave.
         * @param mode the value to set
         * @return this builder
         **/
        

public Builder mode(String mode) {
    this.mode = mode;
    return this;
}
            /**
     * Ordered list of entity changes to apply atomically.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operations")
private java.util.List<OntologyEntitySaveOperation> operations;

        /**
         * Ordered list of entity changes to apply atomically.
         * @param operations the value to set
         * @return this builder
         **/
        

public Builder operations(java.util.List<OntologyEntitySaveOperation> operations) {
    this.operations = operations;
    return this;
}


        public OntologyEntitySaveDetails build() {
            OntologyEntitySaveDetails model = new OntologyEntitySaveDetails(this.projectId
                , this.baseRevision
                , this.clientMutationId
                , this.mode
                , this.operations);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntitySaveDetails model) {
                this.projectId(model.getProjectId());
    this.baseRevision(model.getBaseRevision());
    this.clientMutationId(model.getClientMutationId());
    this.mode(model.getMode());
    this.operations(model.getOperations());
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
     * Project being saved. The path projectId is authoritative.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

        /**
     * Project being saved. The path projectId is authoritative.
     * @return the value
     **/
    
    public String getProjectId() {
        return projectId;
    }


        /**
     * Server revision the client edited from.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("baseRevision")
    private final String baseRevision;

        /**
     * Server revision the client edited from.
     * @return the value
     **/
    
    public String getBaseRevision() {
        return baseRevision;
    }


        /**
     * Unique ID for this save/autosave request, used for retry safety.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clientMutationId")
    private final String clientMutationId;

        /**
     * Unique ID for this save/autosave request, used for retry safety.
     * @return the value
     **/
    
    public String getClientMutationId() {
        return clientMutationId;
    }


        /**
     * Save mode. Supported values are save and autosave.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final String mode;

        /**
     * Save mode. Supported values are save and autosave.
     * @return the value
     **/
    
    public String getMode() {
        return mode;
    }


        /**
     * Ordered list of entity changes to apply atomically.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<OntologyEntitySaveOperation> operations;

        /**
     * Ordered list of entity changes to apply atomically.
     * @return the value
     **/
    
    public java.util.List<OntologyEntitySaveOperation> getOperations() {
        return operations;
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
        sb.append("OntologyEntitySaveDetails(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", baseRevision=").append(String.valueOf(this.baseRevision));
        sb.append(", clientMutationId=").append(String.valueOf(this.clientMutationId));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntitySaveDetails)) {
            return false;
        }

        OntologyEntitySaveDetails other = (OntologyEntitySaveDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.baseRevision, other.baseRevision) &&
            java.util.Objects.equals(this.clientMutationId, other.clientMutationId) &&
            java.util.Objects.equals(this.mode, other.mode) &&
            java.util.Objects.equals(this.operations, other.operations);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.baseRevision == null ? 43 : this.baseRevision.hashCode());
        result = (result * PRIME) + (this.clientMutationId == null ? 43 : this.clientMutationId.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        return result;
    }


}
