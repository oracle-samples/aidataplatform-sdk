// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details used to submit a lineage payload for import.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ImportLineageDetails.Builder.class)

public final class ImportLineageDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"producerName", "payloadType", "lineagePayload"})
    public ImportLineageDetails(String producerName, PayloadType payloadType, byte[] lineagePayload) {
        super();
        this.producerName = producerName;
        this.payloadType = payloadType;
        this.lineagePayload = lineagePayload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * User-friendly lineage producer name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("producerName")
private String producerName;

        /**
         * User-friendly lineage producer name.
         * @param producerName the value to set
         * @return this builder
         **/
        

public Builder producerName(String producerName) {
    this.producerName = producerName;
    return this;
}
            /**
     * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("payloadType")
private PayloadType payloadType;

        /**
         * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
         * @param payloadType the value to set
         * @return this builder
         **/
        

public Builder payloadType(PayloadType payloadType) {
    this.payloadType = payloadType;
    return this;
}
            /**
     * Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified {@code payloadType}. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lineagePayload")
private byte[] lineagePayload;

        /**
         * Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified {@code payloadType}. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.
         * @param lineagePayload the value to set
         * @return this builder
         **/
        

public Builder lineagePayload(byte[] lineagePayload) {
    this.lineagePayload = lineagePayload;
    return this;
}


        public ImportLineageDetails build() {
            ImportLineageDetails model = new ImportLineageDetails(this.producerName
                , this.payloadType
                , this.lineagePayload);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportLineageDetails model) {
                this.producerName(model.getProducerName());
    this.payloadType(model.getPayloadType());
    this.lineagePayload(model.getLineagePayload());
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
     * User-friendly lineage producer name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("producerName")
    private final String producerName;

        /**
     * User-friendly lineage producer name.
     * @return the value
     **/
    
    public String getProducerName() {
        return producerName;
    }

    /**
     * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
     **/
    public enum PayloadType implements com.oracle.bmc.http.internal.BmcEnum {
        OpenLineageRunEvent("OPEN_LINEAGE_RUN_EVENT"),
        ;

        

        private final String value;
        private static java.util.Map<String, PayloadType> map;

        static {
            map = new java.util.HashMap<>();
            for (PayloadType v : PayloadType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        PayloadType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PayloadType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PayloadType: " + key);
        }
    };
        /**
     * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("payloadType")
    private final PayloadType payloadType;

        /**
     * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
     * @return the value
     **/
    
    public PayloadType getPayloadType() {
        return payloadType;
    }


        /**
     * Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified {@code payloadType}. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lineagePayload")
    private final byte[] lineagePayload;

        /**
     * Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified {@code payloadType}. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.
     * @return the value
     **/
    
    public byte[] getLineagePayload() {
        return lineagePayload;
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
        sb.append("ImportLineageDetails(");
        sb.append("producerName=").append(String.valueOf(this.producerName));
        sb.append(", payloadType=").append(String.valueOf(this.payloadType));
        sb.append(", lineagePayload=").append((includeByteArrayContents ? java.util.Arrays.toString(this.lineagePayload) : (String.valueOf(this.lineagePayload) + (this.lineagePayload != null ? " (byte[" + this.lineagePayload.length + "])" : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportLineageDetails)) {
            return false;
        }

        ImportLineageDetails other = (ImportLineageDetails) o;
        return java.util.Objects.equals(this.producerName, other.producerName) &&
            java.util.Objects.equals(this.payloadType, other.payloadType) &&
            java.util.Arrays.equals(this.lineagePayload, other.lineagePayload);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.producerName == null ? 43 : this.producerName.hashCode());
        result = (result * PRIME) + (this.payloadType == null ? 43 : this.payloadType.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.lineagePayload);
        return result;
    }


}
