# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateAgentSessionDetails(object):
    """
    Details required to create a new session of an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateAgentSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this CreateAgentSessionDetails.
        :type display_name: str

        :param agent_key:
            The value to assign to the agent_key property of this CreateAgentSessionDetails.
        :type agent_key: str

        :param context:
            The value to assign to the context property of this CreateAgentSessionDetails.
        :type context: oci.aidataplatform_dp.models.AgentSessionContext

        """
        self.swagger_types = {
            'display_name': 'str',
            'agent_key': 'str',
            'context': 'AgentSessionContext'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'agent_key': 'agentKey',
            'context': 'context'
        }

        self._display_name = None
        self._agent_key = None
        self._context = None

    @property
    def display_name(self):
        """
        Gets the display_name of this CreateAgentSessionDetails.
        Display name.


        :return: The display_name of this CreateAgentSessionDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateAgentSessionDetails.
        Display name.


        :param display_name: The display_name of this CreateAgentSessionDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def agent_key(self):
        """
        **[Required]** Gets the agent_key of this CreateAgentSessionDetails.
        The Agent key for which the session is started.


        :return: The agent_key of this CreateAgentSessionDetails.
        :rtype: str
        """
        return self._agent_key

    @agent_key.setter
    def agent_key(self, agent_key):
        """
        Sets the agent_key of this CreateAgentSessionDetails.
        The Agent key for which the session is started.


        :param agent_key: The agent_key of this CreateAgentSessionDetails.
        :type: str
        """
        self._agent_key = agent_key

    @property
    def context(self):
        """
        Gets the context of this CreateAgentSessionDetails.

        :return: The context of this CreateAgentSessionDetails.
        :rtype: oci.aidataplatform_dp.models.AgentSessionContext
        """
        return self._context

    @context.setter
    def context(self, context):
        """
        Sets the context of this CreateAgentSessionDetails.

        :param context: The context of this CreateAgentSessionDetails.
        :type: oci.aidataplatform_dp.models.AgentSessionContext
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
