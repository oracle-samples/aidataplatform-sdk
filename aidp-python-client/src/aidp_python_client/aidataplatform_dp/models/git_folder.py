# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitFolder(object):
    """
    A workspace Git folder and its repository, branch, and connectivity settings.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitFolder object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param folder_path:
            The value to assign to the folder_path property of this GitFolder.
        :type folder_path: str

        :param git_provider_key:
            The value to assign to the git_provider_key property of this GitFolder.
        :type git_provider_key: str

        :param git_repository_url:
            The value to assign to the git_repository_url property of this GitFolder.
        :type git_repository_url: str

        :param description:
            The value to assign to the description property of this GitFolder.
        :type description: str

        :param branch_name:
            The value to assign to the branch_name property of this GitFolder.
        :type branch_name: str

        :param is_private_connectivity_enabled:
            The value to assign to the is_private_connectivity_enabled property of this GitFolder.
        :type is_private_connectivity_enabled: bool

        :param git_connectivity_profile_key:
            The value to assign to the git_connectivity_profile_key property of this GitFolder.
        :type git_connectivity_profile_key: str

        :param credential_store_key:
            The value to assign to the credential_store_key property of this GitFolder.
        :type credential_store_key: str

        :param folder_metadata:
            The value to assign to the folder_metadata property of this GitFolder.
        :type folder_metadata: dict(str, object)

        :param sparse_checkout:
            The value to assign to the sparse_checkout property of this GitFolder.
        :type sparse_checkout: oci.aidataplatform_dp.models.SparseCheckoutDetails

        """
        self.swagger_types = {
            'folder_path': 'str',
            'git_provider_key': 'str',
            'git_repository_url': 'str',
            'description': 'str',
            'branch_name': 'str',
            'is_private_connectivity_enabled': 'bool',
            'git_connectivity_profile_key': 'str',
            'credential_store_key': 'str',
            'folder_metadata': 'dict(str, object)',
            'sparse_checkout': 'SparseCheckoutDetails'
        }
        self.attribute_map = {
            'folder_path': 'folderPath',
            'git_provider_key': 'gitProviderKey',
            'git_repository_url': 'gitRepositoryUrl',
            'description': 'description',
            'branch_name': 'branchName',
            'is_private_connectivity_enabled': 'isPrivateConnectivityEnabled',
            'git_connectivity_profile_key': 'gitConnectivityProfileKey',
            'credential_store_key': 'credentialStoreKey',
            'folder_metadata': 'folderMetadata',
            'sparse_checkout': 'sparseCheckout'
        }
        self._folder_path = None
        self._git_provider_key = None
        self._git_repository_url = None
        self._description = None
        self._branch_name = None
        self._is_private_connectivity_enabled = None
        self._git_connectivity_profile_key = None
        self._credential_store_key = None
        self._folder_metadata = None
        self._sparse_checkout = None

    @property
    def folder_path(self):
        """
        **[Required]** Gets the folder_path of this GitFolder.
        Workspace-relative path of the Git folder, without a leading slash (for example, `sample-repo`). The folder is located at `/Workspace/<folderPath>`.


        :return: The folder_path of this GitFolder.
        :rtype: str
        """
        return self._folder_path

    @folder_path.setter
    def folder_path(self, folder_path):
        """
        Sets the folder_path of this GitFolder.
        Workspace-relative path of the Git folder, without a leading slash (for example, `sample-repo`). The folder is located at `/Workspace/<folderPath>`.


        :param folder_path: The folder_path of this GitFolder.
        :type: str
        """
        self._folder_path = folder_path

    @property
    def git_provider_key(self):
        """
        Gets the git_provider_key of this GitFolder.
        key corresponding to Git service provider in git provider table.


        :return: The git_provider_key of this GitFolder.
        :rtype: str
        """
        return self._git_provider_key

    @git_provider_key.setter
    def git_provider_key(self, git_provider_key):
        """
        Sets the git_provider_key of this GitFolder.
        key corresponding to Git service provider in git provider table.


        :param git_provider_key: The git_provider_key of this GitFolder.
        :type: str
        """
        self._git_provider_key = git_provider_key

    @property
    def git_repository_url(self):
        """
        Gets the git_repository_url of this GitFolder.
        Git repository url used to clone.


        :return: The git_repository_url of this GitFolder.
        :rtype: str
        """
        return self._git_repository_url

    @git_repository_url.setter
    def git_repository_url(self, git_repository_url):
        """
        Sets the git_repository_url of this GitFolder.
        Git repository url used to clone.


        :param git_repository_url: The git_repository_url of this GitFolder.
        :type: str
        """
        self._git_repository_url = git_repository_url

    @property
    def description(self):
        """
        Gets the description of this GitFolder.
        Short description about the git repository.


        :return: The description of this GitFolder.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this GitFolder.
        Short description about the git repository.


        :param description: The description of this GitFolder.
        :type: str
        """
        self._description = description

    @property
    def branch_name(self):
        """
        Gets the branch_name of this GitFolder.
        Git branch name that is cloned.


        :return: The branch_name of this GitFolder.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitFolder.
        Git branch name that is cloned.


        :param branch_name: The branch_name of this GitFolder.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def is_private_connectivity_enabled(self):
        """
        Gets the is_private_connectivity_enabled of this GitFolder.
        Whether this Git folder uses private network connectivity.


        :return: The is_private_connectivity_enabled of this GitFolder.
        :rtype: bool
        """
        return self._is_private_connectivity_enabled

    @is_private_connectivity_enabled.setter
    def is_private_connectivity_enabled(self, is_private_connectivity_enabled):
        """
        Sets the is_private_connectivity_enabled of this GitFolder.
        Whether this Git folder uses private network connectivity.


        :param is_private_connectivity_enabled: The is_private_connectivity_enabled of this GitFolder.
        :type: bool
        """
        self._is_private_connectivity_enabled = is_private_connectivity_enabled

    @property
    def git_connectivity_profile_key(self):
        """
        Gets the git_connectivity_profile_key of this GitFolder.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :return: The git_connectivity_profile_key of this GitFolder.
        :rtype: str
        """
        return self._git_connectivity_profile_key

    @git_connectivity_profile_key.setter
    def git_connectivity_profile_key(self, git_connectivity_profile_key):
        """
        Sets the git_connectivity_profile_key of this GitFolder.
        Key of the private network profile used for Git connectivity, returned by
        private network profile listings filtered by name. Required when
        isPrivateConnectivityEnabled is true.


        :param git_connectivity_profile_key: The git_connectivity_profile_key of this GitFolder.
        :type: str
        """
        self._git_connectivity_profile_key = git_connectivity_profile_key

    @property
    def credential_store_key(self):
        """
        Gets the credential_store_key of this GitFolder.
        Key of the credential containing the Git server's TLS CA certificate,
        returned by credential listings filtered by displayName. Required when
        isPrivateConnectivityEnabled is true.


        :return: The credential_store_key of this GitFolder.
        :rtype: str
        """
        return self._credential_store_key

    @credential_store_key.setter
    def credential_store_key(self, credential_store_key):
        """
        Sets the credential_store_key of this GitFolder.
        Key of the credential containing the Git server's TLS CA certificate,
        returned by credential listings filtered by displayName. Required when
        isPrivateConnectivityEnabled is true.


        :param credential_store_key: The credential_store_key of this GitFolder.
        :type: str
        """
        self._credential_store_key = credential_store_key

    @property
    def folder_metadata(self):
        """
        Gets the folder_metadata of this GitFolder.
        The metadata about the folder, like branchName.


        :return: The folder_metadata of this GitFolder.
        :rtype: dict(str, object)
        """
        return self._folder_metadata

    @folder_metadata.setter
    def folder_metadata(self, folder_metadata):
        """
        Sets the folder_metadata of this GitFolder.
        The metadata about the folder, like branchName.


        :param folder_metadata: The folder_metadata of this GitFolder.
        :type: dict(str, object)
        """
        self._folder_metadata = folder_metadata

    @property
    def sparse_checkout(self):
        """
        Gets the sparse_checkout of this GitFolder.

        :return: The sparse_checkout of this GitFolder.
        :rtype: oci.aidataplatform_dp.models.SparseCheckoutDetails
        """
        return self._sparse_checkout

    @sparse_checkout.setter
    def sparse_checkout(self, sparse_checkout):
        """
        Sets the sparse_checkout of this GitFolder.

        :param sparse_checkout: The sparse_checkout of this GitFolder.
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
