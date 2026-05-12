package com.oracle.aidataplatform.dp.model;



/**
 * Results of a knowledgebase search. Contains both KnowledgeBaseSummary items and other data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseCollection.Builder.class)

public final class KnowledgeBaseCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "nextStartPage"})
    public KnowledgeBaseCollection(java.util.List<KnowledgeBaseSummary> items, String nextStartPage) {
        super();
        this.items = items;
        this.nextStartPage = nextStartPage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of knowledgeBase Summaries.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<KnowledgeBaseSummary> items;

        /**
         * List of knowledgeBase Summaries.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<KnowledgeBaseSummary> items) {
    this.items = items;
    return this;
}
            /**
     * token for next opc page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextStartPage")
private String nextStartPage;

        /**
         * token for next opc page.
         * @param nextStartPage the value to set
         * @return this builder
         **/
        

public Builder nextStartPage(String nextStartPage) {
    this.nextStartPage = nextStartPage;
    return this;
}


        public KnowledgeBaseCollection build() {
            KnowledgeBaseCollection model = new KnowledgeBaseCollection(this.items
                , this.nextStartPage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseCollection model) {
                this.items(model.getItems());
    this.nextStartPage(model.getNextStartPage());
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
     * List of knowledgeBase Summaries.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<KnowledgeBaseSummary> items;

        /**
     * List of knowledgeBase Summaries.
     * @return the value
     **/
    
    public java.util.List<KnowledgeBaseSummary> getItems() {
        return items;
    }


        /**
     * token for next opc page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextStartPage")
    private final String nextStartPage;

        /**
     * token for next opc page.
     * @return the value
     **/
    
    public String getNextStartPage() {
        return nextStartPage;
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
        sb.append("KnowledgeBaseCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", nextStartPage=").append(String.valueOf(this.nextStartPage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseCollection)) {
            return false;
        }

        KnowledgeBaseCollection other = (KnowledgeBaseCollection) o;
        return java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.nextStartPage, other.nextStartPage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.nextStartPage == null ? 43 : this.nextStartPage.hashCode());
        return result;
    }


}
