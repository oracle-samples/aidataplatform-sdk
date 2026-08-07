// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Optional filter criteria for process node column links.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ProcessNodeColumnLinksFilter.Builder.class)

public final class ProcessNodeColumnLinksFilter  {
    @Deprecated
    @java.beans.ConstructorProperties({"processRunStageId", "transformation", "displayNameContains"})
    public ProcessNodeColumnLinksFilter(String processRunStageId, String transformation, String displayNameContains) {
        super();
        this.processRunStageId = processRunStageId;
        this.transformation = transformation;
        this.displayNameContains = displayNameContains;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Filters only the links for a particular stage in a multi-stage process.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("processRunStageId")
private String processRunStageId;

        /**
         * Filters only the links for a particular stage in a multi-stage process.
* 
         * @param processRunStageId the value to set
         * @return this builder
         **/
        

public Builder processRunStageId(String processRunStageId) {
    this.processRunStageId = processRunStageId;
    return this;
}
            /**
     * Limits the returned column links to those whose transformation exactly matches the
* supplied value.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("transformation")
private String transformation;

        /**
         * Limits the returned column links to those whose transformation exactly matches the
* supplied value.
* 
         * @param transformation the value to set
         * @return this builder
         **/
        

public Builder transformation(String transformation) {
    this.transformation = transformation;
    return this;
}
            /**
     * Limits the returned column links to those where either the source or target column
* display name contains the supplied value, or where the parent artifact segment in the
* source or target column path contains the supplied value.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayNameContains")
private String displayNameContains;

        /**
         * Limits the returned column links to those where either the source or target column
* display name contains the supplied value, or where the parent artifact segment in the
* source or target column path contains the supplied value.
* 
         * @param displayNameContains the value to set
         * @return this builder
         **/
        

public Builder displayNameContains(String displayNameContains) {
    this.displayNameContains = displayNameContains;
    return this;
}


        public ProcessNodeColumnLinksFilter build() {
            ProcessNodeColumnLinksFilter model = new ProcessNodeColumnLinksFilter(this.processRunStageId
                , this.transformation
                , this.displayNameContains);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessNodeColumnLinksFilter model) {
                this.processRunStageId(model.getProcessRunStageId());
    this.transformation(model.getTransformation());
    this.displayNameContains(model.getDisplayNameContains());
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
     * Filters only the links for a particular stage in a multi-stage process.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("processRunStageId")
    private final String processRunStageId;

        /**
     * Filters only the links for a particular stage in a multi-stage process.
* 
     * @return the value
     **/
    
    public String getProcessRunStageId() {
        return processRunStageId;
    }


        /**
     * Limits the returned column links to those whose transformation exactly matches the
* supplied value.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("transformation")
    private final String transformation;

        /**
     * Limits the returned column links to those whose transformation exactly matches the
* supplied value.
* 
     * @return the value
     **/
    
    public String getTransformation() {
        return transformation;
    }


        /**
     * Limits the returned column links to those where either the source or target column
* display name contains the supplied value, or where the parent artifact segment in the
* source or target column path contains the supplied value.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayNameContains")
    private final String displayNameContains;

        /**
     * Limits the returned column links to those where either the source or target column
* display name contains the supplied value, or where the parent artifact segment in the
* source or target column path contains the supplied value.
* 
     * @return the value
     **/
    
    public String getDisplayNameContains() {
        return displayNameContains;
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
        sb.append("ProcessNodeColumnLinksFilter(");
        sb.append("processRunStageId=").append(String.valueOf(this.processRunStageId));
        sb.append(", transformation=").append(String.valueOf(this.transformation));
        sb.append(", displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessNodeColumnLinksFilter)) {
            return false;
        }

        ProcessNodeColumnLinksFilter other = (ProcessNodeColumnLinksFilter) o;
        return java.util.Objects.equals(this.processRunStageId, other.processRunStageId) &&
            java.util.Objects.equals(this.transformation, other.transformation) &&
            java.util.Objects.equals(this.displayNameContains, other.displayNameContains);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.processRunStageId == null ? 43 : this.processRunStageId.hashCode());
        result = (result * PRIME) + (this.transformation == null ? 43 : this.transformation.hashCode());
        result = (result * PRIME) + (this.displayNameContains == null ? 43 : this.displayNameContains.hashCode());
        return result;
    }


}
