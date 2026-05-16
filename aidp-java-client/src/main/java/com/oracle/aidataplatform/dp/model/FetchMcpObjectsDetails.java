// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The required details for testing an mcp tool
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchMcpObjectsDetails.Builder.class)

public final class FetchMcpObjectsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowId", "type", "mcpTool", "sortOrder", "sortBy", "limit", "page", "paramValues"})
    public FetchMcpObjectsDetails(String agentFlowId, McpObjectType type, McpTool mcpTool, SortOrder sortOrder, SortBy sortBy, Integer limit, String page, java.util.Map<String, String> paramValues) {
        super();
        this.agentFlowId = agentFlowId;
        this.type = type;
        this.mcpTool = mcpTool;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
        this.limit = limit;
        this.page = page;
        this.paramValues = paramValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Agent flow id for which the tool is being tested
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
private String agentFlowId;

        /**
         * Agent flow id for which the tool is being tested
         * @param agentFlowId the value to set
         * @return this builder
         **/
        

public Builder agentFlowId(String agentFlowId) {
    this.agentFlowId = agentFlowId;
    return this;
}
            /**
     * Type of object. Tool, prompt or resource hosted on an MCP.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private McpObjectType type;

        /**
         * Type of object. Tool, prompt or resource hosted on an MCP.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(McpObjectType type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("mcpTool")
private McpTool mcpTool;



public Builder mcpTool(McpTool mcpTool) {
    this.mcpTool = mcpTool;
    return this;
}
            /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code displayName}
* sort order is case sensitive.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
private SortOrder sortOrder;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code displayName}
* sort order is case sensitive.
* 
         * @param sortOrder the value to set
         * @return this builder
         **/
        

public Builder sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
}
            /**
     * The field to sort by.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sortBy")
private SortBy sortBy;

        /**
         * The field to sort by.
* 
         * @param sortBy the value to set
         * @return this builder
         **/
        

public Builder sortBy(SortBy sortBy) {
    this.sortBy = sortBy;
    return this;
}
            /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("limit")
private Integer limit;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param limit the value to set
         * @return this builder
         **/
        

public Builder limit(Integer limit) {
    this.limit = limit;
    return this;
}
            /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("page")
private String page;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param page the value to set
         * @return this builder
         **/
        

public Builder page(String page) {
    this.page = page;
    return this;
}
            /**
     * Map of parameter names to their string values.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("paramValues")
private java.util.Map<String, String> paramValues;

        /**
         * Map of parameter names to their string values.
         * @param paramValues the value to set
         * @return this builder
         **/
        

public Builder paramValues(java.util.Map<String, String> paramValues) {
    this.paramValues = paramValues;
    return this;
}


        public FetchMcpObjectsDetails build() {
            FetchMcpObjectsDetails model = new FetchMcpObjectsDetails(this.agentFlowId
                , this.type
                , this.mcpTool
                , this.sortOrder
                , this.sortBy
                , this.limit
                , this.page
                , this.paramValues);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchMcpObjectsDetails model) {
                this.agentFlowId(model.getAgentFlowId());
    this.type(model.getType());
    this.mcpTool(model.getMcpTool());
    this.sortOrder(model.getSortOrder());
    this.sortBy(model.getSortBy());
    this.limit(model.getLimit());
    this.page(model.getPage());
    this.paramValues(model.getParamValues());
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
     * Agent flow id for which the tool is being tested
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
    private final String agentFlowId;

        /**
     * Agent flow id for which the tool is being tested
     * @return the value
     **/
    
    public String getAgentFlowId() {
        return agentFlowId;
    }

    
        /**
     * Type of object. Tool, prompt or resource hosted on an MCP.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final McpObjectType type;

        /**
     * Type of object. Tool, prompt or resource hosted on an MCP.
     * @return the value
     **/
    
    public McpObjectType getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("mcpTool")
    private final McpTool mcpTool;

    
    public McpTool getMcpTool() {
        return mcpTool;
    }

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code displayName}
* sort order is case sensitive.
* 
     **/
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code displayName}
* sort order is case sensitive.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The {@code displayName}
* sort order is case sensitive.
* 
     * @return the value
     **/
    
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * The field to sort by.
* 
     **/
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("TIME_CREATED"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
        /**
     * The field to sort by.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

        /**
     * The field to sort by.
* 
     * @return the value
     **/
    
    public SortBy getSortBy() {
        return sortBy;
    }


        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     **/
    
    public Integer getLimit() {
        return limit;
    }


        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page")
    private final String page;

        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     **/
    
    public String getPage() {
        return page;
    }


        /**
     * Map of parameter names to their string values.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("paramValues")
    private final java.util.Map<String, String> paramValues;

        /**
     * Map of parameter names to their string values.
     * @return the value
     **/
    
    public java.util.Map<String, String> getParamValues() {
        return paramValues;
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
        sb.append("FetchMcpObjectsDetails(");
        sb.append("agentFlowId=").append(String.valueOf(this.agentFlowId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", mcpTool=").append(String.valueOf(this.mcpTool));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", page=").append(String.valueOf(this.page));
        sb.append(", paramValues=").append(String.valueOf(this.paramValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchMcpObjectsDetails)) {
            return false;
        }

        FetchMcpObjectsDetails other = (FetchMcpObjectsDetails) o;
        return java.util.Objects.equals(this.agentFlowId, other.agentFlowId) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.mcpTool, other.mcpTool) &&
            java.util.Objects.equals(this.sortOrder, other.sortOrder) &&
            java.util.Objects.equals(this.sortBy, other.sortBy) &&
            java.util.Objects.equals(this.limit, other.limit) &&
            java.util.Objects.equals(this.page, other.page) &&
            java.util.Objects.equals(this.paramValues, other.paramValues);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowId == null ? 43 : this.agentFlowId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.mcpTool == null ? 43 : this.mcpTool.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.paramValues == null ? 43 : this.paramValues.hashCode());
        return result;
    }


}
