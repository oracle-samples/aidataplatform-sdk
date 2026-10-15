// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Datalake resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForDatalakeDetails.Builder.class)

public final class AccessGrantedForDatalakeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"datalakeId"})
    public AccessGrantedForDatalakeDetails(String datalakeId) {
        super();
        this.datalakeId = datalakeId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy datalakeId.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("datalakeId")
private String datalakeId;

        /**
         * Lakeproxy datalakeId.
         * @param datalakeId the value to set
         * @return this builder
         **/
        

public Builder datalakeId(String datalakeId) {
    this.datalakeId = datalakeId;
    return this;
}


        public AccessGrantedForDatalakeDetails build() {
            AccessGrantedForDatalakeDetails model = new AccessGrantedForDatalakeDetails(this.datalakeId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForDatalakeDetails model) {
                this.datalakeId(model.getDatalakeId());
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
     * Lakeproxy datalakeId.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("datalakeId")
    private final String datalakeId;

        /**
     * Lakeproxy datalakeId.
     * @return the value
     **/
    
    public String getDatalakeId() {
        return datalakeId;
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
        sb.append("AccessGrantedForDatalakeDetails(");
        sb.append("datalakeId=").append(String.valueOf(this.datalakeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForDatalakeDetails)) {
            return false;
        }

        AccessGrantedForDatalakeDetails other = (AccessGrantedForDatalakeDetails) o;
        return java.util.Objects.equals(this.datalakeId, other.datalakeId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.datalakeId == null ? 43 : this.datalakeId.hashCode());
        return result;
    }


}
