// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Ontology discovery job metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyDiscoveryJob.Builder.class)

public final class OntologyDiscoveryJob  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "projectKey", "displayName", "lifecycleState", "progress", "artifacts", "errorCode", "errorMessage", "creator", "timeCreated", "timeUpdated"})
    public OntologyDiscoveryJob(String id, String projectKey, String displayName, String lifecycleState, OntologyDiscoveryProgress progress, OntologyDiscoveryArtifacts artifacts, String errorCode, String errorMessage, String creator, java.util.Date timeCreated, java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.projectKey = projectKey;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.progress = progress;
        this.artifacts = artifacts;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.creator = creator;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Discovery job identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Discovery job identifier.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Ontology project key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectKey")
private String projectKey;

        /**
         * Ontology project key.
         * @param projectKey the value to set
         * @return this builder
         **/
        

public Builder projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
}
            /**
     * Discovery job display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Discovery job display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Discovery job lifecycle state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private String lifecycleState;

        /**
         * Discovery job lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("progress")
private OntologyDiscoveryProgress progress;



public Builder progress(OntologyDiscoveryProgress progress) {
    this.progress = progress;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("artifacts")
private OntologyDiscoveryArtifacts artifacts;



public Builder artifacts(OntologyDiscoveryArtifacts artifacts) {
    this.artifacts = artifacts;
    return this;
}
            /**
     * Discovery failure code.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorCode")
private String errorCode;

        /**
         * Discovery failure code.
         * @param errorCode the value to set
         * @return this builder
         **/
        

public Builder errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
}
            /**
     * Discovery failure message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
private String errorMessage;

        /**
         * Discovery failure message.
         * @param errorMessage the value to set
         * @return this builder
         **/
        

public Builder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
}
            /**
     * Discovery job creator.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("creator")
private String creator;

        /**
         * Discovery job creator.
         * @param creator the value to set
         * @return this builder
         **/
        

public Builder creator(String creator) {
    this.creator = creator;
    return this;
}
            /**
     * Discovery job creation time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Discovery job creation time.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Discovery job update time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * Discovery job update time.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}


        public OntologyDiscoveryJob build() {
            OntologyDiscoveryJob model = new OntologyDiscoveryJob(this.id
                , this.projectKey
                , this.displayName
                , this.lifecycleState
                , this.progress
                , this.artifacts
                , this.errorCode
                , this.errorMessage
                , this.creator
                , this.timeCreated
                , this.timeUpdated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyDiscoveryJob model) {
                this.id(model.getId());
    this.projectKey(model.getProjectKey());
    this.displayName(model.getDisplayName());
    this.lifecycleState(model.getLifecycleState());
    this.progress(model.getProgress());
    this.artifacts(model.getArtifacts());
    this.errorCode(model.getErrorCode());
    this.errorMessage(model.getErrorMessage());
    this.creator(model.getCreator());
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

    


        /**
     * Discovery job identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Discovery job identifier.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Ontology project key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectKey")
    private final String projectKey;

        /**
     * Ontology project key.
     * @return the value
     **/
    
    public String getProjectKey() {
        return projectKey;
    }


        /**
     * Discovery job display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Discovery job display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Discovery job lifecycle state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final String lifecycleState;

        /**
     * Discovery job lifecycle state.
     * @return the value
     **/
    
    public String getLifecycleState() {
        return lifecycleState;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final OntologyDiscoveryProgress progress;

    
    public OntologyDiscoveryProgress getProgress() {
        return progress;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
    private final OntologyDiscoveryArtifacts artifacts;

    
    public OntologyDiscoveryArtifacts getArtifacts() {
        return artifacts;
    }


        /**
     * Discovery failure code.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

        /**
     * Discovery failure code.
     * @return the value
     **/
    
    public String getErrorCode() {
        return errorCode;
    }


        /**
     * Discovery failure message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * Discovery failure message.
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
    }


        /**
     * Discovery job creator.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("creator")
    private final String creator;

        /**
     * Discovery job creator.
     * @return the value
     **/
    
    public String getCreator() {
        return creator;
    }


        /**
     * Discovery job creation time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Discovery job creation time.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Discovery job update time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Discovery job update time.
     * @return the value
     **/
    
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
        sb.append("OntologyDiscoveryJob(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", projectKey=").append(String.valueOf(this.projectKey));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(", artifacts=").append(String.valueOf(this.artifacts));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", creator=").append(String.valueOf(this.creator));
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
        if (!(o instanceof OntologyDiscoveryJob)) {
            return false;
        }

        OntologyDiscoveryJob other = (OntologyDiscoveryJob) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.projectKey, other.projectKey) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.progress, other.progress) &&
            java.util.Objects.equals(this.artifacts, other.artifacts) &&
            java.util.Objects.equals(this.errorCode, other.errorCode) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.equals(this.creator, other.creator) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.projectKey == null ? 43 : this.projectKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        result = (result * PRIME) + (this.artifacts == null ? 43 : this.artifacts.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.creator == null ? 43 : this.creator.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        return result;
    }


}
