package com.oracle.aidataplatform.dp.model;



/**
 * Collection of Git branches. Contains summary information about a git branch
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitBranchCollection.Builder.class)

public final class GitBranchCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public GitBranchCollection(java.util.List<GitBranchSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of Git branches.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<GitBranchSummary> items;

        /**
         * List of Git branches.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<GitBranchSummary> items) {
    this.items = items;
    return this;
}


        public GitBranchCollection build() {
            GitBranchCollection model = new GitBranchCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitBranchCollection model) {
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
     * List of Git branches.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<GitBranchSummary> items;

        /**
     * List of Git branches.
     * @return the value
     **/
    
    public java.util.List<GitBranchSummary> getItems() {
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
        sb.append("GitBranchCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitBranchCollection)) {
            return false;
        }

        GitBranchCollection other = (GitBranchCollection) o;
        return java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
