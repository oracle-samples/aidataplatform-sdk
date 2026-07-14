# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClearToolUsesContextManagementDetails(object):
    """
    Configuration details for CLEAR_TOOL_USES context management.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClearToolUsesContextManagementDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param keep_tool_messages:
            The value to assign to the keep_tool_messages property of this ClearToolUsesContextManagementDetails.
        :type keep_tool_messages: int

        """
        self.swagger_types = {
            'keep_tool_messages': 'int'
        }

        self.attribute_map = {
            'keep_tool_messages': 'keepToolMessages'
        }

        self._keep_tool_messages = None

    @property
    def keep_tool_messages(self):
        """
        Gets the keep_tool_messages of this ClearToolUsesContextManagementDetails.
        Number of most-recent tool messages to keep unchanged.


        :return: The keep_tool_messages of this ClearToolUsesContextManagementDetails.
        :rtype: int
        """
        return self._keep_tool_messages

    @keep_tool_messages.setter
    def keep_tool_messages(self, keep_tool_messages):
        """
        Sets the keep_tool_messages of this ClearToolUsesContextManagementDetails.
        Number of most-recent tool messages to keep unchanged.


        :param keep_tool_messages: The keep_tool_messages of this ClearToolUsesContextManagementDetails.
        :type: int
        """
        self._keep_tool_messages = keep_tool_messages

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
