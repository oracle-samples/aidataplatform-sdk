package com.oracle.aidataplatform.dp.model;


/**
 * The data to update a view.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateViewDetails.Builder.class)

public final class UpdateViewDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"updateMode", "viewUpdateDetails"})
    public UpdateViewDetails(UpdateMode updateMode, ViewUpdateDetails viewUpdateDetails) {
        super();
        this.updateMode = updateMode;
        this.viewUpdateDetails = viewUpdateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The mode of update for a view
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
        private UpdateMode updateMode;

                /**
         * The mode of update for a view
         * @param updateMode the value to set
         * @return this builder
         **/
        

        public Builder updateMode(UpdateMode updateMode) {
        this.updateMode = updateMode;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("viewUpdateDetails")
        private ViewUpdateDetails viewUpdateDetails;

        

        public Builder viewUpdateDetails(ViewUpdateDetails viewUpdateDetails) {
        this.viewUpdateDetails = viewUpdateDetails;
        return this;
        }


        public UpdateViewDetails build() {
            UpdateViewDetails model = new UpdateViewDetails(this.updateMode
                    , this.viewUpdateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateViewDetails model) {
                this.updateMode(model.getUpdateMode());
    this.viewUpdateDetails(model.getViewUpdateDetails());
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
     * The mode of update for a view
     **/
    public enum UpdateMode {
        RenameView("RENAME_VIEW"),
        AddProperties("ADD_PROPERTIES"),
        DropProperties("DROP_PROPERTIES"),
        UpdateViewDescription("UPDATE_VIEW_DESCRIPTION"),
        UpdateViewQuery("UPDATE_VIEW_QUERY"),
        UpdateColumnDescription("UPDATE_COLUMN_DESCRIPTION"),
        ;

        

        private final String value;
        private static java.util.Map<String, UpdateMode> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateMode v : UpdateMode.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        UpdateMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateMode: " + key);
        }
    };
        /**
     * The mode of update for a view
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updateMode")
    private final UpdateMode updateMode;

        /**
     * The mode of update for a view
     * @return the value
     **/
    
    public UpdateMode getUpdateMode() {
        return updateMode;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("viewUpdateDetails")
    private final ViewUpdateDetails viewUpdateDetails;

    
    public ViewUpdateDetails getViewUpdateDetails() {
        return viewUpdateDetails;
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
        sb.append("UpdateViewDetails(");
        sb.append("updateMode=").append(String.valueOf(this.updateMode));
        sb.append(", viewUpdateDetails=").append(String.valueOf(this.viewUpdateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateViewDetails)) {
            return false;
        }

        UpdateViewDetails other = (UpdateViewDetails) o;
        return java.util.Objects.equals(this.updateMode, other.updateMode) &&
            java.util.Objects.equals(this.viewUpdateDetails, other.viewUpdateDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.updateMode == null ? 43 : this.updateMode.hashCode());
        result = (result * PRIME) + (this.viewUpdateDetails == null ? 43 : this.viewUpdateDetails.hashCode());
        return result;
    }


}
