package com.oracle.aidataplatform.dp.model;



/**
 * The airflow cell ID and the URL.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AirflowCellConfig.Builder.class)

public final class AirflowCellConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"cellId", "cellUrl"})
    public AirflowCellConfig(String cellId, String cellUrl) {
        super();
        this.cellId = cellId;
        this.cellUrl = cellUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The airflow cell ID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cellId")
private String cellId;

        /**
         * The airflow cell ID.
         * @param cellId the value to set
         * @return this builder
         **/
        

public Builder cellId(String cellId) {
    this.cellId = cellId;
    return this;
}
            /**
     * The airflow cell URL.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cellUrl")
private String cellUrl;

        /**
         * The airflow cell URL.
         * @param cellUrl the value to set
         * @return this builder
         **/
        

public Builder cellUrl(String cellUrl) {
    this.cellUrl = cellUrl;
    return this;
}


        public AirflowCellConfig build() {
            AirflowCellConfig model = new AirflowCellConfig(this.cellId
                , this.cellUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AirflowCellConfig model) {
                this.cellId(model.getCellId());
    this.cellUrl(model.getCellUrl());
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
     * The airflow cell ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cellId")
    private final String cellId;

        /**
     * The airflow cell ID.
     * @return the value
     **/
    
    public String getCellId() {
        return cellId;
    }


        /**
     * The airflow cell URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cellUrl")
    private final String cellUrl;

        /**
     * The airflow cell URL.
     * @return the value
     **/
    
    public String getCellUrl() {
        return cellUrl;
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
        sb.append("AirflowCellConfig(");
        sb.append("cellId=").append(String.valueOf(this.cellId));
        sb.append(", cellUrl=").append(String.valueOf(this.cellUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AirflowCellConfig)) {
            return false;
        }

        AirflowCellConfig other = (AirflowCellConfig) o;
        return java.util.Objects.equals(this.cellId, other.cellId) &&
            java.util.Objects.equals(this.cellUrl, other.cellUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cellId == null ? 43 : this.cellId.hashCode());
        result = (result * PRIME) + (this.cellUrl == null ? 43 : this.cellUrl.hashCode());
        return result;
    }


}
