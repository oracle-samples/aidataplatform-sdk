// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing logged-models.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LoggedModelCollection.Builder.class)

public final class LoggedModelCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"models", "nextPageToken"})
    public LoggedModelCollection(java.util.List<LoggedModel> models, String nextPageToken) {
        super();
        this.models = models;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * LoggedModels that match the search criteria
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("models")
private java.util.List<LoggedModel> models;

        /**
         * LoggedModels that match the search criteria
         * @param models the value to set
         * @return this builder
         **/
        

public Builder models(java.util.List<LoggedModel> models) {
    this.models = models;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public LoggedModelCollection build() {
            LoggedModelCollection model = new LoggedModelCollection(this.models
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggedModelCollection model) {
                this.models(model.getModels());
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
     * LoggedModels that match the search criteria
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("models")
    private final java.util.List<LoggedModel> models;

        /**
     * LoggedModels that match the search criteria
     * @return the value
     **/
    
    public java.util.List<LoggedModel> getModels() {
        return models;
    }


        /**
     * Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of logged-models. An empty token means that no more logged-models are available for retrieval.
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
        sb.append("LoggedModelCollection(");
        sb.append("models=").append(String.valueOf(this.models));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggedModelCollection)) {
            return false;
        }

        LoggedModelCollection other = (LoggedModelCollection) o;
        return java.util.Objects.equals(this.models, other.models) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.models == null ? 43 : this.models.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
