// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response object for getting an experiment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentResponse.Builder.class)

public final class ExperimentResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"experiment"})
    public ExperimentResponse(Experiment experiment) {
        super();
        this.experiment = experiment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("experiment")
private Experiment experiment;



public Builder experiment(Experiment experiment) {
    this.experiment = experiment;
    return this;
}


        public ExperimentResponse build() {
            ExperimentResponse model = new ExperimentResponse(this.experiment);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentResponse model) {
                this.experiment(model.getExperiment());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("experiment")
    private final Experiment experiment;

    
    public Experiment getExperiment() {
        return experiment;
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
        sb.append("ExperimentResponse(");
        sb.append("experiment=").append(String.valueOf(this.experiment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentResponse)) {
            return false;
        }

        ExperimentResponse other = (ExperimentResponse) o;
        return java.util.Objects.equals(this.experiment, other.experiment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experiment == null ? 43 : this.experiment.hashCode());
        return result;
    }


}
