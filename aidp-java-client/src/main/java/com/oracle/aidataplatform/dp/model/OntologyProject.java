// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Ontology Manager project metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProject.Builder.class)

public final class OntologyProject  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "workspaceId", "key", "displayName", "description", "namespace", "workspaceBasePath", "lifecycleState", "timeCreated", "timeUpdated", "version", "freeformTags", "definedTags", "systemTags"})
    public OntologyProject(String id, String workspaceId, String key, String displayName, String description, String namespace, String workspaceBasePath, String lifecycleState, java.util.Date timeCreated, java.util.Date timeUpdated, Integer version, java.util.Map<String, String> freeformTags, java.util.Map<String, java.util.Map<String, Object>> definedTags, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.workspaceId = workspaceId;
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.namespace = namespace;
        this.workspaceBasePath = workspaceBasePath;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
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
                , this.workspaceBasePath
                , this.lifecycleState
                , this.timeCreated
                , this.timeUpdated
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
    this.workspaceBasePath(model.getWorkspaceBasePath());
    this.lifecycleState(model.getLifecycleState());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
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
        sb.append(", workspaceBasePath=").append(String.valueOf(this.workspaceBasePath));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
            java.util.Objects.equals(this.workspaceBasePath, other.workspaceBasePath) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
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
        result = (result * PRIME) + (this.workspaceBasePath == null ? 43 : this.workspaceBasePath.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
