// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Serializable provider connection settings.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LlmConnectionSettings.Builder.class)

public final class LlmConnectionSettings  {
    @Deprecated
    @java.beans.ConstructorProperties({"organization", "project", "timeout", "maxRetries", "defaultQuery"})
    public LlmConnectionSettings(String organization, String project, Double timeout, Integer maxRetries, java.util.Map<String, String> defaultQuery) {
        super();
        this.organization = organization;
        this.project = project;
        this.timeout = timeout;
        this.maxRetries = maxRetries;
        this.defaultQuery = defaultQuery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Optional provider organization identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("organization")
private String organization;

        /**
         * Optional provider organization identifier.
         * @param organization the value to set
         * @return this builder
         **/
        

public Builder organization(String organization) {
    this.organization = organization;
    return this;
}
            /**
     * Optional provider project identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("project")
private String project;

        /**
         * Optional provider project identifier.
         * @param project the value to set
         * @return this builder
         **/
        

public Builder project(String project) {
    this.project = project;
    return this;
}
            /**
     * Optional provider request timeout in seconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeout")
private Double timeout;

        /**
         * Optional provider request timeout in seconds.
         * @param timeout the value to set
         * @return this builder
         **/
        

public Builder timeout(Double timeout) {
    this.timeout = timeout;
    return this;
}
            /**
     * Optional maximum number of provider request retries.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
private Integer maxRetries;

        /**
         * Optional maximum number of provider request retries.
         * @param maxRetries the value to set
         * @return this builder
         **/
        

public Builder maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
}
            /**
     * Optional provider query parameters to send by default.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("defaultQuery")
private java.util.Map<String, String> defaultQuery;

        /**
         * Optional provider query parameters to send by default.
         * @param defaultQuery the value to set
         * @return this builder
         **/
        

public Builder defaultQuery(java.util.Map<String, String> defaultQuery) {
    this.defaultQuery = defaultQuery;
    return this;
}


        public LlmConnectionSettings build() {
            LlmConnectionSettings model = new LlmConnectionSettings(this.organization
                , this.project
                , this.timeout
                , this.maxRetries
                , this.defaultQuery);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LlmConnectionSettings model) {
                this.organization(model.getOrganization());
    this.project(model.getProject());
    this.timeout(model.getTimeout());
    this.maxRetries(model.getMaxRetries());
    this.defaultQuery(model.getDefaultQuery());
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
     * Optional provider organization identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    private final String organization;

        /**
     * Optional provider organization identifier.
     * @return the value
     **/
    
    public String getOrganization() {
        return organization;
    }


        /**
     * Optional provider project identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    private final String project;

        /**
     * Optional provider project identifier.
     * @return the value
     **/
    
    public String getProject() {
        return project;
    }


        /**
     * Optional provider request timeout in seconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final Double timeout;

        /**
     * Optional provider request timeout in seconds.
     * @return the value
     **/
    
    public Double getTimeout() {
        return timeout;
    }


        /**
     * Optional maximum number of provider request retries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
    private final Integer maxRetries;

        /**
     * Optional maximum number of provider request retries.
     * @return the value
     **/
    
    public Integer getMaxRetries() {
        return maxRetries;
    }


        /**
     * Optional provider query parameters to send by default.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultQuery")
    private final java.util.Map<String, String> defaultQuery;

        /**
     * Optional provider query parameters to send by default.
     * @return the value
     **/
    
    public java.util.Map<String, String> getDefaultQuery() {
        return defaultQuery;
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
        sb.append("LlmConnectionSettings(");
        sb.append("organization=").append(String.valueOf(this.organization));
        sb.append(", project=").append(String.valueOf(this.project));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", maxRetries=").append(String.valueOf(this.maxRetries));
        sb.append(", defaultQuery=").append(String.valueOf(this.defaultQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LlmConnectionSettings)) {
            return false;
        }

        LlmConnectionSettings other = (LlmConnectionSettings) o;
        return java.util.Objects.equals(this.organization, other.organization) &&
            java.util.Objects.equals(this.project, other.project) &&
            java.util.Objects.equals(this.timeout, other.timeout) &&
            java.util.Objects.equals(this.maxRetries, other.maxRetries) &&
            java.util.Objects.equals(this.defaultQuery, other.defaultQuery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.organization == null ? 43 : this.organization.hashCode());
        result = (result * PRIME) + (this.project == null ? 43 : this.project.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + (this.maxRetries == null ? 43 : this.maxRetries.hashCode());
        result = (result * PRIME) + (this.defaultQuery == null ? 43 : this.defaultQuery.hashCode());
        return result;
    }


}
