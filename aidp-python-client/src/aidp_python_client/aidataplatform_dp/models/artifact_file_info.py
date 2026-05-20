# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ArtifactFileInfo(object):
    """
    File info of artifact.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ArtifactFileInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this ArtifactFileInfo.
        :type path: str

        :param is_dir:
            The value to assign to the is_dir property of this ArtifactFileInfo.
        :type is_dir: bool

        :param file_size:
            The value to assign to the file_size property of this ArtifactFileInfo.
        :type file_size: int

        """
        self.swagger_types = {
            'path': 'str',
            'is_dir': 'bool',
            'file_size': 'int'
        }

        self.attribute_map = {
            'path': 'path',
            'is_dir': 'is_dir',
            'file_size': 'file_size'
        }

        self._path = None
        self._is_dir = None
        self._file_size = None

    @property
    def path(self):
        """
        Gets the path of this ArtifactFileInfo.
        Path relative to the root artifact directory run.


        :return: The path of this ArtifactFileInfo.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this ArtifactFileInfo.
        Path relative to the root artifact directory run.


        :param path: The path of this ArtifactFileInfo.
        :type: str
        """
        self._path = path

    @property
    def is_dir(self):
        """
        Gets the is_dir of this ArtifactFileInfo.
        Whether the path is a directory.


        :return: The is_dir of this ArtifactFileInfo.
        :rtype: bool
        """
        return self._is_dir

    @is_dir.setter
    def is_dir(self, is_dir):
        """
        Sets the is_dir of this ArtifactFileInfo.
        Whether the path is a directory.


        :param is_dir: The is_dir of this ArtifactFileInfo.
        :type: bool
        """
        self._is_dir = is_dir

    @property
    def file_size(self):
        """
        Gets the file_size of this ArtifactFileInfo.
        Size in bytes. Unset for directories.


        :return: The file_size of this ArtifactFileInfo.
        :rtype: int
        """
        return self._file_size

    @file_size.setter
    def file_size(self, file_size):
        """
        Sets the file_size of this ArtifactFileInfo.
        Size in bytes. Unset for directories.


        :param file_size: The file_size of this ArtifactFileInfo.
        :type: int
        """
        self._file_size = file_size

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
