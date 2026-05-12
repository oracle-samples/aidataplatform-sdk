package com.oracle.aidataplatform.dp.model;


/**
 * The continuous property ensures that there is always one execution for this job.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Continuous.Builder.class)

public final class Continuous  {
    @Deprecated
    @java.beans.ConstructorProperties({"pauseStatus"})
    public Continuous(PauseStatus pauseStatus) {
        super();
        this.pauseStatus = pauseStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Indicates whether the continuous execution of this job is paused or not.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("pauseStatus")
        private PauseStatus pauseStatus;

                /**
         * Indicates whether the continuous execution of this job is paused or not.
         * @param pauseStatus the value to set
         * @return this builder
         **/
        

        public Builder pauseStatus(PauseStatus pauseStatus) {
        this.pauseStatus = pauseStatus;
        return this;
        }


        public Continuous build() {
            Continuous model = new Continuous(this.pauseStatus);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Continuous model) {
                this.pauseStatus(model.getPauseStatus());
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
     * Indicates whether the continuous execution of this job is paused or not.
     **/
    public enum PauseStatus {
        Paused("PAUSED"),
        Unpaused("UNPAUSED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PauseStatus.class);

        private final String value;
        private static java.util.Map<String, PauseStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PauseStatus v : PauseStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PauseStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PauseStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'PauseStatus', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Indicates whether the continuous execution of this job is paused or not.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pauseStatus")
    private final PauseStatus pauseStatus;

        /**
     * Indicates whether the continuous execution of this job is paused or not.
     * @return the value
     **/
    
    public PauseStatus getPauseStatus() {
        return pauseStatus;
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
        sb.append("Continuous(");
        sb.append("pauseStatus=").append(String.valueOf(this.pauseStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Continuous)) {
            return false;
        }

        Continuous other = (Continuous) o;
        return java.util.Objects.equals(this.pauseStatus, other.pauseStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pauseStatus == null ? 43 : this.pauseStatus.hashCode());
        return result;
    }


}
