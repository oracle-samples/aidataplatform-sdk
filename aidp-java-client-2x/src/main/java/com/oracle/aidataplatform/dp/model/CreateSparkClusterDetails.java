// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Spark cluster details for creation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateSparkClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class CreateSparkClusterDetails extends CreateClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

            public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

            public Builder description(String description) {
            this.description = description;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("driverConfig")
        private DriverConfig driverConfig;

            public Builder driverConfig(DriverConfig driverConfig) {
            this.driverConfig = driverConfig;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private String nodeType;

            public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
            }
        
        @com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
        private WorkerConfig workerConfig;

        

        public Builder workerConfig(WorkerConfig workerConfig) {
        this.workerConfig = workerConfig;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
        private ClusterRuntimeConfig clusterRuntimeConfig;

        

        public Builder clusterRuntimeConfig(ClusterRuntimeConfig clusterRuntimeConfig) {
        this.clusterRuntimeConfig = clusterRuntimeConfig;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("loggingConfig")
        private LoggingConfig loggingConfig;

        

        public Builder loggingConfig(LoggingConfig loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
        }
            /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("autoTerminationMinutes")
        private Integer autoTerminationMinutes;

                /**
         * Optional timeout value in minutes used to automatically stop idle compute clusters.
         * @param autoTerminationMinutes the value to set
         * @return this builder
         **/
        

        public Builder autoTerminationMinutes(Integer autoTerminationMinutes) {
        this.autoTerminationMinutes = autoTerminationMinutes;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("attachToNotebookConfig")
        private AttachToNotebookConfig attachToNotebookConfig;

        

        public Builder attachToNotebookConfig(AttachToNotebookConfig attachToNotebookConfig) {
        this.attachToNotebookConfig = attachToNotebookConfig;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("subscription")
        private SubscriptionDetails subscription;

        

        public Builder subscription(SubscriptionDetails subscription) {
        this.subscription = subscription;
        return this;
        }


        public CreateSparkClusterDetails build() {
            CreateSparkClusterDetails model = new CreateSparkClusterDetails(this.displayName
                    , this.description
                    , this.driverConfig
                    , this.nodeType
                    , this.workerConfig
                    , this.clusterRuntimeConfig
                    , this.loggingConfig
                    , this.autoTerminationMinutes
                    , this.attachToNotebookConfig
                    , this.subscription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSparkClusterDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.driverConfig(model.getDriverConfig());
    this.nodeType(model.getNodeType());
    this.workerConfig(model.getWorkerConfig());
    this.clusterRuntimeConfig(model.getClusterRuntimeConfig());
    this.loggingConfig(model.getLoggingConfig());
    this.autoTerminationMinutes(model.getAutoTerminationMinutes());
    this.attachToNotebookConfig(model.getAttachToNotebookConfig());
    this.subscription(model.getSubscription());
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
    public CreateSparkClusterDetails(String displayName, String description, DriverConfig driverConfig, String nodeType, WorkerConfig workerConfig, ClusterRuntimeConfig clusterRuntimeConfig, LoggingConfig loggingConfig, Integer autoTerminationMinutes, AttachToNotebookConfig attachToNotebookConfig, SubscriptionDetails subscription) {
        super(displayName, description, driverConfig, nodeType);
        this.workerConfig = workerConfig;
        this.clusterRuntimeConfig = clusterRuntimeConfig;
        this.loggingConfig = loggingConfig;
        this.autoTerminationMinutes = autoTerminationMinutes;
        this.attachToNotebookConfig = attachToNotebookConfig;
        this.subscription = subscription;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("workerConfig")
    private final WorkerConfig workerConfig;

    
    public WorkerConfig getWorkerConfig() {
        return workerConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRuntimeConfig")
    private final ClusterRuntimeConfig clusterRuntimeConfig;

    
    public ClusterRuntimeConfig getClusterRuntimeConfig() {
        return clusterRuntimeConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("loggingConfig")
    private final LoggingConfig loggingConfig;

    
    public LoggingConfig getLoggingConfig() {
        return loggingConfig;
    }


        /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("autoTerminationMinutes")
    private final Integer autoTerminationMinutes;

        /**
     * Optional timeout value in minutes used to automatically stop idle compute clusters.
     * @return the value
     **/
    
    public Integer getAutoTerminationMinutes() {
        return autoTerminationMinutes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("attachToNotebookConfig")
    private final AttachToNotebookConfig attachToNotebookConfig;

    
    public AttachToNotebookConfig getAttachToNotebookConfig() {
        return attachToNotebookConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("subscription")
    private final SubscriptionDetails subscription;

    
    public SubscriptionDetails getSubscription() {
        return subscription;
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
        sb.append("CreateSparkClusterDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", workerConfig=").append(String.valueOf(this.workerConfig));
        sb.append(", clusterRuntimeConfig=").append(String.valueOf(this.clusterRuntimeConfig));
        sb.append(", loggingConfig=").append(String.valueOf(this.loggingConfig));
        sb.append(", autoTerminationMinutes=").append(String.valueOf(this.autoTerminationMinutes));
        sb.append(", attachToNotebookConfig=").append(String.valueOf(this.attachToNotebookConfig));
        sb.append(", subscription=").append(String.valueOf(this.subscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSparkClusterDetails)) {
            return false;
        }

        CreateSparkClusterDetails other = (CreateSparkClusterDetails) o;
        return java.util.Objects.equals(this.workerConfig, other.workerConfig) &&
            java.util.Objects.equals(this.clusterRuntimeConfig, other.clusterRuntimeConfig) &&
            java.util.Objects.equals(this.loggingConfig, other.loggingConfig) &&
            java.util.Objects.equals(this.autoTerminationMinutes, other.autoTerminationMinutes) &&
            java.util.Objects.equals(this.attachToNotebookConfig, other.attachToNotebookConfig) &&
            java.util.Objects.equals(this.subscription, other.subscription) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workerConfig == null ? 43 : this.workerConfig.hashCode());
        result = (result * PRIME) + (this.clusterRuntimeConfig == null ? 43 : this.clusterRuntimeConfig.hashCode());
        result = (result * PRIME) + (this.loggingConfig == null ? 43 : this.loggingConfig.hashCode());
        result = (result * PRIME) + (this.autoTerminationMinutes == null ? 43 : this.autoTerminationMinutes.hashCode());
        result = (result * PRIME) + (this.attachToNotebookConfig == null ? 43 : this.attachToNotebookConfig.hashCode());
        result = (result * PRIME) + (this.subscription == null ? 43 : this.subscription.hashCode());
        return result;
    }


}
