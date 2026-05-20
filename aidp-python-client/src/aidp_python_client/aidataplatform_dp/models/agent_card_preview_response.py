# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentCardPreviewResponse(object):
    """
    Response for previewing an agent card.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentCardPreviewResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_card_json:
            The value to assign to the agent_card_json property of this AgentCardPreviewResponse.
        :type agent_card_json: str

        """
        self.swagger_types = {
            'agent_card_json': 'str'
        }

        self.attribute_map = {
            'agent_card_json': 'agentCardJson'
        }

        self._agent_card_json = None

    @property
    def agent_card_json(self):
        """
        **[Required]** Gets the agent_card_json of this AgentCardPreviewResponse.
        JSON string representation of AgentCard


        :return: The agent_card_json of this AgentCardPreviewResponse.
        :rtype: str
        """
        return self._agent_card_json

    @agent_card_json.setter
    def agent_card_json(self, agent_card_json):
        """
        Sets the agent_card_json of this AgentCardPreviewResponse.
        JSON string representation of AgentCard


        :param agent_card_json: The agent_card_json of this AgentCardPreviewResponse.
        :type: str
        """
        self._agent_card_json = agent_card_json

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
