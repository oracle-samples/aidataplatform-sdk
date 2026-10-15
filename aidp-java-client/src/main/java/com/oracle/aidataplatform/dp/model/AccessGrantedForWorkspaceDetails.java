// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Workspace resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForWorkspaceDetails.Builder.class)

public final class AccessGrantedForWorkspaceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"datalakeId", "workspaceId"})
    public AccessGrantedForWorkspaceDetails(String datalakeId, String workspaceId) {
        super();
        this.datalakeId = datalakeId;
        this.workspaceId = workspaceId;
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


        public AccessGrantedForWorkspaceDetails build() {
            AccessGrantedForWorkspaceDetails model = new AccessGrantedForWorkspaceDetails(this.datalakeId
                , this.workspaceId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForWorkspaceDetails model) {
                this.datalakeId(model.getDatalakeId());
    this.workspaceId(model.getWorkspaceId());
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
        sb.append("AccessGrantedForWorkspaceDetails(");
        sb.append("datalakeId=").append(String.valueOf(this.datalakeId));
        sb.append(", workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForWorkspaceDetails)) {
            return false;
        }

        AccessGrantedForWorkspaceDetails other = (AccessGrantedForWorkspaceDetails) o;
        return java.util.Objects.equals(this.datalakeId, other.datalakeId) &&
            java.util.Objects.equals(this.workspaceId, other.workspaceId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.datalakeId == null ? 43 : this.datalakeId.hashCode());
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        return result;
    }


}
