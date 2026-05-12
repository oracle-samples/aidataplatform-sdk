package com.oracle.aidataplatform.dp.model;



/**
 * Search result for audit log search request
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AuditLogSearchResultSummary.Builder.class)

public final class AuditLogSearchResultSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"eventId", "timeOfLog", "objectType", "objectName", "operation", "status", "startedBy", "source", "payload"})
    public AuditLogSearchResultSummary(String eventId, java.util.Date timeOfLog, ObjectType objectType, String objectName, Operation operation, Status status, String startedBy, String source, String payload) {
        super();
        this.eventId = eventId;
        this.timeOfLog = timeOfLog;
        this.objectType = objectType;
        this.objectName = objectName;
        this.operation = operation;
        this.status = status;
        this.startedBy = startedBy;
        this.source = source;
        this.payload = payload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique id of the result
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eventId")
private String eventId;

        /**
         * Unique id of the result
         * @param eventId the value to set
         * @return this builder
         **/
        

public Builder eventId(String eventId) {
    this.eventId = eventId;
    return this;
}
            /**
     * Time of the log
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeOfLog")
private java.util.Date timeOfLog;

        /**
         * Time of the log
         * @param timeOfLog the value to set
         * @return this builder
         **/
        

public Builder timeOfLog(java.util.Date timeOfLog) {
    this.timeOfLog = timeOfLog;
    return this;
}
            /**
     * Type of Object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("objectType")
private ObjectType objectType;

        /**
         * Type of Object
         * @param objectType the value to set
         * @return this builder
         **/
        

public Builder objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
}
            /**
     * Name of the object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("objectName")
private String objectName;

        /**
         * Name of the object
         * @param objectName the value to set
         * @return this builder
         **/
        

public Builder objectName(String objectName) {
    this.objectName = objectName;
    return this;
}
            /**
     * Type of operation
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operation")
private Operation operation;

        /**
         * Type of operation
         * @param operation the value to set
         * @return this builder
         **/
        

public Builder operation(Operation operation) {
    this.operation = operation;
    return this;
}
            /**
     * Status of log
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Status status;

        /**
         * Status of log
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(Status status) {
    this.status = status;
    return this;
}
            /**
     * operation started by
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("startedBy")
private String startedBy;

        /**
         * operation started by
         * @param startedBy the value to set
         * @return this builder
         **/
        

public Builder startedBy(String startedBy) {
    this.startedBy = startedBy;
    return this;
}
            /**
     * Source of logs
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("source")
private String source;

        /**
         * Source of logs
         * @param source the value to set
         * @return this builder
         **/
        

public Builder source(String source) {
    this.source = source;
    return this;
}
            /**
     * payload of logs
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("payload")
private String payload;

        /**
         * payload of logs
         * @param payload the value to set
         * @return this builder
         **/
        

public Builder payload(String payload) {
    this.payload = payload;
    return this;
}


        public AuditLogSearchResultSummary build() {
            AuditLogSearchResultSummary model = new AuditLogSearchResultSummary(this.eventId
                , this.timeOfLog
                , this.objectType
                , this.objectName
                , this.operation
                , this.status
                , this.startedBy
                , this.source
                , this.payload);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditLogSearchResultSummary model) {
                this.eventId(model.getEventId());
    this.timeOfLog(model.getTimeOfLog());
    this.objectType(model.getObjectType());
    this.objectName(model.getObjectName());
    this.operation(model.getOperation());
    this.status(model.getStatus());
    this.startedBy(model.getStartedBy());
    this.source(model.getSource());
    this.payload(model.getPayload());
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
     * Unique id of the result
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    private final String eventId;

        /**
     * Unique id of the result
     * @return the value
     **/
    
    public String getEventId() {
        return eventId;
    }


        /**
     * Time of the log
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLog")
    private final java.util.Date timeOfLog;

        /**
     * Time of the log
     * @return the value
     **/
    
    public java.util.Date getTimeOfLog() {
        return timeOfLog;
    }

    
        /**
     * Type of Object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

        /**
     * Type of Object
     * @return the value
     **/
    
    public ObjectType getObjectType() {
        return objectType;
    }


        /**
     * Name of the object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

        /**
     * Name of the object
     * @return the value
     **/
    
    public String getObjectName() {
        return objectName;
    }

    
        /**
     * Type of operation
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

        /**
     * Type of operation
     * @return the value
     **/
    
    public Operation getOperation() {
        return operation;
    }

    
        /**
     * Status of log
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Status of log
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * operation started by
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("startedBy")
    private final String startedBy;

        /**
     * operation started by
     * @return the value
     **/
    
    public String getStartedBy() {
        return startedBy;
    }


        /**
     * Source of logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

        /**
     * Source of logs
     * @return the value
     **/
    
    public String getSource() {
        return source;
    }


        /**
     * payload of logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    private final String payload;

        /**
     * payload of logs
     * @return the value
     **/
    
    public String getPayload() {
        return payload;
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
        sb.append("AuditLogSearchResultSummary(");
        sb.append("eventId=").append(String.valueOf(this.eventId));
        sb.append(", timeOfLog=").append(String.valueOf(this.timeOfLog));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startedBy=").append(String.valueOf(this.startedBy));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", payload=").append(String.valueOf(this.payload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditLogSearchResultSummary)) {
            return false;
        }

        AuditLogSearchResultSummary other = (AuditLogSearchResultSummary) o;
        return java.util.Objects.equals(this.eventId, other.eventId) &&
            java.util.Objects.equals(this.timeOfLog, other.timeOfLog) &&
            java.util.Objects.equals(this.objectType, other.objectType) &&
            java.util.Objects.equals(this.objectName, other.objectName) &&
            java.util.Objects.equals(this.operation, other.operation) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.startedBy, other.startedBy) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.payload, other.payload);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result = (result * PRIME) + (this.timeOfLog == null ? 43 : this.timeOfLog.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.startedBy == null ? 43 : this.startedBy.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.payload == null ? 43 : this.payload.hashCode());
        return result;
    }


}
