// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Workflow resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForWorkflowDetails.Builder.class)

public final class AccessGrantedForWorkflowDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"datalakeId", "workspaceId", "workflowId"})
    public AccessGrantedForWorkflowDetails(String datalakeId, String workspaceId, String workflowId) {
        super();
        this.datalakeId = datalakeId;
        this.workspaceId = workspaceId;
        this.workflowId = workflowId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy datalakeId.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("datalakeId")
private String datalakeId;

        /**
         * Lakeproxy datalakeId.
         * @param datalakeId the value to set
         * @return this builder
         **/
        

public Builder datalakeId(String datalakeId) {
    this.datalakeId = datalakeId;
    return this;
}
            /**
     * Lakeproxy workspaceId.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
private String workspaceId;

        /**
         * Lakeproxy workspaceId.
         * @param workspaceId the value to set
         * @return this builder
         **/
        

public Builder workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
}
            /**
     * Lakeproxy workflowId.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workflowId")
private String workflowId;

        /**
         * Lakeproxy workflowId.
         * @param workflowId the value to set
         * @return this builder
         **/
        

public Builder workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
}


        public AccessGrantedForWorkflowDetails build() {
            AccessGrantedForWorkflowDetails model = new AccessGrantedForWorkflowDetails(this.datalakeId
                , this.workspaceId
                , this.workflowId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForWorkflowDetails model) {
                this.datalakeId(model.getDatalakeId());
    this.workspaceId(model.getWorkspaceId());
    this.workflowId(model.getWorkflowId());
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
     * Lakeproxy datalakeId.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("datalakeId")
    private final String datalakeId;

        /**
     * Lakeproxy datalakeId.
     * @return the value
     **/
    
    public String getDatalakeId() {
        return datalakeId;
    }


        /**
     * Lakeproxy workspaceId.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

        /**
     * Lakeproxy workspaceId.
     * @return the value
     **/
    
    public String getWorkspaceId() {
        return workspaceId;
    }


        /**
     * Lakeproxy workflowId.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
    private final String workflowId;

        /**
     * Lakeproxy workflowId.
     * @return the value
     **/
    
    public String getWorkflowId() {
        return workflowId;
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
        sb.append("AccessGrantedForWorkflowDetails(");
        sb.append("datalakeId=").append(String.valueOf(this.datalakeId));
        sb.append(", workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", workflowId=").append(String.valueOf(this.workflowId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForWorkflowDetails)) {
            return false;
        }

        AccessGrantedForWorkflowDetails other = (AccessGrantedForWorkflowDetails) o;
        return java.util.Objects.equals(this.datalakeId, other.datalakeId) &&
            java.util.Objects.equals(this.workspaceId, other.workspaceId) &&
            java.util.Objects.equals(this.workflowId, other.workflowId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.datalakeId == null ? 43 : this.datalakeId.hashCode());
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.workflowId == null ? 43 : this.workflowId.hashCode());
        return result;
    }


}
