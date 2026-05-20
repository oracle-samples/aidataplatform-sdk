# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateGitRepositoryDetails(object):
    """
    Update a Git repository with the provided details.
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

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'git_url': 'str',
            'credential_key': 'str'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'git_url': 'gitUrl',
            'credential_key': 'credentialKey'
        }

        self._git_folder_path = None
        self._git_url = None
        self._credential_key = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this UpdateGitRepositoryDetails.
        The path of the current Git folder which has to be created for the new branch.


        :return: The git_folder_path of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this UpdateGitRepositoryDetails.
        The path of the current Git folder which has to be created for the new branch.


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
        Updated PAT credential key.


        :return: The credential_key of this UpdateGitRepositoryDetails.
        :rtype: str
        """
        return self._credential_key

    @credential_key.setter
    def credential_key(self, credential_key):
        """
        Sets the credential_key of this UpdateGitRepositoryDetails.
        Updated PAT credential key.


        :param credential_key: The credential_key of this UpdateGitRepositoryDetails.
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
