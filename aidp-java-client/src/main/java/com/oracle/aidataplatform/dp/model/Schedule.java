// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The schedule configuration for the job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Schedule.Builder.class)

public final class Schedule  {
    @Deprecated
    @java.beans.ConstructorProperties({"quartzCronExpression", "timezoneId", "pauseStatus"})
    public Schedule(String quartzCronExpression, String timezoneId, PauseStatus pauseStatus) {
        super();
        this.quartzCronExpression = quartzCronExpression;
        this.timezoneId = timezoneId;
        this.pauseStatus = pauseStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A cron expression using Quartz syntax that describes the schedule for a job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("quartzCronExpression")
private String quartzCronExpression;

        /**
         * A cron expression using Quartz syntax that describes the schedule for a job.
         * @param quartzCronExpression the value to set
         * @return this builder
         **/
        

public Builder quartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
}
            /**
     * A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timezoneId")
private String timezoneId;

        /**
         * A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.
         * @param timezoneId the value to set
         * @return this builder
         **/
        

public Builder timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
}
            /**
     * Indicates whether the schedule is paused or not.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pauseStatus")
private PauseStatus pauseStatus;

        /**
         * Indicates whether the schedule is paused or not.
         * @param pauseStatus the value to set
         * @return this builder
         **/
        

public Builder pauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
}


        public Schedule build() {
            Schedule model = new Schedule(this.quartzCronExpression
                , this.timezoneId
                , this.pauseStatus);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schedule model) {
                this.quartzCronExpression(model.getQuartzCronExpression());
    this.timezoneId(model.getTimezoneId());
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
     * A cron expression using Quartz syntax that describes the schedule for a job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("quartzCronExpression")
    private final String quartzCronExpression;

        /**
     * A cron expression using Quartz syntax that describes the schedule for a job.
     * @return the value
     **/
    
    public String getQuartzCronExpression() {
        return quartzCronExpression;
    }


        /**
     * A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timezoneId")
    private final String timezoneId;

        /**
     * A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.
     * @return the value
     **/
    
    public String getTimezoneId() {
        return timezoneId;
    }

    /**
     * Indicates whether the schedule is paused or not.
     **/
    public enum PauseStatus implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Indicates whether the schedule is paused or not.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pauseStatus")
    private final PauseStatus pauseStatus;

        /**
     * Indicates whether the schedule is paused or not.
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
        sb.append("Schedule(");
        sb.append("quartzCronExpression=").append(String.valueOf(this.quartzCronExpression));
        sb.append(", timezoneId=").append(String.valueOf(this.timezoneId));
        sb.append(", pauseStatus=").append(String.valueOf(this.pauseStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }

        Schedule other = (Schedule) o;
        return java.util.Objects.equals(this.quartzCronExpression, other.quartzCronExpression) &&
            java.util.Objects.equals(this.timezoneId, other.timezoneId) &&
            java.util.Objects.equals(this.pauseStatus, other.pauseStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.quartzCronExpression == null ? 43 : this.quartzCronExpression.hashCode());
        result = (result * PRIME) + (this.timezoneId == null ? 43 : this.timezoneId.hashCode());
        result = (result * PRIME) + (this.pauseStatus == null ? 43 : this.pauseStatus.hashCode());
        return result;
    }


}
