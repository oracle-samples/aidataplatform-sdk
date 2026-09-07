// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of a PyPI package installed as a library on a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PypiClusterLibrarySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class PypiClusterLibrarySummary extends ClusterLibrarySummary {
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
     * PyPI package specifier, for example {@code requests==2.31.0}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pythonPackage")
private String pythonPackage;

        /**
         * PyPI package specifier, for example {@code requests==2.31.0}.
         * @param pythonPackage the value to set
         * @return this builder
         **/
        

public Builder pythonPackage(String pythonPackage) {
    this.pythonPackage = pythonPackage;
    return this;
}
            /**
     * Optional pip index URL used to resolve the package, for example {@code https://pypi.org/simple}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pipIndexUrl")
private String pipIndexUrl;

        /**
         * Optional pip index URL used to resolve the package, for example {@code https://pypi.org/simple}.
         * @param pipIndexUrl the value to set
         * @return this builder
         **/
        

public Builder pipIndexUrl(String pipIndexUrl) {
    this.pipIndexUrl = pipIndexUrl;
    return this;
}


        public PypiClusterLibrarySummary build() {
            PypiClusterLibrarySummary model = new PypiClusterLibrarySummary(this.timeCreated
                , this.timeUpdated
                , this.installedBy
                , this.installedByName
                , this.stateMessage
                , this.status
                , this.pythonPackage
                , this.pipIndexUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PypiClusterLibrarySummary model) {
                this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.installedBy(model.getInstalledBy());
    this.installedByName(model.getInstalledByName());
    this.stateMessage(model.getStateMessage());
    this.status(model.getStatus());
    this.pythonPackage(model.getPythonPackage());
    this.pipIndexUrl(model.getPipIndexUrl());
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
    public PypiClusterLibrarySummary(java.util.Date timeCreated, java.util.Date timeUpdated, String installedBy, String installedByName, String stateMessage, Status status, String pythonPackage, String pipIndexUrl) {
    super(timeCreated, timeUpdated, installedBy, installedByName, stateMessage, status);
        this.pythonPackage = pythonPackage;
        this.pipIndexUrl = pipIndexUrl;
    }


        /**
     * PyPI package specifier, for example {@code requests==2.31.0}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pythonPackage")
    private final String pythonPackage;

        /**
     * PyPI package specifier, for example {@code requests==2.31.0}.
     * @return the value
     **/
    
    public String getPythonPackage() {
        return pythonPackage;
    }


        /**
     * Optional pip index URL used to resolve the package, for example {@code https://pypi.org/simple}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pipIndexUrl")
    private final String pipIndexUrl;

        /**
     * Optional pip index URL used to resolve the package, for example {@code https://pypi.org/simple}.
     * @return the value
     **/
    
    public String getPipIndexUrl() {
        return pipIndexUrl;
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
        sb.append("PypiClusterLibrarySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pythonPackage=").append(String.valueOf(this.pythonPackage));
        sb.append(", pipIndexUrl=").append(String.valueOf(this.pipIndexUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PypiClusterLibrarySummary)) {
            return false;
        }

        PypiClusterLibrarySummary other = (PypiClusterLibrarySummary) o;
        return java.util.Objects.equals(this.pythonPackage, other.pythonPackage) &&
            java.util.Objects.equals(this.pipIndexUrl, other.pipIndexUrl) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pythonPackage == null ? 43 : this.pythonPackage.hashCode());
        result = (result * PRIME) + (this.pipIndexUrl == null ? 43 : this.pipIndexUrl.hashCode());
        return result;
    }


}
