# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ContextManagementConfiguration(object):
    """
    Context management configuration for controlling conversation history before model invocation, such as clearing older tool-use outputs to reduce context size. If present, context management is enabled; if omitted or null, disabled.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ContextManagementConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param rules:
            The value to assign to the rules property of this ContextManagementConfiguration.
        :type rules: list[oci.aidataplatform_dp.models.ContextManagementRule]

        """
        self.swagger_types = {
            'rules': 'list[ContextManagementRule]'
        }

        self.attribute_map = {
            'rules': 'rules'
        }

        self._rules = None

    @property
    def rules(self):
        """
        Gets the rules of this ContextManagementConfiguration.
        Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.


        :return: The rules of this ContextManagementConfiguration.
        :rtype: list[oci.aidataplatform_dp.models.ContextManagementRule]
        """
        return self._rules

    @rules.setter
    def rules(self, rules):
        """
        Sets the rules of this ContextManagementConfiguration.
        Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.


        :param rules: The rules of this ContextManagementConfiguration.
        :type: list[oci.aidataplatform_dp.models.ContextManagementRule]
        """
        self._rules = rules

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
