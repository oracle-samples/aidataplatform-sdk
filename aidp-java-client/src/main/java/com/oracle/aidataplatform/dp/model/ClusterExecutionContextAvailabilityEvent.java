package com.oracle.aidataplatform.dp.model;



/**
 * The information about the cluster execution context availability event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterExecutionContextAvailabilityEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class ClusterExecutionContextAvailabilityEvent extends ClusterEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Number of available execution contexts for this cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("numberOfExecutionContexts")
private Integer numberOfExecutionContexts;

        /**
         * Number of available execution contexts for this cluster.
         * @param numberOfExecutionContexts the value to set
         * @return this builder
         **/
        

public Builder numberOfExecutionContexts(Integer numberOfExecutionContexts) {
    this.numberOfExecutionContexts = numberOfExecutionContexts;
    return this;
}


        public ClusterExecutionContextAvailabilityEvent build() {
            ClusterExecutionContextAvailabilityEvent model = new ClusterExecutionContextAvailabilityEvent(this.numberOfExecutionContexts);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterExecutionContextAvailabilityEvent model) {
                this.numberOfExecutionContexts(model.getNumberOfExecutionContexts());
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

    
    @Deprecated
    public ClusterExecutionContextAvailabilityEvent(Integer numberOfExecutionContexts) {
    super();
        this.numberOfExecutionContexts = numberOfExecutionContexts;
    }


        /**
     * Number of available execution contexts for this cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfExecutionContexts")
    private final Integer numberOfExecutionContexts;

        /**
     * Number of available execution contexts for this cluster.
     * @return the value
     **/
    
    public Integer getNumberOfExecutionContexts() {
        return numberOfExecutionContexts;
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
        sb.append("ClusterExecutionContextAvailabilityEvent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", numberOfExecutionContexts=").append(String.valueOf(this.numberOfExecutionContexts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterExecutionContextAvailabilityEvent)) {
            return false;
        }

        ClusterExecutionContextAvailabilityEvent other = (ClusterExecutionContextAvailabilityEvent) o;
        return java.util.Objects.equals(this.numberOfExecutionContexts, other.numberOfExecutionContexts) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.numberOfExecutionContexts == null ? 43 : this.numberOfExecutionContexts.hashCode());
        return result;
    }


}
