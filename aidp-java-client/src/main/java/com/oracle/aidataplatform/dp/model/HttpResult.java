// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result from HTTP tool execution.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HttpResult.Builder.class)

public final class HttpResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"statusCode", "headers", "body"})
    public HttpResult(Integer statusCode, java.util.Map<String, String> headers, java.util.Map<String, Object> body) {
        super();
        this.statusCode = statusCode;
        this.headers = headers;
        this.body = body;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * HTTP response status code
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("statusCode")
private Integer statusCode;

        /**
         * HTTP response status code
         * @param statusCode the value to set
         * @return this builder
         **/
        

public Builder statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
}
            /**
     * Response headers
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("headers")
private java.util.Map<String, String> headers;

        /**
         * Response headers
         * @param headers the value to set
         * @return this builder
         **/
        

public Builder headers(java.util.Map<String, String> headers) {
    this.headers = headers;
    return this;
}
            /**
     * Response body
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("body")
private java.util.Map<String, Object> body;

        /**
         * Response body
         * @param body the value to set
         * @return this builder
         **/
        

public Builder body(java.util.Map<String, Object> body) {
    this.body = body;
    return this;
}


        public HttpResult build() {
            HttpResult model = new HttpResult(this.statusCode
                , this.headers
                , this.body);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpResult model) {
                this.statusCode(model.getStatusCode());
    this.headers(model.getHeaders());
    this.body(model.getBody());
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
     * HTTP response status code
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("statusCode")
    private final Integer statusCode;

        /**
     * HTTP response status code
     * @return the value
     **/
    
    public Integer getStatusCode() {
        return statusCode;
    }


        /**
     * Response headers
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.Map<String, String> headers;

        /**
     * Response headers
     * @return the value
     **/
    
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }


        /**
     * Response body
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final java.util.Map<String, Object> body;

        /**
     * Response body
     * @return the value
     **/
    
    public java.util.Map<String, Object> getBody() {
        return body;
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
        sb.append("HttpResult(");
        sb.append("statusCode=").append(String.valueOf(this.statusCode));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpResult)) {
            return false;
        }

        HttpResult other = (HttpResult) o;
        return java.util.Objects.equals(this.statusCode, other.statusCode) &&
            java.util.Objects.equals(this.headers, other.headers) &&
            java.util.Objects.equals(this.body, other.body);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statusCode == null ? 43 : this.statusCode.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        return result;
    }


}
