// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=McpToolConfiguration.Builder.class)

public final class McpToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"endpoint", "auth", "allowedTools", "customHeaders"})
    public McpToolConfiguration(String endpoint, Auth auth, java.util.List<AllowedToolDetails> allowedTools, java.util.Map<String, String> customHeaders) {
        super();
        this.endpoint = endpoint;
        this.auth = auth;
        this.allowedTools = allowedTools;
        this.customHeaders = customHeaders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The endpoint of the mcp to connect to
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

                /**
         * The endpoint of the mcp to connect to
         * @param endpoint the value to set
         * @return this builder
         **/
        

        public Builder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("auth")
        private Auth auth;

        

        public Builder auth(Auth auth) {
        this.auth = auth;
        return this;
        }
            /**
     * The list of allowed tools on an MCP server.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("allowedTools")
        private java.util.List<AllowedToolDetails> allowedTools;

                /**
         * The list of allowed tools on an MCP server.
         * @param allowedTools the value to set
         * @return this builder
         **/
        

        public Builder allowedTools(java.util.List<AllowedToolDetails> allowedTools) {
        this.allowedTools = allowedTools;
        return this;
        }
            /**
     * Map of header key value pairs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
        private java.util.Map<String, String> customHeaders;

                /**
         * Map of header key value pairs.
         * @param customHeaders the value to set
         * @return this builder
         **/
        

        public Builder customHeaders(java.util.Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
        }


        public McpToolConfiguration build() {
            McpToolConfiguration model = new McpToolConfiguration(this.endpoint
                    , this.auth
                    , this.allowedTools
                    , this.customHeaders);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(McpToolConfiguration model) {
                this.endpoint(model.getEndpoint());
    this.auth(model.getAuth());
    this.allowedTools(model.getAllowedTools());
    this.customHeaders(model.getCustomHeaders());
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
     * The endpoint of the mcp to connect to
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

        /**
     * The endpoint of the mcp to connect to
     * @return the value
     **/
    
    public String getEndpoint() {
        return endpoint;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("auth")
    private final Auth auth;

    
    public Auth getAuth() {
        return auth;
    }


        /**
     * The list of allowed tools on an MCP server.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("allowedTools")
    private final java.util.List<AllowedToolDetails> allowedTools;

        /**
     * The list of allowed tools on an MCP server.
     * @return the value
     **/
    
    public java.util.List<AllowedToolDetails> getAllowedTools() {
        return allowedTools;
    }


        /**
     * Map of header key value pairs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
    private final java.util.Map<String, String> customHeaders;

        /**
     * Map of header key value pairs.
     * @return the value
     **/
    
    public java.util.Map<String, String> getCustomHeaders() {
        return customHeaders;
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
        sb.append("McpToolConfiguration(");
        sb.append("endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", auth=").append(String.valueOf(this.auth));
        sb.append(", allowedTools=").append(String.valueOf(this.allowedTools));
        sb.append(", customHeaders=").append(String.valueOf(this.customHeaders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpToolConfiguration)) {
            return false;
        }

        McpToolConfiguration other = (McpToolConfiguration) o;
        return java.util.Objects.equals(this.endpoint, other.endpoint) &&
            java.util.Objects.equals(this.auth, other.auth) &&
            java.util.Objects.equals(this.allowedTools, other.allowedTools) &&
            java.util.Objects.equals(this.customHeaders, other.customHeaders);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.auth == null ? 43 : this.auth.hashCode());
        result = (result * PRIME) + (this.allowedTools == null ? 43 : this.allowedTools.hashCode());
        result = (result * PRIME) + (this.customHeaders == null ? 43 : this.customHeaders.hashCode());
        return result;
    }


}
