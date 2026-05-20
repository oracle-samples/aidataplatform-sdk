// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing model versions.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelVersionCollection.Builder.class)

public final class ModelVersionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelVersions", "nextPageToken"})
    public ModelVersionCollection(java.util.List<ModelVersion> modelVersions, String nextPageToken) {
        super();
        this.modelVersions = modelVersions;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Model versions that match the search criteria.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_versions")
private java.util.List<ModelVersion> modelVersions;

        /**
         * Model versions that match the search criteria.
         * @param modelVersions the value to set
         * @return this builder
         **/
        

public Builder modelVersions(java.util.List<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of model versions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of model versions.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public ModelVersionCollection build() {
            ModelVersionCollection model = new ModelVersionCollection(this.modelVersions
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelVersionCollection model) {
                this.modelVersions(model.getModelVersions());
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
     * Model versions that match the search criteria.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_versions")
    private final java.util.List<ModelVersion> modelVersions;

        /**
     * Model versions that match the search criteria.
     * @return the value
     **/
    
    public java.util.List<ModelVersion> getModelVersions() {
        return modelVersions;
    }


        /**
     * Token that can be used to retrieve the next page of model versions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of model versions.
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
        sb.append("ModelVersionCollection(");
        sb.append("modelVersions=").append(String.valueOf(this.modelVersions));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelVersionCollection)) {
            return false;
        }

        ModelVersionCollection other = (ModelVersionCollection) o;
        return java.util.Objects.equals(this.modelVersions, other.modelVersions) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelVersions == null ? 43 : this.modelVersions.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
