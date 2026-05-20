// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A Data Lake Model details
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="modelType", defaultImpl=Model.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AiModel.class, name = "GEN_AI")
})

public class Model  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "modelName", "displayName", "namespaceName", "description", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState", "lifecycleDetails"})
    protected Model(String id, String modelName, String displayName, String namespaceName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, LifecycleState lifecycleState, String lifecycleDetails) {
        super();
        this.id = id;
        this.modelName = modelName;
        this.displayName = displayName;
        this.namespaceName = namespaceName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }




        /**
     * A unique Id for the model, that is immutable on creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * A unique Id for the model, that is immutable on creation.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * modelName that is immutable on creation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelName")
    private final String modelName;

        /**
     * modelName that is immutable on creation.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


        /**
     * The model name. It can be changed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The model name. It can be changed.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The model's schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

        /**
     * The model's schema.
     * @return the value
     **/
    
    public String getNamespaceName() {
        return namespaceName;
    }


        /**
     * The description of the Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of the Model.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The time the Model was created. An RFC3339 formatted datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The time the Model was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The time the Model was updated. An RFC3339 formatted datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The time the Model was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The vendor who created the Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The vendor who created the Model.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The vendor who updated the Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The vendor who updated the Model.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * The state of the Model.
     **/
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
        /**
     * The state of the Model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * The state of the Model.
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("Model(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Model)) {
            return false;
        }

        Model other = (Model) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.namespaceName, other.namespaceName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        return result;
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
}
