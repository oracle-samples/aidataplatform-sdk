// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateOntologyProjectDetails.Builder.class)

public final class UpdateOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "namespace", "workspaceBasePath", "sourceType", "gitRepositoryKey", "gitBranchName", "gitFolderPath", "lifecycleState"})
    public UpdateOntologyProjectDetails(String key, String displayName, String description, String namespace, String workspaceBasePath, OntologyProjectSourceType sourceType, String gitRepositoryKey, String gitBranchName, String gitFolderPath, String lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.namespace = namespace;
        this.workspaceBasePath = workspaceBasePath;
        this.sourceType = sourceType;
        this.gitRepositoryKey = gitRepositoryKey;
        this.gitBranchName = gitBranchName;
        this.gitFolderPath = gitFolderPath;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
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
     * Project content source.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceType")
private OntologyProjectSourceType sourceType;

        /**
         * Project content source.
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
        
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private String lifecycleState;



public Builder lifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}


        public UpdateOntologyProjectDetails build() {
            UpdateOntologyProjectDetails model = new UpdateOntologyProjectDetails(this.key
                , this.displayName
                , this.description
                , this.namespace
                , this.workspaceBasePath
                , this.sourceType
                , this.gitRepositoryKey
                , this.gitBranchName
                , this.gitFolderPath
                , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOntologyProjectDetails model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.namespace(model.getNamespace());
    this.workspaceBasePath(model.getWorkspaceBasePath());
    this.sourceType(model.getSourceType());
    this.gitRepositoryKey(model.getGitRepositoryKey());
    this.gitBranchName(model.getGitBranchName());
    this.gitFolderPath(model.getGitFolderPath());
    this.lifecycleState(model.getLifecycleState());
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
     * Project content source.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final OntologyProjectSourceType sourceType;

        /**
     * Project content source.
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final String lifecycleState;

    
    public String getLifecycleState() {
        return lifecycleState;
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
        sb.append("UpdateOntologyProjectDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", workspaceBasePath=").append(String.valueOf(this.workspaceBasePath));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", gitRepositoryKey=").append(String.valueOf(this.gitRepositoryKey));
        sb.append(", gitBranchName=").append(String.valueOf(this.gitBranchName));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOntologyProjectDetails)) {
            return false;
        }

        UpdateOntologyProjectDetails other = (UpdateOntologyProjectDetails) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.workspaceBasePath, other.workspaceBasePath) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.gitRepositoryKey, other.gitRepositoryKey) &&
            java.util.Objects.equals(this.gitBranchName, other.gitBranchName) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.workspaceBasePath == null ? 43 : this.workspaceBasePath.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.gitRepositoryKey == null ? 43 : this.gitRepositoryKey.hashCode());
        result = (result * PRIME) + (this.gitBranchName == null ? 43 : this.gitBranchName.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
