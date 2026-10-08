// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Published ontology identity and runtime binding metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PublishedOntology.Builder.class)

public final class PublishedOntology  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "workspaceId", "projectKey", "displayName", "namespace", "publishedOntologyName", "deploymentTarget", "deploymentConnection", "isDeploymentShared", "dataConnectionRefs", "status", "timePublished", "publishedBy"})
    public PublishedOntology(String projectId, String workspaceId, String projectKey, String displayName, String namespace, String publishedOntologyName, String deploymentTarget, String deploymentConnection, Boolean isDeploymentShared, java.util.List<String> dataConnectionRefs, String status, java.util.Date timePublished, String publishedBy) {
        super();
        this.projectId = projectId;
        this.workspaceId = workspaceId;
        this.projectKey = projectKey;
        this.displayName = displayName;
        this.namespace = namespace;
        this.publishedOntologyName = publishedOntologyName;
        this.deploymentTarget = deploymentTarget;
        this.deploymentConnection = deploymentConnection;
        this.isDeploymentShared = isDeploymentShared;
        this.dataConnectionRefs = dataConnectionRefs;
        this.status = status;
        this.timePublished = timePublished;
        this.publishedBy = publishedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier of the source Ontology Manager project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;

        /**
         * Unique identifier of the source Ontology Manager project.
         * @param projectId the value to set
         * @return this builder
         **/
        

public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
            /**
     * Unique identifier of the workspace that owns the source project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
private String workspaceId;

        /**
         * Unique identifier of the workspace that owns the source project.
         * @param workspaceId the value to set
         * @return this builder
         **/
        

public Builder workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
}
            /**
     * Workspace-scoped project key of the source Ontology Manager project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectKey")
private String projectKey;

        /**
         * Workspace-scoped project key of the source Ontology Manager project.
         * @param projectKey the value to set
         * @return this builder
         **/
        

public Builder projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
}
            /**
     * Display name of the published ontology project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Display name of the published ontology project.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Ontology namespace associated with the published project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * Ontology namespace associated with the published project.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * Ontology identity requested at publish time; omitted for legacy project-key publishes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("publishedOntologyName")
private String publishedOntologyName;

        /**
         * Ontology identity requested at publish time; omitted for legacy project-key publishes.
         * @param publishedOntologyName the value to set
         * @return this builder
         **/
        

public Builder publishedOntologyName(String publishedOntologyName) {
    this.publishedOntologyName = publishedOntologyName;
    return this;
}
            /**
     * Runtime publish target used by the deployed ontology.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentTarget")
private String deploymentTarget;

        /**
         * Runtime publish target used by the deployed ontology.
         * @param deploymentTarget the value to set
         * @return this builder
         **/
        

public Builder deploymentTarget(String deploymentTarget) {
    this.deploymentTarget = deploymentTarget;
    return this;
}
            /**
     * Runtime target connection used by the deployed ontology, when one was requested.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentConnection")
private String deploymentConnection;

        /**
         * Runtime target connection used by the deployed ontology, when one was requested.
         * @param deploymentConnection the value to set
         * @return this builder
         **/
        

public Builder deploymentConnection(String deploymentConnection) {
    this.deploymentConnection = deploymentConnection;
    return this;
}
            /**
     * Whether the runtime deployment target is shared.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDeploymentShared")
private Boolean isDeploymentShared;

        /**
         * Whether the runtime deployment target is shared.
         * @param isDeploymentShared the value to set
         * @return this builder
         **/
        

public Builder isDeploymentShared(Boolean isDeploymentShared) {
    this.isDeploymentShared = isDeploymentShared;
    return this;
}
            /**
     * Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dataConnectionRefs")
private java.util.List<String> dataConnectionRefs;

        /**
         * Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.
         * @param dataConnectionRefs the value to set
         * @return this builder
         **/
        

public Builder dataConnectionRefs(java.util.List<String> dataConnectionRefs) {
    this.dataConnectionRefs = dataConnectionRefs;
    return this;
}
            /**
     * Latest effective publish lifecycle state for the ontology project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * Latest effective publish lifecycle state for the ontology project.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
    return this;
}
            /**
     * Time when the ontology project was most recently published.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timePublished")
private java.util.Date timePublished;

        /**
         * Time when the ontology project was most recently published.
         * @param timePublished the value to set
         * @return this builder
         **/
        

public Builder timePublished(java.util.Date timePublished) {
    this.timePublished = timePublished;
    return this;
}
            /**
     * Principal that most recently published the ontology project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("publishedBy")
private String publishedBy;

        /**
         * Principal that most recently published the ontology project.
         * @param publishedBy the value to set
         * @return this builder
         **/
        

