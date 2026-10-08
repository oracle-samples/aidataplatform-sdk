// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Status history row for an ontology project, including publish lifecycle records.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectStatus.Builder.class)

public final class OntologyProjectStatus  {
    @Deprecated
    @java.beans.ConstructorProperties({"statusId", "projectId", "projectVersion", "publishVersion", "publishedOntologyName", "deploymentTarget", "deploymentConnection", "isDeploymentShared", "status", "comment", "importDetails", "validationReport", "compiledArtifactRef", "errorMessage", "idempotencyKey", "timeCreated", "timeUpdated"})
    public OntologyProjectStatus(String statusId, String projectId, Integer projectVersion, Integer publishVersion, String publishedOntologyName, String deploymentTarget, String deploymentConnection, Boolean isDeploymentShared, Status status, String comment, OntologyProjectImportStatusDetails importDetails, String validationReport, String compiledArtifactRef, String errorMessage, String idempotencyKey, java.util.Date timeCreated, java.util.Date timeUpdated) {
        super();
        this.statusId = statusId;
        this.projectId = projectId;
        this.projectVersion = projectVersion;
        this.publishVersion = publishVersion;
        this.publishedOntologyName = publishedOntologyName;
        this.deploymentTarget = deploymentTarget;
        this.deploymentConnection = deploymentConnection;
        this.isDeploymentShared = isDeploymentShared;
        this.status = status;
        this.comment = comment;
        this.importDetails = importDetails;
        this.validationReport = validationReport;
        this.compiledArtifactRef = compiledArtifactRef;
        this.errorMessage = errorMessage;
        this.idempotencyKey = idempotencyKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("statusId")
private String statusId;



public Builder statusId(String statusId) {
    this.statusId = statusId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;



public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
            /**
     * OMS project metadata version captured when publish starts.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectVersion")
private Integer projectVersion;

        /**
         * OMS project metadata version captured when publish starts.
         * @param projectVersion the value to set
         * @return this builder
         **/
        

public Builder projectVersion(Integer projectVersion) {
    this.projectVersion = projectVersion;
    return this;
}
            /**
     * Monotonic publish version for the project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("publishVersion")
private Integer publishVersion;

        /**
         * Monotonic publish version for the project.
         * @param publishVersion the value to set
         * @return this builder
         **/
        

public Builder publishVersion(Integer publishVersion) {
    this.publishVersion = publishVersion;
    return this;
}
            /**
     * Published ontology identity used by the deploy target. Defaults to the project key for older requests.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("publishedOntologyName")
private String publishedOntologyName;

        /**
         * Published ontology identity used by the deploy target. Defaults to the project key for older requests.
         * @param publishedOntologyName the value to set
         * @return this builder
         **/
        

public Builder publishedOntologyName(String publishedOntologyName) {
    this.publishedOntologyName = publishedOntologyName;
    return this;
}
            /**
     * Deployment target used for this publish attempt, for example duckdb, oracle, or ATP.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentTarget")
private String deploymentTarget;

        /**
         * Deployment target used for this publish attempt, for example duckdb, oracle, or ATP.
         * @param deploymentTarget the value to set
         * @return this builder
         **/
        

public Builder deploymentTarget(String deploymentTarget) {
    this.deploymentTarget = deploymentTarget;
    return this;
}
            /**
     * Target deployment connection or catalog reference used for this publish attempt when applicable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentConnection")
private String deploymentConnection;

        /**
         * Target deployment connection or catalog reference used for this publish attempt when applicable.
         * @param deploymentConnection the value to set
         * @return this builder
         **/
        

public Builder deploymentConnection(String deploymentConnection) {
    this.deploymentConnection = deploymentConnection;
    return this;
}
            /**
     * Whether the deployed ontology used DFL's shared storage layout.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDeploymentShared")
private Boolean isDeploymentShared;

        /**
         * Whether the deployed ontology used DFL's shared storage layout.
         * @param isDeploymentShared the value to set
         * @return this builder
         **/
        

public Builder isDeploymentShared(Boolean isDeploymentShared) {
    this.isDeploymentShared = isDeploymentShared;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Status status;



public Builder status(Status status) {
    this.status = status;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("comment")
private String comment;



public Builder comment(String comment) {
    this.comment = comment;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("importDetails")
private OntologyProjectImportStatusDetails importDetails;



public Builder importDetails(OntologyProjectImportStatusDetails importDetails) {
    this.importDetails = importDetails;
    return this;
}
            /**
     * JSON validation report produced by a compiler worker.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("validationReport")
private String validationReport;

        /**
         * JSON validation report produced by a compiler worker.
         * @param validationReport the value to set
         * @return this builder
         **/
        

public Builder validationReport(String validationReport) {
    this.validationReport = validationReport;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("compiledArtifactRef")
private String compiledArtifactRef;



public Builder compiledArtifactRef(String compiledArtifactRef) {
    this.compiledArtifactRef = compiledArtifactRef;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
private String errorMessage;



public Builder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("idempotencyKey")
private String idempotencyKey;



public Builder idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;



public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;



public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}


        public OntologyProjectStatus build() {
            OntologyProjectStatus model = new OntologyProjectStatus(this.statusId
                , this.projectId
                , this.projectVersion
                , this.publishVersion
                , this.publishedOntologyName
                , this.deploymentTarget
                , this.deploymentConnection
                , this.isDeploymentShared
                , this.status
                , this.comment
                , this.importDetails
                , this.validationReport
                , this.compiledArtifactRef
                , this.errorMessage
                , this.idempotencyKey
                , this.timeCreated
                , this.timeUpdated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectStatus model) {
                this.statusId(model.getStatusId());
    this.projectId(model.getProjectId());
    this.projectVersion(model.getProjectVersion());
    this.publishVersion(model.getPublishVersion());
    this.publishedOntologyName(model.getPublishedOntologyName());
    this.deploymentTarget(model.getDeploymentTarget());
    this.deploymentConnection(model.getDeploymentConnection());
    this.isDeploymentShared(model.getIsDeploymentShared());
    this.status(model.getStatus());
    this.comment(model.getComment());
    this.importDetails(model.getImportDetails());
    this.validationReport(model.getValidationReport());
    this.compiledArtifactRef(model.getCompiledArtifactRef());
    this.errorMessage(model.getErrorMessage());
    this.idempotencyKey(model.getIdempotencyKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("statusId")
    private final String statusId;

    
    public String getStatusId() {
        return statusId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    
    public String getProjectId() {
        return projectId;
    }


        /**
     * OMS project metadata version captured when publish starts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectVersion")
    private final Integer projectVersion;

        /**
     * OMS project metadata version captured when publish starts.
     * @return the value
     **/
    
    public Integer getProjectVersion() {
        return projectVersion;
    }


        /**
     * Monotonic publish version for the project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("publishVersion")
    private final Integer publishVersion;

        /**
     * Monotonic publish version for the project.
     * @return the value
     **/
    
    public Integer getPublishVersion() {
        return publishVersion;
    }


        /**
     * Published ontology identity used by the deploy target. Defaults to the project key for older requests.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("publishedOntologyName")
    private final String publishedOntologyName;

        /**
     * Published ontology identity used by the deploy target. Defaults to the project key for older requests.
     * @return the value
     **/
    
    public String getPublishedOntologyName() {
        return publishedOntologyName;
    }


        /**
     * Deployment target used for this publish attempt, for example duckdb, oracle, or ATP.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentTarget")
    private final String deploymentTarget;

        /**
     * Deployment target used for this publish attempt, for example duckdb, oracle, or ATP.
     * @return the value
     **/
    
    public String getDeploymentTarget() {
        return deploymentTarget;
    }


        /**
     * Target deployment connection or catalog reference used for this publish attempt when applicable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentConnection")
    private final String deploymentConnection;

        /**
     * Target deployment connection or catalog reference used for this publish attempt when applicable.
     * @return the value
     **/
    
    public String getDeploymentConnection() {
        return deploymentConnection;
    }


        /**
     * Whether the deployed ontology used DFL's shared storage layout.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDeploymentShared")
    private final Boolean isDeploymentShared;

        /**
     * Whether the deployed ontology used DFL's shared storage layout.
     * @return the value
     **/
    
    public Boolean getIsDeploymentShared() {
        return isDeploymentShared;
    }

    /**
     **/
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Created("CREATED"),
        Updated("UPDATED"),
        Validating("VALIDATING"),
        ValidationFailed("VALIDATION_FAILED"),
        Publishing("PUBLISHING"),
        Published("PUBLISHED"),
        PublishFailed("PUBLISH_FAILED"),
        Unpublishing("UNPUBLISHING"),
        Unpublished("UNPUBLISHED"),
        UnpublishFailed("UNPUBLISH_FAILED"),
        Importing("IMPORTING"),
        Imported("IMPORTED"),
        ImportFailed("IMPORT_FAILED"),
        Archived("ARCHIVED"),
        ;

        

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    
    public Status getStatus() {
        return status;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    
    public String getComment() {
        return comment;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("importDetails")
    private final OntologyProjectImportStatusDetails importDetails;

    
    public OntologyProjectImportStatusDetails getImportDetails() {
        return importDetails;
    }


        /**
     * JSON validation report produced by a compiler worker.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationReport")
    private final String validationReport;

        /**
     * JSON validation report produced by a compiler worker.
     * @return the value
     **/
    
    public String getValidationReport() {
        return validationReport;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("compiledArtifactRef")
    private final String compiledArtifactRef;

    
    public String getCompiledArtifactRef() {
        return compiledArtifactRef;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    
    public String getErrorMessage() {
        return errorMessage;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("idempotencyKey")
    private final String idempotencyKey;

    
    public String getIdempotencyKey() {
        return idempotencyKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("OntologyProjectStatus(");
        sb.append("statusId=").append(String.valueOf(this.statusId));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", projectVersion=").append(String.valueOf(this.projectVersion));
        sb.append(", publishVersion=").append(String.valueOf(this.publishVersion));
        sb.append(", publishedOntologyName=").append(String.valueOf(this.publishedOntologyName));
        sb.append(", deploymentTarget=").append(String.valueOf(this.deploymentTarget));
        sb.append(", deploymentConnection=").append(String.valueOf(this.deploymentConnection));
        sb.append(", isDeploymentShared=").append(String.valueOf(this.isDeploymentShared));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", importDetails=").append(String.valueOf(this.importDetails));
        sb.append(", validationReport=").append(String.valueOf(this.validationReport));
        sb.append(", compiledArtifactRef=").append(String.valueOf(this.compiledArtifactRef));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", idempotencyKey=").append(String.valueOf(this.idempotencyKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectStatus)) {
            return false;
        }

        OntologyProjectStatus other = (OntologyProjectStatus) o;
        return java.util.Objects.equals(this.statusId, other.statusId) &&
            java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.projectVersion, other.projectVersion) &&
            java.util.Objects.equals(this.publishVersion, other.publishVersion) &&
            java.util.Objects.equals(this.publishedOntologyName, other.publishedOntologyName) &&
            java.util.Objects.equals(this.deploymentTarget, other.deploymentTarget) &&
            java.util.Objects.equals(this.deploymentConnection, other.deploymentConnection) &&
            java.util.Objects.equals(this.isDeploymentShared, other.isDeploymentShared) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.comment, other.comment) &&
            java.util.Objects.equals(this.importDetails, other.importDetails) &&
            java.util.Objects.equals(this.validationReport, other.validationReport) &&
            java.util.Objects.equals(this.compiledArtifactRef, other.compiledArtifactRef) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.equals(this.idempotencyKey, other.idempotencyKey) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statusId == null ? 43 : this.statusId.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.projectVersion == null ? 43 : this.projectVersion.hashCode());
        result = (result * PRIME) + (this.publishVersion == null ? 43 : this.publishVersion.hashCode());
        result = (result * PRIME) + (this.publishedOntologyName == null ? 43 : this.publishedOntologyName.hashCode());
        result = (result * PRIME) + (this.deploymentTarget == null ? 43 : this.deploymentTarget.hashCode());
        result = (result * PRIME) + (this.deploymentConnection == null ? 43 : this.deploymentConnection.hashCode());
        result = (result * PRIME) + (this.isDeploymentShared == null ? 43 : this.isDeploymentShared.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.importDetails == null ? 43 : this.importDetails.hashCode());
        result = (result * PRIME) + (this.validationReport == null ? 43 : this.validationReport.hashCode());
        result = (result * PRIME) + (this.compiledArtifactRef == null ? 43 : this.compiledArtifactRef.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.idempotencyKey == null ? 43 : this.idempotencyKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        return result;
    }


}
