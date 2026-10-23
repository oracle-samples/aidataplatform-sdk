# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateGitRepositoryDetails(object):
    """
    Repository URL, authentication, connectivity, and sparse checkout settings to update.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateGitRepositoryDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this UpdateGitRepositoryDetails.
        :type git_folder_path: str

        :param git_url:
            The value to assign to the git_url property of this UpdateGitRepositoryDetails.
        :type git_url: str

        :param credential_key:
            The value to assign to the credential_key property of this UpdateGitRepositoryDetails.
        :type credential_key: str

        :param sparse_checkout:
            The value to assign to the sparse_checkout property of this UpdateGitRepositoryDetails.
        :type sparse_checkout: oci.aidataplatform_dp.models.SparseCheckoutDetails

        :param is_private_connectivity_enabled:
            The value to assign to the is_private_connectivity_enabled property of this UpdateGitRepositoryDetails.
        :type is_private_connectivity_enabled: bool

        :param git_connectivity_profile_key:
            The value to assign to the git_connectivity_profile_key property of this UpdateGitRepositoryDetails.
        :type git_connectivity_profile_key: str

        :param credential_store_key:
            The value to assign to the credential_store_key property of this UpdateGitRepositoryDetails.
        :type credential_store_key: str

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'git_url': 'str',
            'credential_key': 'str',
            'sparse_checkout': 'SparseCheckoutDetails',
            'is_private_connectivity_enabled': 'bool',
            'git_connectivity_profile_key': 'str',
            'credential_store_key': 'str'
        }
        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'git_url': 'gitUrl',
            'credential_key': 'credentialKey',
            'sparse_checkout': 'sparseCheckout',
            'is_private_connectivity_enabled': 'isPrivateConnectivityEnabled',
            'git_connectivity_profile_key': 'gitConnectivityProfileKey',
            'credential_store_key': 'credentialStoreKey'
        }
        self._git_folder_path = None
        self._git_url = None
        self._credential_key = None
        self._sparse_checkout = None
        self._is_private_connectivity_enabled = None
        self._git_connectivity_profile_key = None
        self._credential_store_key = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this UpdateGitRepositoryDetails.
        Workspace Git folder path. The stored repository path is retained; the supplied
        value does not rename or relocate the folder.


        :return: The git_folder_path of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this UpdateGitRepositoryDetails.
        Workspace Git folder path. The stored repository path is retained; the supplied
        value does not rename or relocate the folder.


        :param git_folder_path: The git_folder_path of this UpdateGitRepositoryDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def git_url(self):
        """
        Gets the git_url of this UpdateGitRepositoryDetails.
        The Git repository url corresponding to the branch.


        :return: The git_url of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._git_url

    @git_url.setter
    def git_url(self, git_url):
        """
        Sets the git_url of this UpdateGitRepositoryDetails.
        The Git repository url corresponding to the branch.


        :param git_url: The git_url of this UpdateGitRepositoryDetails.
        :type: str
        """
        self._git_url = git_url

    @property
    def credential_key(self):
        """
        Gets the credential_key of this UpdateGitRepositoryDetails.
        Key of the current user's GIT_ACCOUNT user setting containing Git authentication
        credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
        setting listings. Distinct from credentialStoreKey, which references a TLS
        CA certificate.


        :return: The credential_key of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this UpdateGitRepositoryDetails.
        Key of the current user's GIT_ACCOUNT user setting containing Git authentication
        credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
        setting listings. Distinct from credentialStoreKey, which references a TLS
        CA certificate.


        :param credential_key: The credential_key of this UpdateGitRepositoryDetails.
        :type: str
        """
        self._credential_key = credential_key

    @property
    def sparse_checkout(self):
        """
        Gets the sparse_checkout of this UpdateGitRepositoryDetails.

        :return: The sparse_checkout of this UpdateGitRepositoryDetails.
        :rtype: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        return self._sparse_checkout

    @sparse_checkout.setter
    def sparse_checkout(self, sparse_checkout):
        """
        Sets the sparse_checkout of this UpdateGitRepositoryDetails.

        :param sparse_checkout: The sparse_checkout of this UpdateGitRepositoryDetails.
        :type: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        self._sparse_checkout = sparse_checkout

    @property
    def is_private_connectivity_enabled(self):
        """
        Gets the is_private_connectivity_enabled of this UpdateGitRepositoryDetails.
        Whether this repository uses private network connectivity.


        :return: The is_private_connectivity_enabled of this UpdateGitRepositoryDetails.
        :rtype: bool
        """
        return self._is_private_connectivity_enabled

    @is_private_connectivity_enabled.setter
    def is_private_connectivity_enabled(self, is_private_connectivity_enabled):
        """
        Sets the is_private_connectivity_enabled of this UpdateGitRepositoryDetails.
        Whether this repository uses private network connectivity.


        :param is_private_connectivity_enabled: The is_private_connectivity_enabled of this UpdateGitRepositoryDetails.
        :type: bool
        """
        self._is_private_connectivity_enabled = is_private_connectivity_enabled

    @property
    def git_connectivity_profile_key(self):
        """
        Gets the git_connectivity_profile_key of this UpdateGitRepositoryDetails.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :return: The git_connectivity_profile_key of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._git_connectivity_profile_key

    @git_connectivity_profile_key.setter
    def git_connectivity_profile_key(self, git_connectivity_profile_key):
        """
        Sets the git_connectivity_profile_key of this UpdateGitRepositoryDetails.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :param git_connectivity_profile_key: The git_connectivity_profile_key of this UpdateGitRepositoryDetails.
        :type: str
        """
        self._git_connectivity_profile_key = git_connectivity_profile_key

    @property
    def credential_store_key(self):
        """
        Gets the credential_store_key of this UpdateGitRepositoryDetails.
        Key of the credential-store entry containing the Git server's TLS CA
        certificate, identified by displayName in credential listings. Provides
        server certificate trust, separate from the Git authentication user setting
        referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.


        :return: The credential_store_key of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._credential_store_key

    @credential_store_key.setter
    def credential_store_key(self, credential_store_key):
        """
        Sets the credential_store_key of this UpdateGitRepositoryDetails.
        Key of the credential-store entry containing the Git server's TLS CA
        certificate, identified by displayName in credential listings. Provides
        server certificate trust, separate from the Git authentication user setting
        referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.


        :param credential_store_key: The credential_store_key of this UpdateGitRepositoryDetails.
        :type: str
        """
        self._credential_store_key = credential_store_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
