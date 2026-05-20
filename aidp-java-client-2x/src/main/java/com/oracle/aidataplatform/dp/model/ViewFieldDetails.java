// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Columns for view.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ViewFieldDetails.Builder.class)

public final class ViewFieldDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "fieldType", "fieldPrecision", "fieldScale", "fieldDescription"})
    public ViewFieldDetails(String fieldName, String fieldType, String fieldPrecision, String fieldScale, String fieldDescription) {
        super();
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.fieldPrecision = fieldPrecision;
        this.fieldScale = fieldScale;
        this.fieldDescription = fieldDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the column.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

                /**
         * Name of the column.
         * @param fieldName the value to set
         * @return this builder
         **/
        

        public Builder fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
        }
            /**
     * Type of the column.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private String fieldType;

                /**
         * Type of the column.
         * @param fieldType the value to set
         * @return this builder
         **/
        

        public Builder fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
        }
            /**
     * Precision of the column.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fieldPrecision")
        private String fieldPrecision;

                /**
         * Precision of the column.
         * @param fieldPrecision the value to set
         * @return this builder
         **/
        

        public Builder fieldPrecision(String fieldPrecision) {
        this.fieldPrecision = fieldPrecision;
        return this;
        }
            /**
     * Scale of the column.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fieldScale")
        private String fieldScale;

                /**
         * Scale of the column.
         * @param fieldScale the value to set
         * @return this builder
         **/
        

        public Builder fieldScale(String fieldScale) {
        this.fieldScale = fieldScale;
        return this;
        }
            /**
     * Description of the column.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fieldDescription")
        private String fieldDescription;

                /**
         * Description of the column.
         * @param fieldDescription the value to set
         * @return this builder
         **/
        

        public Builder fieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
        }


        public ViewFieldDetails build() {
            ViewFieldDetails model = new ViewFieldDetails(this.fieldName
                    , this.fieldType
                    , this.fieldPrecision
                    , this.fieldScale
                    , this.fieldDescription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ViewFieldDetails model) {
                this.fieldName(model.getFieldName());
    this.fieldType(model.getFieldType());
    this.fieldPrecision(model.getFieldPrecision());
    this.fieldScale(model.getFieldScale());
    this.fieldDescription(model.getFieldDescription());
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
     * Name of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

        /**
     * Name of the column.
     * @return the value
     **/
    
    public String getFieldName() {
        return fieldName;
    }


        /**
     * Type of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final String fieldType;

        /**
     * Type of the column.
     * @return the value
     **/
    
    public String getFieldType() {
        return fieldType;
    }


        /**
     * Precision of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldPrecision")
    private final String fieldPrecision;

        /**
     * Precision of the column.
     * @return the value
     **/
    
    public String getFieldPrecision() {
        return fieldPrecision;
    }


        /**
     * Scale of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldScale")
    private final String fieldScale;

        /**
     * Scale of the column.
     * @return the value
     **/
    
    public String getFieldScale() {
        return fieldScale;
    }


        /**
     * Description of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldDescription")
    private final String fieldDescription;

        /**
     * Description of the column.
     * @return the value
     **/
    
    public String getFieldDescription() {
        return fieldDescription;
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
        sb.append("ViewFieldDetails(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldType=").append(String.valueOf(this.fieldType));
        sb.append(", fieldPrecision=").append(String.valueOf(this.fieldPrecision));
        sb.append(", fieldScale=").append(String.valueOf(this.fieldScale));
        sb.append(", fieldDescription=").append(String.valueOf(this.fieldDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewFieldDetails)) {
            return false;
        }

        ViewFieldDetails other = (ViewFieldDetails) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName) &&
            java.util.Objects.equals(this.fieldType, other.fieldType) &&
            java.util.Objects.equals(this.fieldPrecision, other.fieldPrecision) &&
            java.util.Objects.equals(this.fieldScale, other.fieldScale) &&
            java.util.Objects.equals(this.fieldDescription, other.fieldDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + (this.fieldPrecision == null ? 43 : this.fieldPrecision.hashCode());
        result = (result * PRIME) + (this.fieldScale == null ? 43 : this.fieldScale.hashCode());
        result = (result * PRIME) + (this.fieldDescription == null ? 43 : this.fieldDescription.hashCode());
        return result;
    }


}
