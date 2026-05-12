package com.oracle.aidataplatform.dp.model;


/**
 * The details of the permissions assigned on the workspace to assignee.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AssignCreateWorkspacePermissionDetails.Builder.class)

public final class AssignCreateWorkspacePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees"})
    public AssignCreateWorkspacePermissionDetails(PermissionAssignees assignees) {
        super();
        this.assignees = assignees;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignees")
        private PermissionAssignees assignees;

        

        public Builder assignees(PermissionAssignees assignees) {
        this.assignees = assignees;
        return this;
        }


        public AssignCreateWorkspacePermissionDetails build() {
            AssignCreateWorkspacePermissionDetails model = new AssignCreateWorkspacePermissionDetails(this.assignees);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignCreateWorkspacePermissionDetails model) {
                this.assignees(model.getAssignees());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignees")
    private final PermissionAssignees assignees;

    
    public PermissionAssignees getAssignees() {
        return assignees;
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
        sb.append("AssignCreateWorkspacePermissionDetails(");
        sb.append("assignees=").append(String.valueOf(this.assignees));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignCreateWorkspacePermissionDetails)) {
            return false;
        }

        AssignCreateWorkspacePermissionDetails other = (AssignCreateWorkspacePermissionDetails) o;
        return java.util.Objects.equals(this.assignees, other.assignees);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignees == null ? 43 : this.assignees.hashCode());
        return result;
    }


}
