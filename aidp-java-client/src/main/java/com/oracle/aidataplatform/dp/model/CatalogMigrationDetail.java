// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CatalogMigrationDetail.Builder.class)

public final class CatalogMigrationDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "catalogName", "catalogType", "status", "failureMsg"})
    public CatalogMigrationDetail(String key, String catalogName, String catalogType, Status status, String failureMsg) {
        super();
        this.key = key;
        this.catalogName = catalogName;
        this.catalogType = catalogType;
        this.status = status;
        this.failureMsg = failureMsg;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * catalog key
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * catalog key
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * catalog Name
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

        /**
         * catalog Name
         * @param catalogName the value to set
         * @return this builder
         **/
        

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}
            /**
     * catalog type
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogType")
private String catalogType;

        /**
         * catalog type
         * @param catalogType the value to set
         * @return this builder
         **/
        

public Builder catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
}
            /**
     * migration result status
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Status status;

        /**
         * migration result status
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(Status status) {
    this.status = status;
    return this;
}
            /**
     * Failure msg if failed else null
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("failureMsg")
private String failureMsg;

        /**
         * Failure msg if failed else null
         * @param failureMsg the value to set
         * @return this builder
         **/
        

public Builder failureMsg(String failureMsg) {
    this.failureMsg = failureMsg;
    return this;
}


        public CatalogMigrationDetail build() {
            CatalogMigrationDetail model = new CatalogMigrationDetail(this.key
                , this.catalogName
                , this.catalogType
                , this.status
                , this.failureMsg);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogMigrationDetail model) {
                this.key(model.getKey());
    this.catalogName(model.getCatalogName());
    this.catalogType(model.getCatalogType());
    this.status(model.getStatus());
    this.failureMsg(model.getFailureMsg());
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
     * catalog key
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * catalog key
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * catalog Name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * catalog Name
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
    }


        /**
     * catalog type
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogType")
    private final String catalogType;

        /**
     * catalog type
     * @return the value
     **/
    
    public String getCatalogType() {
        return catalogType;
    }

    /**
     * migration result status
     **/
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Success("SUCCESS"),
        Failed("FAILED"),
        ;

        

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
        /**
     * migration result status
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * migration result status
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * Failure msg if failed else null
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failureMsg")
    private final String failureMsg;

        /**
     * Failure msg if failed else null
     * @return the value
     **/
    
    public String getFailureMsg() {
        return failureMsg;
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
        sb.append("CatalogMigrationDetail(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", catalogType=").append(String.valueOf(this.catalogType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", failureMsg=").append(String.valueOf(this.failureMsg));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogMigrationDetail)) {
            return false;
        }

        CatalogMigrationDetail other = (CatalogMigrationDetail) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.catalogType, other.catalogType) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.failureMsg, other.failureMsg);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.catalogType == null ? 43 : this.catalogType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.failureMsg == null ? 43 : this.failureMsg.hashCode());
        return result;
    }


}
