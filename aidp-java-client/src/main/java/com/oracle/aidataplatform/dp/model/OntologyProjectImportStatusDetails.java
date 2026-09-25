// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Import-specific progress details for an ontology project import status.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectImportStatusDetails.Builder.class)

public final class OntologyProjectImportStatusDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalFileCount", "parsedFileCount", "processedFileCount", "errorMessage"})
    public OntologyProjectImportStatusDetails(Integer totalFileCount, Integer parsedFileCount, Integer processedFileCount, String errorMessage) {
        super();
        this.totalFileCount = totalFileCount;
        this.parsedFileCount = parsedFileCount;
        this.processedFileCount = processedFileCount;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total number of expanded Turtle files accepted for this import.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("totalFileCount")
private Integer totalFileCount;

        /**
         * Total number of expanded Turtle files accepted for this import.
         * @param totalFileCount the value to set
         * @return this builder
         **/
        

public Builder totalFileCount(Integer totalFileCount) {
    this.totalFileCount = totalFileCount;
    return this;
}
            /**
     * Number of expanded Turtle files that have completed RDF parse processing.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parsedFileCount")
private Integer parsedFileCount;

        /**
         * Number of expanded Turtle files that have completed RDF parse processing.
         * @param parsedFileCount the value to set
         * @return this builder
         **/
        

public Builder parsedFileCount(Integer parsedFileCount) {
    this.parsedFileCount = parsedFileCount;
    return this;
}
            /**
     * Number of parsed Turtle files that have completed storage persistence.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("processedFileCount")
private Integer processedFileCount;

        /**
         * Number of parsed Turtle files that have completed storage persistence.
         * @param processedFileCount the value to set
         * @return this builder
         **/
        

public Builder processedFileCount(Integer processedFileCount) {
    this.processedFileCount = processedFileCount;
    return this;
}
            /**
     * Import failure message when the status is IMPORT_FAILED.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
private String errorMessage;

        /**
         * Import failure message when the status is IMPORT_FAILED.
         * @param errorMessage the value to set
         * @return this builder
         **/
        

public Builder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
}


        public OntologyProjectImportStatusDetails build() {
            OntologyProjectImportStatusDetails model = new OntologyProjectImportStatusDetails(this.totalFileCount
                , this.parsedFileCount
                , this.processedFileCount
                , this.errorMessage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectImportStatusDetails model) {
                this.totalFileCount(model.getTotalFileCount());
    this.parsedFileCount(model.getParsedFileCount());
    this.processedFileCount(model.getProcessedFileCount());
    this.errorMessage(model.getErrorMessage());
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
     * Total number of expanded Turtle files accepted for this import.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalFileCount")
    private final Integer totalFileCount;

        /**
     * Total number of expanded Turtle files accepted for this import.
     * @return the value
     **/
    
    public Integer getTotalFileCount() {
        return totalFileCount;
    }


        /**
     * Number of expanded Turtle files that have completed RDF parse processing.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFileCount")
    private final Integer parsedFileCount;

        /**
     * Number of expanded Turtle files that have completed RDF parse processing.
     * @return the value
     **/
    
    public Integer getParsedFileCount() {
        return parsedFileCount;
    }


        /**
     * Number of parsed Turtle files that have completed storage persistence.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("processedFileCount")
    private final Integer processedFileCount;

        /**
     * Number of parsed Turtle files that have completed storage persistence.
     * @return the value
     **/
    
    public Integer getProcessedFileCount() {
        return processedFileCount;
    }


        /**
     * Import failure message when the status is IMPORT_FAILED.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * Import failure message when the status is IMPORT_FAILED.
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
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
        sb.append("OntologyProjectImportStatusDetails(");
        sb.append("totalFileCount=").append(String.valueOf(this.totalFileCount));
        sb.append(", parsedFileCount=").append(String.valueOf(this.parsedFileCount));
        sb.append(", processedFileCount=").append(String.valueOf(this.processedFileCount));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectImportStatusDetails)) {
            return false;
        }

        OntologyProjectImportStatusDetails other = (OntologyProjectImportStatusDetails) o;
        return java.util.Objects.equals(this.totalFileCount, other.totalFileCount) &&
            java.util.Objects.equals(this.parsedFileCount, other.parsedFileCount) &&
            java.util.Objects.equals(this.processedFileCount, other.processedFileCount) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalFileCount == null ? 43 : this.totalFileCount.hashCode());
        result = (result * PRIME) + (this.parsedFileCount == null ? 43 : this.parsedFileCount.hashCode());
        result = (result * PRIME) + (this.processedFileCount == null ? 43 : this.processedFileCount.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        return result;
    }


}
