// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result returned by OT SDK project.validate for an ontology project.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectValidationResult.Builder.class)

public final class OntologyProjectValidationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "valid", "findings", "errorCode", "errorMessage"})
    public OntologyProjectValidationResult(String projectId, Boolean valid, java.util.List<OntologyValidationFinding> findings, String errorCode, String errorMessage) {
        super();
        this.projectId = projectId;
        this.valid = valid;
        this.findings = findings;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Ontology Manager project identifier that was validated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;

        /**
         * Ontology Manager project identifier that was validated.
         * @param projectId the value to set
         * @return this builder
         **/
        

public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
            /**
     * Whether OT SDK validation accepted the project.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("valid")
private Boolean valid;

        /**
         * Whether OT SDK validation accepted the project.
         * @param valid the value to set
         * @return this builder
         **/
        

public Builder valid(Boolean valid) {
    this.valid = valid;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("findings")
private java.util.List<OntologyValidationFinding> findings;



public Builder findings(java.util.List<OntologyValidationFinding> findings) {
    this.findings = findings;
    return this;
}
            /**
     * OT SDK validation error code when validation fails.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorCode")
private String errorCode;

        /**
         * OT SDK validation error code when validation fails.
         * @param errorCode the value to set
         * @return this builder
         **/
        

public Builder errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
}
            /**
     * OT SDK validation error message when validation fails.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
private String errorMessage;

        /**
         * OT SDK validation error message when validation fails.
         * @param errorMessage the value to set
         * @return this builder
         **/
        

public Builder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
}


        public OntologyProjectValidationResult build() {
            OntologyProjectValidationResult model = new OntologyProjectValidationResult(this.projectId
                , this.valid
                , this.findings
                , this.errorCode
                , this.errorMessage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectValidationResult model) {
                this.projectId(model.getProjectId());
    this.valid(model.getValid());
    this.findings(model.getFindings());
    this.errorCode(model.getErrorCode());
    this.errorMessage(model.getErrorMessage());
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
     * Ontology Manager project identifier that was validated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

        /**
     * Ontology Manager project identifier that was validated.
     * @return the value
     **/
    
    public String getProjectId() {
        return projectId;
    }


        /**
     * Whether OT SDK validation accepted the project.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("valid")
    private final Boolean valid;

        /**
     * Whether OT SDK validation accepted the project.
     * @return the value
     **/
    
    public Boolean getValid() {
        return valid;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("findings")
    private final java.util.List<OntologyValidationFinding> findings;

    
    public java.util.List<OntologyValidationFinding> getFindings() {
        return findings;
    }


        /**
     * OT SDK validation error code when validation fails.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

        /**
     * OT SDK validation error code when validation fails.
     * @return the value
     **/
    
    public String getErrorCode() {
        return errorCode;
    }


        /**
     * OT SDK validation error message when validation fails.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * OT SDK validation error message when validation fails.
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
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
        sb.append("OntologyProjectValidationResult(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", valid=").append(String.valueOf(this.valid));
        sb.append(", findings=").append(String.valueOf(this.findings));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectValidationResult)) {
            return false;
        }

        OntologyProjectValidationResult other = (OntologyProjectValidationResult) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.valid, other.valid) &&
            java.util.Objects.equals(this.findings, other.findings) &&
            java.util.Objects.equals(this.errorCode, other.errorCode) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.valid == null ? 43 : this.valid.hashCode());
        result = (result * PRIME) + (this.findings == null ? 43 : this.findings.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        return result;
    }


}
