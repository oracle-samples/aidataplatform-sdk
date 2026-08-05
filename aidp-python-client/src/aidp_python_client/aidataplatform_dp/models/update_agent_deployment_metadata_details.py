# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentDeploymentMetadataDetails(object):
    """
    Details for updating agent deployment metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentDeploymentMetadataDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param deployment_key:
            The value to assign to the deployment_key property of this UpdateAgentDeploymentMetadataDetails.
        :type deployment_key: str

        :param agent_card_config_detail:
            The value to assign to the agent_card_config_detail property of this UpdateAgentDeploymentMetadataDetails.
        :type agent_card_config_detail: oci.aidataplatform_dp.models.AgentCardConfigDetail

        :param update_agent_flow_agent_card_config:
            The value to assign to the update_agent_flow_agent_card_config property of this UpdateAgentDeploymentMetadataDetails.
        :type update_agent_flow_agent_card_config: bool

        """
        self.swagger_types = {
            'deployment_key': 'str',
            'agent_card_config_detail': 'AgentCardConfigDetail',
            'update_agent_flow_agent_card_config': 'bool'
        }

        self.attribute_map = {
            'deployment_key': 'deploymentKey',
            'agent_card_config_detail': 'agentCardConfigDetail',
            'update_agent_flow_agent_card_config': 'updateAgentFlowAgentCardConfig'
        }

        self._deployment_key = None
        self._agent_card_config_detail = None
        self._update_agent_flow_agent_card_config = None

    @property
    def deployment_key(self):
        """
        Gets the deployment_key of this UpdateAgentDeploymentMetadataDetails.
        Deployment Id on Agent Service


        :return: The deployment_key of this UpdateAgentDeploymentMetadataDetails.
        :rtype: str
        """
        return self._deployment_key

    @deployment_key.setter
    def deployment_key(self, deployment_key):
        """
        Sets the deployment_key of this UpdateAgentDeploymentMetadataDetails.
        Deployment Id on Agent Service


        :param deployment_key: The deployment_key of this UpdateAgentDeploymentMetadataDetails.
        :type: str
        """
        self._deployment_key = deployment_key

    @property
    def agent_card_config_detail(self):
        """
        Gets the agent_card_config_detail of this UpdateAgentDeploymentMetadataDetails.

        :return: The agent_card_config_detail of this UpdateAgentDeploymentMetadataDetails.
        :rtype: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        return self._agent_card_config_detail

    @agent_card_config_detail.setter
    def agent_card_config_detail(self, agent_card_config_detail):
        """
        Sets the agent_card_config_detail of this UpdateAgentDeploymentMetadataDetails.

        :param agent_card_config_detail: The agent_card_config_detail of this UpdateAgentDeploymentMetadataDetails.
        :type: oci.aidataplatform_dp.models.AgentCardConfigDetail
        """
        self._agent_card_config_detail = agent_card_config_detail

    @property
    def update_agent_flow_agent_card_config(self):
        """
        Gets the update_agent_flow_agent_card_config of this UpdateAgentDeploymentMetadataDetails.
        Whether to update the Agent Flow's stored agent card config after deployment metadata is updated.


        :return: The update_agent_flow_agent_card_config of this UpdateAgentDeploymentMetadataDetails.
        :rtype: bool
        """
        return self._update_agent_flow_agent_card_config

    @update_agent_flow_agent_card_config.setter
    def update_agent_flow_agent_card_config(self, update_agent_flow_agent_card_config):
        """
        Sets the update_agent_flow_agent_card_config of this UpdateAgentDeploymentMetadataDetails.
        Whether to update the Agent Flow's stored agent card config after deployment metadata is updated.


        :param update_agent_flow_agent_card_config: The update_agent_flow_agent_card_config of this UpdateAgentDeploymentMetadataDetails.
        :type: bool
        """
        self._update_agent_flow_agent_card_config = update_agent_flow_agent_card_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
