// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing agents in a schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentCollection.Builder.class)

public final class AgentCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public AgentCollection(java.util.List<AgentInfo> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of Agents.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<AgentInfo> items;

        /**
         * List of Agents.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<AgentInfo> items) {
    this.items = items;
    return this;
}


        public AgentCollection build() {
            AgentCollection model = new AgentCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentCollection model) {
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
     * List of Agents.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AgentInfo> items;

        /**
     * List of Agents.
     * @return the value
     **/
    
    public java.util.List<AgentInfo> getItems() {
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
        sb.append("AgentCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentCollection)) {
            return false;
        }

        AgentCollection other = (AgentCollection) o;
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
