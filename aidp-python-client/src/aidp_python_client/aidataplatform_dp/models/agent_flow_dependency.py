# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowDependency(object):
    """
    The response object for getting the agent flow dependencies
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowDependency object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this AgentFlowDependency.
        :type agent_flow_key: str

        :param type:
            The value to assign to the type property of this AgentFlowDependency.
        :type type: str

        :param dependencies:
            The value to assign to the dependencies property of this AgentFlowDependency.
        :type dependencies: list[oci.aidataplatform_dp.models.AgentFlowDependencyItem]

        """
        self.swagger_types = {
            'agent_flow_key': 'str',
            'type': 'str',
            'dependencies': 'list[AgentFlowDependencyItem]'
        }

        self.attribute_map = {
            'agent_flow_key': 'agentFlowKey',
            'type': 'type',
            'dependencies': 'dependencies'
        }

        self._agent_flow_key = None
        self._type = None
        self._dependencies = None

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this AgentFlowDependency.
        AgentFlow Key


        :return: The agent_flow_key of this AgentFlowDependency.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this AgentFlowDependency.
        AgentFlow Key


        :param agent_flow_key: The agent_flow_key of this AgentFlowDependency.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    @property
    def type(self):
        """
        Gets the type of this AgentFlowDependency.
        AgentFlow


        :return: The type of this AgentFlowDependency.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentFlowDependency.
        AgentFlow


        :param type: The type of this AgentFlowDependency.
        :type: str
        """
        self._type = type

    @property
    def dependencies(self):
        """
        Gets the dependencies of this AgentFlowDependency.
        List of AgentFlow dependencies.


        :return: The dependencies of this AgentFlowDependency.
        :rtype: list[oci.aidataplatform_dp.models.AgentFlowDependencyItem]
        """
        return self._dependencies

    @dependencies.setter
    def dependencies(self, dependencies):
        """
        Sets the dependencies of this AgentFlowDependency.
        List of AgentFlow dependencies.


        :param dependencies: The dependencies of this AgentFlowDependency.
        :type: list[oci.aidataplatform_dp.models.AgentFlowDependencyItem]
        """
        self._dependencies = dependencies

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
