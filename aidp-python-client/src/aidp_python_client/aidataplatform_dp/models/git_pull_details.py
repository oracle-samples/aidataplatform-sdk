# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitPullDetails(object):
    """
    Pull remote changes for the given branch context (supports continue/abort during merge).
    """

    #: A constant which can be used with the pull_action property of a GitPullDetails.
    #: This constant has a value of "PULL"
    PULL_ACTION_PULL = "PULL"

    #: A constant which can be used with the pull_action property of a GitPullDetails.
    #: This constant has a value of "MERGE_CONTINUE"
    PULL_ACTION_MERGE_CONTINUE = "MERGE_CONTINUE"

    #: A constant which can be used with the pull_action property of a GitPullDetails.
    #: This constant has a value of "MERGE_ABORT"
    PULL_ACTION_MERGE_ABORT = "MERGE_ABORT"

    def __init__(self, **kwargs):
        """
        Initializes a new GitPullDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitPullDetails.
        :type git_folder_path: str

        :param branch_name:
            The value to assign to the branch_name property of this GitPullDetails.
        :type branch_name: str

        :param remote_branch_name:
            The value to assign to the remote_branch_name property of this GitPullDetails.
        :type remote_branch_name: str

        :param pull_action:
            The value to assign to the pull_action property of this GitPullDetails.
            Allowed values for this property are: "PULL", "MERGE_CONTINUE", "MERGE_ABORT"
        :type pull_action: str

        :param commit_message:
            The value to assign to the commit_message property of this GitPullDetails.
        :type commit_message: str

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'branch_name': 'str',
            'remote_branch_name': 'str',
            'pull_action': 'str',
            'commit_message': 'str'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'branch_name': 'branchName',
            'remote_branch_name': 'remoteBranchName',
            'pull_action': 'pullAction',
            'commit_message': 'commitMessage'
        }

        self._git_folder_path = None
        self._branch_name = None
        self._remote_branch_name = None
        self._pull_action = None
        self._commit_message = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this GitPullDetails.
        Folder path used to locate the git worktree.


        :return: The git_folder_path of this GitPullDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitPullDetails.
        Folder path used to locate the git worktree.


        :param git_folder_path: The git_folder_path of this GitPullDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def branch_name(self):
        """
        Gets the branch_name of this GitPullDetails.
        The name of the git branch


        :return: The branch_name of this GitPullDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitPullDetails.
        The name of the git branch


        :param branch_name: The branch_name of this GitPullDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def remote_branch_name(self):
        """
        Gets the remote_branch_name of this GitPullDetails.
        Remote branch to pull from. Defaults to branchName if not provided.


        :return: The remote_branch_name of this GitPullDetails.
        :rtype: str
        """
        return self._remote_branch_name

    @remote_branch_name.setter
    def remote_branch_name(self, remote_branch_name):
        """
        Sets the remote_branch_name of this GitPullDetails.
        Remote branch to pull from. Defaults to branchName if not provided.


        :param remote_branch_name: The remote_branch_name of this GitPullDetails.
        :type: str
        """
        self._remote_branch_name = remote_branch_name

    @property
    def pull_action(self):
        """
        Gets the pull_action of this GitPullDetails.
        Pull behavior requested by the caller.

        Allowed values for this property are: "PULL", "MERGE_CONTINUE", "MERGE_ABORT"


        :return: The pull_action of this GitPullDetails.
        :rtype: str
        """
        return self._pull_action

    @pull_action.setter
    def pull_action(self, pull_action):
        """
        Sets the pull_action of this GitPullDetails.
        Pull behavior requested by the caller.


        :param pull_action: The pull_action of this GitPullDetails.
        :type: str
        """
        allowed_values = ["PULL", "MERGE_CONTINUE", "MERGE_ABORT"]
        if not value_allowed_none_or_none_sentinel(pull_action, allowed_values):
            raise ValueError(
                "Invalid value for `pull_action`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._pull_action = pull_action

    @property
    def commit_message(self):
        """
        Gets the commit_message of this GitPullDetails.
        Commit message used only when pullAction is MERGE_CONTINUE.


        :return: The commit_message of this GitPullDetails.
        :rtype: str
        """
        return self._commit_message

    @commit_message.setter
    def commit_message(self, commit_message):
        """
        Sets the commit_message of this GitPullDetails.
        Commit message used only when pullAction is MERGE_CONTINUE.


        :param commit_message: The commit_message of this GitPullDetails.
        :type: str
        """
        self._commit_message = commit_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
