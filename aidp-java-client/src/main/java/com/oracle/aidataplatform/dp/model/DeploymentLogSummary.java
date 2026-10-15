// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One deployment lifecycle log event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogSummary.Builder.class)

public final class DeploymentLogSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"recordId", "logId", "timestamp", "timestampSource", "level", "opcRequestId", "latencyMs", "replicaId", "isDetailAvailable"})
    public DeploymentLogSummary(String recordId, String logId, java.util.Date timestamp, TimestampSource timestampSource, Level level, String opcRequestId, Double latencyMs, String replicaId, Boolean isDetailAvailable) {
        super();
        this.recordId = recordId;
        this.logId = logId;
        this.timestamp = timestamp;
        this.timestampSource = timestampSource;
        this.level = level;
        this.opcRequestId = opcRequestId;
        this.latencyMs = latencyMs;
        this.replicaId = replicaId;
        this.isDetailAvailable = isDetailAvailable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Stable identity of the ingested log record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("recordId")
private String recordId;

        /**
         * Stable identity of the ingested log record.
         * @param recordId the value to set
         * @return this builder
         **/
        

public Builder recordId(String recordId) {
    this.recordId = recordId;
    return this;
}
            /**
     * Opaque, expiring locator usable with the log detail operation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logId")
private String logId;

        /**
         * Opaque, expiring locator usable with the log detail operation.
         * @param logId the value to set
         * @return this builder
         **/
        

public Builder logId(String logId) {
    this.logId = logId;
    return this;
}
            /**
     * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timestamp")
private java.util.Date timestamp;

        /**
         * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
         * @param timestamp the value to set
         * @return this builder
         **/
        

public Builder timestamp(java.util.Date timestamp) {
    this.timestamp = timestamp;
    return this;
}
            /**
     * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timestampSource")
private TimestampSource timestampSource;

        /**
         * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
         * @param timestampSource the value to set
         * @return this builder
         **/
        

public Builder timestampSource(TimestampSource timestampSource) {
    this.timestampSource = timestampSource;
    return this;
}
            /**
     * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("level")
private Level level;

        /**
         * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
         * @param level the value to set
         * @return this builder
         **/
        

public Builder level(Level level) {
    this.level = level;
    return this;
}
            /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
            /**
     * Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("latencyMs")
private Double latencyMs;

        /**
         * Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.
         * @param latencyMs the value to set
         * @return this builder
         **/
        

public Builder latencyMs(Double latencyMs) {
    this.latencyMs = latencyMs;
    return this;
}
            /**
     * Emitting replica or source scope, when the event carries one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicaId")
private String replicaId;

        /**
         * Emitting replica or source scope, when the event carries one.
         * @param replicaId the value to set
         * @return this builder
         **/
        

public Builder replicaId(String replicaId) {
    this.replicaId = replicaId;
    return this;
}
            /**
     * Whether the log detail operation can resolve this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDetailAvailable")
private Boolean isDetailAvailable;

        /**
         * Whether the log detail operation can resolve this record.
         * @param isDetailAvailable the value to set
         * @return this builder
         **/
        

public Builder isDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
    return this;
}


        public DeploymentLogSummary build() {
            DeploymentLogSummary model = new DeploymentLogSummary(this.recordId
                , this.logId
                , this.timestamp
                , this.timestampSource
                , this.level
                , this.opcRequestId
                , this.latencyMs
                , this.replicaId
                , this.isDetailAvailable);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogSummary model) {
                this.recordId(model.getRecordId());
    this.logId(model.getLogId());
    this.timestamp(model.getTimestamp());
    this.timestampSource(model.getTimestampSource());
    this.level(model.getLevel());
    this.opcRequestId(model.getOpcRequestId());
    this.latencyMs(model.getLatencyMs());
    this.replicaId(model.getReplicaId());
    this.isDetailAvailable(model.getIsDetailAvailable());
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
     * Stable identity of the ingested log record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recordId")
    private final String recordId;

        /**
     * Stable identity of the ingested log record.
     * @return the value
     **/
    
    public String getRecordId() {
        return recordId;
    }


        /**
     * Opaque, expiring locator usable with the log detail operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

        /**
     * Opaque, expiring locator usable with the log detail operation.
     * @return the value
     **/
    
    public String getLogId() {
        return logId;
    }


        /**
     * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

        /**
     * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
     * @return the value
     **/
    
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
     **/
    public enum TimestampSource implements com.oracle.bmc.http.internal.BmcEnum {
        EventTime("EVENT_TIME"),
        PublishTime("PUBLISH_TIME"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TimestampSource.class);

        private final String value;
        private static java.util.Map<String, TimestampSource> map;

        static {
            map = new java.util.HashMap<>();
            for (TimestampSource v : TimestampSource.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TimestampSource(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimestampSource create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'TimestampSource', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestampSource")
    private final TimestampSource timestampSource;

        /**
     * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
     * @return the value
     **/
    
    public TimestampSource getTimestampSource() {
        return timestampSource;
    }

    /**
     * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
     **/
    public enum Level implements com.oracle.bmc.http.internal.BmcEnum {
        Debug("DEBUG"),
        Info("INFO"),
        Warning("WARNING"),
        Error("ERROR"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Level.class);

        private final String value;
        private static java.util.Map<String, Level> map;

        static {
            map = new java.util.HashMap<>();
            for (Level v : Level.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Level(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Level create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Level', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Level level;

        /**
     * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
     * @return the value
     **/
    
    public Level getLevel() {
        return level;
    }


        /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


        /**
     * Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("latencyMs")
    private final Double latencyMs;

        /**
     * Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent.
     * @return the value
     **/
    
    public Double getLatencyMs() {
        return latencyMs;
    }


        /**
     * Emitting replica or source scope, when the event carries one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaId")
    private final String replicaId;

        /**
     * Emitting replica or source scope, when the event carries one.
     * @return the value
     **/
    
    public String getReplicaId() {
        return replicaId;
    }


        /**
     * Whether the log detail operation can resolve this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDetailAvailable")
    private final Boolean isDetailAvailable;

        /**
     * Whether the log detail operation can resolve this record.
     * @return the value
     **/
    
    public Boolean getIsDetailAvailable() {
        return isDetailAvailable;
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
        sb.append("DeploymentLogSummary(");
        sb.append("recordId=").append(String.valueOf(this.recordId));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", timestampSource=").append(String.valueOf(this.timestampSource));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", latencyMs=").append(String.valueOf(this.latencyMs));
        sb.append(", replicaId=").append(String.valueOf(this.replicaId));
        sb.append(", isDetailAvailable=").append(String.valueOf(this.isDetailAvailable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogSummary)) {
            return false;
        }

        DeploymentLogSummary other = (DeploymentLogSummary) o;
        return java.util.Objects.equals(this.recordId, other.recordId) &&
            java.util.Objects.equals(this.logId, other.logId) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.timestampSource, other.timestampSource) &&
            java.util.Objects.equals(this.level, other.level) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.latencyMs, other.latencyMs) &&
            java.util.Objects.equals(this.replicaId, other.replicaId) &&
            java.util.Objects.equals(this.isDetailAvailable, other.isDetailAvailable);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.recordId == null ? 43 : this.recordId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.timestampSource == null ? 43 : this.timestampSource.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.latencyMs == null ? 43 : this.latencyMs.hashCode());
        result = (result * PRIME) + (this.replicaId == null ? 43 : this.replicaId.hashCode());
        result = (result * PRIME) + (this.isDetailAvailable == null ? 43 : this.isDetailAvailable.hashCode());
        return result;
    }


}
