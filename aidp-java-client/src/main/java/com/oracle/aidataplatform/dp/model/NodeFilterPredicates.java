// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of conditions
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NodeFilterPredicates.Builder.class)

public final class NodeFilterPredicates  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayNameContains", "typeEquals"})
    public NodeFilterPredicates(String displayNameContains, String typeEquals) {
        super();
        this.displayNameContains = displayNameContains;
        this.typeEquals = typeEquals;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Filters nodes whose display name contains the specified value.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayNameContains")
private String displayNameContains;

        /**
         * Filters nodes whose display name contains the specified value.
         * @param displayNameContains the value to set
         * @return this builder
         **/
        

public Builder displayNameContains(String displayNameContains) {
    this.displayNameContains = displayNameContains;
    return this;
}
            /**
     * Filters nodes whose type exactly matches the specified value.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("typeEquals")
private String typeEquals;

        /**
         * Filters nodes whose type exactly matches the specified value.
         * @param typeEquals the value to set
         * @return this builder
         **/
        

public Builder typeEquals(String typeEquals) {
    this.typeEquals = typeEquals;
    return this;
}


        public NodeFilterPredicates build() {
            NodeFilterPredicates model = new NodeFilterPredicates(this.displayNameContains
                , this.typeEquals);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeFilterPredicates model) {
                this.displayNameContains(model.getDisplayNameContains());
    this.typeEquals(model.getTypeEquals());
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
     * Filters nodes whose display name contains the specified value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayNameContains")
    private final String displayNameContains;

        /**
     * Filters nodes whose display name contains the specified value.
     * @return the value
     **/
    
    public String getDisplayNameContains() {
        return displayNameContains;
    }


        /**
     * Filters nodes whose type exactly matches the specified value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("typeEquals")
    private final String typeEquals;

        /**
     * Filters nodes whose type exactly matches the specified value.
     * @return the value
     **/
    
    public String getTypeEquals() {
        return typeEquals;
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
        sb.append("NodeFilterPredicates(");
        sb.append("displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(", typeEquals=").append(String.valueOf(this.typeEquals));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeFilterPredicates)) {
            return false;
        }

        NodeFilterPredicates other = (NodeFilterPredicates) o;
        return java.util.Objects.equals(this.displayNameContains, other.displayNameContains) &&
            java.util.Objects.equals(this.typeEquals, other.typeEquals);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayNameContains == null ? 43 : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.typeEquals == null ? 43 : this.typeEquals.hashCode());
        return result;
    }


}
