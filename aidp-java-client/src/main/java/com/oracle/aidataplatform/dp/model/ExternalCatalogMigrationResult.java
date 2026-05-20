// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of catalog migration operation
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExternalCatalogMigrationResult.Builder.class)

public final class ExternalCatalogMigrationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalExternalCatalogs", "newDesignExternalCatalogCount", "migratedExternalCatalogs", "failedMigrationExternalCatalogs", "migrationFailedWithException"})
    public ExternalCatalogMigrationResult(Integer totalExternalCatalogs, Integer newDesignExternalCatalogCount, java.util.List<CatalogMigrationDetail> migratedExternalCatalogs, java.util.List<CatalogMigrationDetail> failedMigrationExternalCatalogs, Integer migrationFailedWithException) {
        super();
        this.totalExternalCatalogs = totalExternalCatalogs;
        this.newDesignExternalCatalogCount = newDesignExternalCatalogCount;
        this.migratedExternalCatalogs = migratedExternalCatalogs;
        this.failedMigrationExternalCatalogs = failedMigrationExternalCatalogs;
        this.migrationFailedWithException = migrationFailedWithException;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total External catalog present
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("totalExternalCatalogs")
private Integer totalExternalCatalogs;

        /**
         * Total External catalog present
         * @param totalExternalCatalogs the value to set
         * @return this builder
         **/
        

public Builder totalExternalCatalogs(Integer totalExternalCatalogs) {
    this.totalExternalCatalogs = totalExternalCatalogs;
    return this;
}
            /**
     * No of external catalogs with new design
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("newDesignExternalCatalogCount")
private Integer newDesignExternalCatalogCount;

        /**
         * No of external catalogs with new design
         * @param newDesignExternalCatalogCount the value to set
         * @return this builder
         **/
        

public Builder newDesignExternalCatalogCount(Integer newDesignExternalCatalogCount) {
    this.newDesignExternalCatalogCount = newDesignExternalCatalogCount;
    return this;
}
            /**
     * No of external catalogs migrated successfully
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("migratedExternalCatalogs")
private java.util.List<CatalogMigrationDetail> migratedExternalCatalogs;

        /**
         * No of external catalogs migrated successfully
         * @param migratedExternalCatalogs the value to set
         * @return this builder
         **/
        

public Builder migratedExternalCatalogs(java.util.List<CatalogMigrationDetail> migratedExternalCatalogs) {
    this.migratedExternalCatalogs = migratedExternalCatalogs;
    return this;
}
            /**
     * No of external catalogs migration failed
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("failedMigrationExternalCatalogs")
private java.util.List<CatalogMigrationDetail> failedMigrationExternalCatalogs;

        /**
         * No of external catalogs migration failed
         * @param failedMigrationExternalCatalogs the value to set
         * @return this builder
         **/
        

public Builder failedMigrationExternalCatalogs(java.util.List<CatalogMigrationDetail> failedMigrationExternalCatalogs) {
    this.failedMigrationExternalCatalogs = failedMigrationExternalCatalogs;
    return this;
}
            /**
     * Count of Catalog Failed with exception before migration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("migrationFailedWithException")
private Integer migrationFailedWithException;

        /**
         * Count of Catalog Failed with exception before migration
         * @param migrationFailedWithException the value to set
         * @return this builder
         **/
        

public Builder migrationFailedWithException(Integer migrationFailedWithException) {
    this.migrationFailedWithException = migrationFailedWithException;
    return this;
}


        public ExternalCatalogMigrationResult build() {
            ExternalCatalogMigrationResult model = new ExternalCatalogMigrationResult(this.totalExternalCatalogs
                , this.newDesignExternalCatalogCount
                , this.migratedExternalCatalogs
                , this.failedMigrationExternalCatalogs
                , this.migrationFailedWithException);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalCatalogMigrationResult model) {
                this.totalExternalCatalogs(model.getTotalExternalCatalogs());
    this.newDesignExternalCatalogCount(model.getNewDesignExternalCatalogCount());
    this.migratedExternalCatalogs(model.getMigratedExternalCatalogs());
    this.failedMigrationExternalCatalogs(model.getFailedMigrationExternalCatalogs());
    this.migrationFailedWithException(model.getMigrationFailedWithException());
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
     * Total External catalog present
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalExternalCatalogs")
    private final Integer totalExternalCatalogs;

        /**
     * Total External catalog present
     * @return the value
     **/
    
    public Integer getTotalExternalCatalogs() {
        return totalExternalCatalogs;
    }


        /**
     * No of external catalogs with new design
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("newDesignExternalCatalogCount")
    private final Integer newDesignExternalCatalogCount;

        /**
     * No of external catalogs with new design
     * @return the value
     **/
    
    public Integer getNewDesignExternalCatalogCount() {
        return newDesignExternalCatalogCount;
    }


        /**
     * No of external catalogs migrated successfully
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("migratedExternalCatalogs")
    private final java.util.List<CatalogMigrationDetail> migratedExternalCatalogs;

        /**
     * No of external catalogs migrated successfully
     * @return the value
     **/
    
    public java.util.List<CatalogMigrationDetail> getMigratedExternalCatalogs() {
        return migratedExternalCatalogs;
    }


        /**
     * No of external catalogs migration failed
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failedMigrationExternalCatalogs")
    private final java.util.List<CatalogMigrationDetail> failedMigrationExternalCatalogs;

        /**
     * No of external catalogs migration failed
     * @return the value
     **/
    
    public java.util.List<CatalogMigrationDetail> getFailedMigrationExternalCatalogs() {
        return failedMigrationExternalCatalogs;
    }


        /**
     * Count of Catalog Failed with exception before migration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("migrationFailedWithException")
    private final Integer migrationFailedWithException;

        /**
     * Count of Catalog Failed with exception before migration
     * @return the value
     **/
    
    public Integer getMigrationFailedWithException() {
        return migrationFailedWithException;
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
        sb.append("ExternalCatalogMigrationResult(");
        sb.append("totalExternalCatalogs=").append(String.valueOf(this.totalExternalCatalogs));
        sb.append(", newDesignExternalCatalogCount=").append(String.valueOf(this.newDesignExternalCatalogCount));
        sb.append(", migratedExternalCatalogs=").append(String.valueOf(this.migratedExternalCatalogs));
        sb.append(", failedMigrationExternalCatalogs=").append(String.valueOf(this.failedMigrationExternalCatalogs));
        sb.append(", migrationFailedWithException=").append(String.valueOf(this.migrationFailedWithException));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalCatalogMigrationResult)) {
            return false;
        }

        ExternalCatalogMigrationResult other = (ExternalCatalogMigrationResult) o;
        return java.util.Objects.equals(this.totalExternalCatalogs, other.totalExternalCatalogs) &&
            java.util.Objects.equals(this.newDesignExternalCatalogCount, other.newDesignExternalCatalogCount) &&
            java.util.Objects.equals(this.migratedExternalCatalogs, other.migratedExternalCatalogs) &&
            java.util.Objects.equals(this.failedMigrationExternalCatalogs, other.failedMigrationExternalCatalogs) &&
            java.util.Objects.equals(this.migrationFailedWithException, other.migrationFailedWithException);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalExternalCatalogs == null ? 43 : this.totalExternalCatalogs.hashCode());
        result = (result * PRIME) + (this.newDesignExternalCatalogCount == null ? 43 : this.newDesignExternalCatalogCount.hashCode());
        result = (result * PRIME) + (this.migratedExternalCatalogs == null ? 43 : this.migratedExternalCatalogs.hashCode());
        result = (result * PRIME) + (this.failedMigrationExternalCatalogs == null ? 43 : this.failedMigrationExternalCatalogs.hashCode());
        result = (result * PRIME) + (this.migrationFailedWithException == null ? 43 : this.migrationFailedWithException.hashCode());
        return result;
    }


}
