// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to update a new session of an Agent Flow.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentFlowSessionDetails.Builder.class)

public final class UpdateAgentFlowSessionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "timeStarted", "timeEnded", "context"})
    public UpdateAgentFlowSessionDetails(String displayName, java.util.Date timeStarted, java.util.Date timeEnded, AgentFlowSessionContext context) {
        super();
        this.displayName = displayName;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.context = context;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The date and time the session was started
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
private java.util.Date timeStarted;

        /**
         * The date and time the session was started
         * @param timeStarted the value to set
         * @return this builder
         **/
        

public Builder timeStarted(java.util.Date timeStarted) {
    this.timeStarted = timeStarted;
    return this;
}
            /**
     * The date and time the session was ended
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
private java.util.Date timeEnded;

        /**
         * The date and time the session was ended
         * @param timeEnded the value to set
         * @return this builder
         **/
        

public Builder timeEnded(java.util.Date timeEnded) {
    this.timeEnded = timeEnded;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("context")
private AgentFlowSessionContext context;



public Builder context(AgentFlowSessionContext context) {
    this.context = context;
    return this;
}


        public UpdateAgentFlowSessionDetails build() {
            UpdateAgentFlowSessionDetails model = new UpdateAgentFlowSessionDetails(this.displayName
                , this.timeStarted
                , this.timeEnded
                , this.context);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentFlowSessionDetails model) {
                this.displayName(model.getDisplayName());
    this.timeStarted(model.getTimeStarted());
    this.timeEnded(model.getTimeEnded());
    this.context(model.getContext());
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
     * Display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The date and time the session was started
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * The date and time the session was started
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * The date and time the session was ended
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

        /**
     * The date and time the session was ended
     * @return the value
     **/
    
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final AgentFlowSessionContext context;

    
    public AgentFlowSessionContext getContext() {
        return context;
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
        sb.append("UpdateAgentFlowSessionDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentFlowSessionDetails)) {
            return false;
        }

        UpdateAgentFlowSessionDetails other = (UpdateAgentFlowSessionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeEnded, other.timeEnded) &&
            java.util.Objects.equals(this.context, other.context);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        return result;
    }


}
