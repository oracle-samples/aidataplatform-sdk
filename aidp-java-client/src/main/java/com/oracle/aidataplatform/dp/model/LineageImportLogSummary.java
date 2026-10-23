// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary of a lineage import log entry.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LineageImportLogSummary.Builder.class)

public final class LineageImportLogSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "timeCreated", "logType", "message"})
    public LineageImportLogSummary(String key, java.util.Date timeCreated, String logType, String message) {
        super();
        this.key = key;
        this.timeCreated = timeCreated;
        this.logType = logType;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Generated identifier for the log entry.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Generated identifier for the log entry.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Time the log entry was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Time the log entry was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Type of diagnostic log entry.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logType")
private String logType;

        /**
         * Type of diagnostic log entry.
         * @param logType the value to set
         * @return this builder
         **/
        

public Builder logType(String logType) {
    this.logType = logType;
    return this;
}
            /**
     * Human-readable diagnostic message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Human-readable diagnostic message.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}


        public LineageImportLogSummary build() {
            LineageImportLogSummary model = new LineageImportLogSummary(this.key
                , this.timeCreated
                , this.logType
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageImportLogSummary model) {
                this.key(model.getKey());
    this.timeCreated(model.getTimeCreated());
    this.logType(model.getLogType());
    this.message(model.getMessage());
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
     * Generated identifier for the log entry.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Generated identifier for the log entry.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Time the log entry was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Time the log entry was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Type of diagnostic log entry.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final String logType;

        /**
     * Type of diagnostic log entry.
     * @return the value
     **/
    
    public String getLogType() {
        return logType;
    }


        /**
     * Human-readable diagnostic message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Human-readable diagnostic message.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
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
        sb.append("LineageImportLogSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageImportLogSummary)) {
            return false;
        }

        LineageImportLogSummary other = (LineageImportLogSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.logType, other.logType) &&
            java.util.Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