public Builder publishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
}


        public PublishedOntology build() {
            PublishedOntology model = new PublishedOntology(this.projectId
                , this.workspaceId
                , this.projectKey
                , this.displayName
                , this.namespace
                , this.publishedOntologyName
                , this.deploymentTarget
                , this.deploymentConnection
                , this.isDeploymentShared
                , this.dataConnectionRefs
                , this.status
                , this.timePublished
                , this.publishedBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishedOntology model) {
                this.projectId(model.getProjectId());
    this.workspaceId(model.getWorkspaceId());
    this.projectKey(model.getProjectKey());
    this.displayName(model.getDisplayName());
    this.namespace(model.getNamespace());
    this.publishedOntologyName(model.getPublishedOntologyName());
    this.deploymentTarget(model.getDeploymentTarget());
    this.deploymentConnection(model.getDeploymentConnection());
    this.isDeploymentShared(model.getIsDeploymentShared());
    this.dataConnectionRefs(model.getDataConnectionRefs());
    this.status(model.getStatus());
    this.timePublished(model.getTimePublished());
    this.publishedBy(model.getPublishedBy());
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
     * Unique identifier of the source Ontology Manager project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

        /**
     * Unique identifier of the source Ontology Manager project.
     * @return the value
     **/
    
    public String getProjectId() {
        return projectId;
    }


        /**
     * Unique identifier of the workspace that owns the source project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

        /**
     * Unique identifier of the workspace that owns the source project.
     * @return the value
     **/
    
    public String getWorkspaceId() {
        return workspaceId;
    }


        /**
     * Workspace-scoped project key of the source Ontology Manager project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectKey")
    private final String projectKey;

        /**
     * Workspace-scoped project key of the source Ontology Manager project.
     * @return the value
     **/
    
    public String getProjectKey() {
        return projectKey;
    }


        /**
     * Display name of the published ontology project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name of the published ontology project.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Ontology namespace associated with the published project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * Ontology namespace associated with the published project.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * Ontology identity requested at publish time; omitted for legacy project-key publishes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("publishedOntologyName")
    private final String publishedOntologyName;

        /**
     * Ontology identity requested at publish time; omitted for legacy project-key publishes.
     * @return the value
     **/
    
    public String getPublishedOntologyName() {
        return publishedOntologyName;
    }


        /**
     * Runtime publish target used by the deployed ontology.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentTarget")
    private final String deploymentTarget;

        /**
     * Runtime publish target used by the deployed ontology.
     * @return the value
     **/
    
    public String getDeploymentTarget() {
        return deploymentTarget;
    }


        /**
     * Runtime target connection used by the deployed ontology, when one was requested.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentConnection")
    private final String deploymentConnection;

        /**
     * Runtime target connection used by the deployed ontology, when one was requested.
     * @return the value
     **/
    
    public String getDeploymentConnection() {
        return deploymentConnection;
    }


        /**
     * Whether the runtime deployment target is shared.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDeploymentShared")
    private final Boolean isDeploymentShared;

        /**
     * Whether the runtime deployment target is shared.
     * @return the value
     **/
    
    public Boolean getIsDeploymentShared() {
        return isDeploymentShared;
    }


        /**
     * Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataConnectionRefs")
    private final java.util.List<String> dataConnectionRefs;

        /**
     * Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.
     * @return the value
     **/
    
    public java.util.List<String> getDataConnectionRefs() {
        return dataConnectionRefs;
    }


        /**
     * Latest effective publish lifecycle state for the ontology project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * Latest effective publish lifecycle state for the ontology project.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
    }


        /**
     * Time when the ontology project was most recently published.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

        /**
     * Time when the ontology project was most recently published.
     * @return the value
     **/
    
    public java.util.Date getTimePublished() {
        return timePublished;
    }


        /**
     * Principal that most recently published the ontology project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("publishedBy")
    private final String publishedBy;

        /**
     * Principal that most recently published the ontology project.
     * @return the value
     **/
    
    public String getPublishedBy() {
        return publishedBy;
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
        sb.append("PublishedOntology(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", projectKey=").append(String.valueOf(this.projectKey));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", publishedOntologyName=").append(String.valueOf(this.publishedOntologyName));
        sb.append(", deploymentTarget=").append(String.valueOf(this.deploymentTarget));
        sb.append(", deploymentConnection=").append(String.valueOf(this.deploymentConnection));
        sb.append(", isDeploymentShared=").append(String.valueOf(this.isDeploymentShared));
        sb.append(", dataConnectionRefs=").append(String.valueOf(this.dataConnectionRefs));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", publishedBy=").append(String.valueOf(this.publishedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishedOntology)) {
            return false;
        }

        PublishedOntology other = (PublishedOntology) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.workspaceId, other.workspaceId) &&
            java.util.Objects.equals(this.projectKey, other.projectKey) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.publishedOntologyName, other.publishedOntologyName) &&
            java.util.Objects.equals(this.deploymentTarget, other.deploymentTarget) &&
            java.util.Objects.equals(this.deploymentConnection, other.deploymentConnection) &&
            java.util.Objects.equals(this.isDeploymentShared, other.isDeploymentShared) &&
            java.util.Objects.equals(this.dataConnectionRefs, other.dataConnectionRefs) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.timePublished, other.timePublished) &&
            java.util.Objects.equals(this.publishedBy, other.publishedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.projectKey == null ? 43 : this.projectKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.publishedOntologyName == null ? 43 : this.publishedOntologyName.hashCode());
        result = (result * PRIME) + (this.deploymentTarget == null ? 43 : this.deploymentTarget.hashCode());
        result = (result * PRIME) + (this.deploymentConnection == null ? 43 : this.deploymentConnection.hashCode());
        result = (result * PRIME) + (this.isDeploymentShared == null ? 43 : this.isDeploymentShared.hashCode());
        result = (result * PRIME) + (this.dataConnectionRefs == null ? 43 : this.dataConnectionRefs.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result = (result * PRIME) + (this.publishedBy == null ? 43 : this.publishedBy.hashCode());
        return result;
    }


}
