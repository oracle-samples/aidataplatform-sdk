// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Search API envelope for design-time ontology tree traversal.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphTreeSearchResult.Builder.class)

public final class OntologyGraphTreeSearchResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"success", "response"})
    public OntologyGraphTreeSearchResult(Boolean success, OntologyGraphTreeSearchResultSet response) {
        super();
        this.success = success;
        this.response = response;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("success")
private Boolean success;



public Builder success(Boolean success) {
    this.success = success;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("response")
private OntologyGraphTreeSearchResultSet response;



public Builder response(OntologyGraphTreeSearchResultSet response) {
    this.response = response;
    return this;
}


        public OntologyGraphTreeSearchResult build() {
            OntologyGraphTreeSearchResult model = new OntologyGraphTreeSearchResult(this.success
                , this.response);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphTreeSearchResult model) {
                this.success(model.getSuccess());
    this.response(model.getResponse());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("success")
    private final Boolean success;

    
    public Boolean getSuccess() {
        return success;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    private final OntologyGraphTreeSearchResultSet response;

    
    public OntologyGraphTreeSearchResultSet getResponse() {
        return response;
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
        sb.append("OntologyGraphTreeSearchResult(");
        sb.append("success=").append(String.valueOf(this.success));
        sb.append(", response=").append(String.valueOf(this.response));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphTreeSearchResult)) {
            return false;
        }

        OntologyGraphTreeSearchResult other = (OntologyGraphTreeSearchResult) o;
        return java.util.Objects.equals(this.success, other.success) &&
            java.util.Objects.equals(this.response, other.response);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.success == null ? 43 : this.success.hashCode());
        result = (result * PRIME) + (this.response == null ? 43 : this.response.hashCode());
        return result;
    }


}
