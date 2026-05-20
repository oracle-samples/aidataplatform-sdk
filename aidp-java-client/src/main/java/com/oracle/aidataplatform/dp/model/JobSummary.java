// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobSummary.Builder.class)

public final class JobSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "createdBy", "createdByName", "updatedBy", "updatedByName", "name", "path", "schedule", "runAs", "timeCreated", "timeUpdated", "clusters", "jobClusters"})
    public JobSummary(String key, String createdBy, String createdByName, String updatedBy, String updatedByName, String name, String path, Schedule schedule, String runAs, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<String> clusters, java.util.List<JobCluster> jobClusters) {
        super();
        this.key = key;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.name = name;
        this.path = path;
        this.schedule = schedule;
        this.runAs = runAs;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.clusters = clusters;
        this.jobClusters = jobClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The OCID of the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The OCID of the job.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * The OCID of the IAM user.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The OCID of the IAM user.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Name of the user who created this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Name of the user who created this record
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}
            /**
     * The OCID of the IAM user.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The OCID of the IAM user.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * The username of the latest updater.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
private String updatedByName;

        /**
         * The username of the latest updater.
         * @param updatedByName the value to set
         * @return this builder
         **/
        

public Builder updatedByName(String updatedByName) {
    this.updatedByName = updatedByName;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * A user-friendly name. Does not have to be unique, and is changeable.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The path to store the job definition in.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The path to store the job definition in.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("schedule")
private Schedule schedule;



public Builder schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
}
            /**
     * The id with which the job run as.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("runAs")
private String runAs;

        /**
         * The id with which the job run as.
         * @param runAs the value to set
         * @return this builder
         **/
        

public Builder runAs(String runAs) {
    this.runAs = runAs;
    return this;
}
            /**
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * List of job cluster keys.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusters")
private java.util.List<String> clusters;

        /**
         * List of job cluster keys.
         * @param clusters the value to set
         * @return this builder
         **/
        

public Builder clusters(java.util.List<String> clusters) {
    this.clusters = clusters;
    return this;
}
            /**
     * List of job cluster configurations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jobClusters")
private java.util.List<JobCluster> jobClusters;

        /**
         * List of job cluster configurations.
         * @param jobClusters the value to set
         * @return this builder
         **/
        

public Builder jobClusters(java.util.List<JobCluster> jobClusters) {
    this.jobClusters = jobClusters;
    return this;
}


        public JobSummary build() {
            JobSummary model = new JobSummary(this.key
                , this.createdBy
                , this.createdByName
                , this.updatedBy
                , this.updatedByName
                , this.name
                , this.path
                , this.schedule
                , this.runAs
                , this.timeCreated
                , this.timeUpdated
                , this.clusters
                , this.jobClusters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary model) {
                this.key(model.getKey());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
    this.name(model.getName());
    this.path(model.getPath());
    this.schedule(model.getSchedule());
    this.runAs(model.getRunAs());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.clusters(model.getClusters());
    this.jobClusters(model.getJobClusters());
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
     * The OCID of the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The OCID of the job.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The OCID of the IAM user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the IAM user.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * The OCID of the IAM user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The OCID of the IAM user.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * The username of the latest updater.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

        /**
     * The username of the latest updater.
     * @return the value
     **/
    
    public String getUpdatedByName() {
        return updatedByName;
    }


        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name. Does not have to be unique, and is changeable.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The path to store the job definition in.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The path to store the job definition in.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final Schedule schedule;

    
    public Schedule getSchedule() {
        return schedule;
    }


        /**
     * The id with which the job run as.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("runAs")
    private final String runAs;

        /**
     * The id with which the job run as.
     * @return the value
     **/
    
    public String getRunAs() {
        return runAs;
    }


        /**
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the DataLake was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the DataLake was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2025-05-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * List of job cluster keys.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusters")
    private final java.util.List<String> clusters;

        /**
     * List of job cluster keys.
     * @return the value
     **/
    
    public java.util.List<String> getClusters() {
        return clusters;
    }


        /**
     * List of job cluster configurations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jobClusters")
    private final java.util.List<JobCluster> jobClusters;

        /**
     * List of job cluster configurations.
     * @return the value
     **/
    
    public java.util.List<JobCluster> getJobClusters() {
        return jobClusters;
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
        sb.append("JobSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", runAs=").append(String.valueOf(this.runAs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", clusters=").append(String.valueOf(this.clusters));
        sb.append(", jobClusters=").append(String.valueOf(this.jobClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobSummary)) {
            return false;
        }

        JobSummary other = (JobSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.schedule, other.schedule) &&
            java.util.Objects.equals(this.runAs, other.runAs) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.clusters, other.clusters) &&
            java.util.Objects.equals(this.jobClusters, other.jobClusters);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.runAs == null ? 43 : this.runAs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.clusters == null ? 43 : this.clusters.hashCode());
        result = (result * PRIME) + (this.jobClusters == null ? 43 : this.jobClusters.hashCode());
        return result;
    }


}
