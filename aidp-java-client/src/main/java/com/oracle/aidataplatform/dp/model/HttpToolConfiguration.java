package com.oracle.aidataplatform.dp.model;



/**
 * Configuration for HTTP Tool requests
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HttpToolConfiguration.Builder.class)

public final class HttpToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"method", "url", "headers", "params", "body", "timeout", "auth", "responseOptimization"})
    public HttpToolConfiguration(HttpMethod method, String url, java.util.Map<String, String> headers, java.util.Map<String, String> params, java.util.Map<String, Object> body, Integer timeout, Auth auth, java.util.Map<String, Object> responseOptimization) {
        super();
        this.method = method;
        this.url = url;
        this.headers = headers;
        this.params = params;
        this.body = body;
        this.timeout = timeout;
        this.auth = auth;
        this.responseOptimization = responseOptimization;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * HTTP method (GET, POST, PUT, DELETE, PATCH)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("method")
private HttpMethod method;

        /**
         * HTTP method (GET, POST, PUT, DELETE, PATCH)
         * @param method the value to set
         * @return this builder
         **/
        

public Builder method(HttpMethod method) {
    this.method = method;
    return this;
}
            /**
     * Target URL with optional {{variable}} templates
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("url")
private String url;

        /**
         * Target URL with optional {{variable}} templates
         * @param url the value to set
         * @return this builder
         **/
        

public Builder url(String url) {
    this.url = url;
    return this;
}
            /**
     * Optional custom headers
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("headers")
private java.util.Map<String, String> headers;

        /**
         * Optional custom headers
         * @param headers the value to set
         * @return this builder
         **/
        

public Builder headers(java.util.Map<String, String> headers) {
    this.headers = headers;
    return this;
}
            /**
     * Optional query parameters
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("params")
private java.util.Map<String, String> params;

        /**
         * Optional query parameters
         * @param params the value to set
         * @return this builder
         **/
        

public Builder params(java.util.Map<String, String> params) {
    this.params = params;
    return this;
}
            /**
     * Optional request body (for POST, PUT, PATCH)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("body")
private java.util.Map<String, Object> body;

        /**
         * Optional request body (for POST, PUT, PATCH)
         * @param body the value to set
         * @return this builder
         **/
        

public Builder body(java.util.Map<String, Object> body) {
    this.body = body;
    return this;
}
            /**
     * Request timeout in seconds
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeout")
private Integer timeout;

        /**
         * Request timeout in seconds
         * @param timeout the value to set
         * @return this builder
         **/
        

public Builder timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("auth")
private Auth auth;



public Builder auth(Auth auth) {
    this.auth = auth;
    return this;
}
            /**
     * Response optimization settings
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("responseOptimization")
private java.util.Map<String, Object> responseOptimization;

        /**
         * Response optimization settings
         * @param responseOptimization the value to set
         * @return this builder
         **/
        

public Builder responseOptimization(java.util.Map<String, Object> responseOptimization) {
    this.responseOptimization = responseOptimization;
    return this;
}


        public HttpToolConfiguration build() {
            HttpToolConfiguration model = new HttpToolConfiguration(this.method
                , this.url
                , this.headers
                , this.params
                , this.body
                , this.timeout
                , this.auth
                , this.responseOptimization);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpToolConfiguration model) {
                this.method(model.getMethod());
    this.url(model.getUrl());
    this.headers(model.getHeaders());
    this.params(model.getParams());
    this.body(model.getBody());
    this.timeout(model.getTimeout());
    this.auth(model.getAuth());
    this.responseOptimization(model.getResponseOptimization());
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
     * HTTP method (GET, POST, PUT, DELETE, PATCH)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    private final HttpMethod method;

        /**
     * HTTP method (GET, POST, PUT, DELETE, PATCH)
     * @return the value
     **/
    
    public HttpMethod getMethod() {
        return method;
    }


        /**
     * Target URL with optional {{variable}} templates
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

        /**
     * Target URL with optional {{variable}} templates
     * @return the value
     **/
    
    public String getUrl() {
        return url;
    }


        /**
     * Optional custom headers
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.Map<String, String> headers;

        /**
     * Optional custom headers
     * @return the value
     **/
    
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }


        /**
     * Optional query parameters
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    private final java.util.Map<String, String> params;

        /**
     * Optional query parameters
     * @return the value
     **/
    
    public java.util.Map<String, String> getParams() {
        return params;
    }


        /**
     * Optional request body (for POST, PUT, PATCH)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final java.util.Map<String, Object> body;

        /**
     * Optional request body (for POST, PUT, PATCH)
     * @return the value
     **/
    
    public java.util.Map<String, Object> getBody() {
        return body;
    }


        /**
     * Request timeout in seconds
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final Integer timeout;

        /**
     * Request timeout in seconds
     * @return the value
     **/
    
    public Integer getTimeout() {
        return timeout;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("auth")
    private final Auth auth;

    
    public Auth getAuth() {
        return auth;
    }


        /**
     * Response optimization settings
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("responseOptimization")
    private final java.util.Map<String, Object> responseOptimization;

        /**
     * Response optimization settings
     * @return the value
     **/
    
    public java.util.Map<String, Object> getResponseOptimization() {
        return responseOptimization;
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
        sb.append("HttpToolConfiguration(");
        sb.append("method=").append(String.valueOf(this.method));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", params=").append(String.valueOf(this.params));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", auth=").append(String.valueOf(this.auth));
        sb.append(", responseOptimization=").append(String.valueOf(this.responseOptimization));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HttpToolConfiguration)) {
            return false;
        }

        HttpToolConfiguration other = (HttpToolConfiguration) o;
        return java.util.Objects.equals(this.method, other.method) &&
            java.util.Objects.equals(this.url, other.url) &&
            java.util.Objects.equals(this.headers, other.headers) &&
            java.util.Objects.equals(this.params, other.params) &&
            java.util.Objects.equals(this.body, other.body) &&
            java.util.Objects.equals(this.timeout, other.timeout) &&
            java.util.Objects.equals(this.auth, other.auth) &&
            java.util.Objects.equals(this.responseOptimization, other.responseOptimization);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.method == null ? 43 : this.method.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result = (result * PRIME) + (this.params == null ? 43 : this.params.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + (this.auth == null ? 43 : this.auth.hashCode());
        result = (result * PRIME) + (this.responseOptimization == null ? 43 : this.responseOptimization.hashCode());
        return result;
    }


}
