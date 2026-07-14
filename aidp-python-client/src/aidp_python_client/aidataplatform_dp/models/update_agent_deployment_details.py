# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentDeploymentDetails(object):
    """
    Details required to update the deployment of an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentDeploymentDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateAgentDeploymentDetails.
        :type description: str

        :param agent_compute_key:
            The value to assign to the agent_compute_key property of this UpdateAgentDeploymentDetails.
        :type agent_compute_key: str

        :param agent_key:
            The value to assign to the agent_key property of this UpdateAgentDeploymentDetails.
        :type agent_key: str

        :param o_auth_config:
            The value to assign to the o_auth_config property of this UpdateAgentDeploymentDetails.
        :type o_auth_config: oci.aidataplatform_dp.models.OAuthConfiguration

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'agent_compute_key': 'str',
            'agent_key': 'str',
            'o_auth_config': 'OAuthConfiguration'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'agent_compute_key': 'agentComputeKey',
            'agent_key': 'agentKey',
            'o_auth_config': 'oAuthConfig'
        }

        self._display_name = None
        self._description = None
        self._agent_compute_key = None
        self._agent_key = None
        self._o_auth_config = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateAgentDeploymentDetails.
        Display name.


        :return: The display_name of this UpdateAgentDeploymentDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateAgentDeploymentDetails.
        Display name.


        :param display_name: The display_name of this UpdateAgentDeploymentDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateAgentDeploymentDetails.
        deployment description.


        :return: The description of this UpdateAgentDeploymentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateAgentDeploymentDetails.
        deployment description.


        :param description: The description of this UpdateAgentDeploymentDetails.
        :type: str
        """
        self._description = description

    @property
    def agent_compute_key(self):
        """
        Gets the agent_compute_key of this UpdateAgentDeploymentDetails.
        The Agent Compute Key where client can run or test the agent.


        :return: The agent_compute_key of this UpdateAgentDeploymentDetails.
        :rtype: str
        """
        return self._agent_compute_key

    @agent_compute_key.setter
    def agent_compute_key(self, agent_compute_key):
        """
        Sets the agent_compute_key of this UpdateAgentDeploymentDetails.
        The Agent Compute Key where client can run or test the agent.


        :param agent_compute_key: The agent_compute_key of this UpdateAgentDeploymentDetails.
        :type: str
        """
        self._agent_compute_key = agent_compute_key

    @property
    def agent_key(self):
        """
        **[Required]** Gets the agent_key of this UpdateAgentDeploymentDetails.
        The Agent key for which the session is started.


        :return: The agent_key of this UpdateAgentDeploymentDetails.
        :rtype: str
        """
        return self._agent_key

    @agent_key.setter
    def agent_key(self, agent_key):
        """
        Sets the agent_key of this UpdateAgentDeploymentDetails.
        The Agent key for which the session is started.


        :param agent_key: The agent_key of this UpdateAgentDeploymentDetails.
        :type: str
        """
        self._agent_key = agent_key

    @property
    def o_auth_config(self):
        """
        Gets the o_auth_config of this UpdateAgentDeploymentDetails.

        :return: The o_auth_config of this UpdateAgentDeploymentDetails.
        :rtype: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        return self._o_auth_config

    @o_auth_config.setter
    def o_auth_config(self, o_auth_config):
        """
        Sets the o_auth_config of this UpdateAgentDeploymentDetails.

        :param o_auth_config: The o_auth_config of this UpdateAgentDeploymentDetails.
        :type: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        self._o_auth_config = o_auth_config

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
