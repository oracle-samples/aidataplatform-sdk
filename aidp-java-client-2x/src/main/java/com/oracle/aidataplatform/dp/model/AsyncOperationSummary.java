// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information about an Async Operation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AsyncOperationSummary.Builder.class)

public final class AsyncOperationSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "resourceType", "actionType", "resourceName", "createdBy", "createdByName", "timeStarted", "timeFinished", "status", "resourceDisplayName"})
    public AsyncOperationSummary(String key, AsyncOperationResourceType resourceType, AsyncOperationActionType actionType, String resourceName, String createdBy, String createdByName, java.util.Date timeStarted, java.util.Date timeFinished, AsyncOperationStatus status, String resourceDisplayName) {
        super();
        this.key = key;
        this.resourceType = resourceType;
        this.actionType = actionType;
        this.resourceName = resourceName;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.status = status;
        this.resourceDisplayName = resourceDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The unique key that identifies an async operation
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The unique key that identifies an async operation
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * The resource type of the async operation.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private AsyncOperationResourceType resourceType;

                /**
         * The resource type of the async operation.
         * @param resourceType the value to set
         * @return this builder
         **/
        

        public Builder resourceType(AsyncOperationResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
        }
            /**
     * The action type of the async operation.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private AsyncOperationActionType actionType;

                /**
         * The action type of the async operation.
         * @param actionType the value to set
         * @return this builder
         **/
        

        public Builder actionType(AsyncOperationActionType actionType) {
        this.actionType = actionType;
        return this;
        }
            /**
     * The fully qualified name of the Data Lake resource. Example: For table, it is 
* <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

                /**
         * The fully qualified name of the Data Lake resource. Example: For table, it is 
* <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
* 
         * @param resourceName the value to set
         * @return this builder
         **/
        

        public Builder resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
        }
            /**
     * The principal Id who started the async operation
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * The principal Id who started the async operation
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * The principal name who started the async operation
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
        private String createdByName;

                /**
         * The principal name who started the async operation
* 
         * @param createdByName the value to set
         * @return this builder
         **/
        

        public Builder createdByName(String createdByName) {
        this.createdByName = createdByName;
        return this;
        }
            /**
     * The date and time the Async operation was started, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

                /**
         * The date and time the Async operation was started, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeStarted the value to set
         * @return this builder
         **/
        

        public Builder timeStarted(java.util.Date timeStarted) {
        this.timeStarted = timeStarted;
        return this;
        }
            /**
     * The date and time the Async operation finished, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

                /**
         * The date and time the Async operation finished, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeFinished the value to set
         * @return this builder
         **/
        

        public Builder timeFinished(java.util.Date timeFinished) {
        this.timeFinished = timeFinished;
        return this;
        }
            /**
     * The state of the Table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AsyncOperationStatus status;

                /**
         * The state of the Table.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(AsyncOperationStatus status) {
        this.status = status;
        return this;
        }
            /**
     * The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
* But for workspace/cluster it is workspace and cluster displayName field.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
        private String resourceDisplayName;

                /**
         * The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
* But for workspace/cluster it is workspace and cluster displayName field.
* 
         * @param resourceDisplayName the value to set
         * @return this builder
         **/
        

        public Builder resourceDisplayName(String resourceDisplayName) {
        this.resourceDisplayName = resourceDisplayName;
        return this;
        }


        public AsyncOperationSummary build() {
            AsyncOperationSummary model = new AsyncOperationSummary(this.key
                    , this.resourceType
                    , this.actionType
                    , this.resourceName
                    , this.createdBy
                    , this.createdByName
                    , this.timeStarted
                    , this.timeFinished
                    , this.status
                    , this.resourceDisplayName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsyncOperationSummary model) {
                this.key(model.getKey());
    this.resourceType(model.getResourceType());
    this.actionType(model.getActionType());
    this.resourceName(model.getResourceName());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.timeStarted(model.getTimeStarted());
    this.timeFinished(model.getTimeFinished());
    this.status(model.getStatus());
    this.resourceDisplayName(model.getResourceDisplayName());
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
     * The unique key that identifies an async operation
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique key that identifies an async operation
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }

    
        /**
     * The resource type of the async operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final AsyncOperationResourceType resourceType;

        /**
     * The resource type of the async operation.
     * @return the value
     **/
    
    public AsyncOperationResourceType getResourceType() {
        return resourceType;
    }

    
        /**
     * The action type of the async operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final AsyncOperationActionType actionType;

        /**
     * The action type of the async operation.
     * @return the value
     **/
    
    public AsyncOperationActionType getActionType() {
        return actionType;
    }


        /**
     * The fully qualified name of the Data Lake resource. Example: For table, it is 
* <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

        /**
     * The fully qualified name of the Data Lake resource. Example: For table, it is 
* <catalog_name>.<schema_name>.<table_name>. For Cluster, it is <workspace_key>.<cluster_key>
* 
     * @return the value
     **/
    
    public String getResourceName() {
        return resourceName;
    }


        /**
     * The principal Id who started the async operation
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The principal Id who started the async operation
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The principal name who started the async operation
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * The principal name who started the async operation
* 
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * The date and time the Async operation was started, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * The date and time the Async operation was started, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * The date and time the Async operation finished, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

        /**
     * The date and time the Async operation finished, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    
        /**
     * The state of the Table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AsyncOperationStatus status;

        /**
     * The state of the Table.
     * @return the value
     **/
    
    public AsyncOperationStatus getStatus() {
        return status;
    }


        /**
     * The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
* But for workspace/cluster it is workspace and cluster displayName field.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
    private final String resourceDisplayName;

        /**
     * The display name of the Data Lake resource. Example: For catalog/table/schema, it is same as resourceName
* But for workspace/cluster it is workspace and cluster displayName field.
* 
     * @return the value
     **/
    
    public String getResourceDisplayName() {
        return resourceDisplayName;
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
        sb.append("AsyncOperationSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", resourceDisplayName=").append(String.valueOf(this.resourceDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsyncOperationSummary)) {
            return false;
        }

        AsyncOperationSummary other = (AsyncOperationSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.resourceType, other.resourceType) &&
            java.util.Objects.equals(this.actionType, other.actionType) &&
            java.util.Objects.equals(this.resourceName, other.resourceName) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeFinished, other.timeFinished) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.resourceDisplayName, other.resourceDisplayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.resourceDisplayName == null ? 43 : this.resourceDisplayName.hashCode());
        return result;
    }


}
