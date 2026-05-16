# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ArtifactList(object):
    """
    Result of listing Artifacts.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ArtifactList object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param root_uri:
            The value to assign to the root_uri property of this ArtifactList.
        :type root_uri: str

        :param files:
            The value to assign to the files property of this ArtifactList.
        :type files: list[oci.aidataplatform_dp.models.ArtifactFileInfo]

        :param next_page_token:
            The value to assign to the next_page_token property of this ArtifactList.
        :type next_page_token: str

        """
        self.swagger_types = {
            'root_uri': 'str',
            'files': 'list[ArtifactFileInfo]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'root_uri': 'root_uri',
            'files': 'files',
            'next_page_token': 'next_page_token'
        }

        self._root_uri = None
        self._files = None
        self._next_page_token = None

    @property
    def root_uri(self):
        """
        Gets the root_uri of this ArtifactList.
        Root artifact directory for the run.


        :return: The root_uri of this ArtifactList.
        :rtype: str
        """
        return self._root_uri

    @root_uri.setter
    def root_uri(self, root_uri):
        """
        Sets the root_uri of this ArtifactList.
        Root artifact directory for the run.


        :param root_uri: The root_uri of this ArtifactList.
        :type: str
        """
        self._root_uri = root_uri

    @property
    def files(self):
        """
        Gets the files of this ArtifactList.
        File location and metadata for artifacts.


        :return: The files of this ArtifactList.
        :rtype: list[oci.aidataplatform_dp.models.ArtifactFileInfo]
        """
        return self._files

    @files.setter
    def files(self, files):
        """
        Sets the files of this ArtifactList.
        File location and metadata for artifacts.


        :param files: The files of this ArtifactList.
        :type: list[oci.aidataplatform_dp.models.ArtifactFileInfo]
        """
        self._files = files

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ArtifactList.
        Token that can be used to retrieve the next page of artifact results.


        :return: The next_page_token of this ArtifactList.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ArtifactList.
        Token that can be used to retrieve the next page of artifact results.


        :param next_page_token: The next_page_token of this ArtifactList.
        :type: str
        """
        self._next_page_token = next_page_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
