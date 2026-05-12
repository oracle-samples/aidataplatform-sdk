package com.oracle.aidataplatform.dp.model;



/**
 * Results of a workspace object list.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceObjectCollection.Builder.class)

public final class WorkspaceObjectCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public WorkspaceObjectCollection(java.util.List<WorkspaceObjectSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of workspace objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<WorkspaceObjectSummary> items;

        /**
         * List of workspace objects.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<WorkspaceObjectSummary> items) {
    this.items = items;
    return this;
}


        public WorkspaceObjectCollection build() {
            WorkspaceObjectCollection model = new WorkspaceObjectCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceObjectCollection model) {
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
     * List of workspace objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<WorkspaceObjectSummary> items;

        /**
     * List of workspace objects.
     * @return the value
     **/
    
    public java.util.List<WorkspaceObjectSummary> getItems() {
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
        sb.append("WorkspaceObjectCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceObjectCollection)) {
            return false;
        }

        WorkspaceObjectCollection other = (WorkspaceObjectCollection) o;
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
