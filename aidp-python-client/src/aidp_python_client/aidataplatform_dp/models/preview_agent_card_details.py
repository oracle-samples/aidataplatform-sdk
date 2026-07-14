# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PreviewAgentCardDetails(object):
    """
    Details for previewing an agent card.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PreviewAgentCardDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_card_config_details:
            The value to assign to the agent_card_config_details property of this PreviewAgentCardDetails.
        :type agent_card_config_details: oci.aidataplatform_dp.models.AgentCardConfigDetail

        """
        self.swagger_types = {
            'agent_card_config_details': 'AgentCardConfigDetail'
        }

        self.attribute_map = {
            'agent_card_config_details': 'agentCardConfigDetails'
        }

        self._agent_card_config_details = None

    @property
    def agent_card_config_details(self):
        """
        **[Required]** Gets the agent_card_config_details of this PreviewAgentCardDetails.

        :return: The agent_card_config_details of this PreviewAgentCardDetails.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config_details

    @agent_card_config_details.setter
    def agent_card_config_details(self, agent_card_config_details):
        """
        Sets the agent_card_config_details of this PreviewAgentCardDetails.

        :param agent_card_config_details: The agent_card_config_details of this PreviewAgentCardDetails.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config_details = agent_card_config_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
