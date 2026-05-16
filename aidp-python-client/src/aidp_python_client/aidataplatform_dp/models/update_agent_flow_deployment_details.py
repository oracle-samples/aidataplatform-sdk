# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentFlowDeploymentDetails(object):
    """
    Details required to update the deployment of an Agent Flow.
    """

    #: A constant which can be used with the deployment_type property of a UpdateAgentFlowDeploymentDetails.
    #: This constant has a value of "TEST"
    DEPLOYMENT_TYPE_TEST = "TEST"

    #: A constant which can be used with the deployment_type property of a UpdateAgentFlowDeploymentDetails.
    #: This constant has a value of "PROD"
    DEPLOYMENT_TYPE_PROD = "PROD"

    #: A constant which can be used with the deployment_type property of a UpdateAgentFlowDeploymentDetails.
    #: This constant has a value of "CODE"
    DEPLOYMENT_TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentFlowDeploymentDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentFlowDeploymentDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateAgentFlowDeploymentDetails.
        :type description: str

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this UpdateAgentFlowDeploymentDetails.
        :type agent_flow_compute_key: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this UpdateAgentFlowDeploymentDetails.
        :type agent_flow_key: str

        :param deployment_type:
            The value to assign to the deployment_type property of this UpdateAgentFlowDeploymentDetails.
            Allowed values for this property are: "TEST", "PROD", "CODE"
        :type deployment_type: str

        :param o_auth_config:
            The value to assign to the o_auth_config property of this UpdateAgentFlowDeploymentDetails.
        :type o_auth_config: oci.aidataplatform_dp.models.OAuthConfiguration

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'agent_flow_compute_key': 'str',
            'agent_flow_key': 'str',
            'deployment_type': 'str',
            'o_auth_config': 'OAuthConfiguration'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'agent_flow_compute_key': 'agentFlowComputeKey',
            'agent_flow_key': 'agentFlowKey',
            'deployment_type': 'deploymentType',
            'o_auth_config': 'oAuthConfig'
        }

        self._display_name = None
        self._description = None
        self._agent_flow_compute_key = None
        self._agent_flow_key = None
        self._deployment_type = None
        self._o_auth_config = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateAgentFlowDeploymentDetails.
        Display name.


        :return: The display_name of this UpdateAgentFlowDeploymentDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateAgentFlowDeploymentDetails.
        Display name.


        :param display_name: The display_name of this UpdateAgentFlowDeploymentDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateAgentFlowDeploymentDetails.
        deployment description.


        :return: The description of this UpdateAgentFlowDeploymentDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateAgentFlowDeploymentDetails.
        deployment description.


        :param description: The description of this UpdateAgentFlowDeploymentDetails.
        :type: str
        """
        self._description = description

    @property
    def agent_flow_compute_key(self):
        """
        Gets the agent_flow_compute_key of this UpdateAgentFlowDeploymentDetails.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :return: The agent_flow_compute_key of this UpdateAgentFlowDeploymentDetails.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this UpdateAgentFlowDeploymentDetails.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :param agent_flow_compute_key: The agent_flow_compute_key of this UpdateAgentFlowDeploymentDetails.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this UpdateAgentFlowDeploymentDetails.
        The Agent Flow key for which the session is started.


        :return: The agent_flow_key of this UpdateAgentFlowDeploymentDetails.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this UpdateAgentFlowDeploymentDetails.
        The Agent Flow key for which the session is started.


        :param agent_flow_key: The agent_flow_key of this UpdateAgentFlowDeploymentDetails.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def deployment_type(self):
        """
        **[Required]** Gets the deployment_type of this UpdateAgentFlowDeploymentDetails.
        Type of an Agent Flow Deployment.

        Allowed values for this property are: "TEST", "PROD", "CODE"


        :return: The deployment_type of this UpdateAgentFlowDeploymentDetails.
        :rtype: str
        """
        return self._deployment_type

    @deployment_type.setter
    def deployment_type(self, deployment_type):
        """
        Sets the deployment_type of this UpdateAgentFlowDeploymentDetails.
        Type of an Agent Flow Deployment.


        :param deployment_type: The deployment_type of this UpdateAgentFlowDeploymentDetails.
        :type: str
        """
        allowed_values = ["TEST", "PROD", "CODE"]
        if not value_allowed_none_or_none_sentinel(deployment_type, allowed_values):
            raise ValueError(
                "Invalid value for `deployment_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._deployment_type = deployment_type

    @property
    def o_auth_config(self):
        """
        Gets the o_auth_config of this UpdateAgentFlowDeploymentDetails.

        :return: The o_auth_config of this UpdateAgentFlowDeploymentDetails.
        :rtype: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        return self._o_auth_config

    @o_auth_config.setter
    def o_auth_config(self, o_auth_config):
        """
        Sets the o_auth_config of this UpdateAgentFlowDeploymentDetails.

        :param o_auth_config: The o_auth_config of this UpdateAgentFlowDeploymentDetails.
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
