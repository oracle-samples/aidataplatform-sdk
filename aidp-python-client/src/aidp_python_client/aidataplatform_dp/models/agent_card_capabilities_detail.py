# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentCardCapabilitiesDetail(object):
    """
    Capabilities included in publish request.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentCardCapabilitiesDetail object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_streaming:
            The value to assign to the is_streaming property of this AgentCardCapabilitiesDetail.
        :type is_streaming: bool

        """
        self.swagger_types = {
            'is_streaming': 'bool'
        }

        self.attribute_map = {
            'is_streaming': 'isStreaming'
        }

        self._is_streaming = None

    @property
    def is_streaming(self):
        """
        Gets the is_streaming of this AgentCardCapabilitiesDetail.
        Indicates whether streaming responses are supported.


        :return: The is_streaming of this AgentCardCapabilitiesDetail.
        :rtype: bool
        """
        return self._is_streaming

    @is_streaming.setter
    def is_streaming(self, is_streaming):
        """
        Sets the is_streaming of this AgentCardCapabilitiesDetail.
        Indicates whether streaming responses are supported.


        :param is_streaming: The is_streaming of this AgentCardCapabilitiesDetail.
        :type: bool
        """
        self._is_streaming = is_streaming

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
