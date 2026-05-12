package com.oracle.aidataplatform.dp.model;


/**
 * Summary of the most recent completed bundle deployment.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundleDeploymentStatus.Builder.class)

public final class BundleDeploymentStatus  {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "timeStarted", "timeCompleted", "message", "resources"})
    public BundleDeploymentStatus(Status status, java.util.Date timeStarted, java.util.Date timeCompleted, String message, java.util.List<BundleDeployedResource> resources) {
        super();
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
        this.message = message;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Overall status of the last deployment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

                /**
         * Overall status of the last deployment.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(Status status) {
        this.status = status;
        return this;
        }
            /**
     * The deployment start time
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

                /**
         * The deployment start time
         * @param timeStarted the value to set
         * @return this builder
         **/
        

        public Builder timeStarted(java.util.Date timeStarted) {
        this.timeStarted = timeStarted;
        return this;
        }
            /**
     * The deployment end time
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

                /**
         * The deployment end time
         * @param timeCompleted the value to set
         * @return this builder
         **/
        

        public Builder timeCompleted(java.util.Date timeCompleted) {
        this.timeCompleted = timeCompleted;
        return this;
        }
            /**
     * Optional summary message for the last deployment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

                /**
         * Optional summary message for the last deployment.
         * @param message the value to set
         * @return this builder
         **/
        

        public Builder message(String message) {
        this.message = message;
        return this;
        }
            /**
     * List of resources from the last deployment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<BundleDeployedResource> resources;

                /**
         * List of resources from the last deployment.
         * @param resources the value to set
         * @return this builder
         **/
        

        public Builder resources(java.util.List<BundleDeployedResource> resources) {
        this.resources = resources;
        return this;
        }


        public BundleDeploymentStatus build() {
            BundleDeploymentStatus model = new BundleDeploymentStatus(this.status
                    , this.timeStarted
                    , this.timeCompleted
                    , this.message
                    , this.resources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundleDeploymentStatus model) {
                this.status(model.getStatus());
    this.timeStarted(model.getTimeStarted());
    this.timeCompleted(model.getTimeCompleted());
    this.message(model.getMessage());
    this.resources(model.getResources());
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
     * Overall status of the last deployment.
     **/
    public enum Status {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),
        NotDeployed("NOT_DEPLOYED"),
        

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
     * Overall status of the last deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Overall status of the last deployment.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * The deployment start time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * The deployment start time
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * The deployment end time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

        /**
     * The deployment end time
     * @return the value
     **/
    
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }


        /**
     * Optional summary message for the last deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Optional summary message for the last deployment.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * List of resources from the last deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<BundleDeployedResource> resources;

        /**
     * List of resources from the last deployment.
     * @return the value
     **/
    
    public java.util.List<BundleDeployedResource> getResources() {
        return resources;
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
        sb.append("BundleDeploymentStatus(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundleDeploymentStatus)) {
            return false;
        }

        BundleDeploymentStatus other = (BundleDeploymentStatus) o;
        return java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeCompleted, other.timeCompleted) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.resources, other.resources);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        return result;
    }


}
