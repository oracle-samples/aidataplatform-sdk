// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * event object details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TraceEvent.Builder.class)

public final class TraceEvent  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "timestamp", "attributes"})
    public TraceEvent(String name, java.util.Date timestamp, java.util.Map<String, Object> attributes) {
        super();
        this.name = name;
        this.timestamp = timestamp;
        this.attributes = attributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * event name
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * event name
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * event start time
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

                /**
         * event start time
         * @param timestamp the value to set
         * @return this builder
         **/
        

        public Builder timestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
        }
            /**
     * event attributes
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.Map<String, Object> attributes;

                /**
         * event attributes
         * @param attributes the value to set
         * @return this builder
         **/
        

        public Builder attributes(java.util.Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
        }


        public TraceEvent build() {
            TraceEvent model = new TraceEvent(this.name
                    , this.timestamp
                    , this.attributes);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceEvent model) {
                this.name(model.getName());
    this.timestamp(model.getTimestamp());
    this.attributes(model.getAttributes());
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
     * event name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * event name
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * event start time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

        /**
     * event start time
     * @return the value
     **/
    
    public java.util.Date getTimestamp() {
        return timestamp;
    }


        /**
     * event attributes
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.Map<String, Object> attributes;

        /**
     * event attributes
     * @return the value
     **/
    
    public java.util.Map<String, Object> getAttributes() {
        return attributes;
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
        sb.append("TraceEvent(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TraceEvent)) {
            return false;
        }

        TraceEvent other = (TraceEvent) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.attributes, other.attributes);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        return result;
    }


}
