// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result envelope for a bundled ontology entity save/autosave.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntitySaveResult.Builder.class)

public final class OntologyEntitySaveResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"success", "projectId", "baseRevision", "revision", "currentRevision", "clientMutationId", "mode", "duplicate", "appliedOperationIds", "entityResults", "failedOperation", "error"})
    public OntologyEntitySaveResult(Boolean success, String projectId, String baseRevision, String revision, String currentRevision, String clientMutationId, String mode, Boolean duplicate, java.util.List<String> appliedOperationIds, java.util.List<OntologyEntityOperationResult> entityResults, OntologyEntityFailedOperation failedOperation, OntologyEntitySaveError error) {
        super();
        this.success = success;
        this.projectId = projectId;
        this.baseRevision = baseRevision;
        this.revision = revision;
        this.currentRevision = currentRevision;
        this.clientMutationId = clientMutationId;
        this.mode = mode;
        this.duplicate = duplicate;
        this.appliedOperationIds = appliedOperationIds;
        this.entityResults = entityResults;
        this.failedOperation = failedOperation;
        this.error = error;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("success")
private Boolean success;



public Builder success(Boolean success) {
    this.success = success;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;



public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("baseRevision")
private String baseRevision;



public Builder baseRevision(String baseRevision) {
    this.baseRevision = baseRevision;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revision")
private String revision;



public Builder revision(String revision) {
    this.revision = revision;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("currentRevision")
private String currentRevision;



public Builder currentRevision(String currentRevision) {
    this.currentRevision = currentRevision;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("clientMutationId")
private String clientMutationId;



public Builder clientMutationId(String clientMutationId) {
    this.clientMutationId = clientMutationId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("mode")
private String mode;



public Builder mode(String mode) {
    this.mode = mode;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("duplicate")
private Boolean duplicate;



public Builder duplicate(Boolean duplicate) {
    this.duplicate = duplicate;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("appliedOperationIds")
private java.util.List<String> appliedOperationIds;



public Builder appliedOperationIds(java.util.List<String> appliedOperationIds) {
    this.appliedOperationIds = appliedOperationIds;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("entityResults")
private java.util.List<OntologyEntityOperationResult> entityResults;



public Builder entityResults(java.util.List<OntologyEntityOperationResult> entityResults) {
    this.entityResults = entityResults;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("failedOperation")
private OntologyEntityFailedOperation failedOperation;



public Builder failedOperation(OntologyEntityFailedOperation failedOperation) {
    this.failedOperation = failedOperation;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("error")
private OntologyEntitySaveError error;



public Builder error(OntologyEntitySaveError error) {
    this.error = error;
    return this;
}


        public OntologyEntitySaveResult build() {
            OntologyEntitySaveResult model = new OntologyEntitySaveResult(this.success
                , this.projectId
                , this.baseRevision
                , this.revision
                , this.currentRevision
                , this.clientMutationId
                , this.mode
                , this.duplicate
                , this.appliedOperationIds
                , this.entityResults
                , this.failedOperation
                , this.error);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntitySaveResult model) {
                this.success(model.getSuccess());
    this.projectId(model.getProjectId());
    this.baseRevision(model.getBaseRevision());
    this.revision(model.getRevision());
    this.currentRevision(model.getCurrentRevision());
    this.clientMutationId(model.getClientMutationId());
    this.mode(model.getMode());
    this.duplicate(model.getDuplicate());
    this.appliedOperationIds(model.getAppliedOperationIds());
    this.entityResults(model.getEntityResults());
    this.failedOperation(model.getFailedOperation());
    this.error(model.getError());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("success")
    private final Boolean success;

    
    public Boolean getSuccess() {
        return success;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    
    public String getProjectId() {
        return projectId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("baseRevision")
    private final String baseRevision;

    
    public String getBaseRevision() {
        return baseRevision;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final String revision;

    
    public String getRevision() {
        return revision;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("currentRevision")
    private final String currentRevision;

    
    public String getCurrentRevision() {
        return currentRevision;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clientMutationId")
    private final String clientMutationId;

    
    public String getClientMutationId() {
        return clientMutationId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final String mode;

    
    public String getMode() {
        return mode;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("duplicate")
    private final Boolean duplicate;

    
    public Boolean getDuplicate() {
        return duplicate;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("appliedOperationIds")
    private final java.util.List<String> appliedOperationIds;

    
    public java.util.List<String> getAppliedOperationIds() {
        return appliedOperationIds;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("entityResults")
    private final java.util.List<OntologyEntityOperationResult> entityResults;

    
    public java.util.List<OntologyEntityOperationResult> getEntityResults() {
        return entityResults;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("failedOperation")
    private final OntologyEntityFailedOperation failedOperation;

    
    public OntologyEntityFailedOperation getFailedOperation() {
        return failedOperation;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final OntologyEntitySaveError error;

    
    public OntologyEntitySaveError getError() {
        return error;
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
        sb.append("OntologyEntitySaveResult(");
        sb.append("success=").append(String.valueOf(this.success));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", baseRevision=").append(String.valueOf(this.baseRevision));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(", currentRevision=").append(String.valueOf(this.currentRevision));
        sb.append(", clientMutationId=").append(String.valueOf(this.clientMutationId));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", duplicate=").append(String.valueOf(this.duplicate));
        sb.append(", appliedOperationIds=").append(String.valueOf(this.appliedOperationIds));
        sb.append(", entityResults=").append(String.valueOf(this.entityResults));
        sb.append(", failedOperation=").append(String.valueOf(this.failedOperation));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntitySaveResult)) {
            return false;
        }

        OntologyEntitySaveResult other = (OntologyEntitySaveResult) o;
        return java.util.Objects.equals(this.success, other.success) &&
            java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.baseRevision, other.baseRevision) &&
            java.util.Objects.equals(this.revision, other.revision) &&
            java.util.Objects.equals(this.currentRevision, other.currentRevision) &&
            java.util.Objects.equals(this.clientMutationId, other.clientMutationId) &&
            java.util.Objects.equals(this.mode, other.mode) &&
            java.util.Objects.equals(this.duplicate, other.duplicate) &&
            java.util.Objects.equals(this.appliedOperationIds, other.appliedOperationIds) &&
            java.util.Objects.equals(this.entityResults, other.entityResults) &&
            java.util.Objects.equals(this.failedOperation, other.failedOperation) &&
            java.util.Objects.equals(this.error, other.error);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.success == null ? 43 : this.success.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.baseRevision == null ? 43 : this.baseRevision.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + (this.currentRevision == null ? 43 : this.currentRevision.hashCode());
        result = (result * PRIME) + (this.clientMutationId == null ? 43 : this.clientMutationId.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.duplicate == null ? 43 : this.duplicate.hashCode());
        result = (result * PRIME) + (this.appliedOperationIds == null ? 43 : this.appliedOperationIds.hashCode());
        result = (result * PRIME) + (this.entityResults == null ? 43 : this.entityResults.hashCode());
        result = (result * PRIME) + (this.failedOperation == null ? 43 : this.failedOperation.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        return result;
    }


}
