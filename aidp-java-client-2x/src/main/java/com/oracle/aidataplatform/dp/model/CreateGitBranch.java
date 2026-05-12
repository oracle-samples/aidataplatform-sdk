package com.oracle.aidataplatform.dp.model;


/**
 * Git Branch details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateGitBranch.Builder.class)

public final class CreateGitBranch  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitBranchName", "gitUrl", "errorMessage", "stdOut", "stdErr", "gitExitCode", "gitFolderPath"})
    public CreateGitBranch(String gitBranchName, String gitUrl, String errorMessage, String stdOut, String stdErr, Integer gitExitCode, String gitFolderPath) {
        super();
        this.gitBranchName = gitBranchName;
        this.gitUrl = gitUrl;
        this.errorMessage = errorMessage;
        this.stdOut = stdOut;
        this.stdErr = stdErr;
        this.gitExitCode = gitExitCode;
        this.gitFolderPath = gitFolderPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The name of the git branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
        private String gitBranchName;

                /**
         * The name of the git branch
         * @param gitBranchName the value to set
         * @return this builder
         **/
        

        public Builder gitBranchName(String gitBranchName) {
        this.gitBranchName = gitBranchName;
        return this;
        }
            /**
     * The git repository url corresponding to the branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
        private String gitUrl;

                /**
         * The git repository url corresponding to the branch
         * @param gitUrl the value to set
         * @return this builder
         **/
        

        public Builder gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
        }
            /**
     * Git Error Message
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

                /**
         * Git Error Message
         * @param errorMessage the value to set
         * @return this builder
         **/
        

        public Builder errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
        }
            /**
     * Git STDOUT Message
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("stdOut")
        private String stdOut;

                /**
         * Git STDOUT Message
         * @param stdOut the value to set
         * @return this builder
         **/
        

        public Builder stdOut(String stdOut) {
        this.stdOut = stdOut;
        return this;
        }
            /**
     * Git STDERR Message
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("stdErr")
        private String stdErr;

                /**
         * Git STDERR Message
         * @param stdErr the value to set
         * @return this builder
         **/
        

        public Builder stdErr(String stdErr) {
        this.stdErr = stdErr;
        return this;
        }
            /**
     * Git exit status
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitExitCode")
        private Integer gitExitCode;

                /**
         * Git exit status
         * @param gitExitCode the value to set
         * @return this builder
         **/
        

        public Builder gitExitCode(Integer gitExitCode) {
        this.gitExitCode = gitExitCode;
        return this;
        }
            /**
     * The path of the current git folder which has to be created for the new branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
        private String gitFolderPath;

                /**
         * The path of the current git folder which has to be created for the new branch
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

        public Builder gitFolderPath(String gitFolderPath) {
        this.gitFolderPath = gitFolderPath;
        return this;
        }


        public CreateGitBranch build() {
            CreateGitBranch model = new CreateGitBranch(this.gitBranchName
                    , this.gitUrl
                    , this.errorMessage
                    , this.stdOut
                    , this.stdErr
                    , this.gitExitCode
                    , this.gitFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGitBranch model) {
                this.gitBranchName(model.getGitBranchName());
    this.gitUrl(model.getGitUrl());
    this.errorMessage(model.getErrorMessage());
    this.stdOut(model.getStdOut());
    this.stdErr(model.getStdErr());
    this.gitExitCode(model.getGitExitCode());
    this.gitFolderPath(model.getGitFolderPath());
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
     * The name of the git branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
    private final String gitBranchName;

        /**
     * The name of the git branch
     * @return the value
     **/
    
    public String getGitBranchName() {
        return gitBranchName;
    }


        /**
     * The git repository url corresponding to the branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
    private final String gitUrl;

        /**
     * The git repository url corresponding to the branch
     * @return the value
     **/
    
    public String getGitUrl() {
        return gitUrl;
    }


        /**
     * Git Error Message
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * Git Error Message
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
    }


        /**
     * Git STDOUT Message
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stdOut")
    private final String stdOut;

        /**
     * Git STDOUT Message
     * @return the value
     **/
    
    public String getStdOut() {
        return stdOut;
    }


        /**
     * Git STDERR Message
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stdErr")
    private final String stdErr;

        /**
     * Git STDERR Message
     * @return the value
     **/
    
    public String getStdErr() {
        return stdErr;
    }


        /**
     * Git exit status
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitExitCode")
    private final Integer gitExitCode;

        /**
     * Git exit status
     * @return the value
     **/
    
    public Integer getGitExitCode() {
        return gitExitCode;
    }


        /**
     * The path of the current git folder which has to be created for the new branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * The path of the current git folder which has to be created for the new branch
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
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
        sb.append("CreateGitBranch(");
        sb.append("gitBranchName=").append(String.valueOf(this.gitBranchName));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", stdOut=").append(String.valueOf(this.stdOut));
        sb.append(", stdErr=").append(String.valueOf(this.stdErr));
        sb.append(", gitExitCode=").append(String.valueOf(this.gitExitCode));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGitBranch)) {
            return false;
        }

        CreateGitBranch other = (CreateGitBranch) o;
        return java.util.Objects.equals(this.gitBranchName, other.gitBranchName) &&
            java.util.Objects.equals(this.gitUrl, other.gitUrl) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.equals(this.stdOut, other.stdOut) &&
            java.util.Objects.equals(this.stdErr, other.stdErr) &&
            java.util.Objects.equals(this.gitExitCode, other.gitExitCode) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitBranchName == null ? 43 : this.gitBranchName.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.stdOut == null ? 43 : this.stdOut.hashCode());
        result = (result * PRIME) + (this.stdErr == null ? 43 : this.stdErr.hashCode());
        result = (result * PRIME) + (this.gitExitCode == null ? 43 : this.gitExitCode.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        return result;
    }


}
