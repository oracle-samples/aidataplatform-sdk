# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateGitFolderDetails(object):
    """
    The data to create a Git folder in a workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateGitFolderDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param folder_path:
            The value to assign to the folder_path property of this CreateGitFolderDetails.
        :type folder_path: str

        :param git_provider_key:
            The value to assign to the git_provider_key property of this CreateGitFolderDetails.
        :type git_provider_key: str

        :param git_repository_url:
            The value to assign to the git_repository_url property of this CreateGitFolderDetails.
        :type git_repository_url: str

        :param branch_name:
            The value to assign to the branch_name property of this CreateGitFolderDetails.
        :type branch_name: str

        :param credential_key:
            The value to assign to the credential_key property of this CreateGitFolderDetails.
        :type credential_key: str

        :param description:
            The value to assign to the description property of this CreateGitFolderDetails.
        :type description: str

        """
        self.swagger_types = {
            'folder_path': 'str',
            'git_provider_key': 'str',
            'git_repository_url': 'str',
            'branch_name': 'str',
            'credential_key': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'folder_path': 'folderPath',
            'git_provider_key': 'gitProviderKey',
            'git_repository_url': 'gitRepositoryUrl',
            'branch_name': 'branchName',
            'credential_key': 'credentialKey',
            'description': 'description'
        }

        self._folder_path = None
        self._git_provider_key = None
        self._git_repository_url = None
        self._branch_name = None
        self._credential_key = None
        self._description = None

    @property
    def folder_path(self):
        """
        **[Required]** Gets the folder_path of this CreateGitFolderDetails.
        The absolute path of the Git folder user wants to create.


        :return: The folder_path of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._folder_path

    @folder_path.setter
    def folder_path(self, folder_path):
        """
        Sets the folder_path of this CreateGitFolderDetails.
        The absolute path of the Git folder user wants to create.


        :param folder_path: The folder_path of this CreateGitFolderDetails.
        :type: str
        """
        self._folder_path = folder_path

    @property
    def git_provider_key(self):
        """
        Gets the git_provider_key of this CreateGitFolderDetails.
        key corresponding to Git service provider in git provider table.


        :return: The git_provider_key of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._git_provider_key

    @git_provider_key.setter
    def git_provider_key(self, git_provider_key):
        """
        Sets the git_provider_key of this CreateGitFolderDetails.
        key corresponding to Git service provider in git provider table.


        :param git_provider_key: The git_provider_key of this CreateGitFolderDetails.
        :type: str
        """
        self._git_provider_key = git_provider_key

    @property
    def git_repository_url(self):
        """
        **[Required]** Gets the git_repository_url of this CreateGitFolderDetails.
        Git repository url used to clone.


        :return: The git_repository_url of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._git_repository_url

    @git_repository_url.setter
    def git_repository_url(self, git_repository_url):
        """
        Sets the git_repository_url of this CreateGitFolderDetails.
        Git repository url used to clone.


        :param git_repository_url: The git_repository_url of this CreateGitFolderDetails.
        :type: str
        """
        self._git_repository_url = git_repository_url

    @property
    def branch_name(self):
        """
        **[Required]** Gets the branch_name of this CreateGitFolderDetails.
        Git branch name that is cloned.


        :return: The branch_name of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this CreateGitFolderDetails.
        Git branch name that is cloned.


        :param branch_name: The branch_name of this CreateGitFolderDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def credential_key(self):
        """
        **[Required]** Gets the credential_key of this CreateGitFolderDetails.
        Credential key of the stored git credentials.


        :return: The credential_key of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this CreateGitFolderDetails.
        Credential key of the stored git credentials.


        :param credential_key: The credential_key of this CreateGitFolderDetails.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def description(self):
        """
        Gets the description of this CreateGitFolderDetails.
        Short description about the git repository.


        :return: The description of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateGitFolderDetails.
        Short description about the git repository.


        :param description: The description of this CreateGitFolderDetails.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
