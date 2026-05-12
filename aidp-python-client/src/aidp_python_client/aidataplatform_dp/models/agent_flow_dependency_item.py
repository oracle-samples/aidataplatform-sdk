# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowDependencyItem(object):
    """
    Items of AgentFlow Dependencies
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowDependencyItem object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this AgentFlowDependencyItem.
        :type type: str

        :param key:
            The value to assign to the key property of this AgentFlowDependencyItem.
        :type key: str

        :param location:
            The value to assign to the location property of this AgentFlowDependencyItem.
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
        Gets the type of this AgentFlowDependencyItem.
        AICompute/File


        :return: The type of this AgentFlowDependencyItem.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentFlowDependencyItem.
        AICompute/File


        :param type: The type of this AgentFlowDependencyItem.
        :type: str
        """
        self._type = type

    @property
    def key(self):
        """
        Gets the key of this AgentFlowDependencyItem.
        AICompute key


        :return: The key of this AgentFlowDependencyItem.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this AgentFlowDependencyItem.
        AICompute key


        :param key: The key of this AgentFlowDependencyItem.
        :type: str
        """
        self._key = key

    @property
    def location(self):
        """
        Gets the location of this AgentFlowDependencyItem.
        Location of file/folders


        :return: The location of this AgentFlowDependencyItem.
        :rtype: str
        """
        return self._location

    @location.setter
    def location(self, location):
        """
        Sets the location of this AgentFlowDependencyItem.
        Location of file/folders


        :param location: The location of this AgentFlowDependencyItem.
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
