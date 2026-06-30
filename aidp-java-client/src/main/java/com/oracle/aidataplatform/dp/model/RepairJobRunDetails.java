// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to repair a job run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RepairJobRunDetails.Builder.class)

public final class RepairJobRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"taskKeys", "repairMode", "repairTasks", "parameters"})
    public RepairJobRunDetails(java.util.List<String> taskKeys, RepairMode repairMode, java.util.List<RepairTaskDetails> repairTasks, java.util.List<Parameter> parameters) {
        super();
        this.taskKeys = taskKeys;
        this.repairMode = repairMode;
        this.repairTasks = repairTasks;
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
     * Repair mode to be used for this repair scope.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repairMode")
private RepairMode repairMode;

        /**
         * Repair mode to be used for this repair scope.
         * @param repairMode the value to set
         * @return this builder
         **/
        

public Builder repairMode(RepairMode repairMode) {
    this.repairMode = repairMode;
    return this;
}
            /**
     * The collection of selected task details to be repaired.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repairTasks")
private java.util.List<RepairTaskDetails> repairTasks;

        /**
         * The collection of selected task details to be repaired.
         * @param repairTasks the value to set
         * @return this builder
         **/
        

public Builder repairTasks(java.util.List<RepairTaskDetails> repairTasks) {
    this.repairTasks = repairTasks;
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
                , this.repairMode
                , this.repairTasks
                , this.parameters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepairJobRunDetails model) {
                this.taskKeys(model.getTaskKeys());
    this.repairMode(model.getRepairMode());
    this.repairTasks(model.getRepairTasks());
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
     * Repair mode to be used for this repair scope.
     **/
    public enum RepairMode implements com.oracle.bmc.http.internal.BmcEnum {
        Resume("RESUME"),
        Rerun("RERUN"),
        ;

        

        private final String value;
        private static java.util.Map<String, RepairMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RepairMode v : RepairMode.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        RepairMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RepairMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RepairMode: " + key);
        }
    };
        /**
     * Repair mode to be used for this repair scope.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repairMode")
    private final RepairMode repairMode;

        /**
     * Repair mode to be used for this repair scope.
     * @return the value
     **/
    
    public RepairMode getRepairMode() {
        return repairMode;
    }


        /**
     * The collection of selected task details to be repaired.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repairTasks")
    private final java.util.List<RepairTaskDetails> repairTasks;

        /**
     * The collection of selected task details to be repaired.
     * @return the value
     **/
    
    public java.util.List<RepairTaskDetails> getRepairTasks() {
        return repairTasks;
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
        sb.append(", repairMode=").append(String.valueOf(this.repairMode));
        sb.append(", repairTasks=").append(String.valueOf(this.repairTasks));
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
            java.util.Objects.equals(this.repairMode, other.repairMode) &&
            java.util.Objects.equals(this.repairTasks, other.repairTasks) &&
            java.util.Objects.equals(this.parameters, other.parameters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskKeys == null ? 43 : this.taskKeys.hashCode());
        result = (result * PRIME) + (this.repairMode == null ? 43 : this.repairMode.hashCode());
        result = (result * PRIME) + (this.repairTasks == null ? 43 : this.repairTasks.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }


}
