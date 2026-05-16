// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information about a share data asset.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ShareDataAssetSummary.Builder.class)

public final class ShareDataAssetSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "name", "createdBy", "description", "catalog", "partition", "timeCreated", "timeUpdated"})
    public ShareDataAssetSummary(ShareDataAssetType type, String name, String createdBy, String description, String catalog, String partition, java.util.Date timeCreated, java.util.Date timeUpdated) {
        super();
        this.type = type;
        this.name = name;
        this.createdBy = createdBy;
        this.description = description;
        this.catalog = catalog;
        this.partition = partition;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The asset type for this update.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private ShareDataAssetType type;

                /**
         * The asset type for this update.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(ShareDataAssetType type) {
        this.type = type;
        return this;
        }
            /**
     * The data asset name for this operation.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * The data asset name for this operation.
* 
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * The ID of the user who created the share data asset.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * The ID of the user who created the share data asset.
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * Short description or comment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Short description or comment.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The data asset catalog for this operation.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalog")
        private String catalog;

                /**
         * The data asset catalog for this operation.
* 
         * @param catalog the value to set
         * @return this builder
         **/
        

        public Builder catalog(String catalog) {
        this.catalog = catalog;
        return this;
        }
            /**
     * Partition clause information, only applicable for TABLE.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

                /**
         * Partition clause information, only applicable for TABLE.
* 
         * @param partition the value to set
         * @return this builder
         **/
        

        public Builder partition(String partition) {
        this.partition = partition;
        return this;
        }
            /**
     * The date and time the Delta Share Data Asset was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time the Delta Share Data Asset was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The date and time the Delta Share Data Asset was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The date and time the Delta Share Data Asset was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
        return this;
        }


        public ShareDataAssetSummary build() {
            ShareDataAssetSummary model = new ShareDataAssetSummary(this.type
                    , this.name
                    , this.createdBy
                    , this.description
                    , this.catalog
                    , this.partition
                    , this.timeCreated
                    , this.timeUpdated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShareDataAssetSummary model) {
                this.type(model.getType());
    this.name(model.getName());
    this.createdBy(model.getCreatedBy());
    this.description(model.getDescription());
    this.catalog(model.getCatalog());
    this.partition(model.getPartition());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
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
     * The asset type for this update.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final ShareDataAssetType type;

        /**
     * The asset type for this update.
     * @return the value
     **/
    
    public ShareDataAssetType getType() {
        return type;
    }


        /**
     * The data asset name for this operation.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The data asset name for this operation.
* 
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The ID of the user who created the share data asset.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user who created the share data asset.
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Short description or comment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description or comment.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The data asset catalog for this operation.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalog")
    private final String catalog;

        /**
     * The data asset catalog for this operation.
* 
     * @return the value
     **/
    
    public String getCatalog() {
        return catalog;
    }


        /**
     * Partition clause information, only applicable for TABLE.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final String partition;

        /**
     * Partition clause information, only applicable for TABLE.
* 
     * @return the value
     **/
    
    public String getPartition() {
        return partition;
    }


        /**
     * The date and time the Delta Share Data Asset was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Delta Share Data Asset was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the Delta Share Data Asset was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Delta Share Data Asset was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ShareDataAssetSummary(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalog=").append(String.valueOf(this.catalog));
        sb.append(", partition=").append(String.valueOf(this.partition));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShareDataAssetSummary)) {
            return false;
        }

        ShareDataAssetSummary other = (ShareDataAssetSummary) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalog, other.catalog) &&
            java.util.Objects.equals(this.partition, other.partition) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalog == null ? 43 : this.catalog.hashCode());
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        return result;
    }


}
