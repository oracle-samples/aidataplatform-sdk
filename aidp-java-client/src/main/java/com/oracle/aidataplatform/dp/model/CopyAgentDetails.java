// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details to copy the agent to target workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CopyAgentDetails.Builder.class)

public final class CopyAgentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"targetDisplayName", "targetDescription", "targetPathInfo", "targetWorkspaceKey"})
    public CopyAgentDetails(String targetDisplayName, String targetDescription, String targetPathInfo, String targetWorkspaceKey) {
        super();
        this.targetDisplayName = targetDisplayName;
        this.targetDescription = targetDescription;
        this.targetPathInfo = targetPathInfo;
        this.targetWorkspaceKey = targetWorkspaceKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Agent name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetDisplayName")
private String targetDisplayName;

        /**
         * Agent name.
         * @param targetDisplayName the value to set
         * @return this builder
         **/
        

public Builder targetDisplayName(String targetDisplayName) {
    this.targetDisplayName = targetDisplayName;
    return this;
}
            /**
     * Agent description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetDescription")
private String targetDescription;

        /**
         * Agent description.
         * @param targetDescription the value to set
         * @return this builder
         **/
        

public Builder targetDescription(String targetDescription) {
    this.targetDescription = targetDescription;
    return this;
}
            /**
     * Path inside volume where the agent JSON is written.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetPathInfo")
private String targetPathInfo;

        /**
         * Path inside volume where the agent JSON is written.
         * @param targetPathInfo the value to set
         * @return this builder
         **/
        

public Builder targetPathInfo(String targetPathInfo) {
    this.targetPathInfo = targetPathInfo;
    return this;
}
            /**
     * Key of the target workspace where the agent is copied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetWorkspaceKey")
private String targetWorkspaceKey;

        /**
         * Key of the target workspace where the agent is copied.
         * @param targetWorkspaceKey the value to set
         * @return this builder
         **/
        

public Builder targetWorkspaceKey(String targetWorkspaceKey) {
    this.targetWorkspaceKey = targetWorkspaceKey;
    return this;
}


        public CopyAgentDetails build() {
            CopyAgentDetails model = new CopyAgentDetails(this.targetDisplayName
                , this.targetDescription
                , this.targetPathInfo
                , this.targetWorkspaceKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyAgentDetails model) {
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
     * Agent name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetDisplayName")
    private final String targetDisplayName;

        /**
     * Agent name.
     * @return the value
     **/
    
    public String getTargetDisplayName() {
        return targetDisplayName;
    }


        /**
     * Agent description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetDescription")
    private final String targetDescription;

        /**
     * Agent description.
     * @return the value
     **/
    
    public String getTargetDescription() {
        return targetDescription;
    }


        /**
     * Path inside volume where the agent JSON is written.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetPathInfo")
    private final String targetPathInfo;

        /**
     * Path inside volume where the agent JSON is written.
     * @return the value
     **/
    
    public String getTargetPathInfo() {
        return targetPathInfo;
    }


        /**
     * Key of the target workspace where the agent is copied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetWorkspaceKey")
    private final String targetWorkspaceKey;

        /**
     * Key of the target workspace where the agent is copied.
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
        sb.append("CopyAgentDetails(");
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
        if (!(o instanceof CopyAgentDetails)) {
            return false;
        }

        CopyAgentDetails other = (CopyAgentDetails) o;
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
