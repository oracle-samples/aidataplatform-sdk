// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The metadata information.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateFileMetadataDetails.Builder.class)

public final class UpdateFileMetadataDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"metadata", "action"})
    public UpdateFileMetadataDetails(java.util.Map<String, String> metadata, UpdateFileMetadataActionType action) {
        super();
        this.metadata = metadata;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

                /**
         * The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.
         * @param metadata the value to set
         * @return this builder
         **/
        

        public Builder metadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
        }
            /**
     * Action to be taken in case of conflict.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private UpdateFileMetadataActionType action;

                /**
         * Action to be taken in case of conflict.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(UpdateFileMetadataActionType action) {
        this.action = action;
        return this;
        }


        public UpdateFileMetadataDetails build() {
            UpdateFileMetadataDetails model = new UpdateFileMetadataDetails(this.metadata
                    , this.action);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFileMetadataDetails model) {
                this.metadata(model.getMetadata());
    this.action(model.getAction());
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
     * The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

        /**
     * The metadata information in map form. Example entries include system:key1=val1 and user:key2=val1.
     * @return the value
     **/
    
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    
        /**
     * Action to be taken in case of conflict.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final UpdateFileMetadataActionType action;

        /**
     * Action to be taken in case of conflict.
     * @return the value
     **/
    
    public UpdateFileMetadataActionType getAction() {
        return action;
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
        sb.append("UpdateFileMetadataDetails(");
        sb.append("metadata=").append(String.valueOf(this.metadata));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFileMetadataDetails)) {
            return false;
        }

        UpdateFileMetadataDetails other = (UpdateFileMetadataDetails) o;
        return java.util.Objects.equals(this.metadata, other.metadata) &&
            java.util.Objects.equals(this.action, other.action);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }


}
