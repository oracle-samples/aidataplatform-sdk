package com.oracle.aidataplatform.dp.model;



/**
 * Request payload for searching logs in a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchClusterLogsDetails.Builder.class)

public final class SearchClusterLogsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeBegin", "timeEnd", "logContentTypeContains", "subjectContains", "messageContains", "logLevel", "opcRequestId", "advancedFilter", "thread", "executionContextId", "logStreamTypeContains", "eventType"})
    public SearchClusterLogsDetails(java.util.Date timeBegin, java.util.Date timeEnd, String logContentTypeContains, String subjectContains, String messageContains, String logLevel, String opcRequestId, String advancedFilter, String thread, String executionContextId, String logStreamTypeContains, String eventType) {
        super();
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.logContentTypeContains = logContentTypeContains;
        this.subjectContains = subjectContains;
        this.messageContains = messageContains;
        this.logLevel = logLevel;
        this.opcRequestId = opcRequestId;
        this.advancedFilter = advancedFilter;
        this.thread = thread;
        this.executionContextId = executionContextId;
        this.logStreamTypeContains = logStreamTypeContains;
        this.eventType = eventType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Start filter log's date and time, in RFC 3339 format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
private java.util.Date timeBegin;

        /**
         * Start filter log's date and time, in RFC 3339 format.
         * @param timeBegin the value to set
         * @return this builder
         **/
        

public Builder timeBegin(java.util.Date timeBegin) {
    this.timeBegin = timeBegin;
    return this;
}
            /**
     * End filter log's date and time, in RFC 3339 format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * End filter log's date and time, in RFC 3339 format.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * The string represent the type of compute logs 
* Common values include {@code events}, {@code driver}, {@code executor}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logContentTypeContains")
private String logContentTypeContains;

        /**
         * The string represent the type of compute logs 
* Common values include {@code events}, {@code driver}, {@code executor}.
* 
         * @param logContentTypeContains the value to set
         * @return this builder
         **/
        

public Builder logContentTypeContains(String logContentTypeContains) {
    this.logContentTypeContains = logContentTypeContains;
    return this;
}
            /**
     * The string represent the specific of compute nodes
* Common values include {@code spark-driver}, {@code spark-executor-1}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("subjectContains")
private String subjectContains;

        /**
         * The string represent the specific of compute nodes
* Common values include {@code spark-driver}, {@code spark-executor-1}.
* 
         * @param subjectContains the value to set
         * @return this builder
         **/
        

public Builder subjectContains(String subjectContains) {
    this.subjectContains = subjectContains;
    return this;
}
            /**
     * The string represent a filter to search message string from the log
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("messageContains")
private String messageContains;

        /**
         * The string represent a filter to search message string from the log
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
         * @param messageContains the value to set
         * @return this builder
         **/
        

public Builder messageContains(String messageContains) {
    this.messageContains = messageContains;
    return this;
}
            /**
     * The severity level of the log messages to filter. 
* Common values include {@code INFO}, {@code WARN}, {@code ERROR}, {@code DEBUG}, etc.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logLevel")
private String logLevel;

        /**
         * The severity level of the log messages to filter. 
* Common values include {@code INFO}, {@code WARN}, {@code ERROR}, {@code DEBUG}, etc.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
         * @param logLevel the value to set
         * @return this builder
         **/
        

public Builder logLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
}
            /**
     * The unique request identifier used for tracking the API call.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * The unique request identifier used for tracking the API call.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
            /**
     * Contains any key and value that you want to search in the logs.
* Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("advancedFilter")
private String advancedFilter;

        /**
         * Contains any key and value that you want to search in the logs.
* Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'
* 
         * @param advancedFilter the value to set
         * @return this builder
         **/
        

public Builder advancedFilter(String advancedFilter) {
    this.advancedFilter = advancedFilter;
    return this;
}
            /**
     * The thread identifier that generated the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("thread")
private String thread;

        /**
         * The thread identifier that generated the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
         * @param thread the value to set
         * @return this builder
         **/
        

public Builder thread(String thread) {
    this.thread = thread;
    return this;
}
            /**
     * The execution context identifier associated with the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("executionContextId")
private String executionContextId;

        /**
         * The execution context identifier associated with the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
         * @param executionContextId the value to set
         * @return this builder
         **/
        

