# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentDependency(object):
    """
    The response object for getting the agent dependencies.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentDependency object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_key:
            The value to assign to the agent_key property of this AgentDependency.
        :type agent_key: str

        :param type:
            The value to assign to the type property of this AgentDependency.
        :type type: str

        :param dependencies:
            The value to assign to the dependencies property of this AgentDependency.
        :type dependencies: list[oci.aidataplatform_dp.models.AgentDependencyItem]

        """
        self.swagger_types = {
            'agent_key': 'str',
            'type': 'str',
            'dependencies': 'list[AgentDependencyItem]'
        }

        self.attribute_map = {
            'agent_key': 'agentKey',
            'type': 'type',
            'dependencies': 'dependencies'
        }

        self._agent_key = None
        self._type = None
        self._dependencies = None

    @property
    def agent_key(self):
        """
        **[Required]** Gets the agent_key of this AgentDependency.
        Agent key.


        :return: The agent_key of this AgentDependency.
        :rtype: str
        """
        return self._agent_key

    @agent_key.setter
    def agent_key(self, agent_key):
        """
        Sets the agent_key of this AgentDependency.
        Agent key.


        :param agent_key: The agent_key of this AgentDependency.
        :type: str
        """
        self._agent_key = agent_key

    @property
    def type(self):
        """
        Gets the type of this AgentDependency.
        Agent.


        :return: The type of this AgentDependency.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this AgentDependency.
        Agent.


        :param type: The type of this AgentDependency.
        :type: str
        """
        self._type = type

    @property
    def dependencies(self):
        """
        Gets the dependencies of this AgentDependency.
        List of agent dependencies.


        :return: The dependencies of this AgentDependency.
        :rtype: list[oci.aidataplatform_dp.models.AgentDependencyItem]
        """
        return self._dependencies

    @dependencies.setter
    def dependencies(self, dependencies):
        """
        Sets the dependencies of this AgentDependency.
        List of agent dependencies.


        :param dependencies: The dependencies of this AgentDependency.
        :type: list[oci.aidataplatform_dp.models.AgentDependencyItem]
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
