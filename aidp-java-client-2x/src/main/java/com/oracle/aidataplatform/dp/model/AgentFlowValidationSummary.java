// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary counts for Agent Flow diagram validation issues.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowValidationSummary.Builder.class)

public final class AgentFlowValidationSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalIssues", "errorCount", "warningCount", "infoCount", "phaseCounts"})
    public AgentFlowValidationSummary(Integer totalIssues, Integer errorCount, Integer warningCount, Integer infoCount, java.util.Map<String, Integer> phaseCounts) {
        super();
        this.totalIssues = totalIssues;
        this.errorCount = errorCount;
        this.warningCount = warningCount;
        this.infoCount = infoCount;
        this.phaseCounts = phaseCounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Total number of validation issues.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalIssues")
        private Integer totalIssues;

                /**
         * Total number of validation issues.
         * @param totalIssues the value to set
         * @return this builder
         **/
        

        public Builder totalIssues(Integer totalIssues) {
        this.totalIssues = totalIssues;
        return this;
        }
            /**
     * Number of error severity validation issues.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Integer errorCount;

                /**
         * Number of error severity validation issues.
         * @param errorCount the value to set
         * @return this builder
         **/
        

        public Builder errorCount(Integer errorCount) {
        this.errorCount = errorCount;
        return this;
        }
            /**
     * Number of warning severity validation issues.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
        private Integer warningCount;

                /**
         * Number of warning severity validation issues.
         * @param warningCount the value to set
         * @return this builder
         **/
        

        public Builder warningCount(Integer warningCount) {
        this.warningCount = warningCount;
        return this;
        }
            /**
     * Number of informational validation issues.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("infoCount")
        private Integer infoCount;

                /**
         * Number of informational validation issues.
         * @param infoCount the value to set
         * @return this builder
         **/
        

        public Builder infoCount(Integer infoCount) {
        this.infoCount = infoCount;
        return this;
        }
            /**
     * Counts of validation issues by validation phase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("phaseCounts")
        private java.util.Map<String, Integer> phaseCounts;

                /**
         * Counts of validation issues by validation phase.
         * @param phaseCounts the value to set
         * @return this builder
         **/
        

        public Builder phaseCounts(java.util.Map<String, Integer> phaseCounts) {
        this.phaseCounts = phaseCounts;
        return this;
        }


        public AgentFlowValidationSummary build() {
            AgentFlowValidationSummary model = new AgentFlowValidationSummary(this.totalIssues
                    , this.errorCount
                    , this.warningCount
                    , this.infoCount
                    , this.phaseCounts);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowValidationSummary model) {
                this.totalIssues(model.getTotalIssues());
    this.errorCount(model.getErrorCount());
    this.warningCount(model.getWarningCount());
    this.infoCount(model.getInfoCount());
    this.phaseCounts(model.getPhaseCounts());
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
     * Total number of validation issues.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalIssues")
    private final Integer totalIssues;

        /**
     * Total number of validation issues.
     * @return the value
     **/
    
    public Integer getTotalIssues() {
        return totalIssues;
    }


        /**
     * Number of error severity validation issues.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    private final Integer errorCount;

        /**
     * Number of error severity validation issues.
     * @return the value
     **/
    
    public Integer getErrorCount() {
        return errorCount;
    }


        /**
     * Number of warning severity validation issues.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
    private final Integer warningCount;

        /**
     * Number of warning severity validation issues.
     * @return the value
     **/
    
    public Integer getWarningCount() {
        return warningCount;
    }


        /**
     * Number of informational validation issues.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("infoCount")
    private final Integer infoCount;

        /**
     * Number of informational validation issues.
     * @return the value
     **/
    
    public Integer getInfoCount() {
        return infoCount;
    }


        /**
     * Counts of validation issues by validation phase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("phaseCounts")
    private final java.util.Map<String, Integer> phaseCounts;

        /**
     * Counts of validation issues by validation phase.
     * @return the value
     **/
    
    public java.util.Map<String, Integer> getPhaseCounts() {
        return phaseCounts;
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
        sb.append("AgentFlowValidationSummary(");
        sb.append("totalIssues=").append(String.valueOf(this.totalIssues));
        sb.append(", errorCount=").append(String.valueOf(this.errorCount));
        sb.append(", warningCount=").append(String.valueOf(this.warningCount));
        sb.append(", infoCount=").append(String.valueOf(this.infoCount));
        sb.append(", phaseCounts=").append(String.valueOf(this.phaseCounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowValidationSummary)) {
            return false;
        }

        AgentFlowValidationSummary other = (AgentFlowValidationSummary) o;
        return java.util.Objects.equals(this.totalIssues, other.totalIssues) &&
            java.util.Objects.equals(this.errorCount, other.errorCount) &&
            java.util.Objects.equals(this.warningCount, other.warningCount) &&
            java.util.Objects.equals(this.infoCount, other.infoCount) &&
            java.util.Objects.equals(this.phaseCounts, other.phaseCounts);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalIssues == null ? 43 : this.totalIssues.hashCode());
        result = (result * PRIME) + (this.errorCount == null ? 43 : this.errorCount.hashCode());
        result = (result * PRIME) + (this.warningCount == null ? 43 : this.warningCount.hashCode());
        result = (result * PRIME) + (this.infoCount == null ? 43 : this.infoCount.hashCode());
        result = (result * PRIME) + (this.phaseCounts == null ? 43 : this.phaseCounts.hashCode());
        return result;
    }


}
