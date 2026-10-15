// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Mask expressions returned by Lakeproxy, preserved verbatim.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForMaskInfo.Builder.class)

public final class AccessGrantedForMaskInfo  {
    @Deprecated
    @java.beans.ConstructorProperties({"maskType", "maskCondition", "maskedValue"})
    public AccessGrantedForMaskInfo(String maskType, String maskCondition, String maskedValue) {
        super();
        this.maskType = maskType;
        this.maskCondition = maskCondition;
        this.maskedValue = maskedValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Ranger mask type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maskType")
private String maskType;

        /**
         * Ranger mask type.
         * @param maskType the value to set
         * @return this builder
         **/
        

public Builder maskType(String maskType) {
    this.maskType = maskType;
    return this;
}
            /**
     * Mask condition, including an empty string or null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maskCondition")
private String maskCondition;

        /**
         * Mask condition, including an empty string or null.
         * @param maskCondition the value to set
         * @return this builder
         **/
        

public Builder maskCondition(String maskCondition) {
    this.maskCondition = maskCondition;
    return this;
}
            /**
     * Mask value or SQL expression, including an empty string or null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maskedValue")
private String maskedValue;

        /**
         * Mask value or SQL expression, including an empty string or null.
         * @param maskedValue the value to set
         * @return this builder
         **/
        

public Builder maskedValue(String maskedValue) {
    this.maskedValue = maskedValue;
    return this;
}


        public AccessGrantedForMaskInfo build() {
            AccessGrantedForMaskInfo model = new AccessGrantedForMaskInfo(this.maskType
                , this.maskCondition
                , this.maskedValue);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForMaskInfo model) {
                this.maskType(model.getMaskType());
    this.maskCondition(model.getMaskCondition());
    this.maskedValue(model.getMaskedValue());
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
     * Ranger mask type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maskType")
    private final String maskType;

        /**
     * Ranger mask type.
     * @return the value
     **/
    
    public String getMaskType() {
        return maskType;
    }


        /**
     * Mask condition, including an empty string or null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maskCondition")
    private final String maskCondition;

        /**
     * Mask condition, including an empty string or null.
     * @return the value
     **/
    
    public String getMaskCondition() {
        return maskCondition;
    }


        /**
     * Mask value or SQL expression, including an empty string or null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maskedValue")
    private final String maskedValue;

        /**
     * Mask value or SQL expression, including an empty string or null.
     * @return the value
     **/
    
    public String getMaskedValue() {
        return maskedValue;
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
        sb.append("AccessGrantedForMaskInfo(");
        sb.append("maskType=").append(String.valueOf(this.maskType));
        sb.append(", maskCondition=").append(String.valueOf(this.maskCondition));
        sb.append(", maskedValue=").append(String.valueOf(this.maskedValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForMaskInfo)) {
            return false;
        }

        AccessGrantedForMaskInfo other = (AccessGrantedForMaskInfo) o;
        return java.util.Objects.equals(this.maskType, other.maskType) &&
            java.util.Objects.equals(this.maskCondition, other.maskCondition) &&
            java.util.Objects.equals(this.maskedValue, other.maskedValue);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maskType == null ? 43 : this.maskType.hashCode());
        result = (result * PRIME) + (this.maskCondition == null ? 43 : this.maskCondition.hashCode());
        result = (result * PRIME) + (this.maskedValue == null ? 43 : this.maskedValue.hashCode());
        return result;
    }


}
