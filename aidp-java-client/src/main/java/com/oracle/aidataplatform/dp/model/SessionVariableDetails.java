// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Session Variable Details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionVariableDetails.Builder.class)

public final class SessionVariableDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "isRequired", "shouldLog", "isSystem", "value"})
    public SessionVariableDetails(String name, String description, Boolean isRequired, Boolean shouldLog, Boolean isSystem, String value) {
        super();
        this.name = name;
        this.description = description;
        this.isRequired = isRequired;
        this.shouldLog = shouldLog;
        this.isSystem = isSystem;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the Session Variable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the Session Variable.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of the Session Variable
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the Session Variable
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * If this Variable is required or not
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isRequired")
private Boolean isRequired;

        /**
         * If this Variable is required or not
         * @param isRequired the value to set
         * @return this builder
         **/
        

public Builder isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
}
            /**
     * If we should log this Session Variable or not
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldLog")
private Boolean shouldLog;

        /**
         * If we should log this Session Variable or not
         * @param shouldLog the value to set
         * @return this builder
         **/
        

public Builder shouldLog(Boolean shouldLog) {
    this.shouldLog = shouldLog;
    return this;
}
            /**
     * True if Session Variable is defined by System
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isSystem")
private Boolean isSystem;

        /**
         * True if Session Variable is defined by System
         * @param isSystem the value to set
         * @return this builder
         **/
        

public Builder isSystem(Boolean isSystem) {
    this.isSystem = isSystem;
    return this;
}
            /**
     * Default Value of this Session Variable
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;

        /**
         * Default Value of this Session Variable
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(String value) {
    this.value = value;
    return this;
}


        public SessionVariableDetails build() {
            SessionVariableDetails model = new SessionVariableDetails(this.name
                , this.description
                , this.isRequired
                , this.shouldLog
                , this.isSystem
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionVariableDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.isRequired(model.getIsRequired());
    this.shouldLog(model.getShouldLog());
    this.isSystem(model.getIsSystem());
    this.value(model.getValue());
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
     * Name of the Session Variable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the Session Variable.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the Session Variable
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the Session Variable
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * If this Variable is required or not
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

        /**
     * If this Variable is required or not
     * @return the value
     **/
    
    public Boolean getIsRequired() {
        return isRequired;
    }


        /**
     * If we should log this Session Variable or not
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldLog")
    private final Boolean shouldLog;

        /**
     * If we should log this Session Variable or not
     * @return the value
     **/
    
    public Boolean getShouldLog() {
        return shouldLog;
    }


        /**
     * True if Session Variable is defined by System
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

        /**
     * True if Session Variable is defined by System
     * @return the value
     **/
    
    public Boolean getIsSystem() {
        return isSystem;
    }


        /**
     * Default Value of this Session Variable
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * Default Value of this Session Variable
     * @return the value
     **/
    
    public String getValue() {
        return value;
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
        sb.append("SessionVariableDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", shouldLog=").append(String.valueOf(this.shouldLog));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionVariableDetails)) {
            return false;
        }

        SessionVariableDetails other = (SessionVariableDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.isRequired, other.isRequired) &&
            java.util.Objects.equals(this.shouldLog, other.shouldLog) &&
            java.util.Objects.equals(this.isSystem, other.isSystem) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.shouldLog == null ? 43 : this.shouldLog.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
