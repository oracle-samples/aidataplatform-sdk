// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response object for updating tags of a model deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateModelDeploymentTagsResponseDetails.Builder.class)

public final class UpdateModelDeploymentTagsResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    public UpdateModelDeploymentTagsResponseDetails() {
        super();
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    

        public UpdateModelDeploymentTagsResponseDetails build() {
            UpdateModelDeploymentTagsResponseDetails model = new UpdateModelDeploymentTagsResponseDetails();            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelDeploymentTagsResponseDetails model) {
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
        sb.append("UpdateModelDeploymentTagsResponseDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelDeploymentTagsResponseDetails)) {
            return false;
        }

        UpdateModelDeploymentTagsResponseDetails other = (UpdateModelDeploymentTagsResponseDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
