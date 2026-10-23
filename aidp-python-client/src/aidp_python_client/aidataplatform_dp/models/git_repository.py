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

        :param sparse_checkout:
            The value to assign to the sparse_checkout property of this GitRepository.
        :type sparse_checkout: oci.aidataplatform_dp.models.SparseCheckoutDetails

        :param is_private_connectivity_enabled:
            The value to assign to the is_private_connectivity_enabled property of this GitRepository.
        :type is_private_connectivity_enabled: bool

        :param git_connectivity_profile_key:
            The value to assign to the git_connectivity_profile_key property of this GitRepository.
        :type git_connectivity_profile_key: str

        :param git_connectivity_profile_name:
            The value to assign to the git_connectivity_profile_name property of this GitRepository.
        :type git_connectivity_profile_name: str

        :param credential_store_key:
            The value to assign to the credential_store_key property of this GitRepository.
        :type credential_store_key: str

        :param credential_store_name:
            The value to assign to the credential_store_name property of this GitRepository.
        :type credential_store_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'workspace_key': 'str',
            'branch_name': 'str',
            'git_url': 'str',
            'git_folder_path': 'str',
            'credential_key': 'str',
            'sparse_checkout': 'SparseCheckoutDetails',
            'is_private_connectivity_enabled': 'bool',
            'git_connectivity_profile_key': 'str',
            'git_connectivity_profile_name': 'str',
            'credential_store_key': 'str',
            'credential_store_name': 'str'
        }
        self.attribute_map = {
            'key': 'key',
            'workspace_key': 'workspaceKey',
            'branch_name': 'branchName',
            'git_url': 'gitUrl',
            'git_folder_path': 'gitFolderPath',
            'credential_key': 'credentialKey',
            'sparse_checkout': 'sparseCheckout',
            'is_private_connectivity_enabled': 'isPrivateConnectivityEnabled',
            'git_connectivity_profile_key': 'gitConnectivityProfileKey',
            'git_connectivity_profile_name': 'gitConnectivityProfileName',
            'credential_store_key': 'credentialStoreKey',
            'credential_store_name': 'credentialStoreName'
        }
        self._key = None
        self._workspace_key = None
        self._branch_name = None
        self._git_url = None
        self._git_folder_path = None
        self._credential_key = None
        self._sparse_checkout = None
        self._is_private_connectivity_enabled = None
        self._git_connectivity_profile_key = None
        self._git_connectivity_profile_name = None
        self._credential_store_key = None
        self._credential_store_name = None

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
        Key of the current user's GIT_ACCOUNT user setting containing Git authentication
        credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
        setting listings. Distinct from credentialStoreKey, which references a TLS
        CA certificate.


        :return: The credential_key of this GitRepository.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this GitRepository.
        Key of the current user's GIT_ACCOUNT user setting containing Git authentication
        credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
        setting listings. Distinct from credentialStoreKey, which references a TLS
        CA certificate.


        :param credential_key: The credential_key of this GitRepository.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def sparse_checkout(self):
        """
        Gets the sparse_checkout of this GitRepository.

        :return: The sparse_checkout of this GitRepository.
        :rtype: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        return self._sparse_checkout

    @sparse_checkout.setter
    def sparse_checkout(self, sparse_checkout):
        """
        Sets the sparse_checkout of this GitRepository.

        :param sparse_checkout: The sparse_checkout of this GitRepository.
        :type: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        self._sparse_checkout = sparse_checkout

    @property
    def is_private_connectivity_enabled(self):
        """
        Gets the is_private_connectivity_enabled of this GitRepository.
        Whether this repository uses private network connectivity.


        :return: The is_private_connectivity_enabled of this GitRepository.
        :rtype: bool
        """
        return self._is_private_connectivity_enabled

    @is_private_connectivity_enabled.setter
    def is_private_connectivity_enabled(self, is_private_connectivity_enabled):
        """
        Sets the is_private_connectivity_enabled of this GitRepository.
        Whether this repository uses private network connectivity.


        :param is_private_connectivity_enabled: The is_private_connectivity_enabled of this GitRepository.
        :type: bool
        """
        self._is_private_connectivity_enabled = is_private_connectivity_enabled

    @property
    def git_connectivity_profile_key(self):
        """
        Gets the git_connectivity_profile_key of this GitRepository.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :return: The git_connectivity_profile_key of this GitRepository.
        :rtype: str
        """
        return self._git_connectivity_profile_key

    @git_connectivity_profile_key.setter
    def git_connectivity_profile_key(self, git_connectivity_profile_key):
        """
        Sets the git_connectivity_profile_key of this GitRepository.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :param git_connectivity_profile_key: The git_connectivity_profile_key of this GitRepository.
        :type: str
        """
        self._git_connectivity_profile_key = git_connectivity_profile_key

    @property
    def git_connectivity_profile_name(self):
        """
        Gets the git_connectivity_profile_name of this GitRepository.
        User-friendly name of the private Git connectivity profile.


        :return: The git_connectivity_profile_name of this GitRepository.
        :rtype: str
        """
        return self._git_connectivity_profile_name

    @git_connectivity_profile_name.setter
    def git_connectivity_profile_name(self, git_connectivity_profile_name):
        """
        Sets the git_connectivity_profile_name of this GitRepository.
        User-friendly name of the private Git connectivity profile.


        :param git_connectivity_profile_name: The git_connectivity_profile_name of this GitRepository.
        :type: str
        """
        self._git_connectivity_profile_name = git_connectivity_profile_name

    @property
    def credential_store_key(self):
        """
        Gets the credential_store_key of this GitRepository.
        Key of the credential-store entry containing the Git server's TLS CA
        certificate, identified by displayName in credential listings. Provides
        server certificate trust, separate from the Git authentication user setting
        referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.


        :return: The credential_store_key of this GitRepository.
        :rtype: str
        """
        return self._credential_store_key

    @credential_store_key.setter
    def credential_store_key(self, credential_store_key):
        """
        Sets the credential_store_key of this GitRepository.
        Key of the credential-store entry containing the Git server's TLS CA
        certificate, identified by displayName in credential listings. Provides
        server certificate trust, separate from the Git authentication user setting
        referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.


        :param credential_store_key: The credential_store_key of this GitRepository.
        :type: str
        """
        self._credential_store_key = credential_store_key

    @property
    def credential_store_name(self):
        """
        Gets the credential_store_name of this GitRepository.
        User-friendly display name of the repository TLS CA certificate credential.


        :return: The credential_store_name of this GitRepository.
        :rtype: str
        """
        return self._credential_store_name

    @credential_store_name.setter
    def credential_store_name(self, credential_store_name):
        """
        Sets the credential_store_name of this GitRepository.
        User-friendly display name of the repository TLS CA certificate credential.


        :param credential_store_name: The credential_store_name of this GitRepository.
        :type: str
        """
        self._credential_store_name = credential_store_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
