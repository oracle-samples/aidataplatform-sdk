// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A source-to-target column link that flows through a process node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ProcessNodeColumnLink.Builder.class)

public final class ProcessNodeColumnLink  {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceColumn", "targetColumn", "transformation"})
    public ProcessNodeColumnLink(ProcessNodeColumnDetails sourceColumn, ProcessNodeColumnDetails targetColumn, String transformation) {
        super();
        this.sourceColumn = sourceColumn;
        this.targetColumn = targetColumn;
        this.transformation = transformation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("sourceColumn")
private ProcessNodeColumnDetails sourceColumn;



public Builder sourceColumn(ProcessNodeColumnDetails sourceColumn) {
    this.sourceColumn = sourceColumn;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("targetColumn")
private ProcessNodeColumnDetails targetColumn;



public Builder targetColumn(ProcessNodeColumnDetails targetColumn) {
    this.targetColumn = targetColumn;
    return this;
}
            /**
     * Transformation type connecting the source column to the target column.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("transformation")
private String transformation;

        /**
         * Transformation type connecting the source column to the target column.
* 
         * @param transformation the value to set
         * @return this builder
         **/
        

public Builder transformation(String transformation) {
    this.transformation = transformation;
    return this;
}


        public ProcessNodeColumnLink build() {
            ProcessNodeColumnLink model = new ProcessNodeColumnLink(this.sourceColumn
                , this.targetColumn
                , this.transformation);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessNodeColumnLink model) {
                this.sourceColumn(model.getSourceColumn());
    this.targetColumn(model.getTargetColumn());
    this.transformation(model.getTransformation());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceColumn")
    private final ProcessNodeColumnDetails sourceColumn;

    
    public ProcessNodeColumnDetails getSourceColumn() {
        return sourceColumn;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("targetColumn")
    private final ProcessNodeColumnDetails targetColumn;

    
    public ProcessNodeColumnDetails getTargetColumn() {
        return targetColumn;
    }


        /**
     * Transformation type connecting the source column to the target column.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("transformation")
    private final String transformation;

        /**
     * Transformation type connecting the source column to the target column.
* 
     * @return the value
     **/
    
    public String getTransformation() {
        return transformation;
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
        sb.append("ProcessNodeColumnLink(");
        sb.append("sourceColumn=").append(String.valueOf(this.sourceColumn));
        sb.append(", targetColumn=").append(String.valueOf(this.targetColumn));
        sb.append(", transformation=").append(String.valueOf(this.transformation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessNodeColumnLink)) {
            return false;
        }

        ProcessNodeColumnLink other = (ProcessNodeColumnLink) o;
        return java.util.Objects.equals(this.sourceColumn, other.sourceColumn) &&
            java.util.Objects.equals(this.targetColumn, other.targetColumn) &&
            java.util.Objects.equals(this.transformation, other.transformation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceColumn == null ? 43 : this.sourceColumn.hashCode());
        result = (result * PRIME) + (this.targetColumn == null ? 43 : this.targetColumn.hashCode());
        result = (result * PRIME) + (this.transformation == null ? 43 : this.transformation.hashCode());
        return result;
    }


}
