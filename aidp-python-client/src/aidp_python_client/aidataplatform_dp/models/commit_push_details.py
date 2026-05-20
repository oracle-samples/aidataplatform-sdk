# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CommitPushDetails(object):
    """
    Commit staged/local changes and push to remote for the given branch context.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CommitPushDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this CommitPushDetails.
        :type git_folder_path: str

        :param branch_name:
            The value to assign to the branch_name property of this CommitPushDetails.
        :type branch_name: str

        :param files:
            The value to assign to the files property of this CommitPushDetails.
        :type files: list[str]

        :param commit_message:
            The value to assign to the commit_message property of this CommitPushDetails.
        :type commit_message: str

        :param commit_description:
            The value to assign to the commit_description property of this CommitPushDetails.
        :type commit_description: str

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'branch_name': 'str',
            'files': 'list[str]',
            'commit_message': 'str',
            'commit_description': 'str'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'branch_name': 'branchName',
            'files': 'files',
            'commit_message': 'commitMessage',
            'commit_description': 'commitDescription'
        }

        self._git_folder_path = None
        self._branch_name = None
        self._files = None
        self._commit_message = None
        self._commit_description = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this CommitPushDetails.
        Folder path used to locate the Git worktree.


        :return: The git_folder_path of this CommitPushDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this CommitPushDetails.
        Folder path used to locate the Git worktree.


        :param git_folder_path: The git_folder_path of this CommitPushDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def branch_name(self):
        """
        Gets the branch_name of this CommitPushDetails.
        The name of the Git branch.


        :return: The branch_name of this CommitPushDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this CommitPushDetails.
        The name of the Git branch.


        :param branch_name: The branch_name of this CommitPushDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def files(self):
        """
        Gets the files of this CommitPushDetails.
        List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.


        :return: The files of this CommitPushDetails.
        :rtype: list[str]
        """
        return self._files

    @files.setter
    def files(self, files):
        """
        Sets the files of this CommitPushDetails.
        List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.


        :param files: The files of this CommitPushDetails.
        :type: list[str]
        """
        self._files = files

    @property
    def commit_message(self):
        """
        **[Required]** Gets the commit_message of this CommitPushDetails.
        Commit message.


        :return: The commit_message of this CommitPushDetails.
        :rtype: str
        """
        return self._commit_message

    @commit_message.setter
    def commit_message(self, commit_message):
        """
        Sets the commit_message of this CommitPushDetails.
        Commit message.


        :param commit_message: The commit_message of this CommitPushDetails.
        :type: str
        """
        self._commit_message = commit_message

    @property
    def commit_description(self):
        """
        Gets the commit_description of this CommitPushDetails.
        Commit description.


        :return: The commit_description of this CommitPushDetails.
        :rtype: str
        """
        return self._commit_description

    @commit_description.setter
    def commit_description(self, commit_description):
        """
        Sets the commit_description of this CommitPushDetails.
        Commit description.


        :param commit_description: The commit_description of this CommitPushDetails.
        :type: str
        """
        self._commit_description = commit_description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
