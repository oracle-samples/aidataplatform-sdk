// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Source selection and options for ontology discovery.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=StartDiscoveryDetails.Builder.class)

public final class StartDiscoveryDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"workspace", "projectKey", "displayName", "sources", "options"})
    public StartDiscoveryDetails(String workspace, String projectKey, String displayName, java.util.List<DiscoverySource> sources, DiscoveryOptions options) {
        super();
        this.workspace = workspace;
        this.projectKey = projectKey;
        this.displayName = displayName;
        this.sources = sources;
        this.options = options;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace key associated with the discovery request.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspace")
private String workspace;

        /**
         * Workspace key associated with the discovery request.
         * @param workspace the value to set
         * @return this builder
         **/
        

public Builder workspace(String workspace) {
    this.workspace = workspace;
    return this;
}
            /**
     * Project key. The service derives this from the target project for the action route.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectKey")
private String projectKey;

        /**
         * Project key. The service derives this from the target project for the action route.
         * @param projectKey the value to set
         * @return this builder
         **/
        

public Builder projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
}
            /**
     * Optional label for the discovery job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Optional label for the discovery job.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Sources selected for ontology discovery.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sources")
private java.util.List<DiscoverySource> sources;

        /**
         * Sources selected for ontology discovery.
         * @param sources the value to set
         * @return this builder
         **/
        

public Builder sources(java.util.List<DiscoverySource> sources) {
    this.sources = sources;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("options")
private DiscoveryOptions options;



public Builder options(DiscoveryOptions options) {
    this.options = options;
    return this;
}


        public StartDiscoveryDetails build() {
            StartDiscoveryDetails model = new StartDiscoveryDetails(this.workspace
                , this.projectKey
                , this.displayName
                , this.sources
                , this.options);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartDiscoveryDetails model) {
                this.workspace(model.getWorkspace());
    this.projectKey(model.getProjectKey());
    this.displayName(model.getDisplayName());
    this.sources(model.getSources());
    this.options(model.getOptions());
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
     * Workspace key associated with the discovery request.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspace")
    private final String workspace;

        /**
     * Workspace key associated with the discovery request.
     * @return the value
     **/
    
    public String getWorkspace() {
        return workspace;
    }


        /**
     * Project key. The service derives this from the target project for the action route.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectKey")
    private final String projectKey;

        /**
     * Project key. The service derives this from the target project for the action route.
     * @return the value
     **/
    
    public String getProjectKey() {
        return projectKey;
    }


        /**
     * Optional label for the discovery job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Optional label for the discovery job.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Sources selected for ontology discovery.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<DiscoverySource> sources;

        /**
     * Sources selected for ontology discovery.
     * @return the value
     **/
    
    public java.util.List<DiscoverySource> getSources() {
        return sources;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final DiscoveryOptions options;

    
    public DiscoveryOptions getOptions() {
        return options;
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
        sb.append("StartDiscoveryDetails(");
        sb.append("workspace=").append(String.valueOf(this.workspace));
        sb.append(", projectKey=").append(String.valueOf(this.projectKey));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartDiscoveryDetails)) {
            return false;
        }

        StartDiscoveryDetails other = (StartDiscoveryDetails) o;
        return java.util.Objects.equals(this.workspace, other.workspace) &&
            java.util.Objects.equals(this.projectKey, other.projectKey) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.sources, other.sources) &&
            java.util.Objects.equals(this.options, other.options);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspace == null ? 43 : this.workspace.hashCode());
        result = (result * PRIME) + (this.projectKey == null ? 43 : this.projectKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        return result;
    }


}
