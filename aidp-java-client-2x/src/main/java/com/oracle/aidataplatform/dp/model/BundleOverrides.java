// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Override candidates grouped by dependency for compute and aicompute.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundleOverrides.Builder.class)

public final class BundleOverrides  {
    @Deprecated
    @java.beans.ConstructorProperties({"compute", "aicompute"})
    public BundleOverrides(java.util.List<ComputeOverrideItem> compute, java.util.List<AiComputeOverrideItem> aicompute) {
        super();
        this.compute = compute;
        this.aicompute = aicompute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Compute override candidates grouped by dependency.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("compute")
        private java.util.List<ComputeOverrideItem> compute;

                /**
         * Compute override candidates grouped by dependency.
         * @param compute the value to set
         * @return this builder
         **/
        

        public Builder compute(java.util.List<ComputeOverrideItem> compute) {
        this.compute = compute;
        return this;
        }
            /**
     * Aicompute override candidates grouped by dependency.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("aicompute")
        private java.util.List<AiComputeOverrideItem> aicompute;

                /**
         * Aicompute override candidates grouped by dependency.
         * @param aicompute the value to set
         * @return this builder
         **/
        

        public Builder aicompute(java.util.List<AiComputeOverrideItem> aicompute) {
        this.aicompute = aicompute;
        return this;
        }


        public BundleOverrides build() {
            BundleOverrides model = new BundleOverrides(this.compute
                    , this.aicompute);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundleOverrides model) {
                this.compute(model.getCompute());
    this.aicompute(model.getAicompute());
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
     * Compute override candidates grouped by dependency.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compute")
    private final java.util.List<ComputeOverrideItem> compute;

        /**
     * Compute override candidates grouped by dependency.
     * @return the value
     **/
    
    public java.util.List<ComputeOverrideItem> getCompute() {
        return compute;
    }


        /**
     * Aicompute override candidates grouped by dependency.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aicompute")
    private final java.util.List<AiComputeOverrideItem> aicompute;

        /**
     * Aicompute override candidates grouped by dependency.
     * @return the value
     **/
    
    public java.util.List<AiComputeOverrideItem> getAicompute() {
        return aicompute;
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
        sb.append("BundleOverrides(");
        sb.append("compute=").append(String.valueOf(this.compute));
        sb.append(", aicompute=").append(String.valueOf(this.aicompute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundleOverrides)) {
            return false;
        }

        BundleOverrides other = (BundleOverrides) o;
        return java.util.Objects.equals(this.compute, other.compute) &&
            java.util.Objects.equals(this.aicompute, other.aicompute);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.compute == null ? 43 : this.compute.hashCode());
        result = (result * PRIME) + (this.aicompute == null ? 43 : this.aicompute.hashCode());
        return result;
    }


}
