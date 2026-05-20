# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentFlowDeploymentMetadataDetails(object):
    """
    Details for updating agent flow deployment metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentFlowDeploymentMetadataDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_key:
            The value to assign to the deployment_key property of this UpdateAgentFlowDeploymentMetadataDetails.
        :type deployment_key: str

        :param agent_card_config_detail:
            The value to assign to the agent_card_config_detail property of this UpdateAgentFlowDeploymentMetadataDetails.
        :type agent_card_config_detail: oci.aidataplatform_dp.models.AgentCardConfigDetail

        """
        self.swagger_types = {
            'deployment_key': 'str',
            'agent_card_config_detail': 'AgentCardConfigDetail'
        }

        self.attribute_map = {
            'deployment_key': 'deploymentKey',
            'agent_card_config_detail': 'agentCardConfigDetail'
        }

        self._deployment_key = None
        self._agent_card_config_detail = None

    @property
    def deployment_key(self):
        """
        Gets the deployment_key of this UpdateAgentFlowDeploymentMetadataDetails.
        Deployment Id on Agent Service


        :return: The deployment_key of this UpdateAgentFlowDeploymentMetadataDetails.
        :rtype: str
        """
        return self._deployment_key

    @deployment_key.setter
    def deployment_key(self, deployment_key):
        """
        Sets the deployment_key of this UpdateAgentFlowDeploymentMetadataDetails.
        Deployment Id on Agent Service


        :param deployment_key: The deployment_key of this UpdateAgentFlowDeploymentMetadataDetails.
        :type: str
        """
        self._deployment_key = deployment_key

    @property
    def agent_card_config_detail(self):
        """
        Gets the agent_card_config_detail of this UpdateAgentFlowDeploymentMetadataDetails.

        :return: The agent_card_config_detail of this UpdateAgentFlowDeploymentMetadataDetails.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config_detail

    @agent_card_config_detail.setter
    def agent_card_config_detail(self, agent_card_config_detail):
        """
        Sets the agent_card_config_detail of this UpdateAgentFlowDeploymentMetadataDetails.

        :param agent_card_config_detail: The agent_card_config_detail of this UpdateAgentFlowDeploymentMetadataDetails.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config_detail = agent_card_config_detail

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
