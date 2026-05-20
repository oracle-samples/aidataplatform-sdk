# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitRestoreBranchDetails(object):
    """
    Details needed to restore/discard local changes for a folder context.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitRestoreBranchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitRestoreBranchDetails.
        :type git_folder_path: str

        :param branch_name:
            The value to assign to the branch_name property of this GitRestoreBranchDetails.
        :type branch_name: str

        :param restore_files_list:
            The value to assign to the restore_files_list property of this GitRestoreBranchDetails.
        :type restore_files_list: list[str]

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'branch_name': 'str',
            'restore_files_list': 'list[str]'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'branch_name': 'branchName',
            'restore_files_list': 'restoreFilesList'
        }

        self._git_folder_path = None
        self._branch_name = None
        self._restore_files_list = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this GitRestoreBranchDetails.
        Folder path used to locate the Git worktree.


        :return: The git_folder_path of this GitRestoreBranchDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitRestoreBranchDetails.
        Folder path used to locate the Git worktree.


        :param git_folder_path: The git_folder_path of this GitRestoreBranchDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def branch_name(self):
        """
        Gets the branch_name of this GitRestoreBranchDetails.
        The name of the Git branch.


        :return: The branch_name of this GitRestoreBranchDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitRestoreBranchDetails.
        The name of the Git branch.


        :param branch_name: The branch_name of this GitRestoreBranchDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def restore_files_list(self):
        """
        **[Required]** Gets the restore_files_list of this GitRestoreBranchDetails.
        List of files whose local/staged changes you want to discard (repo-relative paths).


        :return: The restore_files_list of this GitRestoreBranchDetails.
        :rtype: list[str]
        """
        return self._restore_files_list

    @restore_files_list.setter
    def restore_files_list(self, restore_files_list):
        """
        Sets the restore_files_list of this GitRestoreBranchDetails.
        List of files whose local/staged changes you want to discard (repo-relative paths).


        :param restore_files_list: The restore_files_list of this GitRestoreBranchDetails.
        :type: list[str]
        """
        self._restore_files_list = restore_files_list

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
