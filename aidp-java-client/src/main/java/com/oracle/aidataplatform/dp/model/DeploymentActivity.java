// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A deployment activity record.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentActivity.Builder.class)

public final class DeploymentActivity  {
    @Deprecated
    @java.beans.ConstructorProperties({"activityId", "operationType", "status", "startTime", "endTime", "user", "message", "statusMessage", "deploymentDetails"})
    public DeploymentActivity(String activityId, DeploymentOperationType operationType, DeploymentActivityStatus status, String startTime, String endTime, String user, String message, String statusMessage, DeploymentDetails deploymentDetails) {
        super();
        this.activityId = activityId;
        this.operationType = operationType;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.user = user;
        this.message = message;
        this.statusMessage = statusMessage;
        this.deploymentDetails = deploymentDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment activity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activity_id")
private String activityId;

        /**
         * ID of the deployment activity.
         * @param activityId the value to set
         * @return this builder
         **/
        

public Builder activityId(String activityId) {
    this.activityId = activityId;
    return this;
}
            /**
     * Operation type of the activity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("operation_type")
private DeploymentOperationType operationType;

        /**
         * Operation type of the activity.
         * @param operationType the value to set
         * @return this builder
         **/
        

public Builder operationType(DeploymentOperationType operationType) {
    this.operationType = operationType;
    return this;
}
            /**
     * Status of the activity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private DeploymentActivityStatus status;

        /**
         * Status of the activity.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(DeploymentActivityStatus status) {
    this.status = status;
    return this;
}
            /**
     * Unix timestamp in milliseconds of when the activity started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("start_time")
private String startTime;

        /**
         * Unix timestamp in milliseconds of when the activity started.
         * @param startTime the value to set
         * @return this builder
         **/
        

public Builder startTime(String startTime) {
    this.startTime = startTime;
    return this;
}
            /**
     * Unix timestamp in milliseconds of when the activity ended.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("end_time")
private String endTime;

        /**
         * Unix timestamp in milliseconds of when the activity ended.
         * @param endTime the value to set
         * @return this builder
         **/
        

public Builder endTime(String endTime) {
    this.endTime = endTime;
    return this;
}
            /**
     * User that created the activity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("user")
private String user;

        /**
         * User that created the activity.
         * @param user the value to set
         * @return this builder
         **/
        

public Builder user(String user) {
    this.user = user;
    return this;
}
            /**
     * Comment recorded with the activity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Comment recorded with the activity.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * Details on the status, if it is not SUCCESS.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status_message")
private String statusMessage;

        /**
         * Details on the status, if it is not SUCCESS.
         * @param statusMessage the value to set
         * @return this builder
         **/
        

public Builder statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("deployment_details")
private DeploymentDetails deploymentDetails;



public Builder deploymentDetails(DeploymentDetails deploymentDetails) {
    this.deploymentDetails = deploymentDetails;
    return this;
}


        public DeploymentActivity build() {
            DeploymentActivity model = new DeploymentActivity(this.activityId
                , this.operationType
                , this.status
                , this.startTime
                , this.endTime
                , this.user
                , this.message
                , this.statusMessage
                , this.deploymentDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentActivity model) {
                this.activityId(model.getActivityId());
    this.operationType(model.getOperationType());
    this.status(model.getStatus());
    this.startTime(model.getStartTime());
    this.endTime(model.getEndTime());
    this.user(model.getUser());
    this.message(model.getMessage());
    this.statusMessage(model.getStatusMessage());
    this.deploymentDetails(model.getDeploymentDetails());
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
     * ID of the deployment activity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activity_id")
    private final String activityId;

        /**
     * ID of the deployment activity.
     * @return the value
     **/
    
    public String getActivityId() {
        return activityId;
    }

    
        /**
     * Operation type of the activity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("operation_type")
    private final DeploymentOperationType operationType;

        /**
     * Operation type of the activity.
     * @return the value
     **/
    
    public DeploymentOperationType getOperationType() {
        return operationType;
    }

    
        /**
     * Status of the activity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DeploymentActivityStatus status;

        /**
     * Status of the activity.
     * @return the value
     **/
    
    public DeploymentActivityStatus getStatus() {
        return status;
    }


        /**
     * Unix timestamp in milliseconds of when the activity started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("start_time")
    private final String startTime;

        /**
     * Unix timestamp in milliseconds of when the activity started.
     * @return the value
     **/
    
    public String getStartTime() {
        return startTime;
    }


        /**
     * Unix timestamp in milliseconds of when the activity ended.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("end_time")
    private final String endTime;

        /**
     * Unix timestamp in milliseconds of when the activity ended.
     * @return the value
     **/
    
    public String getEndTime() {
        return endTime;
    }


        /**
     * User that created the activity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final String user;

        /**
     * User that created the activity.
     * @return the value
     **/
    
    public String getUser() {
        return user;
    }


        /**
     * Comment recorded with the activity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Comment recorded with the activity.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * Details on the status, if it is not SUCCESS.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status_message")
    private final String statusMessage;

        /**
     * Details on the status, if it is not SUCCESS.
     * @return the value
     **/
    
    public String getStatusMessage() {
        return statusMessage;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_details")
    private final DeploymentDetails deploymentDetails;

    
    public DeploymentDetails getDeploymentDetails() {
        return deploymentDetails;
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
        sb.append("DeploymentActivity(");
        sb.append("activityId=").append(String.valueOf(this.activityId));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(", deploymentDetails=").append(String.valueOf(this.deploymentDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentActivity)) {
            return false;
        }

        DeploymentActivity other = (DeploymentActivity) o;
        return java.util.Objects.equals(this.activityId, other.activityId) &&
            java.util.Objects.equals(this.operationType, other.operationType) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.startTime, other.startTime) &&
            java.util.Objects.equals(this.endTime, other.endTime) &&
            java.util.Objects.equals(this.user, other.user) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.statusMessage, other.statusMessage) &&
            java.util.Objects.equals(this.deploymentDetails, other.deploymentDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.activityId == null ? 43 : this.activityId.hashCode());
        result = (result * PRIME) + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result = (result * PRIME) + (this.deploymentDetails == null ? 43 : this.deploymentDetails.hashCode());
        return result;
    }


}
