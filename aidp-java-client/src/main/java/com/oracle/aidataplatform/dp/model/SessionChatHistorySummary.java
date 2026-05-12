package com.oracle.aidataplatform.dp.model;



/**
 * A single message in a chat session history. Does not include internal state.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionChatHistorySummary.Builder.class)

public final class SessionChatHistorySummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "sessionKey", "role", "timeCreated", "content", "toolName", "toolCallId", "metadata"})
    public SessionChatHistorySummary(String key, String sessionKey, String role, java.util.Date timeCreated, java.util.List<ChatMessage> content, String toolName, String toolCallId, java.util.Map<String, Object> metadata) {
        super();
        this.key = key;
        this.sessionKey = sessionKey;
        this.role = role;
        this.timeCreated = timeCreated;
        this.content = content;
        this.toolName = toolName;
        this.toolCallId = toolCallId;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for the message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique identifier for the message.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Identifier of the chat session this message belongs to.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sessionKey")
private String sessionKey;

        /**
         * Identifier of the chat session this message belongs to.
         * @param sessionKey the value to set
         * @return this builder
         **/
        

public Builder sessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
    return this;
}
            /**
     * Role associated with the message, such as user, assistant, system, or tool.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("role")
private String role;

        /**
         * Role associated with the message, such as user, assistant, system, or tool.
         * @param role the value to set
         * @return this builder
         **/
        

public Builder role(String role) {
    this.role = role;
    return this;
}
            /**
     * Time the message was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Time the message was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Message content.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private java.util.List<ChatMessage> content;

        /**
         * Message content.
         * @param content the value to set
         * @return this builder
         **/
        

public Builder content(java.util.List<ChatMessage> content) {
    this.content = content;
    return this;
}
            /**
     * Name of the tool, if this is a tool message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toolName")
private String toolName;

        /**
         * Name of the tool, if this is a tool message.
         * @param toolName the value to set
         * @return this builder
         **/
        

public Builder toolName(String toolName) {
    this.toolName = toolName;
    return this;
}
            /**
     * Identifier of the tool call, if applicable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toolCallId")
private String toolCallId;

        /**
         * Identifier of the tool call, if applicable.
         * @param toolCallId the value to set
         * @return this builder
         **/
        

public Builder toolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
    return this;
}
            /**
     * Optional key-value metadata associated with the message
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metadata")
private java.util.Map<String, Object> metadata;

        /**
         * Optional key-value metadata associated with the message
         * @param metadata the value to set
         * @return this builder
         **/
        

public Builder metadata(java.util.Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
}


        public SessionChatHistorySummary build() {
            SessionChatHistorySummary model = new SessionChatHistorySummary(this.key
                , this.sessionKey
                , this.role
                , this.timeCreated
                , this.content
                , this.toolName
                , this.toolCallId
                , this.metadata);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionChatHistorySummary model) {
                this.key(model.getKey());
    this.sessionKey(model.getSessionKey());
    this.role(model.getRole());
    this.timeCreated(model.getTimeCreated());
    this.content(model.getContent());
    this.toolName(model.getToolName());
    this.toolCallId(model.getToolCallId());
    this.metadata(model.getMetadata());
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
     * Unique identifier for the message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for the message.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Identifier of the chat session this message belongs to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionKey")
    private final String sessionKey;

        /**
     * Identifier of the chat session this message belongs to.
     * @return the value
     **/
    
    public String getSessionKey() {
        return sessionKey;
    }


        /**
     * Role associated with the message, such as user, assistant, system, or tool.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final String role;

        /**
     * Role associated with the message, such as user, assistant, system, or tool.
     * @return the value
     **/
    
    public String getRole() {
        return role;
    }


        /**
     * Time the message was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Time the message was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Message content.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final java.util.List<ChatMessage> content;

        /**
     * Message content.
     * @return the value
     **/
    
    public java.util.List<ChatMessage> getContent() {
        return content;
    }


        /**
     * Name of the tool, if this is a tool message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolName")
    private final String toolName;

        /**
     * Name of the tool, if this is a tool message.
     * @return the value
     **/
    
    public String getToolName() {
        return toolName;
    }


        /**
     * Identifier of the tool call, if applicable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolCallId")
    private final String toolCallId;

        /**
     * Identifier of the tool call, if applicable.
     * @return the value
     **/
    
    public String getToolCallId() {
        return toolCallId;
    }


        /**
     * Optional key-value metadata associated with the message
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

        /**
     * Optional key-value metadata associated with the message
     * @return the value
     **/
    
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
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
        sb.append("SessionChatHistorySummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", sessionKey=").append(String.valueOf(this.sessionKey));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", toolName=").append(String.valueOf(this.toolName));
        sb.append(", toolCallId=").append(String.valueOf(this.toolCallId));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionChatHistorySummary)) {
            return false;
        }

        SessionChatHistorySummary other = (SessionChatHistorySummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.sessionKey, other.sessionKey) &&
            java.util.Objects.equals(this.role, other.role) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.toolName, other.toolName) &&
            java.util.Objects.equals(this.toolCallId, other.toolCallId) &&
            java.util.Objects.equals(this.metadata, other.metadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.sessionKey == null ? 43 : this.sessionKey.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.toolName == null ? 43 : this.toolName.hashCode());
        result = (result * PRIME) + (this.toolCallId == null ? 43 : this.toolCallId.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }


}
