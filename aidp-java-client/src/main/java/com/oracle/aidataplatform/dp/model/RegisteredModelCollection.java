// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing RegisteredModels.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RegisteredModelCollection.Builder.class)

public final class RegisteredModelCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"registeredModels", "nextPageToken"})
    public RegisteredModelCollection(java.util.List<RegisteredModel> registeredModels, String nextPageToken) {
        super();
        this.registeredModels = registeredModels;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Registered models that match the search criteria.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("registered_models")
private java.util.List<RegisteredModel> registeredModels;

        /**
         * Registered models that match the search criteria.
         * @param registeredModels the value to set
         * @return this builder
         **/
        

public Builder registeredModels(java.util.List<RegisteredModel> registeredModels) {
    this.registeredModels = registeredModels;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of registered models.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of registered models.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public RegisteredModelCollection build() {
            RegisteredModelCollection model = new RegisteredModelCollection(this.registeredModels
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisteredModelCollection model) {
                this.registeredModels(model.getRegisteredModels());
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
     * Registered models that match the search criteria.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("registered_models")
    private final java.util.List<RegisteredModel> registeredModels;

        /**
     * Registered models that match the search criteria.
     * @return the value
     **/
    
    public java.util.List<RegisteredModel> getRegisteredModels() {
        return registeredModels;
    }


        /**
     * Token that can be used to retrieve the next page of registered models.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of registered models.
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
        sb.append("RegisteredModelCollection(");
        sb.append("registeredModels=").append(String.valueOf(this.registeredModels));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisteredModelCollection)) {
            return false;
        }

        RegisteredModelCollection other = (RegisteredModelCollection) o;
        return java.util.Objects.equals(this.registeredModels, other.registeredModels) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.registeredModels == null ? 43 : this.registeredModels.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
