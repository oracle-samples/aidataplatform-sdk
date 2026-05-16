// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The resources which were recently accessed by a user.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RecentlyAccessedResource.Builder.class)

public final class RecentlyAccessedResource  {
    @Deprecated
    @java.beans.ConstructorProperties({"lastAccessedWorkspaceKey", "lastAccessedWorkspaceDisplayName"})
    public RecentlyAccessedResource(String lastAccessedWorkspaceKey, String lastAccessedWorkspaceDisplayName) {
        super();
        this.lastAccessedWorkspaceKey = lastAccessedWorkspaceKey;
        this.lastAccessedWorkspaceDisplayName = lastAccessedWorkspaceDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Last active workspaceKey.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lastAccessedWorkspaceKey")
private String lastAccessedWorkspaceKey;

        /**
         * Last active workspaceKey.
         * @param lastAccessedWorkspaceKey the value to set
         * @return this builder
         **/
        

public Builder lastAccessedWorkspaceKey(String lastAccessedWorkspaceKey) {
    this.lastAccessedWorkspaceKey = lastAccessedWorkspaceKey;
    return this;
}
            /**
     * Last active workspace display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lastAccessedWorkspaceDisplayName")
private String lastAccessedWorkspaceDisplayName;

        /**
         * Last active workspace display name.
         * @param lastAccessedWorkspaceDisplayName the value to set
         * @return this builder
         **/
        

public Builder lastAccessedWorkspaceDisplayName(String lastAccessedWorkspaceDisplayName) {
    this.lastAccessedWorkspaceDisplayName = lastAccessedWorkspaceDisplayName;
    return this;
}


        public RecentlyAccessedResource build() {
            RecentlyAccessedResource model = new RecentlyAccessedResource(this.lastAccessedWorkspaceKey
                , this.lastAccessedWorkspaceDisplayName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecentlyAccessedResource model) {
                this.lastAccessedWorkspaceKey(model.getLastAccessedWorkspaceKey());
    this.lastAccessedWorkspaceDisplayName(model.getLastAccessedWorkspaceDisplayName());
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
     * Last active workspaceKey.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastAccessedWorkspaceKey")
    private final String lastAccessedWorkspaceKey;

        /**
     * Last active workspaceKey.
     * @return the value
     **/
    
    public String getLastAccessedWorkspaceKey() {
        return lastAccessedWorkspaceKey;
    }


        /**
     * Last active workspace display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastAccessedWorkspaceDisplayName")
    private final String lastAccessedWorkspaceDisplayName;

        /**
     * Last active workspace display name.
     * @return the value
     **/
    
    public String getLastAccessedWorkspaceDisplayName() {
        return lastAccessedWorkspaceDisplayName;
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
        sb.append("RecentlyAccessedResource(");
        sb.append("lastAccessedWorkspaceKey=").append(String.valueOf(this.lastAccessedWorkspaceKey));
        sb.append(", lastAccessedWorkspaceDisplayName=").append(String.valueOf(this.lastAccessedWorkspaceDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentlyAccessedResource)) {
            return false;
        }

        RecentlyAccessedResource other = (RecentlyAccessedResource) o;
        return java.util.Objects.equals(this.lastAccessedWorkspaceKey, other.lastAccessedWorkspaceKey) &&
            java.util.Objects.equals(this.lastAccessedWorkspaceDisplayName, other.lastAccessedWorkspaceDisplayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lastAccessedWorkspaceKey == null ? 43 : this.lastAccessedWorkspaceKey.hashCode());
        result = (result * PRIME) + (this.lastAccessedWorkspaceDisplayName == null ? 43 : this.lastAccessedWorkspaceDisplayName.hashCode());
        return result;
    }


}
