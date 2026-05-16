// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Results of a workspace search. Contains summary information of workspaces.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceCollection.Builder.class)

public final class WorkspaceCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public WorkspaceCollection(java.util.List<WorkspaceSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of workspaces.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<WorkspaceSummary> items;

                /**
         * List of workspaces.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<WorkspaceSummary> items) {
        this.items = items;
        return this;
        }


        public WorkspaceCollection build() {
            WorkspaceCollection model = new WorkspaceCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceCollection model) {
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
     * List of workspaces.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<WorkspaceSummary> items;

        /**
     * List of workspaces.
     * @return the value
     **/
    
    public java.util.List<WorkspaceSummary> getItems() {
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
        sb.append("WorkspaceCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceCollection)) {
            return false;
        }

        WorkspaceCollection other = (WorkspaceCollection) o;
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
