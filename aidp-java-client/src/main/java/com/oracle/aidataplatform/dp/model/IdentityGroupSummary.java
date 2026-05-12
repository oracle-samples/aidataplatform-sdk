package com.oracle.aidataplatform.dp.model;



/**
 * A group in the tenancy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IdentityGroupSummary.Builder.class)

public final class IdentityGroupSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"groupId", "groupName"})
    public IdentityGroupSummary(String groupId, String groupName) {
        super();
        this.groupId = groupId;
        this.groupName = groupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The ID of the group.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("groupId")
private String groupId;

        /**
         * The ID of the group.
         * @param groupId the value to set
         * @return this builder
         **/
        

public Builder groupId(String groupId) {
    this.groupId = groupId;
    return this;
}
            /**
     * The name of the group.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("groupName")
private String groupName;

        /**
         * The name of the group.
         * @param groupName the value to set
         * @return this builder
         **/
        

public Builder groupName(String groupName) {
    this.groupName = groupName;
    return this;
}


        public IdentityGroupSummary build() {
            IdentityGroupSummary model = new IdentityGroupSummary(this.groupId
                , this.groupName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityGroupSummary model) {
                this.groupId(model.getGroupId());
    this.groupName(model.getGroupName());
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
     * The ID of the group.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

        /**
     * The ID of the group.
     * @return the value
     **/
    
    public String getGroupId() {
        return groupId;
    }


        /**
     * The name of the group.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

        /**
     * The name of the group.
     * @return the value
     **/
    
    public String getGroupName() {
        return groupName;
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
        sb.append("IdentityGroupSummary(");
        sb.append("groupId=").append(String.valueOf(this.groupId));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityGroupSummary)) {
            return false;
        }

        IdentityGroupSummary other = (IdentityGroupSummary) o;
        return java.util.Objects.equals(this.groupId, other.groupId) &&
            java.util.Objects.equals(this.groupName, other.groupName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        return result;
    }


}
