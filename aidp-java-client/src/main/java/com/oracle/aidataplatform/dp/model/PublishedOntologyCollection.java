// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Collection of published Ontology Manager project summaries.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PublishedOntologyCollection.Builder.class)

public final class PublishedOntologyCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "nextPage"})
    public PublishedOntologyCollection(java.util.List<PublishedOntology> items, String nextPage) {
        super();
        this.items = items;
        this.nextPage = nextPage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Published ontology projects in the current page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<PublishedOntology> items;

        /**
         * Published ontology projects in the current page.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<PublishedOntology> items) {
    this.items = items;
    return this;
}
            /**
     * Token for fetching the next page of published ontology projects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextPage")
private String nextPage;

        /**
         * Token for fetching the next page of published ontology projects.
         * @param nextPage the value to set
         * @return this builder
         **/
        

public Builder nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
}


        public PublishedOntologyCollection build() {
            PublishedOntologyCollection model = new PublishedOntologyCollection(this.items
                , this.nextPage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishedOntologyCollection model) {
                this.items(model.getItems());
    this.nextPage(model.getNextPage());
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
     * Published ontology projects in the current page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PublishedOntology> items;

        /**
     * Published ontology projects in the current page.
     * @return the value
     **/
    
    public java.util.List<PublishedOntology> getItems() {
        return items;
    }


        /**
     * Token for fetching the next page of published ontology projects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPage")
    private final String nextPage;

        /**
     * Token for fetching the next page of published ontology projects.
     * @return the value
     **/
    
    public String getNextPage() {
        return nextPage;
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
        sb.append("PublishedOntologyCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", nextPage=").append(String.valueOf(this.nextPage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishedOntologyCollection)) {
            return false;
        }

        PublishedOntologyCollection other = (PublishedOntologyCollection) o;
        return java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.nextPage, other.nextPage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.nextPage == null ? 43 : this.nextPage.hashCode());
        return result;
    }


}
