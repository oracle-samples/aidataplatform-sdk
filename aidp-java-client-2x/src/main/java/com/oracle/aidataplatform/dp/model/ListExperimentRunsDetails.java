// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of Experiment Runs to fetch.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ListExperimentRunsDetails.Builder.class)

public final class ListExperimentRunsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentIds", "maxResults", "pageToken", "filter", "orderBy", "runViewType"})
    public ListExperimentRunsDetails(java.util.List<String> experimentIds, Integer maxResults, String pageToken, String filter, java.util.List<String> orderBy, RunViewType runViewType) {
        super();
        this.experimentIds = experimentIds;
        this.maxResults = maxResults;
        this.pageToken = pageToken;
        this.filter = filter;
        this.orderBy = orderBy;
        this.runViewType = runViewType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * List of experiment IDs to search over
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("experiment_ids")
        private java.util.List<String> experimentIds;

                /**
         * List of experiment IDs to search over
         * @param experimentIds the value to set
         * @return this builder
         **/
        

        public Builder experimentIds(java.util.List<String> experimentIds) {
        this.experimentIds = experimentIds;
        return this;
        }
            /**
     * Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to 
* support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("max_results")
        private Integer maxResults;

                /**
         * Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to 
* support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
         * @param maxResults the value to set
         * @return this builder
         **/
        

        public Builder maxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
        }
            /**
     * Token indicating the page of experiment runs to fetch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("page_token")
        private String pageToken;

                /**
         * Token indicating the page of experiment runs to fetch
         * @param pageToken the value to set
         * @return this builder
         **/
        

        public Builder pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
        }
            /**
     * A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is 
* a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
* Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
* You can select columns with special characters (hyphen, space, period, etc.) by using 
* double quotes: metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas'
* Supported operators are =, !=, >, >=, <, and <=.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private String filter;

                /**
         * A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is 
* a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
* Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
* You can select columns with special characters (hyphen, space, period, etc.) by using 
* double quotes: metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas'
* Supported operators are =, !=, >, >=, <, and <=.
* 
         * @param filter the value to set
         * @return this builder
         **/
        

        public Builder filter(String filter) {
        this.filter = filter;
        return this;
        }
            /**
     * List of columns to be ordered by, including attributes, params, metrics, and tags with an 
* optional "DESC" or "ASC" annotation, where "ASC" is the default. 
* Example: ["params.input DESC", "metrics.alpha ASC", "metrics.rmse"] 
* Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is 
* the default ordering criterion if order_by is not provided).
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("order_by")
        private java.util.List<String> orderBy;

                /**
         * List of columns to be ordered by, including attributes, params, metrics, and tags with an 
* optional "DESC" or "ASC" annotation, where "ASC" is the default. 
* Example: ["params.input DESC", "metrics.alpha ASC", "metrics.rmse"] 
* Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is 
* the default ordering criterion if order_by is not provided).
* 
         * @param orderBy the value to set
         * @return this builder
         **/
        

        public Builder orderBy(java.util.List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
        }
            /**
     * Qualifier for type of runs to be returned. If unspecified, returns only active runs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("run_view_type")
        private RunViewType runViewType;

                /**
         * Qualifier for type of runs to be returned. If unspecified, returns only active runs.
         * @param runViewType the value to set
         * @return this builder
         **/
        

        public Builder runViewType(RunViewType runViewType) {
        this.runViewType = runViewType;
        return this;
        }


        public ListExperimentRunsDetails build() {
            ListExperimentRunsDetails model = new ListExperimentRunsDetails(this.experimentIds
                    , this.maxResults
                    , this.pageToken
                    , this.filter
                    , this.orderBy
                    , this.runViewType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListExperimentRunsDetails model) {
                this.experimentIds(model.getExperimentIds());
    this.maxResults(model.getMaxResults());
    this.pageToken(model.getPageToken());
    this.filter(model.getFilter());
    this.orderBy(model.getOrderBy());
    this.runViewType(model.getRunViewType());
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
     * List of experiment IDs to search over
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("experiment_ids")
    private final java.util.List<String> experimentIds;

        /**
     * List of experiment IDs to search over
     * @return the value
     **/
    
    public java.util.List<String> getExperimentIds() {
        return experimentIds;
    }


        /**
     * Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to 
* support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_results")
    private final Integer maxResults;

        /**
     * Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to 
* support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     * @return the value
     **/
    
    public Integer getMaxResults() {
        return maxResults;
    }


        /**
     * Token indicating the page of experiment runs to fetch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page_token")
    private final String pageToken;

        /**
     * Token indicating the page of experiment runs to fetch
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
    }


        /**
     * A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is 
* a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
* Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
* You can select columns with special characters (hyphen, space, period, etc.) by using 
* double quotes: metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas'
* Supported operators are =, !=, >, >=, <, and <=.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final String filter;

        /**
     * A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is 
* a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
* Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
* You can select columns with special characters (hyphen, space, period, etc.) by using 
* double quotes: metrics."model class" = 'LinearRegression' and tags."user-name" = 'Tomas'
* Supported operators are =, !=, >, >=, <, and <=.
* 
     * @return the value
     **/
    
    public String getFilter() {
        return filter;
    }


        /**
     * List of columns to be ordered by, including attributes, params, metrics, and tags with an 
* optional "DESC" or "ASC" annotation, where "ASC" is the default. 
* Example: ["params.input DESC", "metrics.alpha ASC", "metrics.rmse"] 
* Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is 
* the default ordering criterion if order_by is not provided).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("order_by")
    private final java.util.List<String> orderBy;

        /**
     * List of columns to be ordered by, including attributes, params, metrics, and tags with an 
* optional "DESC" or "ASC" annotation, where "ASC" is the default. 
* Example: ["params.input DESC", "metrics.alpha ASC", "metrics.rmse"] 
* Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is 
* the default ordering criterion if order_by is not provided).
* 
     * @return the value
     **/
    
    public java.util.List<String> getOrderBy() {
        return orderBy;
    }

    /**
     * Qualifier for type of runs to be returned. If unspecified, returns only active runs.
     **/
    public enum RunViewType {
        ActiveOnly("ACTIVE_ONLY"),
        DeletedOnly("DELETED_ONLY"),
        All("ALL"),
        ;

        

        private final String value;
        private static java.util.Map<String, RunViewType> map;

        static {
            map = new java.util.HashMap<>();
            for (RunViewType v : RunViewType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        RunViewType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RunViewType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RunViewType: " + key);
        }
    };
        /**
     * Qualifier for type of runs to be returned. If unspecified, returns only active runs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_view_type")
    private final RunViewType runViewType;

        /**
     * Qualifier for type of runs to be returned. If unspecified, returns only active runs.
     * @return the value
     **/
    
    public RunViewType getRunViewType() {
        return runViewType;
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
        sb.append("ListExperimentRunsDetails(");
        sb.append("experimentIds=").append(String.valueOf(this.experimentIds));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", orderBy=").append(String.valueOf(this.orderBy));
        sb.append(", runViewType=").append(String.valueOf(this.runViewType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExperimentRunsDetails)) {
            return false;
        }

        ListExperimentRunsDetails other = (ListExperimentRunsDetails) o;
        return java.util.Objects.equals(this.experimentIds, other.experimentIds) &&
            java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.pageToken, other.pageToken) &&
            java.util.Objects.equals(this.filter, other.filter) &&
            java.util.Objects.equals(this.orderBy, other.orderBy) &&
            java.util.Objects.equals(this.runViewType, other.runViewType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentIds == null ? 43 : this.experimentIds.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        result = (result * PRIME) + (this.runViewType == null ? 43 : this.runViewType.hashCode());
        return result;
    }


}
