// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Output of a task run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TaskRunOutput.Builder.class)

public final class TaskRunOutput  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "taskType", "isTruncated", "errorTrace", "data", "outputParameters", "version"})
    public TaskRunOutput(String key, TaskType taskType, Boolean isTruncated, String errorTrace, java.util.List<RunOutputData> data, java.util.List<OutputParameter> outputParameters, Integer version) {
        super();
        this.key = key;
        this.taskType = taskType;
        this.isTruncated = isTruncated;
        this.errorTrace = errorTrace;
        this.data = data;
        this.outputParameters = outputParameters;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A unique identifier for the output.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * A unique identifier for the output.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * The type of the task.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("taskType")
private TaskType taskType;

        /**
         * The type of the task.
         * @param taskType the value to set
         * @return this builder
         **/
        

public Builder taskType(TaskType taskType) {
    this.taskType = taskType;
    return this;
}
            /**
     * True if logs are truncated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
private Boolean isTruncated;

        /**
         * True if logs are truncated.
         * @param isTruncated the value to set
         * @return this builder
         **/
        

public Builder isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
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
     * Array of output objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("data")
private java.util.List<RunOutputData> data;

        /**
         * Array of output objects.
         * @param data the value to set
         * @return this builder
         **/
        

public Builder data(java.util.List<RunOutputData> data) {
    this.data = data;
    return this;
}
            /**
     * List of output parameters with name and values.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("outputParameters")
private java.util.List<OutputParameter> outputParameters;

        /**
         * List of output parameters with name and values.
         * @param outputParameters the value to set
         * @return this builder
         **/
        

public Builder outputParameters(java.util.List<OutputParameter> outputParameters) {
    this.outputParameters = outputParameters;
    return this;
}
            /**
     * Current version of job run object in repository.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private Integer version;

        /**
         * Current version of job run object in repository.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(Integer version) {
    this.version = version;
    return this;
}


        public TaskRunOutput build() {
            TaskRunOutput model = new TaskRunOutput(this.key
                , this.taskType
                , this.isTruncated
                , this.errorTrace
                , this.data
                , this.outputParameters
                , this.version);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunOutput model) {
                this.key(model.getKey());
    this.taskType(model.getTaskType());
    this.isTruncated(model.getIsTruncated());
    this.errorTrace(model.getErrorTrace());
    this.data(model.getData());
    this.outputParameters(model.getOutputParameters());
    this.version(model.getVersion());
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
     * A unique identifier for the output.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * A unique identifier for the output.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }

    /**
     * The type of the task.
     **/
    public enum TaskType implements com.oracle.bmc.http.internal.BmcEnum {
        NotebookTask("NOTEBOOK_TASK"),
        PythonTask("PYTHON_TASK"),
        SparkSubmitTask("SPARK_SUBMIT_TASK"),
        IfElseTask("IF_ELSE_TASK"),
        JobTask("JOB_TASK"),
        JarTask("JAR_TASK"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TaskType.class);

        private final String value;
        private static java.util.Map<String, TaskType> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskType v : TaskType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TaskType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'TaskType', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The type of the task.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

        /**
     * The type of the task.
     * @return the value
     **/
    
    public TaskType getTaskType() {
        return taskType;
    }


        /**
     * True if logs are truncated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
    private final Boolean isTruncated;

        /**
     * True if logs are truncated.
     * @return the value
     **/
    
    public Boolean getIsTruncated() {
        return isTruncated;
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
     * Array of output objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final java.util.List<RunOutputData> data;

        /**
     * Array of output objects.
     * @return the value
     **/
    
    public java.util.List<RunOutputData> getData() {
        return data;
    }


        /**
     * List of output parameters with name and values.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outputParameters")
    private final java.util.List<OutputParameter> outputParameters;

        /**
     * List of output parameters with name and values.
     * @return the value
     **/
    
    public java.util.List<OutputParameter> getOutputParameters() {
        return outputParameters;
    }


        /**
     * Current version of job run object in repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

        /**
     * Current version of job run object in repository.
     * @return the value
     **/
    
    public Integer getVersion() {
        return version;
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
        sb.append("TaskRunOutput(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", isTruncated=").append(String.valueOf(this.isTruncated));
        sb.append(", errorTrace=").append(String.valueOf(this.errorTrace));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(", outputParameters=").append(String.valueOf(this.outputParameters));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunOutput)) {
            return false;
        }

        TaskRunOutput other = (TaskRunOutput) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.taskType, other.taskType) &&
            java.util.Objects.equals(this.isTruncated, other.isTruncated) &&
            java.util.Objects.equals(this.errorTrace, other.errorTrace) &&
            java.util.Objects.equals(this.data, other.data) &&
            java.util.Objects.equals(this.outputParameters, other.outputParameters) &&
            java.util.Objects.equals(this.version, other.version);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.isTruncated == null ? 43 : this.isTruncated.hashCode());
        result = (result * PRIME) + (this.errorTrace == null ? 43 : this.errorTrace.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.outputParameters == null ? 43 : this.outputParameters.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }


}
