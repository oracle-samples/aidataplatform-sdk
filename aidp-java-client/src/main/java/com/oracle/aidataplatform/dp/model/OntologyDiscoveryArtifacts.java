// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Workspace-volume location and contents of discovery artifacts.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyDiscoveryArtifacts.Builder.class)

public final class OntologyDiscoveryArtifacts  {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeKey", "folder", "items"})
    public OntologyDiscoveryArtifacts(String volumeKey, String folder, java.util.List<OntologyDiscoveryArtifactItem> items) {
        super();
        this.volumeKey = volumeKey;
        this.folder = folder;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Artifact volume key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
private String volumeKey;

        /**
         * Artifact volume key.
         * @param volumeKey the value to set
         * @return this builder
         **/
        

public Builder volumeKey(String volumeKey) {
    this.volumeKey = volumeKey;
    return this;
}
            /**
     * Artifact folder path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("folder")
private String folder;

        /**
         * Artifact folder path.
         * @param folder the value to set
         * @return this builder
         **/
        

public Builder folder(String folder) {
    this.folder = folder;
    return this;
}
            /**
     * Discovery artifacts.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<OntologyDiscoveryArtifactItem> items;

        /**
         * Discovery artifacts.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<OntologyDiscoveryArtifactItem> items) {
    this.items = items;
    return this;
}


        public OntologyDiscoveryArtifacts build() {
            OntologyDiscoveryArtifacts model = new OntologyDiscoveryArtifacts(this.volumeKey
                , this.folder
                , this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyDiscoveryArtifacts model) {
                this.volumeKey(model.getVolumeKey());
    this.folder(model.getFolder());
    this.items(model.getItems());
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
     * Artifact volume key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
    private final String volumeKey;

        /**
     * Artifact volume key.
     * @return the value
     **/
    
    public String getVolumeKey() {
        return volumeKey;
    }


        /**
     * Artifact folder path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("folder")
    private final String folder;

        /**
     * Artifact folder path.
     * @return the value
     **/
    
    public String getFolder() {
        return folder;
    }


        /**
     * Discovery artifacts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<OntologyDiscoveryArtifactItem> items;

        /**
     * Discovery artifacts.
     * @return the value
     **/
    
    public java.util.List<OntologyDiscoveryArtifactItem> getItems() {
        return items;
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
        sb.append("OntologyDiscoveryArtifacts(");
        sb.append("volumeKey=").append(String.valueOf(this.volumeKey));
        sb.append(", folder=").append(String.valueOf(this.folder));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyDiscoveryArtifacts)) {
            return false;
        }

        OntologyDiscoveryArtifacts other = (OntologyDiscoveryArtifacts) o;
        return java.util.Objects.equals(this.volumeKey, other.volumeKey) &&
            java.util.Objects.equals(this.folder, other.folder) &&
            java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.folder == null ? 43 : this.folder.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
