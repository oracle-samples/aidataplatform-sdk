# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ContextManagementRule(object):
    """
    Base context management rule. Concrete rule configuration is selected by type.
    """

    #: A constant which can be used with the type property of a ContextManagementRule.
    #: This constant has a value of "CLEAR_TOOL_USES"
    TYPE_CLEAR_TOOL_USES = "CLEAR_TOOL_USES"

    def __init__(self, **kwargs):
        """
        Initializes a new ContextManagementRule object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.ClearToolUsesContextManagementRule`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ContextManagementRule.
            Allowed values for this property are: "CLEAR_TOOL_USES", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type type: str

        """
        self.swagger_types = {
            'type': 'str'
        }

        self.attribute_map = {
            'type': 'type'
        }

        self._type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'CLEAR_TOOL_USES':
            return 'ClearToolUsesContextManagementRule'
        else:
            return 'ContextManagementRule'

    @property
    def type(self):
        """
        Gets the type of this ContextManagementRule.
        Context management strategy. Only CLEAR_TOOL_USES is supported in v1.

        Allowed values for this property are: "CLEAR_TOOL_USES", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The type of this ContextManagementRule.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this ContextManagementRule.
        Context management strategy. Only CLEAR_TOOL_USES is supported in v1.


        :param type: The type of this ContextManagementRule.
        :type: str
        """
        allowed_values = ["CLEAR_TOOL_USES"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            type = 'UNKNOWN_ENUM_VALUE'
        self._type = type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
