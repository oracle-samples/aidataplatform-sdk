// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information about a Spark driver failure and subsequent recovery event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DriverFailedAndRecoveredEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class DriverFailedAndRecoveredEvent extends ClusterEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The date and time when the replacement Spark driver became ready, in RFC 3339 format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeDriverRecovered")
private java.util.Date timeDriverRecovered;

        /**
         * The date and time when the replacement Spark driver became ready, in RFC 3339 format.
         * @param timeDriverRecovered the value to set
         * @return this builder
         **/
        

public Builder timeDriverRecovered(java.util.Date timeDriverRecovered) {
    this.timeDriverRecovered = timeDriverRecovered;
    return this;
}
            /**
     * The reason why the previous Spark driver failed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("failureReason")
private String failureReason;

        /**
         * The reason why the previous Spark driver failed.
         * @param failureReason the value to set
         * @return this builder
         **/
        

public Builder failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
}


        public DriverFailedAndRecoveredEvent build() {
            DriverFailedAndRecoveredEvent model = new DriverFailedAndRecoveredEvent(this.timeDriverRecovered
                , this.failureReason);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DriverFailedAndRecoveredEvent model) {
                this.timeDriverRecovered(model.getTimeDriverRecovered());
    this.failureReason(model.getFailureReason());
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
    public DriverFailedAndRecoveredEvent(java.util.Date timeDriverRecovered, String failureReason) {
    super();
        this.timeDriverRecovered = timeDriverRecovered;
        this.failureReason = failureReason;
    }


        /**
     * The date and time when the replacement Spark driver became ready, in RFC 3339 format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeDriverRecovered")
    private final java.util.Date timeDriverRecovered;

        /**
     * The date and time when the replacement Spark driver became ready, in RFC 3339 format.
     * @return the value
     **/
    
    public java.util.Date getTimeDriverRecovered() {
        return timeDriverRecovered;
    }


        /**
     * The reason why the previous Spark driver failed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failureReason")
    private final String failureReason;

        /**
     * The reason why the previous Spark driver failed.
     * @return the value
     **/
    
    public String getFailureReason() {
        return failureReason;
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
        sb.append("DriverFailedAndRecoveredEvent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeDriverRecovered=").append(String.valueOf(this.timeDriverRecovered));
        sb.append(", failureReason=").append(String.valueOf(this.failureReason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DriverFailedAndRecoveredEvent)) {
            return false;
        }

        DriverFailedAndRecoveredEvent other = (DriverFailedAndRecoveredEvent) o;
        return java.util.Objects.equals(this.timeDriverRecovered, other.timeDriverRecovered) &&
            java.util.Objects.equals(this.failureReason, other.failureReason) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeDriverRecovered == null ? 43 : this.timeDriverRecovered.hashCode());
        result = (result * PRIME) + (this.failureReason == null ? 43 : this.failureReason.hashCode());
        return result;
    }


}
