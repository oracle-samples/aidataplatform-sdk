# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateContentDetails(object):
    """
    Path of file to copy. A POST to /api/contents/path creates a New untitled, empty file or directory. A POST to /api/contents/path with body {'copy_from': '/path/to/OtherNotebook.ipynb'} creates a new copy of OtherNotebook in path.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateContentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param copy_from:
            The value to assign to the copy_from property of this CreateContentDetails.
        :type copy_from: str

        :param ext:
            The value to assign to the ext property of this CreateContentDetails.
        :type ext: str

        :param type:
            The value to assign to the type property of this CreateContentDetails.
        :type type: str

        """
        self.swagger_types = {
            'copy_from': 'str',
            'ext': 'str',
            'type': 'str'
        }

        self.attribute_map = {
            'copy_from': 'copy_from',
            'ext': 'ext',
            'type': 'type'
        }

        self._copy_from = None
        self._ext = None
        self._type = None

    @property
    def copy_from(self):
        """
        Gets the copy_from of this CreateContentDetails.
        Copy from Path. For example, /path/to/OtherNotebook.ipynb.


        :return: The copy_from of this CreateContentDetails.
        :rtype: str
        """
        return self._copy_from

    @copy_from.setter
    def copy_from(self, copy_from):
        """
        Sets the copy_from of this CreateContentDetails.
        Copy from Path. For example, /path/to/OtherNotebook.ipynb.


        :param copy_from: The copy_from of this CreateContentDetails.
        :type: str
        """
        self._copy_from = copy_from

    @property
    def ext(self):
        """
        Gets the ext of this CreateContentDetails.
        File format extension


        :return: The ext of this CreateContentDetails.
        :rtype: str
        """
        return self._ext

    @ext.setter
    def ext(self, ext):
        """
        Sets the ext of this CreateContentDetails.
        File format extension


        :param ext: The ext of this CreateContentDetails.
        :type: str
        """
        self._ext = ext

    @property
    def type(self):
        """
        Gets the type of this CreateContentDetails.
        Type of Content model. Either notebook, file, or directory.


        :return: The type of this CreateContentDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateContentDetails.
        Type of Content model. Either notebook, file, or directory.


        :param type: The type of this CreateContentDetails.
        :type: str
        """
        self._type = type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
