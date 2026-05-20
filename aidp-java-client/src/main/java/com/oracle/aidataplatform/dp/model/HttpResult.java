// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result from HTTP tool execution.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HttpResult.Builder.class)

public final class HttpResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"statusCode", "errorCode", "message", "isNetworkError", "elapsedSeconds", "headers", "body"})
    public HttpResult(Integer statusCode, String errorCode, String message, Boolean isNetworkError, Float elapsedSeconds, java.util.Map<String, String> headers, java.util.Map<String, Object> body) {
        super();
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
        this.isNetworkError = isNetworkError;
        this.elapsedSeconds = elapsedSeconds;
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
     * Tool-level error code describing HTTP test failures
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorCode")
private String errorCode;

        /**
         * Tool-level error code describing HTTP test failures
         * @param errorCode the value to set
         * @return this builder
         **/
        

public Builder errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
}
            /**
     * Human-readable error message when the HTTP test fails
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Human-readable error message when the HTTP test fails
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * Indicates whether the failure occurred before an HTTP response was received
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isNetworkError")
private Boolean isNetworkError;

        /**
         * Indicates whether the failure occurred before an HTTP response was received
         * @param isNetworkError the value to set
         * @return this builder
         **/
        

public Builder isNetworkError(Boolean isNetworkError) {
    this.isNetworkError = isNetworkError;
    return this;
}
            /**
     * Time elapsed before the HTTP test completed or failed
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("elapsedSeconds")
private Float elapsedSeconds;

        /**
         * Time elapsed before the HTTP test completed or failed
         * @param elapsedSeconds the value to set
         * @return this builder
         **/
        

public Builder elapsedSeconds(Float elapsedSeconds) {
    this.elapsedSeconds = elapsedSeconds;
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
                , this.errorCode
                , this.message
                , this.isNetworkError
                , this.elapsedSeconds
                , this.headers
                , this.body);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpResult model) {
                this.statusCode(model.getStatusCode());
    this.errorCode(model.getErrorCode());
    this.message(model.getMessage());
    this.isNetworkError(model.getIsNetworkError());
    this.elapsedSeconds(model.getElapsedSeconds());
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
     * Tool-level error code describing HTTP test failures
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

        /**
     * Tool-level error code describing HTTP test failures
     * @return the value
     **/
    
    public String getErrorCode() {
        return errorCode;
    }


        /**
     * Human-readable error message when the HTTP test fails
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Human-readable error message when the HTTP test fails
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * Indicates whether the failure occurred before an HTTP response was received
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isNetworkError")
    private final Boolean isNetworkError;

        /**
     * Indicates whether the failure occurred before an HTTP response was received
     * @return the value
     **/
    
    public Boolean getIsNetworkError() {
        return isNetworkError;
    }


        /**
     * Time elapsed before the HTTP test completed or failed
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedSeconds")
    private final Float elapsedSeconds;

        /**
     * Time elapsed before the HTTP test completed or failed
     * @return the value
     **/
    
    public Float getElapsedSeconds() {
        return elapsedSeconds;
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
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", isNetworkError=").append(String.valueOf(this.isNetworkError));
        sb.append(", elapsedSeconds=").append(String.valueOf(this.elapsedSeconds));
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
            java.util.Objects.equals(this.errorCode, other.errorCode) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.isNetworkError, other.isNetworkError) &&
            java.util.Objects.equals(this.elapsedSeconds, other.elapsedSeconds) &&
            java.util.Objects.equals(this.headers, other.headers) &&
            java.util.Objects.equals(this.body, other.body);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statusCode == null ? 43 : this.statusCode.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.isNetworkError == null ? 43 : this.isNetworkError.hashCode());
        result = (result * PRIME) + (this.elapsedSeconds == null ? 43 : this.elapsedSeconds.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        return result;
    }


}
