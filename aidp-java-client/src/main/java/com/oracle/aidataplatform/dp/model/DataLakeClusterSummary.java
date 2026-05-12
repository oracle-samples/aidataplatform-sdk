package com.oracle.aidataplatform.dp.model;



/**
 * Information about the list of AI Data Platform Workbench clusters contained within a workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DataLakeClusterSummary.Builder.class)

public final class DataLakeClusterSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"workspaceKey", "workspaceDisplayName", "clusters"})
    public DataLakeClusterSummary(String workspaceKey, String workspaceDisplayName, java.util.List<ClusterSummary> clusters) {
        super();
        this.workspaceKey = workspaceKey;
        this.workspaceDisplayName = workspaceDisplayName;
        this.clusters = clusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Key of the AI Data Platform Workbench workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * Key of the AI Data Platform Workbench workspace.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Name of the AI Data Platform Workbench workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceDisplayName")
private String workspaceDisplayName;

        /**
         * Name of the AI Data Platform Workbench workspace.
         * @param workspaceDisplayName the value to set
         * @return this builder
         **/
        

public Builder workspaceDisplayName(String workspaceDisplayName) {
    this.workspaceDisplayName = workspaceDisplayName;
    return this;
}
            /**
     * List of clusters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusters")
private java.util.List<ClusterSummary> clusters;

        /**
         * List of clusters.
         * @param clusters the value to set
         * @return this builder
         **/
        

public Builder clusters(java.util.List<ClusterSummary> clusters) {
    this.clusters = clusters;
    return this;
}


        public DataLakeClusterSummary build() {
            DataLakeClusterSummary model = new DataLakeClusterSummary(this.workspaceKey
                , this.workspaceDisplayName
                , this.clusters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataLakeClusterSummary model) {
                this.workspaceKey(model.getWorkspaceKey());
    this.workspaceDisplayName(model.getWorkspaceDisplayName());
    this.clusters(model.getClusters());
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
     * Key of the AI Data Platform Workbench workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Key of the AI Data Platform Workbench workspace.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Name of the AI Data Platform Workbench workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceDisplayName")
    private final String workspaceDisplayName;

        /**
     * Name of the AI Data Platform Workbench workspace.
     * @return the value
     **/
    
    public String getWorkspaceDisplayName() {
        return workspaceDisplayName;
    }


        /**
     * List of clusters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    private final java.util.List<ClusterSummary> clusters;

        /**
     * List of clusters.
     * @return the value
     **/
    
    public java.util.List<ClusterSummary> getClusters() {
        return clusters;
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
        sb.append("DataLakeClusterSummary(");
        sb.append("workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", workspaceDisplayName=").append(String.valueOf(this.workspaceDisplayName));
        sb.append(", clusters=").append(String.valueOf(this.clusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataLakeClusterSummary)) {
            return false;
        }

        DataLakeClusterSummary other = (DataLakeClusterSummary) o;
        return java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.workspaceDisplayName, other.workspaceDisplayName) &&
            java.util.Objects.equals(this.clusters, other.clusters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.workspaceDisplayName == null ? 43 : this.workspaceDisplayName.hashCode());
        result = (result * PRIME) + (this.clusters == null ? 43 : this.clusters.hashCode());
        return result;
    }


}
