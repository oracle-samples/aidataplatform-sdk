package com.oracle.aidataplatform.dp.model;


/**
 * IVF (Inverted File Flat) index parameters
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KbVIvfIndexDetails.Builder.class)

public final class KbVIvfIndexDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"distance", "targetAccuracy", "neighborPartitions", "neighborPartitionProbes"})
    public KbVIvfIndexDetails(Distance distance, Integer targetAccuracy, Integer neighborPartitions, Integer neighborPartitionProbes) {
        super();
        this.distance = distance;
        this.targetAccuracy = targetAccuracy;
        this.neighborPartitions = neighborPartitions;
        this.neighborPartitionProbes = neighborPartitionProbes;
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
     * Number of partitions (clusters) to divide the vector data into
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("neighborPartitions")
        private Integer neighborPartitions;

                /**
         * Number of partitions (clusters) to divide the vector data into
         * @param neighborPartitions the value to set
         * @return this builder
         **/
        

        public Builder neighborPartitions(Integer neighborPartitions) {
        this.neighborPartitions = neighborPartitions;
        return this;
        }
            /**
     * Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("neighborPartitionProbes")
        private Integer neighborPartitionProbes;

                /**
         * Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance
         * @param neighborPartitionProbes the value to set
         * @return this builder
         **/
        

        public Builder neighborPartitionProbes(Integer neighborPartitionProbes) {
        this.neighborPartitionProbes = neighborPartitionProbes;
        return this;
        }


        public KbVIvfIndexDetails build() {
            KbVIvfIndexDetails model = new KbVIvfIndexDetails(this.distance
                    , this.targetAccuracy
                    , this.neighborPartitions
                    , this.neighborPartitionProbes);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KbVIvfIndexDetails model) {
                this.distance(model.getDistance());
    this.targetAccuracy(model.getTargetAccuracy());
    this.neighborPartitions(model.getNeighborPartitions());
    this.neighborPartitionProbes(model.getNeighborPartitionProbes());
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
    public enum Distance {
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
     * Number of partitions (clusters) to divide the vector data into
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("neighborPartitions")
    private final Integer neighborPartitions;

        /**
     * Number of partitions (clusters) to divide the vector data into
     * @return the value
     **/
    
    public Integer getNeighborPartitions() {
        return neighborPartitions;
    }


        /**
     * Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("neighborPartitionProbes")
    private final Integer neighborPartitionProbes;

        /**
     * Maximum number of partitions to probe during a search. Higher values increase accuracy but may reduce performance
     * @return the value
     **/
    
    public Integer getNeighborPartitionProbes() {
        return neighborPartitionProbes;
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
        sb.append("KbVIvfIndexDetails(");
        sb.append("distance=").append(String.valueOf(this.distance));
        sb.append(", targetAccuracy=").append(String.valueOf(this.targetAccuracy));
        sb.append(", neighborPartitions=").append(String.valueOf(this.neighborPartitions));
        sb.append(", neighborPartitionProbes=").append(String.valueOf(this.neighborPartitionProbes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KbVIvfIndexDetails)) {
            return false;
        }

        KbVIvfIndexDetails other = (KbVIvfIndexDetails) o;
        return java.util.Objects.equals(this.distance, other.distance) &&
            java.util.Objects.equals(this.targetAccuracy, other.targetAccuracy) &&
            java.util.Objects.equals(this.neighborPartitions, other.neighborPartitions) &&
            java.util.Objects.equals(this.neighborPartitionProbes, other.neighborPartitionProbes);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.distance == null ? 43 : this.distance.hashCode());
        result = (result * PRIME) + (this.targetAccuracy == null ? 43 : this.targetAccuracy.hashCode());
        result = (result * PRIME) + (this.neighborPartitions == null ? 43 : this.neighborPartitions.hashCode());
        result = (result * PRIME) + (this.neighborPartitionProbes == null ? 43 : this.neighborPartitionProbes.hashCode());
        return result;
    }


}
