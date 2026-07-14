# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDependencyItem(object):
    """
    Agent dependency items.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDependencyItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentDependencyItem.
        :type type: str

        :param key:
            The value to assign to the key property of this AgentDependencyItem.
        :type key: str

        :param location:
            The value to assign to the location property of this AgentDependencyItem.
        :type location: str

        """
        self.swagger_types = {
            'type': 'str',
            'key': 'str',
            'location': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'key': 'key',
            'location': 'location'
        }

        self._type = None
        self._key = None
        self._location = None

    @property
    def type(self):
        """
        Gets the type of this AgentDependencyItem.
        AICompute or file.


        :return: The type of this AgentDependencyItem.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentDependencyItem.
        AICompute or file.


        :param type: The type of this AgentDependencyItem.
        :type: str
        """
        self._type = type

    @property
    def key(self):
        """
        Gets the key of this AgentDependencyItem.
        AICompute key.


        :return: The key of this AgentDependencyItem.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentDependencyItem.
        AICompute key.


        :param key: The key of this AgentDependencyItem.
        :type: str
        """
        self._key = key

    @property
    def location(self):
        """
        Gets the location of this AgentDependencyItem.
        Location of file/folders.


        :return: The location of this AgentDependencyItem.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this AgentDependencyItem.
        Location of file/folders.


        :param location: The location of this AgentDependencyItem.
        :type: str
        """
        self._location = location

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
