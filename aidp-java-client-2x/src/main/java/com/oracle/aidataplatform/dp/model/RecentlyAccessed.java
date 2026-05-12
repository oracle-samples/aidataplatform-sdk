package com.oracle.aidataplatform.dp.model;


/**
 * The resources which were recently accessed by a user.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RecentlyAccessed.Builder.class)

public final class RecentlyAccessed  {
    @Deprecated
    @java.beans.ConstructorProperties({"globalLevelResources", "workspaceLevelResources"})
    public RecentlyAccessed(java.util.List<RecentResourceItem> globalLevelResources, java.util.List<RecentResourceItem> workspaceLevelResources) {
        super();
        this.globalLevelResources = globalLevelResources;
        this.workspaceLevelResources = workspaceLevelResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("globalLevelResources")
        private java.util.List<RecentResourceItem> globalLevelResources;

                /**
         * List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.
         * @param globalLevelResources the value to set
         * @return this builder
         **/
        

        public Builder globalLevelResources(java.util.List<RecentResourceItem> globalLevelResources) {
        this.globalLevelResources = globalLevelResources;
        return this;
        }
            /**
     * List of recent resources that are contained in workspace, like clusters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceLevelResources")
        private java.util.List<RecentResourceItem> workspaceLevelResources;

                /**
         * List of recent resources that are contained in workspace, like clusters.
         * @param workspaceLevelResources the value to set
         * @return this builder
         **/
        

        public Builder workspaceLevelResources(java.util.List<RecentResourceItem> workspaceLevelResources) {
        this.workspaceLevelResources = workspaceLevelResources;
        return this;
        }


        public RecentlyAccessed build() {
            RecentlyAccessed model = new RecentlyAccessed(this.globalLevelResources
                    , this.workspaceLevelResources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecentlyAccessed model) {
                this.globalLevelResources(model.getGlobalLevelResources());
    this.workspaceLevelResources(model.getWorkspaceLevelResources());
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
     * List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("globalLevelResources")
    private final java.util.List<RecentResourceItem> globalLevelResources;

        /**
     * List of recent resources that are global, meaning not contained to workspace example catalog and its subresoruces.
     * @return the value
     **/
    
    public java.util.List<RecentResourceItem> getGlobalLevelResources() {
        return globalLevelResources;
    }


        /**
     * List of recent resources that are contained in workspace, like clusters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceLevelResources")
    private final java.util.List<RecentResourceItem> workspaceLevelResources;

        /**
     * List of recent resources that are contained in workspace, like clusters.
     * @return the value
     **/
    
    public java.util.List<RecentResourceItem> getWorkspaceLevelResources() {
        return workspaceLevelResources;
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
        sb.append("RecentlyAccessed(");
        sb.append("globalLevelResources=").append(String.valueOf(this.globalLevelResources));
        sb.append(", workspaceLevelResources=").append(String.valueOf(this.workspaceLevelResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentlyAccessed)) {
            return false;
        }

        RecentlyAccessed other = (RecentlyAccessed) o;
        return java.util.Objects.equals(this.globalLevelResources, other.globalLevelResources) &&
            java.util.Objects.equals(this.workspaceLevelResources, other.workspaceLevelResources);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.globalLevelResources == null ? 43 : this.globalLevelResources.hashCode());
        result = (result * PRIME) + (this.workspaceLevelResources == null ? 43 : this.workspaceLevelResources.hashCode());
        return result;
    }


}
