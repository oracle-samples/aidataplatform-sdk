package com.oracle.aidataplatform.dp.model;


/**
 * The information about the Jar task.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JarTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class JarTask extends Task {
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
     * Name of the main class.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("mainClass")
        private String mainClass;

                /**
         * Name of the main class.
         * @param mainClass the value to set
         * @return this builder
         **/
        

        public Builder mainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
        }
            /**
     * The list of dependent jars
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dependentLibraries")
        private java.util.List<String> dependentLibraries;

                /**
         * The list of dependent jars
         * @param dependentLibraries the value to set
         * @return this builder
         **/
        

        public Builder dependentLibraries(java.util.List<String> dependentLibraries) {
        this.dependentLibraries = dependentLibraries;
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
     * An optional list of parameters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

                /**
         * An optional list of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
        

        public Builder parameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
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


        public JarTask build() {
            JarTask model = new JarTask(this.taskKey
                    , this.dependsOn
                    , this.runIf
                    , this.maxRetries
                    , this.minRetryIntervalMillis
                    , this.isRetryOnTimeout
                    , this.mainClass
                    , this.dependentLibraries
                    , this.source
                    , this.gitConfig
                    , this.cluster
                    , this.commandLineArguments
                    , this.parameters
                    , this.timeoutSeconds
                    , this.isStreaming);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JarTask model) {
                this.taskKey(model.getTaskKey());
    this.dependsOn(model.getDependsOn());
    this.runIf(model.getRunIf());
    this.maxRetries(model.getMaxRetries());
    this.minRetryIntervalMillis(model.getMinRetryIntervalMillis());
    this.isRetryOnTimeout(model.getIsRetryOnTimeout());
    this.mainClass(model.getMainClass());
    this.dependentLibraries(model.getDependentLibraries());
    this.source(model.getSource());
    this.gitConfig(model.getGitConfig());
    this.cluster(model.getCluster());
    this.commandLineArguments(model.getCommandLineArguments());
    this.parameters(model.getParameters());
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
    public JarTask(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout, String mainClass, java.util.List<String> dependentLibraries, Source source, GitConfig gitConfig, JobCluster cluster, String commandLineArguments, java.util.List<Parameter> parameters, Integer timeoutSeconds, Boolean isStreaming) {
        super(taskKey, dependsOn, runIf, maxRetries, minRetryIntervalMillis, isRetryOnTimeout);
        this.mainClass = mainClass;
        this.dependentLibraries = dependentLibraries;
        this.source = source;
        this.gitConfig = gitConfig;
        this.cluster = cluster;
        this.commandLineArguments = commandLineArguments;
        this.parameters = parameters;
        this.timeoutSeconds = timeoutSeconds;
        this.isStreaming = isStreaming;
    }


        /**
     * Name of the main class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mainClass")
    private final String mainClass;

        /**
     * Name of the main class.
     * @return the value
     **/
    
    public String getMainClass() {
        return mainClass;
    }


        /**
     * The list of dependent jars
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependentLibraries")
    private final java.util.List<String> dependentLibraries;

        /**
     * The list of dependent jars
     * @return the value
     **/
    
    public java.util.List<String> getDependentLibraries() {
        return dependentLibraries;
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
     * An optional list of parameters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

        /**
     * An optional list of parameters.
     * @return the value
     **/
    
    public java.util.List<Parameter> getParameters() {
        return parameters;
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
        sb.append("JarTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mainClass=").append(String.valueOf(this.mainClass));
        sb.append(", dependentLibraries=").append(String.valueOf(this.dependentLibraries));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", gitConfig=").append(String.valueOf(this.gitConfig));
        sb.append(", cluster=").append(String.valueOf(this.cluster));
        sb.append(", commandLineArguments=").append(String.valueOf(this.commandLineArguments));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
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
        if (!(o instanceof JarTask)) {
            return false;
        }

        JarTask other = (JarTask) o;
        return java.util.Objects.equals(this.mainClass, other.mainClass) &&
            java.util.Objects.equals(this.dependentLibraries, other.dependentLibraries) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.gitConfig, other.gitConfig) &&
            java.util.Objects.equals(this.cluster, other.cluster) &&
            java.util.Objects.equals(this.commandLineArguments, other.commandLineArguments) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            java.util.Objects.equals(this.timeoutSeconds, other.timeoutSeconds) &&
            java.util.Objects.equals(this.isStreaming, other.isStreaming) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mainClass == null ? 43 : this.mainClass.hashCode());
        result = (result * PRIME) + (this.dependentLibraries == null ? 43 : this.dependentLibraries.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.gitConfig == null ? 43 : this.gitConfig.hashCode());
        result = (result * PRIME) + (this.cluster == null ? 43 : this.cluster.hashCode());
        result = (result * PRIME) + (this.commandLineArguments == null ? 43 : this.commandLineArguments.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeoutSeconds == null ? 43 : this.timeoutSeconds.hashCode());
        result = (result * PRIME) + (this.isStreaming == null ? 43 : this.isStreaming.hashCode());
        return result;
    }


}
