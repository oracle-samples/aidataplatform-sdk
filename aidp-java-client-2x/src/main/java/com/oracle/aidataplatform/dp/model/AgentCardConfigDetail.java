// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of the A2A publish request payload.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentCardConfigDetail.Builder.class)

public final class AgentCardConfigDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "skills", "capabilities", "version", "provider", "documentationUrl"})
    public AgentCardConfigDetail(String name, String description, java.util.List<AgentCardSkillDetail> skills, AgentCardCapabilitiesDetail capabilities, String version, AgentProvider provider, String documentationUrl) {
        super();
        this.name = name;
        this.description = description;
        this.skills = skills;
        this.capabilities = capabilities;
        this.version = version;
        this.provider = provider;
        this.documentationUrl = documentationUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Human-readable agent name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Human-readable agent name.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Human-readable agent description.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Human-readable agent description.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * List of skills supported by the agent.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("skills")
        private java.util.List<AgentCardSkillDetail> skills;

                /**
         * List of skills supported by the agent.
         * @param skills the value to set
         * @return this builder
         **/
        

        public Builder skills(java.util.List<AgentCardSkillDetail> skills) {
        this.skills = skills;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private AgentCardCapabilitiesDetail capabilities;

        

        public Builder capabilities(AgentCardCapabilitiesDetail capabilities) {
        this.capabilities = capabilities;
        return this;
        }
            /**
     * Agent version string.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

                /**
         * Agent version string.
         * @param version the value to set
         * @return this builder
         **/
        

        public Builder version(String version) {
        this.version = version;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("provider")
        private AgentProvider provider;

        

        public Builder provider(AgentProvider provider) {
        this.provider = provider;
        return this;
        }
            /**
     * Documentation URL for the agent. Serialized as {@code documentation_url}.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("documentationUrl")
        private String documentationUrl;

                /**
         * Documentation URL for the agent. Serialized as {@code documentation_url}.
         * @param documentationUrl the value to set
         * @return this builder
         **/
        

        public Builder documentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
        }


        public AgentCardConfigDetail build() {
            AgentCardConfigDetail model = new AgentCardConfigDetail(this.name
                    , this.description
                    , this.skills
                    , this.capabilities
                    , this.version
                    , this.provider
                    , this.documentationUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentCardConfigDetail model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.skills(model.getSkills());
    this.capabilities(model.getCapabilities());
    this.version(model.getVersion());
    this.provider(model.getProvider());
    this.documentationUrl(model.getDocumentationUrl());
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
     * Human-readable agent name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Human-readable agent name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Human-readable agent description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Human-readable agent description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * List of skills supported by the agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("skills")
    private final java.util.List<AgentCardSkillDetail> skills;

        /**
     * List of skills supported by the agent.
     * @return the value
     **/
    
    public java.util.List<AgentCardSkillDetail> getSkills() {
        return skills;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final AgentCardCapabilitiesDetail capabilities;

    
    public AgentCardCapabilitiesDetail getCapabilities() {
        return capabilities;
    }


        /**
     * Agent version string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Agent version string.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final AgentProvider provider;

    
    public AgentProvider getProvider() {
        return provider;
    }


        /**
     * Documentation URL for the agent. Serialized as {@code documentation_url}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("documentationUrl")
    private final String documentationUrl;

        /**
     * Documentation URL for the agent. Serialized as {@code documentation_url}.
     * @return the value
     **/
    
    public String getDocumentationUrl() {
        return documentationUrl;
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
        sb.append("AgentCardConfigDetail(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", skills=").append(String.valueOf(this.skills));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", provider=").append(String.valueOf(this.provider));
        sb.append(", documentationUrl=").append(String.valueOf(this.documentationUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentCardConfigDetail)) {
            return false;
        }

        AgentCardConfigDetail other = (AgentCardConfigDetail) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.skills, other.skills) &&
            java.util.Objects.equals(this.capabilities, other.capabilities) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.provider, other.provider) &&
            java.util.Objects.equals(this.documentationUrl, other.documentationUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.skills == null ? 43 : this.skills.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.documentationUrl == null ? 43 : this.documentationUrl.hashCode());
        return result;
    }


}
