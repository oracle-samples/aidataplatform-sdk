// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One page of deployment log events.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogPage.Builder.class)

public final class DeploymentLogPage  {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "nextPageToken"})
    public DeploymentLogPage(java.util.List<DeploymentLogSummary> items, String nextPageToken) {
        super();
        this.items = items;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Log events for this page, newest first. May be empty while nextPageToken is set.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<DeploymentLogSummary> items;

        /**
         * Log events for this page, newest first. May be empty while nextPageToken is set.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<DeploymentLogSummary> items) {
    this.items = items;
    return this;
}
            /**
     * Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextPageToken")
private String nextPageToken;

        /**
         * Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public DeploymentLogPage build() {
            DeploymentLogPage model = new DeploymentLogPage(this.items
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogPage model) {
                this.items(model.getItems());
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
     * Log events for this page, newest first. May be empty while nextPageToken is set.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<DeploymentLogSummary> items;

        /**
     * Log events for this page, newest first. May be empty while nextPageToken is set.
     * @return the value
     **/
    
    public java.util.List<DeploymentLogSummary> getItems() {
        return items;
    }


        /**
     * Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPageToken")
    private final String nextPageToken;

        /**
     * Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.
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
        sb.append("DeploymentLogPage(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogPage)) {
            return false;
        }

        DeploymentLogPage other = (DeploymentLogPage) o;
        return java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
