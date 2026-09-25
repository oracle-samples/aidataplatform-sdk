// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Parser or preview diagnostic.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewDiagnostic.Builder.class)

public final class OntologyGraphPreviewDiagnostic  {
    @Deprecated
    @java.beans.ConstructorProperties({"severity", "message", "line", "column"})
    public OntologyGraphPreviewDiagnostic(String severity, String message, Long line, Long column) {
        super();
        this.severity = severity;
        this.message = message;
        this.line = line;
        this.column = column;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("severity")
private String severity;



public Builder severity(String severity) {
    this.severity = severity;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;



public Builder message(String message) {
    this.message = message;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("line")
private Long line;



public Builder line(Long line) {
    this.line = line;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("column")
private Long column;



public Builder column(Long column) {
    this.column = column;
    return this;
}


        public OntologyGraphPreviewDiagnostic build() {
            OntologyGraphPreviewDiagnostic model = new OntologyGraphPreviewDiagnostic(this.severity
                , this.message
                , this.line
                , this.column);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewDiagnostic model) {
                this.severity(model.getSeverity());
    this.message(model.getMessage());
    this.line(model.getLine());
    this.column(model.getColumn());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final String severity;

    
    public String getSeverity() {
        return severity;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    
    public String getMessage() {
        return message;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("line")
    private final Long line;

    
    public Long getLine() {
        return line;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("column")
    private final Long column;

    
    public Long getColumn() {
        return column;
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
        sb.append("OntologyGraphPreviewDiagnostic(");
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", line=").append(String.valueOf(this.line));
        sb.append(", column=").append(String.valueOf(this.column));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewDiagnostic)) {
            return false;
        }

        OntologyGraphPreviewDiagnostic other = (OntologyGraphPreviewDiagnostic) o;
        return java.util.Objects.equals(this.severity, other.severity) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.line, other.line) &&
            java.util.Objects.equals(this.column, other.column);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.line == null ? 43 : this.line.hashCode());
        result = (result * PRIME) + (this.column == null ? 43 : this.column.hashCode());
        return result;
    }


}
