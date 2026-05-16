// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The information about the Notebook task.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PythonTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class PythonTask extends Task {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
        private String taskKey;

            public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
        private java.util.List<DependsOn> dependsOn;

            public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("runIf")
        private RunIf runIf;

            public Builder runIf(RunIf runIf) {
            this.runIf = runIf;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
        private Integer maxRetries;

            public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("minRetryIntervalMillis")
        private Integer minRetryIntervalMillis;

            public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
            this.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("isRetryOnTimeout")
        private Boolean isRetryOnTimeout;

            public Builder isRetryOnTimeout(Boolean isRetryOnTimeout) {
            this.isRetryOnTimeout = isRetryOnTimeout;
            return this;
            }
            /**
     * The path where the Python file exists.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("filePath")
        private String filePath;

                /**
         * The path where the Python file exists.
         * @param filePath the value to set
         * @return this builder
         **/
        

        public Builder filePath(String filePath) {
        this.filePath = filePath;
        return this;
        }
            /**
     * Source selected for a task. Either workspace or Git provider.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

                /**
         * Source selected for a task. Either workspace or Git provider.
         * @param source the value to set
         * @return this builder
         **/
        

        public Builder source(Source source) {
        this.source = source;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("gitConfig")
        private GitConfig gitConfig;

        

        public Builder gitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("cluster")
        private JobCluster cluster;

        

        public Builder cluster(JobCluster cluster) {
        this.cluster = cluster;
        return this;
        }
            /**
     * The command line arguments to pass to Python task.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
        private String commandLineArguments;

                /**
         * The command line arguments to pass to Python task.
         * @param commandLineArguments the value to set
         * @return this builder
         **/
        

        public Builder commandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
        return this;
        }
            /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
        private Integer timeoutSeconds;

                /**
         * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
         * @param timeoutSeconds the value to set
         * @return this builder
         **/
        

        public Builder timeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
        }
            /**
     * An optional property to enable or disable the streaming capability for a task.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isStreaming")
        private Boolean isStreaming;

                /**
         * An optional property to enable or disable the streaming capability for a task.
         * @param isStreaming the value to set
         * @return this builder
         **/
        

        public Builder isStreaming(Boolean isStreaming) {
        this.isStreaming = isStreaming;
        return this;
        }


        public PythonTask build() {
            PythonTask model = new PythonTask(this.taskKey
                    , this.dependsOn
                    , this.runIf
                    , this.maxRetries
                    , this.minRetryIntervalMillis
                    , this.isRetryOnTimeout
                    , this.filePath
                    , this.source
                    , this.gitConfig
                    , this.cluster
                    , this.commandLineArguments
                    , this.timeoutSeconds
                    , this.isStreaming);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PythonTask model) {
                this.taskKey(model.getTaskKey());
    this.dependsOn(model.getDependsOn());
    this.runIf(model.getRunIf());
    this.maxRetries(model.getMaxRetries());
    this.minRetryIntervalMillis(model.getMinRetryIntervalMillis());
    this.isRetryOnTimeout(model.getIsRetryOnTimeout());
    this.filePath(model.getFilePath());
    this.source(model.getSource());
    this.gitConfig(model.getGitConfig());
    this.cluster(model.getCluster());
    this.commandLineArguments(model.getCommandLineArguments());
    this.timeoutSeconds(model.getTimeoutSeconds());
    this.isStreaming(model.getIsStreaming());
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

    
    @Deprecated
    public PythonTask(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout, String filePath, Source source, GitConfig gitConfig, JobCluster cluster, String commandLineArguments, Integer timeoutSeconds, Boolean isStreaming) {
        super(taskKey, dependsOn, runIf, maxRetries, minRetryIntervalMillis, isRetryOnTimeout);
        this.filePath = filePath;
        this.source = source;
        this.gitConfig = gitConfig;
        this.cluster = cluster;
        this.commandLineArguments = commandLineArguments;
        this.timeoutSeconds = timeoutSeconds;
        this.isStreaming = isStreaming;
    }


        /**
     * The path where the Python file exists.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("filePath")
    private final String filePath;

        /**
     * The path where the Python file exists.
     * @return the value
     **/
    
    public String getFilePath() {
        return filePath;
    }

    /**
     * Source selected for a task. Either workspace or Git provider.
     **/
    public enum Source {
        Workspace("WORKSPACE"),
        GitProvider("GIT_PROVIDER"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Source', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Source selected for a task. Either workspace or Git provider.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

        /**
     * Source selected for a task. Either workspace or Git provider.
     * @return the value
     **/
    
    public Source getSource() {
        return source;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("gitConfig")
    private final GitConfig gitConfig;

    
    public GitConfig getGitConfig() {
        return gitConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    private final JobCluster cluster;

    
    public JobCluster getCluster() {
        return cluster;
    }


        /**
     * The command line arguments to pass to Python task.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
    private final String commandLineArguments;

        /**
     * The command line arguments to pass to Python task.
     * @return the value
     **/
    
    public String getCommandLineArguments() {
        return commandLineArguments;
    }


        /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    private final Integer timeoutSeconds;

        /**
     * An optional value to indicate the max run duration of a job after which job will be timed out. The default is Zero indicating no timeout value.
     * @return the value
     **/
    
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }


        /**
     * An optional property to enable or disable the streaming capability for a task.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isStreaming")
    private final Boolean isStreaming;

        /**
     * An optional property to enable or disable the streaming capability for a task.
     * @return the value
     **/
    
    public Boolean getIsStreaming() {
        return isStreaming;
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
        sb.append("PythonTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", filePath=").append(String.valueOf(this.filePath));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", gitConfig=").append(String.valueOf(this.gitConfig));
        sb.append(", cluster=").append(String.valueOf(this.cluster));
        sb.append(", commandLineArguments=").append(String.valueOf(this.commandLineArguments));
        sb.append(", timeoutSeconds=").append(String.valueOf(this.timeoutSeconds));
        sb.append(", isStreaming=").append(String.valueOf(this.isStreaming));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PythonTask)) {
            return false;
        }

        PythonTask other = (PythonTask) o;
        return java.util.Objects.equals(this.filePath, other.filePath) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.gitConfig, other.gitConfig) &&
            java.util.Objects.equals(this.cluster, other.cluster) &&
            java.util.Objects.equals(this.commandLineArguments, other.commandLineArguments) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds) &&
            java.util.Objects.equals(this.isStreaming, other.isStreaming) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.gitConfig == null ? 43 : this.gitConfig.hashCode());
        result = (result * PRIME) + (this.cluster == null ? 43 : this.cluster.hashCode());
        result = (result * PRIME) + (this.commandLineArguments == null ? 43 : this.commandLineArguments.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        result = (result * PRIME) + (this.isStreaming == null ? 43 : this.isStreaming.hashCode());
        return result;
    }


}
