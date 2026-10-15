// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * How completely the underlying log source can serve the requested window.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogCoverage.Builder.class)

public final class DeploymentLogCoverage  {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "retentionDays", "reasons"})
    public DeploymentLogCoverage(State state, Integer retentionDays, java.util.List<String> reasons) {
        super();
        this.state = state;
        this.retentionDays = retentionDays;
        this.reasons = reasons;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

        /**
         * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * Configured retention of the current log object, when readable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
private Integer retentionDays;

        /**
         * Configured retention of the current log object, when readable.
         * @param retentionDays the value to set
         * @return this builder
         **/
        

public Builder retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
}
            /**
     * Machine-readable reasons explaining why coverage is not complete, when applicable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("reasons")
private java.util.List<String> reasons;

        /**
         * Machine-readable reasons explaining why coverage is not complete, when applicable.
         * @param reasons the value to set
         * @return this builder
         **/
        

public Builder reasons(java.util.List<String> reasons) {
    this.reasons = reasons;
    return this;
}


        public DeploymentLogCoverage build() {
            DeploymentLogCoverage model = new DeploymentLogCoverage(this.state
                , this.retentionDays
                , this.reasons);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogCoverage model) {
                this.state(model.getState());
    this.retentionDays(model.getRetentionDays());
    this.reasons(model.getReasons());
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
     * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
     **/
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("UNKNOWN"),
        Partial("PARTIAL"),
        CompleteWithinRetention("COMPLETE_WITHIN_RETENTION"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'State', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
     * @return the value
     **/
    
    public State getState() {
        return state;
    }


        /**
     * Configured retention of the current log object, when readable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDays")
    private final Integer retentionDays;

        /**
     * Configured retention of the current log object, when readable.
     * @return the value
     **/
    
    public Integer getRetentionDays() {
        return retentionDays;
    }


        /**
     * Machine-readable reasons explaining why coverage is not complete, when applicable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("reasons")
    private final java.util.List<String> reasons;

        /**
     * Machine-readable reasons explaining why coverage is not complete, when applicable.
     * @return the value
     **/
    
    public java.util.List<String> getReasons() {
        return reasons;
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
        sb.append("DeploymentLogCoverage(");
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", retentionDays=").append(String.valueOf(this.retentionDays));
        sb.append(", reasons=").append(String.valueOf(this.reasons));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogCoverage)) {
            return false;
        }

        DeploymentLogCoverage other = (DeploymentLogCoverage) o;
        return java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.retentionDays, other.retentionDays) &&
            java.util.Objects.equals(this.reasons, other.reasons);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.retentionDays == null ? 43 : this.retentionDays.hashCode());
        result = (result * PRIME) + (this.reasons == null ? 43 : this.reasons.hashCode());
        return result;
    }


}
