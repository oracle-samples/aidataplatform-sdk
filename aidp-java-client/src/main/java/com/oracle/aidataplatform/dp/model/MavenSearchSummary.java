// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Maven package search result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MavenSearchSummary.Builder.class)

public final class MavenSearchSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"groupId", "artifactId", "latestVersion", "allVersions", "freeformTags", "definedTags", "systemTags"})
    public MavenSearchSummary(String groupId, String artifactId, String latestVersion, java.util.List<String> allVersions, java.util.Map<String, String> freeformTags, java.util.Map<String, java.util.Map<String, Object>> definedTags, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.latestVersion = latestVersion;
        this.allVersions = allVersions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Maven group identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("groupId")
private String groupId;

        /**
         * Maven group identifier.
         * @param groupId the value to set
         * @return this builder
         **/
        

public Builder groupId(String groupId) {
    this.groupId = groupId;
    return this;
}
            /**
     * Maven artifact identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("artifactId")
private String artifactId;

        /**
         * Maven artifact identifier.
         * @param artifactId the value to set
         * @return this builder
         **/
        

public Builder artifactId(String artifactId) {
    this.artifactId = artifactId;
    return this;
}
            /**
     * Latest version reported for the Maven package.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("latestVersion")
private String latestVersion;

        /**
         * Latest version reported for the Maven package.
         * @param latestVersion the value to set
         * @return this builder
         **/
        

public Builder latestVersion(String latestVersion) {
    this.latestVersion = latestVersion;
    return this;
}
            /**
     * Available versions reported for the Maven package.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("allVersions")
private java.util.List<String> allVersions;

        /**
         * Available versions reported for the Maven package.
         * @param allVersions the value to set
         * @return this builder
         **/
        

public Builder allVersions(java.util.List<String> allVersions) {
    this.allVersions = allVersions;
    return this;
}
            /**
     * Free-form tags for this Maven package search result.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this Maven package search result.
         * @param freeformTags the value to set
         * @return this builder
         **/
        

public Builder freeformTags(java.util.Map<String, String> freeformTags) {
    this.freeformTags = freeformTags;
    return this;
}
            /**
     * Defined tags for this Maven package search result.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("definedTags")
private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this Maven package search result.
         * @param definedTags the value to set
         * @return this builder
         **/
        

public Builder definedTags(java.util.Map<String, java.util.Map<String, Object>> definedTags) {
    this.definedTags = definedTags;
    return this;
}
            /**
     * System tags for this Maven package search result.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("systemTags")
private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this Maven package search result.
         * @param systemTags the value to set
         * @return this builder
         **/
        

public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
    this.systemTags = systemTags;
    return this;
}


        public MavenSearchSummary build() {
            MavenSearchSummary model = new MavenSearchSummary(this.groupId
                , this.artifactId
                , this.latestVersion
                , this.allVersions
                , this.freeformTags
                , this.definedTags
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MavenSearchSummary model) {
                this.groupId(model.getGroupId());
    this.artifactId(model.getArtifactId());
    this.latestVersion(model.getLatestVersion());
    this.allVersions(model.getAllVersions());
    this.freeformTags(model.getFreeformTags());
    this.definedTags(model.getDefinedTags());
    this.systemTags(model.getSystemTags());
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
     * Maven group identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

        /**
     * Maven group identifier.
     * @return the value
     **/
    
    public String getGroupId() {
        return groupId;
    }


        /**
     * Maven artifact identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final String artifactId;

        /**
     * Maven artifact identifier.
     * @return the value
     **/
    
    public String getArtifactId() {
        return artifactId;
    }


        /**
     * Latest version reported for the Maven package.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("latestVersion")
    private final String latestVersion;

        /**
     * Latest version reported for the Maven package.
     * @return the value
     **/
    
    public String getLatestVersion() {
        return latestVersion;
    }


        /**
     * Available versions reported for the Maven package.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("allVersions")
    private final java.util.List<String> allVersions;

        /**
     * Available versions reported for the Maven package.
     * @return the value
     **/
    
    public java.util.List<String> getAllVersions() {
        return allVersions;
    }


        /**
     * Free-form tags for this Maven package search result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

        /**
     * Free-form tags for this Maven package search result.
     * @return the value
     **/
    
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }


        /**
     * Defined tags for this Maven package search result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
     * Defined tags for this Maven package search result.
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }


        /**
     * System tags for this Maven package search result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
     * System tags for this Maven package search result.
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MavenSearchSummary(");
        sb.append("groupId=").append(String.valueOf(this.groupId));
        sb.append(", artifactId=").append(String.valueOf(this.artifactId));
        sb.append(", latestVersion=").append(String.valueOf(this.latestVersion));
        sb.append(", allVersions=").append(String.valueOf(this.allVersions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MavenSearchSummary)) {
            return false;
        }

        MavenSearchSummary other = (MavenSearchSummary) o;
        return java.util.Objects.equals(this.groupId, other.groupId) &&
            java.util.Objects.equals(this.artifactId, other.artifactId) &&
            java.util.Objects.equals(this.latestVersion, other.latestVersion) &&
            java.util.Objects.equals(this.allVersions, other.allVersions) &&
            java.util.Objects.equals(this.freeformTags, other.freeformTags) &&
            java.util.Objects.equals(this.definedTags, other.definedTags) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result = (result * PRIME) + (this.latestVersion == null ? 43 : this.latestVersion.hashCode());
        result = (result * PRIME) + (this.allVersions == null ? 43 : this.allVersions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
