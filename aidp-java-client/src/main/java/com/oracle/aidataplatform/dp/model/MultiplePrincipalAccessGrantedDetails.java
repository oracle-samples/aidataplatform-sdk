// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Batch of subject access evaluations. Caller IAM authorization is independent of every evaluated subject.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MultiplePrincipalAccessGrantedDetails.Builder.class)

public final class MultiplePrincipalAccessGrantedDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public MultiplePrincipalAccessGrantedDetails(java.util.List<PrincipalAccessGrantedDetails> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Subjects in evaluation order.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<PrincipalAccessGrantedDetails> items;

        /**
         * Subjects in evaluation order.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<PrincipalAccessGrantedDetails> items) {
    this.items = items;
    return this;
}


        public MultiplePrincipalAccessGrantedDetails build() {
            MultiplePrincipalAccessGrantedDetails model = new MultiplePrincipalAccessGrantedDetails(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultiplePrincipalAccessGrantedDetails model) {
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
     * Subjects in evaluation order.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PrincipalAccessGrantedDetails> items;

        /**
     * Subjects in evaluation order.
     * @return the value
     **/
    
    public java.util.List<PrincipalAccessGrantedDetails> getItems() {
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
        sb.append("MultiplePrincipalAccessGrantedDetails(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultiplePrincipalAccessGrantedDetails)) {
            return false;
        }

        MultiplePrincipalAccessGrantedDetails other = (MultiplePrincipalAccessGrantedDetails) o;
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
