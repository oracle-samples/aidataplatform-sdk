// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update data assets on a share.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageShareDataAssetDetails.Builder.class)

public final class ManageShareDataAssetDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "type", "name", "description", "partition", "alias"})
    public ManageShareDataAssetDetails(ShareDataAssetAction action, ShareDataAssetType type, String name, String description, String partition, String alias) {
        super();
        this.action = action;
        this.type = type;
        this.name = name;
        this.description = description;
        this.partition = partition;
        this.alias = alias;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The action of this update.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private ShareDataAssetAction action;

                /**
         * The action of this update.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(ShareDataAssetAction action) {
        this.action = action;
        return this;
        }
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
     * The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.
* 
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * The data asset description for this operation.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The data asset description for this operation.
* 
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
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
     * The data asset alias for this operation, only applicable for TABLE and VIEW.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

                /**
         * The data asset alias for this operation, only applicable for TABLE and VIEW.
* 
         * @param alias the value to set
         * @return this builder
         **/
        

        public Builder alias(String alias) {
        this.alias = alias;
        return this;
        }


        public ManageShareDataAssetDetails build() {
            ManageShareDataAssetDetails model = new ManageShareDataAssetDetails(this.action
                    , this.type
                    , this.name
                    , this.description
                    , this.partition
                    , this.alias);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageShareDataAssetDetails model) {
                this.action(model.getAction());
    this.type(model.getType());
    this.name(model.getName());
    this.description(model.getDescription());
    this.partition(model.getPartition());
    this.alias(model.getAlias());
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
     * The action of this update.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final ShareDataAssetAction action;

        /**
     * The action of this update.
     * @return the value
     **/
    
    public ShareDataAssetAction getAction() {
        return action;
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
     * The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The data asset name for this operation. For relational assets, it should be fully qualified name. For example, catalog.schema or catalog.schema.table.
* 
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The data asset description for this operation.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The data asset description for this operation.
* 
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
     * The data asset alias for this operation, only applicable for TABLE and VIEW.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

        /**
     * The data asset alias for this operation, only applicable for TABLE and VIEW.
* 
     * @return the value
     **/
    
    public String getAlias() {
        return alias;
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
        sb.append("ManageShareDataAssetDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", partition=").append(String.valueOf(this.partition));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageShareDataAssetDetails)) {
            return false;
        }

        ManageShareDataAssetDetails other = (ManageShareDataAssetDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.partition, other.partition) &&
            java.util.Objects.equals(this.alias, other.alias);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        return result;
    }


}
