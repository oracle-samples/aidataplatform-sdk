# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitRepository(object):
    """
    Details about a Git repository.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitRepository object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this GitRepository.
        :type key: str

        :param workspace_key:
            The value to assign to the workspace_key property of this GitRepository.
        :type workspace_key: str

        :param branch_name:
            The value to assign to the branch_name property of this GitRepository.
        :type branch_name: str

        :param git_url:
            The value to assign to the git_url property of this GitRepository.
        :type git_url: str

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitRepository.
        :type git_folder_path: str

        :param credential_key:
            The value to assign to the credential_key property of this GitRepository.
        :type credential_key: str

        """
        self.swagger_types = {
            'key': 'str',
            'workspace_key': 'str',
            'branch_name': 'str',
            'git_url': 'str',
            'git_folder_path': 'str',
            'credential_key': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'workspace_key': 'workspaceKey',
            'branch_name': 'branchName',
            'git_url': 'gitUrl',
            'git_folder_path': 'gitFolderPath',
            'credential_key': 'credentialKey'
        }

        self._key = None
        self._workspace_key = None
        self._branch_name = None
        self._git_url = None
        self._git_folder_path = None
        self._credential_key = None

    @property
    def key(self):
        """
        **[Required]** Gets the key of this GitRepository.
        Unique key associated with repository.


        :return: The key of this GitRepository.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this GitRepository.
        Unique key associated with repository.


        :param key: The key of this GitRepository.
        :type: str
        """
        self._key = key

    @property
    def workspace_key(self):
        """
        **[Required]** Gets the workspace_key of this GitRepository.
        The workspaceKey associated with the Git repository.


        :return: The workspace_key of this GitRepository.
        :rtype: str
        """
        return self._workspace_key

    @workspace_key.setter
    def workspace_key(self, workspace_key):
        """
        Sets the workspace_key of this GitRepository.
        The workspaceKey associated with the Git repository.


        :param workspace_key: The workspace_key of this GitRepository.
        :type: str
        """
        self._workspace_key = workspace_key

    @property
    def branch_name(self):
        """
        **[Required]** Gets the branch_name of this GitRepository.
        The name of the Git branch.


        :return: The branch_name of this GitRepository.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitRepository.
        The name of the Git branch.


        :param branch_name: The branch_name of this GitRepository.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def git_url(self):
        """
        **[Required]** Gets the git_url of this GitRepository.
        The Git repository url corresponding to the branch.


        :return: The git_url of this GitRepository.
        :rtype: str
        """
        return self._git_url

    @git_url.setter
    def git_url(self, git_url):
        """
        Sets the git_url of this GitRepository.
        The Git repository url corresponding to the branch.


        :param git_url: The git_url of this GitRepository.
        :type: str
        """
        self._git_url = git_url

    @property
    def git_folder_path(self):
        """
        **[Required]** Gets the git_folder_path of this GitRepository.
        The path of the current Git folder which has to be created for the new branch.


        :return: The git_folder_path of this GitRepository.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitRepository.
        The path of the current Git folder which has to be created for the new branch.


        :param git_folder_path: The git_folder_path of this GitRepository.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def credential_key(self):
        """
        Gets the credential_key of this GitRepository.
        The credential setting key


        :return: The credential_key of this GitRepository.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this GitRepository.
        The credential setting key


        :param credential_key: The credential_key of this GitRepository.
        :type: str
        """
        self._credential_key = credential_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
