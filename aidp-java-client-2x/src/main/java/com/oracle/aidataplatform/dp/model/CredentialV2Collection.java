package com.oracle.aidataplatform.dp.model;


/**
 * Result of CredentialV2Collection
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CredentialV2Collection.Builder.class)

public final class CredentialV2Collection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public CredentialV2Collection(java.util.List<CredentialV2Summary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of CredentialV2 Summaries
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<CredentialV2Summary> items;

                /**
         * List of CredentialV2 Summaries
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<CredentialV2Summary> items) {
        this.items = items;
        return this;
        }


        public CredentialV2Collection build() {
            CredentialV2Collection model = new CredentialV2Collection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialV2Collection model) {
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
     * List of CredentialV2 Summaries
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<CredentialV2Summary> items;

        /**
     * List of CredentialV2 Summaries
     * @return the value
     **/
    
    public java.util.List<CredentialV2Summary> getItems() {
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
        sb.append("CredentialV2Collection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialV2Collection)) {
            return false;
        }

        CredentialV2Collection other = (CredentialV2Collection) o;
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
