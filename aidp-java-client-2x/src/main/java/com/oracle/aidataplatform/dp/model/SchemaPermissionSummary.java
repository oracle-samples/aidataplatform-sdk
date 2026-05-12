package com.oracle.aidataplatform.dp.model;


/**
 * Information about a schema permission.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SchemaPermissionSummary.Builder.class)

public final class SchemaPermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"grantee", "granteeName", "granteeType", "granteePermissions", "isInherited", "resourceName"})
    public SchemaPermissionSummary(String grantee, String granteeName, GranteeType granteeType, java.util.List<SchemaPrivilege> granteePermissions, Boolean isInherited, String resourceName) {
        super();
        this.grantee = grantee;
        this.granteeName = granteeName;
        this.granteeType = granteeType;
        this.granteePermissions = granteePermissions;
        this.isInherited = isInherited;
        this.resourceName = resourceName;
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
     * Selected permissions for a schema.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
        private java.util.List<SchemaPrivilege> granteePermissions;

                /**
         * Selected permissions for a schema.
         * @param granteePermissions the value to set
         * @return this builder
         **/
        

        public Builder granteePermissions(java.util.List<SchemaPrivilege> granteePermissions) {
        this.granteePermissions = granteePermissions;
        return this;
        }
            /**
     * Permission listed is inherited or not from object higher up in hierarchy.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
        private Boolean isInherited;

                /**
         * Permission listed is inherited or not from object higher up in hierarchy.
         * @param isInherited the value to set
         * @return this builder
         **/
        

        public Builder isInherited(Boolean isInherited) {
        this.isInherited = isInherited;
        return this;
        }
            /**
     * Name of the object to which this permission belongs. This would be the name of schema if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

                /**
         * Name of the object to which this permission belongs. This would be the name of schema if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
         * @param resourceName the value to set
         * @return this builder
         **/
        

        public Builder resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
        }


        public SchemaPermissionSummary build() {
            SchemaPermissionSummary model = new SchemaPermissionSummary(this.grantee
                    , this.granteeName
                    , this.granteeType
                    , this.granteePermissions
                    , this.isInherited
                    , this.resourceName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaPermissionSummary model) {
                this.grantee(model.getGrantee());
    this.granteeName(model.getGranteeName());
    this.granteeType(model.getGranteeType());
    this.granteePermissions(model.getGranteePermissions());
    this.isInherited(model.getIsInherited());
    this.resourceName(model.getResourceName());
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
     * Selected permissions for a schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granteePermissions")
    private final java.util.List<SchemaPrivilege> granteePermissions;

        /**
     * Selected permissions for a schema.
     * @return the value
     **/
    
    public java.util.List<SchemaPrivilege> getGranteePermissions() {
        return granteePermissions;
    }


        /**
     * Permission listed is inherited or not from object higher up in hierarchy.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isInherited")
    private final Boolean isInherited;

        /**
     * Permission listed is inherited or not from object higher up in hierarchy.
     * @return the value
     **/
    
    public Boolean getIsInherited() {
        return isInherited;
    }


        /**
     * Name of the object to which this permission belongs. This would be the name of schema if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

        /**
     * Name of the object to which this permission belongs. This would be the name of schema if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
     * @return the value
     **/
    
    public String getResourceName() {
        return resourceName;
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
        sb.append("SchemaPermissionSummary(");
        sb.append("grantee=").append(String.valueOf(this.grantee));
        sb.append(", granteeName=").append(String.valueOf(this.granteeName));
        sb.append(", granteeType=").append(String.valueOf(this.granteeType));
        sb.append(", granteePermissions=").append(String.valueOf(this.granteePermissions));
        sb.append(", isInherited=").append(String.valueOf(this.isInherited));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaPermissionSummary)) {
            return false;
        }

        SchemaPermissionSummary other = (SchemaPermissionSummary) o;
        return java.util.Objects.equals(this.grantee, other.grantee) &&
            java.util.Objects.equals(this.granteeName, other.granteeName) &&
            java.util.Objects.equals(this.granteeType, other.granteeType) &&
            java.util.Objects.equals(this.granteePermissions, other.granteePermissions) &&
            java.util.Objects.equals(this.isInherited, other.isInherited) &&
            java.util.Objects.equals(this.resourceName, other.resourceName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.grantee == null ? 43 : this.grantee.hashCode());
        result = (result * PRIME) + (this.granteeName == null ? 43 : this.granteeName.hashCode());
        result = (result * PRIME) + (this.granteeType == null ? 43 : this.granteeType.hashCode());
        result = (result * PRIME) + (this.granteePermissions == null ? 43 : this.granteePermissions.hashCode());
        result = (result * PRIME) + (this.isInherited == null ? 43 : this.isInherited.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        return result;
    }


}
