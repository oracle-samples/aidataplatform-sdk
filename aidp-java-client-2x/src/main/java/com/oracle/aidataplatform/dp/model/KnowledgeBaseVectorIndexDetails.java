package com.oracle.aidataplatform.dp.model;


/**
 * Index configuration details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseVectorIndexDetails.Builder.class)

public final class KnowledgeBaseVectorIndexDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "hnswDetails", "ivfDetails"})
    public KnowledgeBaseVectorIndexDetails(KnowledgeBaseVectorIndexType type, KbVHnswIndexDetails hnswDetails, KbVIvfIndexDetails ivfDetails) {
        super();
        this.type = type;
        this.hnswDetails = hnswDetails;
        this.ivfDetails = ivfDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Type of vector index (HNSW or IVF)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private KnowledgeBaseVectorIndexType type;

                /**
         * Type of vector index (HNSW or IVF)
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(KnowledgeBaseVectorIndexType type) {
        this.type = type;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("hnswDetails")
        private KbVHnswIndexDetails hnswDetails;

        

        public Builder hnswDetails(KbVHnswIndexDetails hnswDetails) {
        this.hnswDetails = hnswDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("ivfDetails")
        private KbVIvfIndexDetails ivfDetails;

        

        public Builder ivfDetails(KbVIvfIndexDetails ivfDetails) {
        this.ivfDetails = ivfDetails;
        return this;
        }


        public KnowledgeBaseVectorIndexDetails build() {
            KnowledgeBaseVectorIndexDetails model = new KnowledgeBaseVectorIndexDetails(this.type
                    , this.hnswDetails
                    , this.ivfDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseVectorIndexDetails model) {
                this.type(model.getType());
    this.hnswDetails(model.getHnswDetails());
    this.ivfDetails(model.getIvfDetails());
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
     * Type of vector index (HNSW or IVF)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseVectorIndexType type;

        /**
     * Type of vector index (HNSW or IVF)
     * @return the value
     **/
    
    public KnowledgeBaseVectorIndexType getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("hnswDetails")
    private final KbVHnswIndexDetails hnswDetails;

    
    public KbVHnswIndexDetails getHnswDetails() {
        return hnswDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("ivfDetails")
    private final KbVIvfIndexDetails ivfDetails;

    
    public KbVIvfIndexDetails getIvfDetails() {
        return ivfDetails;
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
        sb.append("KnowledgeBaseVectorIndexDetails(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", hnswDetails=").append(String.valueOf(this.hnswDetails));
        sb.append(", ivfDetails=").append(String.valueOf(this.ivfDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseVectorIndexDetails)) {
            return false;
        }

        KnowledgeBaseVectorIndexDetails other = (KnowledgeBaseVectorIndexDetails) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.hnswDetails, other.hnswDetails) &&
            java.util.Objects.equals(this.ivfDetails, other.ivfDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.hnswDetails == null ? 43 : this.hnswDetails.hashCode());
        result = (result * PRIME) + (this.ivfDetails == null ? 43 : this.ivfDetails.hashCode());
        return result;
    }


}
