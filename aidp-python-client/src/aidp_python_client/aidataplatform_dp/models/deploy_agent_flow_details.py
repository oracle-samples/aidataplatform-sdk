# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeployAgentFlowDetails(object):
    """
    Agentflow details to deploy an agentflow.
    """

    #: A constant which can be used with the deployment_type property of a DeployAgentFlowDetails.
    #: This constant has a value of "TEST"
    DEPLOYMENT_TYPE_TEST = "TEST"

    #: A constant which can be used with the deployment_type property of a DeployAgentFlowDetails.
    #: This constant has a value of "PROD"
    DEPLOYMENT_TYPE_PROD = "PROD"

    #: A constant which can be used with the deployment_type property of a DeployAgentFlowDetails.
    #: This constant has a value of "CODE"
    DEPLOYMENT_TYPE_CODE = "CODE"

    def __init__(self, **kwargs):
        """
        Initializes a new DeployAgentFlowDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this DeployAgentFlowDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this DeployAgentFlowDetails.
        :type description: str

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this DeployAgentFlowDetails.
        :type agent_flow_compute_key: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this DeployAgentFlowDetails.
        :type agent_flow_key: str

        :param deployment_type:
            The value to assign to the deployment_type property of this DeployAgentFlowDetails.
            Allowed values for this property are: "TEST", "PROD", "CODE"
        :type deployment_type: str

        :param session_retention_config:
            The value to assign to the session_retention_config property of this DeployAgentFlowDetails.
        :type session_retention_config: oci.aidataplatform_dp.models.SessionRetentionConfiguration

        :param o_auth_config:
            The value to assign to the o_auth_config property of this DeployAgentFlowDetails.
        :type o_auth_config: oci.aidataplatform_dp.models.OAuthConfiguration

        """
        self.swagger_types = {
            'display_name': 'str',
            'description': 'str',
            'agent_flow_compute_key': 'str',
            'agent_flow_key': 'str',
            'deployment_type': 'str',
            'session_retention_config': 'SessionRetentionConfiguration',
            'o_auth_config': 'OAuthConfiguration'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'description': 'description',
            'agent_flow_compute_key': 'agentFlowComputeKey',
            'agent_flow_key': 'agentFlowKey',
            'deployment_type': 'deploymentType',
            'session_retention_config': 'sessionRetentionConfig',
            'o_auth_config': 'oAuthConfig'
        }

        self._display_name = None
        self._description = None
        self._agent_flow_compute_key = None
        self._agent_flow_key = None
        self._deployment_type = None
        self._session_retention_config = None
        self._o_auth_config = None

    @property
    def display_name(self):
        """
        Gets the display_name of this DeployAgentFlowDetails.
        Display name.


        :return: The display_name of this DeployAgentFlowDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this DeployAgentFlowDetails.
        Display name.


        :param display_name: The display_name of this DeployAgentFlowDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this DeployAgentFlowDetails.
        deployment description.


        :return: The description of this DeployAgentFlowDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this DeployAgentFlowDetails.
        deployment description.


        :param description: The description of this DeployAgentFlowDetails.
        :type: str
        """
        self._description = description

    @property
    def agent_flow_compute_key(self):
        """
        Gets the agent_flow_compute_key of this DeployAgentFlowDetails.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :return: The agent_flow_compute_key of this DeployAgentFlowDetails.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this DeployAgentFlowDetails.
        The Agent Flow Compute Key where client can run or test the Agent Flow.


        :param agent_flow_compute_key: The agent_flow_compute_key of this DeployAgentFlowDetails.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this DeployAgentFlowDetails.
        The Agent Flow key for which the session is started.


        :return: The agent_flow_key of this DeployAgentFlowDetails.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this DeployAgentFlowDetails.
        The Agent Flow key for which the session is started.


        :param agent_flow_key: The agent_flow_key of this DeployAgentFlowDetails.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def deployment_type(self):
        """
        **[Required]** Gets the deployment_type of this DeployAgentFlowDetails.
        Type of an Agent Flow Deployment.

        Allowed values for this property are: "TEST", "PROD", "CODE"


        :return: The deployment_type of this DeployAgentFlowDetails.
        :rtype: str
        """
        return self._deployment_type

    @deployment_type.setter
    def deployment_type(self, deployment_type):
        """
        Sets the deployment_type of this DeployAgentFlowDetails.
        Type of an Agent Flow Deployment.


        :param deployment_type: The deployment_type of this DeployAgentFlowDetails.
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
    def session_retention_config(self):
        """
        Gets the session_retention_config of this DeployAgentFlowDetails.

        :return: The session_retention_config of this DeployAgentFlowDetails.
        :rtype: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        return self._session_retention_config

    @session_retention_config.setter
    def session_retention_config(self, session_retention_config):
        """
        Sets the session_retention_config of this DeployAgentFlowDetails.

        :param session_retention_config: The session_retention_config of this DeployAgentFlowDetails.
        :type: oci.aidataplatform_dp.models.SessionRetentionConfiguration
        """
        self._session_retention_config = session_retention_config

    @property
    def o_auth_config(self):
        """
        Gets the o_auth_config of this DeployAgentFlowDetails.

        :return: The o_auth_config of this DeployAgentFlowDetails.
        :rtype: oci.aidataplatform_dp.models.OAuthConfiguration
        """
        return self._o_auth_config

    @o_auth_config.setter
    def o_auth_config(self, o_auth_config):
        """
        Sets the o_auth_config of this DeployAgentFlowDetails.

        :param o_auth_config: The o_auth_config of this DeployAgentFlowDetails.
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
