# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentFlowSessionDetails(object):
    """
    Details required to create a new session of an Agent Flow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentFlowSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateAgentFlowSessionDetails.
        :type display_name: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this CreateAgentFlowSessionDetails.
        :type agent_flow_key: str

        :param context:
            The value to assign to the context property of this CreateAgentFlowSessionDetails.
        :type context: oci.aidataplatform_dp.models.AgentFlowSessionContext

        """
        self.swagger_types = {
            'display_name': 'str',
            'agent_flow_key': 'str',
            'context': 'AgentFlowSessionContext'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'agent_flow_key': 'agentFlowKey',
            'context': 'context'
        }

        self._display_name = None
        self._agent_flow_key = None
        self._context = None

    @property
    def display_name(self):
        """
        Gets the display_name of this CreateAgentFlowSessionDetails.
        Display name.


        :return: The display_name of this CreateAgentFlowSessionDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateAgentFlowSessionDetails.
        Display name.


        :param display_name: The display_name of this CreateAgentFlowSessionDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this CreateAgentFlowSessionDetails.
        The Agent Flow key for which the session is started.


        :return: The agent_flow_key of this CreateAgentFlowSessionDetails.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this CreateAgentFlowSessionDetails.
        The Agent Flow key for which the session is started.


        :param agent_flow_key: The agent_flow_key of this CreateAgentFlowSessionDetails.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def context(self):
        """
        Gets the context of this CreateAgentFlowSessionDetails.

        :return: The context of this CreateAgentFlowSessionDetails.
        :rtype: oci.aidataplatform_dp.models.AgentFlowSessionContext
        """
        return self._context

    @context.setter
    def context(self, context):
        """
        Sets the context of this CreateAgentFlowSessionDetails.

        :param context: The context of this CreateAgentFlowSessionDetails.
        :type: oci.aidataplatform_dp.models.AgentFlowSessionContext
        """
        self._context = context

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
