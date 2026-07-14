// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateOntologyProjectDetails.Builder.class)

public final class UpdateOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "namespace", "workspaceBasePath", "lifecycleState"})
    public UpdateOntologyProjectDetails(String key, String displayName, String description, String namespace, String workspaceBasePath, String lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.namespace = namespace;
        this.workspaceBasePath = workspaceBasePath;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("workspaceBasePath")
private String workspaceBasePath;



public Builder workspaceBasePath(String workspaceBasePath) {
    this.workspaceBasePath = workspaceBasePath;
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
                , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOntologyProjectDetails model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.namespace(model.getNamespace());
    this.workspaceBasePath(model.getWorkspaceBasePath());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceBasePath")
    private final String workspaceBasePath;

    
    public String getWorkspaceBasePath() {
        return workspaceBasePath;
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
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
