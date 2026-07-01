// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Repair task details for a specific task selection.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RepairTaskDetails.Builder.class)

public final class RepairTaskDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"taskKey", "shouldIncludeDownstream", "shouldIncludeUpstream"})
    public RepairTaskDetails(String taskKey, Boolean shouldIncludeDownstream, Boolean shouldIncludeUpstream) {
        super();
        this.taskKey = taskKey;
        this.shouldIncludeDownstream = shouldIncludeDownstream;
        this.shouldIncludeUpstream = shouldIncludeUpstream;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The display name of the task. User can specify a value for this.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("taskKey")
private String taskKey;

        /**
         * The display name of the task. User can specify a value for this.
         * @param taskKey the value to set
         * @return this builder
         **/
        

public Builder taskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
}
            /**
     * Include transitive downstream tasks for this task selection.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeDownstream")
private Boolean shouldIncludeDownstream;

        /**
         * Include transitive downstream tasks for this task selection.
         * @param shouldIncludeDownstream the value to set
         * @return this builder
         **/
        

public Builder shouldIncludeDownstream(Boolean shouldIncludeDownstream) {
    this.shouldIncludeDownstream = shouldIncludeDownstream;
    return this;
}
            /**
     * Include transitive upstream tasks for this task selection.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeUpstream")
private Boolean shouldIncludeUpstream;

        /**
         * Include transitive upstream tasks for this task selection.
         * @param shouldIncludeUpstream the value to set
         * @return this builder
         **/
        

public Builder shouldIncludeUpstream(Boolean shouldIncludeUpstream) {
    this.shouldIncludeUpstream = shouldIncludeUpstream;
    return this;
}


        public RepairTaskDetails build() {
            RepairTaskDetails model = new RepairTaskDetails(this.taskKey
                , this.shouldIncludeDownstream
                , this.shouldIncludeUpstream);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepairTaskDetails model) {
                this.taskKey(model.getTaskKey());
    this.shouldIncludeDownstream(model.getShouldIncludeDownstream());
    this.shouldIncludeUpstream(model.getShouldIncludeUpstream());
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
     * The display name of the task. User can specify a value for this.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    private final String taskKey;

        /**
     * The display name of the task. User can specify a value for this.
     * @return the value
     **/
    
    public String getTaskKey() {
        return taskKey;
    }


        /**
     * Include transitive downstream tasks for this task selection.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeDownstream")
    private final Boolean shouldIncludeDownstream;

        /**
     * Include transitive downstream tasks for this task selection.
     * @return the value
     **/
    
    public Boolean getShouldIncludeDownstream() {
        return shouldIncludeDownstream;
    }


        /**
     * Include transitive upstream tasks for this task selection.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeUpstream")
    private final Boolean shouldIncludeUpstream;

        /**
     * Include transitive upstream tasks for this task selection.
     * @return the value
     **/
    
    public Boolean getShouldIncludeUpstream() {
        return shouldIncludeUpstream;
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
        sb.append("RepairTaskDetails(");
        sb.append("taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", shouldIncludeDownstream=").append(String.valueOf(this.shouldIncludeDownstream));
        sb.append(", shouldIncludeUpstream=").append(String.valueOf(this.shouldIncludeUpstream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepairTaskDetails)) {
            return false;
        }

        RepairTaskDetails other = (RepairTaskDetails) o;
        return java.util.Objects.equals(this.taskKey, other.taskKey) &&
            java.util.Objects.equals(this.shouldIncludeDownstream, other.shouldIncludeDownstream) &&
            java.util.Objects.equals(this.shouldIncludeUpstream, other.shouldIncludeUpstream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.shouldIncludeDownstream == null ? 43 : this.shouldIncludeDownstream.hashCode());
        result = (result * PRIME) + (this.shouldIncludeUpstream == null ? 43 : this.shouldIncludeUpstream.hashCode());
        return result;
    }


}
