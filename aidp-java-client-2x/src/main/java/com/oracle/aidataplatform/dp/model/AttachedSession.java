package com.oracle.aidataplatform.dp.model;


/**
 * Details of attached sessions to a cluster
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AttachedSession.Builder.class)

public final class AttachedSession  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "path", "state", "lastCommandRun"})
    public AttachedSession(Type type, String path, State state, String lastCommandRun) {
        super();
        this.type = type;
        this.path = path;
        this.state = state;
        this.lastCommandRun = lastCommandRun;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The type of the attached session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

                /**
         * The type of the attached session.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Type type) {
        this.type = type;
        return this;
        }
            /**
     * The path of the attached file.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * The path of the attached file.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * The state of the attached file.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

                /**
         * The state of the attached file.
         * @param state the value to set
         * @return this builder
         **/
        

        public Builder state(State state) {
        this.state = state;
        return this;
        }
            /**
     * The time of the last command of file was run in this cluster.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lastCommandRun")
        private String lastCommandRun;

                /**
         * The time of the last command of file was run in this cluster.
* 
         * @param lastCommandRun the value to set
         * @return this builder
         **/
        

        public Builder lastCommandRun(String lastCommandRun) {
        this.lastCommandRun = lastCommandRun;
        return this;
        }


        public AttachedSession build() {
            AttachedSession model = new AttachedSession(this.type
                    , this.path
                    , this.state
                    , this.lastCommandRun);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachedSession model) {
                this.type(model.getType());
    this.path(model.getPath());
    this.state(model.getState());
    this.lastCommandRun(model.getLastCommandRun());
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
     * The type of the attached session.
     **/
    public enum Type {
        Notebook("NOTEBOOK"),
        File("FILE"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The type of the attached session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * The type of the attached session.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * The path of the attached file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The path of the attached file.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }

    /**
     * The state of the attached file.
     **/
    public enum State {
        Active("ACTIVE"),
        Idle("IDLE"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'State', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The state of the attached file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * The state of the attached file.
     * @return the value
     **/
    
    public State getState() {
        return state;
    }


        /**
     * The time of the last command of file was run in this cluster.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastCommandRun")
    private final String lastCommandRun;

        /**
     * The time of the last command of file was run in this cluster.
* 
     * @return the value
     **/
    
    public String getLastCommandRun() {
        return lastCommandRun;
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
        sb.append("AttachedSession(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", lastCommandRun=").append(String.valueOf(this.lastCommandRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachedSession)) {
            return false;
        }

        AttachedSession other = (AttachedSession) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.lastCommandRun, other.lastCommandRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.lastCommandRun == null ? 43 : this.lastCommandRun.hashCode());
        return result;
    }


}
