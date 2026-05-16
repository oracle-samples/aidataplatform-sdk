# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitRebaseDetails(object):
    """
    Details needed to perform a git rebase for a folder context.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitRebaseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitRebaseDetails.
        :type git_folder_path: str

        :param branch_name:
            The value to assign to the branch_name property of this GitRebaseDetails.
        :type branch_name: str

        :param remote_branch_name:
            The value to assign to the remote_branch_name property of this GitRebaseDetails.
        :type remote_branch_name: str

        :param commit_id:
            The value to assign to the commit_id property of this GitRebaseDetails.
        :type commit_id: str

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'branch_name': 'str',
            'remote_branch_name': 'str',
            'commit_id': 'str'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'branch_name': 'branchName',
            'remote_branch_name': 'remoteBranchName',
            'commit_id': 'commitId'
        }

        self._git_folder_path = None
        self._branch_name = None
        self._remote_branch_name = None
        self._commit_id = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this GitRebaseDetails.
        Folder path used to locate the git worktree.


        :return: The git_folder_path of this GitRebaseDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitRebaseDetails.
        Folder path used to locate the git worktree.


        :param git_folder_path: The git_folder_path of this GitRebaseDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def branch_name(self):
        """
        Gets the branch_name of this GitRebaseDetails.
        The name of the git branch


        :return: The branch_name of this GitRebaseDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitRebaseDetails.
        The name of the git branch


        :param branch_name: The branch_name of this GitRebaseDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def remote_branch_name(self):
        """
        **[Required]** Gets the remote_branch_name of this GitRebaseDetails.
        Remote branch name to rebase onto (optional).


        :return: The remote_branch_name of this GitRebaseDetails.
        :rtype: str
        """
        return self._remote_branch_name

    @remote_branch_name.setter
    def remote_branch_name(self, remote_branch_name):
        """
        Sets the remote_branch_name of this GitRebaseDetails.
        Remote branch name to rebase onto (optional).


        :param remote_branch_name: The remote_branch_name of this GitRebaseDetails.
        :type: str
        """
        self._remote_branch_name = remote_branch_name

    @property
    def commit_id(self):
        """
        Gets the commit_id of this GitRebaseDetails.
        Commit id to rebase onto (optional).


        :return: The commit_id of this GitRebaseDetails.
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """
        Sets the commit_id of this GitRebaseDetails.
        Commit id to rebase onto (optional).


        :param commit_id: The commit_id of this GitRebaseDetails.
        :type: str
        """
        self._commit_id = commit_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
