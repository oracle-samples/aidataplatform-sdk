// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a job run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobRunSummary.Builder.class)

public final class JobRunSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "state", "jobKey", "jobName", "executionDuration", "launched", "startTime", "endTime", "timeCreated", "timeUpdated", "createdBy", "createdByName"})
    public JobRunSummary(String key, String name, State state, String jobKey, String jobName, Long executionDuration, Launched launched, Long startTime, Long endTime, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String createdByName) {
        super();
        this.key = key;
        this.name = name;
        this.state = state;
        this.jobKey = jobKey;
        this.jobName = jobName;
        this.executionDuration = executionDuration;
        this.launched = launched;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the job run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The OCID of the job run.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * A user-friendly name. Does not have to be unique, and is changeable.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;



public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobKey")
private String jobKey;

        /**
         * The OCID of the job.
         * @param jobKey the value to set
         * @return this builder
         **/
        

public Builder jobKey(String jobKey) {
    this.jobKey = jobKey;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobName")
private String jobName;

        /**
         * A user-friendly name. Does not have to be unique, and is changeable.
         * @param jobName the value to set
         * @return this builder
         **/
        

public Builder jobName(String jobName) {
    this.jobName = jobName;
    return this;
}
            /**
     * The time (in milliseconds) taken to complete the job execution.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("executionDuration")
private Long executionDuration;

        /**
         * The time (in milliseconds) taken to complete the job execution.
         * @param executionDuration the value to set
         * @return this builder
         **/
        

public Builder executionDuration(Long executionDuration) {
    this.executionDuration = executionDuration;
    return this;
}
            /**
     * Identify job run launched by schedule or manually.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("launched")
private Launched launched;

        /**
         * Identify job run launched by schedule or manually.
         * @param launched the value to set
         * @return this builder
         **/
        

public Builder launched(Launched launched) {
    this.launched = launched;
    return this;
}
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("startTime")
private Long startTime;

        /**
         * The time at which the job execution started in epoch milliseconds.
         * @param startTime the value to set
         * @return this builder
         **/
        

public Builder startTime(Long startTime) {
    this.startTime = startTime;
    return this;
}
            /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("endTime")
private Long endTime;

        /**
         * The time at which the job execution started in epoch milliseconds.
         * @param endTime the value to set
         * @return this builder
         **/
        

public Builder endTime(Long endTime) {
    this.endTime = endTime;
    return this;
}
            /**
     * The time at which the job execution started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The time at which the job execution started.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The time at which the job execution was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The time at which the job execution was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The user who triggered the job execution.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The user who triggered the job execution.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this record
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}


        public JobRunSummary build() {
            JobRunSummary model = new JobRunSummary(this.key
                , this.name
                , this.state
                , this.jobKey
                , this.jobName
                , this.executionDuration
                , this.launched
                , this.startTime
                , this.endTime
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.createdByName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRunSummary model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.state(model.getState());
    this.jobKey(model.getJobKey());
    this.jobName(model.getJobName());
    this.executionDuration(model.getExecutionDuration());
    this.launched(model.getLaunched());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
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
     * The OCID of the job run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The OCID of the job run.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    
    public State getState() {
        return state;
    }


        /**
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    private final String jobKey;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getJobKey() {
        return jobKey;
    }


        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     * @return the value
     **/
    
    public String getJobName() {
        return jobName;
    }


        /**
     * The time (in milliseconds) taken to complete the job execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("executionDuration")
    private final Long executionDuration;

        /**
     * The time (in milliseconds) taken to complete the job execution.
     * @return the value
     **/
    
    public Long getExecutionDuration() {
        return executionDuration;
    }

    /**
     * Identify job run launched by schedule or manually.
     **/
    public enum Launched implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Manual("MANUAL"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Launched.class);

        private final String value;
        private static java.util.Map<String, Launched> map;

        static {
            map = new java.util.HashMap<>();
            for (Launched v : Launched.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Launched(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Launched create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Launched', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Identify job run launched by schedule or manually.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("launched")
    private final Launched launched;

        /**
     * Identify job run launched by schedule or manually.
     * @return the value
     **/
    
    public Launched getLaunched() {
        return launched;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Long startTime;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getStartTime() {
        return startTime;
    }


        /**
     * The time at which the job execution started in epoch milliseconds.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final Long endTime;

        /**
     * The time at which the job execution started in epoch milliseconds.
     * @return the value
     **/
    
    public Long getEndTime() {
        return endTime;
    }


        /**
     * The time at which the job execution started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The time at which the job execution started.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The time at which the job execution was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The time at which the job execution was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The user who triggered the job execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The user who triggered the job execution.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
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
        sb.append("JobRunSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", executionDuration=").append(String.valueOf(this.executionDuration));
        sb.append(", launched=").append(String.valueOf(this.launched));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobRunSummary)) {
            return false;
        }

        JobRunSummary other = (JobRunSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.jobKey, other.jobKey) &&
            java.util.Objects.equals(this.jobName, other.jobName) &&
            java.util.Objects.equals(this.executionDuration, other.executionDuration) &&
            java.util.Objects.equals(this.launched, other.launched) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result = (result * PRIME) + (this.executionDuration == null ? 43 : this.executionDuration.hashCode());
        result = (result * PRIME) + (this.launched == null ? 43 : this.launched.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        return result;
    }


}
