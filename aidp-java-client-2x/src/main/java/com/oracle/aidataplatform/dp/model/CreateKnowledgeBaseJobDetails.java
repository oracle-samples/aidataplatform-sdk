package com.oracle.aidataplatform.dp.model;


/**
 * Request body for creating a new job definition for a KnowledgeBase.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateKnowledgeBaseJobDetails.Builder.class)

public final class CreateKnowledgeBaseJobDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "type", "goal", "sources", "sourceKey", "schedule"})
    public CreateKnowledgeBaseJobDetails(String displayName, String description, KnowledgeBaseJobType type, KnowledgeBaseJobGoalType goal, String sources, String sourceKey, String schedule) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.goal = goal;
        this.sources = sources;
        this.sourceKey = sourceKey;
        this.schedule = schedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of KnowledgeBase Job Definition
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Name of KnowledgeBase Job Definition
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * The description of KnowledgeBase Job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of KnowledgeBase Job
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * type of KB Job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private KnowledgeBaseJobType type;

                /**
         * type of KB Job
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(KnowledgeBaseJobType type) {
        this.type = type;
        return this;
        }
            /**
     * type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("goal")
        private KnowledgeBaseJobGoalType goal;

                /**
         * type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources
         * @param goal the value to set
         * @return this builder
         **/
        

        public Builder goal(KnowledgeBaseJobGoalType goal) {
        this.goal = goal;
        return this;
        }
            /**
     * Name of the source, "*" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private String sources;

                /**
         * Name of the source, "*" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job
         * @param sources the value to set
         * @return this builder
         **/
        

        public Builder sources(String sources) {
        this.sources = sources;
        return this;
        }
            /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
        private String sourceKey;

                /**
         * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
         * @param sourceKey the value to set
         * @return this builder
         **/
        

        public Builder sourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
        return this;
        }
            /**
     * If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, "0 0 * * *" means 12:00 AM daily
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

                /**
         * If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, "0 0 * * *" means 12:00 AM daily
         * @param schedule the value to set
         * @return this builder
         **/
        

        public Builder schedule(String schedule) {
        this.schedule = schedule;
        return this;
        }


        public CreateKnowledgeBaseJobDetails build() {
            CreateKnowledgeBaseJobDetails model = new CreateKnowledgeBaseJobDetails(this.displayName
                    , this.description
                    , this.type
                    , this.goal
                    , this.sources
                    , this.sourceKey
                    , this.schedule);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKnowledgeBaseJobDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.type(model.getType());
    this.goal(model.getGoal());
    this.sources(model.getSources());
    this.sourceKey(model.getSourceKey());
    this.schedule(model.getSchedule());
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
     * Name of KnowledgeBase Job Definition
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Name of KnowledgeBase Job Definition
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The description of KnowledgeBase Job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of KnowledgeBase Job
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    
        /**
     * type of KB Job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseJobType type;

        /**
     * type of KB Job
     * @return the value
     **/
    
    public KnowledgeBaseJobType getType() {
        return type;
    }

    
        /**
     * type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    private final KnowledgeBaseJobGoalType goal;

        /**
     * type of KB Job Goal, if missing it is considered that job aims to add/refresh the sources
     * @return the value
     **/
    
    public KnowledgeBaseJobGoalType getGoal() {
        return goal;
    }


        /**
     * Name of the source, "*" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final String sources;

        /**
     * Name of the source, "*" should be provided to create a DEFAULT JOB and sourceKey can be left null/empty for DEFAULT Job
     * @return the value
     **/
    
    public String getSources() {
        return sources;
    }


        /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
    private final String sourceKey;

        /**
     * Id of the source, should be provided for all jobs except DEFAULT JOB (which is supposed to run at all sources of KB)
     * @return the value
     **/
    
    public String getSourceKey() {
        return sourceKey;
    }


        /**
     * If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, "0 0 * * *" means 12:00 AM daily
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

        /**
     * If the job type is SCHEDULED, this field is used to provide schedule information in cron style. For example, "0 0 * * *" means 12:00 AM daily
     * @return the value
     **/
    
    public String getSchedule() {
        return schedule;
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
        sb.append("CreateKnowledgeBaseJobDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", goal=").append(String.valueOf(this.goal));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKnowledgeBaseJobDetails)) {
            return false;
        }

        CreateKnowledgeBaseJobDetails other = (CreateKnowledgeBaseJobDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.goal, other.goal) &&
            java.util.Objects.equals(this.sources, other.sources) &&
            java.util.Objects.equals(this.sourceKey, other.sourceKey) &&
            java.util.Objects.equals(this.schedule, other.schedule);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.goal == null ? 43 : this.goal.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        return result;
    }


}
