// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details to rename a workspace object.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RenameWorkspaceObjectDetails.Builder.class)

public final class RenameWorkspaceObjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "newName"})
    public RenameWorkspaceObjectDetails(String path, String newName) {
        super();
        this.path = path;
        this.newName = newName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The fully qualified path of the Workspace object that should be renamed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * The fully qualified path of the Workspace object that should be renamed.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * The new name of the workspace object.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("newName")
        private String newName;

                /**
         * The new name of the workspace object.
         * @param newName the value to set
         * @return this builder
         **/
        

        public Builder newName(String newName) {
        this.newName = newName;
        return this;
        }


        public RenameWorkspaceObjectDetails build() {
            RenameWorkspaceObjectDetails model = new RenameWorkspaceObjectDetails(this.path
                    , this.newName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameWorkspaceObjectDetails model) {
                this.path(model.getPath());
    this.newName(model.getNewName());
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
     * The fully qualified path of the Workspace object that should be renamed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The fully qualified path of the Workspace object that should be renamed.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * The new name of the workspace object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("newName")
    private final String newName;

        /**
     * The new name of the workspace object.
     * @return the value
     **/
    
    public String getNewName() {
        return newName;
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
        sb.append("RenameWorkspaceObjectDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", newName=").append(String.valueOf(this.newName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameWorkspaceObjectDetails)) {
            return false;
        }

        RenameWorkspaceObjectDetails other = (RenameWorkspaceObjectDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.newName, other.newName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.newName == null ? 43 : this.newName.hashCode());
        return result;
    }


}
