// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectCollection.Builder.class)

public final class OntologyProjectCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "nextPage"})
    public OntologyProjectCollection(java.util.List<OntologyProject> items, String nextPage) {
        super();
        this.items = items;
        this.nextPage = nextPage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<OntologyProject> items;



public Builder items(java.util.List<OntologyProject> items) {
    this.items = items;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("nextPage")
private String nextPage;



public Builder nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
}


        public OntologyProjectCollection build() {
            OntologyProjectCollection model = new OntologyProjectCollection(this.items
                , this.nextPage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectCollection model) {
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<OntologyProject> items;

    
    public java.util.List<OntologyProject> getItems() {
        return items;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPage")
    private final String nextPage;

    
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
        sb.append("OntologyProjectCollection(");
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
        if (!(o instanceof OntologyProjectCollection)) {
            return false;
        }

        OntologyProjectCollection other = (OntologyProjectCollection) o;
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
