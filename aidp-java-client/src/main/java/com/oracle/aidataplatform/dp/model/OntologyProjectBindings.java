// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A page of ontology-project mapping bindings used to derive data sources.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyProjectBindings.Builder.class)

public final class OntologyProjectBindings  {
    @Deprecated
    @java.beans.ConstructorProperties({"binding", "nextPage"})
    public OntologyProjectBindings(java.util.List<Object> binding, String nextPage) {
        super();
        this.binding = binding;
        this.nextPage = nextPage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("binding")
private java.util.List<Object> binding;

        /**
         * R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.
         * @param binding the value to set
         * @return this builder
         **/
        

public Builder binding(java.util.List<Object> binding) {
    this.binding = binding;
    return this;
}
            /**
     * Opaque offset token for the next page, omitted when this is the final page.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextPage")
private String nextPage;

        /**
         * Opaque offset token for the next page, omitted when this is the final page.
         * @param nextPage the value to set
         * @return this builder
         **/
        

public Builder nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
}


        public OntologyProjectBindings build() {
            OntologyProjectBindings model = new OntologyProjectBindings(this.binding
                , this.nextPage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyProjectBindings model) {
                this.binding(model.getBinding());
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
     * R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("binding")
    private final java.util.List<Object> binding;

        /**
     * R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.
     * @return the value
     **/
    
    public java.util.List<Object> getBinding() {
        return binding;
    }


        /**
     * Opaque offset token for the next page, omitted when this is the final page.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPage")
    private final String nextPage;

        /**
     * Opaque offset token for the next page, omitted when this is the final page.
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
        sb.append("OntologyProjectBindings(");
        sb.append("binding=").append(String.valueOf(this.binding));
        sb.append(", nextPage=").append(String.valueOf(this.nextPage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyProjectBindings)) {
            return false;
        }

        OntologyProjectBindings other = (OntologyProjectBindings) o;
        return java.util.Objects.equals(this.binding, other.binding) &&
            java.util.Objects.equals(this.nextPage, other.nextPage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.binding == null ? 43 : this.binding.hashCode());
        result = (result * PRIME) + (this.nextPage == null ? 43 : this.nextPage.hashCode());
        return result;
    }


}
