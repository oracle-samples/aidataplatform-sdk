// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Flattened results in subject order and resource order. Unknown response fields are preserved by the HTTP proxy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForResponseDetails.Builder.class)

public final class AccessGrantedForResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public AccessGrantedForResponseDetails(java.util.List<AccessGrantedForResult> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<AccessGrantedForResult> items;

        /**
         * One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<AccessGrantedForResult> items) {
    this.items = items;
    return this;
}


        public AccessGrantedForResponseDetails build() {
            AccessGrantedForResponseDetails model = new AccessGrantedForResponseDetails(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForResponseDetails model) {
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
     * One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AccessGrantedForResult> items;

        /**
     * One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.
     * @return the value
     **/
    
    public java.util.List<AccessGrantedForResult> getItems() {
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
        sb.append("AccessGrantedForResponseDetails(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForResponseDetails)) {
            return false;
        }

        AccessGrantedForResponseDetails other = (AccessGrantedForResponseDetails) o;
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
