// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details to copy the agent flow to target workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CopyAgentFlowDetails.Builder.class)

public final class CopyAgentFlowDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"targetDisplayName", "targetDescription", "targetPathInfo", "targetWorkspaceKey"})
    public CopyAgentFlowDetails(String targetDisplayName, String targetDescription, String targetPathInfo, String targetWorkspaceKey) {
        super();
        this.targetDisplayName = targetDisplayName;
        this.targetDescription = targetDescription;
        this.targetPathInfo = targetPathInfo;
        this.targetWorkspaceKey = targetWorkspaceKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * AgentFlow name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetDisplayName")
private String targetDisplayName;

        /**
         * AgentFlow name.
         * @param targetDisplayName the value to set
         * @return this builder
         **/
        

public Builder targetDisplayName(String targetDisplayName) {
    this.targetDisplayName = targetDisplayName;
    return this;
}
            /**
     * AgentFlow description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetDescription")
private String targetDescription;

        /**
         * AgentFlow description.
         * @param targetDescription the value to set
         * @return this builder
         **/
        

public Builder targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
}
            /**
     * Path inside volume where the agentFlow json is written
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetPathInfo")
private String targetPathInfo;

        /**
         * Path inside volume where the agentFlow json is written
         * @param targetPathInfo the value to set
         * @return this builder
         **/
        

public Builder targetPathInfo(String targetPathInfo) {
    this.targetPathInfo = targetPathInfo;
    return this;
}
            /**
     * Key of the target workspace where the agent flow will be copied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetWorkspaceKey")
private String targetWorkspaceKey;

        /**
         * Key of the target workspace where the agent flow will be copied.
         * @param targetWorkspaceKey the value to set
         * @return this builder
         **/
        

public Builder targetWorkspaceKey(String targetWorkspaceKey) {
    this.targetWorkspaceKey = targetWorkspaceKey;
    return this;
}


        public CopyAgentFlowDetails build() {
            CopyAgentFlowDetails model = new CopyAgentFlowDetails(this.targetDisplayName
                , this.targetDescription
                , this.targetPathInfo
                , this.targetWorkspaceKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyAgentFlowDetails model) {
                this.targetDisplayName(model.getTargetDisplayName());
    this.targetDescription(model.getTargetDescription());
    this.targetPathInfo(model.getTargetPathInfo());
    this.targetWorkspaceKey(model.getTargetWorkspaceKey());
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
     * AgentFlow name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetDisplayName")
    private final String targetDisplayName;

        /**
     * AgentFlow name.
     * @return the value
     **/
    
    public String getTargetDisplayName() {
        return targetDisplayName;
    }


        /**
     * AgentFlow description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetDescription")
    private final String targetDescription;

        /**
     * AgentFlow description.
     * @return the value
     **/
    
    public String getTargetDescription() {
        return targetDescription;
    }


        /**
     * Path inside volume where the agentFlow json is written
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetPathInfo")
    private final String targetPathInfo;

        /**
     * Path inside volume where the agentFlow json is written
     * @return the value
     **/
    
    public String getTargetPathInfo() {
        return targetPathInfo;
    }


        /**
     * Key of the target workspace where the agent flow will be copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetWorkspaceKey")
    private final String targetWorkspaceKey;

        /**
     * Key of the target workspace where the agent flow will be copied.
     * @return the value
     **/
    
    public String getTargetWorkspaceKey() {
        return targetWorkspaceKey;
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
        sb.append("CopyAgentFlowDetails(");
        sb.append("targetDisplayName=").append(String.valueOf(this.targetDisplayName));
        sb.append(", targetDescription=").append(String.valueOf(this.targetDescription));
        sb.append(", targetPathInfo=").append(String.valueOf(this.targetPathInfo));
        sb.append(", targetWorkspaceKey=").append(String.valueOf(this.targetWorkspaceKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyAgentFlowDetails)) {
            return false;
        }

        CopyAgentFlowDetails other = (CopyAgentFlowDetails) o;
        return java.util.Objects.equals(this.targetDisplayName, other.targetDisplayName) &&
            java.util.Objects.equals(this.targetDescription, other.targetDescription) &&
            java.util.Objects.equals(this.targetPathInfo, other.targetPathInfo) &&
            java.util.Objects.equals(this.targetWorkspaceKey, other.targetWorkspaceKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetDisplayName == null ? 43 : this.targetDisplayName.hashCode());
        result = (result * PRIME) + (this.targetDescription == null ? 43 : this.targetDescription.hashCode());
        result = (result * PRIME) + (this.targetPathInfo == null ? 43 : this.targetPathInfo.hashCode());
        result = (result * PRIME) + (this.targetWorkspaceKey == null ? 43 : this.targetWorkspaceKey.hashCode());
        return result;
    }


}
