// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * DatasetInput
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DatasetInput.Builder.class)

public final class DatasetInput  {
    @Deprecated
    @java.beans.ConstructorProperties({"dataset", "tags"})
    public DatasetInput(Dataset dataset, java.util.List<InputTag> tags) {
        super();
        this.dataset = dataset;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("dataset")
        private Dataset dataset;

        

        public Builder dataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
        }
            /**
     * Tags for the dataset input.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<InputTag> tags;

                /**
         * Tags for the dataset input.
         * @param tags the value to set
         * @return this builder
         **/
        

        public Builder tags(java.util.List<InputTag> tags) {
        this.tags = tags;
        return this;
        }


        public DatasetInput build() {
            DatasetInput model = new DatasetInput(this.dataset
                    , this.tags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatasetInput model) {
                this.dataset(model.getDataset());
    this.tags(model.getTags());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("dataset")
    private final Dataset dataset;

    
    public Dataset getDataset() {
        return dataset;
    }


        /**
     * Tags for the dataset input.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<InputTag> tags;

        /**
     * Tags for the dataset input.
     * @return the value
     **/
    
    public java.util.List<InputTag> getTags() {
        return tags;
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
        sb.append("DatasetInput(");
        sb.append("dataset=").append(String.valueOf(this.dataset));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatasetInput)) {
            return false;
        }

        DatasetInput other = (DatasetInput) o;
        return java.util.Objects.equals(this.dataset, other.dataset) &&
            java.util.Objects.equals(this.tags, other.tags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataset == null ? 43 : this.dataset.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        return result;
    }


}
