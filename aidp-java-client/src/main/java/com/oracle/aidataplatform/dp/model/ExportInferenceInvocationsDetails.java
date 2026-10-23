// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Destination, window, and filters for exporting correlated inference invocation records.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportInferenceInvocationsDetails.Builder.class)

public final class ExportInferenceInvocationsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeLocation", "isOverwrite", "timeStart", "timeEnd", "filters"})
    public ExportInferenceInvocationsDetails(String volumeLocation, Boolean isOverwrite, java.util.Date timeStart, java.util.Date timeEnd, ExportInferenceInvocationsFilters filters) {
        super();
        this.volumeLocation = volumeLocation;
        this.isOverwrite = isOverwrite;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("volume_location")
private String volumeLocation;

        /**
         * Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.
         * @param volumeLocation the value to set
         * @return this builder
         **/
        

public Builder volumeLocation(String volumeLocation) {
    this.volumeLocation = volumeLocation;
    return this;
}
            /**
     * Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("is_overwrite")
private Boolean isOverwrite;

        /**
         * Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
         * @param isOverwrite the value to set
         * @return this builder
         **/
        

public Builder isOverwrite(Boolean isOverwrite) {
    this.isOverwrite = isOverwrite;
    return this;
}
            /**
     * Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStart")
private java.util.Date timeStart;

        /**
         * Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
         * @param timeStart the value to set
         * @return this builder
         **/
        

public Builder timeStart(java.util.Date timeStart) {
    this.timeStart = timeStart;
    return this;
}
            /**
     * End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("filters")
private ExportInferenceInvocationsFilters filters;



public Builder filters(ExportInferenceInvocationsFilters filters) {
    this.filters = filters;
    return this;
}


        public ExportInferenceInvocationsDetails build() {
            ExportInferenceInvocationsDetails model = new ExportInferenceInvocationsDetails(this.volumeLocation
                , this.isOverwrite
                , this.timeStart
                , this.timeEnd
                , this.filters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportInferenceInvocationsDetails model) {
                this.volumeLocation(model.getVolumeLocation());
    this.isOverwrite(model.getIsOverwrite());
    this.timeStart(model.getTimeStart());
    this.timeEnd(model.getTimeEnd());
    this.filters(model.getFilters());
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
     * Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("volume_location")
    private final String volumeLocation;

        /**
     * Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.
     * @return the value
     **/
    
    public String getVolumeLocation() {
        return volumeLocation;
    }


        /**
     * Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("is_overwrite")
    private final Boolean isOverwrite;

        /**
     * Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
     * @return the value
     **/
    
    public Boolean getIsOverwrite() {
        return isOverwrite;
    }


        /**
     * Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

        /**
     * Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
     * @return the value
     **/
    
    public java.util.Date getTimeStart() {
        return timeStart;
    }


        /**
     * End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final ExportInferenceInvocationsFilters filters;

    
    public ExportInferenceInvocationsFilters getFilters() {
        return filters;
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
        sb.append("ExportInferenceInvocationsDetails(");
        sb.append("volumeLocation=").append(String.valueOf(this.volumeLocation));
        sb.append(", isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportInferenceInvocationsDetails)) {
            return false;
        }

        ExportInferenceInvocationsDetails other = (ExportInferenceInvocationsDetails) o;
        return java.util.Objects.equals(this.volumeLocation, other.volumeLocation) &&
            java.util.Objects.equals(this.isOverwrite, other.isOverwrite) &&
            java.util.Objects.equals(this.timeStart, other.timeStart) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.filters, other.filters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.volumeLocation == null ? 43 : this.volumeLocation.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        return result;
    }


}
