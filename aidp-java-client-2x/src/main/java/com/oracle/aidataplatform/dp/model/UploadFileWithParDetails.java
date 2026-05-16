// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create/update a file.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UploadFileWithParDetails.Builder.class)

public final class UploadFileWithParDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "eTag", "size", "systemTags"})
    public UploadFileWithParDetails(Action action, String eTag, Long size, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.action = action;
        this.eTag = eTag;
        this.size = size;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Action type on create or close.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

                /**
         * Action type on create or close.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(Action action) {
        this.action = action;
        return this;
        }
            /**
     * Etag that needs to be updated.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("eTag")
        private String eTag;

                /**
         * Etag that needs to be updated.
         * @param eTag the value to set
         * @return this builder
         **/
        

        public Builder eTag(String eTag) {
        this.eTag = eTag;
        return this;
        }
            /**
     * Size of the file needed when closed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;

                /**
         * Size of the file needed when closed.
         * @param size the value to set
         * @return this builder
         **/
        

        public Builder size(Long size) {
        this.size = size;
        return this;
        }
            /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

                /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
         * @param systemTags the value to set
         * @return this builder
         **/
        

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        this.systemTags = systemTags;
        return this;
        }


        public UploadFileWithParDetails build() {
            UploadFileWithParDetails model = new UploadFileWithParDetails(this.action
                    , this.eTag
                    , this.size
                    , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadFileWithParDetails model) {
                this.action(model.getAction());
    this.eTag(model.getETag());
    this.size(model.getSize());
    this.systemTags(model.getSystemTags());
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
     * Action type on create or close.
     **/
    public enum Action {
        Create("CREATE"),
        Refresh("REFRESH"),
        Update("UPDATE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
        /**
     * Action type on create or close.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * Action type on create or close.
     * @return the value
     **/
    
    public Action getAction() {
        return action;
    }


        /**
     * Etag that needs to be updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("eTag")
    private final String eTag;

        /**
     * Etag that needs to be updated.
     * @return the value
     **/
    
    public String getETag() {
        return eTag;
    }


        /**
     * Size of the file needed when closed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Long size;

        /**
     * Size of the file needed when closed.
     * @return the value
     **/
    
    public Long getSize() {
        return size;
    }


        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("UploadFileWithParDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", eTag=").append(String.valueOf(this.eTag));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadFileWithParDetails)) {
            return false;
        }

        UploadFileWithParDetails other = (UploadFileWithParDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.eTag, other.eTag) &&
            java.util.Objects.equals(this.size, other.size) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
