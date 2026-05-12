package com.oracle.aidataplatform.dp.model;


/**
 * Response object for restoring experiment run
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RestoreExperimentRunResponseDetails.Builder.class)

public final class RestoreExperimentRunResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    public RestoreExperimentRunResponseDetails() {
        super();
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {


        public RestoreExperimentRunResponseDetails build() {
            RestoreExperimentRunResponseDetails model = new RestoreExperimentRunResponseDetails();            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreExperimentRunResponseDetails model) {
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
        sb.append("RestoreExperimentRunResponseDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreExperimentRunResponseDetails)) {
            return false;
        }

        RestoreExperimentRunResponseDetails other = (RestoreExperimentRunResponseDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
