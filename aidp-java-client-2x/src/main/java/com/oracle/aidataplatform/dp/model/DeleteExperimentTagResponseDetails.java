package com.oracle.aidataplatform.dp.model;


/**
 * Response object for deleting tag on an experiment
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeleteExperimentTagResponseDetails.Builder.class)

public final class DeleteExperimentTagResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    public DeleteExperimentTagResponseDetails() {
        super();
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {


        public DeleteExperimentTagResponseDetails build() {
            DeleteExperimentTagResponseDetails model = new DeleteExperimentTagResponseDetails();            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteExperimentTagResponseDetails model) {
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
        sb.append("DeleteExperimentTagResponseDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteExperimentTagResponseDetails)) {
            return false;
        }

        DeleteExperimentTagResponseDetails other = (DeleteExperimentTagResponseDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
