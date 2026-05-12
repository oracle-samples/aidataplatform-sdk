package com.oracle.aidataplatform.dp.model;



/**
 * HNSW (Hierarchical Navigable Small World) index parameters
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KbVHnswIndexDetails.Builder.class)

public final class KbVHnswIndexDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"distance", "targetAccuracy", "neighbors", "efConstruction"})
    public KbVHnswIndexDetails(Distance distance, Integer targetAccuracy, Integer neighbors, Integer efConstruction) {
        super();
        this.distance = distance;
        this.targetAccuracy = targetAccuracy;
        this.neighbors = neighbors;
        this.efConstruction = efConstruction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Distance metric for the vector index
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("distance")
private Distance distance;

        /**
         * Distance metric for the vector index
         * @param distance the value to set
         * @return this builder
         **/
        

public Builder distance(Distance distance) {
    this.distance = distance;
    return this;
}
            /**
     * Target accuracy percentage for the index (1-100)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetAccuracy")
private Integer targetAccuracy;

        /**
         * Target accuracy percentage for the index (1-100)
         * @param targetAccuracy the value to set
         * @return this builder
         **/
        

public Builder targetAccuracy(Integer targetAccuracy) {
    this.targetAccuracy = targetAccuracy;
    return this;
}
            /**
     * Maximum number of neighbors each vector can have on any layer (M parameter)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("neighbors")
private Integer neighbors;

        /**
         * Maximum number of neighbors each vector can have on any layer (M parameter)
         * @param neighbors the value to set
         * @return this builder
         **/
        

public Builder neighbors(Integer neighbors) {
    this.neighbors = neighbors;
    return this;
}
            /**
     * Maximum number of closest vector candidates considered during index construction
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("efConstruction")
private Integer efConstruction;

        /**
         * Maximum number of closest vector candidates considered during index construction
         * @param efConstruction the value to set
         * @return this builder
         **/
        

public Builder efConstruction(Integer efConstruction) {
    this.efConstruction = efConstruction;
    return this;
}


        public KbVHnswIndexDetails build() {
            KbVHnswIndexDetails model = new KbVHnswIndexDetails(this.distance
                , this.targetAccuracy
                , this.neighbors
                , this.efConstruction);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KbVHnswIndexDetails model) {
                this.distance(model.getDistance());
    this.targetAccuracy(model.getTargetAccuracy());
    this.neighbors(model.getNeighbors());
    this.efConstruction(model.getEfConstruction());
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
     * Distance metric for the vector index
     **/
    public enum Distance implements com.oracle.bmc.http.internal.BmcEnum {
        Cosine("COSINE"),
        Euclidean("EUCLIDEAN"),
        L2Squared("L2_SQUARED"),
        Dot("DOT"),
        Manhattan("MANHATTAN"),
        Hamming("HAMMING"),
        Jaccard("JACCARD"),
        ;

        

        private final String value;
        private static java.util.Map<String, Distance> map;

        static {
            map = new java.util.HashMap<>();
            for (Distance v : Distance.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Distance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Distance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Distance: " + key);
        }
    };
        /**
     * Distance metric for the vector index
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("distance")
    private final Distance distance;

        /**
     * Distance metric for the vector index
     * @return the value
     **/
    
    public Distance getDistance() {
        return distance;
    }


        /**
     * Target accuracy percentage for the index (1-100)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetAccuracy")
    private final Integer targetAccuracy;

        /**
     * Target accuracy percentage for the index (1-100)
     * @return the value
     **/
    
    public Integer getTargetAccuracy() {
        return targetAccuracy;
    }


        /**
     * Maximum number of neighbors each vector can have on any layer (M parameter)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("neighbors")
    private final Integer neighbors;

        /**
     * Maximum number of neighbors each vector can have on any layer (M parameter)
     * @return the value
     **/
    
    public Integer getNeighbors() {
        return neighbors;
    }


        /**
     * Maximum number of closest vector candidates considered during index construction
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("efConstruction")
    private final Integer efConstruction;

        /**
     * Maximum number of closest vector candidates considered during index construction
     * @return the value
     **/
    
    public Integer getEfConstruction() {
        return efConstruction;
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
        sb.append("KbVHnswIndexDetails(");
        sb.append("distance=").append(String.valueOf(this.distance));
        sb.append(", targetAccuracy=").append(String.valueOf(this.targetAccuracy));
        sb.append(", neighbors=").append(String.valueOf(this.neighbors));
        sb.append(", efConstruction=").append(String.valueOf(this.efConstruction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KbVHnswIndexDetails)) {
            return false;
        }

        KbVHnswIndexDetails other = (KbVHnswIndexDetails) o;
        return java.util.Objects.equals(this.distance, other.distance) &&
            java.util.Objects.equals(this.targetAccuracy, other.targetAccuracy) &&
            java.util.Objects.equals(this.neighbors, other.neighbors) &&
            java.util.Objects.equals(this.efConstruction, other.efConstruction);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.distance == null ? 43 : this.distance.hashCode());
        result = (result * PRIME) + (this.targetAccuracy == null ? 43 : this.targetAccuracy.hashCode());
        result = (result * PRIME) + (this.neighbors == null ? 43 : this.neighbors.hashCode());
        result = (result * PRIME) + (this.efConstruction == null ? 43 : this.efConstruction.hashCode());
        return result;
    }


}
