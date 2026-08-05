// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for starting an ontology project publish.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PublishOntologyProjectDetails.Builder.class)

public final class PublishOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"workspaceId", "projectName", "comment", "targetConnection"})
    public PublishOntologyProjectDetails(String workspaceId, String projectName, String comment, OntologyPublishTargetConnectionReference targetConnection) {
        super();
        this.workspaceId = workspaceId;
        this.projectName = projectName;
        this.comment = comment;
        this.targetConnection = targetConnection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace containing the ontology project when publishing by project name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
private String workspaceId;

        /**
         * Workspace containing the ontology project when publishing by project name.
         * @param workspaceId the value to set
         * @return this builder
         **/
        

public Builder workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
}
            /**
     * Ontology project key/name to publish.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectName")
private String projectName;

        /**
         * Ontology project key/name to publish.
         * @param projectName the value to set
         * @return this builder
         **/
        

public Builder projectName(String projectName) {
    this.projectName = projectName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("comment")
private String comment;



public Builder comment(String comment) {
    this.comment = comment;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("targetConnection")
private OntologyPublishTargetConnectionReference targetConnection;



public Builder targetConnection(OntologyPublishTargetConnectionReference targetConnection) {
    this.targetConnection = targetConnection;
    return this;
}


        public PublishOntologyProjectDetails build() {
            PublishOntologyProjectDetails model = new PublishOntologyProjectDetails(this.workspaceId
                , this.projectName
                , this.comment
                , this.targetConnection);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishOntologyProjectDetails model) {
                this.workspaceId(model.getWorkspaceId());
    this.projectName(model.getProjectName());
    this.comment(model.getComment());
    this.targetConnection(model.getTargetConnection());
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
     * Workspace containing the ontology project when publishing by project name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

        /**
     * Workspace containing the ontology project when publishing by project name.
     * @return the value
     **/
    
    public String getWorkspaceId() {
        return workspaceId;
    }


        /**
     * Ontology project key/name to publish.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectName")
    private final String projectName;

        /**
     * Ontology project key/name to publish.
     * @return the value
     **/
    
    public String getProjectName() {
        return projectName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    
    public String getComment() {
        return comment;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("targetConnection")
    private final OntologyPublishTargetConnectionReference targetConnection;

    
    public OntologyPublishTargetConnectionReference getTargetConnection() {
        return targetConnection;
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
        sb.append("PublishOntologyProjectDetails(");
        sb.append("workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", projectName=").append(String.valueOf(this.projectName));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", targetConnection=").append(String.valueOf(this.targetConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishOntologyProjectDetails)) {
            return false;
        }

        PublishOntologyProjectDetails other = (PublishOntologyProjectDetails) o;
        return java.util.Objects.equals(this.workspaceId, other.workspaceId) &&
            java.util.Objects.equals(this.projectName, other.projectName) &&
            java.util.Objects.equals(this.comment, other.comment) &&
            java.util.Objects.equals(this.targetConnection, other.targetConnection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.projectName == null ? 43 : this.projectName.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.targetConnection == null ? 43 : this.targetConnection.hashCode());
        return result;
    }


}
