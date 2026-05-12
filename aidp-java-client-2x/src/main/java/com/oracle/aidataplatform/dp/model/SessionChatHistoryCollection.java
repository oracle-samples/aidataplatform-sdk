package com.oracle.aidataplatform.dp.model;


/**
 * A paginated collection of chat messages.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionChatHistoryCollection.Builder.class)

public final class SessionChatHistoryCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public SessionChatHistoryCollection(java.util.List<SessionChatHistorySummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Collection of chat messages
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SessionChatHistorySummary> items;

                /**
         * Collection of chat messages
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.List<SessionChatHistorySummary> items) {
        this.items = items;
        return this;
        }


        public SessionChatHistoryCollection build() {
            SessionChatHistoryCollection model = new SessionChatHistoryCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionChatHistoryCollection model) {
                this.items(model.getItems());
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
     * Collection of chat messages
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SessionChatHistorySummary> items;

        /**
     * Collection of chat messages
     * @return the value
     **/
    
    public java.util.List<SessionChatHistorySummary> getItems() {
        return items;
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
        sb.append("SessionChatHistoryCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionChatHistoryCollection)) {
            return false;
        }

        SessionChatHistoryCollection other = (SessionChatHistoryCollection) o;
        return java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
