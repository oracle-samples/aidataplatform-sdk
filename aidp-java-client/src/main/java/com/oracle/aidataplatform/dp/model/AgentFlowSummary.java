package com.oracle.aidataplatform.dp.model;



/**
 * Summary information of Agent flow in the schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowSummary.Builder.class)

public final class AgentFlowSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "workspaceKey", "pathInfo", "type", "deploymentComputeKey", "deploymentMode", "uri", "uriState", "entryFilePath", "dependenciesFilePath", "lifecycleState", "lifecycleDetails", "computeKey", "timeCreated", "timeUpdated", "createdBy", "updatedBy"})
    public AgentFlowSummary(String key, String displayName, String description, String workspaceKey, String pathInfo, Type type, String deploymentComputeKey, String deploymentMode, String uri, String uriState, String entryFilePath, String dependenciesFilePath, AgentFlow.LifecycleState lifecycleState, String lifecycleDetails, String computeKey, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.workspaceKey = workspaceKey;
        this.pathInfo = pathInfo;
        this.type = type;
        this.deploymentComputeKey = deploymentComputeKey;
        this.deploymentMode = deploymentMode;
        this.uri = uri;
        this.uriState = uriState;
        this.entryFilePath = entryFilePath;
        this.dependenciesFilePath = dependenciesFilePath;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.computeKey = computeKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The unique identifier (UUID) of the Agent flow
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The unique identifier (UUID) of the Agent flow
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * AgentFlow name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * AgentFlow name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * AgentFlow description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * AgentFlow description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The key of the workspace to which this Agent flow belongs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * The key of the workspace to which this Agent flow belongs.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Path inside volume where the agentFlow json is written
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pathInfo")
private String pathInfo;

        /**
         * Path inside volume where the agentFlow json is written
         * @param pathInfo the value to set
         * @return this builder
         **/
        

public Builder pathInfo(String pathInfo) {
    this.pathInfo = pathInfo;
    return this;
}
            /**
     * The type of Agent Flow (Canvas or Code)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * The type of Agent Flow (Canvas or Code)
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * The key of the Compute where Agent Flow is deployed
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentComputeKey")
private String deploymentComputeKey;

        /**
         * The key of the Compute where Agent Flow is deployed
         * @param deploymentComputeKey the value to set
         * @return this builder
         **/
        

public Builder deploymentComputeKey(String deploymentComputeKey) {
    this.deploymentComputeKey = deploymentComputeKey;
    return this;
}
            /**
     * Agent flow deployment mode.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentMode")
private String deploymentMode;

        /**
         * Agent flow deployment mode.
         * @param deploymentMode the value to set
         * @return this builder
         **/
        

public Builder deploymentMode(String deploymentMode) {
    this.deploymentMode = deploymentMode;
    return this;
}
            /**
     * Agent flow uri.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uri")
private String uri;

        /**
         * Agent flow uri.
         * @param uri the value to set
         * @return this builder
         **/
        

public Builder uri(String uri) {
    this.uri = uri;
    return this;
}
            /**
     * Agent flow uri state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uriState")
private String uriState;

        /**
         * Agent flow uri state.
         * @param uriState the value to set
         * @return this builder
         **/
        

public Builder uriState(String uriState) {
    this.uriState = uriState;
    return this;
}
            /**
     * The path to project entry file
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
private String entryFilePath;

        /**
         * The path to project entry file
         * @param entryFilePath the value to set
         * @return this builder
         **/
        

public Builder entryFilePath(String entryFilePath) {
    this.entryFilePath = entryFilePath;
    return this;
}
            /**
     * The path to dependencies file
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
private String dependenciesFilePath;

        /**
         * The path to dependencies file
         * @param dependenciesFilePath the value to set
         * @return this builder
         **/
        

public Builder dependenciesFilePath(String dependenciesFilePath) {
    this.dependenciesFilePath = dependenciesFilePath;
    return this;
}
            /**
     * The current state of the Agent Flow.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private AgentFlow.LifecycleState lifecycleState;

        /**
         * The current state of the Agent Flow.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(AgentFlow.LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * A message that describes the current state of the Agent Flow in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
private String lifecycleDetails;

        /**
         * A message that describes the current state of the Agent Flow in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleDetails(String lifecycleDetails) {
    this.lifecycleDetails = lifecycleDetails;
    return this;
}
            /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeKey")
private String computeKey;

        /**
         * The key of the Agent Flow Compute associated with this Agent Flow
         * @param computeKey the value to set
         * @return this builder
         **/
        

