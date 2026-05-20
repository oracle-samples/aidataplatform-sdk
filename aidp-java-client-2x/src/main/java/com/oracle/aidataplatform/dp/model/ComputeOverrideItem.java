// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Aggregated override candidate for a compute dependency.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ComputeOverrideItem.Builder.class)

public final class ComputeOverrideItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "variableName", "defaultValue", "overrideValue", "jobs"})
    public ComputeOverrideItem(String name, String variableName, String defaultValue, String overrideValue, java.util.List<String> jobs) {
        super();
        this.name = name;
        this.variableName = variableName;
        this.defaultValue = defaultValue;
        this.overrideValue = overrideValue;
        this.jobs = jobs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Compute dependency name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Compute dependency name.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Variable name used for this override candidate.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("variableName")
        private String variableName;

                /**
         * Variable name used for this override candidate.
         * @param variableName the value to set
         * @return this builder
         **/
        

        public Builder variableName(String variableName) {
        this.variableName = variableName;
        return this;
        }
            /**
     * Canonical dependency token using {@code .key}.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

                /**
         * Canonical dependency token using {@code .key}.
         * @param defaultValue the value to set
         * @return this builder
         **/
        

        public Builder defaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
        }
            /**
     * Current override value resolved from {@code .aidp/overrides.yaml} if present.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("overrideValue")
        private String overrideValue;

                /**
         * Current override value resolved from {@code .aidp/overrides.yaml} if present.
         * @param overrideValue the value to set
         * @return this builder
         **/
        

        public Builder overrideValue(String overrideValue) {
        this.overrideValue = overrideValue;
        return this;
        }
            /**
     * Top-level jobs that reference this compute dependency.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("jobs")
        private java.util.List<String> jobs;

                /**
         * Top-level jobs that reference this compute dependency.
         * @param jobs the value to set
         * @return this builder
         **/
        

        public Builder jobs(java.util.List<String> jobs) {
        this.jobs = jobs;
        return this;
        }


        public ComputeOverrideItem build() {
            ComputeOverrideItem model = new ComputeOverrideItem(this.name
                    , this.variableName
                    , this.defaultValue
                    , this.overrideValue
                    , this.jobs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeOverrideItem model) {
                this.name(model.getName());
    this.variableName(model.getVariableName());
    this.defaultValue(model.getDefaultValue());
    this.overrideValue(model.getOverrideValue());
    this.jobs(model.getJobs());
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
     * Compute dependency name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Compute dependency name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Variable name used for this override candidate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("variableName")
    private final String variableName;

        /**
     * Variable name used for this override candidate.
     * @return the value
     **/
    
    public String getVariableName() {
        return variableName;
    }


        /**
     * Canonical dependency token using {@code .key}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

        /**
     * Canonical dependency token using {@code .key}.
     * @return the value
     **/
    
    public String getDefaultValue() {
        return defaultValue;
    }


        /**
     * Current override value resolved from {@code .aidp/overrides.yaml} if present.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("overrideValue")
    private final String overrideValue;

        /**
     * Current override value resolved from {@code .aidp/overrides.yaml} if present.
     * @return the value
     **/
    
    public String getOverrideValue() {
        return overrideValue;
    }


        /**
     * Top-level jobs that reference this compute dependency.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobs")
    private final java.util.List<String> jobs;

        /**
     * Top-level jobs that reference this compute dependency.
     * @return the value
     **/
    
    public java.util.List<String> getJobs() {
        return jobs;
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
        sb.append("ComputeOverrideItem(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", variableName=").append(String.valueOf(this.variableName));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", overrideValue=").append(String.valueOf(this.overrideValue));
        sb.append(", jobs=").append(String.valueOf(this.jobs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeOverrideItem)) {
            return false;
        }

        ComputeOverrideItem other = (ComputeOverrideItem) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.variableName, other.variableName) &&
            java.util.Objects.equals(this.defaultValue, other.defaultValue) &&
            java.util.Objects.equals(this.overrideValue, other.overrideValue) &&
            java.util.Objects.equals(this.jobs, other.jobs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.variableName == null ? 43 : this.variableName.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.overrideValue == null ? 43 : this.overrideValue.hashCode());
        result = (result * PRIME) + (this.jobs == null ? 43 : this.jobs.hashCode());
        return result;
    }


}
