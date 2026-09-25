// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of parsing every Turtle source file in an ontology project through Apache Jena.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectParseResult.Builder.class)

public final class OntologyProjectParseResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"isSuccessful", "status", "revision", "sizeBytes", "parsedFileCount", "sourcePaths", "diagnostics"})
    public OntologyProjectParseResult(Boolean isSuccessful, String status, String revision, Long sizeBytes, Integer parsedFileCount, java.util.List<String> sourcePaths, java.util.List<OntologyGraphPreviewDiagnostic> diagnostics) {
        super();
        this.isSuccessful = isSuccessful;
        this.status = status;
        this.revision = revision;
        this.sizeBytes = sizeBytes;
        this.parsedFileCount = parsedFileCount;
        this.sourcePaths = sourcePaths;
        this.diagnostics = diagnostics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether all project Turtle files parsed without Jena errors.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isSuccessful")
private Boolean isSuccessful;

        /**
         * Whether all project Turtle files parsed without Jena errors.
         * @param isSuccessful the value to set
         * @return this builder
         **/
        

public Builder isSuccessful(Boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
    return this;
}
            /**
     * Parse status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * Parse status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
    return this;
}
            /**
     * Project content revision hash used for the parsed dataset.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("revision")
private String revision;

        /**
         * Project content revision hash used for the parsed dataset.
         * @param revision the value to set
         * @return this builder
         **/
        

public Builder revision(String revision) {
    this.revision = revision;
    return this;
}
            /**
     * Aggregate size of parsed Turtle content in bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
private Long sizeBytes;

        /**
         * Aggregate size of parsed Turtle content in bytes.
         * @param sizeBytes the value to set
         * @return this builder
         **/
        

public Builder sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
}
            /**
     * Number of Turtle files parsed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parsedFileCount")
private Integer parsedFileCount;

        /**
         * Number of Turtle files parsed.
         * @param parsedFileCount the value to set
         * @return this builder
         **/
        

public Builder parsedFileCount(Integer parsedFileCount) {
    this.parsedFileCount = parsedFileCount;
    return this;
}
            /**
     * Project-relative Turtle source paths parsed into named graphs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourcePaths")
private java.util.List<String> sourcePaths;

        /**
         * Project-relative Turtle source paths parsed into named graphs.
         * @param sourcePaths the value to set
         * @return this builder
         **/
        

public Builder sourcePaths(java.util.List<String> sourcePaths) {
    this.sourcePaths = sourcePaths;
    return this;
}
            /**
     * Parser diagnostics returned by Apache Jena.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("diagnostics")
private java.util.List<OntologyGraphPreviewDiagnostic> diagnostics;

        /**
         * Parser diagnostics returned by Apache Jena.
         * @param diagnostics the value to set
         * @return this builder
         **/
        

public Builder diagnostics(java.util.List<OntologyGraphPreviewDiagnostic> diagnostics) {
    this.diagnostics = diagnostics;
    return this;
}


        public OntologyProjectParseResult build() {
            OntologyProjectParseResult model = new OntologyProjectParseResult(this.isSuccessful
                , this.status
                , this.revision
                , this.sizeBytes
                , this.parsedFileCount
                , this.sourcePaths
                , this.diagnostics);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectParseResult model) {
                this.isSuccessful(model.getIsSuccessful());
    this.status(model.getStatus());
    this.revision(model.getRevision());
    this.sizeBytes(model.getSizeBytes());
    this.parsedFileCount(model.getParsedFileCount());
    this.sourcePaths(model.getSourcePaths());
    this.diagnostics(model.getDiagnostics());
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
     * Whether all project Turtle files parsed without Jena errors.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isSuccessful")
    private final Boolean isSuccessful;

        /**
     * Whether all project Turtle files parsed without Jena errors.
     * @return the value
     **/
    
    public Boolean getIsSuccessful() {
        return isSuccessful;
    }


        /**
     * Parse status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * Parse status.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
    }


        /**
     * Project content revision hash used for the parsed dataset.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final String revision;

        /**
     * Project content revision hash used for the parsed dataset.
     * @return the value
     **/
    
    public String getRevision() {
        return revision;
    }


        /**
     * Aggregate size of parsed Turtle content in bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
    private final Long sizeBytes;

        /**
     * Aggregate size of parsed Turtle content in bytes.
     * @return the value
     **/
    
    public Long getSizeBytes() {
        return sizeBytes;
    }


        /**
     * Number of Turtle files parsed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parsedFileCount")
    private final Integer parsedFileCount;

        /**
     * Number of Turtle files parsed.
     * @return the value
     **/
    
    public Integer getParsedFileCount() {
        return parsedFileCount;
    }


        /**
     * Project-relative Turtle source paths parsed into named graphs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePaths")
    private final java.util.List<String> sourcePaths;

        /**
     * Project-relative Turtle source paths parsed into named graphs.
     * @return the value
     **/
    
    public java.util.List<String> getSourcePaths() {
        return sourcePaths;
    }


        /**
     * Parser diagnostics returned by Apache Jena.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("diagnostics")
    private final java.util.List<OntologyGraphPreviewDiagnostic> diagnostics;

        /**
     * Parser diagnostics returned by Apache Jena.
     * @return the value
     **/
    
    public java.util.List<OntologyGraphPreviewDiagnostic> getDiagnostics() {
        return diagnostics;
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
        sb.append("OntologyProjectParseResult(");
        sb.append("isSuccessful=").append(String.valueOf(this.isSuccessful));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(", sizeBytes=").append(String.valueOf(this.sizeBytes));
        sb.append(", parsedFileCount=").append(String.valueOf(this.parsedFileCount));
        sb.append(", sourcePaths=").append(String.valueOf(this.sourcePaths));
        sb.append(", diagnostics=").append(String.valueOf(this.diagnostics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectParseResult)) {
            return false;
        }

        OntologyProjectParseResult other = (OntologyProjectParseResult) o;
        return java.util.Objects.equals(this.isSuccessful, other.isSuccessful) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.revision, other.revision) &&
            java.util.Objects.equals(this.sizeBytes, other.sizeBytes) &&
            java.util.Objects.equals(this.parsedFileCount, other.parsedFileCount) &&
            java.util.Objects.equals(this.sourcePaths, other.sourcePaths) &&
            java.util.Objects.equals(this.diagnostics, other.diagnostics);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isSuccessful == null ? 43 : this.isSuccessful.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + (this.sizeBytes == null ? 43 : this.sizeBytes.hashCode());
        result = (result * PRIME) + (this.parsedFileCount == null ? 43 : this.parsedFileCount.hashCode());
        result = (result * PRIME) + (this.sourcePaths == null ? 43 : this.sourcePaths.hashCode());
        result = (result * PRIME) + (this.diagnostics == null ? 43 : this.diagnostics.hashCode());
        return result;
    }


}