public Builder computeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
}
            /**
     * The date and time the Agent flow was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Agent flow was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the Agent flow was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Agent flow was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The OCID of the user/principal who created the Agent flow.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The OCID of the user/principal who created the Agent flow.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The ID of the user who last updated the schema.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the user who last updated the schema.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}


        public AgentFlowSummary build() {
            AgentFlowSummary model = new AgentFlowSummary(this.key
                , this.displayName
                , this.description
                , this.workspaceKey
                , this.pathInfo
                , this.type
                , this.deploymentComputeKey
                , this.deploymentMode
                , this.uri
                , this.uriState
                , this.entryFilePath
                , this.dependenciesFilePath
                , this.lifecycleState
                , this.lifecycleDetails
                , this.computeKey
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.workspaceKey(model.getWorkspaceKey());
    this.pathInfo(model.getPathInfo());
    this.type(model.getType());
    this.deploymentComputeKey(model.getDeploymentComputeKey());
    this.deploymentMode(model.getDeploymentMode());
    this.uri(model.getUri());
    this.uriState(model.getUriState());
    this.entryFilePath(model.getEntryFilePath());
    this.dependenciesFilePath(model.getDependenciesFilePath());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.computeKey(model.getComputeKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
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
     * The unique identifier (UUID) of the Agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique identifier (UUID) of the Agent flow
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * AgentFlow name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * AgentFlow name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * AgentFlow description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * AgentFlow description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The key of the workspace to which this Agent flow belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The key of the workspace to which this Agent flow belongs.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Path inside volume where the agentFlow json is written
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pathInfo")
    private final String pathInfo;

        /**
     * Path inside volume where the agentFlow json is written
     * @return the value
     **/
    
    public String getPathInfo() {
        return pathInfo;
    }

    /**
     * The type of Agent Flow (Canvas or Code)
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Canvas("CANVAS"),
        Code("CODE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
        /**
     * The type of Agent Flow (Canvas or Code)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * The type of Agent Flow (Canvas or Code)
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * The key of the Compute where Agent Flow is deployed
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentComputeKey")
    private final String deploymentComputeKey;

        /**
     * The key of the Compute where Agent Flow is deployed
     * @return the value
     **/
    
    public String getDeploymentComputeKey() {
        return deploymentComputeKey;
    }


        /**
     * Agent flow deployment mode.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentMode")
    private final String deploymentMode;

        /**
     * Agent flow deployment mode.
     * @return the value
     **/
    
    public String getDeploymentMode() {
        return deploymentMode;
    }


        /**
     * Agent flow uri.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

        /**
     * Agent flow uri.
     * @return the value
     **/
    
    public String getUri() {
        return uri;
    }


        /**
     * Agent flow uri state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uriState")
    private final String uriState;

        /**
     * Agent flow uri state.
     * @return the value
     **/
    
    public String getUriState() {
        return uriState;
    }


        /**
     * The path to project entry file
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
    private final String entryFilePath;

        /**
     * The path to project entry file
     * @return the value
     **/
    
    public String getEntryFilePath() {
        return entryFilePath;
    }


        /**
     * The path to dependencies file
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
    private final String dependenciesFilePath;

        /**
     * The path to dependencies file
     * @return the value
     **/
    
    public String getDependenciesFilePath() {
        return dependenciesFilePath;
    }


        /**
     * The current state of the Agent Flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AgentFlow.LifecycleState lifecycleState;

        /**
     * The current state of the Agent Flow.
     * @return the value
     **/
    
    public AgentFlow.LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * A message that describes the current state of the Agent Flow in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

        /**
     * A message that describes the current state of the Agent Flow in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     * @return the value
     **/
    
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }


        /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }


        /**
     * The date and time the Agent flow was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Agent flow was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the Agent flow was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Agent flow was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The OCID of the user/principal who created the Agent flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the user/principal who created the Agent flow.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the schema.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
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
        sb.append("AgentFlowSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", pathInfo=").append(String.valueOf(this.pathInfo));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", deploymentComputeKey=").append(String.valueOf(this.deploymentComputeKey));
        sb.append(", deploymentMode=").append(String.valueOf(this.deploymentMode));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", uriState=").append(String.valueOf(this.uriState));
        sb.append(", entryFilePath=").append(String.valueOf(this.entryFilePath));
        sb.append(", dependenciesFilePath=").append(String.valueOf(this.dependenciesFilePath));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowSummary)) {
            return false;
        }

        AgentFlowSummary other = (AgentFlowSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.pathInfo, other.pathInfo) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.deploymentComputeKey, other.deploymentComputeKey) &&
            java.util.Objects.equals(this.deploymentMode, other.deploymentMode) &&
            java.util.Objects.equals(this.uri, other.uri) &&
            java.util.Objects.equals(this.uriState, other.uriState) &&
            java.util.Objects.equals(this.entryFilePath, other.entryFilePath) &&
            java.util.Objects.equals(this.dependenciesFilePath, other.dependenciesFilePath) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.pathInfo == null ? 43 : this.pathInfo.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.deploymentComputeKey == null ? 43 : this.deploymentComputeKey.hashCode());
        result = (result * PRIME) + (this.deploymentMode == null ? 43 : this.deploymentMode.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.uriState == null ? 43 : this.uriState.hashCode());
        result = (result * PRIME) + (this.entryFilePath == null ? 43 : this.entryFilePath.hashCode());
        result = (result * PRIME) + (this.dependenciesFilePath == null ? 43 : this.dependenciesFilePath.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        return result;
    }


}
