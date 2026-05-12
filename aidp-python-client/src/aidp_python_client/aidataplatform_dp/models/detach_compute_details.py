# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DetachComputeDetails(object):
    """
    Details required to detach an agent flow to a compute
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DetachComputeDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param agent_flow_compute_key:
            The value to assign to the agent_flow_compute_key property of this DetachComputeDetails.
        :type agent_flow_compute_key: str

        """
        self.swagger_types = {
            'agent_flow_compute_key': 'str'
        }

        self.attribute_map = {
            'agent_flow_compute_key': 'agentFlowComputeKey'
        }

        self._agent_flow_compute_key = None

    @property
    def agent_flow_compute_key(self):
        """
        **[Required]** Gets the agent_flow_compute_key of this DetachComputeDetails.
        The key of the Agent Flow Compute associated with this Agent Flow


        :return: The agent_flow_compute_key of this DetachComputeDetails.
        :rtype: str
        """
        return self._agent_flow_compute_key

    @agent_flow_compute_key.setter
    def agent_flow_compute_key(self, agent_flow_compute_key):
        """
        Sets the agent_flow_compute_key of this DetachComputeDetails.
        The key of the Agent Flow Compute associated with this Agent Flow


        :param agent_flow_compute_key: The agent_flow_compute_key of this DetachComputeDetails.
        :type: str
        """
        self._agent_flow_compute_key = agent_flow_compute_key

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
