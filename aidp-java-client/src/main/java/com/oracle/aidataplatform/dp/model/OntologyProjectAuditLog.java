// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Audit log record for an ontology project.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectAuditLog.Builder.class)

public final class OntologyProjectAuditLog  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "actorId", "details", "opcRequestId", "timeCreated"})
    public OntologyProjectAuditLog(String action, String actorId, String details, String opcRequestId, java.util.Date timeCreated) {
        super();
        this.action = action;
        this.actorId = actorId;
        this.details = details;
        this.opcRequestId = opcRequestId;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Audited action, for example CREATE, UPDATE, or DELETE.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("action")
private String action;

        /**
         * Audited action, for example CREATE, UPDATE, or DELETE.
         * @param action the value to set
         * @return this builder
         **/
        

public Builder action(String action) {
    this.action = action;
    return this;
}
            /**
     * Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("actorId")
private String actorId;

        /**
         * Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.
         * @param actorId the value to set
         * @return this builder
         **/
        

public Builder actorId(String actorId) {
    this.actorId = actorId;
    return this;
}
            /**
     * Human-readable description of the audited change.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("details")
private String details;

        /**
         * Human-readable description of the audited change.
         * @param details the value to set
         * @return this builder
         **/
        

public Builder details(String details) {
    this.details = details;
    return this;
}
            /**
     * Request id of the call that produced this record.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * Request id of the call that produced this record.
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;



public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}


        public OntologyProjectAuditLog build() {
            OntologyProjectAuditLog model = new OntologyProjectAuditLog(this.action
                , this.actorId
                , this.details
                , this.opcRequestId
                , this.timeCreated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectAuditLog model) {
                this.action(model.getAction());
    this.actorId(model.getActorId());
    this.details(model.getDetails());
    this.opcRequestId(model.getOpcRequestId());
    this.timeCreated(model.getTimeCreated());
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
     * Audited action, for example CREATE, UPDATE, or DELETE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

        /**
     * Audited action, for example CREATE, UPDATE, or DELETE.
     * @return the value
     **/
    
    public String getAction() {
        return action;
    }


        /**
     * Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("actorId")
    private final String actorId;

        /**
     * Identity of the actor that performed the action. An OCI user OCID for recent rows; older rows may carry a serialized principal instead.
     * @return the value
     **/
    
    public String getActorId() {
        return actorId;
    }


        /**
     * Human-readable description of the audited change.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

        /**
     * Human-readable description of the audited change.
     * @return the value
     **/
    
    public String getDetails() {
        return details;
    }


        /**
     * Request id of the call that produced this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * Request id of the call that produced this record.
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("OntologyProjectAuditLog(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", actorId=").append(String.valueOf(this.actorId));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectAuditLog)) {
            return false;
        }

        OntologyProjectAuditLog other = (OntologyProjectAuditLog) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.actorId, other.actorId) &&
            java.util.Objects.equals(this.details, other.details) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.actorId == null ? 43 : this.actorId.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        return result;
    }


}
