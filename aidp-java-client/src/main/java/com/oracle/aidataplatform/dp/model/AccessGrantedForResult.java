// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Policy decision and enforcement artifacts. Null and empty values are distinct and are preserved.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForResult.Builder.class)

public final class AccessGrantedForResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"resource", "access", "columnsToFilter", "allowedColumns", "maskedColumns", "rowPredicate"})
    public AccessGrantedForResult(AccessGrantedForResource resource, Access access, java.util.List<String> columnsToFilter, java.util.List<String> allowedColumns, java.util.Map<String, AccessGrantedForMaskInfo> maskedColumns, String rowPredicate) {
        super();
        this.resource = resource;
        this.access = access;
        this.columnsToFilter = columnsToFilter;
        this.allowedColumns = allowedColumns;
        this.maskedColumns = maskedColumns;
        this.rowPredicate = rowPredicate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("resource")
private AccessGrantedForResource resource;



public Builder resource(AccessGrantedForResource resource) {
    this.resource = resource;
    return this;
}
            /**
     * Lakeproxy evaluation decision, independent of permission to call this API.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("access")
private Access access;

        /**
         * Lakeproxy evaluation decision, independent of permission to call this API.
         * @param access the value to set
         * @return this builder
         **/
        

public Builder access(Access access) {
    this.access = access;
    return this;
}
            /**
     * Columns to filter, or null when not supplied by Lakeproxy.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("columnsToFilter")
private java.util.List<String> columnsToFilter;

        /**
         * Columns to filter, or null when not supplied by Lakeproxy.
         * @param columnsToFilter the value to set
         * @return this builder
         **/
        

public Builder columnsToFilter(java.util.List<String> columnsToFilter) {
    this.columnsToFilter = columnsToFilter;
    return this;
}
            /**
     * Allowed columns, or null when enrichment is unavailable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("allowedColumns")
private java.util.List<String> allowedColumns;

        /**
         * Allowed columns, or null when enrichment is unavailable.
         * @param allowedColumns the value to set
         * @return this builder
         **/
        

public Builder allowedColumns(java.util.List<String> allowedColumns) {
    this.allowedColumns = allowedColumns;
    return this;
}
            /**
     * Column names mapped to masking information, or null when enrichment is unavailable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maskedColumns")
private java.util.Map<String, AccessGrantedForMaskInfo> maskedColumns;

        /**
         * Column names mapped to masking information, or null when enrichment is unavailable.
         * @param maskedColumns the value to set
         * @return this builder
         **/
        

public Builder maskedColumns(java.util.Map<String, AccessGrantedForMaskInfo> maskedColumns) {
    this.maskedColumns = maskedColumns;
    return this;
}
            /**
     * SQL row predicate verbatim, or null when not supplied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rowPredicate")
private String rowPredicate;

        /**
         * SQL row predicate verbatim, or null when not supplied.
         * @param rowPredicate the value to set
         * @return this builder
         **/
        

public Builder rowPredicate(String rowPredicate) {
    this.rowPredicate = rowPredicate;
    return this;
}


        public AccessGrantedForResult build() {
            AccessGrantedForResult model = new AccessGrantedForResult(this.resource
                , this.access
                , this.columnsToFilter
                , this.allowedColumns
                , this.maskedColumns
                , this.rowPredicate);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForResult model) {
                this.resource(model.getResource());
    this.access(model.getAccess());
    this.columnsToFilter(model.getColumnsToFilter());
    this.allowedColumns(model.getAllowedColumns());
    this.maskedColumns(model.getMaskedColumns());
    this.rowPredicate(model.getRowPredicate());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final AccessGrantedForResource resource;

    
    public AccessGrantedForResource getResource() {
        return resource;
    }

    /**
     * Lakeproxy evaluation decision, independent of permission to call this API.
     **/
    public enum Access implements com.oracle.bmc.http.internal.BmcEnum {
        Allowed("ALLOWED"),
        Denied("DENIED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Access.class);

        private final String value;
        private static java.util.Map<String, Access> map;

        static {
            map = new java.util.HashMap<>();
            for (Access v : Access.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Access(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Access create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Access', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Lakeproxy evaluation decision, independent of permission to call this API.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("access")
    private final Access access;

        /**
     * Lakeproxy evaluation decision, independent of permission to call this API.
     * @return the value
     **/
    
    public Access getAccess() {
        return access;
    }


        /**
     * Columns to filter, or null when not supplied by Lakeproxy.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("columnsToFilter")
    private final java.util.List<String> columnsToFilter;

        /**
     * Columns to filter, or null when not supplied by Lakeproxy.
     * @return the value
     **/
    
    public java.util.List<String> getColumnsToFilter() {
        return columnsToFilter;
    }


        /**
     * Allowed columns, or null when enrichment is unavailable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("allowedColumns")
    private final java.util.List<String> allowedColumns;

        /**
     * Allowed columns, or null when enrichment is unavailable.
     * @return the value
     **/
    
    public java.util.List<String> getAllowedColumns() {
        return allowedColumns;
    }


        /**
     * Column names mapped to masking information, or null when enrichment is unavailable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maskedColumns")
    private final java.util.Map<String, AccessGrantedForMaskInfo> maskedColumns;

        /**
     * Column names mapped to masking information, or null when enrichment is unavailable.
     * @return the value
     **/
    
    public java.util.Map<String, AccessGrantedForMaskInfo> getMaskedColumns() {
        return maskedColumns;
    }


        /**
     * SQL row predicate verbatim, or null when not supplied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rowPredicate")
    private final String rowPredicate;

        /**
     * SQL row predicate verbatim, or null when not supplied.
     * @return the value
     **/
    
    public String getRowPredicate() {
        return rowPredicate;
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
        sb.append("AccessGrantedForResult(");
        sb.append("resource=").append(String.valueOf(this.resource));
        sb.append(", access=").append(String.valueOf(this.access));
        sb.append(", columnsToFilter=").append(String.valueOf(this.columnsToFilter));
        sb.append(", allowedColumns=").append(String.valueOf(this.allowedColumns));
        sb.append(", maskedColumns=").append(String.valueOf(this.maskedColumns));
        sb.append(", rowPredicate=").append(String.valueOf(this.rowPredicate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForResult)) {
            return false;
        }

        AccessGrantedForResult other = (AccessGrantedForResult) o;
        return java.util.Objects.equals(this.resource, other.resource) &&
            java.util.Objects.equals(this.access, other.access) &&
            java.util.Objects.equals(this.columnsToFilter, other.columnsToFilter) &&
            java.util.Objects.equals(this.allowedColumns, other.allowedColumns) &&
            java.util.Objects.equals(this.maskedColumns, other.maskedColumns) &&
            java.util.Objects.equals(this.rowPredicate, other.rowPredicate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result = (result * PRIME) + (this.access == null ? 43 : this.access.hashCode());
        result = (result * PRIME) + (this.columnsToFilter == null ? 43 : this.columnsToFilter.hashCode());
        result = (result * PRIME) + (this.allowedColumns == null ? 43 : this.allowedColumns.hashCode());
        result = (result * PRIME) + (this.maskedColumns == null ? 43 : this.maskedColumns.hashCode());
        result = (result * PRIME) + (this.rowPredicate == null ? 43 : this.rowPredicate.hashCode());
        return result;
    }


}
