// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information about a Create Workspace permission.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateWorkspacePermissionSummary.Builder.class)

public final class CreateWorkspacePermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType"})
    public CreateWorkspacePermissionSummary(String grantee, String granteeName, GranteeType granteeType) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of user/group and name in case of role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("grantee")
private String grantee;

        /**
         * The OCID of user/group and name in case of role.
         * @param grantee the value to set
         * @return this builder
         **/
        

public Builder grantee(String grantee) {
    this.grantee = grantee;
    return this;
}
            /**
     * The simplified name of the grantee.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("granteeName")
private String granteeName;

        /**
         * The simplified name of the grantee.
         * @param granteeName the value to set
         * @return this builder
         **/
        

public Builder granteeName(String granteeName) {
    this.granteeName = granteeName;
    return this;
}
            /**
     * The type of grantee.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("granteeType")
private GranteeType granteeType;

        /**
         * The type of grantee.
         * @param granteeType the value to set
         * @return this builder
         **/
        

public Builder granteeType(GranteeType granteeType) {
    this.granteeType = granteeType;
    return this;
}


        public CreateWorkspacePermissionSummary build() {
            CreateWorkspacePermissionSummary model = new CreateWorkspacePermissionSummary(this.grantee
                , this.granteeName
                , this.granteeType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWorkspacePermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
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
     * The OCID of user/group and name in case of role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("grantee")
    private final String grantee;

        /**
     * The OCID of user/group and name in case of role.
     * @return the value
     **/
    
    public String getGrantee() {
        return grantee;
    }


        /**
     * The simplified name of the grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeName")
    private final String granteeName;

        /**
     * The simplified name of the grantee.
     * @return the value
     **/
    
    public String getGranteeName() {
        return granteeName;
    }

    
        /**
     * The type of grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeType")
    private final GranteeType granteeType;

        /**
     * The type of grantee.
     * @return the value
     **/
    
    public GranteeType getGranteeType() {
        return granteeType;
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
        sb.append("CreateWorkspacePermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWorkspacePermissionSummary)) {
            return false;
        }

        CreateWorkspacePermissionSummary other = (CreateWorkspacePermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        return result;
    }


}
