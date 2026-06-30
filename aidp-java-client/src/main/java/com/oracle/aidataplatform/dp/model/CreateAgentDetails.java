// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to create a agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAgentDetails.Builder.class)

public final class CreateAgentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "pathInfo", "type", "entryFilePath", "dependenciesFilePath", "computeKey", "guardrails", "sessionConfig", "agentCardConfig", "diagram"})
    public CreateAgentDetails(String displayName, String description, String pathInfo, Type type, String entryFilePath, String dependenciesFilePath, String computeKey, GuardrailsConfiguration guardrails, SessionConfiguration sessionConfig, AgentCardConfigDetail agentCardConfig, AgentDiagram diagram) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.pathInfo = pathInfo;
        this.type = type;
        this.entryFilePath = entryFilePath;
        this.dependenciesFilePath = dependenciesFilePath;
        this.computeKey = computeKey;
        this.guardrails = guardrails;
        this.sessionConfig = sessionConfig;
        this.agentCardConfig = agentCardConfig;
        this.diagram = diagram;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Agent name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Agent name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Agent description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Agent description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Path inside volume where the agent JSON is written.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pathInfo")
private String pathInfo;

        /**
         * Path inside volume where the agent JSON is written.
         * @param pathInfo the value to set
         * @return this builder
         **/
        

public Builder pathInfo(String pathInfo) {
    this.pathInfo = pathInfo;
    return this;
}
            /**
     * The type of agent (Canvas or Code).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * The type of agent (Canvas or Code).
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * The path to project entry file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
private String entryFilePath;

        /**
         * The path to project entry file.
         * @param entryFilePath the value to set
         * @return this builder
         **/
        

public Builder entryFilePath(String entryFilePath) {
    this.entryFilePath = entryFilePath;
    return this;
}
            /**
     * The path to dependencies file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
private String dependenciesFilePath;

        /**
         * The path to dependencies file.
         * @param dependenciesFilePath the value to set
         * @return this builder
         **/
        

public Builder dependenciesFilePath(String dependenciesFilePath) {
    this.dependenciesFilePath = dependenciesFilePath;
    return this;
}
            /**
     * The key of the agent compute associated with this agent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeKey")
private String computeKey;

        /**
         * The key of the agent compute associated with this agent.
         * @param computeKey the value to set
         * @return this builder
         **/
        

public Builder computeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("guardrails")
private GuardrailsConfiguration guardrails;



public Builder guardrails(GuardrailsConfiguration guardrails) {
    this.guardrails = guardrails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
private SessionConfiguration sessionConfig;



public Builder sessionConfig(SessionConfiguration sessionConfig) {
    this.sessionConfig = sessionConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("agentCardConfig")
private AgentCardConfigDetail agentCardConfig;



public Builder agentCardConfig(AgentCardConfigDetail agentCardConfig) {
    this.agentCardConfig = agentCardConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("diagram")
private AgentDiagram diagram;



public Builder diagram(AgentDiagram diagram) {
    this.diagram = diagram;
    return this;
}


        public CreateAgentDetails build() {
            CreateAgentDetails model = new CreateAgentDetails(this.displayName
                , this.description
                , this.pathInfo
                , this.type
                , this.entryFilePath
                , this.dependenciesFilePath
                , this.computeKey
                , this.guardrails
                , this.sessionConfig
                , this.agentCardConfig
                , this.diagram);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.pathInfo(model.getPathInfo());
    this.type(model.getType());
    this.entryFilePath(model.getEntryFilePath());
    this.dependenciesFilePath(model.getDependenciesFilePath());
    this.computeKey(model.getComputeKey());
    this.guardrails(model.getGuardrails());
    this.sessionConfig(model.getSessionConfig());
    this.agentCardConfig(model.getAgentCardConfig());
    this.diagram(model.getDiagram());
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
     * Agent name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Agent name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Agent description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Agent description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Path inside volume where the agent JSON is written.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pathInfo")
    private final String pathInfo;

        /**
     * Path inside volume where the agent JSON is written.
     * @return the value
     **/
    
    public String getPathInfo() {
        return pathInfo;
    }

    /**
     * The type of agent (Canvas or Code).
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
     * The type of agent (Canvas or Code).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * The type of agent (Canvas or Code).
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * The path to project entry file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
    private final String entryFilePath;

        /**
     * The path to project entry file.
     * @return the value
     **/
    
    public String getEntryFilePath() {
        return entryFilePath;
    }


        /**
     * The path to dependencies file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
    private final String dependenciesFilePath;

        /**
     * The path to dependencies file.
     * @return the value
     **/
    
    public String getDependenciesFilePath() {
        return dependenciesFilePath;
    }


        /**
     * The key of the agent compute associated with this agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * The key of the agent compute associated with this agent.
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("guardrails")
    private final GuardrailsConfiguration guardrails;

    
    public GuardrailsConfiguration getGuardrails() {
        return guardrails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
    private final SessionConfiguration sessionConfig;

    
    public SessionConfiguration getSessionConfig() {
        return sessionConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardConfig")
    private final AgentCardConfigDetail agentCardConfig;

    
    public AgentCardConfigDetail getAgentCardConfig() {
        return agentCardConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("diagram")
    private final AgentDiagram diagram;

    
    public AgentDiagram getDiagram() {
        return diagram;
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
        sb.append("CreateAgentDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", pathInfo=").append(String.valueOf(this.pathInfo));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", entryFilePath=").append(String.valueOf(this.entryFilePath));
        sb.append(", dependenciesFilePath=").append(String.valueOf(this.dependenciesFilePath));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", guardrails=").append(String.valueOf(this.guardrails));
        sb.append(", sessionConfig=").append(String.valueOf(this.sessionConfig));
        sb.append(", agentCardConfig=").append(String.valueOf(this.agentCardConfig));
        sb.append(", diagram=").append(String.valueOf(this.diagram));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentDetails)) {
            return false;
        }

        CreateAgentDetails other = (CreateAgentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.pathInfo, other.pathInfo) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.entryFilePath, other.entryFilePath) &&
            java.util.Objects.equals(this.dependenciesFilePath, other.dependenciesFilePath) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.guardrails, other.guardrails) &&
            java.util.Objects.equals(this.sessionConfig, other.sessionConfig) &&
            java.util.Objects.equals(this.agentCardConfig, other.agentCardConfig) &&
            java.util.Objects.equals(this.diagram, other.diagram);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.pathInfo == null ? 43 : this.pathInfo.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.entryFilePath == null ? 43 : this.entryFilePath.hashCode());
        result = (result * PRIME) + (this.dependenciesFilePath == null ? 43 : this.dependenciesFilePath.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.guardrails == null ? 43 : this.guardrails.hashCode());
        result = (result * PRIME) + (this.sessionConfig == null ? 43 : this.sessionConfig.hashCode());
        result = (result * PRIME) + (this.agentCardConfig == null ? 43 : this.agentCardConfig.hashCode());
        result = (result * PRIME) + (this.diagram == null ? 43 : this.diagram.hashCode());
        return result;
    }


}
