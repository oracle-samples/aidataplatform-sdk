package com.oracle.aidataplatform.dp.model;


/**
 * Details of created run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateExperimentRunResponseDetails.Builder.class)

public final class CreateExperimentRunResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"run"})
    public CreateExperimentRunResponseDetails(ExperimentRun run) {
        super();
        this.run = run;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("run")
        private ExperimentRun run;

        

        public Builder run(ExperimentRun run) {
        this.run = run;
        return this;
        }


        public CreateExperimentRunResponseDetails build() {
            CreateExperimentRunResponseDetails model = new CreateExperimentRunResponseDetails(this.run);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExperimentRunResponseDetails model) {
                this.run(model.getRun());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("run")
    private final ExperimentRun run;

    
    public ExperimentRun getRun() {
        return run;
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
        sb.append("CreateExperimentRunResponseDetails(");
        sb.append("run=").append(String.valueOf(this.run));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExperimentRunResponseDetails)) {
            return false;
        }

        CreateExperimentRunResponseDetails other = (CreateExperimentRunResponseDetails) o;
        return java.util.Objects.equals(this.run, other.run);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.run == null ? 43 : this.run.hashCode());
        return result;
    }


}