public Builder executionContextId(String executionContextId) {
    this.executionContextId = executionContextId;
    return this;
}
            /**
     * Filters logs based on the output stream type. 
* - This includes standard output ({@code stdout}) for regular program output 
* - and standard error ({@code stderr}) for error messages and diagnostics.
* Only supported when logContentTypeContains=executor/driver.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logStreamTypeContains")
private String logStreamTypeContains;

        /**
         * Filters logs based on the output stream type. 
* - This includes standard output ({@code stdout}) for regular program output 
* - and standard error ({@code stderr}) for error messages and diagnostics.
* Only supported when logContentTypeContains=executor/driver.
* 
         * @param logStreamTypeContains the value to set
         * @return this builder
         **/
        

public Builder logStreamTypeContains(String logStreamTypeContains) {
    this.logStreamTypeContains = logStreamTypeContains;
    return this;
}
            /**
     * Filters logs based on the event type.
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("eventType")
private String eventType;

        /**
         * Filters logs based on the event type.
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
         * @param eventType the value to set
         * @return this builder
         **/
        

public Builder eventType(String eventType) {
    this.eventType = eventType;
    return this;
}


        public SearchClusterLogsDetails build() {
            SearchClusterLogsDetails model = new SearchClusterLogsDetails(this.timeBegin
                , this.timeEnd
                , this.logContentTypeContains
                , this.subjectContains
                , this.messageContains
                , this.logLevel
                , this.opcRequestId
                , this.advancedFilter
                , this.thread
                , this.executionContextId
                , this.logStreamTypeContains
                , this.eventType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchClusterLogsDetails model) {
                this.timeBegin(model.getTimeBegin());
    this.timeEnd(model.getTimeEnd());
    this.logContentTypeContains(model.getLogContentTypeContains());
    this.subjectContains(model.getSubjectContains());
    this.messageContains(model.getMessageContains());
    this.logLevel(model.getLogLevel());
    this.opcRequestId(model.getOpcRequestId());
    this.advancedFilter(model.getAdvancedFilter());
    this.thread(model.getThread());
    this.executionContextId(model.getExecutionContextId());
    this.logStreamTypeContains(model.getLogStreamTypeContains());
    this.eventType(model.getEventType());
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
     * Start filter log's date and time, in RFC 3339 format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

        /**
     * Start filter log's date and time, in RFC 3339 format.
     * @return the value
     **/
    
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }


        /**
     * End filter log's date and time, in RFC 3339 format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End filter log's date and time, in RFC 3339 format.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * The string represent the type of compute logs 
* Common values include {@code events}, {@code driver}, {@code executor}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logContentTypeContains")
    private final String logContentTypeContains;

        /**
     * The string represent the type of compute logs 
* Common values include {@code events}, {@code driver}, {@code executor}.
* 
     * @return the value
     **/
    
    public String getLogContentTypeContains() {
        return logContentTypeContains;
    }


        /**
     * The string represent the specific of compute nodes
* Common values include {@code spark-driver}, {@code spark-executor-1}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("subjectContains")
    private final String subjectContains;

        /**
     * The string represent the specific of compute nodes
* Common values include {@code spark-driver}, {@code spark-executor-1}.
* 
     * @return the value
     **/
    
    public String getSubjectContains() {
        return subjectContains;
    }


        /**
     * The string represent a filter to search message string from the log
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("messageContains")
    private final String messageContains;

        /**
     * The string represent a filter to search message string from the log
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     * @return the value
     **/
    
    public String getMessageContains() {
        return messageContains;
    }


        /**
     * The severity level of the log messages to filter. 
* Common values include {@code INFO}, {@code WARN}, {@code ERROR}, {@code DEBUG}, etc.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logLevel")
    private final String logLevel;

        /**
     * The severity level of the log messages to filter. 
* Common values include {@code INFO}, {@code WARN}, {@code ERROR}, {@code DEBUG}, etc.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     * @return the value
     **/
    
    public String getLogLevel() {
        return logLevel;
    }


        /**
     * The unique request identifier used for tracking the API call.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * The unique request identifier used for tracking the API call.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


        /**
     * Contains any key and value that you want to search in the logs.
* Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("advancedFilter")
    private final String advancedFilter;

        /**
     * Contains any key and value that you want to search in the logs.
* Should be provided in the format 'key = value'. As of now supported keys are 'taskRunKey' and 'jobRunKey'
* 
     * @return the value
     **/
    
    public String getAdvancedFilter() {
        return advancedFilter;
    }


        /**
     * The thread identifier that generated the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("thread")
    private final String thread;

        /**
     * The thread identifier that generated the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     * @return the value
     **/
    
    public String getThread() {
        return thread;
    }


        /**
     * The execution context identifier associated with the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("executionContextId")
    private final String executionContextId;

        /**
     * The execution context identifier associated with the log.
* Supported only when {@code logContentTypeContains} is {@code executor} or {@code driver}.
* 
     * @return the value
     **/
    
    public String getExecutionContextId() {
        return executionContextId;
    }


        /**
     * Filters logs based on the output stream type. 
* - This includes standard output ({@code stdout}) for regular program output 
* - and standard error ({@code stderr}) for error messages and diagnostics.
* Only supported when logContentTypeContains=executor/driver.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logStreamTypeContains")
    private final String logStreamTypeContains;

        /**
     * Filters logs based on the output stream type. 
* - This includes standard output ({@code stdout}) for regular program output 
* - and standard error ({@code stderr}) for error messages and diagnostics.
* Only supported when logContentTypeContains=executor/driver.
* 
     * @return the value
     **/
    
    public String getLogStreamTypeContains() {
        return logStreamTypeContains;
    }


        /**
     * Filters logs based on the event type.
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    private final String eventType;

        /**
     * Filters logs based on the event type.
* Supported only when {@code logContentTypeContains} is {@code events}.
* 
     * @return the value
     **/
    
    public String getEventType() {
        return eventType;
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
        sb.append("SearchClusterLogsDetails(");
        sb.append("timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", logContentTypeContains=").append(String.valueOf(this.logContentTypeContains));
        sb.append(", subjectContains=").append(String.valueOf(this.subjectContains));
        sb.append(", messageContains=").append(String.valueOf(this.messageContains));
        sb.append(", logLevel=").append(String.valueOf(this.logLevel));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", advancedFilter=").append(String.valueOf(this.advancedFilter));
        sb.append(", thread=").append(String.valueOf(this.thread));
        sb.append(", executionContextId=").append(String.valueOf(this.executionContextId));
        sb.append(", logStreamTypeContains=").append(String.valueOf(this.logStreamTypeContains));
        sb.append(", eventType=").append(String.valueOf(this.eventType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchClusterLogsDetails)) {
            return false;
        }

        SearchClusterLogsDetails other = (SearchClusterLogsDetails) o;
        return java.util.Objects.equals(this.timeBegin, other.timeBegin) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.logContentTypeContains, other.logContentTypeContains) &&
            java.util.Objects.equals(this.subjectContains, other.subjectContains) &&
            java.util.Objects.equals(this.messageContains, other.messageContains) &&
            java.util.Objects.equals(this.logLevel, other.logLevel) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.advancedFilter, other.advancedFilter) &&
            java.util.Objects.equals(this.thread, other.thread) &&
            java.util.Objects.equals(this.executionContextId, other.executionContextId) &&
            java.util.Objects.equals(this.logStreamTypeContains, other.logStreamTypeContains) &&
            java.util.Objects.equals(this.eventType, other.eventType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.logContentTypeContains == null ? 43 : this.logContentTypeContains.hashCode());
        result = (result * PRIME) + (this.subjectContains == null ? 43 : this.subjectContains.hashCode());
        result = (result * PRIME) + (this.messageContains == null ? 43 : this.messageContains.hashCode());
        result = (result * PRIME) + (this.logLevel == null ? 43 : this.logLevel.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.advancedFilter == null ? 43 : this.advancedFilter.hashCode());
        result = (result * PRIME) + (this.thread == null ? 43 : this.thread.hashCode());
        result = (result * PRIME) + (this.executionContextId == null ? 43 : this.executionContextId.hashCode());
        result = (result * PRIME) + (this.logStreamTypeContains == null ? 43 : this.logStreamTypeContains.hashCode());
        result = (result * PRIME) + (this.eventType == null ? 43 : this.eventType.hashCode());
        return result;
    }


}
