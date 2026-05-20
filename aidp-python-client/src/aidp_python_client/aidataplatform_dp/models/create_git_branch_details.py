# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateGitBranchDetails(object):
    """
    Information required to create a new Git branch.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateGitBranchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_branch_name:
            The value to assign to the git_branch_name property of this CreateGitBranchDetails.
        :type git_branch_name: str

        :param git_folder_path:
            The value to assign to the git_folder_path property of this CreateGitBranchDetails.
        :type git_folder_path: str

        """
        self.swagger_types = {
            'git_branch_name': 'str',
            'git_folder_path': 'str'
        }

        self.attribute_map = {
            'git_branch_name': 'gitBranchName',
            'git_folder_path': 'gitFolderPath'
        }

        self._git_branch_name = None
        self._git_folder_path = None

    @property
    def git_branch_name(self):
        """
        **[Required]** Gets the git_branch_name of this CreateGitBranchDetails.
        The name of the Git branch.


        :return: The git_branch_name of this CreateGitBranchDetails.
        :rtype: str
        """
        return self._git_branch_name

    @git_branch_name.setter
    def git_branch_name(self, git_branch_name):
        """
        Sets the git_branch_name of this CreateGitBranchDetails.
        The name of the Git branch.


        :param git_branch_name: The git_branch_name of this CreateGitBranchDetails.
        :type: str
        """
        self._git_branch_name = git_branch_name

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this CreateGitBranchDetails.
        The path of the current Git folder which has to be created for the new branch.


        :return: The git_folder_path of this CreateGitBranchDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this CreateGitBranchDetails.
        The path of the current Git folder which has to be created for the new branch.


        :param git_folder_path: The git_folder_path of this CreateGitBranchDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
