// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Defines the data type and color for an input or output.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NodeIo.Builder.class)

public final class NodeIo  {
    @Deprecated
    @java.beans.ConstructorProperties({"dataType", "color"})
    public NodeIo(DataType dataType, NodeIoColor color) {
        super();
        this.dataType = dataType;
        this.color = color;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Possible types of node inputs and outputs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private DataType dataType;

                /**
         * Possible types of node inputs and outputs.
         * @param dataType the value to set
         * @return this builder
         **/
        

        public Builder dataType(DataType dataType) {
        this.dataType = dataType;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("color")
        private NodeIoColor color;

        

        public Builder color(NodeIoColor color) {
        this.color = color;
        return this;
        }


        public NodeIo build() {
            NodeIo model = new NodeIo(this.dataType
                    , this.color);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeIo model) {
                this.dataType(model.getDataType());
    this.color(model.getColor());
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
     * Possible types of node inputs and outputs.
     **/
    public enum DataType {
        Flow("FLOW"),
        Str("STR"),
        Int("INT"),
        Bool("BOOL"),
        Float("FLOAT"),
        List("LIST"),
        Dict("DICT"),
        Any("ANY"),
        Tools("TOOLS"),
        Llms("LLMS"),
        Agents("AGENTS"),
        Planner("PLANNER"),
        Flows("FLOWS"),
        ;

        

        private final String value;
        private static java.util.Map<String, DataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataType v : DataType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        DataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataType: " + key);
        }
    };
        /**
     * Possible types of node inputs and outputs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final DataType dataType;

        /**
     * Possible types of node inputs and outputs.
     * @return the value
     **/
    
    public DataType getDataType() {
        return dataType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    private final NodeIoColor color;

    
    public NodeIoColor getColor() {
        return color;
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
        sb.append("NodeIo(");
        sb.append("dataType=").append(String.valueOf(this.dataType));
        sb.append(", color=").append(String.valueOf(this.color));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeIo)) {
            return false;
        }

        NodeIo other = (NodeIo) o;
        return java.util.Objects.equals(this.dataType, other.dataType) &&
            java.util.Objects.equals(this.color, other.color);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.color == null ? 43 : this.color.hashCode());
        return result;
    }


}
