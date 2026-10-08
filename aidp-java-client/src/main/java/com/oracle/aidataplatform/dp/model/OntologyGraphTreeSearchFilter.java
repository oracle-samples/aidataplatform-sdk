// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Search filter for design-time ontology tree traversal.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphTreeSearchFilter.Builder.class)

public final class OntologyGraphTreeSearchFilter  {
    @Deprecated
    @java.beans.ConstructorProperties({"attribute", "operator", "values"})
    public OntologyGraphTreeSearchFilter(String attribute, String operator, java.util.List<String> values) {
        super();
        this.attribute = attribute;
        this.operator = operator;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("attribute")
private String attribute;

        /**
         * Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.
         * @param attribute the value to set
         * @return this builder
         **/
        

public Builder attribute(String attribute) {
    this.attribute = attribute;
    return this;
}
            /**
     * Filter operator. The current search contract supports '='.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operator")
private String operator;

        /**
         * Filter operator. The current search contract supports '='.
         * @param operator the value to set
         * @return this builder
         **/
        

public Builder operator(String operator) {
    this.operator = operator;
    return this;
}
            /**
     * Filter values. Numeric pagination values may be sent as strings.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("values")
private java.util.List<String> values;

        /**
         * Filter values. Numeric pagination values may be sent as strings.
         * @param values the value to set
         * @return this builder
         **/
        

public Builder values(java.util.List<String> values) {
    this.values = values;
    return this;
}


        public OntologyGraphTreeSearchFilter build() {
            OntologyGraphTreeSearchFilter model = new OntologyGraphTreeSearchFilter(this.attribute
                , this.operator
                , this.values);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphTreeSearchFilter model) {
                this.attribute(model.getAttribute());
    this.operator(model.getOperator());
    this.values(model.getValues());
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
     * Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("attribute")
    private final String attribute;

        /**
     * Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.
     * @return the value
     **/
    
    public String getAttribute() {
        return attribute;
    }


        /**
     * Filter operator. The current search contract supports '='.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final String operator;

        /**
     * Filter operator. The current search contract supports '='.
     * @return the value
     **/
    
    public String getOperator() {
        return operator;
    }


        /**
     * Filter values. Numeric pagination values may be sent as strings.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

        /**
     * Filter values. Numeric pagination values may be sent as strings.
     * @return the value
     **/
    
    public java.util.List<String> getValues() {
        return values;
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
        sb.append("OntologyGraphTreeSearchFilter(");
        sb.append("attribute=").append(String.valueOf(this.attribute));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphTreeSearchFilter)) {
            return false;
        }

        OntologyGraphTreeSearchFilter other = (OntologyGraphTreeSearchFilter) o;
        return java.util.Objects.equals(this.attribute, other.attribute) &&
            java.util.Objects.equals(this.operator, other.operator) &&
            java.util.Objects.equals(this.values, other.values);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attribute == null ? 43 : this.attribute.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        return result;
    }


}
