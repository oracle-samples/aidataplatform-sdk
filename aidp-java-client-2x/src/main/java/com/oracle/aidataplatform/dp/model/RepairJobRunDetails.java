// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to repair a job run.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RepairJobRunDetails.Builder.class)

public final class RepairJobRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"taskKeys", "parameters"})
    public RepairJobRunDetails(java.util.List<String> taskKeys, java.util.List<Parameter> parameters) {
        super();
        this.taskKeys = taskKeys;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The collection of selected task IDs to be repaired.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("taskKeys")
        private java.util.List<String> taskKeys;

                /**
         * The collection of selected task IDs to be repaired.
         * @param taskKeys the value to set
         * @return this builder
         **/
        

        public Builder taskKeys(java.util.List<String> taskKeys) {
        this.taskKeys = taskKeys;
        return this;
        }
            /**
     * An optional list of parameters.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

                /**
         * An optional list of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
        

        public Builder parameters(java.util.List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
        }


        public RepairJobRunDetails build() {
            RepairJobRunDetails model = new RepairJobRunDetails(this.taskKeys
                    , this.parameters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepairJobRunDetails model) {
                this.taskKeys(model.getTaskKeys());
    this.parameters(model.getParameters());
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
     * The collection of selected task IDs to be repaired.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskKeys")
    private final java.util.List<String> taskKeys;

        /**
     * The collection of selected task IDs to be repaired.
     * @return the value
     **/
    
    public java.util.List<String> getTaskKeys() {
        return taskKeys;
    }


        /**
     * An optional list of parameters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

        /**
     * An optional list of parameters.
     * @return the value
     **/
    
    public java.util.List<Parameter> getParameters() {
        return parameters;
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
        sb.append("RepairJobRunDetails(");
        sb.append("taskKeys=").append(String.valueOf(this.taskKeys));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepairJobRunDetails)) {
            return false;
        }

        RepairJobRunDetails other = (RepairJobRunDetails) o;
        return java.util.Objects.equals(this.taskKeys, other.taskKeys) &&
            java.util.Objects.equals(this.parameters, other.parameters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskKeys == null ? 43 : this.taskKeys.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }


}
