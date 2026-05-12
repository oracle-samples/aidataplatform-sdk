package com.oracle.aidataplatform.dp.model;


/**
 * Returns a list of users with particular AI Data Platform Workbench RBAC permissions across workspaces.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PrincipalsWithWorkspaceAccessCollection.Builder.class)

public final class PrincipalsWithWorkspaceAccessCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public PrincipalsWithWorkspaceAccessCollection(java.util.List<PrincipalsWithWorkspaceAccessSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of users with particular AI Data Platform Workbench RBAC permissions across workspaces.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<PrincipalsWithWorkspaceAccessSummary> items;

                /**
         * List of users with particular AI Data Platform Workbench RBAC permissions across workspaces.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<PrincipalsWithWorkspaceAccessSummary> items) {
        this.items = items;
        return this;
        }


        public PrincipalsWithWorkspaceAccessCollection build() {
            PrincipalsWithWorkspaceAccessCollection model = new PrincipalsWithWorkspaceAccessCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrincipalsWithWorkspaceAccessCollection model) {
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
     * List of users with particular AI Data Platform Workbench RBAC permissions across workspaces.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PrincipalsWithWorkspaceAccessSummary> items;

        /**
     * List of users with particular AI Data Platform Workbench RBAC permissions across workspaces.
     * @return the value
     **/
    
    public java.util.List<PrincipalsWithWorkspaceAccessSummary> getItems() {
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
        sb.append("PrincipalsWithWorkspaceAccessCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrincipalsWithWorkspaceAccessCollection)) {
            return false;
        }

        PrincipalsWithWorkspaceAccessCollection other = (PrincipalsWithWorkspaceAccessCollection) o;
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
