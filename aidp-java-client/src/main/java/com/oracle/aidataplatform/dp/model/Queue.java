// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Queue configuration for job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Queue.Builder.class)

public final class Queue  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled"})
    public Queue(Boolean isEnabled) {
        super();
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * True if job queue is enabled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * True if job queue is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}


        public Queue build() {
            Queue model = new Queue(this.isEnabled);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Queue model) {
                this.isEnabled(model.getIsEnabled());
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
     * True if job queue is enabled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * True if job queue is enabled.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("Queue(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Queue)) {
            return false;
        }

        Queue other = (Queue) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        return result;
    }


}
