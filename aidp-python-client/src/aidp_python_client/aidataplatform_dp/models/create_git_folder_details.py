# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



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

        :param is_private_connectivity_enabled:
            The value to assign to the is_private_connectivity_enabled property of this CreateGitFolderDetails.
        :type is_private_connectivity_enabled: bool

        :param git_connectivity_profile_key:
            The value to assign to the git_connectivity_profile_key property of this CreateGitFolderDetails.
        :type git_connectivity_profile_key: str

        :param credential_store_key:
            The value to assign to the credential_store_key property of this CreateGitFolderDetails.
        :type credential_store_key: str

        :param description:
            The value to assign to the description property of this CreateGitFolderDetails.
        :type description: str

        :param sparse_checkout:
            The value to assign to the sparse_checkout property of this CreateGitFolderDetails.
        :type sparse_checkout: oci.aidataplatform_dp.models.SparseCheckoutDetails

        """
        self.swagger_types = {
            'folder_path': 'str',
            'git_provider_key': 'str',
            'git_repository_url': 'str',
            'branch_name': 'str',
            'credential_key': 'str',
            'is_private_connectivity_enabled': 'bool',
            'git_connectivity_profile_key': 'str',
            'credential_store_key': 'str',
            'description': 'str',
            'sparse_checkout': 'SparseCheckoutDetails'
        }
        self.attribute_map = {
            'folder_path': 'folderPath',
            'git_provider_key': 'gitProviderKey',
            'git_repository_url': 'gitRepositoryUrl',
            'branch_name': 'branchName',
            'credential_key': 'credentialKey',
            'is_private_connectivity_enabled': 'isPrivateConnectivityEnabled',
            'git_connectivity_profile_key': 'gitConnectivityProfileKey',
            'credential_store_key': 'credentialStoreKey',
            'description': 'description',
            'sparse_checkout': 'sparseCheckout'
        }
        self._folder_path = None
        self._git_provider_key = None
        self._git_repository_url = None
        self._branch_name = None
        self._credential_key = None
        self._is_private_connectivity_enabled = None
        self._git_connectivity_profile_key = None
        self._credential_store_key = None
        self._description = None
        self._sparse_checkout = None

    @property
    def folder_path(self):
        """
        **[Required]** Gets the folder_path of this CreateGitFolderDetails.
        Workspace-relative path of the Git folder, without a leading slash (for example, `sample-repo`). The folder is located at `/Workspace/<folderPath>`.


        :return: The folder_path of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._folder_path

    @folder_path.setter
    def folder_path(self, folder_path):
        """
        Sets the folder_path of this CreateGitFolderDetails.
        Workspace-relative path of the Git folder, without a leading slash (for example, `sample-repo`). The folder is located at `/Workspace/<folderPath>`.


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
        Key of the current user's GIT_ACCOUNT user setting for repository authentication.
        User setting listings identify it by settingType=GIT_ACCOUNT and displayName;
        the matching entry's key is the credentialKey.


        :return: The credential_key of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this CreateGitFolderDetails.
        Key of the current user's GIT_ACCOUNT user setting for repository authentication.
        User setting listings identify it by settingType=GIT_ACCOUNT and displayName;
        the matching entry's key is the credentialKey.


        :param credential_key: The credential_key of this CreateGitFolderDetails.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def is_private_connectivity_enabled(self):
        """
        Gets the is_private_connectivity_enabled of this CreateGitFolderDetails.
        Whether this Git folder uses private network connectivity.


        :return: The is_private_connectivity_enabled of this CreateGitFolderDetails.
        :rtype: bool
        """
        return self._is_private_connectivity_enabled

    @is_private_connectivity_enabled.setter
    def is_private_connectivity_enabled(self, is_private_connectivity_enabled):
        """
        Sets the is_private_connectivity_enabled of this CreateGitFolderDetails.
        Whether this Git folder uses private network connectivity.


        :param is_private_connectivity_enabled: The is_private_connectivity_enabled of this CreateGitFolderDetails.
        :type: bool
        """
        self._is_private_connectivity_enabled = is_private_connectivity_enabled

    @property
    def git_connectivity_profile_key(self):
        """
        Gets the git_connectivity_profile_key of this CreateGitFolderDetails.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :return: The git_connectivity_profile_key of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._git_connectivity_profile_key

    @git_connectivity_profile_key.setter
    def git_connectivity_profile_key(self, git_connectivity_profile_key):
        """
        Sets the git_connectivity_profile_key of this CreateGitFolderDetails.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :param git_connectivity_profile_key: The git_connectivity_profile_key of this CreateGitFolderDetails.
        :type: str
        """
        self._git_connectivity_profile_key = git_connectivity_profile_key

    @property
    def credential_store_key(self):
        """
        Gets the credential_store_key of this CreateGitFolderDetails.
        Key of the credential containing the Git server's TLS CA certificate,
        returned by credential listings filtered by displayName. Required when
        isPrivateConnectivityEnabled is true.


        :return: The credential_store_key of this CreateGitFolderDetails.
        :rtype: str
        """
        return self._credential_store_key

    @credential_store_key.setter
    def credential_store_key(self, credential_store_key):
        """
        Sets the credential_store_key of this CreateGitFolderDetails.
        Key of the credential containing the Git server's TLS CA certificate,
        returned by credential listings filtered by displayName. Required when
        isPrivateConnectivityEnabled is true.


        :param credential_store_key: The credential_store_key of this CreateGitFolderDetails.
        :type: str
        """
        self._credential_store_key = credential_store_key

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

    @property
    def sparse_checkout(self):
        """
        Gets the sparse_checkout of this CreateGitFolderDetails.

        :return: The sparse_checkout of this CreateGitFolderDetails.
        :rtype: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        return self._sparse_checkout

    @sparse_checkout.setter
    def sparse_checkout(self, sparse_checkout):
        """
        Sets the sparse_checkout of this CreateGitFolderDetails.

        :param sparse_checkout: The sparse_checkout of this CreateGitFolderDetails.
        :type: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        self._sparse_checkout = sparse_checkout

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
