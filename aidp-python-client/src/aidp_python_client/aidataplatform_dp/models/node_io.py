# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NodeIo(object):
    """
    Defines the data type and color for an input or output.
    """

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "FLOW"
    DATA_TYPE_FLOW = "FLOW"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "STR"
    DATA_TYPE_STR = "STR"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "INT"
    DATA_TYPE_INT = "INT"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "BOOL"
    DATA_TYPE_BOOL = "BOOL"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "FLOAT"
    DATA_TYPE_FLOAT = "FLOAT"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "LIST"
    DATA_TYPE_LIST = "LIST"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "DICT"
    DATA_TYPE_DICT = "DICT"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "ANY"
    DATA_TYPE_ANY = "ANY"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "TOOLS"
    DATA_TYPE_TOOLS = "TOOLS"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "LLMS"
    DATA_TYPE_LLMS = "LLMS"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "AGENTS"
    DATA_TYPE_AGENTS = "AGENTS"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "PLANNER"
    DATA_TYPE_PLANNER = "PLANNER"

    #: A constant which can be used with the data_type property of a NodeIo.
    #: This constant has a value of "FLOWS"
    DATA_TYPE_FLOWS = "FLOWS"

    def __init__(self, **kwargs):
        """
        Initializes a new NodeIo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param data_type:
            The value to assign to the data_type property of this NodeIo.
            Allowed values for this property are: "FLOW", "STR", "INT", "BOOL", "FLOAT", "LIST", "DICT", "ANY", "TOOLS", "LLMS", "AGENTS", "PLANNER", "FLOWS", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type data_type: str

        :param color:
            The value to assign to the color property of this NodeIo.
        :type color: oci.aidataplatform_dp.models.NodeIoColor

        """
        self.swagger_types = {
            'data_type': 'str',
            'color': 'NodeIoColor'
        }

        self.attribute_map = {
            'data_type': 'dataType',
            'color': 'color'
        }

        self._data_type = None
        self._color = None

    @property
    def data_type(self):
        """
        **[Required]** Gets the data_type of this NodeIo.
        Possible types of node inputs and outputs.

        Allowed values for this property are: "FLOW", "STR", "INT", "BOOL", "FLOAT", "LIST", "DICT", "ANY", "TOOLS", "LLMS", "AGENTS", "PLANNER", "FLOWS", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The data_type of this NodeIo.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """
        Sets the data_type of this NodeIo.
        Possible types of node inputs and outputs.


        :param data_type: The data_type of this NodeIo.
        :type: str
        """
        allowed_values = ["FLOW", "STR", "INT", "BOOL", "FLOAT", "LIST", "DICT", "ANY", "TOOLS", "LLMS", "AGENTS", "PLANNER", "FLOWS"]
        if not value_allowed_none_or_none_sentinel(data_type, allowed_values):
            data_type = 'UNKNOWN_ENUM_VALUE'
        self._data_type = data_type

    @property
    def color(self):
        """
        **[Required]** Gets the color of this NodeIo.

        :return: The color of this NodeIo.
        :rtype: oci.aidataplatform_dp.models.NodeIoColor
        """
        return self._color

    @color.setter
    def color(self, color):
        """
        Sets the color of this NodeIo.

        :param color: The color of this NodeIo.
        :type: oci.aidataplatform_dp.models.NodeIoColor
        """
        self._color = color

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
