# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowDetachment(object):
    """
    Detachment info of an Agent Flow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowDetachment object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this AgentFlowDetachment.
        :type agent_flow_compute_key: str

        :param agent_flow_key:
            The value to assign to the agent_flow_key property of this AgentFlowDetachment.
        :type agent_flow_key: str

        """
        self.swagger_types = {
            'agent_flow_compute_key': 'str',
            'agent_flow_key': 'str'
        }

        self.attribute_map = {
            'agent_flow_compute_key': 'agentFlowComputeKey',
            'agent_flow_key': 'agentFlowKey'
        }

        self._agent_flow_compute_key = None
        self._agent_flow_key = None

    @property
    def agent_flow_compute_key(self):
        """
        **[Required]** Gets the agent_flow_compute_key of this AgentFlowDetachment.
        The key of the Agent Flow Compute associated with this Agent Flow


        :return: The agent_flow_compute_key of this AgentFlowDetachment.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this AgentFlowDetachment.
        The key of the Agent Flow Compute associated with this Agent Flow


        :param agent_flow_compute_key: The agent_flow_compute_key of this AgentFlowDetachment.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    @property
    def agent_flow_key(self):
        """
        **[Required]** Gets the agent_flow_key of this AgentFlowDetachment.
        The unique identifier (UUID) of the Agent flow


        :return: The agent_flow_key of this AgentFlowDetachment.
        :rtype: str
        """
        return self._agent_flow_key

    @agent_flow_key.setter
    def agent_flow_key(self, agent_flow_key):
        """
        Sets the agent_flow_key of this AgentFlowDetachment.
        The unique identifier (UUID) of the Agent flow


        :param agent_flow_key: The agent_flow_key of this AgentFlowDetachment.
        :type: str
        """
        self._agent_flow_key = agent_flow_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
