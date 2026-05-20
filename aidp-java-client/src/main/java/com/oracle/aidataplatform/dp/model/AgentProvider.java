// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Service provider information for an agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentProvider.Builder.class)

public final class AgentProvider  {
    @Deprecated
    @java.beans.ConstructorProperties({"organization", "url"})
    public AgentProvider(String organization, String url) {
        super();
        this.organization = organization;
        this.url = url;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The name of the agent provider's organization.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("organization")
private String organization;

        /**
         * The name of the agent provider's organization.
         * @param organization the value to set
         * @return this builder
         **/
        

public Builder organization(String organization) {
    this.organization = organization;
    return this;
}
            /**
     * A URL for the agent provider's website or documentation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("url")
private String url;

        /**
         * A URL for the agent provider's website or documentation.
         * @param url the value to set
         * @return this builder
         **/
        

public Builder url(String url) {
    this.url = url;
    return this;
}


        public AgentProvider build() {
            AgentProvider model = new AgentProvider(this.organization
                , this.url);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentProvider model) {
                this.organization(model.getOrganization());
    this.url(model.getUrl());
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
     * The name of the agent provider's organization.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

        /**
     * The name of the agent provider's organization.
     * @return the value
     **/
    
    public String getOrganization() {
        return organization;
    }


        /**
     * A URL for the agent provider's website or documentation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

        /**
     * A URL for the agent provider's website or documentation.
     * @return the value
     **/
    
    public String getUrl() {
        return url;
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
        sb.append("AgentProvider(");
        sb.append("organization=").append(String.valueOf(this.organization));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentProvider)) {
            return false;
        }

        AgentProvider other = (AgentProvider) o;
        return java.util.Objects.equals(this.organization, other.organization) &&
            java.util.Objects.equals(this.url, other.url);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        return result;
    }


}
