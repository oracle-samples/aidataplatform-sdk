// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Progress reported by an ontology discovery job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyDiscoveryProgress.Builder.class)

public final class OntologyDiscoveryProgress  {
    @Deprecated
    @java.beans.ConstructorProperties({"completed", "total", "currentStage"})
    public OntologyDiscoveryProgress(Integer completed, Integer total, String currentStage) {
        super();
        this.completed = completed;
        this.total = total;
        this.currentStage = currentStage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Completed work item count.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("completed")
private Integer completed;

        /**
         * Completed work item count.
         * @param completed the value to set
         * @return this builder
         **/
        

public Builder completed(Integer completed) {
    this.completed = completed;
    return this;
}
            /**
     * Total work item count.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("total")
private Integer total;

        /**
         * Total work item count.
         * @param total the value to set
         * @return this builder
         **/
        

public Builder total(Integer total) {
    this.total = total;
    return this;
}
            /**
     * Current discovery stage.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("currentStage")
private String currentStage;

        /**
         * Current discovery stage.
         * @param currentStage the value to set
         * @return this builder
         **/
        

public Builder currentStage(String currentStage) {
    this.currentStage = currentStage;
    return this;
}


        public OntologyDiscoveryProgress build() {
            OntologyDiscoveryProgress model = new OntologyDiscoveryProgress(this.completed
                , this.total
                , this.currentStage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyDiscoveryProgress model) {
                this.completed(model.getCompleted());
    this.total(model.getTotal());
    this.currentStage(model.getCurrentStage());
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
     * Completed work item count.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("completed")
    private final Integer completed;

        /**
     * Completed work item count.
     * @return the value
     **/
    
    public Integer getCompleted() {
        return completed;
    }


        /**
     * Total work item count.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

        /**
     * Total work item count.
     * @return the value
     **/
    
    public Integer getTotal() {
        return total;
    }


        /**
     * Current discovery stage.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("currentStage")
    private final String currentStage;

        /**
     * Current discovery stage.
     * @return the value
     **/
    
    public String getCurrentStage() {
        return currentStage;
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
        sb.append("OntologyDiscoveryProgress(");
        sb.append("completed=").append(String.valueOf(this.completed));
        sb.append(", total=").append(String.valueOf(this.total));
        sb.append(", currentStage=").append(String.valueOf(this.currentStage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyDiscoveryProgress)) {
            return false;
        }

        OntologyDiscoveryProgress other = (OntologyDiscoveryProgress) o;
        return java.util.Objects.equals(this.completed, other.completed) &&
            java.util.Objects.equals(this.total, other.total) &&
            java.util.Objects.equals(this.currentStage, other.currentStage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.completed == null ? 43 : this.completed.hashCode());
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + (this.currentStage == null ? 43 : this.currentStage.hashCode());
        return result;
    }


}
