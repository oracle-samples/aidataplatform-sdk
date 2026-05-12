package com.oracle.aidataplatform.dp.model;



/**
 * Collection of commits for a branch (optionally filtered by folder).
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HistoryCollection.Builder.class)

public final class HistoryCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "gitUrl"})
    public HistoryCollection(java.util.List<HistorySummary> items, String gitUrl) {
        super();
        this.items = items;
        this.gitUrl = gitUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of commit summaries.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<HistorySummary> items;

        /**
         * List of commit summaries.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<HistorySummary> items) {
    this.items = items;
    return this;
}
            /**
     * The git repository url corresponding to the branch
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
private String gitUrl;

        /**
         * The git repository url corresponding to the branch
         * @param gitUrl the value to set
         * @return this builder
         **/
        

public Builder gitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
}


        public HistoryCollection build() {
            HistoryCollection model = new HistoryCollection(this.items
                , this.gitUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HistoryCollection model) {
                this.items(model.getItems());
    this.gitUrl(model.getGitUrl());
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
     * List of commit summaries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<HistorySummary> items;

        /**
     * List of commit summaries.
     * @return the value
     **/
    
    public java.util.List<HistorySummary> getItems() {
        return items;
    }


        /**
     * The git repository url corresponding to the branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
    private final String gitUrl;

        /**
     * The git repository url corresponding to the branch
     * @return the value
     **/
    
    public String getGitUrl() {
        return gitUrl;
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
        sb.append("HistoryCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HistoryCollection)) {
            return false;
        }

        HistoryCollection other = (HistoryCollection) o;
        return java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.gitUrl, other.gitUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        return result;
    }


}
