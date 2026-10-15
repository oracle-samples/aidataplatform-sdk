// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The log event's message, subject to redaction and size limits.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogMessage.Builder.class)

public final class DeploymentLogMessage  {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "text", "isTruncated"})
    public DeploymentLogMessage(State state, String text, Boolean isTruncated) {
        super();
        this.state = state;
        this.text = text;
        this.isTruncated = isTruncated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether the message text is available. Text is only present for AVAILABLE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

        /**
         * Whether the message text is available. Text is only present for AVAILABLE.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("text")
private String text;

        /**
         * Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.
         * @param text the value to set
         * @return this builder
         **/
        

public Builder text(String text) {
    this.text = text;
    return this;
}
            /**
     * Whether the text was truncated to the size limit.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
private Boolean isTruncated;

        /**
         * Whether the text was truncated to the size limit.
         * @param isTruncated the value to set
         * @return this builder
         **/
        

public Builder isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
}


        public DeploymentLogMessage build() {
            DeploymentLogMessage model = new DeploymentLogMessage(this.state
                , this.text
                , this.isTruncated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogMessage model) {
                this.state(model.getState());
    this.text(model.getText());
    this.isTruncated(model.getIsTruncated());
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
     * Whether the message text is available. Text is only present for AVAILABLE.
     **/
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Redacted("REDACTED"),
        NotAuthorized("NOT_AUTHORIZED"),
        Unknown("UNKNOWN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'State', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Whether the message text is available. Text is only present for AVAILABLE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * Whether the message text is available. Text is only present for AVAILABLE.
     * @return the value
     **/
    
    public State getState() {
        return state;
    }


        /**
     * Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

        /**
     * Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.
     * @return the value
     **/
    
    public String getText() {
        return text;
    }


        /**
     * Whether the text was truncated to the size limit.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
    private final Boolean isTruncated;

        /**
     * Whether the text was truncated to the size limit.
     * @return the value
     **/
    
    public Boolean getIsTruncated() {
        return isTruncated;
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
        sb.append("DeploymentLogMessage(");
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", isTruncated=").append(String.valueOf(this.isTruncated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogMessage)) {
            return false;
        }

        DeploymentLogMessage other = (DeploymentLogMessage) o;
        return java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.text, other.text) &&
            java.util.Objects.equals(this.isTruncated, other.isTruncated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.isTruncated == null ? 43 : this.isTruncated.hashCode());
        return result;
    }


}
