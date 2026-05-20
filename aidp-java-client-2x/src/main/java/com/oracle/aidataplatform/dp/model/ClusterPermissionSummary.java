// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information about a cluster permission.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterPermissionSummary.Builder.class)

public final class ClusterPermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions"})
    public ClusterPermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<ClusterPrivilege> granteePermissions) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * OCID of user/group and name in case of role.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("grantee")
        private String grantee;

                /**
         * OCID of user/group and name in case of role.
         * @param grantee the value to set
         * @return this builder
         **/
        

        public Builder grantee(String grantee) {
        this.grantee = grantee;
        return this;
        }
            /**
     * Simplified name of the grantee.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteeName")
        private String granteeName;

                /**
         * Simplified name of the grantee.
         * @param granteeName the value to set
         * @return this builder
         **/
        

        public Builder granteeName(String granteeName) {
        this.granteeName = granteeName;
        return this;
        }
            /**
     * Type of grantee.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteeType")
        private GranteeType granteeType;

                /**
         * Type of grantee.
         * @param granteeType the value to set
         * @return this builder
         **/
        

        public Builder granteeType(GranteeType granteeType) {
        this.granteeType = granteeType;
        return this;
        }
            /**
     * Selected permissions for a cluster.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
        private java.util.List<ClusterPrivilege> granteePermissions;

                /**
         * Selected permissions for a cluster.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

        public Builder granteePermissions(java.util.List<ClusterPrivilege> granteePermissions) {
        this.granteePermissions = granteePermissions;
        return this;
        }


        public ClusterPermissionSummary build() {
            ClusterPermissionSummary model = new ClusterPermissionSummary(this.grantee
                    , this.granteeName
                    , this.granteeType
                    , this.granteePermissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterPermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
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
     * OCID of user/group and name in case of role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("grantee")
    private final String grantee;

        /**
     * OCID of user/group and name in case of role.
     * @return the value
     **/
    
    public String getGrantee() {
        return grantee;
    }


        /**
     * Simplified name of the grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeName")
    private final String granteeName;

        /**
     * Simplified name of the grantee.
     * @return the value
     **/
    
    public String getGranteeName() {
        return granteeName;
    }

    
        /**
     * Type of grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteeType")
    private final GranteeType granteeType;

        /**
     * Type of grantee.
     * @return the value
     **/
    
    public GranteeType getGranteeType() {
        return granteeType;
    }

    
        /**
     * Selected permissions for a cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<ClusterPrivilege> granteePermissions;

        /**
     * Selected permissions for a cluster.
     * @return the value
     **/
    
    public java.util.List<ClusterPrivilege> getGranteePermissions() {
        return granteePermissions;
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
        sb.append("ClusterPermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterPermissionSummary)) {
            return false;
        }

        ClusterPermissionSummary other = (ClusterPermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        result = (result * PRIME) + (this.granteePermissions == null ? 43 : this.granteePermissions.hashCode());
        return result;
    }


}
