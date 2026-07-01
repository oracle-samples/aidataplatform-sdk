// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing agents in a schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentSessionCollection.Builder.class)

public final class AgentSessionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public AgentSessionCollection(java.util.List<AgentSessionSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of agent sessions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<AgentSessionSummary> items;

        /**
         * List of agent sessions.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<AgentSessionSummary> items) {
    this.items = items;
    return this;
}


        public AgentSessionCollection build() {
            AgentSessionCollection model = new AgentSessionCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentSessionCollection model) {
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
     * List of agent sessions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AgentSessionSummary> items;

        /**
     * List of agent sessions.
     * @return the value
     **/
    
    public java.util.List<AgentSessionSummary> getItems() {
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
        sb.append("AgentSessionCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentSessionCollection)) {
            return false;
        }

        AgentSessionCollection other = (AgentSessionCollection) o;
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
