// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Paginated design-time ontology tree search result set.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphTreeSearchResultSet.Builder.class)

public final class OntologyGraphTreeSearchResultSet  {
    @Deprecated
    @java.beans.ConstructorProperties({"maxResults", "hitsPerPage", "pageIndex", "results"})
    public OntologyGraphTreeSearchResultSet(Integer maxResults, Integer hitsPerPage, Integer pageIndex, java.util.List<OntologyGraphTreeSearchNode> results) {
        super();
        this.maxResults = maxResults;
        this.hitsPerPage = hitsPerPage;
        this.pageIndex = pageIndex;
        this.results = results;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("maxResults")
private Integer maxResults;



public Builder maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("hitsPerPage")
private Integer hitsPerPage;



public Builder hitsPerPage(Integer hitsPerPage) {
    this.hitsPerPage = hitsPerPage;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("pageIndex")
private Integer pageIndex;



public Builder pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("results")
private java.util.List<OntologyGraphTreeSearchNode> results;



public Builder results(java.util.List<OntologyGraphTreeSearchNode> results) {
    this.results = results;
    return this;
}


        public OntologyGraphTreeSearchResultSet build() {
            OntologyGraphTreeSearchResultSet model = new OntologyGraphTreeSearchResultSet(this.maxResults
                , this.hitsPerPage
                , this.pageIndex
                , this.results);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphTreeSearchResultSet model) {
                this.maxResults(model.getMaxResults());
    this.hitsPerPage(model.getHitsPerPage());
    this.pageIndex(model.getPageIndex());
    this.results(model.getResults());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("maxResults")
    private final Integer maxResults;

    
    public Integer getMaxResults() {
        return maxResults;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("hitsPerPage")
    private final Integer hitsPerPage;

    
    public Integer getHitsPerPage() {
        return hitsPerPage;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("pageIndex")
    private final Integer pageIndex;

    
    public Integer getPageIndex() {
        return pageIndex;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<OntologyGraphTreeSearchNode> results;

    
    public java.util.List<OntologyGraphTreeSearchNode> getResults() {
        return results;
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
        sb.append("OntologyGraphTreeSearchResultSet(");
        sb.append("maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", hitsPerPage=").append(String.valueOf(this.hitsPerPage));
        sb.append(", pageIndex=").append(String.valueOf(this.pageIndex));
        sb.append(", results=").append(String.valueOf(this.results));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphTreeSearchResultSet)) {
            return false;
        }

        OntologyGraphTreeSearchResultSet other = (OntologyGraphTreeSearchResultSet) o;
        return java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.hitsPerPage, other.hitsPerPage) &&
            java.util.Objects.equals(this.pageIndex, other.pageIndex) &&
            java.util.Objects.equals(this.results, other.results);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.hitsPerPage == null ? 43 : this.hitsPerPage.hashCode());
        result = (result * PRIME) + (this.pageIndex == null ? 43 : this.pageIndex.hashCode());
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        return result;
    }


}
