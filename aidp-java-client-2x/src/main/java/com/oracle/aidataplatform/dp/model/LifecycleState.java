// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The lifecycle state of execution.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LifecycleState.Builder.class)

public final class LifecycleState  {
    @Deprecated
    @java.beans.ConstructorProperties({"startTime", "endTime", "status", "stateMessage", "errorTrace", "isUserCanceledOrTimedOut"})
    public LifecycleState(Long startTime, Long endTime, Status status, String stateMessage, String errorTrace, Boolean isUserCanceledOrTimedOut) {
        super();
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.stateMessage = stateMessage;
        this.errorTrace = errorTrace;
        this.isUserCanceledOrTimedOut = isUserCanceledOrTimedOut;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Current state of execution.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

                /**
         * Current state of execution.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(Status status) {
        this.status = status;
        return this;
        }
            /**
     * A descriptive message of the current state.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

                /**
         * A descriptive message of the current state.
         * @param stateMessage the value to set
         * @return this builder
         **/
        

        public Builder stateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
        }
            /**
     * If there was an error executing the run, this field contains any available stack traces.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("errorTrace")
        private String errorTrace;

                /**
         * If there was an error executing the run, this field contains any available stack traces.
         * @param errorTrace the value to set
         * @return this builder
         **/
        

        public Builder errorTrace(String errorTrace) {
        this.errorTrace = errorTrace;
        return this;
        }
            /**
     * Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isUserCanceledOrTimedOut")
        private Boolean isUserCanceledOrTimedOut;

                /**
         * Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
         * @param isUserCanceledOrTimedOut the value to set
         * @return this builder
         **/
        

        public Builder isUserCanceledOrTimedOut(Boolean isUserCanceledOrTimedOut) {
        this.isUserCanceledOrTimedOut = isUserCanceledOrTimedOut;
        return this;
        }


        public LifecycleState build() {
            LifecycleState model = new LifecycleState(this.startTime
                    , this.endTime
                    , this.status
                    , this.stateMessage
                    , this.errorTrace
                    , this.isUserCanceledOrTimedOut);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LifecycleState model) {
                this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.status(model.getStatus());
    this.stateMessage(model.getStateMessage());
    this.errorTrace(model.getErrorTrace());
    this.isUserCanceledOrTimedOut(model.getIsUserCanceledOrTimedOut());
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
     * Current state of execution.
     **/
    public enum Status {
        Pending("PENDING"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Skipped("SKIPPED"),
        InternalError("INTERNAL_ERROR"),
        Blocked("BLOCKED"),
        Success("SUCCESS"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        UpstreamCanceled("UPSTREAM_CANCELED"),
        UpstreamFailed("UPSTREAM_FAILED"),
        Excluded("EXCLUDED"),
        TimedOut("TIMED_OUT"),
        PausedMaintenance("PAUSED_MAINTENANCE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
        /**
     * Current state of execution.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Current state of execution.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * A descriptive message of the current state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

        /**
     * A descriptive message of the current state.
     * @return the value
     **/
    
    public String getStateMessage() {
        return stateMessage;
    }


        /**
     * If there was an error executing the run, this field contains any available stack traces.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorTrace")
    private final String errorTrace;

        /**
     * If there was an error executing the run, this field contains any available stack traces.
     * @return the value
     **/
    
    public String getErrorTrace() {
        return errorTrace;
    }


        /**
     * Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isUserCanceledOrTimedOut")
    private final Boolean isUserCanceledOrTimedOut;

        /**
     * Set to true, if the job execution is canceled by the user or by the scheduler due to timeout.
     * @return the value
     **/
    
    public Boolean getIsUserCanceledOrTimedOut() {
        return isUserCanceledOrTimedOut;
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
        sb.append("LifecycleState(");
        sb.append("startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", errorTrace=").append(String.valueOf(this.errorTrace));
        sb.append(", isUserCanceledOrTimedOut=").append(String.valueOf(this.isUserCanceledOrTimedOut));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LifecycleState)) {
            return false;
        }

        LifecycleState other = (LifecycleState) o;
        return java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            java.util.Objects.equals(this.errorTrace, other.errorTrace) &&
            java.util.Objects.equals(this.isUserCanceledOrTimedOut, other.isUserCanceledOrTimedOut);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.errorTrace == null ? 43 : this.errorTrace.hashCode());
        result = (result * PRIME) + (this.isUserCanceledOrTimedOut == null ? 43 : this.isUserCanceledOrTimedOut.hashCode());
        return result;
    }


}
