// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result produced by a single rule during ontology validation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyValidationFinding.Builder.class)

public final class OntologyValidationFinding  {
    @Deprecated
    @java.beans.ConstructorProperties({"ruleId", "status", "severity", "message"})
    public OntologyValidationFinding(String ruleId, String status, String severity, String message) {
        super();
        this.ruleId = ruleId;
        this.status = status;
        this.severity = severity;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Stable identifier of the validation rule that produced this finding.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ruleId")
private String ruleId;

        /**
         * Stable identifier of the validation rule that produced this finding.
         * @param ruleId the value to set
         * @return this builder
         **/
        

public Builder ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
}
            /**
     * Outcome reported by the validation rule.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * Outcome reported by the validation rule.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
    return this;
}
            /**
     * Importance level assigned to the validation finding.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("severity")
private String severity;

        /**
         * Importance level assigned to the validation finding.
         * @param severity the value to set
         * @return this builder
         **/
        

public Builder severity(String severity) {
    this.severity = severity;
    return this;
}
            /**
     * Human-readable explanation of the validation finding.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Human-readable explanation of the validation finding.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}


        public OntologyValidationFinding build() {
            OntologyValidationFinding model = new OntologyValidationFinding(this.ruleId
                , this.status
                , this.severity
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyValidationFinding model) {
                this.ruleId(model.getRuleId());
    this.status(model.getStatus());
    this.severity(model.getSeverity());
    this.message(model.getMessage());
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
     * Stable identifier of the validation rule that produced this finding.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    private final String ruleId;

        /**
     * Stable identifier of the validation rule that produced this finding.
     * @return the value
     **/
    
    public String getRuleId() {
        return ruleId;
    }


        /**
     * Outcome reported by the validation rule.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * Outcome reported by the validation rule.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
    }


        /**
     * Importance level assigned to the validation finding.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final String severity;

        /**
     * Importance level assigned to the validation finding.
     * @return the value
     **/
    
    public String getSeverity() {
        return severity;
    }


        /**
     * Human-readable explanation of the validation finding.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Human-readable explanation of the validation finding.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
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
        sb.append("OntologyValidationFinding(");
        sb.append("ruleId=").append(String.valueOf(this.ruleId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyValidationFinding)) {
            return false;
        }

        OntologyValidationFinding other = (OntologyValidationFinding) o;
        return java.util.Objects.equals(this.ruleId, other.ruleId) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.severity, other.severity) &&
            java.util.Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ruleId == null ? 43 : this.ruleId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
