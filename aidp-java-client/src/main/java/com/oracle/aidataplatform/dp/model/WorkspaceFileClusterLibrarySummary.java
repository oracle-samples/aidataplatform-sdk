// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of a workspace file installed as a library on a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceFileClusterLibrarySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class WorkspaceFileClusterLibrarySummary extends ClusterLibrarySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
@com.fasterxml.jackson.annotation.JsonProperty("installedBy")
private String installedBy;

public Builder installedBy(String installedBy) {
    this.installedBy = installedBy;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("installedByName")
private String installedByName;

public Builder installedByName(String installedByName) {
    this.installedByName = installedByName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
private String stateMessage;

public Builder stateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Status status;

public Builder status(Status status) {
    this.status = status;
    return this;
}
            /**
     * Library name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Library name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Full path of the library.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Full path of the library.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}


        public WorkspaceFileClusterLibrarySummary build() {
            WorkspaceFileClusterLibrarySummary model = new WorkspaceFileClusterLibrarySummary(this.timeCreated
                , this.timeUpdated
                , this.installedBy
                , this.installedByName
                , this.stateMessage
                , this.status
                , this.name
                , this.path);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceFileClusterLibrarySummary model) {
                this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.installedBy(model.getInstalledBy());
    this.installedByName(model.getInstalledByName());
    this.stateMessage(model.getStateMessage());
    this.status(model.getStatus());
    this.name(model.getName());
    this.path(model.getPath());
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

    
    @Deprecated
    public WorkspaceFileClusterLibrarySummary(java.util.Date timeCreated, java.util.Date timeUpdated, String installedBy, String installedByName, String stateMessage, Status status, String name, String path) {
    super(timeCreated, timeUpdated, installedBy, installedByName, stateMessage, status);
        this.name = name;
        this.path = path;
    }


        /**
     * Library name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Library name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Full path of the library.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Full path of the library.
     * @return the value
     **/
    
    public String getPath() {
        return path;
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
        sb.append("WorkspaceFileClusterLibrarySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceFileClusterLibrarySummary)) {
            return false;
        }

        WorkspaceFileClusterLibrarySummary other = (WorkspaceFileClusterLibrarySummary) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        return result;
    }


}
