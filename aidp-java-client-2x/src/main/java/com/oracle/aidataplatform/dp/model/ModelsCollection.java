package com.oracle.aidataplatform.dp.model;


/**
 * The results of a Models list, it contains ModelSummary objects.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelsCollection.Builder.class)

public final class ModelsCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public ModelsCollection(java.util.List<ModelSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The Models Summaries returned.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ModelSummary> items;

                /**
         * The Models Summaries returned.
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<ModelSummary> items) {
        this.items = items;
        return this;
        }


        public ModelsCollection build() {
            ModelsCollection model = new ModelsCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelsCollection model) {
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
     * The Models Summaries returned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ModelSummary> items;

        /**
     * The Models Summaries returned.
     * @return the value
     **/
    
    public java.util.List<ModelSummary> getItems() {
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
        sb.append("ModelsCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelsCollection)) {
            return false;
        }

        ModelsCollection other = (ModelsCollection) o;
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
