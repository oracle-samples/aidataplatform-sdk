package com.oracle.aidataplatform.dp.model;


/**
 * Result of listing Experiment Runs.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunCollection.Builder.class)

public final class ExperimentRunCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"runs", "nextPageToken"})
    public ExperimentRunCollection(java.util.List<ExperimentRun> runs, String nextPageToken) {
        super();
        this.runs = runs;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Runs that match the search criteria
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("runs")
        private java.util.List<ExperimentRun> runs;

                /**
         * Runs that match the search criteria
         * @param runs the value to set
         * @return this builder
         **/
        

        public Builder runs(java.util.List<ExperimentRun> runs) {
        this.runs = runs;
        return this;
        }
            /**
     * Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
        private String nextPageToken;

                /**
         * Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

        public Builder nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
        }


        public ExperimentRunCollection build() {
            ExperimentRunCollection model = new ExperimentRunCollection(this.runs
                    , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunCollection model) {
                this.runs(model.getRuns());
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
     * Runs that match the search criteria
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("runs")
    private final java.util.List<ExperimentRun> runs;

        /**
     * Runs that match the search criteria
     * @return the value
     **/
    
    public java.util.List<ExperimentRun> getRuns() {
        return runs;
    }


        /**
     * Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of runs. An empty token means that no more runs are available for retrieval.
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
        sb.append("ExperimentRunCollection(");
        sb.append("runs=").append(String.valueOf(this.runs));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRunCollection)) {
            return false;
        }

        ExperimentRunCollection other = (ExperimentRunCollection) o;
        return java.util.Objects.equals(this.runs, other.runs) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runs == null ? 43 : this.runs.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
