# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AutomaticSummarizationConfiguration(object):
    """
    Configuration for automatic summarization of an Agent Flow session's conversation history. If omitted, automatic summarization is disabled.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AutomaticSummarizationConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this AutomaticSummarizationConfiguration.
        :type is_enabled: bool

        """
        self.swagger_types = {
            'is_enabled': 'bool'
        }
        self.attribute_map = {
            'is_enabled': 'isEnabled'
        }
        self._is_enabled = None

    @property
    def is_enabled(self):
        """
        Gets the is_enabled of this AutomaticSummarizationConfiguration.
        Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.


        :return: The is_enabled of this AutomaticSummarizationConfiguration.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this AutomaticSummarizationConfiguration.
        Whether automatic conversation-history summarization is enabled for this Agent Flow. The setting is ineffective for agent nodes whose memory is disabled.


        :param is_enabled: The is_enabled of this AutomaticSummarizationConfiguration.
        :type: bool
        """
        self._is_enabled = is_enabled

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
