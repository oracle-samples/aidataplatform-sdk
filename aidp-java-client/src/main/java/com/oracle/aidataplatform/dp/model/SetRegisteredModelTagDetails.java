package com.oracle.aidataplatform.dp.model;



/**
 * Details of the RegisteredModel tag.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SetRegisteredModelTagDetails.Builder.class)

public final class SetRegisteredModelTagDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "key", "value"})
    public SetRegisteredModelTagDetails(String name, String key, String value) {
        super();
        this.name = name;
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the registered model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the registered model.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Tag key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Tag key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Tag value.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;

        /**
         * Tag value.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(String value) {
    this.value = value;
    return this;
}


        public SetRegisteredModelTagDetails build() {
            SetRegisteredModelTagDetails model = new SetRegisteredModelTagDetails(this.name
                , this.key
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetRegisteredModelTagDetails model) {
                this.name(model.getName());
    this.key(model.getKey());
    this.value(model.getValue());
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
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Tag key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Tag key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Tag value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * Tag value.
     * @return the value
     **/
    
    public String getValue() {
        return value;
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
        sb.append("SetRegisteredModelTagDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetRegisteredModelTagDetails)) {
            return false;
        }

        SetRegisteredModelTagDetails other = (SetRegisteredModelTagDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
