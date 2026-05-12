# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitConfig(object):
    """
    Git configuration used when source is GIT_PROVIDER.
    """

    #: A constant which can be used with the provider property of a GitConfig.
    #: This constant has a value of "GITHUB"
    PROVIDER_GITHUB = "GITHUB"

    #: A constant which can be used with the provider property of a GitConfig.
    #: This constant has a value of "BITBUCKET"
    PROVIDER_BITBUCKET = "BITBUCKET"

    #: A constant which can be used with the provider property of a GitConfig.
    #: This constant has a value of "GITLAB"
    PROVIDER_GITLAB = "GITLAB"

    #: A constant which can be used with the provider property of a GitConfig.
    #: This constant has a value of "OCI_DEVOPS"
    PROVIDER_OCI_DEVOPS = "OCI_DEVOPS"

    def __init__(self, **kwargs):
        """
        Initializes a new GitConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param provider:
            The value to assign to the provider property of this GitConfig.
            Allowed values for this property are: "GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type provider: str

        :param credential:
            The value to assign to the credential property of this GitConfig.
        :type credential: str

        :param repository_url:
            The value to assign to the repository_url property of this GitConfig.
        :type repository_url: str

        :param branch:
            The value to assign to the branch property of this GitConfig.
        :type branch: str

        """
        self.swagger_types = {
            'provider': 'str',
            'credential': 'str',
            'repository_url': 'str',
            'branch': 'str'
        }

        self.attribute_map = {
            'provider': 'provider',
            'credential': 'credential',
            'repository_url': 'repositoryUrl',
            'branch': 'branch'
        }

        self._provider = None
        self._credential = None
        self._repository_url = None
        self._branch = None

    @property
    def provider(self):
        """
        Gets the provider of this GitConfig.
        Git provider.

        Allowed values for this property are: "GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The provider of this GitConfig.
        :rtype: str
        """
        return self._provider

    @provider.setter
    def provider(self, provider):
        """
        Sets the provider of this GitConfig.
        Git provider.


        :param provider: The provider of this GitConfig.
        :type: str
        """
        allowed_values = ["GITHUB", "BITBUCKET", "GITLAB", "OCI_DEVOPS"]
        if not value_allowed_none_or_none_sentinel(provider, allowed_values):
            provider = 'UNKNOWN_ENUM_VALUE'
        self._provider = provider

    @property
    def credential(self):
        """
        Gets the credential of this GitConfig.
        Git credential to access the repository.


        :return: The credential of this GitConfig.
        :rtype: str
        """
        return self._credential

    @credential.setter
    def credential(self, credential):
        """
        Sets the credential of this GitConfig.
        Git credential to access the repository.


        :param credential: The credential of this GitConfig.
        :type: str
        """
        self._credential = credential

    @property
    def repository_url(self):
        """
        Gets the repository_url of this GitConfig.
        Git repository URL.


        :return: The repository_url of this GitConfig.
        :rtype: str
        """
        return self._repository_url

    @repository_url.setter
    def repository_url(self, repository_url):
        """
        Sets the repository_url of this GitConfig.
        Git repository URL.


        :param repository_url: The repository_url of this GitConfig.
        :type: str
        """
        self._repository_url = repository_url

    @property
    def branch(self):
        """
        Gets the branch of this GitConfig.
        Git branch path.


        :return: The branch of this GitConfig.
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch):
        """
        Sets the branch of this GitConfig.
        Git branch path.


        :param branch: The branch of this GitConfig.
        :type: str
        """
        self._branch = branch

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
