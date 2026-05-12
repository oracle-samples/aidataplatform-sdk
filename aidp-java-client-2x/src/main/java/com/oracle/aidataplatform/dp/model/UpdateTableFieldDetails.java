package com.oracle.aidataplatform.dp.model;


/**
 * Details for updating column of a table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateTableFieldDetails.Builder.class)

public final class UpdateTableFieldDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "fieldDescription"})
    public UpdateTableFieldDetails(String fieldName, String fieldDescription) {
        super();
        this.fieldName = fieldName;
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


        public UpdateTableFieldDetails build() {
            UpdateTableFieldDetails model = new UpdateTableFieldDetails(this.fieldName
                    , this.fieldDescription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTableFieldDetails model) {
                this.fieldName(model.getFieldName());
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
        sb.append("UpdateTableFieldDetails(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldDescription=").append(String.valueOf(this.fieldDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTableFieldDetails)) {
            return false;
        }

        UpdateTableFieldDetails other = (UpdateTableFieldDetails) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName) &&
            java.util.Objects.equals(this.fieldDescription, other.fieldDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldDescription == null ? 43 : this.fieldDescription.hashCode());
        return result;
    }


}
