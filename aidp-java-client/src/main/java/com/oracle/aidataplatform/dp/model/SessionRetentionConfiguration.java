// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Session data retention configuration for an Agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionRetentionConfiguration.Builder.class)

public final class SessionRetentionConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isRetentionPolicyEnabled", "breachAction", "retentionPeriodInDays", "sessionSizeLimit", "threadCountLimit"})
    public SessionRetentionConfiguration(Boolean isRetentionPolicyEnabled, RetentionBreachAction breachAction, Integer retentionPeriodInDays, Integer sessionSizeLimit, Integer threadCountLimit) {
        super();
        this.isRetentionPolicyEnabled = isRetentionPolicyEnabled;
        this.breachAction = breachAction;
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.sessionSizeLimit = sessionSizeLimit;
        this.threadCountLimit = threadCountLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether session-message retention is enabled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isRetentionPolicyEnabled")
private Boolean isRetentionPolicyEnabled;

        /**
         * Whether session-message retention is enabled.
         * @param isRetentionPolicyEnabled the value to set
         * @return this builder
         **/
        

public Builder isRetentionPolicyEnabled(Boolean isRetentionPolicyEnabled) {
    this.isRetentionPolicyEnabled = isRetentionPolicyEnabled;
    return this;
}
            /**
     * Action taken when the enabled retention condition is breached.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("breachAction")
private RetentionBreachAction breachAction;

        /**
         * Action taken when the enabled retention condition is breached.
         * @param breachAction the value to set
         * @return this builder
         **/
        

public Builder breachAction(RetentionBreachAction breachAction) {
    this.breachAction = breachAction;
    return this;
}
            /**
     * No. of days session data will be kept
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
private Integer retentionPeriodInDays;

        /**
         * No. of days session data will be kept
         * @param retentionPeriodInDays the value to set
         * @return this builder
         **/
        

public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
    this.retentionPeriodInDays = retentionPeriodInDays;
    return this;
}
            /**
     * Max storage allocated to session data (in MB).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sessionSizeLimit")
private Integer sessionSizeLimit;

        /**
         * Max storage allocated to session data (in MB).
         * @param sessionSizeLimit the value to set
         * @return this builder
         **/
        

public Builder sessionSizeLimit(Integer sessionSizeLimit) {
    this.sessionSizeLimit = sessionSizeLimit;
    return this;
}
            /**
     * Maximum no. of user prompt and agent response pairs per session
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("threadCountLimit")
private Integer threadCountLimit;

        /**
         * Maximum no. of user prompt and agent response pairs per session
         * @param threadCountLimit the value to set
         * @return this builder
         **/
        

public Builder threadCountLimit(Integer threadCountLimit) {
    this.threadCountLimit = threadCountLimit;
    return this;
}


        public SessionRetentionConfiguration build() {
            SessionRetentionConfiguration model = new SessionRetentionConfiguration(this.isRetentionPolicyEnabled
                , this.breachAction
                , this.retentionPeriodInDays
                , this.sessionSizeLimit
                , this.threadCountLimit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionRetentionConfiguration model) {
                this.isRetentionPolicyEnabled(model.getIsRetentionPolicyEnabled());
    this.breachAction(model.getBreachAction());
    this.retentionPeriodInDays(model.getRetentionPeriodInDays());
    this.sessionSizeLimit(model.getSessionSizeLimit());
    this.threadCountLimit(model.getThreadCountLimit());
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
     * Whether session-message retention is enabled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRetentionPolicyEnabled")
    private final Boolean isRetentionPolicyEnabled;

        /**
     * Whether session-message retention is enabled.
     * @return the value
     **/
    
    public Boolean getIsRetentionPolicyEnabled() {
        return isRetentionPolicyEnabled;
    }

    
        /**
     * Action taken when the enabled retention condition is breached.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("breachAction")
    private final RetentionBreachAction breachAction;

        /**
     * Action taken when the enabled retention condition is breached.
     * @return the value
     **/
    
    public RetentionBreachAction getBreachAction() {
        return breachAction;
    }


        /**
     * No. of days session data will be kept
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

        /**
     * No. of days session data will be kept
     * @return the value
     **/
    
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }


        /**
     * Max storage allocated to session data (in MB).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionSizeLimit")
    private final Integer sessionSizeLimit;

        /**
     * Max storage allocated to session data (in MB).
     * @return the value
     **/
    
    public Integer getSessionSizeLimit() {
        return sessionSizeLimit;
    }


        /**
     * Maximum no. of user prompt and agent response pairs per session
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("threadCountLimit")
    private final Integer threadCountLimit;

        /**
     * Maximum no. of user prompt and agent response pairs per session
     * @return the value
     **/
    
    public Integer getThreadCountLimit() {
        return threadCountLimit;
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
        sb.append("SessionRetentionConfiguration(");
        sb.append("isRetentionPolicyEnabled=").append(String.valueOf(this.isRetentionPolicyEnabled));
        sb.append(", breachAction=").append(String.valueOf(this.breachAction));
        sb.append(", retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", sessionSizeLimit=").append(String.valueOf(this.sessionSizeLimit));
        sb.append(", threadCountLimit=").append(String.valueOf(this.threadCountLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionRetentionConfiguration)) {
            return false;
        }

        SessionRetentionConfiguration other = (SessionRetentionConfiguration) o;
        return java.util.Objects.equals(this.isRetentionPolicyEnabled, other.isRetentionPolicyEnabled) &&
            java.util.Objects.equals(this.breachAction, other.breachAction) &&
            java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays) &&
            java.util.Objects.equals(this.sessionSizeLimit, other.sessionSizeLimit) &&
            java.util.Objects.equals(this.threadCountLimit, other.threadCountLimit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isRetentionPolicyEnabled == null ? 43 : this.isRetentionPolicyEnabled.hashCode());
        result = (result * PRIME) + (this.breachAction == null ? 43 : this.breachAction.hashCode());
        result = (result * PRIME) + (this.retentionPeriodInDays == null ? 43 : this.retentionPeriodInDays.hashCode());
        result = (result * PRIME) + (this.sessionSizeLimit == null ? 43 : this.sessionSizeLimit.hashCode());
        result = (result * PRIME) + (this.threadCountLimit == null ? 43 : this.threadCountLimit.hashCode());
        return result;
    }


}
