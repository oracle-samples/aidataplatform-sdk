package com.oracle.aidataplatform.dp.model;



/**
 * Details for renaming column of a table.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RenameTableFieldDetails.Builder.class)

public final class RenameTableFieldDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "updatedFieldName"})
    public RenameTableFieldDetails(String fieldName, String updatedFieldName) {
        super();
        this.fieldName = fieldName;
        this.updatedFieldName = updatedFieldName;
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
     * Updated name of the column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedFieldName")
private String updatedFieldName;

        /**
         * Updated name of the column.
         * @param updatedFieldName the value to set
         * @return this builder
         **/
        

public Builder updatedFieldName(String updatedFieldName) {
    this.updatedFieldName = updatedFieldName;
    return this;
}


        public RenameTableFieldDetails build() {
            RenameTableFieldDetails model = new RenameTableFieldDetails(this.fieldName
                , this.updatedFieldName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameTableFieldDetails model) {
                this.fieldName(model.getFieldName());
    this.updatedFieldName(model.getUpdatedFieldName());
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
     * Updated name of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedFieldName")
    private final String updatedFieldName;

        /**
     * Updated name of the column.
     * @return the value
     **/
    
    public String getUpdatedFieldName() {
        return updatedFieldName;
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
        sb.append("RenameTableFieldDetails(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", updatedFieldName=").append(String.valueOf(this.updatedFieldName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameTableFieldDetails)) {
            return false;
        }

        RenameTableFieldDetails other = (RenameTableFieldDetails) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName) &&
            java.util.Objects.equals(this.updatedFieldName, other.updatedFieldName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.updatedFieldName == null ? 43 : this.updatedFieldName.hashCode());
        return result;
    }


}
