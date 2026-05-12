package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a volume.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateVolumeDetails.Builder.class)

public final class CreateVolumeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "catalogName", "schemaName", "description", "volumeType", "storageLocation"})
    public CreateVolumeDetails(String displayName, String catalogName, String schemaName, String description, VolumeType volumeType, String storageLocation) {
        super();
        this.displayName = displayName;
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.description = description;
        this.volumeType = volumeType;
        this.storageLocation = storageLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A user-friendly name. Has to be unique within the schema and is changeable.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * A user-friendly name. Has to be unique within the schema and is changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * The name of the catalog to which this volume belongs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
        private String catalogName;

                /**
         * The name of the catalog to which this volume belongs.
         * @param catalogName the value to set
         * @return this builder
         **/
        

        public Builder catalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
        }
            /**
     * The name of the schema to which this volume belongs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

                /**
         * The name of the schema to which this volume belongs.
         * @param schemaName the value to set
         * @return this builder
         **/
        

        public Builder schemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
        }
            /**
     * Short description of the volume
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Short description of the volume
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The type of volume.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
        private VolumeType volumeType;

                /**
         * The type of volume.
         * @param volumeType the value to set
         * @return this builder
         **/
        

        public Builder volumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
        return this;
        }
            /**
     * The storage location of the external volume. Only applicable for external volumes.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("storageLocation")
        private String storageLocation;

                /**
         * The storage location of the external volume. Only applicable for external volumes.
         * @param storageLocation the value to set
         * @return this builder
         **/
        

        public Builder storageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
        }


        public CreateVolumeDetails build() {
            CreateVolumeDetails model = new CreateVolumeDetails(this.displayName
                    , this.catalogName
                    , this.schemaName
                    , this.description
                    , this.volumeType
                    , this.storageLocation);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVolumeDetails model) {
                this.displayName(model.getDisplayName());
    this.catalogName(model.getCatalogName());
    this.schemaName(model.getSchemaName());
    this.description(model.getDescription());
    this.volumeType(model.getVolumeType());
    this.storageLocation(model.getStorageLocation());
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
     * A user-friendly name. Has to be unique within the schema and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Has to be unique within the schema and is changeable.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The name of the catalog to which this volume belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * The name of the catalog to which this volume belongs.
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
    }


        /**
     * The name of the schema to which this volume belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

        /**
     * The name of the schema to which this volume belongs.
     * @return the value
     **/
    
    public String getSchemaName() {
        return schemaName;
    }


        /**
     * Short description of the volume
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description of the volume
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    /**
     * The type of volume.
     **/
    public enum VolumeType {
        Managed("MANAGED"),
        External("EXTERNAL"),
        ;

        

        private final String value;
        private static java.util.Map<String, VolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (VolumeType v : VolumeType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        VolumeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VolumeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VolumeType: " + key);
        }
    };
        /**
     * The type of volume.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
    private final VolumeType volumeType;

        /**
     * The type of volume.
     * @return the value
     **/
    
    public VolumeType getVolumeType() {
        return volumeType;
    }


        /**
     * The storage location of the external volume. Only applicable for external volumes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("storageLocation")
    private final String storageLocation;

        /**
     * The storage location of the external volume. Only applicable for external volumes.
     * @return the value
     **/
    
    public String getStorageLocation() {
        return storageLocation;
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
        sb.append("CreateVolumeDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", volumeType=").append(String.valueOf(this.volumeType));
        sb.append(", storageLocation=").append(String.valueOf(this.storageLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVolumeDetails)) {
            return false;
        }

        CreateVolumeDetails other = (CreateVolumeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.schemaName, other.schemaName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.volumeType, other.volumeType) &&
            java.util.Objects.equals(this.storageLocation, other.storageLocation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.volumeType == null ? 43 : this.volumeType.hashCode());
        result = (result * PRIME) + (this.storageLocation == null ? 43 : this.storageLocation.hashCode());
        return result;
    }


}
