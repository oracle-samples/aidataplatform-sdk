// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * List of credential permissions.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CredentialsPermissionCollection.Builder.class)

public final class CredentialsPermissionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public CredentialsPermissionCollection(java.util.List<PermissionSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of credential permissions.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<PermissionSummary> items;

                /**
         * List of credential permissions.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<PermissionSummary> items) {
        this.items = items;
        return this;
        }


        public CredentialsPermissionCollection build() {
            CredentialsPermissionCollection model = new CredentialsPermissionCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialsPermissionCollection model) {
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
     * List of credential permissions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PermissionSummary> items;

        /**
     * List of credential permissions.
     * @return the value
     **/
    
    public java.util.List<PermissionSummary> getItems() {
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
        sb.append("CredentialsPermissionCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialsPermissionCollection)) {
            return false;
        }

        CredentialsPermissionCollection other = (CredentialsPermissionCollection) o;
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
