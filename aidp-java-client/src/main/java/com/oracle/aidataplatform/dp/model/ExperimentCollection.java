// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing Experiments.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentCollection.Builder.class)

public final class ExperimentCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"experiments", "nextPageToken"})
    public ExperimentCollection(java.util.List<Experiment> experiments, String nextPageToken) {
        super();
        this.experiments = experiments;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Experiments that match the search criteria
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("experiments")
private java.util.List<Experiment> experiments;

        /**
         * Experiments that match the search criteria
         * @param experiments the value to set
         * @return this builder
         **/
        

public Builder experiments(java.util.List<Experiment> experiments) {
    this.experiments = experiments;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public ExperimentCollection build() {
            ExperimentCollection model = new ExperimentCollection(this.experiments
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentCollection model) {
                this.experiments(model.getExperiments());
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
     * Experiments that match the search criteria
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("experiments")
    private final java.util.List<Experiment> experiments;

        /**
     * Experiments that match the search criteria
     * @return the value
     **/
    
    public java.util.List<Experiment> getExperiments() {
        return experiments;
    }


        /**
     * Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of experiments. An empty token means that no more experiments are available for retrieval.
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
        sb.append("ExperimentCollection(");
        sb.append("experiments=").append(String.valueOf(this.experiments));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentCollection)) {
            return false;
        }

        ExperimentCollection other = (ExperimentCollection) o;
        return java.util.Objects.equals(this.experiments, other.experiments) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experiments == null ? 43 : this.experiments.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
