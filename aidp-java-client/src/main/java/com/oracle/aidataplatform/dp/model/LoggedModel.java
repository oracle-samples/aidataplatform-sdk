package com.oracle.aidataplatform.dp.model;



/**
 * Details of the LoggedModel.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LoggedModel.Builder.class)

public final class LoggedModel  {
    @Deprecated
    @java.beans.ConstructorProperties({"info", "data"})
    public LoggedModel(LoggedModelInfo info, Object data) {
        super();
        this.info = info;
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("info")
private LoggedModelInfo info;



public Builder info(LoggedModelInfo info) {
    this.info = info;
    return this;
}
            /**
     * Details of the LoggedModel data.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("data")
private Object data;

        /**
         * Details of the LoggedModel data.
         * @param data the value to set
         * @return this builder
         **/
        

public Builder data(Object data) {
    this.data = data;
    return this;
}


        public LoggedModel build() {
            LoggedModel model = new LoggedModel(this.info
                , this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggedModel model) {
                this.info(model.getInfo());
    this.data(model.getData());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("info")
    private final LoggedModelInfo info;

    
    public LoggedModelInfo getInfo() {
        return info;
    }


        /**
     * Details of the LoggedModel data.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final Object data;

        /**
     * Details of the LoggedModel data.
     * @return the value
     **/
    
    public Object getData() {
        return data;
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
        sb.append("LoggedModel(");
        sb.append("info=").append(String.valueOf(this.info));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggedModel)) {
            return false;
        }

        LoggedModel other = (LoggedModel) o;
        return java.util.Objects.equals(this.info, other.info) &&
            java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.info == null ? 43 : this.info.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
