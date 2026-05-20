// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Git branch details.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitBranch.Builder.class)

public final class GitBranch  {
    @Deprecated
    @java.beans.ConstructorProperties({"branchName", "gitUrl", "errorMessage", "stdOut", "stdErr", "gitExitCode"})
    public GitBranch(String branchName, String gitUrl, String errorMessage, String stdOut, String stdErr, Integer gitExitCode) {
        super();
        this.branchName = branchName;
        this.gitUrl = gitUrl;
        this.errorMessage = errorMessage;
        this.stdOut = stdOut;
        this.stdErr = stdErr;
        this.gitExitCode = gitExitCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The name of the Git branch.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

                /**
         * The name of the Git branch.
         * @param branchName the value to set
         * @return this builder
         **/
        

        public Builder branchName(String branchName) {
        this.branchName = branchName;
        return this;
        }
            /**
     * The Git repository URL corresponding to the branch.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
        private String gitUrl;

                /**
         * The Git repository URL corresponding to the branch.
         * @param gitUrl the value to set
         * @return this builder
         **/
        

        public Builder gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
        }
            /**
     * Git error message.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

                /**
         * Git error message.
         * @param errorMessage the value to set
         * @return this builder
         **/
        

        public Builder errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
        }
            /**
     * Git STDOUT message.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("stdOut")
        private String stdOut;

                /**
         * Git STDOUT message.
         * @param stdOut the value to set
         * @return this builder
         **/
        

        public Builder stdOut(String stdOut) {
        this.stdOut = stdOut;
        return this;
        }
            /**
     * Git STDERR message.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("stdErr")
        private String stdErr;

                /**
         * Git STDERR message.
         * @param stdErr the value to set
         * @return this builder
         **/
        

        public Builder stdErr(String stdErr) {
        this.stdErr = stdErr;
        return this;
        }
            /**
     * Git exit status.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitExitCode")
        private Integer gitExitCode;

                /**
         * Git exit status.
         * @param gitExitCode the value to set
         * @return this builder
         **/
        

        public Builder gitExitCode(Integer gitExitCode) {
        this.gitExitCode = gitExitCode;
        return this;
        }


        public GitBranch build() {
            GitBranch model = new GitBranch(this.branchName
                    , this.gitUrl
                    , this.errorMessage
                    , this.stdOut
                    , this.stdErr
                    , this.gitExitCode);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitBranch model) {
                this.branchName(model.getBranchName());
    this.gitUrl(model.getGitUrl());
    this.errorMessage(model.getErrorMessage());
    this.stdOut(model.getStdOut());
    this.stdErr(model.getStdErr());
    this.gitExitCode(model.getGitExitCode());
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
     * The name of the Git branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * The name of the Git branch.
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * The Git repository URL corresponding to the branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
    private final String gitUrl;

        /**
     * The Git repository URL corresponding to the branch.
     * @return the value
     **/
    
    public String getGitUrl() {
        return gitUrl;
    }


        /**
     * Git error message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * Git error message.
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
    }


        /**
     * Git STDOUT message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stdOut")
    private final String stdOut;

        /**
     * Git STDOUT message.
     * @return the value
     **/
    
    public String getStdOut() {
        return stdOut;
    }


        /**
     * Git STDERR message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stdErr")
    private final String stdErr;

        /**
     * Git STDERR message.
     * @return the value
     **/
    
    public String getStdErr() {
        return stdErr;
    }


        /**
     * Git exit status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitExitCode")
    private final Integer gitExitCode;

        /**
     * Git exit status.
     * @return the value
     **/
    
    public Integer getGitExitCode() {
        return gitExitCode;
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
        sb.append("GitBranch(");
        sb.append("branchName=").append(String.valueOf(this.branchName));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", stdOut=").append(String.valueOf(this.stdOut));
        sb.append(", stdErr=").append(String.valueOf(this.stdErr));
        sb.append(", gitExitCode=").append(String.valueOf(this.gitExitCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitBranch)) {
            return false;
        }

        GitBranch other = (GitBranch) o;
        return java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.gitUrl, other.gitUrl) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage) &&
            java.util.Objects.equals(this.stdOut, other.stdOut) &&
            java.util.Objects.equals(this.stdErr, other.stdErr) &&
            java.util.Objects.equals(this.gitExitCode, other.gitExitCode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.stdOut == null ? 43 : this.stdOut.hashCode());
        result = (result * PRIME) + (this.stdErr == null ? 43 : this.stdErr.hashCode());
        result = (result * PRIME) + (this.gitExitCode == null ? 43 : this.gitExitCode.hashCode());
        return result;
    }


}
