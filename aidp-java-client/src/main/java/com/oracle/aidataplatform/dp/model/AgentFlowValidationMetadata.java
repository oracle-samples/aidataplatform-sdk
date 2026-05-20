// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Non-sensitive metadata for Agent Flow diagram validation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowValidationMetadata.Builder.class)

public final class AgentFlowValidationMetadata  {
    @Deprecated
    @java.beans.ConstructorProperties({"isDeepValidationSkipped", "skipReason", "lakeFlowRequestId", "durationInMillis", "skippedPhases", "ruleDurationsInMillis"})
    public AgentFlowValidationMetadata(Boolean isDeepValidationSkipped, String skipReason, String lakeFlowRequestId, Integer durationInMillis, java.util.List<SkippedPhases> skippedPhases, java.util.Map<String, Integer> ruleDurationsInMillis) {
        super();
        this.isDeepValidationSkipped = isDeepValidationSkipped;
        this.skipReason = skipReason;
        this.lakeFlowRequestId = lakeFlowRequestId;
        this.durationInMillis = durationInMillis;
        this.skippedPhases = skippedPhases;
        this.ruleDurationsInMillis = ruleDurationsInMillis;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether deep validation was skipped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDeepValidationSkipped")
private Boolean isDeepValidationSkipped;

        /**
         * Whether deep validation was skipped.
         * @param isDeepValidationSkipped the value to set
         * @return this builder
         **/
        

public Builder isDeepValidationSkipped(Boolean isDeepValidationSkipped) {
    this.isDeepValidationSkipped = isDeepValidationSkipped;
    return this;
}
            /**
     * Reason deep validation was skipped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("skipReason")
private String skipReason;

        /**
         * Reason deep validation was skipped.
         * @param skipReason the value to set
         * @return this builder
         **/
        

public Builder skipReason(String skipReason) {
    this.skipReason = skipReason;
    return this;
}
            /**
     * Optional downstream LakeFlow request identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lakeFlowRequestId")
private String lakeFlowRequestId;

        /**
         * Optional downstream LakeFlow request identifier.
         * @param lakeFlowRequestId the value to set
         * @return this builder
         **/
        

public Builder lakeFlowRequestId(String lakeFlowRequestId) {
    this.lakeFlowRequestId = lakeFlowRequestId;
    return this;
}
            /**
     * Validation duration in milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("durationInMillis")
private Integer durationInMillis;

        /**
         * Validation duration in milliseconds.
         * @param durationInMillis the value to set
         * @return this builder
         **/
        

public Builder durationInMillis(Integer durationInMillis) {
    this.durationInMillis = durationInMillis;
    return this;
}
            /**
     * Validation phases that were skipped.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("skippedPhases")
private java.util.List<SkippedPhases> skippedPhases;

        /**
         * Validation phases that were skipped.
         * @param skippedPhases the value to set
         * @return this builder
         **/
        

public Builder skippedPhases(java.util.List<SkippedPhases> skippedPhases) {
    this.skippedPhases = skippedPhases;
    return this;
}
            /**
     * Validation rule durations in milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ruleDurationsInMillis")
private java.util.Map<String, Integer> ruleDurationsInMillis;

        /**
         * Validation rule durations in milliseconds.
         * @param ruleDurationsInMillis the value to set
         * @return this builder
         **/
        

public Builder ruleDurationsInMillis(java.util.Map<String, Integer> ruleDurationsInMillis) {
    this.ruleDurationsInMillis = ruleDurationsInMillis;
    return this;
}


        public AgentFlowValidationMetadata build() {
            AgentFlowValidationMetadata model = new AgentFlowValidationMetadata(this.isDeepValidationSkipped
                , this.skipReason
                , this.lakeFlowRequestId
                , this.durationInMillis
                , this.skippedPhases
                , this.ruleDurationsInMillis);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowValidationMetadata model) {
                this.isDeepValidationSkipped(model.getIsDeepValidationSkipped());
    this.skipReason(model.getSkipReason());
    this.lakeFlowRequestId(model.getLakeFlowRequestId());
    this.durationInMillis(model.getDurationInMillis());
    this.skippedPhases(model.getSkippedPhases());
    this.ruleDurationsInMillis(model.getRuleDurationsInMillis());
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
     * Whether deep validation was skipped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDeepValidationSkipped")
    private final Boolean isDeepValidationSkipped;

        /**
     * Whether deep validation was skipped.
     * @return the value
     **/
    
    public Boolean getIsDeepValidationSkipped() {
        return isDeepValidationSkipped;
    }


        /**
     * Reason deep validation was skipped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("skipReason")
    private final String skipReason;

        /**
     * Reason deep validation was skipped.
     * @return the value
     **/
    
    public String getSkipReason() {
        return skipReason;
    }


        /**
     * Optional downstream LakeFlow request identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lakeFlowRequestId")
    private final String lakeFlowRequestId;

        /**
     * Optional downstream LakeFlow request identifier.
     * @return the value
     **/
    
    public String getLakeFlowRequestId() {
        return lakeFlowRequestId;
    }


        /**
     * Validation duration in milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMillis")
    private final Integer durationInMillis;

        /**
     * Validation duration in milliseconds.
     * @return the value
     **/
    
    public Integer getDurationInMillis() {
        return durationInMillis;
    }

    /**
     **/
    public enum SkippedPhases implements com.oracle.bmc.http.internal.BmcEnum {
        Model("MODEL"),
        Graph("GRAPH"),
        Config("CONFIG"),
        Reference("REFERENCE"),
        Codegen("CODEGEN"),
        ;

        

        private final String value;
        private static java.util.Map<String, SkippedPhases> map;

        static {
            map = new java.util.HashMap<>();
            for (SkippedPhases v : SkippedPhases.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SkippedPhases(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SkippedPhases create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SkippedPhases: " + key);
        }
    };
        /**
     * Validation phases that were skipped.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("skippedPhases")
    private final java.util.List<SkippedPhases> skippedPhases;

        /**
     * Validation phases that were skipped.
     * @return the value
     **/
    
    public java.util.List<SkippedPhases> getSkippedPhases() {
        return skippedPhases;
    }


        /**
     * Validation rule durations in milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDurationsInMillis")
    private final java.util.Map<String, Integer> ruleDurationsInMillis;

        /**
     * Validation rule durations in milliseconds.
     * @return the value
     **/
    
    public java.util.Map<String, Integer> getRuleDurationsInMillis() {
        return ruleDurationsInMillis;
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
        sb.append("AgentFlowValidationMetadata(");
        sb.append("isDeepValidationSkipped=").append(String.valueOf(this.isDeepValidationSkipped));
        sb.append(", skipReason=").append(String.valueOf(this.skipReason));
        sb.append(", lakeFlowRequestId=").append(String.valueOf(this.lakeFlowRequestId));
        sb.append(", durationInMillis=").append(String.valueOf(this.durationInMillis));
        sb.append(", skippedPhases=").append(String.valueOf(this.skippedPhases));
        sb.append(", ruleDurationsInMillis=").append(String.valueOf(this.ruleDurationsInMillis));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowValidationMetadata)) {
            return false;
        }

        AgentFlowValidationMetadata other = (AgentFlowValidationMetadata) o;
        return java.util.Objects.equals(this.isDeepValidationSkipped, other.isDeepValidationSkipped) &&
            java.util.Objects.equals(this.skipReason, other.skipReason) &&
            java.util.Objects.equals(this.lakeFlowRequestId, other.lakeFlowRequestId) &&
            java.util.Objects.equals(this.durationInMillis, other.durationInMillis) &&
            java.util.Objects.equals(this.skippedPhases, other.skippedPhases) &&
            java.util.Objects.equals(this.ruleDurationsInMillis, other.ruleDurationsInMillis);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isDeepValidationSkipped == null ? 43 : this.isDeepValidationSkipped.hashCode());
        result = (result * PRIME) + (this.skipReason == null ? 43 : this.skipReason.hashCode());
        result = (result * PRIME) + (this.lakeFlowRequestId == null ? 43 : this.lakeFlowRequestId.hashCode());
        result = (result * PRIME) + (this.durationInMillis == null ? 43 : this.durationInMillis.hashCode());
        result = (result * PRIME) + (this.skippedPhases == null ? 43 : this.skippedPhases.hashCode());
        result = (result * PRIME) + (this.ruleDurationsInMillis == null ? 43 : this.ruleDurationsInMillis.hashCode());
        return result;
    }


}
