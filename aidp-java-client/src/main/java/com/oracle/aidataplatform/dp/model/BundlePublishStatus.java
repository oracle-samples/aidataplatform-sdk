// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Bundle publish status.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundlePublishStatus.Builder.class)

public final class BundlePublishStatus  {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "timeStarted", "timeCompleted", "message", "publish", "resources"})
    public BundlePublishStatus(Status status, java.util.Date timeStarted, java.util.Date timeCompleted, String message, BundlePublishLocation publish, java.util.List<BundlePublishedResource> resources) {
        super();
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
        this.message = message;
        this.publish = publish;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Publish status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Status status;

        /**
         * Publish status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(Status status) {
    this.status = status;
    return this;
}
            /**
     * Publish start time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
private java.util.Date timeStarted;

        /**
         * Publish start time.
         * @param timeStarted the value to set
         * @return this builder
         **/
        

public Builder timeStarted(java.util.Date timeStarted) {
    this.timeStarted = timeStarted;
    return this;
}
            /**
     * Publish end time.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
private java.util.Date timeCompleted;

        /**
         * Publish end time.
         * @param timeCompleted the value to set
         * @return this builder
         **/
        

public Builder timeCompleted(java.util.Date timeCompleted) {
    this.timeCompleted = timeCompleted;
    return this;
}
            /**
     * Publish summary.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Publish summary.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("publish")
private BundlePublishLocation publish;



public Builder publish(BundlePublishLocation publish) {
    this.publish = publish;
    return this;
}
            /**
     * Published resources.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resources")
private java.util.List<BundlePublishedResource> resources;

        /**
         * Published resources.
         * @param resources the value to set
         * @return this builder
         **/
        

public Builder resources(java.util.List<BundlePublishedResource> resources) {
    this.resources = resources;
    return this;
}


        public BundlePublishStatus build() {
            BundlePublishStatus model = new BundlePublishStatus(this.status
                , this.timeStarted
                , this.timeCompleted
                , this.message
                , this.publish
                , this.resources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundlePublishStatus model) {
                this.status(model.getStatus());
    this.timeStarted(model.getTimeStarted());
    this.timeCompleted(model.getTimeCompleted());
    this.message(model.getMessage());
    this.publish(model.getPublish());
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
     * Publish status.
     **/
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),
        NotPublished("NOT_PUBLISHED"),
        

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
     * Publish status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Publish status.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * Publish start time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * Publish start time.
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * Publish end time.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

        /**
     * Publish end time.
     * @return the value
     **/
    
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }


        /**
     * Publish summary.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Publish summary.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("publish")
    private final BundlePublishLocation publish;

    
    public BundlePublishLocation getPublish() {
        return publish;
    }


        /**
     * Published resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<BundlePublishedResource> resources;

        /**
     * Published resources.
     * @return the value
     **/
    
    public java.util.List<BundlePublishedResource> getResources() {
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
        sb.append("BundlePublishStatus(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", publish=").append(String.valueOf(this.publish));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundlePublishStatus)) {
            return false;
        }

        BundlePublishStatus other = (BundlePublishStatus) o;
        return java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeCompleted, other.timeCompleted) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.publish, other.publish) &&
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
        result = (result * PRIME) + (this.publish == null ? 43 : this.publish.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        return result;
    }


}
