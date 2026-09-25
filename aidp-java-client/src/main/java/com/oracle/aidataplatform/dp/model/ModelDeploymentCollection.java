// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of searching model deployments.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelDeploymentCollection.Builder.class)

public final class ModelDeploymentCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"deployments", "nextPageToken"})
    public ModelDeploymentCollection(java.util.List<ModelDeploymentSummary> deployments, String nextPageToken) {
        super();
        this.deployments = deployments;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Deployments that match the search criteria.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployments")
private java.util.List<ModelDeploymentSummary> deployments;

        /**
         * Deployments that match the search criteria.
         * @param deployments the value to set
         * @return this builder
         **/
        

public Builder deployments(java.util.List<ModelDeploymentSummary> deployments) {
    this.deployments = deployments;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public ModelDeploymentCollection build() {
            ModelDeploymentCollection model = new ModelDeploymentCollection(this.deployments
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentCollection model) {
                this.deployments(model.getDeployments());
    this.nextPageToken(model.getNextPageToken());
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
     * Deployments that match the search criteria.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployments")
    private final java.util.List<ModelDeploymentSummary> deployments;

        /**
     * Deployments that match the search criteria.
     * @return the value
     **/
    
    public java.util.List<ModelDeploymentSummary> getDeployments() {
        return deployments;
    }


        /**
     * Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.
     * @return the value
     **/
    
    public String getNextPageToken() {
        return nextPageToken;
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
        sb.append("ModelDeploymentCollection(");
        sb.append("deployments=").append(String.valueOf(this.deployments));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentCollection)) {
            return false;
        }

        ModelDeploymentCollection other = (ModelDeploymentCollection) o;
        return java.util.Objects.equals(this.deployments, other.deployments) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deployments == null ? 43 : this.deployments.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
