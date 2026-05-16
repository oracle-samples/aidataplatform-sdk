// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Response for a list tools call
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchMcpObjectsResult.Builder.class)

public final class FetchMcpObjectsResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"objects", "nextPage", "previousPage", "totalItems"})
    public FetchMcpObjectsResult(java.util.List<McpObject> objects, String nextPage, String previousPage, Integer totalItems) {
        super();
        this.objects = objects;
        this.nextPage = nextPage;
        this.previousPage = previousPage;
        this.totalItems = totalItems;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The list of objects to be returned.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<McpObject> objects;

                /**
         * The list of objects to be returned.
         * @param objects the value to set
         * @return this builder
         **/
        

        public Builder objects(java.util.List<McpObject> objects) {
        this.objects = objects;
        return this;
        }
            /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("nextPage")
        private String nextPage;

                /**
         * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param nextPage the value to set
         * @return this builder
         **/
        

        public Builder nextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
        }
            /**
     * For list pagination. When this header appears in the response, previous pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("previousPage")
        private String previousPage;

                /**
         * For list pagination. When this header appears in the response, previous pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param previousPage the value to set
         * @return this builder
         **/
        

        public Builder previousPage(String previousPage) {
        this.previousPage = previousPage;
        return this;
        }
            /**
     * For list pagination. This header provides total number of items available. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalItems")
        private Integer totalItems;

                /**
         * For list pagination. This header provides total number of items available. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param totalItems the value to set
         * @return this builder
         **/
        

        public Builder totalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
        }


        public FetchMcpObjectsResult build() {
            FetchMcpObjectsResult model = new FetchMcpObjectsResult(this.objects
                    , this.nextPage
                    , this.previousPage
                    , this.totalItems);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchMcpObjectsResult model) {
                this.objects(model.getObjects());
    this.nextPage(model.getNextPage());
    this.previousPage(model.getPreviousPage());
    this.totalItems(model.getTotalItems());
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
     * The list of objects to be returned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<McpObject> objects;

        /**
     * The list of objects to be returned.
     * @return the value
     **/
    
    public java.util.List<McpObject> getObjects() {
        return objects;
    }


        /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextPage")
    private final String nextPage;

        /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     **/
    
    public String getNextPage() {
        return nextPage;
    }


        /**
     * For list pagination. When this header appears in the response, previous pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("previousPage")
    private final String previousPage;

        /**
     * For list pagination. When this header appears in the response, previous pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     **/
    
    public String getPreviousPage() {
        return previousPage;
    }


        /**
     * For list pagination. This header provides total number of items available. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalItems")
    private final Integer totalItems;

        /**
     * For list pagination. This header provides total number of items available. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     **/
    
    public Integer getTotalItems() {
        return totalItems;
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
        sb.append("FetchMcpObjectsResult(");
        sb.append("objects=").append(String.valueOf(this.objects));
        sb.append(", nextPage=").append(String.valueOf(this.nextPage));
        sb.append(", previousPage=").append(String.valueOf(this.previousPage));
        sb.append(", totalItems=").append(String.valueOf(this.totalItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchMcpObjectsResult)) {
            return false;
        }

        FetchMcpObjectsResult other = (FetchMcpObjectsResult) o;
        return java.util.Objects.equals(this.objects, other.objects) &&
            java.util.Objects.equals(this.nextPage, other.nextPage) &&
            java.util.Objects.equals(this.previousPage, other.previousPage) &&
            java.util.Objects.equals(this.totalItems, other.totalItems);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result = (result * PRIME) + (this.nextPage == null ? 43 : this.nextPage.hashCode());
        result = (result * PRIME) + (this.previousPage == null ? 43 : this.previousPage.hashCode());
        result = (result * PRIME) + (this.totalItems == null ? 43 : this.totalItems.hashCode());
        return result;
    }


}
