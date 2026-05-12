# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class McpObject(object):
    """
    Mcp object.
    """

    #: A constant which can be used with the object_type property of a McpObject.
    #: This constant has a value of "TOOL"
    OBJECT_TYPE_TOOL = "TOOL"

    #: A constant which can be used with the object_type property of a McpObject.
    #: This constant has a value of "PROMPT"
    OBJECT_TYPE_PROMPT = "PROMPT"

    #: A constant which can be used with the object_type property of a McpObject.
    #: This constant has a value of "RESOURCE"
    OBJECT_TYPE_RESOURCE = "RESOURCE"

    def __init__(self, **kwargs):
        """
        Initializes a new McpObject object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.McpPromptObject`
        * :class:`~oci.aidataplatform_dp.models.McpToolObject`
        * :class:`~oci.aidataplatform_dp.models.McpResourceObject`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param object_type:
            The value to assign to the object_type property of this McpObject.
            Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"
        :type object_type: str

        :param name:
            The value to assign to the name property of this McpObject.
        :type name: str

        :param description:
            The value to assign to the description property of this McpObject.
        :type description: str

        """
        self.swagger_types = {
            'object_type': 'str',
            'name': 'str',
            'description': 'str'
        }

        self.attribute_map = {
            'object_type': 'objectType',
            'name': 'name',
            'description': 'description'
        }

        self._object_type = None
        self._name = None
        self._description = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['objectType']

        if type == 'PROMPT':
            return 'McpPromptObject'

        if type == 'TOOL':
            return 'McpToolObject'

        if type == 'RESOURCE':
            return 'McpResourceObject'
        else:
            return 'McpObject'

    @property
    def object_type(self):
        """
        Gets the object_type of this McpObject.
        Type of object. Tool, prompt or resource hosted on an MCP.

        Allowed values for this property are: "TOOL", "PROMPT", "RESOURCE"


        :return: The object_type of this McpObject.
        :rtype: str
        """
        return self._object_type

    @object_type.setter
    def object_type(self, object_type):
        """
        Sets the object_type of this McpObject.
        Type of object. Tool, prompt or resource hosted on an MCP.


        :param object_type: The object_type of this McpObject.
        :type: str
        """
        allowed_values = ["TOOL", "PROMPT", "RESOURCE"]
        if not value_allowed_none_or_none_sentinel(object_type, allowed_values):
            raise ValueError(
                "Invalid value for `object_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._object_type = object_type

    @property
    def name(self):
        """
        Gets the name of this McpObject.
        name of the mcp object


        :return: The name of this McpObject.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this McpObject.
        name of the mcp object


        :param name: The name of this McpObject.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this McpObject.
        description of the mcp object


        :return: The description of this McpObject.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this McpObject.
        description of the mcp object


        :param description: The description of this McpObject.
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
