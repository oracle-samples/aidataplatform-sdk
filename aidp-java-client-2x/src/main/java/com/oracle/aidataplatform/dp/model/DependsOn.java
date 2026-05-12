package com.oracle.aidataplatform.dp.model;


/**
 * Specifies the dependency graph of the task. All the tasks mentioned in this field need to be completed before executing this task.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DependsOn.Builder.class)

public final class DependsOn  {
    @Deprecated
    @java.beans.ConstructorProperties({"taskKey", "outcome"})
    public DependsOn(String taskKey, String outcome) {
        super();
        this.taskKey = taskKey;
        this.outcome = outcome;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The name of the task that it depends on.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
        private String taskKey;

                /**
         * The name of the task that it depends on.
         * @param taskKey the value to set
         * @return this builder
         **/
        

        public Builder taskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
        }
            /**
     * Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("outcome")
        private String outcome;

                /**
         * Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
         * @param outcome the value to set
         * @return this builder
         **/
        

        public Builder outcome(String outcome) {
        this.outcome = outcome;
        return this;
        }


        public DependsOn build() {
            DependsOn model = new DependsOn(this.taskKey
                    , this.outcome);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependsOn model) {
                this.taskKey(model.getTaskKey());
    this.outcome(model.getOutcome());
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
     * The name of the task that it depends on.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    private final String taskKey;

        /**
     * The name of the task that it depends on.
     * @return the value
     **/
    
    public String getTaskKey() {
        return taskKey;
    }


        /**
     * Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    private final String outcome;

        /**
     * Specified on condition task dependencies. The outcome of the dependent task should be met for this task to be executed.
     * @return the value
     **/
    
    public String getOutcome() {
        return outcome;
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
        sb.append("DependsOn(");
        sb.append("taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", outcome=").append(String.valueOf(this.outcome));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DependsOn)) {
            return false;
        }

        DependsOn other = (DependsOn) o;
        return java.util.Objects.equals(this.taskKey, other.taskKey) &&
            java.util.Objects.equals(this.outcome, other.outcome);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.outcome == null ? 43 : this.outcome.hashCode());
        return result;
    }


}
