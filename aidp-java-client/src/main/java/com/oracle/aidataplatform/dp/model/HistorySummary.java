// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information for a commit.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HistorySummary.Builder.class)

public final class HistorySummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"commitId", "message", "authorName", "authorEmail", "timeCreated", "isMergeCommit", "parents"})
    public HistorySummary(String commitId, String message, String authorName, String authorEmail, java.util.Date timeCreated, Boolean isMergeCommit, java.util.List<String> parents) {
        super();
        this.commitId = commitId;
        this.message = message;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.timeCreated = timeCreated;
        this.isMergeCommit = isMergeCommit;
        this.parents = parents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Commit SHA.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("commitId")
private String commitId;

        /**
         * Commit SHA.
         * @param commitId the value to set
         * @return this builder
         **/
        

public Builder commitId(String commitId) {
    this.commitId = commitId;
    return this;
}
            /**
     * First line of commit message (subject).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * First line of commit message (subject).
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * Commit author display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authorName")
private String authorName;

        /**
         * Commit author display name.
         * @param authorName the value to set
         * @return this builder
         **/
        

public Builder authorName(String authorName) {
    this.authorName = authorName;
    return this;
}
            /**
     * Commit author email (optional).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
private String authorEmail;

        /**
         * Commit author email (optional).
         * @param authorEmail the value to set
         * @return this builder
         **/
        

public Builder authorEmail(String authorEmail) {
    this.authorEmail = authorEmail;
    return this;
}
            /**
     * Commit authored time (or committed time if you prefer, but be consistent).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Commit authored time (or committed time if you prefer, but be consistent).
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * True if commit has multiple parents.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isMergeCommit")
private Boolean isMergeCommit;

        /**
         * True if commit has multiple parents.
         * @param isMergeCommit the value to set
         * @return this builder
         **/
        

public Builder isMergeCommit(Boolean isMergeCommit) {
    this.isMergeCommit = isMergeCommit;
    return this;
}
            /**
     * Parent commit SHAs (empty for root commit). Present to explain merge commits.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parents")
private java.util.List<String> parents;

        /**
         * Parent commit SHAs (empty for root commit). Present to explain merge commits.
         * @param parents the value to set
         * @return this builder
         **/
        

public Builder parents(java.util.List<String> parents) {
    this.parents = parents;
    return this;
}


        public HistorySummary build() {
            HistorySummary model = new HistorySummary(this.commitId
                , this.message
                , this.authorName
                , this.authorEmail
                , this.timeCreated
                , this.isMergeCommit
                , this.parents);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HistorySummary model) {
                this.commitId(model.getCommitId());
    this.message(model.getMessage());
    this.authorName(model.getAuthorName());
    this.authorEmail(model.getAuthorEmail());
    this.timeCreated(model.getTimeCreated());
    this.isMergeCommit(model.getIsMergeCommit());
    this.parents(model.getParents());
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
     * Commit SHA.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

        /**
     * Commit SHA.
     * @return the value
     **/
    
    public String getCommitId() {
        return commitId;
    }


        /**
     * First line of commit message (subject).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * First line of commit message (subject).
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * Commit author display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authorName")
    private final String authorName;

        /**
     * Commit author display name.
     * @return the value
     **/
    
    public String getAuthorName() {
        return authorName;
    }


        /**
     * Commit author email (optional).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
    private final String authorEmail;

        /**
     * Commit author email (optional).
     * @return the value
     **/
    
    public String getAuthorEmail() {
        return authorEmail;
    }


        /**
     * Commit authored time (or committed time if you prefer, but be consistent).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Commit authored time (or committed time if you prefer, but be consistent).
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * True if commit has multiple parents.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isMergeCommit")
    private final Boolean isMergeCommit;

        /**
     * True if commit has multiple parents.
     * @return the value
     **/
    
    public Boolean getIsMergeCommit() {
        return isMergeCommit;
    }


        /**
     * Parent commit SHAs (empty for root commit). Present to explain merge commits.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parents")
    private final java.util.List<String> parents;

        /**
     * Parent commit SHAs (empty for root commit). Present to explain merge commits.
     * @return the value
     **/
    
    public java.util.List<String> getParents() {
        return parents;
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
        sb.append("HistorySummary(");
        sb.append("commitId=").append(String.valueOf(this.commitId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", authorName=").append(String.valueOf(this.authorName));
        sb.append(", authorEmail=").append(String.valueOf(this.authorEmail));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", isMergeCommit=").append(String.valueOf(this.isMergeCommit));
        sb.append(", parents=").append(String.valueOf(this.parents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HistorySummary)) {
            return false;
        }

        HistorySummary other = (HistorySummary) o;
        return java.util.Objects.equals(this.commitId, other.commitId) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.authorName, other.authorName) &&
            java.util.Objects.equals(this.authorEmail, other.authorEmail) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.isMergeCommit, other.isMergeCommit) &&
            java.util.Objects.equals(this.parents, other.parents);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.authorName == null ? 43 : this.authorName.hashCode());
        result = (result * PRIME) + (this.authorEmail == null ? 43 : this.authorEmail.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.isMergeCommit == null ? 43 : this.isMergeCommit.hashCode());
        result = (result * PRIME) + (this.parents == null ? 43 : this.parents.hashCode());
        return result;
    }


}
