// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to perform grant/revoke consumption access on a share to/from a recipient.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageShareAccessDetails.Builder.class)

public final class ManageShareAccessDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "recipient"})
    public ManageShareAccessDetails(ShareAccessAction action, String recipient) {
        super();
        this.action = action;
        this.recipient = recipient;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The action. Either Grant or Revoke.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private ShareAccessAction action;

                /**
         * The action. Either Grant or Revoke.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(ShareAccessAction action) {
        this.action = action;
        return this;
        }
            /**
     * The simplified name of the grantee.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("recipient")
        private String recipient;

                /**
         * The simplified name of the grantee.
         * @param recipient the value to set
         * @return this builder
         **/
        

        public Builder recipient(String recipient) {
        this.recipient = recipient;
        return this;
        }


        public ManageShareAccessDetails build() {
            ManageShareAccessDetails model = new ManageShareAccessDetails(this.action
                    , this.recipient);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageShareAccessDetails model) {
                this.action(model.getAction());
    this.recipient(model.getRecipient());
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
     * The action. Either Grant or Revoke.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final ShareAccessAction action;

        /**
     * The action. Either Grant or Revoke.
     * @return the value
     **/
    
    public ShareAccessAction getAction() {
        return action;
    }


        /**
     * The simplified name of the grantee.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    private final String recipient;

        /**
     * The simplified name of the grantee.
     * @return the value
     **/
    
    public String getRecipient() {
        return recipient;
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
        sb.append("ManageShareAccessDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", recipient=").append(String.valueOf(this.recipient));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageShareAccessDetails)) {
            return false;
        }

        ManageShareAccessDetails other = (ManageShareAccessDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.recipient, other.recipient);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.recipient == null ? 43 : this.recipient.hashCode());
        return result;
    }


}
