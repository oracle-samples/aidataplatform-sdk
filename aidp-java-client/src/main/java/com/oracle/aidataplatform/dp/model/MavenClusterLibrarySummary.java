// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of a Maven module installed as a library on a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MavenClusterLibrarySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class MavenClusterLibrarySummary extends ClusterLibrarySummary {
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
     * Maven coordinate in {@code groupId:artifactId:version} format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("coordinate")
private String coordinate;

        /**
         * Maven coordinate in {@code groupId:artifactId:version} format.
         * @param coordinate the value to set
         * @return this builder
         **/
        

public Builder coordinate(String coordinate) {
    this.coordinate = coordinate;
    return this;
}
            /**
     * Optional Maven repository name or URL used to resolve the module.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repository")
private String repository;

        /**
         * Optional Maven repository name or URL used to resolve the module.
         * @param repository the value to set
         * @return this builder
         **/
        

public Builder repository(String repository) {
    this.repository = repository;
    return this;
}
            /**
     * Optional Maven dependency exclusions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("exclusions")
private java.util.List<String> exclusions;

        /**
         * Optional Maven dependency exclusions.
         * @param exclusions the value to set
         * @return this builder
         **/
        

public Builder exclusions(java.util.List<String> exclusions) {
    this.exclusions = exclusions;
    return this;
}


        public MavenClusterLibrarySummary build() {
            MavenClusterLibrarySummary model = new MavenClusterLibrarySummary(this.timeCreated
                , this.timeUpdated
                , this.installedBy
                , this.installedByName
                , this.stateMessage
                , this.status
                , this.coordinate
                , this.repository
                , this.exclusions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MavenClusterLibrarySummary model) {
                this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.installedBy(model.getInstalledBy());
    this.installedByName(model.getInstalledByName());
    this.stateMessage(model.getStateMessage());
    this.status(model.getStatus());
    this.coordinate(model.getCoordinate());
    this.repository(model.getRepository());
    this.exclusions(model.getExclusions());
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
    public MavenClusterLibrarySummary(java.util.Date timeCreated, java.util.Date timeUpdated, String installedBy, String installedByName, String stateMessage, Status status, String coordinate, String repository, java.util.List<String> exclusions) {
    super(timeCreated, timeUpdated, installedBy, installedByName, stateMessage, status);
        this.coordinate = coordinate;
        this.repository = repository;
        this.exclusions = exclusions;
    }


        /**
     * Maven coordinate in {@code groupId:artifactId:version} format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("coordinate")
    private final String coordinate;

        /**
     * Maven coordinate in {@code groupId:artifactId:version} format.
     * @return the value
     **/
    
    public String getCoordinate() {
        return coordinate;
    }


        /**
     * Optional Maven repository name or URL used to resolve the module.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    private final String repository;

        /**
     * Optional Maven repository name or URL used to resolve the module.
     * @return the value
     **/
    
    public String getRepository() {
        return repository;
    }


        /**
     * Optional Maven dependency exclusions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<String> exclusions;

        /**
     * Optional Maven dependency exclusions.
     * @return the value
     **/
    
    public java.util.List<String> getExclusions() {
        return exclusions;
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
        sb.append("MavenClusterLibrarySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", coordinate=").append(String.valueOf(this.coordinate));
        sb.append(", repository=").append(String.valueOf(this.repository));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MavenClusterLibrarySummary)) {
            return false;
        }

        MavenClusterLibrarySummary other = (MavenClusterLibrarySummary) o;
        return java.util.Objects.equals(this.coordinate, other.coordinate) &&
            java.util.Objects.equals(this.repository, other.repository) &&
            java.util.Objects.equals(this.exclusions, other.exclusions) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.coordinate == null ? 43 : this.coordinate.hashCode());
        result = (result * PRIME) + (this.repository == null ? 43 : this.repository.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        return result;
    }


}
