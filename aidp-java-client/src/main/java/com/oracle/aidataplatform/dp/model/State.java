package com.oracle.aidataplatform.dp.model;



/**
 * The current state of the run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=State.Builder.class)

public final class State  {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "stateMessage", "errorTrace", "isUserCanceledOrTimedOut"})
    public State(Status status, String stateMessage, String errorTrace, Boolean isUserCanceledOrTimedOut) {
        super();
        this.status = status;
        this.stateMessage = stateMessage;
        this.errorTrace = errorTrace;
        this.isUserCanceledOrTimedOut = isUserCanceledOrTimedOut;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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


        public State build() {
            State model = new State(this.status
                , this.stateMessage
                , this.errorTrace
                , this.isUserCanceledOrTimedOut);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(State model) {
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
     * Current state of execution.
     **/
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
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
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn("Received unknown value '{}' for enum 'Status', returning UnknownEnumValue", key);
            return UnknownEnumValue;
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
        sb.append("State(");
        sb.append("status=").append(String.valueOf(this.status));
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
        if (!(o instanceof State)) {
            return false;
        }

        State other = (State) o;
        return java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            java.util.Objects.equals(this.errorTrace, other.errorTrace) &&
            java.util.Objects.equals(this.isUserCanceledOrTimedOut, other.isUserCanceledOrTimedOut);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.errorTrace == null ? 43 : this.errorTrace.hashCode());
        result = (result * PRIME) + (this.isUserCanceledOrTimedOut == null ? 43 : this.isUserCanceledOrTimedOut.hashCode());
        return result;
    }


}
