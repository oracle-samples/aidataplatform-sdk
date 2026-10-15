// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One deployment log event with its full message and metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogDetail.Builder.class)

public final class DeploymentLogDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "recordId", "logId", "timestamp", "timestampSource", "level", "message", "metadata"})
    public DeploymentLogDetail(String deploymentId, String recordId, String logId, java.util.Date timestamp, TimestampSource timestampSource, Level level, DeploymentLogMessage message, DeploymentLogMetadata metadata) {
        super();
        this.deploymentId = deploymentId;
        this.recordId = recordId;
        this.logId = logId;
        this.timestamp = timestamp;
        this.timestampSource = timestampSource;
        this.level = level;
        this.message = message;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The model deployment the log event belongs to.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
private String deploymentId;

        /**
         * The model deployment the log event belongs to.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
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
     * The opaque, expiring locator this event was resolved from.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logId")
private String logId;

        /**
         * The opaque, expiring locator this event was resolved from.
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
        
@com.fasterxml.jackson.annotation.JsonProperty("message")
private DeploymentLogMessage message;



public Builder message(DeploymentLogMessage message) {
    this.message = message;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("metadata")
private DeploymentLogMetadata metadata;



public Builder metadata(DeploymentLogMetadata metadata) {
    this.metadata = metadata;
    return this;
}


        public DeploymentLogDetail build() {
            DeploymentLogDetail model = new DeploymentLogDetail(this.deploymentId
                , this.recordId
                , this.logId
                , this.timestamp
                , this.timestampSource
                , this.level
                , this.message
                , this.metadata);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogDetail model) {
                this.deploymentId(model.getDeploymentId());
    this.recordId(model.getRecordId());
    this.logId(model.getLogId());
    this.timestamp(model.getTimestamp());
    this.timestampSource(model.getTimestampSource());
    this.level(model.getLevel());
    this.message(model.getMessage());
    this.metadata(model.getMetadata());
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
     * The model deployment the log event belongs to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

        /**
     * The model deployment the log event belongs to.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
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
     * The opaque, expiring locator this event was resolved from.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

        /**
     * The opaque, expiring locator this event was resolved from.
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final DeploymentLogMessage message;

    
    public DeploymentLogMessage getMessage() {
        return message;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final DeploymentLogMetadata metadata;

    
    public DeploymentLogMetadata getMetadata() {
        return metadata;
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
        sb.append("DeploymentLogDetail(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", recordId=").append(String.valueOf(this.recordId));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", timestampSource=").append(String.valueOf(this.timestampSource));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogDetail)) {
            return false;
        }

        DeploymentLogDetail other = (DeploymentLogDetail) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.recordId, other.recordId) &&
            java.util.Objects.equals(this.logId, other.logId) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.timestampSource, other.timestampSource) &&
            java.util.Objects.equals(this.level, other.level) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.metadata, other.metadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.recordId == null ? 43 : this.recordId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.timestampSource == null ? 43 : this.timestampSource.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }


}
