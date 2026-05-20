// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The summary of the Model.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelSummary.Builder.class)

public final class ModelSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "modelName", "displayName", "modelVersion", "vendor", "modelType"})
    public ModelSummary(String id, String modelName, String displayName, String modelVersion, String vendor, ModelType modelType) {
        super();
        this.id = id;
        this.modelName = modelName;
        this.displayName = displayName;
        this.modelVersion = modelVersion;
        this.vendor = vendor;
        this.modelType = modelType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A unique Id for the Model summary, that is immutable on creation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * A unique Id for the Model summary, that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * A unique key for the Model summary, that is immutable on creation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelName")
private String modelName;

        /**
         * A unique key for the Model summary, that is immutable on creation.
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
            /**
     * The Model summary name, it can be changed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * The Model summary name, it can be changed.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * version that is available for that Model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
private String modelVersion;

        /**
         * version that is available for that Model.
         * @param modelVersion the value to set
         * @return this builder
         **/
        

public Builder modelVersion(String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}
            /**
     * vendor name for that Model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("vendor")
private String vendor;

        /**
         * vendor name for that Model.
         * @param vendor the value to set
         * @return this builder
         **/
        

public Builder vendor(String vendor) {
    this.vendor = vendor;
    return this;
}
            /**
     * Possible modelTypes of Models object
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelType")
private ModelType modelType;

        /**
         * Possible modelTypes of Models object
         * @param modelType the value to set
         * @return this builder
         **/
        

public Builder modelType(ModelType modelType) {
    this.modelType = modelType;
    return this;
}


        public ModelSummary build() {
            ModelSummary model = new ModelSummary(this.id
                , this.modelName
                , this.displayName
                , this.modelVersion
                , this.vendor
                , this.modelType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelSummary model) {
                this.id(model.getId());
    this.modelName(model.getModelName());
    this.displayName(model.getDisplayName());
    this.modelVersion(model.getModelVersion());
    this.vendor(model.getVendor());
    this.modelType(model.getModelType());
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
     * A unique Id for the Model summary, that is immutable on creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * A unique Id for the Model summary, that is immutable on creation.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * A unique key for the Model summary, that is immutable on creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelName")
    private final String modelName;

        /**
     * A unique key for the Model summary, that is immutable on creation.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


        /**
     * The Model summary name, it can be changed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The Model summary name, it can be changed.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * version that is available for that Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

        /**
     * version that is available for that Model.
     * @return the value
     **/
    
    public String getModelVersion() {
        return modelVersion;
    }


        /**
     * vendor name for that Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

        /**
     * vendor name for that Model.
     * @return the value
     **/
    
    public String getVendor() {
        return vendor;
    }

    /**
     * Possible modelTypes of Models object
     **/
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        GenAi("GEN_AI"),
        ;

        

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
        /**
     * Possible modelTypes of Models object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final ModelType modelType;

        /**
     * Possible modelTypes of Models object
     * @return the value
     **/
    
    public ModelType getModelType() {
        return modelType;
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
        sb.append("ModelSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelSummary)) {
            return false;
        }

        ModelSummary other = (ModelSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.modelVersion, other.modelVersion) &&
            java.util.Objects.equals(this.vendor, other.vendor) &&
            java.util.Objects.equals(this.modelType, other.modelType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        return result;
    }


}
