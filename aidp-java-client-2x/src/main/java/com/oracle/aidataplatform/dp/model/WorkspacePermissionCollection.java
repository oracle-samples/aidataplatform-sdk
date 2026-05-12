package com.oracle.aidataplatform.dp.model;


/**
 * List of workspace permissions.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspacePermissionCollection.Builder.class)

public final class WorkspacePermissionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public WorkspacePermissionCollection(java.util.List<WorkspacePermissionSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of workspace permissions.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<WorkspacePermissionSummary> items;

                /**
         * List of workspace permissions.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<WorkspacePermissionSummary> items) {
        this.items = items;
        return this;
        }


        public WorkspacePermissionCollection build() {
            WorkspacePermissionCollection model = new WorkspacePermissionCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspacePermissionCollection model) {
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
     * List of workspace permissions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<WorkspacePermissionSummary> items;

        /**
     * List of workspace permissions.
     * @return the value
     **/
    
    public java.util.List<WorkspacePermissionSummary> getItems() {
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
        sb.append("WorkspacePermissionCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspacePermissionCollection)) {
            return false;
        }

        WorkspacePermissionCollection other = (WorkspacePermissionCollection) o;
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
