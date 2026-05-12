package com.oracle.aidataplatform.dp.model;



/**
 * OCI logging configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OciLogging.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class OciLogging extends LoggingConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Init script paths that are run in the order of definition.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logGroups")
private java.util.List<LogGroup> logGroups;

        /**
         * Init script paths that are run in the order of definition.
         * @param logGroups the value to set
         * @return this builder
         **/
        

public Builder logGroups(java.util.List<LogGroup> logGroups) {
    this.logGroups = logGroups;
    return this;
}


        public OciLogging build() {
            OciLogging model = new OciLogging(this.logGroups);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciLogging model) {
                this.logGroups(model.getLogGroups());
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
    public OciLogging(java.util.List<LogGroup> logGroups) {
    super();
        this.logGroups = logGroups;
    }


        /**
     * Init script paths that are run in the order of definition.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logGroups")
    private final java.util.List<LogGroup> logGroups;

        /**
     * Init script paths that are run in the order of definition.
     * @return the value
     **/
    
    public java.util.List<LogGroup> getLogGroups() {
        return logGroups;
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
        sb.append("OciLogging(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", logGroups=").append(String.valueOf(this.logGroups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciLogging)) {
            return false;
        }

        OciLogging other = (OciLogging) o;
        return java.util.Objects.equals(this.logGroups, other.logGroups) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logGroups == null ? 43 : this.logGroups.hashCode());
        return result;
    }


}
