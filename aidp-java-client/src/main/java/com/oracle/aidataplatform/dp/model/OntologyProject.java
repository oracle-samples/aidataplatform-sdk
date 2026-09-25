// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Ontology Manager project metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProject.Builder.class)

public final class OntologyProject  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "workspaceId", "key", "displayName", "description", "namespace", "creator", "ontologyVersion", "baseUri", "defaultLanguage", "workspaceBasePath", "sourceType", "gitRepositoryKey", "gitBranchName", "gitFolderPath", "targetConnection", "lifecycleState", "status", "timeCreated", "timeUpdated", "updatedBy", "timePublished", "publishedBy", "version", "freeformTags", "definedTags", "systemTags"})
    public OntologyProject(String id, String workspaceId, String key, String displayName, String description, String namespace, String creator, String ontologyVersion, String baseUri, String defaultLanguage, String workspaceBasePath, OntologyProjectSourceType sourceType, String gitRepositoryKey, String gitBranchName, String gitFolderPath, OntologyPublishTargetConnectionReference targetConnection, String lifecycleState, String status, java.util.Date timeCreated, java.util.Date timeUpdated, String updatedBy, java.util.Date timePublished, String publishedBy, Integer version, java.util.Map<String, String> freeformTags, java.util.Map<String, java.util.Map<String, Object>> definedTags, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.workspaceId = workspaceId;
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.namespace = namespace;
        this.creator = creator;
        this.ontologyVersion = ontologyVersion;
        this.baseUri = baseUri;
        this.defaultLanguage = defaultLanguage;
        this.workspaceBasePath = workspaceBasePath;
        this.sourceType = sourceType;
        this.gitRepositoryKey = gitRepositoryKey;
        this.gitBranchName = gitBranchName;
        this.gitFolderPath = gitFolderPath;
        this.targetConnection = targetConnection;
        this.lifecycleState = lifecycleState;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.timePublished = timePublished;
        this.publishedBy = publishedBy;
        this.version = version;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;



public Builder id(String id) {
    this.id = id;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
private String workspaceId;



public Builder workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;



public Builder key(String key) {
    this.key = key;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;



public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;



public Builder description(String description) {
    this.description = description;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;



public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * Creator metadata for the ontology project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("creator")
private String creator;

        /**
         * Creator metadata for the ontology project.
         * @param creator the value to set
         * @return this builder
         **/
        

public Builder creator(String creator) {
    this.creator = creator;
    return this;
}
            /**
     * Semantic ontology version metadata for the ontology project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ontologyVersion")
private String ontologyVersion;

        /**
         * Semantic ontology version metadata for the ontology project.
         * @param ontologyVersion the value to set
         * @return this builder
         **/
        

public Builder ontologyVersion(String ontologyVersion) {
    this.ontologyVersion = ontologyVersion;
    return this;
}
            /**
     * Base URI metadata for ontology files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("baseUri")
private String baseUri;

        /**
         * Base URI metadata for ontology files.
         * @param baseUri the value to set
         * @return this builder
         **/
        

public Builder baseUri(String baseUri) {
    this.baseUri = baseUri;
    return this;
}
            /**
     * Default language tag metadata for ontology files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("defaultLanguage")
private String defaultLanguage;

        /**
         * Default language tag metadata for ontology files.
         * @param defaultLanguage the value to set
         * @return this builder
         **/
        

public Builder defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
}
            /**
     * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceBasePath")
private String workspaceBasePath;

        /**
         * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
         * @param workspaceBasePath the value to set
         * @return this builder
         **/
        

public Builder workspaceBasePath(String workspaceBasePath) {
    this.workspaceBasePath = workspaceBasePath;
    return this;
}
            /**
     * Project content source. Defaults to VOLUME when omitted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceType")
private OntologyProjectSourceType sourceType;

        /**
         * Project content source. Defaults to VOLUME when omitted.
         * @param sourceType the value to set
         * @return this builder
         **/
        

public Builder sourceType(OntologyProjectSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
}
            /**
     * Git repository key for git-backed ontology projects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitRepositoryKey")
private String gitRepositoryKey;

        /**
         * Git repository key for git-backed ontology projects.
         * @param gitRepositoryKey the value to set
         * @return this builder
         **/
        

public Builder gitRepositoryKey(String gitRepositoryKey) {
    this.gitRepositoryKey = gitRepositoryKey;
    return this;
}
            /**
     * Git branch name for git-backed ontology projects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
private String gitBranchName;

        /**
         * Git branch name for git-backed ontology projects.
         * @param gitBranchName the value to set
         * @return this builder
         **/
        

public Builder gitBranchName(String gitBranchName) {
    this.gitBranchName = gitBranchName;
    return this;
}
            /**
     * Workspace-relative Git folder path for git-backed ontology project content.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Workspace-relative Git folder path for git-backed ontology project content.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("targetConnection")
private OntologyPublishTargetConnectionReference targetConnection;



public Builder targetConnection(OntologyPublishTargetConnectionReference targetConnection) {
    this.targetConnection = targetConnection;
    return this;
}
            /**
     * Project lifecycle state. Volume-backed creates initially return CREATING and transition to ACTIVE or FAILED after asynchronous scaffold creation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private String lifecycleState;

        /**
         * Project lifecycle state. Volume-backed creates initially return CREATING and transition to ACTIVE or FAILED after asynchronous scaffold creation.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Latest publish or operational status for the project; falls back to lifecycleState when no publish status exists.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * Latest publish or operational status for the project; falls back to lifecycleState when no publish status exists.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
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
            /**
     * Actor identifier for the most recent project metadata update.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * Actor identifier for the most recent project metadata update.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * Time when the most recent publish request was created for the project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timePublished")
private java.util.Date timePublished;

        /**
         * Time when the most recent publish request was created for the project.
         * @param timePublished the value to set
         * @return this builder
         **/
        

public Builder timePublished(java.util.Date timePublished) {
    this.timePublished = timePublished;
    return this;
}
            /**
     * Actor identifier for the most recent publish request on the project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("publishedBy")
private String publishedBy;

        /**
         * Actor identifier for the most recent publish request on the project.
         * @param publishedBy the value to set
         * @return this builder
         **/
        

public Builder publishedBy(String publishedBy) {
    this.publishedBy = publishedBy;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("version")
private Integer version;



public Builder version(Integer version) {
    this.version = version;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
private java.util.Map<String, String> freeformTags;



public Builder freeformTags(java.util.Map<String, String> freeformTags) {
    this.freeformTags = freeformTags;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("definedTags")
private java.util.Map<String, java.util.Map<String, Object>> definedTags;



public Builder definedTags(java.util.Map<String, java.util.Map<String, Object>> definedTags) {
    this.definedTags = definedTags;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("systemTags")
private java.util.Map<String, java.util.Map<String, Object>> systemTags;



public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
    this.systemTags = systemTags;
    return this;
}


        public OntologyProject build() {
            OntologyProject model = new OntologyProject(this.id
                , this.workspaceId
                , this.key
                , this.displayName
                , this.description
                , this.namespace
                , this.creator
                , this.ontologyVersion
                , this.baseUri
                , this.defaultLanguage
                , this.workspaceBasePath
                , this.sourceType
                , this.gitRepositoryKey
                , this.gitBranchName
                , this.gitFolderPath
                , this.targetConnection
                , this.lifecycleState
                , this.status
                , this.timeCreated
                , this.timeUpdated
                , this.updatedBy
                , this.timePublished
                , this.publishedBy
                , this.version
                , this.freeformTags
                , this.definedTags
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProject model) {
                this.id(model.getId());
    this.workspaceId(model.getWorkspaceId());
    this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.namespace(model.getNamespace());
    this.creator(model.getCreator());
    this.ontologyVersion(model.getOntologyVersion());
    this.baseUri(model.getBaseUri());
    this.defaultLanguage(model.getDefaultLanguage());
    this.workspaceBasePath(model.getWorkspaceBasePath());
    this.sourceType(model.getSourceType());
    this.gitRepositoryKey(model.getGitRepositoryKey());
    this.gitBranchName(model.getGitBranchName());
    this.gitFolderPath(model.getGitFolderPath());
    this.targetConnection(model.getTargetConnection());
    this.lifecycleState(model.getLifecycleState());
    this.status(model.getStatus());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.updatedBy(model.getUpdatedBy());
    this.timePublished(model.getTimePublished());
    this.publishedBy(model.getPublishedBy());
    this.version(model.getVersion());
    this.freeformTags(model.getFreeformTags());
    this.definedTags(model.getDefinedTags());
    this.systemTags(model.getSystemTags());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    
    public String getId() {
        return id;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

    
    public String getWorkspaceId() {
        return workspaceId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    
    public String getKey() {
        return key;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    
    public String getDisplayName() {
        return displayName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    
    public String getDescription() {
        return description;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    
    public String getNamespace() {
        return namespace;
    }


        /**
     * Creator metadata for the ontology project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creator")
    private final String creator;

        /**
     * Creator metadata for the ontology project.
     * @return the value
     **/
    
    public String getCreator() {
        return creator;
    }


        /**
     * Semantic ontology version metadata for the ontology project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyVersion")
    private final String ontologyVersion;

        /**
     * Semantic ontology version metadata for the ontology project.
     * @return the value
     **/
    
    public String getOntologyVersion() {
        return ontologyVersion;
    }


        /**
     * Base URI metadata for ontology files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("baseUri")
    private final String baseUri;

        /**
     * Base URI metadata for ontology files.
     * @return the value
     **/
    
    public String getBaseUri() {
        return baseUri;
    }


        /**
     * Default language tag metadata for ontology files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultLanguage")
    private final String defaultLanguage;

        /**
     * Default language tag metadata for ontology files.
     * @return the value
     **/
    
    public String getDefaultLanguage() {
        return defaultLanguage;
    }


        /**
     * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceBasePath")
    private final String workspaceBasePath;

        /**
     * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
     * @return the value
     **/
    
    public String getWorkspaceBasePath() {
        return workspaceBasePath;
    }

    
        /**
     * Project content source. Defaults to VOLUME when omitted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final OntologyProjectSourceType sourceType;

        /**
     * Project content source. Defaults to VOLUME when omitted.
     * @return the value
     **/
    
    public OntologyProjectSourceType getSourceType() {
        return sourceType;
    }


        /**
     * Git repository key for git-backed ontology projects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepositoryKey")
    private final String gitRepositoryKey;

        /**
     * Git repository key for git-backed ontology projects.
     * @return the value
     **/
    
    public String getGitRepositoryKey() {
        return gitRepositoryKey;
    }


        /**
     * Git branch name for git-backed ontology projects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
    private final String gitBranchName;

        /**
     * Git branch name for git-backed ontology projects.
     * @return the value
     **/
    
    public String getGitBranchName() {
        return gitBranchName;
    }


        /**
     * Workspace-relative Git folder path for git-backed ontology project content.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Workspace-relative Git folder path for git-backed ontology project content.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("targetConnection")
    private final OntologyPublishTargetConnectionReference targetConnection;

    
    public OntologyPublishTargetConnectionReference getTargetConnection() {
        return targetConnection;
    }


        /**
     * Project lifecycle state. Volume-backed creates initially return CREATING and transition to ACTIVE or FAILED after asynchronous scaffold creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final String lifecycleState;

        /**
     * Project lifecycle state. Volume-backed creates initially return CREATING and transition to ACTIVE or FAILED after asynchronous scaffold creation.
     * @return the value
     **/
    
    public String getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Latest publish or operational status for the project; falls back to lifecycleState when no publish status exists.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * Latest publish or operational status for the project; falls back to lifecycleState when no publish status exists.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
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


        /**
     * Actor identifier for the most recent project metadata update.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * Actor identifier for the most recent project metadata update.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Time when the most recent publish request was created for the project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timePublished")
    private final java.util.Date timePublished;

        /**
     * Time when the most recent publish request was created for the project.
     * @return the value
     **/
    
    public java.util.Date getTimePublished() {
        return timePublished;
    }


        /**
     * Actor identifier for the most recent publish request on the project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("publishedBy")
    private final String publishedBy;

        /**
     * Actor identifier for the most recent publish request on the project.
     * @return the value
     **/
    
    public String getPublishedBy() {
        return publishedBy;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    
    public Integer getVersion() {
        return version;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OntologyProject(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", creator=").append(String.valueOf(this.creator));
        sb.append(", ontologyVersion=").append(String.valueOf(this.ontologyVersion));
        sb.append(", baseUri=").append(String.valueOf(this.baseUri));
        sb.append(", defaultLanguage=").append(String.valueOf(this.defaultLanguage));
        sb.append(", workspaceBasePath=").append(String.valueOf(this.workspaceBasePath));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", gitRepositoryKey=").append(String.valueOf(this.gitRepositoryKey));
        sb.append(", gitBranchName=").append(String.valueOf(this.gitBranchName));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", targetConnection=").append(String.valueOf(this.targetConnection));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", timePublished=").append(String.valueOf(this.timePublished));
        sb.append(", publishedBy=").append(String.valueOf(this.publishedBy));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProject)) {
            return false;
        }

        OntologyProject other = (OntologyProject) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.workspaceId, other.workspaceId) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.creator, other.creator) &&
            java.util.Objects.equals(this.ontologyVersion, other.ontologyVersion) &&
            java.util.Objects.equals(this.baseUri, other.baseUri) &&
            java.util.Objects.equals(this.defaultLanguage, other.defaultLanguage) &&
            java.util.Objects.equals(this.workspaceBasePath, other.workspaceBasePath) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.gitRepositoryKey, other.gitRepositoryKey) &&
            java.util.Objects.equals(this.gitBranchName, other.gitBranchName) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.targetConnection, other.targetConnection) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.timePublished, other.timePublished) &&
            java.util.Objects.equals(this.publishedBy, other.publishedBy) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.freeformTags, other.freeformTags) &&
            java.util.Objects.equals(this.definedTags, other.definedTags) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.creator == null ? 43 : this.creator.hashCode());
        result = (result * PRIME) + (this.ontologyVersion == null ? 43 : this.ontologyVersion.hashCode());
        result = (result * PRIME) + (this.baseUri == null ? 43 : this.baseUri.hashCode());
        result = (result * PRIME) + (this.defaultLanguage == null ? 43 : this.defaultLanguage.hashCode());
        result = (result * PRIME) + (this.workspaceBasePath == null ? 43 : this.workspaceBasePath.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.gitRepositoryKey == null ? 43 : this.gitRepositoryKey.hashCode());
        result = (result * PRIME) + (this.gitBranchName == null ? 43 : this.gitBranchName.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.targetConnection == null ? 43 : this.targetConnection.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.timePublished == null ? 43 : this.timePublished.hashCode());
        result = (result * PRIME) + (this.publishedBy == null ? 43 : this.publishedBy.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
