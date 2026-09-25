// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Bounded graph preview streamed from an Apache Jena TDB2 dataset for a design-time ontology Turtle file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreview.Builder.class)

public final class OntologyGraphPreview  {
    @Deprecated
    @java.beans.ConstructorProperties({"file", "status", "graph", "limits", "diagnostics", "unsupportedConstructs", "nextCursor", "nextParentCursor"})
    public OntologyGraphPreview(OntologyGraphPreviewFile file, String status, OntologyGraphPreviewModel graph, OntologyGraphPreviewLimits limits, java.util.List<OntologyGraphPreviewDiagnostic> diagnostics, java.util.List<String> unsupportedConstructs, String nextCursor, String nextParentCursor) {
        super();
        this.file = file;
        this.status = status;
        this.graph = graph;
        this.limits = limits;
        this.diagnostics = diagnostics;
        this.unsupportedConstructs = unsupportedConstructs;
        this.nextCursor = nextCursor;
        this.nextParentCursor = nextParentCursor;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("file")
private OntologyGraphPreviewFile file;



public Builder file(OntologyGraphPreviewFile file) {
    this.file = file;
    return this;
}
            /**
     * Preview status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;

        /**
         * Preview status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(String status) {
    this.status = status;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("graph")
private OntologyGraphPreviewModel graph;



public Builder graph(OntologyGraphPreviewModel graph) {
    this.graph = graph;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("limits")
private OntologyGraphPreviewLimits limits;



public Builder limits(OntologyGraphPreviewLimits limits) {
    this.limits = limits;
    return this;
}
            /**
     * Parser or preview diagnostics.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("diagnostics")
private java.util.List<OntologyGraphPreviewDiagnostic> diagnostics;

        /**
         * Parser or preview diagnostics.
         * @param diagnostics the value to set
         * @return this builder
         **/
        

public Builder diagnostics(java.util.List<OntologyGraphPreviewDiagnostic> diagnostics) {
    this.diagnostics = diagnostics;
    return this;
}
            /**
     * Turtle/RDF constructs that were not fully represented in the preview.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("unsupportedConstructs")
private java.util.List<String> unsupportedConstructs;

        /**
         * Turtle/RDF constructs that were not fully represented in the preview.
         * @param unsupportedConstructs the value to set
         * @return this builder
         **/
        

public Builder unsupportedConstructs(java.util.List<String> unsupportedConstructs) {
    this.unsupportedConstructs = unsupportedConstructs;
    return this;
}
            /**
     * Cursor for fetching another graph slice.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextCursor")
private String nextCursor;

        /**
         * Cursor for fetching another graph slice.
         * @param nextCursor the value to set
         * @return this builder
         **/
        

public Builder nextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
    return this;
}
            /**
     * Cursor for fetching another root or parent node page in hierarchy mode.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextParentCursor")
private String nextParentCursor;

        /**
         * Cursor for fetching another root or parent node page in hierarchy mode.
         * @param nextParentCursor the value to set
         * @return this builder
         **/
        

public Builder nextParentCursor(String nextParentCursor) {
    this.nextParentCursor = nextParentCursor;
    return this;
}


        public OntologyGraphPreview build() {
            OntologyGraphPreview model = new OntologyGraphPreview(this.file
                , this.status
                , this.graph
                , this.limits
                , this.diagnostics
                , this.unsupportedConstructs
                , this.nextCursor
                , this.nextParentCursor);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreview model) {
                this.file(model.getFile());
    this.status(model.getStatus());
    this.graph(model.getGraph());
    this.limits(model.getLimits());
    this.diagnostics(model.getDiagnostics());
    this.unsupportedConstructs(model.getUnsupportedConstructs());
    this.nextCursor(model.getNextCursor());
    this.nextParentCursor(model.getNextParentCursor());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("file")
    private final OntologyGraphPreviewFile file;

    
    public OntologyGraphPreviewFile getFile() {
        return file;
    }


        /**
     * Preview status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

        /**
     * Preview status.
     * @return the value
     **/
    
    public String getStatus() {
        return status;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("graph")
    private final OntologyGraphPreviewModel graph;

    
    public OntologyGraphPreviewModel getGraph() {
        return graph;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    private final OntologyGraphPreviewLimits limits;

    
    public OntologyGraphPreviewLimits getLimits() {
        return limits;
    }


        /**
     * Parser or preview diagnostics.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("diagnostics")
    private final java.util.List<OntologyGraphPreviewDiagnostic> diagnostics;

        /**
     * Parser or preview diagnostics.
     * @return the value
     **/
    
    public java.util.List<OntologyGraphPreviewDiagnostic> getDiagnostics() {
        return diagnostics;
    }


        /**
     * Turtle/RDF constructs that were not fully represented in the preview.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("unsupportedConstructs")
    private final java.util.List<String> unsupportedConstructs;

        /**
     * Turtle/RDF constructs that were not fully represented in the preview.
     * @return the value
     **/
    
    public java.util.List<String> getUnsupportedConstructs() {
        return unsupportedConstructs;
    }


        /**
     * Cursor for fetching another graph slice.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextCursor")
    private final String nextCursor;

        /**
     * Cursor for fetching another graph slice.
     * @return the value
     **/
    
    public String getNextCursor() {
        return nextCursor;
    }


        /**
     * Cursor for fetching another root or parent node page in hierarchy mode.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextParentCursor")
    private final String nextParentCursor;

        /**
     * Cursor for fetching another root or parent node page in hierarchy mode.
     * @return the value
     **/
    
    public String getNextParentCursor() {
        return nextParentCursor;
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
        sb.append("OntologyGraphPreview(");
        sb.append("file=").append(String.valueOf(this.file));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", graph=").append(String.valueOf(this.graph));
        sb.append(", limits=").append(String.valueOf(this.limits));
        sb.append(", diagnostics=").append(String.valueOf(this.diagnostics));
        sb.append(", unsupportedConstructs=").append(String.valueOf(this.unsupportedConstructs));
        sb.append(", nextCursor=").append(String.valueOf(this.nextCursor));
        sb.append(", nextParentCursor=").append(String.valueOf(this.nextParentCursor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreview)) {
            return false;
        }

        OntologyGraphPreview other = (OntologyGraphPreview) o;
        return java.util.Objects.equals(this.file, other.file) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.graph, other.graph) &&
            java.util.Objects.equals(this.limits, other.limits) &&
            java.util.Objects.equals(this.diagnostics, other.diagnostics) &&
            java.util.Objects.equals(this.unsupportedConstructs, other.unsupportedConstructs) &&
            java.util.Objects.equals(this.nextCursor, other.nextCursor) &&
            java.util.Objects.equals(this.nextParentCursor, other.nextParentCursor);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.file == null ? 43 : this.file.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.graph == null ? 43 : this.graph.hashCode());
        result = (result * PRIME) + (this.limits == null ? 43 : this.limits.hashCode());
        result = (result * PRIME) + (this.diagnostics == null ? 43 : this.diagnostics.hashCode());
        result = (result * PRIME) + (this.unsupportedConstructs == null ? 43 : this.unsupportedConstructs.hashCode());
        result = (result * PRIME) + (this.nextCursor == null ? 43 : this.nextCursor.hashCode());
        result = (result * PRIME) + (this.nextParentCursor == null ? 43 : this.nextParentCursor.hashCode());
        return result;
    }


}
