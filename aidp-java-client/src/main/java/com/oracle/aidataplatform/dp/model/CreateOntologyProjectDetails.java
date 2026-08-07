// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateOntologyProjectDetails.Builder.class)

public final class CreateOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"workspaceId", "key", "displayName", "description", "namespace", "creator", "ontologyVersion", "baseUri", "defaultLanguage", "workspaceBasePath", "sourceType", "gitRepositoryKey", "gitBranchName", "gitFolderPath"})
    public CreateOntologyProjectDetails(String workspaceId, String key, String displayName, String description, String namespace, String creator, String ontologyVersion, String baseUri, String defaultLanguage, String workspaceBasePath, OntologyProjectSourceType sourceType, String gitRepositoryKey, String gitBranchName, String gitFolderPath) {
        super();
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
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
     * Creator name written into the generated project.yaml metadata file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("creator")
private String creator;

        /**
         * Creator name written into the generated project.yaml metadata file.
         * @param creator the value to set
         * @return this builder
         **/
        

public Builder creator(String creator) {
    this.creator = creator;
    return this;
}
            /**
     * Initial semantic ontology version written into project.yaml.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ontologyVersion")
private String ontologyVersion;

        /**
         * Initial semantic ontology version written into project.yaml.
         * @param ontologyVersion the value to set
         * @return this builder
         **/
        

public Builder ontologyVersion(String ontologyVersion) {
    this.ontologyVersion = ontologyVersion;
    return this;
}
            /**
     * Base URI written as baseURI in project.yaml.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("baseUri")
private String baseUri;

        /**
         * Base URI written as baseURI in project.yaml.
         * @param baseUri the value to set
         * @return this builder
         **/
        

public Builder baseUri(String baseUri) {
    this.baseUri = baseUri;
    return this;
}
            /**
     * Default language tag written into project.yaml.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("defaultLanguage")
private String defaultLanguage;

        /**
         * Default language tag written into project.yaml.
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


        public CreateOntologyProjectDetails build() {
            CreateOntologyProjectDetails model = new CreateOntologyProjectDetails(this.workspaceId
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
                , this.gitFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOntologyProjectDetails model) {
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
     * Creator name written into the generated project.yaml metadata file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creator")
    private final String creator;

        /**
     * Creator name written into the generated project.yaml metadata file.
     * @return the value
     **/
    
    public String getCreator() {
        return creator;
    }


        /**
     * Initial semantic ontology version written into project.yaml.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyVersion")
    private final String ontologyVersion;

        /**
     * Initial semantic ontology version written into project.yaml.
     * @return the value
     **/
    
    public String getOntologyVersion() {
        return ontologyVersion;
    }


        /**
     * Base URI written as baseURI in project.yaml.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("baseUri")
    private final String baseUri;

        /**
     * Base URI written as baseURI in project.yaml.
     * @return the value
     **/
    
    public String getBaseUri() {
        return baseUri;
    }


        /**
     * Default language tag written into project.yaml.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultLanguage")
    private final String defaultLanguage;

        /**
     * Default language tag written into project.yaml.
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
        sb.append("CreateOntologyProjectDetails(");
        sb.append("workspaceId=").append(String.valueOf(this.workspaceId));
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOntologyProjectDetails)) {
            return false;
        }

        CreateOntologyProjectDetails other = (CreateOntologyProjectDetails) o;
        return java.util.Objects.equals(this.workspaceId, other.workspaceId) &&
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
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        return result;
    }


}
