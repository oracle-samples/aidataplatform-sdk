// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration for a custom tool package uploaded to the workspace volume.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CustomToolConfiguration.Builder.class)

public final class CustomToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "version", "packagePath", "requirementsHash", "auth", "toolProvider", "tools"})
    public CustomToolConfiguration(String displayName, String description, String version, String packagePath, String requirementsHash, Auth auth, String toolProvider, java.util.List<CustomToolEntry> tools) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.version = version;
        this.packagePath = packagePath;
        this.requirementsHash = requirementsHash;
        this.auth = auth;
        this.toolProvider = toolProvider;
        this.tools = tools;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Human-readable name for this tool package
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Human-readable name for this tool package
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Description of the tool package
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the tool package
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Tool package version
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * Tool package version
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(String version) {
    this.version = version;
    return this;
}
            /**
     * Workspace volume path to the uploaded ZIP file
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("packagePath")
private String packagePath;

        /**
         * Workspace volume path to the uploaded ZIP file
         * @param packagePath the value to set
         * @return this builder
         **/
        

public Builder packagePath(String packagePath) {
    this.packagePath = packagePath;
    return this;
}
            /**
     * SHA256 hash of requirements.txt for dependency caching
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("requirementsHash")
private String requirementsHash;

        /**
         * SHA256 hash of requirements.txt for dependency caching
         * @param requirementsHash the value to set
         * @return this builder
         **/
        

public Builder requirementsHash(String requirementsHash) {
    this.requirementsHash = requirementsHash;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("auth")
private Auth auth;



public Builder auth(Auth auth) {
    this.auth = auth;
    return this;
}
            /**
     * Tool provider identifier
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toolProvider")
private String toolProvider;

        /**
         * Tool provider identifier
         * @param toolProvider the value to set
         * @return this builder
         **/
        

public Builder toolProvider(String toolProvider) {
    this.toolProvider = toolProvider;
    return this;
}
            /**
     * List of tool class entries in this package (multi-tool support)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tools")
private java.util.List<CustomToolEntry> tools;

        /**
         * List of tool class entries in this package (multi-tool support)
         * @param tools the value to set
         * @return this builder
         **/
        

public Builder tools(java.util.List<CustomToolEntry> tools) {
    this.tools = tools;
    return this;
}


        public CustomToolConfiguration build() {
            CustomToolConfiguration model = new CustomToolConfiguration(this.displayName
                , this.description
                , this.version
                , this.packagePath
                , this.requirementsHash
                , this.auth
                , this.toolProvider
                , this.tools);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomToolConfiguration model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.version(model.getVersion());
    this.packagePath(model.getPackagePath());
    this.requirementsHash(model.getRequirementsHash());
    this.auth(model.getAuth());
    this.toolProvider(model.getToolProvider());
    this.tools(model.getTools());
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
     * Human-readable name for this tool package
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Human-readable name for this tool package
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Description of the tool package
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the tool package
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Tool package version
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Tool package version
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * Workspace volume path to the uploaded ZIP file
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("packagePath")
    private final String packagePath;

        /**
     * Workspace volume path to the uploaded ZIP file
     * @return the value
     **/
    
    public String getPackagePath() {
        return packagePath;
    }


        /**
     * SHA256 hash of requirements.txt for dependency caching
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("requirementsHash")
    private final String requirementsHash;

        /**
     * SHA256 hash of requirements.txt for dependency caching
     * @return the value
     **/
    
    public String getRequirementsHash() {
        return requirementsHash;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("auth")
    private final Auth auth;

    
    public Auth getAuth() {
        return auth;
    }


        /**
     * Tool provider identifier
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolProvider")
    private final String toolProvider;

        /**
     * Tool provider identifier
     * @return the value
     **/
    
    public String getToolProvider() {
        return toolProvider;
    }


        /**
     * List of tool class entries in this package (multi-tool support)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<CustomToolEntry> tools;

        /**
     * List of tool class entries in this package (multi-tool support)
     * @return the value
     **/
    
    public java.util.List<CustomToolEntry> getTools() {
        return tools;
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
        sb.append("CustomToolConfiguration(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", packagePath=").append(String.valueOf(this.packagePath));
        sb.append(", requirementsHash=").append(String.valueOf(this.requirementsHash));
        sb.append(", auth=").append(String.valueOf(this.auth));
        sb.append(", toolProvider=").append(String.valueOf(this.toolProvider));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomToolConfiguration)) {
            return false;
        }

        CustomToolConfiguration other = (CustomToolConfiguration) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.packagePath, other.packagePath) &&
            java.util.Objects.equals(this.requirementsHash, other.requirementsHash) &&
            java.util.Objects.equals(this.auth, other.auth) &&
            java.util.Objects.equals(this.toolProvider, other.toolProvider) &&
            java.util.Objects.equals(this.tools, other.tools);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.packagePath == null ? 43 : this.packagePath.hashCode());
        result = (result * PRIME) + (this.requirementsHash == null ? 43 : this.requirementsHash.hashCode());
        result = (result * PRIME) + (this.auth == null ? 43 : this.auth.hashCode());
        result = (result * PRIME) + (this.toolProvider == null ? 43 : this.toolProvider.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        return result;
    }


}
