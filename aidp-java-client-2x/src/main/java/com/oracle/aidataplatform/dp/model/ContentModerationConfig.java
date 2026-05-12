package com.oracle.aidataplatform.dp.model;


/**
 * The configuration details, whether to add the content moderation feature to the model. Content moderation removes toxic and biased content from responses.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ContentModerationConfig.Builder.class)

public final class ContentModerationConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"mode", "modelId", "isEnabled"})
    public ContentModerationConfig(Mode mode, String modelId, Boolean isEnabled) {
        super();
        this.mode = mode;
        this.modelId = modelId;
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Enum for the modes of operation for inference protection.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

                /**
         * Enum for the modes of operation for inference protection.
         * @param mode the value to set
         * @return this builder
         **/
        

        public Builder mode(Mode mode) {
        this.mode = mode;
        return this;
        }
            /**
     * The OCID of the model used for the feature.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

                /**
         * The OCID of the model used for the feature.
         * @param modelId the value to set
         * @return this builder
         **/
        

        public Builder modelId(String modelId) {
        this.modelId = modelId;
        return this;
        }
            /**
     * Whether to enable the content moderation feature.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

                /**
         * Whether to enable the content moderation feature.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

        public Builder isEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
        }


        public ContentModerationConfig build() {
            ContentModerationConfig model = new ContentModerationConfig(this.mode
                    , this.modelId
                    , this.isEnabled);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContentModerationConfig model) {
                this.mode(model.getMode());
    this.modelId(model.getModelId());
    this.isEnabled(model.getIsEnabled());
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
     * Enum for the modes of operation for inference protection.
     **/
    public enum Mode {
        Inform("INFORM"),
        Block("BLOCK"),
        ;

        

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
        /**
     * Enum for the modes of operation for inference protection.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

        /**
     * Enum for the modes of operation for inference protection.
     * @return the value
     **/
    
    public Mode getMode() {
        return mode;
    }


        /**
     * The OCID of the model used for the feature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

        /**
     * The OCID of the model used for the feature.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * Whether to enable the content moderation feature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether to enable the content moderation feature.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("ContentModerationConfig(");
        sb.append("mode=").append(String.valueOf(this.mode));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentModerationConfig)) {
            return false;
        }

        ContentModerationConfig other = (ContentModerationConfig) o;
        return java.util.Objects.equals(this.mode, other.mode) &&
            java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.isEnabled, other.isEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        return result;
    }


}
