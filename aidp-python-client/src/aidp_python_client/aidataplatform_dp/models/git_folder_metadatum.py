# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitFolderMetadatum(object):
    """
    Details about a git repository
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitFolderMetadatum object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param repo_key:
            The value to assign to the repo_key property of this GitFolderMetadatum.
        :type repo_key: str

        :param is_associated:
            The value to assign to the is_associated property of this GitFolderMetadatum.
        :type is_associated: bool

        """
        self.swagger_types = {
            'repo_key': 'str',
            'is_associated': 'bool'
        }

        self.attribute_map = {
            'repo_key': 'repoKey',
            'is_associated': 'isAssociated'
        }

        self._repo_key = None
        self._is_associated = None

    @property
    def repo_key(self):
        """
        **[Required]** Gets the repo_key of this GitFolderMetadatum.
        Unique repo key if folder/file path is associated with a git folder


        :return: The repo_key of this GitFolderMetadatum.
        :rtype: str
        """
        return self._repo_key

    @repo_key.setter
    def repo_key(self, repo_key):
        """
        Sets the repo_key of this GitFolderMetadatum.
        Unique repo key if folder/file path is associated with a git folder


        :param repo_key: The repo_key of this GitFolderMetadatum.
        :type: str
        """
        self._repo_key = repo_key

    @property
    def is_associated(self):
        """
        **[Required]** Gets the is_associated of this GitFolderMetadatum.
        If the passed folder/file path is associated with a git folder. (Active/Inactive)


        :return: The is_associated of this GitFolderMetadatum.
        :rtype: bool
        """
        return self._is_associated

    @is_associated.setter
    def is_associated(self, is_associated):
        """
        Sets the is_associated of this GitFolderMetadatum.
        If the passed folder/file path is associated with a git folder. (Active/Inactive)


        :param is_associated: The is_associated of this GitFolderMetadatum.
        :type: bool
        """
        self._is_associated = is_associated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
