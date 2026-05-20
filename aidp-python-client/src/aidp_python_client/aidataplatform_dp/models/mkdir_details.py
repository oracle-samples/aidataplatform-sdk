# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class MkdirDetails(object):
    """
    Details to create a directory in the workspace.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new MkdirDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param path:
            The value to assign to the path property of this MkdirDetails.
        :type path: str

        :param description:
            The value to assign to the description property of this MkdirDetails.
        :type description: str

        """
        self.swagger_types = {
            'path': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'path': 'path',
            'description': 'description'
        }

        self._path = None
        self._description = None

    @property
    def path(self):
        """
        Gets the path of this MkdirDetails.
        The fully qualified path of the directory to create.


        :return: The path of this MkdirDetails.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """
        Sets the path of this MkdirDetails.
        The fully qualified path of the directory to create.


        :param path: The path of this MkdirDetails.
        :type: str
        """
        self._path = path

    @property
    def description(self):
        """
        Gets the description of this MkdirDetails.
        The description of the directory to create.


        :return: The description of this MkdirDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this MkdirDetails.
        The description of the directory to create.


        :param description: The description of this MkdirDetails.
        :type: str
        """
        self._description = description

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
